(ns carmen.impl.data
  (:require [clojure.string :as str]))

(defn url [s] (str "url(\"" s "\")"))

(defn get-hint [path-hint] (str/split path-hint "*"))

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

(defn reify-subscene-characters [characters character-graph]
  (mapv
   (fn [[name expression & [{:keys [alignment]}]]]
     (let [character-base (get-in character-graph [name expression])]
      {:name name
       :expression expression
       :alignment (or alignment (:alignment character-base) [0 0])
       :img (:img character-base)}))
   characters))

(defn reify-subscenes [subscenes character-graph]
  (mapv
   (fn [[speaker characters dialogue]]
     {:characters (reify-subscene-characters characters character-graph)
      :speaker speaker
      :dialogue dialogue})
   subscenes))

(defn reify-minor-scenes-xf [character-graph options]
  (map
   (fn [[level-name level-data]]
     [level-name
      ;; TODO: something that isn't this
      (case (:render-type level-data)
        :miranda/dialogue (update level-data :subscenes reify-subscenes character-graph)
        level-data)]))) 

(defn reify-scenes-xf [character-graph options]
  (let [xf (reify-minor-scenes-xf character-graph options)]
   (map
     (fn [[level-name level-data]]
       [level-name (into {} xf level-data)]))))

(defn reify-scenes [structure character-graph options]
  (into {} (reify-scenes-xf character-graph options) structure))

(defn validate-scenes-options [options])

