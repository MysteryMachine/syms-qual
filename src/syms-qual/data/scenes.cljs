(ns syms-qual.data.scenes
  (:require
   [syms-qual.data.scenes.title-screen :as title-screen]
   [syms-qual.data.scenes.route-66.intro :as intro]
   [syms-qual.data.scenes.route-66.options :as intro-options]
   [syms-qual.data.scenes.route-66.dates :as intro-dates]

   [syms-qual.data.scenes.anubis.cutscenes :as anubis-cutscenes]
   [syms-qual.data.scenes.anubis.pharah :as anubis-pharah]
   [syms-qual.data.scenes.anubis.date :as anubis-date]
   [syms-qual.data.scenes.anubis.genji :as anubis-genji]
   [syms-qual.data.scenes.anubis.zarya :as anubis-zarya]

   [syms-qual.data.scenes.volskaya.intro :as volskaya-intro]
   [syms-qual.data.scenes.volskaya.mei :as volskaya-mei]
   [syms-qual.data.scenes.volskaya.zenyatta :as volskaya-zenyatta]
   [syms-qual.data.scenes.volskaya.sombra :as volskaya-sombra]
   [syms-qual.data.scenes.volskaya.date :as volskaya-date]
   [syms-qual.data.scenes.volskaya.date-2 :as volskaya-date-2]

   [syms-qual.data.scenes.kings-row.junkrat :as kings-row-junkrat]
   [syms-qual.data.scenes.kings-row.intro :as kings-row-intro]
   [syms-qual.data.scenes.kings-row.torb :as kings-row-torb]
   [syms-qual.data.scenes.kings-row.lucio :as kings-row-lucio]
   [syms-qual.data.scenes.kings-row.date :as kings-row-date]
   [syms-qual.data.scenes.kings-row.date-2 :as kings-row-date-2]

   [syms-qual.data.scenes.hollywood.soldier :as hollywood-soldier]
   [syms-qual.data.scenes.hollywood.intro :as hollywood-intro]
   [syms-qual.data.scenes.hollywood.sombra :as hollywood-sombra]
   [syms-qual.data.scenes.hollywood.date :as hollywood-date]
   [syms-qual.data.scenes.hollywood.date-2 :as hollywood-date-2]
   [syms-qual.data.scenes.hollywood.efi :as hollywood-efi]

   [syms-qual.data.scenes.lijang.dva :as lijang-dva]
   [syms-qual.data.scenes.lijang.date-1 :as lijang-date-1]
   [syms-qual.data.scenes.lijang.date-2 :as lijang-date-2]
   [syms-qual.data.scenes.lijang.intro :as lijang-intro]
   [syms-qual.data.scenes.lijang.winston :as lijang-winston]
   [syms-qual.data.scenes.lijang.tracer :as lijang-tracer]

   [syms-qual.data.scenes.eichenwalde.hanzo :as eichenwalde-hanzo]
   [syms-qual.data.scenes.eichenwalde.intro :as eichenwalde-intro]
   [syms-qual.data.scenes.eichenwalde.pharah :as eichenwalde-pharah]
   [syms-qual.data.scenes.eichenwalde.date :as eichenwalde-date]
   [syms-qual.data.scenes.eichenwalde.date-2 :as eichenwalde-date-2]
   [syms-qual.data.scenes.eichenwalde.widowmaker :as eichenwalde-widowmaker]

   [syms-qual.data.scenes.junkertown.intro :as junkertown-intro]
   [syms-qual.data.scenes.junkertown.torb :as junkertown-torb]
   [syms-qual.data.scenes.junkertown.efi :as junkertown-efi]
   [syms-qual.data.scenes.junkertown.junkrat :as junkertown-junkrat]
   [syms-qual.data.scenes.junkertown.date-3 :as junkertown-date-1]
   [syms-qual.data.scenes.junkertown.date-2 :as junkertown-date-2]
   [syms-qual.data.scenes.junkertown.date-1 :as junkertown-date-3]

   [syms-qual.data.scenes.gibralter.date-1 :as gib-date-1]
      [syms-qual.data.scenes.gibralter.date-2 :as gib-date-2]
      [syms-qual.data.scenes.gibralter.date-2 :as gib-date-3]
      [syms-qual.data.scenes.gibralter.dva :as gib-dva]
      [syms-qual.data.scenes.gibralter.intro :as gib-intro]
      [syms-qual.data.scenes.gibralter.mccree :as gib-mccree]
      [syms-qual.data.scenes.gibralter.mercy :as gib-mercy]

      #_([syms-qual.data.scenes.dorado.date-1 :as dor-date-1]
      [syms-qual.data.scenes.dorado.date-2 :as dor-date-2]
      [syms-qual.data.scenes.dorado.date-2 :as dor-date-3]
      [syms-qual.data.scenes.dorado.genji :as dor-genji]
      [syms-qual.data.scenes.dorado.intro :as dor-intro]
      [syms-qual.data.scenes.dorado.sombra :as dor-sombra]
      [syms-qual.data.scenes.dorado.mei :as dor-mei])

   [syms-qual.data.scenes.intro :as intro-cutscenes]
   [syms-qual.data.characters :as char]
   [syms-qual.data.bg :as bg]
   [carmen.data :as data]))

(def structure
  {:route-66 (merge intro/data intro-options/data intro-dates/data)
   :anubis (merge anubis-cutscenes/data anubis-pharah/data anubis-genji/data
                  anubis-zarya/data anubis-date/data)
   :eichenwalde (merge eichenwalde-pharah/data eichenwalde-hanzo/data
                       eichenwalde-widowmaker/data eichenwalde-intro/data
                       eichenwalde-date/data eichenwalde-date-2/data)
   :gibralter (merge gib-date-2/data gib-date-1/data gib-dva/data gib-mercy/data
                     gib-mccree/data gib-intro/data)
   :dorado {}#_(merge dor-mei/data dor-sombra/data dor-intro/data dor-genji/data dor-date-3/data
                  dor-date-2/data dor-date-1/data)
   :hollywood (merge hollywood-efi/data hollywood-sombra/data hollywood-date-2/data
                     hollywood-date/data hollywood-soldier/data hollywood-intro/data)
   :volskaya (merge volskaya-sombra/data volskaya-date/data volskaya-date-2/data
                    volskaya-zenyatta/data volskaya-mei/data volskaya-intro/data)
   :lijiang (merge lijang-dva/data lijang-intro/data lijang-winston/data lijang-tracer/data
                   lijang-date-1/data lijang-date-2/data)
   :kings-row (merge kings-row-junkrat/data kings-row-torb/data kings-row-lucio/data
                     kings-row-intro/data kings-row-date/data kings-row-date-2/data)
   :intro intro-cutscenes/data
   :junkertown (merge junkertown-intro/data junkertown-torb/data junkertown-efi/data
                      junkertown-junkrat/data junkertown-date-1/data
                      junkertown-date-2/data junkertown-date-3/data)
   :title-screen (merge title-screen/data)
   :epilogue (merge)})

(def data (data/reify-scenes char/data bg/data structure))
