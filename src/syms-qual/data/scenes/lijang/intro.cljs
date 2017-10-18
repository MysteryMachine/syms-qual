(ns syms-qual.data.scenes.lijang.intro)

(def data
  {[:lijang :intro]
   [:miranda/narration
    "You are grateful that the ORCA picked you up last, for even though the aircraft is relatively spacious, with all of your teammates on board it definitely feels quite cramped. Eager to stave off any impending sense of claustrophobia, you survey your conversational options. At the top of the stairs Lucio and D.va are seated in front of her imposing pink meka, staring intently at some sort of hand held device which is emitting a lot of dings and beeps. Seated at the booth in the corner are Tracer and Doomfist who seem absorbed in deep conversation. Finally, in the center of the aircraft, Winston is seated on the floor, a banana in his left hand, a spoon in his right, and a jar of peanut butter grasped firmly in his right foot."
    :-> [:lijang :choice]]

   [:lijang :choice]
   [:miranda/text-option
    "What will you do?"
    ["Talk to D.Va and Lucio" (constantly true) [:lijang :dva 0]]
    ["Talk to Tracer and Doomfist" (constantly true) [:lijang :tracer 0]]
    ["Talk to Winston" (constantly true) [:lijang :winston 0]]]})
