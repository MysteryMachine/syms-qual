(ns syms-qual.data.scenes.lijang.tracer
  (:require [carmen.util :as anim :refer [scoot]]
            [syms-qual.util :as util :refer [inc-transition]]))

(def data
  {[:spawn :tracer 0]
   [:miranda/text-option
    "Doomfist and Tracer seem to be having a heart to heart about some rather intimate matters, do you listen in?"
    ["Yes" (constantly true) [:-> [:spawn :tracer 1]]]
    ["No" (constantly true) [:-> [:spawn :tracer :transition :b]]]]

   [:spawn :tracer 1]
   [:miranda/dialogue
    ["Doomfist" [[:doomfist_tracer :_doomfistLaugh]]
     "Oh, my god it was hilarious, Lena. She had this whole routine planned out with roses and dancing and a tuxedo with a top hat. You’re lucky I convinced her not to break onto your balcony."]
    ["Tracer" [[:doomfist_tracer :_tracerExplainUpset]]
     "I just don’t understand how you can be so nonchalant about our breakup, Akande. Poor Amelie is crushed. Don’t you care about her at all?"]
    ["Doomfist" [[:doomfist_tracer :_doomfistExplain]]
     "Lena, what you had with Amelie was a fling. You and Emily had a rough patch, you were in a weird emotional state, and then this bizarre blue woman snipes a robot. Of course you went to her for emotional support."]
    ["Tracer" [[:doomfist_tracer :_tracerConfusedLeft]]
     "Is this that weird hate-sex thing you Talon people keep going on about?"]
    ["Doomfist" [[:doomfist_tracer :_doomfistExplain]]
     "Yes. There is nothing like the thrill of intentionally underperforming, and having your partner go, \"Akande, is that it?\""]
    ["Doomfist" [[:doomfist_tracer :_doomfistPointUp]]
     "\"When I signed up to bang a supervillain, I thought he would last for at least a couple of minutes.\” Then we argue for 20 minutes and kick them out, preferably after smashing a glass or other object that breaks loudly before doing so."]
    ["Tracer" [[:doomfist_tracer :_tracerBewildered]]
     "Wait is that why Amelie…"]
    ["Doomfist" [[:doomfist_tracer :_doomfistArmsCross]]
     "Yes, Lena. That is why."]
    ["Tracer" [[:doomfist_tracer :_tracerExplainUpset]]
     "That was my mother's prized china."]
    ["Doomfist" [[:doomfist_tracer :_doomfistPointUp]]
     "I bet she even had a smoke afterwards and kicked you out. “Sacre bleu, Lena,” she would say, “I am le tired.”"]
    ["Tracer" [[:doomfist_tracer :_tracerExplainUpset]]
     "But see, that’s why when I broke it off…"]
    ["Doomfist" [[:doomfist_tracer :_doomfistExplain]]
     "You expected her not to care? Lena. When you left, she suddenly had an internal struggle, and lost. Not caring was supposed to be her thing, and now she cares too much. She is broken. Now she is tilted on the battlefield and useless to her team."]
    ["Tracer" [[:doomfist_tracer :_tracerLookUp]] "I mean I dunno, even before she would just camp in one spot and not get much done. I can’t really tell the difference..."]
    ["Tracer" [[:doomfist_tracer :_tracerExplainUpset]] "Wait, so you feel this conflicted about every person you have a bizarre fling with?"]
    ["Doomfist" [[:doomfist_tracer :_doomfistPointUpSmile]] "Yes, Lena. That is the whole point of the fling. My character is tested. My resolve surpasses the test. And I grow."]
    ["Tracer" [[:doomfist_tracer :_tracerShrug]] "Can’t you, just, like, hit some punching bags? Spar with Reaper or something? Get it out of your system?"]
    ["Doomfist" [[:doomfist_tracer :_doomfistPointUpEyes]] "Reaper is locked in his own dance of conflict with Jack, Lena. He has his own demons to face."]
    ["Tracer" [[:doomfist_tracer :_tracerWTF]]
     "Akande. They minigolf together every other week."]
    ["Doomfist" [[:doomfist_tracer :_doomfistExplain]]
     "It’s very competitive. They are banned from at least a dozen mini golf courses for fist fighting after one of them loses."]
    ["Doomfist" [[:doomfist_tracer :_doomfistPointUp]]
     "There are only three courses left in the state of Indiana on which they are allowed and it takes them hours to get to any of them, the long car ride, of course, exacerbating their conflict and increasing the likeliness of further fist fights. It’s very beautiful."]
    :-> [:spawn :tracer :transition :a]]

   [:spawn :tracer :transition :a]
   [:miranda/narration
    "You decide this is as good a time as any to hop into the conversation."
    :-> [:spawn :tracer 2]]

   [:spawn :tracer :transition :b]
   [:miranda/narration
    "You mill about the ORCA for a bit longer and they seem to be in lighter spirits when you return, and you decide that now is a good time to strike a conversation."
    :-> [:spawn :tracer 2]]

   [:spawn :tracer 2]
   [:miranda/dialogue
    ["Symmetra" [[:doomfist_tracer :_doomfistGlare (scoot 0 -19 0.5)] [:symmetra :_helloWarm (scoot 89 9 1)]]
     "Greetings, teammates."]
    ["Doomfist" [[:doomfist_tracer :_doomfistGlare (scoot -19)] [:symmetra :_helloWarm (scoot 9)]]
     "..."]
    ["Doomfist" [[:doomfist_tracer :_doomfistExplainConcerned (scoot -19)] [:symmetra :_neutral (scoot 9)]]
     "So you’re the so called \"painful carwash girl\" that Reaper mentioned."]
    :-> [:spawn :tracer :option]]

   [:spawn :tracer :option]
   [:miranda/option
    "Symmetra" [[:doomfist_tracer :_neutralRight (scoot -19)] [:symmetra :_neutral (scoot 9)]]
    "My hard light technology is not a car wash."
    "I will suggest this alternative usage to the Vishkar Marketing Department."]

   [:spawn :tracer :option 0]
   [:miranda/dialogue
    ["Tracer" [[:doomfist_tracer :_tracerExplainRight (scoot -19)] [:symmetra :_neutral (scoot 9)]]
     "I mean, have you seen it though? Jets of blue stuff?"]
    ["Symmetra" [[:doomfist_tracer :_neutralRight (scoot -19)] [:symmetra :_explain (scoot 9)]]
     "Look, I understand the visual metaphor, but please do not make light of the technology."]
    ["Tracer" [[:doomfist_tracer :_tracerFingerGuns (scoot -19)] [:symmetra :_neutral (scoot 9)]]
     "Look, most of us Overwatch agents are good at the shooty shooty, we can’t deal with techno mumbo jumbo. Torbjorn is one of our most technically gifted agents, and all he does is assemble IKEA™ turrets."]
    :-> [:spawn :tracer 3]]

   [:spawn :tracer :option 1]
   [:miranda/dialogue
    ["Symmetra" [[:doomfist_tracer :_neutralRight (scoot -19)] [:symmetra :_eyeRoll (scoot 9)]]
     "I see it now, the Vishkar Painful Car Wash. A successful venture to be sure."]
    ["Tracer" [[:doomfist_tracer :_tracerFingerGuns (scoot -19)] [:symmetra :_neutral (scoot 9)]]
     "Cleans those hard to reach internal organs right up!"]
    ["Doomfist" [[:doomfist_tracer :_doomfistExplainRight (scoot -19)] [:symmetra :_neutral (scoot 9)]]
     "This idea is good. Unironically. Do you think Vishkar would use IKEA™ as a distributer? The build-it-yourself nature of this product fits right in line with IKEA™’s image."]
    ["Symmetra" [[:doomfist_tracer :_neutralRight (scoot -19)] [:symmetra :_confused (scoot 9)]]
     "IKEA™ sells weapons?"]
    :-> [:spawn :tracer 3]]

   [:spawn :tracer 3]
   [:miranda/dialogue
    ["Doomfist" [[:doomfist_tracer :_doomfistArmsCrossSmirk (scoot -19)] [:symmetra :_neutral (scoot 9)]]
     "Indeed. I personally am quite glad they have turned from affordable furnishings to affordable military grade weaponry."]
    ["Tracer" [[:doomfist_tracer :_tracerConfusedLeftSmirk (scoot -19)] [:symmetra :_neutral (scoot 9)]]
     "How do they keep the prices that low?"]
    ["Doomfist" [[:doomfist_tracer :_doomfistPointUp (scoot -19)] [:symmetra :_neutral (scoot 9)]]
     "Ah, yes, it is a common misconception that they save on money by having you assemble their products by hand. Instead, they make a killing by luring you to their cafeteria."]
    ["Tracer" [[:doomfist_tracer :_tracerBewildered (scoot -19)] [:symmetra :_neutral (scoot 9)]]
     "It makes sense! I never think about lingonberries until I’m at an IKEA™."]
    ["Doomfist" [[:doomfist_tracer :_doomfistArmsCross (scoot -19)] [:symmetra :_neutral (scoot 9)]]
     "Of course you don’t. So, by feeding you large quantities of Swedish food at an affordable price, they condition your mind to perceive their stock of \"assemble by yourself, weapons grade turrets\" as affordable military solutions."]
    ["Tracer" [[:doomfist_tracer :_tracerBewildered (scoot -19)] [:symmetra :_neutral (scoot 9)]]
     "Yeah! I get all my bombs from there."]
    ["Doomfist" [[:doomfist_tracer :_doomfistPointUp (scoot -19)] [:symmetra :_neutral (scoot 9)]]
     "Many an insurgent group has been aided by IKEA™."]
    ["Tracer" [[:doomfist_tracer :_tracerGlareUp (scoot -19)] [:symmetra :_neutral (scoot 9)]]
     "Wait a minute here."]
    ["Doomfist" [[:doomfist_tracer :_doomfistGlareUp (scoot -19)] [:symmetra :_neutral (scoot 9)]]
     "Yes?"]
    ["Tracer" [[:doomfist_tracer :_tracerGlareUp (scoot -19)] [:symmetra :_neutral (scoot 9)]]
     "By any chance, did Talon acquire IKEA™? They were bought out by mysterious sources."]
    ["Doomfist" [[:doomfist_tracer :_doomfistPointUpGlare (scoot -19)] [:symmetra :_neutral (scoot 9)]]
     "If I told you, I’d have to kill you. Never ask me this question again. Talon has no interest in facilitating conflict by supplying cheap arms and meatballs to paramilitary groups across the world."]
    ["Doomfist" [[:doomfist_tracer :_doomfistArmsCrossGlare (scoot -19)] [:symmetra :_neutral (scoot 9)]]
     "Talon’s participation in the Overwatch program is in no way influenced by the fact that Overwatch is a loyal, and valued patron of IKEA™ incorporated."]
    ["Doomfist" [[:doomfist_tracer :_doomfistVibrams (scoot -19)] [:symmetra :_WTF (scoot 9)]]
     "Incidentally, Sombra and I both bought our stylish combat vibrams from IKEA™, at a low, low price. Once we assembled the shoes ourselves, they were a great addition to our combat toolkit. Why not visit the IKEA™ ministore in the IKEA™ ORCA today?"]
    ["Symmetra" [[:doomfist_tracer :_doomfistGlare (scoot -19)] [:symmetra :_explainWTF (scoot 9)]]
     "This explains why every meal so far has been catered by IKEA™."]
    ["Doomfist" [[:doomfist_tracer :_doomfistGlareUp (scoot -19)] [:symmetra :_WTF (scoot 9)]]
     "No it does not. Do not make me tell you twice. Look, you are playing with fire, I’m warning you. If you attempt to confront me about this again, we will have an altercation."]
    :-> [:spawn :tracer :choice]]

   [:spawn :tracer :choice]
   [:miranda/text-option
    "What will you do?"
    ["Street brawl. Right now." (constantly true)
     [:-> [:spawn :tracer :yes]]]
    ["Converse with your other teammates" (constantly true)
     [:-> [:spawn :tracer :no]]]]

   [:spawn :tracer :yes]
   [:miranda/dialogue
    ["Symmetra" [[:doomfist_tracer :_doomfistGlare (scoot -19)] [:symmetra :_eyeRoll (scoot 9)]]
     "I do not understand why I am doing this, it is almost as if some uncaring deity is driving me towards a humorous conclusion. Expect to see my face on the battlefield, Doomfist."]
    ["Doomfist" [[:doomfist_tracer :_doomfistGlareUp (scoot -19)] [:symmetra :_WTF (scoot 9)]]
     "So be it."]
    :-> [:doomfist]]

   [:spawn :tracer :no]
   [:miranda/dialogue
    ["Symmetra" [[:doomfist_tracer :_neutralRight (scoot -19)] [:symmetra :_explainWTF (scoot 9)]]
     "I will stay out of your way, I suppose."]
    ["Doomfist" [[:doomfist_tracer :_doomfistGlareUp (scoot -19)] [:symmetra :_WTF (scoot 9)]]
     "Return to me when you are ready for meatballs and lingonberry sauce."]
    :-> [:spawn :choice]]

   [:doomfist]
   [:miranda/characters
    [[]]
    :-> [:doomfist :text]]

   [:doomfist :text]
   [:miranda/narration
    "You attempt to literally fistfight Doomfist, for reasons unknown to you. After realizing that special Overwatch technology which prevents friendly fire has completely foiled your plan, you decide to resolve the newly created beef with a round of rock-paper-scissors. Knowing Doomfist’s fist was a tool for punching, you anticipated his rock, and threw paper. The conditions of defeat?"
    "You to get to use his power gauntlet on weekends for smashing stuff. While you generally prefer tackling problems through poise, beauty, and elegance, you have, on occassion, been known to smash. You high five yourself with Doomfist's power gauntlet before noticing the charred bodies of your teammates. It appears you lost the match."
    :=> [:eichenwalde [:spawn :intro] 0]]})
