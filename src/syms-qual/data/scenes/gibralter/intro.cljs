(ns syms-qual.data.scenes.gibralter.intro
  (:require [syms-qual.util :as util :refer [toggle-transition]]))

(def data
  {[:spawn :intro]
   [:miranda/narration
    "Spirits are pretty high in general in the room. Watchpoint: Gibralter has been adorned decoratively in festive streamers and balloons in honor of Winston’s upcoming birthday. The week’s match will be the highlight of festivities in honor of Winston’s favorite thing: people trying hard in Overwatch scrimmages."
    "Either way, several members of your team have had a few drinks, and the ones that haven’t are still in a light and peppy mood. You decide to mingle before the match. You see Mercy enjoying a strangely colored beverage, McCree and Soldier sip bourbon while Soldier grills for everyone, and Tracer and D.Va are loudly popping balloons in the corner."
    :-> [:spawn :choice]]

   [:spawn :choice]
   [:miranda/text-option
    "What will you do?"
    ["Talk to McCree" (comp not :gibralter/mccree-chat)
     (toggle-transition [:-> [:spawn :mccree 0]] :gibralter/mccree-chat)]
    ["Talk to Tracer and D.Va" (comp not :gibralter/dva-chat)
     (toggle-transition [:-> [:spawn :dva 0]] :gibralter/dva-chat)]
    ["Talk Mercy" (comp not :gibralter/mercy-chat)
     (toggle-transition [:-> [:spawn :mercy 0]] :gibralter/mercy-chat)]

    ["Go with McCree" :gibralter/mccree-chat
     [:-> [:spawn :mccree :yes]]]
    ["Go with D.Va and Tracer" :gibralter/dva-chat
     [:-> [:spawn :dva :yes]]]
    ["Go with Pharah" :gibralter/mercy-chat
     [:-> [:spawn :mercy :yes]]]]})
