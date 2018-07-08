(ns syms-qual.data.scenes.eichenwalde.intro
  (:require [syms-qual.util :as util :refer [toggle-transition]]))

(def data
  {[:spawn :intro]
    [:miranda/narration
     [:div
      [:p.notice-head "WEEK 7"]
      [:hr.notice-hr ]
      [:p.notice-text
       [:div "EICHENWALDE"]
       [:div "Germany"]]]
    :-> [:spawn :intro2]]

  [:spawn :intro2]
   [:miranda/narration
    "Although by now you’ve grown accustomed to the familiar feeling of mounting tension before a match begins, your team seems to be in especially bleak spirits today. An apprehensive silence sits uneasily over the derelict beer hall serving as your spawn point."
    "For a while you watch the dust drifting softly in the beams of light streaming from the broken ceiling before turning your attention to your teammates, who all seem equally lost in their own thoughts. It’s so quiet you think you can hear the mice and roaches scurrying in the walls. Eager to break the silence, you try and strike up a conversation."
    :-> [:spawn :choice]]

   [:spawn :choice]
   [:miranda/text-option
    "What will you do?"
    ["Talk to Widowmaker" (comp not :eichenwalde/widow-chat)
     (toggle-transition [:-> [:spawn :widowmaker 0]] :eichenwalde/widow-chat)]
    ["Talk to Hanzo" (comp not :eichenwalde/hanzo-chat)
     (toggle-transition [:-> [:spawn :hanzo 0]] :eichenwalde/hanzo-chat)]
    ["Talk to Ana and Reinhardt" (comp not :eichenwalde/pharah-chat)
     (toggle-transition [:-> [:spawn :pharah 0]] :eichenwalde/pharah-chat)]

    ["Go with Widowmaker" :eichenwalde/widow-chat
     [:-> [:spawn :widowmaker :yes]]]
    ["Go with Hanzo" :eichenwalde/hanzo-chat
     [:-> [:spawn :hanzo :yes]]]
    ["Go with Pharah, Ana and Reinhardt" :eichenwalde/pharah-chat
     [:-> [:spawn :pharah :yes]]]]})
