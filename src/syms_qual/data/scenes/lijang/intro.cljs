(ns syms-qual.data.scenes.lijang.intro
  (:require [syms-qual.util :as util :refer [toggle-transition]]))

(def data
  {[:spawn :intro]
    [:miranda/narration
     [:div
      [:p.notice-head "WEEK 6"]
      [:hr.notice-hr ]
      [:p.notice-text
       [:div "LIJIANG TOWER"]
       [:div "China"]]]
    :-> [:spawn :intro2]]

  [:spawn :intro2]
   [:miranda/narration
    "You are grateful that the ORCA picked you up last, for even though the aircraft is relatively spacious, with all of your teammates on board it definitely feels quite cramped. Eager to stave off any impending sense of claustrophobia, you survey your conversational options."
    "At the top of the stairs Lucio and D.va are seated in front of her imposing pink meka, staring intently at some sort of hand held device which is emitting a lot of dings and beeps. Seated at the booth in the corner are Tracer and Doomfist who seem absorbed in deep conversation. Finally, in the center of the aircraft, Winston is seated on the floor, a banana in his left hand, a spoon in his right, and a jar of peanut butter grasped firmly in his right foot."
    :-> [:spawn :choice]]

   [:spawn :choice]
   [:miranda/text-option
    "What will you do?"
    ["Talk to D.Va and Lucio" (comp not :lijiang/dva-chat)
     (toggle-transition [:-> [:spawn :dva 0]] :lijiang/dva-chat)]
    ["Talk to Tracer and Doomfist" (comp not :lijiang/tracer-chat)
     (toggle-transition [:-> [:spawn :tracer 0]] :lijiang/tracer-chat)]
    ["Talk to Winston" (comp not :lijiang/winston-chat)
     (toggle-transition [:-> [:spawn :winston 0]] :lijiang/winston-chat)]

    ["Go with D.Va and Lucio" :lijiang/dva-chat
     [:-> [:spawn :dva :yes]]]
    ["Fight Doomfist???" :lijiang/tracer-chat
     [:-> [:spawn :tracer :yes]]]
    ["Go with Winston" :lijiang/winston-chat
     [:-> [:spawn :winston :yes]]]]})
