(ns syms-qual.data.scenes.kings-row.date-2
  (:require [carmen.util :as anim :refer [scoot]]))

(def data
  {[:street :junkrat 4]
   [:miranda/dialogue
    ["Symmetra" [[:junkrat :_neckHand (scoot -80 -5 1)] [:symmetra :_dissappointed (scoot 75 0 1)]]
     "Looks like they did a number on your machine."]
    ["Junkrat" [[:junkrat :_neckHand (scoot -5)] [:symmetra :_dissappointed (scoot 0)]]
     "…"]
    ["Symmetra" [[:junkrat :_neckHand (scoot -5)] [:symmetra :_explainUncomfortable (scoot 0)]]
     "It performed quite commendably for a pile of scrap."]
    ["Junkrat" [[:junkrat :_sigh (scoot -5)] [:symmetra :_dissappointed (scoot 0)]]
     "Don’t insult me, love."]
    :-> [:street :junkrat :option 1]]

   [:street :junkrat :option 1]
   [:miranda/option
    "Symmetra" [[:junkrat :_sigh (scoot -5)] [:symmetra :_neutral (scoot 0)]]
    "Insult you? I just paid you a compliment."
    "Oh. I’m sorry."]

   [:street :junkrat :option 1 0]
   [:miranda/dialogue
    ["Junkrat" [[:junkrat :_armsUp (scoot -5)] [:symmetra :_confused (scoot 0)]]
     "You call that a compliment? That dang machine was an MVP, all by itself. That’s not just commendable, that’s splendiferous! European extreme, even!"]
    ["Symmetra" [[:junkrat :_ballNeutral (scoot -5)] [:symmetra :_skeptical (scoot 0)]]
     "European extreme?"]
    ["Junkrat" [[:junkrat :_ballExplainConcerned (scoot -5)] [:symmetra :_skeptical (scoot 0)]]
     "Oy! Those dang Europeans are so competent at video games that they had to invent a whole new difficulty for them. I learned this from D.Va’s video game history class on Vimeo. This machine matches the sort of video gaming prowess one could expect from a European circa 2005."]
    ["Symmetra" [[:junkrat :_ballNeutral (scoot -5)] [:symmetra :_explainUncomfortable (scoot 0)]]
     "I do not follow, but I am happy for you."]
    ["Junkrat" [[:junkrat :_sigh (scoot -5)] [:symmetra :_neutral (scoot 0)]]
     "Thank you!"]
    ["Junkrat" [[:junkrat :_neckHand (scoot -5)] [:symmetra :_neutral (scoot 0)]]
     "..."]
    ["Junkrat" [[:junkrat :_handsHips (scoot -5)] [:symmetra :_confused (scoot 0)]]
     "You smell smoke?"]
    :-> [:street :junkrat 5]]

   [:street :junkrat :option 1 1]
   [:miranda/dialogue
    ["Junkrat" [[:junkrat :_ballPoint (scoot -5)] [:symmetra :_bewildered (scoot 0)]]
     "Oi! You better be! This machine was a lot more than commendable. I’m so proud of it! I’m glowing! Like a mother!"]
    ["Symmetra" [[:junkrat :_ballNeutral (scoot -5)] [:symmetra :_confused (scoot 0)]]
     "Are you sure you are not seeing the light from the embers in your hair?"]
    ["Junkrat" [[:junkrat :_ballPointUp (scoot -5)] [:symmetra :_confused (scoot 0)]]
     "That I am! It tingles, in an unpleasant way actually."]
    :-> [:street :junkrat 5]]

   [:street :junkrat 5]
   [:miranda/dialogue
    ["Symmetra" [[:junkrat :_ballNeutral (scoot -5)] [:symmetra :_explainWTF (scoot 0)]]
     "You’re going to lose even more hair if you let it burn like that. Here, let me help you."]
    ["Junkrat" [[:symmetra :_hairFire (scoot 0)]]
     "Ehehe."]
    ["Symmetra" [[:symmetra :_hairFire2 (scoot 0)]]
     "What are you giggling at?"]
    ["Junkrat" [[:symmetra :_hairFireBlush (scoot 0)]]
     "Nothing! Nothing!"]
    :-> [:street :junkrat :option 2]]

   [:street :junkrat :option 2]
   [:miranda/option
    "Symmetra" [[:junkrat :_ballNeutralNoFire (scoot -13)] [:symmetra :_dirtyHands (scoot 3)]]
    "I am not comfortable with your level of enjoyment."
    "Oh gods, there are literal ashes in your hair. I feel so unclean."]

   [:street :junkrat :option 2 0]
   [:miranda/dialogue
    ["Junkrat" [[:junkrat :_wetWipe (scoot -13)] [:symmetra :_dirtyHands (scoot 3)]]
     "Ehem, I, um, just got ahead of myself. It’s just... when Roadie puts out my fires, I usually get a head rub or two."]
    ["Junkrat" [[:junkrat :_coughNoFire (scoot -13)] [:symmetra :_handWipe (scoot 3)]]
     "This is the part where Roadie would chime in with a stoic:"]
    ["Junkrat" [[:junkrat :_hogimpression (scoot -13)] [:symmetra :_smile (scoot 3)]]
     "The boy likes head rubs. They’re nice."]
    :-> [:street :junkrat 6]]

   [:street :junkrat :option 2 1]
   [:miranda/dialogue
    ["Junkrat" [[:junkrat :_ballExplainNoFire (scoot -13)] [:symmetra :_dirtyHands (scoot 3)]]
     "Hey! Ashes are fertile grounds, okay? In fact, I know this one guy on Youtube who, like, in his spare time just builds dirt huts and things? He makes ashes out of stuff to fertilize his perfect garden of potatoes."]
    ["Symmetra" [[:junkrat :_ballNeutralNoFire (scoot -13)] [:symmetra :_dirtyHandsLeft (scoot 3)]]
     "I see."]
    ["Junkrat" [[:junkrat :_wristNoFire (scoot -13)] [:symmetra :_dirtyHands (scoot 3)]]
     "Like, you see his skill and you think to yourself, oh, this wanker must definitely be an acca having maccas in his uni office, going to the field to research, but no, he’s just an amatuer paleolithic tribesman or something."]
    ["Symmetra" [[:junkrat :_ballNeutralNoFire (scoot -13)] [:symmetra :_dirtyHandsLeft (scoot 3)]]
     "I’m sure it’s very impressive."]
    ["Junkrat" [[:junkrat :_wetWipe (scoot -13)] [:symmetra :_dirtyHands (scoot 3)]]
     "But sorry about your hands, love, it’s hard being an explosives expert and stayin’ clean. Here, use this. "]
    ["Symmetra" [[:junkrat :_ballNeutralNoFire (scoot -13)] [:symmetra :_handWipe (scoot 3)]]
     "I am surprised you carry wet naps."]
    ["Junkrat" [[:junkrat :_ballIntroNoFire (scoot -13)] [:symmetra :_handWipe (scoot 3)]]
     "What, you think I’m the type of bloke to take an actual bath?"]
    ["Symmetra" [[:junkrat :_ballNeutralNoFire (scoot -13)] [:symmetra :_frustrated (scoot 3)]]
     "Ugh, I should have known better than to inquire further."]
    ["Junkrat" [[:junkrat :_fibbinNoFire (scoot -13)] [:symmetra :_neutral (scoot 3)]]
     "I might make an exception for tonight though. "]
    ["Symmetra" [[:junkrat :_ballNeutralNoFire (scoot -13)] [:symmetra :_confused (scoot 3)]]
     "Oh? Why is that?"]
    ["Junkrat" [[:junkrat :_ballExplainNoFire (scoot -13)] [:symmetra :_awkward (scoot 3)]]
     "Gotta start cleaning up for the trip to Lijiang in a couple weeks. D.Va’s invited me to this arcade that has strict no being covered in flammable liquids policy and it takes me a while for me to completely remove them from my body."]
    ["Junkrat" [[:junkrat :_fibbinNoFire (scoot -13)] [:symmetra :_1000Mile (scoot 3)]]
     "Should see if I can get in on some of those primo bubble baths Roadie’s been taking these days."]
    :-> [:street :junkrat 6]]

   [:street :junkrat 6]
   [:miranda/dialogue
    ["Symmetra" [[:junkrat :_ballNeutralNoFire (scoot -13)] [:symmetra :_sass (scoot 3)]]
     "You and Roadhog are quite the pair."]
    ["Junkrat" [[:junkrat :_ballPointUpNoFire (scoot -13)] [:symmetra :_smile (scoot 3)]]
     "Some say it ain’t manly for a man to enjoy being rocked by another man, a humongous terrifying man, but Roadie’s been keeping away the nightmares for years now, that guy has."]
    ["Symmetra" [[:junkrat :_ballNeutralNoFire (scoot -13)] [:symmetra :_explainUncomfortable (scoot 3)]]
     "He rocks you to sleep?"]
    ["Junkrat" [[:junkrat :_ballExplainNoFire (scoot -13)] [:symmetra :_awkward (scoot 3)]] "The man is a living hammock. Hammocks are important because they keep you off the ground where scorpions and spiders live."]
    ["Junkrat" [[:junkrat :_ballConfusedNoFire (scoot -13)] [:symmetra :_awkward (scoot 3)]]
     "Though, now that I think about it, there’s some irony in that, cause Roadie’s very afraid of spiders. I’m usually the one busting out the old mason jar and putting them back into the wild."]
    ["Symmetra" [[:junkrat :_ballNeutralNoFire (scoot -13)] [:symmetra :_explain (scoot 3)]]
     "Is this a common occurrance? Is there an infestation of insects in your home?"]
    ["Junkrat" [[:junkrat :_handsHipsRightNoFire (scoot -13)] [:symmetra :_awkward (scoot 3)]]
     "Oy! I take offense. Roadie and I own a very nice trailer. I would say it has, at best, a small but rugged scouting camp of spiders."]
    ["Symmetra" [[:junkrat :_ballNeutralNoFire (scoot -13)] [:symmetra :_skeptical (scoot 3)]]
     "With the amount of filth on you, I am not surprised your home does not have much in the way of running water."]
    ["Junkrat" [[:junkrat :_ballWinkNoFire (scoot -13)] [:symmetra :_skeptical (scoot 3)]]
     "Hey, birds take dirt showers, it’s good enough for me, love."]
    ["Symmetra" [[:junkrat :_ballNeutralNoFire (scoot -13)] [:symmetra :_eyeRoll (scoot 3)]]
     "It is a miracle neither of you have died of infection thus far."]
    ["Junkrat" [[:junkrat :_ballPointUpNoFire (scoot -13)] [:symmetra :_bewildered (scoot 3)]]
     "We almost did! That one time. After the operation."]
    ["Junkrat" [[:junkrat :_phoneShowNoFire (scoot -13)] [:symmetra :_bewildered (scoot 3)]]
     "The nuclear fallout from the explosion joined us at the hip. Here, look, this is before the doctors separated us."]
    :-> [:street :junkrat 6 0]]

   [:street :junkrat 6 0]
   [:miranda/characters
    [[[:photos :_fancyDressJunk] [:phones :_junkratHand]]]
    :-> [:street :junkrat 6 1]]

   [:street :junkrat 6 1]
   [:miranda/dialogue
    ["Symmetra" [[:photos :_fancyDressJunk] [:phones :_junkratHand]]
     "Junkrat, this is clearly a costume for a Halloween party or somethingz."]
    ["Junkrat" [[:photos :_fancyDressJunk] [:phones :_junkratHand]]
     "Well, yeah. But it’s a really good one. Mostly I just wanted an excuse to show you cute photos. And how nice our trailer is. Look at us, so bright eyed and bushy tailed. Granted, most of the brightness is from my eyelashes being on fire but it still counts."]
    :-> [:street :junkrat :option 3]]

   [:street :junkrat :option 3]
   [:miranda/option
    "Symmetra" [[:photos :_fancyDressJunk] [:phones :_junkratHand]]
    "You’re both just wearing one large pair of pants. This hardly even counts as a costume."
    "I cannot fully process how adorable this is."]

   [:street :junkrat :option 3 0]
   [:miranda/dialogue
    ["Junkrat" [[:junkrat :_launcherNoFire (scoot -13)] [:symmetra :_neutral (scoot 3)]]
     "You are saying this to the person who literally makes all their weapons out of trash."]
    ["Symmetra" [[:junkrat :_ballFrownNoFire (scoot -13)] [:symmetra :_sass (scoot 3)]]
     "And they hardly count as weapons."]
    ["Junkrat" [[:junkrat :_ballExplainConcernedNoFire (scoot -13)] [:symmetra :_smile (scoot 3)]]
     "But I thought you said you liked our hooking doovalacky!"]
    :-> [:street :junkrat 7]]

   [:street :junkrat :option 3 1]
   [:miranda/dialogue
    ["Junkrat" [[:junkrat :_shyBlushNoFire (scoot -13)] [:symmetra :_smile (scoot 3)]]
     "Right? Best of bosom buddies."]
    ["Symmetra" [[:junkrat :_shyBlushNoFire (scoot -13)] [:symmetra :_coy (scoot 3)]]
     "Best bosoms, you say? Yes, you are rather...sculpted."]
    ["Junkrat" [[:junkrat :_scandalizedNoFire (scoot -13)] [:symmetra :_smile (scoot 3)]]
     "Sculpted bosoms?"]
    :-> [:street :junkrat 7]]

   [:street :junkrat 7]
   [:miranda/dialogue
    ["Junkrat" [[:junkrat :_ballFrownNoFire (scoot -13)] [:symmetra :_smile (scoot 3)]]
     "Wait a minute."]
    ["Junkrat" [[:junkrat :_ballWinkNoFire (scoot -13)] [:symmetra :_smile (scoot 3)]]
     "Oh! I get it. You're pulling my leg! Good one! Just don't pull too hard! It might come off!"]
    ["Symmetra" [[:junkrat :_ballNeutralNoFire (scoot -13)] [:symmetra :_explainUncomfortable (scoot 3)]]
     "Your concern is noted. I do not anticipate being too adventurous with jokes."]
    ["Junkrat" [[:junkrat :_ballEmbarassedBlush (scoot -13)] [:symmetra :_awkward (scoot 3)]]
     "..."]
    ["Junkrat" [[:junkrat :_ballExplain (scoot -13)] [:symmetra :_smile (scoot 3)]]
     "Hey! Um. Thanks for giving me and Roadie the time of day, ey? Not many people ‘ere give us a fair shake. We’re rough around the edges, I admit, but the parts in the middle ain’t so bad."]
    ["Symmetra" [[:junkrat :_ballNeutral (scoot -13)] [:symmetra :_sass (scoot 3)]]
     "Well, I suppose I have seen the softer side of you two in the time we have been working together."]
    ["Junkrat" [[:junkrat :_fibbin (scoot -13)] [:symmetra :_awkward (scoot 3)]]
     "You’re starting to get comfy with old Junky, ey? My tenderized, squishy interior finally rubbing all its viscera on ya, ey? People don’t usually see my softer side unless I accidentally explode myself."]
    ["Symmetra" [[:junkrat :_ballSmile (scoot -13)] [:symmetra :_no (scoot 3)]]
     "I am beginning to regret this decision."]
    ["Junkrat" [[:junkrat :_shyblush (scoot -13)] [:symmetra :_neutral (scoot 3)]]
     "It’s too late! You're officially our newest pal."]
    ["Symmetra" [[:junkrat :_ballSmile (scoot -13)] [:symmetra :_explainUncomfortable (scoot 3)]]
     "As long as you two behave yourselves."]
    ["Junkrat" [[:junkrat :_ballConfused (scoot -13)] [:symmetra :_smile (scoot 3)]]
     "Aye, aye, I’ll be on m’ best behavior. ‘Bout time we were getting back to spawn to prepare to attack anyhow."]
    ["Symmetra" [[:junkrat :_ballSmile (scoot -13)] [:symmetra :_explainUncomfortable (scoot 3 83 1)]]
     "Yes, let’s go."]
    ["Junkrat" [[:junkrat :_ballNeutralExtraFire (scoot -13 10 1)]]
     "Hm. Smells like barbeque again."]
    :-> [:junkrat]]

   [:junkrat]
   [:miranda/characters
    [[]]
    :-> [:junkrat :text]]

   [:junkrat :text]
   [:miranda/narration
    "Even though your team already seemed to be in quite high spirits, the Junkers insisted upon a pre-game pep ritual involving everyone standing in very silly poses and together chanting ‘Attack! Attack! Attack! Oi! Oi! Oi!’ in order to rile everyone up even further.  Although Torbjorn refused to participate and you yourself found the whole affair quite silly, it seemed to have done the trick as you managed to capture the point on your first push ending the round in less than a minute."
    :-> [:street :junkrat 8]]

   [:street :junkrat 8]
   [:miranda/narration
    "As you and your teammates are packing up your things, the Junkers approach you one last time asking for a picture to commemorate your stunning victory. "
    :-> [:street :junkrat 9]]

   [:street :junkrat 9]
   [:miranda/characters
    [[[:photos :_junkratDate1Junk] [:phones :_junkratHand]]]
    :-> [:street :junkrat 9 :text]]

   [:street :junkrat 9 :text]
   [:miranda/dialogue
    ["Junkrat" [[:photos :_junkratDate1Junk] [:phones :_junkratHand]] "Smile!"]
    :=> [:hollywood [:spawn :intro] 0]]})
