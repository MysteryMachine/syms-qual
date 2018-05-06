(ns syms-qual.data.scenes.junkertown.torb
  (:require [carmen.util :as anim :refer [scoot]]
            [syms-qual.util :as util :refer [inc-transition]]))

(def data
  {[:spawn :torb 0]
   [:miranda/dialogue
    ["Symmetra" [] "Torbjorn, you seem on edge."]
    ["Torbjorn" [] "And you are not? How can you be calm around these blasted omnics?"]
    ["Symmetra" [] "I think some of them are quite nice. Bastion cooked me a mushroom risotto dinner after our match in Eichenwald. They picked them fresh from the their forest."]
    ["Torbjorn" [] "See! Aha! Mushrooms! They’re trying to poison you!. You can’t trust these damn tin cans."]
    ["Symmetra" [] "You performance did not seem affected by the Omnic’s presence last round. I do not understand what has changed."]
    ["Torbjorn" [] "That was defense, we’re now on attack. On defense, I can put my turret down far away from any of them. On attack, I have to follow the cursed machines. You can’t fool me with wonderfully cooked dinners and catering."]
    ["Symmetra" [] "So the only reason you will not eat Bastion’s Michelin Star cooking is because they are a robot?"]
    ["Torbjorn" [] "No, I do not trust fancy smanshy dinners. When my wife cooks, she makes me a bowl of Cröonchy Stars cereal."]
    ["Symmetra" [] "That’s all you eat? Also, weren’t those discontinued?"]
    ["Torbjorn" [] "I do all my shopping in bulk so I have a large supply in reserve. Every meal, I make her open a fresh milk and a fresh box. I need to make sure she did not tamper with the food. I check carefully for needle marks."]
    ["Symmetra" [] "…"]
    ["Torbjorn" [] "I then place a towel over my face, so that poison can not be tactically dropped into my mouth while I am distracted."]
    ["Symmetra" [] "…"]
    ["Torbjorn" [] "It is important to hide your eyes from god himself while you eat. You don’t know if that all powerful arse is tryna pull a fast one on you."]
    ["Symmetra" [] "Torbjorn…"]
    ["Torbjorn" [] "It’s careful work like this that has made it so I was the only Overwatch agent that did not have to fake his own death."]
    ["Symmetra" [] "But Reinhardt and Mercy…"]
    ["Torbjorn" [] "Will have to fake their death eventually. But not me."]
    ["Torbjorn" [] "Let me tell you, in detail, about the benefits of doomsday prepping."]
    ["Symmetra" [] "Shouldn’t we prepare for the ma-"]
    ["Torbjorn" [] "It’s important to have a locked bunker. Do not give the combination to your children. You think that having eight additional pairs of hands will be helpful with all of the manual labor that will be necessary in the our new apocalyptic wasteland future, but your children cannot be trusted."]
    ["Symmetra" [] "Torb-"]
    ["Torbjorn" [] "Quiet! Do not interrupt me!"]
    ["Torbjorn" [] "You can’t trust your children. They are weak, and their diet could have been poisoned by your wife. You also can’t trust your wife, her diet could have been self poisoned!"]
    ["Torbjorn" [] "What are you doing? I’m giving you critical information here. I want you to smile while I-"]
    [nil [] "You give him a hard slap right across his face."]
    ["Torbjorn" [] "Misandry. That’s what that is."]
    ["Symmetra" [] "Be quiet."]
    ["Torbjorn" [] "Ok."]
    ["Symmetra" [] "That’s “yes, ma’am” to you."]
    ["Torbjorn" [] "Aye, ma’am."]
    ["Symmetra" [] "Build your turret on the front of payload. I will adorn it with my own turrets on the sides. Bastion will sit in the back. Orisa will shield us and Zenyatta will call out priority targets and make sure we stay healed."]
    ["Symmetra" [] "Junkrat will scout ahead and place traps in the various flanking routes while the rest of us sit on the payload and ride it efficiently to victory."]
    :transition :miranda/conditional
    [#(= (:points/payload %) 6) [:-> [:spawn :torb :a]]
     :else                      [:-> [:spawn :torb :b]]]]

   [:spawn :torb :a]
   [:miranda/dialogue
    ["Torbjorn" [] "Fine. I can’t argue with your track record. Also, I don’t want to get slapped again."]
    ["Symmetra" [] "That’s right."]
    ["Symmetra" [] "Mmm--"]
    ["Symmetra" [] "hmm."]
    ["Torbjorn" [] "So are we doing this? I’ll only work the the bots if I’ve got you as a buffer."]
    :-> [:spawn :torb :a :option]]

   [:spawn :torb :a :option]
   [:miranda/text-option
    "What will you do?"
    ["Slap your way to victory" (constantly true)
     [:-> [:spawn :torb :a :option :yes]]]
    ["Maybe goof off with your other teammates." (constantly true)
     [:-> [:spawn :torb :a :option :no]]]]

   [:spawn :torb :a :option :yes]
   (concat
    [:miranda/dialogue
     ["Symmetra" [] "Yes. I’ve decided. Let’s go."]]
    (inc-transition
     [:-> [:torbjorn]]
     :points/payload))

   [:spawn :torb :a :option :no]
   [:miranda/dialogue
    ["Symmetra" [] "We’ll see. I’ll let you know."]
    ["Torbjorn" [] "What? You took a good shot at me and you might not even help us win?"]
    ["Symmetra" [] "That’s right. Deal with it."]
    :-> [:spawn :choice]]

   [:spawn :torb :b]
   [:miranda/dialogue
    ["Torbjorn" [] "Feck off. You haven’t taken any of this seriously so far. I’ve seen you goofing off."]
    ["Symmetra" [] "Threats will not work, huh?"]
    ["Tobjorn" [] "They will not. I am less afraid of you than the bots. I can take some slaps."]
    :-> [:spawn :torb :b :option]]

   [:spawn :torb :b :option]
   [:miranda/text-option
    "What will you do?"
    ["Attempt to achieve victory through sheer force of will" (constantly true)
     [:-> [:spawn :torb :b :option :yes]]]
    ["Abandon the payload to goof off with your other teammates" (constantly true)
     [:-> [:spawn :torb :b :option :no]]]]

   [:spawn :torb :b :option :yes]
   [:miranda/dialogue
    ["Symmetra" [] "I will find a way to win on my own."]
    :-> [:spawn :torb-b]]

   [:spawn :torb :b :option :no]
   [:miranda/dialogue
    ["Symmetra" [] "If you are unwilling to listen to reason I see no point in trying to convince you."]
    ["Torbjorn" [] "That’s the sort of attitude that got us into this mess in the first place. You’re officially off my list of potential bunker buddies when the robot apocalypse hits. Again."]
    :-> [:spawn :choice]]

   [:torbjorn]
   [:miranda/characters
    [[]]
    :-> [:torbjorn :text]]

   [:torbjorn :text]
   [:miranda/narration
    "Despite your team’s overly static composition, you manage to pull off a quick and decisive first attacking, taking control of the payload and transforming it into a mobile death ball. Covered in the shields a turrets of all kinds you steamroll your opponents easily making your way to the yellow box of victory. "
    :=> [:gibralter [:spawn :intro] 0]]

   [:spawn :torb-b]
   [:miranda/narration
    "Unable to convince your teammates of the efficacy of your strategy, your offensive round was doomed to failure. With your fractured and scattershot approach your team was unable to advance the payload even slightly and your hopes for victory were quickly dashed."
    :=> [:gibralter [:spawn :intro] 0]]})

