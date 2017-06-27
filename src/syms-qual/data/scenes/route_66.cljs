(ns syms-qual.data.scenes.route-66
  (:require [syms-qual.data.bg :as bg]))

(def data
  {:diner-intro
   {:style {:background-image (:route-66-diner bg/data)}
    :render-type :miranda/narration
    :subscenes
    ["Today is the day you must perform your first qualifying duties under the rogue Overwatch program. Although, you can’t imagine what your employer, The Vishkar Corporation, is going to gain from your participation in such a highly illegal operation, it’s not your place to question their orders. From the intel they’ve gathered, it seems Overwatch agents fight largely fight among themselves, attempting, and mostly failing to escort payloads. Vishkar strategists have advised you to focus on maintaining direct contact with this payload in your qualifying endeavors, but beyond that they have concluded that the next best course of action will be to work closely with your assigned team captains to develop cohesive battle strategies on a day by day basis."]
    :transition [:route-66 :diner 0]}

   :diner
   {:style {:background-image (:route-66-diner bg/data)}
    :render-type :miranda/dialogue
    :subscenes
    [["McCree" [[:mccree :_coffeePoint] [:ana :_sass :behind] [:symmetra :_neutral]]
      "Howdy! You’re that Symmetra gal joining Overwatch from the Vishkar corporation, aren’tcha? What sort of interest could y’all have with Overwatch?"]
     ["McCree" [[:mccree :_coffeeDrink] [:ana :_cranky :behind] [:symmetra :_neutral]]
      "Reaper!"]]
    :transition [:anubis :spawn 0]}

   :street
   {:style {:background-image (:route-66-street bg/data)}
    :subscenes
    [["Symmetra" [[:roadhog :_neutral] [:symmetra :_neutral]] "Hi, I'm gay."]]}})


