(ns syms-qual.data.scenes.kings-row.junkrat
  (:require [carmen.util :as anim :refer [scoot]]
            [syms-qual.util :as util :refer [inc-transition]]))

(def data
  {[:street :junkrat 0]
   [:miranda/dialogue
    ["Junkrat" [[:junkrat :_ballWave (scoot -70 5 1)] [:roadhog :_neutral (scoot -90 -25 1)] [:symmetra :_neutral (scoot 73 8 1)]]
     "Owyagarn, awright?"]
    ["Symmetra" [[:junkrat :_ballNeutral (scoot 5)] [:roadhog :_neutral (scoot -18)] [:symmetra :_awkward (scoot 8)]]
     "Pardon?"]
    :transition :miranda/conditional
    [:volskaya/mei [:-> [:street :junkrat 0 :b]]
     :volskaya/sombra [:-> [:street :junkrat 0 :c]]
     :volskaya/zenyatta [:-> [:street :junkrat 0 :a]]
     :else [:-> [:street :junkrat 0 :c]]]]

   [:street :junkrat 0 :a]
   [:miranda/dialogue
    ["Junkrat" [[:junkrat :_ballBackThumb (scoot 5)] [:roadhog :_neutral (scoot -25)] [:symmetra :_neutral (scoot 8)]]
     "Ol’ pig face here was telling me he had his eye out for you yesterday but you were a no show. You’re not gonna go skippin’ out on us again are ya? I got plans for you."]
    :-> [:street :junkrat 1]]

   [:street :junkrat 0 :b]
   [:miranda/dialogue
    ["Junkrat" [[:junkrat :_ballBackThumb (scoot 5)] [:roadhog :_neutral (scoot -25)] [:symmetra :_neutral (scoot 8)]]
     "Ol’ pig face here was telling me about your shot putt shenanigans yesterday. Glad I wasn’t the one taking the laser orbs to the face, but gotta admit that was pretty damn clever combo. Reckon you and me oughtta make some teammate magic of our own happen today."]
    :-> [:street :junkrat 1]]

   [:street :junkrat 0 :c]
   [:miranda/dialogue
    ["Junkrat" [[:junkrat :_ballBackThumb (scoot 5)] [:roadhog :_neutral (scoot -25)] [:symmetra :_neutral (scoot 8)]]
     "Ol’ pig face here was telling me about your wild robot rodeo. yesterday. We heard Winston mention that Volskaya Industries got hacked, and the turned the robot on your team. Shame that it didn't work out, but I like folks who think outside the box. Think we could borrow your tactical genius for a sec?"]
    :-> [:street :junkrat 1]]

   [:street :junkrat 1]
   [:miranda/dialogue
    ["Symmetra" [[:junkrat :_ballNeutral (scoot 5)] [:roadhog :_neutral (scoot -25)] [:symmetra :_eyeRoll (scoot 8)]]
     "Let me guess; you want me to attach my turrets to something weird, in some sort of hairbrained scheme to surprise our enemy with an unusual attack. What is it? Turrets on Roadhog’s hook? Attach my teleporter to your Rip-tire? Hide my shield generator up your nose?"]
    ["Junkrat" [[:junkrat :_ballFrown (scoot 5)] [:roadhog :_neutral2 (scoot -25)] [:symmetra :_eyeRoll (scoot 8)]]
     "No, why would I want to go and do something impractical and overly complicated like that?"]
    ["Symmetra" [[:junkrat :_ballFrown (scoot 5)] [:roadhog :_neutral (scoot -25)] [:symmetra :_explainWTF (scoot 8)]]
     "Have you gotten a good look at yourself lately?"]
    ["Junkrat" [[:junkrat :_ballPointUp (scoot 5)] [:roadhog :_neutral (scoot -25)] [:symmetra :_neutral (scoot 8)]]
     "I don’t make it a habit to pay attention mirrors, love. The human psyche has this nasty tendency to judge itself unfairly. "]
    ["Junkrat" [[:junkrat :_ballIntro (scoot 5)] [:roadhog :_neutral (scoot -25)] [:symmetra :_neutral (scoot 8)]]
     "Roadie and I have instead made a habit of practicing self love and acceptance."]
    ["Roadhog" [[:junkrat :_ballNeutral (scoot 5)] [:roadhog :_pointUp (scoot -25)] [:symmetra :_neutral (scoot 8)]]
     "The boy is handsome. Don’t bully my friend."]
    ["Junkrat" [[:junkrat :_ballBack (scoot 5)] [:roadhog :_neutral (scoot -25)] [:symmetra :_neutral (scoot 8)]]
     "Roadie! You sweetheart. She’s not being a bully, she’s just not gotten a chance to know us. Now look, Satya…"]
    ["Symmetra" [[:junkrat :_ballNeutral (scoot 5)] [:roadhog :_neutral (scoot -25)] [:symmetra :_explain (scoot 8)]]
     "Symmetra."]
    ["Junkrat" [[:junkrat :_ballExplain (scoot 5)] [:roadhog :_drink (scoot -25)] [:symmetra :_neutral (scoot 8)]]
     "Err, Symmetra, yes, our plan involves nothing like that. Roadie and I have build a new contraption, a hooking device. For now we’ve hidden it just behind the choke, but once we’re on offense we plan to attach to the payload. "]
    ["Junkrat" [[:junkrat :_chart (scoot 5)] [:roadhog :_neutral (scoot -25)] [:symmetra :_sass (scoot 8)]]
     "The way it works is that we’ve added a radio transmitter to my trap, and when it springs, the device detects the"]
    :-> [:street :junkrat :option 0]]

   [:street :junkrat :option 0]
   [:miranda/option
    "Symmetra" [[:junkrat :_chart (scoot 5)] [:roadhog :_drink (scoot -25)] [:symmetra :_bewildered (scoot 8)]]
    "Oh? I must say, that’s an ingenious little trick. I’m assuming some form of explosive is involved afterwards?"
    "The design is solid. I do not see how I could assist you."]

   [:street :junkrat :option 0 0]
   [:miranda/dialogue
    ["Junkrat" [[:junkrat :_ballWink (scoot 5)] [:roadhog :_neutral (scoot -25)] [:symmetra :_sass (scoot 8)]]
     "Too right!"]
    ["Junkrat" [[:junkrat :_ballExplain (scoot 5)] [:roadhog :_neutral (scoot -25)] [:symmetra :_sass (scoot 8)]]
     "We’re planning on using it keep our back lines free of that skull face guy and the little speedy one since they’re always mucking up the works. The only thing missing, is we need a slight shim for the device. See, right here, we’re having some poor contact, and the thing won’t fire at times."]
    :-> [:street :junkrat 2]]

   [:street :junkrat :option 0 1]
   [:miranda/dialogue
    ["Junkrat" [[:junkrat :_ballExplainConcerned (scoot 5)] [:roadhog :_neutral (scoot -25)] [:symmetra :_confused (scoot 8)]]
     "But you can! The device is having some issues with the timing mechanism, some poor contact. It’s a little last minute, but could you conjure us up a shim, love?"]
    :-> [:street :junkrat 2]]

   [:street :junkrat 2]
   [:miranda/dialogue
    ["Symmetra" [[:junkrat :_ballNeutral (scoot 5)] [:roadhog :_drink (scoot -25)] [:symmetra :_thinking (scoot 8)]]
     "A shim?"]
    ["Junkrat" [[:junkrat :_shimGesture (scoot 5)] [:roadhog :_neutral (scoot -25)] [:symmetra :_neutral (scoot 8)]]
     "Aye, love, something thin we could wedge in there. My porcine pal and I would search ourselves, but we’re a ways away from a junkyard, and the match is gonna start soon."]
    ["Junkrat" [[:junkrat :_neckHand (scoot 5)] [:roadhog :_neutral (scoot -25)] [:symmetra :_neutral (scoot 8)]]
     "I gotta admit, I’m right stressed about the whole thing. Working so hard on this machine only to have it malfunction over something this silly."]
    ["Roadhog" [[:junkrat :_ballNeutral (scoot 5)] [:roadhog :_drink (scoot -25)] [:symmetra :_smile (scoot 8)]]
     "You are more than what you make, Jamie."]
    ["Junkrat" [[:junkrat :_sigh (scoot 5)] [:roadhog :_neutral (scoot -25)] [:symmetra :_smile (scoot 8)]]
     "Right. Right. Self-love and self-acceptance, yada yada. So waddya say?"]
    ["Symmetra" [[:junkrat :_ballNeutral (scoot 5)] [:roadhog :_neutral (scoot -25)] [:symmetra :_explainUncomfortable (scoot 8)]]
     "I believe that  I can be of help, yes."]
    ["Junkrat" [[:junkrat :_shyblush (scoot 5)] [:roadhog :_neutral (scoot -25)] [:symmetra :_smile (scoot 8)]]
     "Oy! Thank you! You’re a sweetheart! That, um, brings me to my next point."]
    ["Roadhog" [[:junkrat :_shyblush (scoot 5)] [:roadhog :_drink (scoot -25)] [:symmetra :_neutral (scoot 8)]]
     "Go on."]
    ["Junkrat" [[:junkrat :_fibbin (scoot 5)] [:roadhog :_neutral (scoot -25)] [:symmetra :_neutral (scoot 8)]]
     "Aye aye! Um!"]
    ["Junkrat" [[:junkrat :_ballExplain (scoot 5)] [:roadhog :_neutral (scoot -25)] [:symmetra :_neutral (scoot 8)]]
     "This plan does work better if you stay on the point  with us. What do you say? Roadie and I would really enjoy the company. "]
    ["Junkrat" [[:junkrat :_fibbin (scoot 5)] [:roadhog :_neutral (scoot -25)] [:symmetra :_neutral (scoot 8)]]
     "And not to beat a dead horse, but, since  you mentioned it, you creating a nest of your lil’ zappers right under our machine would be right nice!"]
    ["Symmetra" [[:junkrat :_ballNeutral (scoot 5)] [:roadhog :_neutral2 (scoot -25)] [:symmetra :_eyeRoll (scoot 8)]]
     "Sigh, I knew there’d be some sort of gimmick involving my turrets."]
    ["Roadhog" [[:junkrat :_ballNeutral (scoot 5)] [:roadhog :_explain (scoot -25)] [:symmetra :_neutral (scoot 8)]]
     "Let us know if you’ll join us. I’ll pack an extra sandwich."]
    ["Junkrat" [[:junkrat :_ballWink (scoot 5)] [:roadhog :_neutral (scoot -25)] [:symmetra :_neutral (scoot 8)]]
     "Fairy bread! Roadie’s specialty! What’d ya say?"]
    :-> [:street :junkrat :choice]]

   [:street :junkrat :choice]
   [:miranda/text-option
    "What will you do?"
    ["Work with the Junkers" (constantly true)
     [:-> [:street :junkrat :yes]]]
    ["Converse with your other teammates" (constantly true)
     [:-> [:street :junkrat :no]]]]

   [:street :junkrat :yes]
   (concat
    [:miranda/dialogue
     ["Symmetra" [[:junkrat :_ballSmile (scoot 5)] [:roadhog :_drink (scoot -25)] [:symmetra :_craftShim (scoot 8)]]
      "Your proposal is suitable. I will create the shim now."]
     ["Junkrat" [[:junkrat :_wrist (scoot 5)] [:roadhog :_drink (scoot -25)] [:symmetra :_craftShim (scoot 8)]]
      "Aces. I'm dead chuffed to work with some brand spanking new materials for once."]]
    (inc-transition
     [:-> [:street :junkrat :cutscene]]
     :points/payload
     :points/junkrat))

   [:street :junkrat :no]
   [:miranda/dialogue
    ["Symmetra" [[:junkrat :_ballNeutral (scoot 5)] [:roadhog :_neutral (scoot -25)] [:symmetra :_explainUncomfortable (scoot 8)]]
     "I’ll consider it! Let me just check in with our other teammates first."]
    :-> [:street :choice]]

   [:street :junkrat :cutscene]
   [:miranda/narration
    "The junkers make quick use of your shim, hammering it into place just in time for the match to start."
    :-> [:street :junkrat 3]]})
