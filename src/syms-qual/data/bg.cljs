(ns syms-qual.data.bg
  (:require [carmen.data :as data]))

(def structure
  ["anubis_cafe"
   "anubis_flashback"
   "anubis_spawn"
   "AnubisGenji"
   "AnubisPharah"
   "AnubisPharahB"
   "AnubisZarya"

   "hollywood_objective"
   "hollywood_set"
   "hollywood_theatre"

   "route_66_diner"
   "route_66_street"
   "route66Ana"
   "route66Hog"
   "route66Reaper"

   "volskaya_spawn"
   "VolskayaZenyatta"])

(def options
  {:path "img/Backgrounds/"
   :ext  "png"})

(def data
  (data/reify-bgs structure options))
