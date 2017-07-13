(ns syms-qual.core
  (:require [carmen.miranda :as miranda]
            [syms-qual.data.scenes :as scenes]))

(enable-console-print!)

(def graph
  {:scenes scenes/data})

(def base-state
  {:scene [:route-66 [:diner :dialogue 6] 0]
   :points/sombra 0
   :points/junkrat 0
   :points/pharah 0})

(def options
  {:miranda/click-delay 100
   :miranda/auto-save true})

(defonce state-atom (reagent.core/atom base-state))

(miranda/samba! "app" state-atom graph options)
