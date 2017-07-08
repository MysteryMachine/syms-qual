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

(defn alter-state [state graph]
  (let [transition-fn (util/transition-stateful-args state graph)]
    (transition-fn state)))

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

(declare reify-options)

;; TODO: Decide on whether or not this is a public interface
(defmulti reify-subscenes
  (fn [level-name scene-name render-type character-graph subscenes]
    render-type))

(defmethod reify-subscenes :miranda/dialogue
  [level-name scene-name render-type character-graph subscenes]
  (mapv
   (fn [[speaker characters dialogue]]
     {:characters (reify-subscene-characters character-graph characters)
      :speaker speaker
      :dialogue dialogue})
   subscenes))

(defmethod reify-subscenes :miranda/option
  [level-name scene-name render-type character-graph subscenes]
  (let [[speaker characters & options] subscenes]
    [{:characters (reify-subscene-characters character-graph characters)
      :scene-options (reify-options render-type level-name scene-name options)
      :speaker speaker}]))

(defmethod reify-subscenes :miranda/text-option
  [level-name scene-name render-type character-graph subscenes]
  (let [[text & options] subscenes]
    [{:scene-options (reify-options render-type level-name scene-name options)
      :text text}]))

(defmethod reify-subscenes :default
  [level-name scene-name render-type charagraph-graph subscenes]
  (vec subscenes))

(defn render-type->default-transition [render-type]
  (get {:miranda/text-option :miranda/dynamic
        :miranda/option      :miranda/dynamic}
       render-type
       :miranda/basic))

;; TODO: This might require a multimethod...
(defn split-transition [render-type level-name rem-data]
  (let [[minor-subsc [_ minor-trans]] (split-with #(not= :-> %) rem-data)
        [major-subsc [_ major-trans]] (split-with #(not= :=> %) rem-data)
        [cond-subsc  [_ type args]]   (split-with #(not= :transition %)  rem-data)]
    (cond
      (some? minor-trans)
      [minor-subsc
       {:transition/type (render-type->default-transition render-type)
        :transition/args [level-name minor-trans 0]}]

      (some? major-trans)
      (let [[maj min & [n]] major-trans]
        [major-subsc
         {:transition/type (render-type->default-transition render-type)
          :transition/args (if n major-trans [maj min 0])}])

      (#{:miranda/mutative->basic} type)
      (let [[trans-args mut-args] args
            reified-trans-args (->> trans-args (split-transition render-type level-name) last :transition/args)]
        [cond-subsc {:transition/type type
                     :transition/stateful-args mut-args
                     :transition/args reified-trans-args}])

      (some? type)
      [cond-subsc {:transition/type type :transition/args args}]

      :else [rem-data {:transition/type (render-type->default-transition render-type)}])))

(defn default-option-transition [render-type major minor i]
  (second (split-transition render-type major [:-> (conj minor i)])))

(defn override-default-transition-type [transition]
  (if (= (:transition/type transition) :miranda/default)
    (assoc transition :transition/type :miranda/basic)
    transition))

(defn reify-options [render-type level-name scene-name options]
  (into
   []
   (map-indexed
    (fn [i option]
      (if (string? option)
        {:text option
         :conditional (constantly true)
         :transition (-> level-name
                         (default-option-transition render-type scene-name i)
                         (override-default-transition-type))}
        (let [[text & [conditional transition]] option]
          {:text text
           :conditional (or conditional (constantly true))
           :transition (-> (if transition
                             (second (split-transition render-type level-name transition))
                             (default-option-transition render-type level-name scene-name i))
                           (override-default-transition-type))}))))
   options))

(defn get-bg-img [bgs level-name subscene-name]
  (let [k (keyword (str (name level-name) "-" (name subscene-name)))]
    (get bgs k)))

(defn reify-scene-xf [level-name character-graph bgs]
  (map
   (fn [[scene-name subscene-data]]
     (if (map? subscene-data) [scene-name subscene-data]
         (let [[render-type & rem-data] subscene-data
               [subscenes transition] (split-transition render-type level-name rem-data)
               ;; TODO: Add better error handling around non-vec subscene names
               bg-img (get-bg-img bgs level-name (first scene-name))
               reified-subscenes (reify-subscenes level-name scene-name render-type character-graph subscenes)]
           [scene-name
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
