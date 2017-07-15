(ns carmen.impl.data
  (:require [clojure.string :as str]
            [carmen.util :as util]))

(def default-max-loading-time 30000)

(defn url [s] (str "url(\"" s "\")"))

(defn get-hint [path-hint] (str/split path-hint "*"))

(def internal-state-key :miranda/internal)

(def transition-state-ptr [internal-state-key :miranda/transition])

(def animation-name-ptr (conj transition-state-ptr :miranda/animation-name))

;; --- State Functions ---

(defn initialize-fps-state! [state-atom]
  (swap!
   state-atom
   (fn [state]
     (-> state
         (assoc-in animation-name-ptr (:scene state))
         (assoc :miranda/time 0)))))

(defn create-animation-event! [state-atom period]
  (js/window.setInterval
   (fn []
     (swap!
      state-atom
      (fn [state]
        (let [animation-name (get-in state animation-name-ptr)
              current-scene (:scene state)]
          (if (= animation-name current-scene)
            (update state :miranda/time + period)
            (-> state
                (assoc :miranda/time 0)
                (assoc-in animation-name-ptr current-scene)))))))
   period))

(def reports* [:miranda/internal :reports])
(def max-reports* [:miranda/internal :max-reports])

(defn handle-loading [old-state new-state graph]
  (let [om (util/major-scene old-state graph)
        nm (util/major-scene new-state graph)]
    (if (= om nm) new-state
        (-> new-state
            (assoc-in reports* #{})
            (assoc-in max-reports* (count (:miranda.internal/preload nm)))))))

(defn done-loading? [state options]
  (let [max-reports (get-in state max-reports*)]
    (or (not max-reports)
        (>= (:miranda/time state) (:miranda/max-load-time options default-max-loading-time)))))

(defn basic-transition [state graph options]
  (assoc state :scene (util/transition-args state graph)))

(defn guard-transition [transition-fn state graph options args]
  (let [[_ _ n] (util/scene state)
        scene (util/scene-data state graph)
        subscene-count (count (:subscenes scene))
        delay (:miranda/click-delay options)
        cant-transition (and delay (< (:miranda/time state) delay))]
    (handle-loading
     state
     (cond
        cant-transition state
        (>= n (dec subscene-count)) (transition-fn state graph options args)
        :else (update-in state [:scene 2] inc))
     graph)))

(defn alter-state [state graph]
  (let [transition-fn (util/transition-stateful-args state graph)]
    (transition-fn state)))

(defn conditional-transition [transition-fn state graph options args]
  (loop [candidates (util/transition-args state graph)]
    (if (seq candidates)
      (let [[[test transition] & rem] candidates]
        (if (or (= :else test) (test state))
          (let [updated-graph (update-in graph (util/scene-data* state graph) merge transition)]
           (transition-fn state updated-graph options args))
          (recur rem)))
      (throw (js/Error. "No valid transition found.")))))

;; --- Character Functions ---

(defn reify-character-xf [name path ext]
  (map
   (fn [[expression data]]
     (let [css-data {:img (str path name "/" expression "." ext)}]
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

(def default-finish
  {:position [0 0]
   :opacity  1})

(def default-start default-finish)

(defn reify-subscene-characters [character-graph characters]
  (mapv
   (fn [[name expression & [{:keys [finish start] :as animation-map}]]]
     (let [character-base (get-in character-graph [name expression])]
       (merge
        character-base
        animation-map
        {:name name
         :expression expression
         :start (merge default-start (:start character-base) start)
         :finish (merge default-finish (:finish character-base) finish)
         :img (:img character-base)})))
   characters))

(declare reify-options)

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

(defmethod reify-subscenes :miranda/characters
  [level-name scene-name render-type character-graph subscenes]
  (mapv
   (fn [[characters]]
     {:characters (reify-subscene-characters character-graph characters)})
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

(defmulti split-transition
  (fn [render-type level-name rem-data]
    (condp some rem-data
      #{:->} :minor
      #{:=>} :major
      #{:transition}
      (condp some rem-data
        #{:miranda/conditional} :conditional
        #{:miranda/mutation->basic} :stateful
        :custom)
      :default)))

(defmethod split-transition :minor
  [render-type level-name rem-data]
  (let [[minor-subsc [_ minor-trans]] (split-with #(not= :-> %) rem-data)]
   [minor-subsc
     {:transition/type :miranda/basic
      :transition/args [level-name minor-trans 0]}]))

(defmethod split-transition :major
  [render-type level-name rem-data]
  (let [[major-subsc [_ major-trans]] (split-with #(not= :=> %) rem-data)
        [maj min & [n]] major-trans]
    [major-subsc
     {:transition/type :miranda/basic
      :transition/args (if n major-trans [maj min 0])}]))

(defmethod split-transition :stateful
  [render-type level-name rem-data]
  (let [[custom-subsc  [_ type args]] (split-with #(not= :transition %)  rem-data)
        [trans-args mut-args] args
        reified-trans-args (->> trans-args (split-transition render-type level-name) last :transition/args)]
    [custom-subsc {:transition/type type
                   :transition/stateful-args mut-args
                   :transition/args reified-trans-args}]))

(defn reify-conditional-pairs [render-type level-name pairs]
  (let [partial-transition (partial split-transition render-type level-name)
        update-fn (comp second partial-transition)]
   (mapv #(update % 1 update-fn) pairs)))

(defmethod split-transition :conditional
  [render-type level-name rem-data]
  (let [[custom-subsc  [_ type args]] (split-with #(not= :transition %)  rem-data)
        reified-args (->> args
                          (partition 2)
                          (map vec)
                          (reify-conditional-pairs render-type level-name))]
    [custom-subsc {:transition/type type :transition/args reified-args}]))

(defmethod split-transition :custom
  [render-type level-name rem-data]
  (let [[custom-subsc  [_ type args]] (split-with #(not= :transition %)  rem-data)]
    [custom-subsc {:transition/type type :transition/args args}]))

(defmethod split-transition :default
  [render-type level-name rem-data]
  [rem-data {:transition/type (render-type->default-transition render-type)}])

(defn default-option-transition [render-type major minor i]
  (-> (split-transition render-type major [:-> (conj minor i)])
      (second)
      (assoc :transition/type :miranda/basic)) )

(defn reify-options [render-type level-name scene-name options]
  (into
   []
   (map-indexed
    (fn [i option]
      (if (string? option)
        {:text option
         :conditional (constantly true)
         :transition (default-option-transition render-type level-name scene-name i)}
        (let [[text & [conditional transition]] option]
          {:text text
           :conditional (or conditional (constantly true))
           :transition (if transition
                         (second (split-transition render-type level-name transition))
                         (default-option-transition render-type level-name scene-name i))}))))
   options))

(defn get-bg-img [bgs level-name subscene-name]
  (let [k (keyword (str (name level-name) "-" (name subscene-name)))]
    (get bgs k)))

(def subscene-preload
  (mapcat
   (fn [subscene]
     (map :img (:characters subscene)))))

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
              :subscenes reified-subscenes
              :miranda.internal/preload (into #{}
                                              (comp subscene-preload)
                                              reified-subscenes)})])))))

(defn reify-scenes-xf [character-graph bgs]
  (map
   (fn [[level-name level-data]]
     [level-name
      (into {} (reify-scene-xf level-name character-graph bgs) level-data)])))

(def scene-preload
  (map
   (fn [[scene-name scene-data]]
     [scene-name
      (assoc
       scene-data :miranda.internal/preload
       (filter some?
        (into #{(:background-image scene-data)}
               (mapcat (comp :miranda.internal/preload second))
               scene-data)))])))

(defn reify-scenes [character-graph bgs structure]
  (into {}
        (comp
         (reify-scenes-xf character-graph bgs)
         scene-preload)
        structure))
