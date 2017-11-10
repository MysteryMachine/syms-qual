(ns syms-qual.data.bg
  (:require [carmen.data :as data]))

(def structure
  ["anubis_cafe"
   "anubis_flashback"
   "anubis_genji"
   "anubis_pharah_a"
   "anubis_pharah_b"
   "anubis_spawn"
   "anubis_zarya"

   "dorado_sombra_b"
   "dorado_spawn"

   "hollywood_lucio"
   "hollywood_objective"
   "hollywood_set"
   "hollywood_soldier"
   "hollywood_theatre"

   "junkertown_junkrat_a_1"
   "junkertown_junkrat_a_2"

   "kings_row_lucio"
   "kings_row_street"
   "kings_row_torb"

   "lijang_junkrat_a"
   "lijang_orca"

   "route_66_ana"
   "route_66_diner"
   "route_66_door"
   "route_66_hog"
   "route_66_reaper"
   "route_66_street"

   "title_screen_bg"

   "volskaya_apartment"
   "volskaya_sombra_b"
   "volskaya_spawn"
   "volskaya_zenyatta"
   "volskaya_point_a"])

(def options
  {:path "img/Backgrounds/"
   :ext  "png"})

(def data
  (data/reify-bgs structure options))
