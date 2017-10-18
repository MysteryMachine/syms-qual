(ns syms-qual.data.scenes.lijang.tracer)

(def start-date
  [:transition :miranda/mutation->basic
   [[:-> [:anubis :pharah :confirm]]
    (fn []
      ;;TODO: mutate state to indicate date
      )]])

(def data
  {[:lijang :tracer 0]
   [:miranda/text-option
    "Doomfist and Tracer seem to be having a heart to heart about some rather intimate matters, do you listen in?"
    ["Yes" (constantly true) [:lijang :tracer 1]]
    ["No" (constantly true) [:lijang :tracer :transition :b]]]

   [:lijang :tracer 1]
   [:miranda/dialogue
    ["Doomfist" [] "Oh, my god it was hilarious, Lena. She had this whole routine planned out with roses and dancing and a tuxedo with a top hat. You’re lucky I convinced her not to break onto your balcony."]
    ["Tracer" [] "I just don’t understand how you can be so nonchalant about our breakup, Akande. Poor Amelie is crushed. Don’t you care about her at all?"]
    ["Doomfist" [] "Lena, what you had with Amelie was a fling. You and Emily had a rough patch, you were in a weird emotional state, and then this bizarre blue woman snipes a robot. Of course you went to her for emotional support.. Hate sex is a powerful intoxicant, this is why I swear by it."]
    ["Tracer" [] "Because there’s a lot of conflict?"]
    ["Doomfist" [] "Yes. There is nothing like the thrill of intentionally underperforming, and having your partner go, “Akande, is that it? When I signed up to bang a supervillain, I thought he would last for at least a couple of minutes.” Then we argue for 20 minutes and kick them out, preferably after smashing a glass or other object that breaks loudly before doing so."]
    ["Tracer" [] "Wait is that why Amelie…"]
    ["Doomfist" [] "Yes, Lena. That is why."]
    ["Tracer" [] "I liked that plate..."]
    ["Doomfist" [] "I bet she even had a smoke afterwards and kicked you out. “Sacre bleu, Lena,” she would say, “I am le tired.”"]
    ["Tracer" [] "But see, that’s why when I broke it off…"]
    ["Doomfist" [] "You expected her not to care? Lena. When you left, she suddenly had an internal struggle, and lost. Not caring was supposed to be her thing, and now she cares too much. She is broken. Now she is tilted on the battlefield and useless to her team."]
    ["Tracer" [] "I mean I dunno, even before she would just camp in one spot and not get much done. I can’t really tell the difference..."]
    ["Tracer" [] "Wait, so you feel this conflicted about every person you have a bizarre fling with?"]
    ["Doomfist" [] "Yes, Lena. That is the whole point of the fling. My character is tested. My resolve surpasses the test. And I grow."]
    ["Tracer" [] "Can’t you, just, like, hit some punching bags? Spar with Reaper or something? Get it out of your system?"]
    ["Doomfist" [] "Reaper is locked in his own dance of conflict with Jack, Lena. He has his own demons to face."]
    ["Tracer" [] "Akande. They minigolf together every other week."]
    ["Doomfist" [] "It’s very competitive. They are banned from at least a dozen mini golf courses for fist fighting after one of them loses. There are only three courses left in the state of Indiana on which they are allowed and it takes them hours to get to any of them, the long car ride, of course, exacerbating their conflict and increasing the likeliness of further fist fights. It’s very beautiful."]
    :-> [:lijang :tracer :transition :a]]

   [:lijang :tracer :transition :a]
   [:miranda/narration
    "You decide this is as good a time as any to hop into the conversation."
    :-> [:lijang :tracer 2]]

   [:lijang :tracer :transition]
   [:miranda/narration
    "You mill about the ORCA for a bit longer and they seem to be in lighter spirits when you return, and you decide that now is a good time to strike a conversation."
    :-> [:lijang :tracer 2]]

   [:lijang :tracer 2]
   [:miranda/dialogue
    ["Doomfist" [] "..."]
    ["Doomfist" [] "So you’re the so called “painful carwash girl” that Reaper mentioned."]
    :-> [:lijang :tracer :option]]

   [:lijang :tracer :option]
   [:miranda/option
    "Symmetra" []
    "My hard light technology is not a car wash."
    "I will suggest this alternative usage to the Vishkar Marketing Department."]

   [:lijang :tracer :option 0]
   [:miranda/dialogue
    ["Tracer" [] "I mean, have you seen it though? Jets of blue stuff?"]
    ["Symmetra" [] "Look, I understand the visual metaphor, but please do not make light of the technology."]
    ["Tracer" [] "Look, most of us Overwatch agents are good at the shooty shooty, we can’t deal with techno mumbo jumbo. Torbjorn is one of our most technically gifted agents, and all he does is assemble IKEA turrets."]
    :-> [:lijang :tracer 3]]

   [:lijang :tracer :option 1]
   [:miranda/dialogue
    ["Symmetra" [] "I see it now, the Vishkar Painful Car Wash. A successful venture to be sure."]
    ["Tracer" [] "Cleans those hard to reach internal organs right up!"]
    ["Doomfist" [] "This idea is good. Unironically. Do you think Vishkar would use IKEA as a distributer? The build-it-yourself nature of this product fits right in line with IKEA’s image."]
    ["Symmetra" [] "IKEA sells weapons?"]
    :-> [:lijang :tracer 3]]

   [:lijang :tracer 3]
   [:miranda/dialogue
    ["Doomfist" [] "Indeed. I, personally, am quite glad they have turned from affordable furnishings to affordable military grade weaponry."]
    ["Tracer" [] "How do they keep the prices that low?"]
    ["Doomfist" [] "Ah, yes, it is a common misconception that they save on money by having you assemble their products by hand. Instead, they make a killing by luring you to their cafeteria."]
    ["Tracer" [] "It makes sense! I never think about lingonberries until I’m at an IKEA."]
    ["Doomfist" [] "Of course you don’t. So, by feeding you large quantities of Swedish food at an affordable price, they condition your mind to perceive their stock of “assemble by yourself, weapons grade turrets” as affordable military solutions."]
    ["Tracer" [] "Yeah! I get all my bombs from there."]
    ["Doomfist" [] "Many an insurgent group has been aided by IKEA."]
    ["Tracer" [] "Wait a minute here."]
    ["Doomfist" [] "Yes?"]
    ["Tracer" [] "By any chance, did Talon acquire IKEA? They were bought out by mysterious sources."]
    ["Doomfist" [] "If I told you, I’d have to kill you. Never ask me this question again. Talon has no interest in facilitating conflict by supplying cheap arms and meatballs to paramilitary groups across the world. Talon’s participation in the Overwatch program is in no way influenced by the fact that Overwatch is a loyal, and valued patron of IKEA incorporated."]
    ["Doomfist" [] "Incidentally, Sombra and I both bought our stylish combat vibrams from IKEA, at a low, low price. Once we assembled the shoes ourselves, they were a great addition to our combat toolkit. Why not visit the IKEA ministore in the IKEA™ ORCA today?"]
    ["Symmetra" [] "This explains why every meal so far has been catered by IKEA."]
    ["Doomfist" [] "No it does not. Do not make me tell you twice. Look, you are playing with fire, I’m warning you, if you attempt to confront me about this again or we will have an altercation."]
    :-> [:lijang :tracer :choice]]

   [:lijang :tracer :choice]
   [:miranda/text-option
    "What will you do?"
    ["If Doomfist says we will have problems, I suppose we will have problems." (constantly true) start-date]
    ["Converse with your other teammates" (constantly true)
     [:lijang :tracer :no]]]

   [:lijang :tracer :yes]
   [:miranda/dialogue
    ["Symmetra" [] "I do not understand why I am doing this, it is almost as if some uncaring deity is driving me towards a humorous conclusion. Expect to see my face on the battlefield, Doomfist."]
    ["Doomfist" [] "So be it."]
    :-> [:lijang :tracer :cutscene]]

   [:lijang :tracer :no]
   [:miranda/dialogue
    ["Symmetra" [] "I will stay out of your way, I suppose."]
    ["Doomfist" [] "Return to me when you are ready for meatballs and lingonberry sauce."]
    :-> [:lijang :choice]]

   [:lijang :tracer :cutscene]
   [:miranda/narration
    "You attempt to literally fistfight Doomfist, for reasons unknown to you. After realizing that special Overwatch technology which prevents friendly fire has completely foiled your plan, you decide to resolve the newly created beef with a round of rock-paper-scissors. Knowing Doomfist’s fist was a tool for punching, you anticipated his rock, and threw paper. The conditions of defeat? He reveals Talon’s dastardly plan to use IKEA to distribute weapons to paramilitaries across the world. Impressed by your aggressive representation of the Vishkar corporation, he offers to strike up a lucrative business deal with Vishkar. Doomfist and you leave immediately, taking the IKEA™ ORCA, stranding your fellow agents. The Vishkar-IKEA partnership was indeed very lucrative to your companies. It was a weird, unsteady friendship, You begin to wonder if your choice to fist fight a man with a literal power glove was perhaps not the best of ideas. Yes, this is kinda a Game Over. But maybe success in business was your interest all along?"
    :-> [] ;; Transition to game over screen
    ]})
