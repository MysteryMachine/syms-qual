(ns syms-qual.data
  (:require [syms-qual.data.characters :as characters]
            [syms-qual.data.scenes :as scenes]))

(def graph
  {:characters characters/data
   :scenes scenes/data})

(def base-state
  {:scene [:route-66 :diner-intro 0]})
