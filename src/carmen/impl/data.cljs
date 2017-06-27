(ns carmen.impl.data
  (:require [clojure.string :as str]))

(defn url [s] (str "url(\"" s "\")"))

(defn get-hint [path-hint] (str/split path-hint "*"))

;; --- Character Functions ---

(defn reify-character-subexpr-xf [css-data]
  (map
   (fn [[subexpr subdata]]
     [(keyword subexpr) (merge subdata css-data)])))

(defn reify-character-xf [name path ext]
  (map
   (fn [[expression data]]
     (let [css-data {:img (url (str path name "/" expression "." ext))}]
       [(keyword expression)
        (if-not (empty? data)
          (into {} (reify-character-subexpr-xf css-data) data)
          (merge data css-data))]))))

(defn reify-characters-xf [{:keys [path ext]}]
  (map
   (fn [[name data]]
     [(keyword (str/lower-case name))
      (into {} (reify-character-xf name path ext) data)])))

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

(defn validate-bg-options [{:as options}])

;; --- Scene Functions ---

(defn reify-subscenes [subscenes]
  (mapv
   (fn [[speaker characters dialogue]]
     {:characters characters
      :speaker speaker
      :dialogue dialogue})
   subscenes))

(defn reify-minor-scenes-xf [options]
  (map
   (fn [[level-name level-data]]
     [level-name
      (case (:render-type level-data)
        :miranda/dialogue (update level-data :subscenes reify-subscenes)
        level-data)])))

(defn reify-scenes-xf [options]
  (map
   (fn [[level-name level-data]]
     [level-name (into {} (reify-minor-scenes-xf options) level-data)])))

(defn validate-scenes-options [options])

