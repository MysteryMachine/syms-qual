(ns syms-qual.data.scenes
  (:require [syms-qual.data.scenes.route-66.intro :as intro]

            [syms-qual.data.characters :as char]
            [syms-qual.data.bg :as bg]
            [carmen.data :as data]))

(def structure
  {:route-66 (merge intro/data #_options/data #_dates/data)
   :anubis (merge)
   :eichenwalde (merge)
   :gibralter (merge)
   :dorado (merge)
   :hollywood (merge)
   :volskaya (merge)
   :lijiang (merge)
   :kings-row (merge)
   :numbani (merge)
   :main-menu (merge)})

(def data (data/reify-scenes char/data bg/data structure))
