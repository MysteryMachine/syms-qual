(ns syms-qual.data.scenes.lijang.dva
  (:require [carmen.util :as anim :refer [scoot]]
            [syms-qual.util :as util :refer [inc-transition]]))

(def data
  {[:spawn :dva 0]
   [:miranda/dialogue
    ["Symmetra" [[:lucio :_neutral (scoot -80 -4 1)] [:dva :_switchNeutral (scoot -84 -4 1)] [:symmetra :_explain (scoot 84 4 1)]]
     "Shouldn’t you be preparing for the attack?"]
    ["D.Va" [[:lucio :_neutral (scoot -4)] [:dva :_switchGum (scoot -4)] [:symmetra :_neutral (scoot 4)]]
     "Naw, I’m good. Dooooomfist already gave me the rundown. Besides,  I promised my viewers I would do this match unspoiled. The livestream is a lot less fun if I have a plan."]
    ["Symmetra" [[:lucio :_neutral (scoot -4)] [:dva :_switchNeutral (scoot -4)] [:symmetra :_confused (scoot 4)]]
     "You are broadcasting this match? I thought these were supposed to be secret? "]
    ["D.Va" [[:lucio :_neutral (scoot -4)] [:dva :_switchExplain (scoot -4)] [:symmetra :_neutral (scoot 4)]]
     "Look, it’s good business sense. Right now I’m playing Pachi-Mari Battle Buddies with Jamie, then we’ll have the match."]
    ["D.Va" [[:lucio :_neutral (scoot -4)] [:dva :_switchGum (scoot -4)] [:symmetra :_neutral (scoot 4)]]
     "After that he’s coming on as a special live guest-star to take me on in Fighters of the Storm 2. The cross traffic from the guest appearance and three different genres is gonna be great."]
    ["Symmetra" [[:lucio :_neutral (scoot -4)] [:dva :_switchNeutral (scoot -4)] [:symmetra :_explain (scoot 4)]]
     "I still feel that your time would be better spent focusing on the task at hand that cavorting with Internet celebrities in an elaborate marketing ploy for your stream."]
    ["D.Va" [[:lucio :_neutral (scoot -4)] [:dva :_switchTalk (scoot -4)] [:symmetra :_neutral (scoot 4)]]
     "Haha, Jamie’s not a celebrity, though I have been telling him he should stream some of those weird pyrotechnic kinetic sculpture projects he does under the creative tag. It’s Jamison Fawkes, you know? Our teammate? Junkrat?"]
    ["Symmetra" [[:lucio :_neutral (scoot -4)] [:dva :_switchNeutral (scoot -4)] [:symmetra :_bewildered (scoot 4)]]
     "Junkrat? I did not peg him for a gamer. Is he any good?"]
    ["D.Va" [[:lucio :_neutral (scoot -4)] [:dva :_switchShrug (scoot -4)] [:symmetra :_neutral (scoot 4)]]
     "Nope. He’s come up with a lot of very entertaining ways to lose at least."]
    ["D.Va" [[:lucio :_neutral (scoot -4)] [:dva :_switchGum (scoot -4)] [:symmetra :_neutral (scoot 4)]]
     "Besides, in Pachi-mari Battle Buddies, luck completely beats out strategy. Half the time when you’re winning, the game gives you Pachi-mari Poopy Diaper Chance Time and you lose because you don’t have a clean pair."]
    ["Symmetra" [[:lucio :_neutral (scoot -4)] [:dva :_switchNeutral (scoot -4)] [:symmetra :_frustrated (scoot 4)]]
     "I cannot imagine anyone wanting to watch that."]
    ["D.Va" [[:lucio :_neutral (scoot -4)] [:symmetra :_frustrated (scoot 4)] [:dva :_switchPointUp (scoot -4)]]
     "Naw, it makes a killing in the stream. It’s all, \"LOL, get rekt D.Noob\". Then I get a bunch of donations from people trying to make me feel better. My donation alert is really good."]
    ["Lucio" [[:lucio :_self (scoot -4)] [:dva :_switchNeutral (scoot -4)] [:symmetra :_neutral (scoot 4)]]
     "I composed it myself."]
    ["Symmetra" [[:lucio :_neutral (scoot -4)] [:dva :_neutral (scoot -4)] [:symmetra :_skeptical (scoot 4)]]
     "Oh? Does some form of music playing when you receive a donation?"]
    ["Lucio" [[:lucio :_lament (scoot -4)] [:dva :_switchNeutral (scoot -4)] [:symmetra :_WTF (scoot 4)]]
     "Naw, I once dry heaved on a Dorito while guest starring the stream. D.Va was in the bathroom and I received a donation."]
    ["Lucio" [[:lucio :_prayExplainHappy (scoot -4)] [:dva :_switchNeutral (scoot -4)] [:symmetra :_WTF (scoot 4)]]
     "Through the choking, I read out, \"T-HACK-HACK-COUGH-HANKS FOR WHEEEEEZE THE COUGH COUGH COUGH.\" Didn’t even finish the sentence. Now it’s immortalized as a donation alert. What the viewers hear is the nightcore remix version, though."]
    :-> [:spawn :dva :option 0]]

   [:spawn :dva :option 0]
   [:miranda/option
    "Symmetra" [[:lucio :_neutral (scoot -4)] [:dva :_switchNeutral (scoot -4)] [:symmetra :_neutral (scoot 4)]]
    "How is that a composition?"
    "Are your viewers not disgusted by this?"]

   [:spawn :dva :option 0 0]
   [:miranda/dialogue
    ["Lucio" [[:lucio :_smile (scoot -4)] [:dva :_switchNeutral (scoot -4)] [:symmetra :_neutral (scoot 4)]]
     "You say potato, I say batatas."]
    ["Symmetra" [[:dva :_switchNeutral (scoot -4)] [:lucio :_neutral (scoot -4)] [:symmetra :_frustrated (scoot 4)]]
     "This is not a matter of language."]
    ["Lucio" [[:lucio :_prayExplain (scoot -4)] [:dva :_switchNeutral (scoot -4)] [:symmetra :_neutral (scoot 4)]]
     "Everything is a matter of language. My language shapes my reality. No one speaks exactly the same language because our definitions differ. Every person you meet speaks with a strange accent."]
    ["Symmetra" [[:lucio :_neutral (scoot -4)] [:dva :_switchNeutral (scoot -4)] [:symmetra :_thinking (scoot 4)]]
     "I suppose it is not surprising to see such insight from an artist such as yourself."]
    ["Lucio" [[:lucio :_smile (scoot -4)] [:dva :_switchGum (scoot -4)] [:symmetra :_WTF (scoot 4)]]
     "And my definition of art includes Pachi-mari Poopy Diaper Chance Time."]
    ["Symmetra" [[:lucio :_jammin (scoot -4)] [:dva :_switchNeutral (scoot -4)] [:symmetra :_frustrated (scoot 4)]]
     "Of course."]
    :-> [:spawn :dva 1]]

   [:spawn :dva :option 0 1]
   [:miranda/dialogue
    ["Lucio" [[:lucio :_smile (scoot -4)] [:dva :_switchNeutral (scoot -4)] [:symmetra :_neutral (scoot 4)]]
     "People don’t watch livestream for games."]
    ["Lucio" [[:lucio :_prayExplainHappy (scoot -4)] [:dva :_switchNeutral (scoot -4)] [:symmetra :_WTF (scoot 4)]]
     "They watch them so they can get attention from weird internet strangers."]
    ["D.Va" [[:lucio :_neutral (scoot -4)] [:symmetra :_neutral (scoot 4)] [:dva :_switchExplain (scoot -4)]]
     "It’s true, it’s why I make so much money! Omnic Terry Crews is like, low silver, but people wanna chat with him so he makes a killing."]
    ["Lucio" [[:lucio :_idol (scoot -4)] [:dva :_switchNeutral (scoot -4)] [:symmetra :_WTF (scoot 4)]]
     "Oh, Omnic Terry Crews. I’m glad they outfitted you with that Old Spice mist gun."]
    ["Symmetra" [[:lucio :_jammin (scoot -4)] [:dva :_switchGum (scoot -4)] [:symmetra :_frustrated (scoot 4)]]
     "..."]
    :-> [:spawn :dva 1]]

   [:spawn :dva 1]
   [:miranda/dialogue
    ["D.Va" [[:lucio :_neutral (scoot -4)] [:symmetra :_neutral (scoot 4)] [:dva :_switchPointUp (scoot -4)]]
     "Look, if you want to experience a livestream for what it truly is, you need to BE the livestream. It’s like Lucio says, life imitates art."]
    ["Lucio" [[:lucio :_prayExplain (scoot -4)] [:dva :_switchNeutral (scoot -4)] [:symmetra :_neutral (scoot 4)]]
     "And art imitates life."]
    ["D.Va" [[:lucio :_neutral (scoot -4)] [:dva :_switchShrug (scoot -4)] [:symmetra :_neutral (scoot 4)]]
     "What DOES art even mean?"]
    ["Symmetra" [[:lucio :_neutral (scoot -4)] [:dva :_switchNeutral (scoot -4)] [:symmetra :_frustrated (scoot 4)]]
     "I sense you two may be joking with me."]
    ["D.Va" [[:lucio :_neutral (scoot -4)] [:symmetra :_neutral (scoot 4)] [:dva :_switchPointUp (scoot -4)]]
     "What if ART was the joke all along? Hum? Think on that. And if you, by any chance, are looking for a place to do that thinking, Lucio and I are trying to raise enough internet fun bucks from this match to rent out the arcade. J-Bomb’s coming too. Come hang out!"]
    ["Lucio" [[:lucio :_smile (scoot -4)] [:dva :_switchNeutral (scoot -4)] [:symmetra :_neutral (scoot 4)]]
     "Having a good straight woman on the stream will really aid our hijinks."]
    ["Lucio" [[:lucio :_smug (scoot -4)] [:dva :_switchNeutral (scoot -4)] [:symmetra :_1000Mile (scoot 4)]]
     "Of course, I mean the comedy variety of \"straight woman.\" We’ve all seen how you look at Sombra’s butt and literally no one is blaming you."]
    ["Symmetra" [[:lucio :_neutral (scoot -4)] [:dva :_switchNeutral (scoot -4)] [:symmetra :_embarassed (scoot 4)]]
     "This does not seem like my kind of event."]
    ["D.Va" [[:lucio :_neutral (scoot -4)] [:symmetra :_neutral (scoot 4)] [:dva :_switchExplain (scoot -4)]]
     "How about this: you and Jamie can have a nice chat with me while we drink some bubble tea. Casual. No viewer interaction. Lucio’ll be on the soundboard."]
    ["D.Va" [[:lucio :_neutral (scoot -4)] [:dva :_switchGrin (scoot -4)] [:symmetra :_neutral (scoot 4)]]
     "To be honest, Jamie is the one who really wanted you to come, I think he’s sweet on you...and it’s adorbs. He keeps drawing little triangles on his hands with blue gel pens."]
    ["Symmetra" [[:lucio :_neutral (scoot -4)] [:dva :_switchNeutral (scoot -4)] [:symmetra :_sadSmile (scoot 4)]]
     "Spending some time with you all does sound like fun, but I do not know if I could handle the stress of such intense social interaction after a hectic match."]
    ["D.Va" [[:lucio :_neutral (scoot -4)] [:symmetra :_neutral (scoot 4)] [:dva :_switchUnderstanding (scoot -4)]]
     "Hey, no pressure! And, uh, no one’s judging you if you decide to take the second half of the match to chill and get in the right headspace to hang out. Self care comes first, ya know?"]
    :-> [:spawn :dva :choice]]

   [:spawn :dva :choice]
   [:miranda/text-option
    "What will you do?"
    ["Engage with an audience via livestream" (constantly true)
     [:-> [:spawn :dva :yes]]]
    ["Converse with your other teammates" (constantly true)
     [:-> [:spawn :dva :no]]]]

   [:spawn :dva :yes]
   (concat
    [:miranda/dialogue
     ["Symmetra" [[:lucio :_neutral (scoot -4)] [:dva :_switchSmile (scoot -4)] [:symmetra :_explainSad (scoot 4)]]
      "Perhaps I’ll take it easy if we have a convincing first round. Please work extra hard during the match."]
     ["Lucio" [[:lucio :_jammin (scoot -4)] [:dva :_switchSmile (scoot -4)] [:symmetra :_sadSmile (scoot 4)]]
      "Booyah!"]
     ["D.Va" [[:lucio :_neutral (scoot -4)] [:symmetra :_neutral (scoot 4)] [:dva :_switchExplain (scoot -4)]]
      "We’ll pick you up a half hour after the match, we’ll need to reserve the spot!"]]
    (inc-transition [:-> [:spawn :dva :cutscene]] :points/junkrat))

   [:spawn :dva :no]
   [:miranda/dialogue
    ["Symmetra" [[:lucio :_neutral (scoot -4)] [:dva :_switchNeutral (scoot -4)] [:symmetra :_explain (scoot 4)]]
     "I appreciate the offer, but I’d like to focus on the match for the time being."]
    ["D.Va" [[:lucio :_neutral (scoot -4)] [:dva :_switchSmile (scoot -4)] [:symmetra :_neutral (scoot 4)]]
     "An excellent choice as well. Let us know if you’d like to change your mind."]
    :-> [:spawn :choice]]

   [:spawn :dva :cutscene]
   [:miranda/narration
    "Lucio and D.Va work extra hard during the match, and you get the sense the Junkrat, playing for the enemy team, might be slacking a bit to accommodate you. On more than one occasion, you found him attempting to lounge inconspicuously in some bushes, although to be honest, you are not entirely convinced that’s not just part of his usual modus operandi. You win the first round handily. As round two starts, you retreat into the ORCA and sit down for some much needed meditation. A while later, D.Va and Lucio show up to pick you up."
    :-> [:spawn :dva 2]]})
