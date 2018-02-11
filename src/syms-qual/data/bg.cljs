(ns syms-qual.data.bg
  (:require [carmen.data :as data]))

(def structure
  ["anubis-cafe"
   "anubis-flashback"
   "anubis-genji"
   "anubis-pharah-a"
   "anubis-pharah-b"
   "anubis-spawn"
   "anubis-zarya"

   "dorado-sombra-b"
   "dorado-spawn"

   "hollywood-hotel"
   "hollywood-lucio"
   "hollywood-objective"
   "hollywood-set"
   "hollywood-soldier"
   "hollywood-sombra"
   "hollywood-spawn"

   "junkertown-junkrat-a-1"
   "junkertown-junkrat-a-2"

   "kings-row-lucio"
   "kings-row-street"
   "kings-row-torb"
   "kings-row-junkrat"

   "lijang-junkrat-a"
   "lijang-orca"

   "route-66-ana"
   "route-66-diner"
   "route-66-door"
   "route-66-hog"
   "route-66-reaper"
   "route-66-street"

   "title-screen-bg"

   "volskaya-apartment"
   "volskaya-point-a"
   "volskaya-point-a-notp"
   "volskaya-sombra-a"
   "volskaya-sombra-b"
   "volskaya-spawn"
   "volskaya-zarya"
   "volskaya-zenyatta"])

(def options
  {:path "img/Backgrounds/"
   :ext  "png"})

(def data
  (data/reify-bgs structure options))
