(ns syms-qual.data.scenes.dorado.genji
  (:require [carmen.util :as anim :refer [scoot]]
            [syms-qual.util :as util :refer [inc-transition]]))

(def data
  {[:street :- :choice]
   [:miranda/text-option
    "What will you do?"
    ["" (constantly true)
     [:-> [:street :- :yes]]]
    ["Converse with your other teammates" (constantly true)
     [:-> [:street :- :no]]]]

   [:street :- :yes]
   [:miranda/dialogue

    :-> [:lucio]]

   [:street :- :no]
   [:miranda/dialogue

    :-> [:street :choice]]

   [:-]
   [:miranda/characters
    [[]]
    :-> [:- :text]]

   [:- :text]
   [:miranda/narration
    ""
    :=> [:- [:spawn :intro] 0]]})
