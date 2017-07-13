(ns syms-qual.data.bg
  (:require [carmen.data :as data]))

(def structure
  ["anubis_cafe"
   "anubis_flashback"
   "anubis_spawn"
   "anubis_genji"
   "anubis_pharah"
   "anubis_pharah_b"
   "anubis_zarya"

   "hollywood_objective"
   "hollywood_set"
   "hollywood_theatre"
   "hollywood_soldier"

   "route_66_diner"
   "route_66_street"
   "route_66_ana"
   "route_66_hog"
   "route_66_reaper"

   "volskaya_spawn"
   "volskaya_zenyatta"])

(def options
  {:path "img/Backgrounds/"
   :ext  "png"})

(def data
  (data/reify-bgs structure options))
