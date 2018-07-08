(ns syms-qual.data.scenes.gibralter.intro
  (:require [syms-qual.util :as util :refer [toggle-transition]]))

(def data
  {[:spawn :intro]
    [:miranda/narration
     [:div
      [:p.notice-head "WEEK 9"]
      [:hr.notice-hr ]
      [:p.notice-text
       [:div "WATCHPOINT: GIBRALTAR"]
       [:div "Gibraltar"]]]
    :-> [:spawn :intro2]]

  [:spawn :intro2]
   [:miranda/narration
    "Spirits are pretty high in general in the room. Watchpoint: Gibraltar has been adorned decoratively in festive streamers and balloons in honor of Winston’s upcoming birthday. The week’s match will be the highlight of festivities in honor of Winston’s favorite thing: people trying hard in Overwatch scrimmages."
    "Either way, several members of your team have had a few drinks, and the ones that haven’t are still in a light and peppy mood. You decide to mingle before the match. You see Mercy enjoying a strangely colored beverage and McCree and Soldier sipping bourbon while Soldier grills for everyone. In the far corner of the room Tracer and D.Va seem to be working on some sort of arts and crafts project."
    :-> [:spawn :choice]]

   [:spawn :choice]
   [:miranda/text-option
    "What will you do?"
    ["Talk to McCree and Soldier 76" (comp not :gibralter/mccree-chat)
     (toggle-transition [:-> [:spawn :mccree 0]] :gibralter/mccree-chat)]
    ["Talk to Tracer and D.Va" (comp not :gibralter/dva-chat)
     (toggle-transition [:-> [:spawn :dva 0]] :gibralter/dva-chat)]
    ["Talk to Mercy" (comp not :gibralter/mercy-chat)
     (toggle-transition [:-> [:spawn :mercy 0]] :gibralter/mercy-chat)]

    ["Go with McCree and Soldier 76" :gibralter/mccree-chat
     [:-> [:spawn :mccree :yes]]]
    ["Go with D.Va and Tracer" #(and (:gibralter/dva-chat %) (= 7 (:points/payload %)))
      [:-> [:spawn :dva :a :option :yes]]]
    ["Go on the payload" #(and (:gibraler/dva-chat %) (not= 7 (:points/payload %)))
     [:-> [:spawn :dva :b :option :yes]]]
    ["Go with Pharah" #(and (:gibralter/mercy-chat %) (= (:points/pharah %) 2))
     [:-> [:spawn :mercy :yes]]]]})
