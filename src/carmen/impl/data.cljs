(ns carmen.impl.data
  (:require [clojure.string :as str]
            [carmen.util :as util]))

(defn url [s] (str "url(\"" s "\")"))

(defn get-hint [path-hint] (str/split path-hint "*"))

(def internal-state-key :miranda/internal)

(def transition-state-ptr [internal-state-key :miranda/transition])

(def prev-scene-ptr (conj transition-state-ptr :miranda/prev-state))

;; --- State Functions ---

(defn initialize-fps-state! [state-atom]
  (swap!
   state-atom
   (fn [state]
     (-> state
         (assoc-in prev-scene-ptr (:scene state))
         (assoc :miranda/time 0)))))

(defn create-animation-event! [state-atom period]
  (js/window.setInterval
   (fn []
     (swap!
      state-atom
      (fn [state]
        (let [prev-scene (get-in state prev-scene-ptr)
              current-scene (:scene state)]
          (if (= prev-scene current-scene)
            (update state :miranda/time + period)
            (-> state
                (assoc :miranda/time 0)
                (assoc-in prev-scene-ptr current-scene)))))))
   period))

(defn basic-transition [state graph options]
  (let [[_ _ n] (util/scene state)
        scene (util/scene-data state graph)
        subscene-count (count (:subscenes scene))
        delay (:miranda/click-delay options)
        cant-transition (and delay (< (:miranda/time state) delay))]
    (cond
      cant-transition state
      (>= n (dec subscene-count)) (assoc state :scene (:transition/args scene))
      :else (update-in state [:scene 2] inc))))

;; TODO: Could possibly be a public interface?
(defn ensure-ptr [k] (if (keyword? k) k [k]))

(defmulti alter #(nth %2 2))

(defmethod alter :default
  [state [k v & _]]
  (if (keyword? k)
    (assoc state k v)
    (assoc-in state k v)))

(defmethod alter :no-overwrite
  [state [k v & _]]
  (let [k (ensure-ptr k)]
   (if (get-in state k) state
       (assoc-in state k v))))

(defmethod alter :add
  [state [k v & _]]
  (update-in state (ensure-ptr k) + v))

(defmethod alter :conj
  [state [k v & _]]
  (update-in state (ensure-ptr k) conj v))

(defn alter-state [state graph]
  (let [args (util/transition-stateful-args state graph)]
    (loop [args args
           state state]
      (if (seq args)
        (recur (rest args) (alter state (first args)))
        state))))

;; --- Character Functions ---

(defn reify-character-xf [name path ext]
  (map
   (fn [[expression data]]
     (let [css-data {:img (url (str path name "/" expression "." ext))}]
       (vector (keyword expression) (merge data css-data))))))

(defn split-character-data [data]
  (loop [d data
         result {}]
    (if (seq d)
      (let [[a b & rem] d]
        (if (map? b)
          (recur rem (assoc result a b))
          (recur (rest d) (assoc result a {}))))
      result)))

(defn reify-characters-xf [{:keys [path ext]}]
  (map
   (fn [[name data]]
     (let [split-data (split-character-data data)]
      (vector
        (keyword (str/lower-case name))
        (into {} (reify-character-xf name path ext) split-data))))))

(defn reify-characters [structure options]
  (into {} (reify-characters-xf options) structure))

(defn validate-character-options [options])

;; --- Background Functions ---

(defn bg-name->kw [name]
  (keyword (str/replace name "_" "-")))

(defn bg-name->path [name path ext]
  (url (str path name "." ext)))

(defn reify-bgs-xf [{:keys [path ext]}]
  (map
   (fn [name]
     {(bg-name->kw name) (bg-name->path name path ext)})))

(defn reify-bgs [structure options]
  (into {} (reify-bgs-xf options) structure))

(defn validate-bg-options [{:as options}])

;; --- Scene Functions ---

(defn reify-subscene-characters [character-graph characters]
  (mapv
   (fn [[name expression & [{:keys [alignment] :as animation-map}]]]
     (let [character-base (get-in character-graph [name expression])]
       (merge
        animation-map
        {:name name
         :expression expression
         :alignment (or alignment (:alignment character-base) [0 0])
         :img (:img character-base)})))
   characters))

;; TODO: Decide on whether or not this is a public interface
(defmulti reify-subscenes
  (fn [render-type character-graph subscenes]
    render-type))

(defmethod reify-subscenes :miranda/dialogue
  [render-type character-graph subscenes]
  (mapv
   (fn [[speaker characters dialogue]]
     {:characters (reify-subscene-characters character-graph characters)
      :speaker speaker
      :dialogue dialogue})
   subscenes))

(defmethod reify-subscenes :miranda/option
  [render-type character-graph subscenes]
  (let [[speaker characters & options] subscenes]
    [{:characters (reify-subscene-characters character-graph characters)
      :scene-options options
      :speaker speaker}]))

(defmethod reify-subscenes :miranda/text-option
  [render-type character-graph subscenes]
  (let [[text & options] subscenes]
    [{:scene-options options
      :text text}]))

(defmethod reify-subscenes :default
  [render-type charagraph-graph subscenes]
  (vec subscenes))

(defn split-transition [level-name rem-data]
  (let [[minor-subsc [_ minor-trans]] (split-with #(not= :-> %) rem-data)
        [major-subsc [_ major-trans]] (split-with #(not= :=> %) rem-data)
        [cond-subsc  [_ type args]]   (split-with #(not= :transition %)  rem-data)]
    (cond
      (some? minor-trans)
      [minor-subsc
       {:transition/type :miranda/default
        :transition/args [level-name minor-trans 0]}]

      (some? major-trans)
      (let [[maj min & [n]] major-trans]
        [major-subsc
         {:transition/type :miranda/default
          :transition/args (if n major-trans [maj min 0])}])

      (#{:miranda/stateful-default} type)
      (let [[trans-args mut-args] args
            [_ transition] (split-transition trans-args)]
        [cond-subsc {:transition/type type
                     :transition/stateful-args mut-args
                     :transition/args (:transition/args transition)}])

      (some? type)
      [cond-subsc {:transition/type type :transition/args args}]

      :else [rem-data {:transition/type :miranda/default}])))

(defn get-bg-img [bgs level-name subscene-name]
  (let [k (keyword (str (name level-name) "-" (name subscene-name)))]
    (get bgs k)))

(defn reify-scene-xf [level-name character-graph bgs]
  (map
   (fn [[subscene-name subscene-data]]
     (if (map? subscene-data) [subscene-name subscene-data]
         (let [[render-type & rem-data] subscene-data
               [subscenes transition] (split-transition level-name rem-data)
               ;; TODO: Add better error handling around non-vec subscene names
               bg-img (get-bg-img bgs level-name (first subscene-name))
               reified-subscenes (reify-subscenes render-type character-graph subscenes)]
           [subscene-name
            (merge transition
             {:style {:background-image bg-img}
              :render-type render-type
              :subscenes reified-subscenes})])))))

(defn reify-scenes-xf [character-graph bgs] 
  (map
   (fn [[level-name level-data]]
     [level-name
      (into {} (reify-scene-xf level-name character-graph bgs) level-data)])))

(defn reify-scenes [character-graph bgs structure]
  (into {} (reify-scenes-xf character-graph bgs) structure))
