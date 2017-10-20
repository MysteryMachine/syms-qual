(ns syms-qual.data.scenes.eichenwalde.intro)

(def data
  {[:eichenwalde :intro]
   [:miranda/narration
    "Although by now you’ve grown accustomed to the familiar feeling of mounting tension before a match begins, your team seems to be in especially bleak spirits today. An apprehensive silence sits uneasily over the derelict beer hall serving as your spawn point. For a while you watch the dust drifting softly in the beams of light streaming from the broken ceiling before turning your attention to your teammates who all seem equally lost in their own thoughts. It’s so quiet you think you can hear the mice and roaches scurrying in the walls. Eager to break the silence, you try and strike up a conversation."
    :-> [:eichenwalde :choice]]

   [:eichenwalde :choice]
   [:miranda/text-option
    "What will you do?"
    ["Talk to Widowmaker" (constantly true) [:eichenwalde :efi 0]]
    ["Talk to Hanzo" (constantly true) [:eichenwalde :sombra 0]]
    ["Talk to Ana and Reinhardt" (constantly true) [:eichenwalde :soldier 0]]]})
