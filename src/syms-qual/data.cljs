(ns syms-qual.data
  (:require [syms-qual.data.characters :as characters]
            [syms-qual.data.scenes :as scenes]))

(def graph
  {:scenes scenes/data})

(def base-state
  {:scene [:route-66 [:diner :intro] 0]
   :points/sombra 0
   :points/junkrat 0
   :points/pharah 0})
