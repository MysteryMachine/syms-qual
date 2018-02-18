(ns syms-qual.data.scenes.hollywood.sombra
  (:require [carmen.util :as anim :refer [scoot fade-in]]
            [syms-qual.util :as util :refer [inc-transition]]))

(def data
  {[:spawn :sombra 0]
   [:miranda/dialogue
    ["Symmetra" [[:reaper :_neutral (scoot -86 -6 1)] [:symmetra :_helloWarm (scoot 84 4 1)]]
     "Hello!"]
    ["Reaper" [[:reaper :_explain (scoot -6)] [:symmetra :_neutral (scoot 4)]]
     "Sombra, look. It’s your soon-to-be girlfriend, triangle dancer."]
    ["Sombra" [[:reaper :_neutral (scoot -6)] [:sombra :_shhReaper (fade-in [-20 0] 1.5)] [:symmetra :_neutral (scoot 4)]]
     "Cállate, abuelo."]
    ["Reaper" [[:reaper :_explain (scoot -6)] [:sombra :_awkward (scoot -14)] [:symmetra :_1000Mile (scoot 4)]]
     "Ah, my apologies, apparently I only imagined that my teammate was massively gay for you and that \"Bossy in the hottest possible way,\" was something that she specifically said."]
    ["Symmetra" [[:reaper :_neutral (scoot -6)] [:sombra :_awkward (scoot -14)] [:symmetra :_coy (scoot 4)]]
     "What?"]
    ["Sombra" [[:reaper :_neutral (scoot -6)] [:sombra :_explainAngry (scoot -14)] [:symmetra :_awkward (scoot 4)]]
     "That’s it, Gabe. You know that prank I pulled where I made it so that the cable box only showed back to back runs of Guy Fieri? Say goodbye to your novellas, abuelo, it’s Diners, Drive-Ins and Dives for the rest of your natural life."]
    ["Reaper" [[:reaper :_point-up (scoot -6)] [:sombra :_neutral2 (scoot -14)] [:symmetra :_neutral (scoot 4)]]
     "But my life..."]
    ["Reaper" [[:reaper :_fingerGuns (scoot -6)] [:sombra :_neutral2 (scoot -14)] [:symmetra :_neutral (scoot 4)]]
     "Is unnatural. And fine. It was worth it. I made Jack buy a DVR and the international channels as a contingency plan for this exact situation."]
    ["Reaper" [[:reaper :_explain (scoot -6)] [:sombra :_neutral2 (scoot -14)] [:symmetra :_neutral (scoot 4)]]
     "Plus, you couldn’t do that.  You know as much as I do that you and I couldn’t live without a steady IV drip of cheaply produced televised entertainment."]
    ["Sombra" [[:reaper :_neutral (scoot -6)] [:sombra :_explainHand (scoot -14)] [:symmetra :_neutral (scoot 4)]]
     "I understand on the deepest possible level, skeleton buddy. It’s why I’ve watched every episode of Diners, Drive-Ins and Dives. I even livetweet reruns."]
    ["Reaper" [[:reaper :_point-up (scoot -6)] [:sombra :_neutral (scoot -14)] [:symmetra :_neutral (scoot 4)]]
     "Remember when he officiated all those gay weddings? Guy Fieri is a pillar of the gay-trash community."]
    ["Symmetra" [[:reaper :_neutral (scoot -6)] [:sombra :_neutral (scoot -14)] [:symmetra :_skeptical (scoot 4)]]
     "I, um, assumed we’d be talking strategy."]
    ["Reaper" [[:reaper :_explain (scoot -6)] [:sombra :_neutral (scoot -14)] [:symmetra :_neutral (scoot 4)]]
     "I mean there’s only one viable strategy with you and Orisa on our team. Get on the payload, fortify the hell out of it, and ride it all the way to the end.  We’re about as mobile as a coffin."]
    ["Sombra" [[:reaper :_neutral (scoot -6)] [:sombra :_self (scoot -14)] [:symmetra :_neutral (scoot 4)]]
     "I would normally not stay on the payload, but I asked if we could escort an extra special guest inside the limo this time instead of the usual hollywood exec bot. Someone who is a HUGE fan of Overwatch."]
    :-> [:spawn :sombra :option 0]]

   [:spawn :sombra :option 0]
   [:miranda/option
    "Symmetra" [[:reaper :_neutral (scoot -6)] [:sombra :_neutral (scoot -14)] [:symmetra :_neutral (scoot 4)]]
    ["Ah, did you fulfill a young fan’s dream by giving them a ride in that indestructible vehicle?"
     (constantly true)
     [:-> [:spawn :sombra 1]]]
    ["An important dignitary, I presume?"
     (constantly true)
     [:-> [:spawn :sombra 1]]]]

   [:spawn :sombra 1]
   [:miranda/dialogue
    ["Sombra" [[:reaper :_neutral (scoot -6)] [:sombra :_explainHand(scoot -14)] [:symmetra :_neutral (scoot 4)]]
     "It’s Guy Fieri. We’re kinda. Filming an episode of Neodiners, Neodrive-Ins and Neodives. He will be tearing into a 4 pound hamburger while we fight."]
    ["Symmetra" [[:reaper :_neutral (scoot -6)] [:sombra :_neutral (scoot -14)] [:symmetra :_bewildered (scoot 4)]] "Four pounds?"]
    ["Sombra" [[:reaper :_neutral (scoot -6)] [:sombra :_nostalgic (scoot -14)] [:symmetra :_neutral (scoot 4)]]
     "Oh, my, god, I once saw a guy on the internet literally go into a meat market and..."]
    ["Reaper" [[:reaper :_extra (scoot -6)] [:sombra :_nostalgic (scoot -14)] [:symmetra :_awkward (scoot 4)]]
     "WHY. NO. OH GOD. I CANNOT LISTEN TO THIS STORY AGAIN."]
    ["Sombra" [[:reaper :_neutral (scoot -6)] [:sombra :_whisper (scoot -14)] [:symmetra :_phoneCheck (scoot 4)]]
     "Pssst, I have hacked your phone number because I am a hacker. The link. I sent it to you. And also cute pictures of me."]
    ["Sombra" [[:reaper :_neutral (scoot -6)] [:sombra :_leanin (scoot -14)] [:symmetra :_phoneCheckTerrified (scoot 4)]]
     "You’re welcome."]
    ["Reaper" [[:reaper :_extra (scoot -6)] [:sombra :_neutral (scoot -14)] [:symmetra :_neutral (scoot 4)]]
     "FOR THE LOVE OF GOD DON’T CLICK ON ANYTHING SHE SENDS YOU. AND DON’T MAKE CONTACT WITH GUY FIERI. HE NEEDS TO FOCUS."]
    ["Reaper" [[:reaper :_point (scoot -6)] [:sombra :_neutral (scoot -14)] [:symmetra :_WTF (scoot 4)]]
     "YOU, HARD LIGHT REAL ESTATE GIRL."]
    ["Symmetra" [[:reaper :_neutral (scoot -6)] [:sombra :_neutral (scoot -14)] [:symmetra :_explainWTF (scoot 4)]]
     "Excuse you?"]
    ["Reaper" [[:reaper :_explain (scoot -6)] [:sombra :_neutral (scoot -14)] [:symmetra :_neutral (scoot 4)]]
     "JUST SIT ON THE PAYLOAD THIS TIME. VICTORY IS GUARAN-FUCKING-TEED."]
    :-> [:spawn :sombra :choice]]

   [:spawn :sombra :choice]
   [:miranda/text-option
    "What will you do?"
    ["Go with the edge-squad" (constantly true)
     [:-> [:spawn :sombra :yes]]]
    ["Converse with your other teammates" (constantly true)
     [:-> [:spawn :sombra :no]]]]

   [:spawn :sombra :yes]
   (concat
    [:miranda/dialogue
     ["Symmetra" [[:reaper :_neutral (scoot -6)] [:sombra :_smile (scoot -14)] [:symmetra :_explain (scoot 4)]]
      "Alright. Let us do this."]
     ["Symmetra" [[:reaper :_neutral (scoot -6)] [:sombra :_smile (scoot -14)] [:symmetra :_confused (scoot 4)]]
      "What is that noise I hear?"]
     ["Sombra" [[:reaper :_neutral (scoot -6)] [:sombra :_nostalgic (scoot -14)] [:symmetra :_awkward (scoot 4)]]
      "It’s the sound of a high speed intake of hamburger, mi amor. Don’t distract Guy Fieri, he is doing the lord’s work."]]
    (inc-transition [:-> [:objective :sombra :cutscene]] :points/payload :points/sombra))

   [:spawn :sombra :no]
   [:miranda/dialogue
    ["Symmetra" [[:reaper :_neutral (scoot -6)] [:sombra :_neutral (scoot -14)] [:symmetra :_no (scoot 4)]]
     "I do not know if I want to be anywhere near this fast food spectacle of a payload."]
    ["Sombra" [[:reaper :_neutral (scoot -6)] [:sombra :_shrug (scoot -14)] [:symmetra :_neutral (scoot 4)]]
     "I am not angry, just disappointed. Let me know if you change your mind."]
    :-> [:spawn :choice]]

   [:objective :sombra :cutscene]
   [:miranda/narration
    "With a well co-ordinated push, you manage to capture the first point with relative ease. After wiping the enemy team, Orisa and Lucio pushed ahead leaving you, Sombra, and Reaper to set yourselves up on top of the payload to prepare for the next phase of the attack. "
    :-> [:objective :sombra 2]]})
