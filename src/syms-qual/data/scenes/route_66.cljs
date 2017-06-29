(ns syms-qual.data.scenes.route-66
  (:require [syms-qual.data.animation :as anim]))

(def data
  {[:diner :intro]
   [:miranda/narration
    "Today is the day you must perform your first qualifying duties under the rogue Overwatch program. Although, you can’t imagine what your employer, The Vishkar Corporation, is going to gain from your participation in such a highly illegal operation, it’s not your place to question their orders. From the intel they’ve gathered, it seems Overwatch agents fight largely fight among themselves, attempting, and mostly failing to escort payloads. Vishkar strategists have advised you to focus on maintaining direct contact with this payload in your qualifying endeavors, but beyond that they have concluded that the next best course of action will be to work closely with your assigned team captains to develop cohesive battle strategies on a day by day basis."
    :-> [:diner :dialogue 0]]

   [:diner :dialogue 0]
   [:miranda/dialogue
    ["McCree" [[:mccree :_coffeePoint] [:ana :_sass anim/back] [:symmetra :_neutral]]
     "Howdy! You’re that Symmetra gal joining Overwatch from the Vishkar corporation, aren’tcha? What sort of interest could y’all have with Overwatch?"]
    :-> [:diner :option 0]]

   [:diner :option 0]
   [:miranda/option
    [[:mccree :_coffeePoint] [:ana :_sass anim/back] [:symmetra :_neutral]]
    "I do not know."
    {:scene [:route-66 [:diner :option 0 :a]]}

    "Vishkar's motivations are not for me to reveal."
    {:scene [:route-66 [:diner :option 0 :b]]}

    "My conjecture is that Vishkar wants data on you Overwatch anarchists."
    {:scene [:route-66 [:diner :option 0 :c]]}]

   [:diner :dialogue 1]
   [:miranda/dialogue
    ["McCree" [[:mccree :_coffeeDrink] [:ana :_cranky anim/back] [:symmetra :_neutral]]
     "Reaper!"]
    :=> [:route-66 [:street :dialogue 0]]]})
