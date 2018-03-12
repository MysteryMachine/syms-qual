(ns syms-qual.data.bg
  (:require [carmen.data :as data]))

(def structure
  ["anubis-cafe"
   "anubis-flashback"
   "anubis-genji"
   "anubis-office"
   "anubis-pharah-a"
   "anubis-pharah-b"
   "anubis-spawn"
   "anubis-zarya"
   
   "blizzard-world-bronze"
   "blizzard-world-gate"
   "blizzard-world-grandmaster"
   "blizzard-world-party"

   "dorado-calveras"
   "dorado-mei"
   "dorado-sombra-a"
   "dorado-sombra-b"
   "dorado-sombra-c"
   "dorado-spawn"
   "dorado-zenyatta"
   
   "eichenwalde-beer-hall"
   "eichenwalde-flashback"
   "eichenwalde-hanzo"
   "eichenwalde-hotel"
   "eichenwalde-objective"
   "eichenwalde-pharah"
   "eichenwalde-spawn"
   "eichenwalde-widow"
   
   "gibralter-door"
   "gibralter-hotel"
   "gibralter-pharah-a"
   "gibralter-pharah-b"
   "gibralter-pharah-c"
   "gibralter-rink"
   "gibralter-soldier"
   "gibralter-spawn"
   "gibralter-tracer"

   "hollywood-hotel"
   "hollywood-lucio"
   "hollywood-objective"
   "hollywood-set"
   "hollywood-soldier"
   "hollywood-sombra"
   "hollywood-spawn"
   
   "intro-a"
   "intro-b"
   "intro-c"
   "intro-d"

   "junkertown-efi"
   "junkertown-field"
   "junkertown-junkrat-a-1"
   "junkertown-junkrat-a-2"
   "junkertown-junkrat-b"
   "junkertown-junkrat-c"
   "junkertown-sky"
   "junkertown-spawn"
   "junkertown-torb"

   "kings-row-lucio"
   "kings-row-street"
   "kings-row-torb"
   "kings-row-junkrat"

   "lijiang-arcade"
   "lijiang-doomfist"
   "lijiang-hotel"
   "lijiang-junkrat-a"
   "lijiang-junkrat-b"
   "lijiang-spawn"
   "lijiang-winston"

   "route-66-ana"
   "route-66-diner"
   "route-66-door"
   "route-66-hog"
   "route-66-reaper"
   "route-66-street"

   "title-screen-bg"

   "volskaya-apartment"
   "volskaya-hotel"
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
