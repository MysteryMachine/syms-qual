(ns syms-qual.data.scenes
  (:require [syms-qual.data.scenes.title-screen :as title-screen]
            [syms-qual.data.scenes.route-66.intro :as intro]
            [syms-qual.data.scenes.route-66.options :as options]
            [syms-qual.data.scenes.route-66.dates :as dates]

            [syms-qual.data.characters :as char]
            [syms-qual.data.bg :as bg]
            [carmen.data :as data]))

(def structure
  {:route-66 (merge intro/data options/data dates/data)
   :anubis (merge)
   :eichenwalde (merge)
   :gibralter (merge)
   :dorado (merge)
   :hollywood (merge)
   :volskaya (merge)
   :lijiang (merge)
   :kings-row (merge)
   :numbani (merge)
   :title-screen (merge title-screen/data)})

(def data (data/reify-scenes char/data bg/data structure))
