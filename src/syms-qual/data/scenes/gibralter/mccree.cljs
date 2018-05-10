(ns syms-qual.data.scenes.gibralter.mccree
  (:require [carmen.util :as anim :refer [scoot]]
            [syms-qual.util :as util :refer [inc-transition]]))

(def data
  {[:spawn :mccree 0]
    [:miranda/dialogue
    ["Symmetra" [[:symmetra :_helloNeutral (scoot 92 7 1)]]
     "Hello!"]]

    [:street :mccree :choice]
   [:miranda/text-option
    "What will you do?"
    ["" (constantly true)
     [:-> [:street :mccree :yes]]]
    ["Converse with your other teammates" (constantly true)
     [:-> [:street :mccree :no]]]]

   [:street :mccree :yes]
   [:miranda/dialogue

    :-> [:mccree]]

   [:street :mccree :no]
   [:miranda/dialogue

    :-> [:street :choice]]

   [:mccree]
   [:miranda/characters
    [[]]
    :-> [:mccree :text]]

   [:mccree :text]
   [:miranda/narration
    "butts"
    :=> [:dorado [:spawn :intro] 0]]})
