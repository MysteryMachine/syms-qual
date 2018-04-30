(ns syms-qual.data.scenes.junkertown.intro
  (:require [syms-qual.util :as util :refer [toggle-transition]]))

(def data
  {[:street :intro]
   [:miranda/narration
    "A loud buzzing dominates the air during your initial round on defense, though you are not entirely sure whether it is the mechanical whirring of your mostly omnic teammates, or the myriad of unpleasant Australian insects hovering near the battlefield."
    "You manage to put up a reasonable fight, stopping the payload short of the map’s first point-- the gates of Junkertown proper. Although victory is by no means guaranteed, you are optimistic about your chances, since you will only need to complete the first third of the map on your offensive round to win."
    "You retreat to the makeshift shed, which serves as Roadhog’s garage, living space, and for the purposes of this week’s match, the offensive spawn to begin next round. In an attempt to make sure you will have a coordinated attack plan, you convene with your teammates."
    :-> [:street :choice]]

   [:street :choice]
   [:miranda/text-option
    "What will you do?"
    ["Talk to Torbjorn" (comp not :junkertown/torb-chat)
     (toggle-transition [:-> [:street :torb 0]] :junkertown/torb-chat)]
    ["Talk to Junkrat" (comp not :junkertown/junkrat-chat)
     (toggle-transition [:-> [:street :junkrat 0]] :junkertown/junkrat-chat)]
    ["Talk to Efi" (comp not :junkertown/efi-chat)
     (toggle-transition [:-> [:street :efi 0]] :junkertown/efi-chat)]

    ["Go with Torbjorn" :junkertown/torb-chat
     [:-> [:street :torb :yes]]]
    ["Go with Junkrat" :junkertown/junkrat-chat
     [:-> [:street :junkrat :yes]]]
    ["Go with Efi" :junkertown/efi-chat
     [:-> [:street :efi :yes]]]]})
