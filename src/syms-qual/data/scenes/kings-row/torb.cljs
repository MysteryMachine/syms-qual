(ns syms-qual.data.scenes.kings-row.torb
  (:require [carmen.util :as anim :refer [scoot]]
            [syms-qual.util :as util :refer [inc-transition]]))

(def data
  {[:street :torb 0]
   [:miranda/dialogue
    ["Symmetra" [[:symmetra :_skeptical (scoot 60 0 1)] [:torbjorn :_neutral (scoot -62 -2 1)]]
     "I see you’ve set up quite far forward. Do you think it is wise to be so aggressive on defense? Would it not be more prudent to create a cohesive front line with the rest of our teammates?"]
    ["Torbjorn" [[:symmetra :_skeptical (scoot 0)] [:torbjorn :_lookAway (scoot -2)]]
     "Feck no. I’m not getting anywhere near there. I’d rather choke on my Cröönchy Stars. I’m not to pleased to have that damn tin can on our team and I’d like to stay as far away from them as possible."]
    ["Symmetra" [[:symmetra :_explainWTF (scoot 0)] [:torbjorn :_cranky (scoot -2)]]
     "I see."]
    ["Torbjorn" [[:symmetra :_neutral (scoot 0)] [:torbjorn :_pointUp (scoot -2)]]
     "But I suppose I’m also kind of torn. I don’t like Omnics, but I do like turrets. I just can’t make up my mind which of those things is more important."]
    ["Symmetra" [[:symmetra :_explainWTF (scoot 0)] [:torbjorn :_neutral (scoot -2)]]
     "Our team is quite adept at turret based combat."]
    ["Torbjorn" [[:symmetra :_WTF (scoot 0)] [:torbjorn :_pat (scoot -2)]]
     "Hehe, that we are. Though I don’t expect you or the bot will be able to keep up with my baby here. I bet you did not know that the sugar in cereal could be combusted to create power."]
    ["Symmetra" [[:symmetra :_bewildered (scoot 0)] [:torbjorn :_pat (scoot -2)]]
     "I...I suppose not?"]
    ["Torbjorn" [[:symmetra :_neutral (scoot 0)] [:torbjorn :_handHip (scoot -2)]]
     "The most important rule of engineering, don’t let anyone put junk in your machinery. I only power my machines with the finest breakfast cereals. Prepare to taste the literally sweet taste of defeat at the hands of my turret."]
    ["Symmetra" [[:symmetra :_laugh (scoot 0)] [:torbjorn :_cranky (scoot -2)]]
     "Ha, don’t make me laugh. Hard light is the vastly superior technology.  Your steel and gunpowder is antiquated dirt. Neolithic, even."]
    ["Torbjorn" [[:symmetra :_laugh (scoot 0)] [:torbjorn :_point (scoot -2)]]
     "You’re just gliding in on a shrimp sandwich with that instant hard light junk you make! Real craftsmanship takes time and effort! "]
    ["Symmetra" [[:symmetra :_eyeRoll (scoot 0)] [:torbjorn :_cranky (scoot -2)]]
     "I have spent countless hours designing this system! While you twiddle your thumbs babysitting your single precious turret, I can easily deploy 5 or 6 units while also shielding and transporting our team. You are no match for me."]
    ["Torbjorn" [[:symmetra :_eyeRoll (scoot 0)] [:torbjorn :_handHip (scoot -2)]]
     "Haha, I like an engineer with an ego, care to make a wager? Best eliminations wins the pot. You’re a hot shot, I’ll give you that, and your technology is cute, but it’s no match for experience. "]
    :-> [:street :torb :choice]]

   [:street :torb :choice]
   [:miranda/text-option
    "What will you do?"
    ["Accept Torbjorn’s challenge" (constantly true)
     [:-> [:street :torb :yes]]]
    ["Converse with your other teammates" (constantly true)
     [:-> [:street :torb :no]]]]

   [:street :torb :yes]
   [:miranda/dialogue
    ["Symmetra" [[:symmetra :_laughEvil (scoot 0)] [:torbjorn :_cranky (scoot -2)]]
     "I will destroy you."]
    :-> [:torb]]

   [:street :torb :no]
   [:miranda/dialogue
    ["Symmetra" [[:symmetra :_no (scoot 0)] [:torbjorn :_cranky (scoot -2)]]
     "It is beneath me to engage in this sophomoric contest. I must discuss strategy with our other teammates."]
    ["Torbjorn" [[:symmetra :_WTF (scoot 0)] [:torbjorn :_lookAway (scoot -2)]]
     "Heh, I knew you were all talk."]
    :-> [:street :choice]]

   [:torb]
   [:miranda/characters
    [[[:symmetra :_ (scoot 0)] [:torbjorn :_ (scoot -2)]]]
    :-> [:torb :text]]

   [:torb :text]
   [:miranda/narration
    "You easily crushed Torbjorn’s feeble attempt at friendly rivalry, scoring an elimination count three times greater than his, however your inability to work as a team cost you the match. With both of you chasing risky kills in an attempt to one up each other, your defensive line fell apart and your teammates were unable to pick up your slack."
    "Once the payload started rolling things truly fell apart, as the stationary nature of your turret heavy composition made it difficult to adapt to a moving target, allowing the enemy team to easily push through all three points. Your mobility problems continued in the offensive round, and though you were able to capture the payload you were unable to complete the map. It turns out getting a good K/D in a team game is not the formula for victory."
    :=> [:hollywood [:spawn :intro] 0]]})
