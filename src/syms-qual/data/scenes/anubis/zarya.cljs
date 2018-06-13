(ns syms-qual.data.scenes.anubis.zarya
  (:require [carmen.util :as anim :refer [scoot]]))

(def power-line
  ["Zarya" [[:zarya_rein :_protein (scoot -10)] [:symmetra :_1000Mile (scoot 5)]]
   "With such power in those arms, you could really benefit from some high quality whey protein. You have power, but if you are not dominating the puny hands of your subordinates, you will never truly achieve your potential."])

(def data
  {[:spawn :zarya 0]
   [:miranda/dialogue
    ["Symmetra" [[:zarya_rein :_neutralLeft (scoot -90 -10 1)] [:symmetra :_helloWarm (scoot 85 5 1)]]
     "Greetings, Reinhardt. It is good to see you again. I am pleased that, this time, I shall be behind your shield rather than on the receiving end of your hammer."]
    ["Reinhardt" [[:zarya_rein :_hello (scoot -10)] [:symmetra :_smile (scoot 5)]]
     "Haha! Yes our match last week was quite intense. Satya, my friend, have you met Miss Zarayanova?"]
    ["Symmetra" [[:zarya_rein :_neutralRight (scoot -10)] [:symmetra :_explainUncomfortable (scoot 5)]]
     "To the best of my abilities, I have done extensive research on all the placement matches’ participants, but we have not met in person, no."]
    ["Zarya" [[:zarya_rein :_handshake (scoot -10)]]
     "You can call me Zarya. You have strong handshake for such small woman. Confident but not aggressive. Very good, I like."]
    ["Symmetra" [[:zarya_rein :_neutralRight (scoot -10)] [:symmetra :_embarassed (scoot 5)]]
     "Thank...you?"]
    ["Zarya" [[:zarya_rein :_explain (scoot -10)] [:symmetra :_embarassed (scoot 5)]]
     "Satya. Look. I don’t want you to think I am coming on too strong here but..."]
    ["Symmetra" [[:zarya_rein :_neutralRight (scoot -10)] [:symmetra :_coy (scoot 5)]]
     "Y...yes?"]
    ["Zarya" [[:zarya_rein :_explain (scoot -10)] [:symmetra :_coy (scoot 5)]]
     "Being an Olympic lifter has convinced me to always shoot for the limits of possibility. In lifting. In combat."]
    ["Zarya" [[:zarya_rein :_smutty (scoot -10)] [:symmetra :_embarassed (scoot 5)]]
     "In love."]
    :-> [:spawn :zarya :option]]

   [:spawn :zarya :option]
   [:miranda/option
    "Symmetra" [[:zarya_rein :_smutty (scoot -10)] [:symmetra :_coy (scoot 5)]]
    "Miss Zaryanova..."
    "Miss Zaryanova, I can’t deny I haven been quietly admiring your strength."]

   [:spawn :zarya :option 0]
   [:miranda/dialogue
    power-line
    :-> [:spawn :zarya 1]]

   [:spawn :zarya :option 1]
   [:miranda/dialogue
    ["Zarya" [[:zarya_rein :_ofCourse (scoot -10)] [:symmetra :_coy (scoot 5)]]
     "Of course you have. This is why I am quick to tell you my feelings. It is Russian way."]
    power-line
    :-> [:spawn :zarya 1]]

   [:spawn :zarya 1]
   [:miranda/dialogue
    ["Reinhardt" [[:zarya_rein :_pointRein (scoot -10)] [:symmetra :_1000Mile (scoot 5)]]
     "Whey protein? Ha, you don’t need that. What you need is currywurst! I will make you some after that match. That is all the protein I ever need!"]
    ["Zarya" [[:zarya_rein :_pointZarya (scoot -10)] [:symmetra :_confused (scoot 5)]]
     "And it is why I will beat you again today!"]
    ["Symmetra" [[:zarya_rein :_neutralRight (scoot -10)] [:symmetra :_explainWTF (scoot 5)]]
     "Beat him how? You are on the same team this game."]
    ["Zarya" [[:zarya_rein :_explain (scoot -10)] [:symmetra :_neutral (scoot 5)]]
     "No, see, I promised old man a rematch in arm wrestling contest, but we decided it was best to save our strength for the fight ahead. Then, I found these bottles under boxes over there though, and this seemed like a suitable substitution."]
    ["Reinhardt" [[:zarya_rein :_shot (scoot -10)] [:symmetra :_frown (scoot 5)]]
     "And so, we test our livers instead! I wish we had some Bären, but I’m sure this vodka’s lighter fluid flavor will only intensify the contest! "]
    ["Symmetra" [[:zarya_rein :_shot (scoot -10)] [:symmetra :_frustrated (scoot 5)]]
     "You thought it was more responsible to get drunk before the match, than to arm wrestle?"]
    ["Zarya" [[:zarya_rein :_salty (scoot -10)] [:symmetra :_frown (scoot 5)]]
     "Are you questioning my ability to handle my liquor?"]
    ["Rein" [[:zarya_rein :_pointSalty (scoot -10)] [:symmetra :_frown (scoot 5)]]
     "She is! She knows I’m going to drink you under the table!"]
    ["Zarya" [[:zarya_rein :_pointZaryaNoShot (scoot -10)] [:symmetra :_frown (scoot 5)]]
     "You’re the one who will end up on the floor, old man!"]
    ["Symmetra" [[:zarya_rein :_pointZaryaNoShot (scoot -10)] [:symmetra :_eyeRoll (scoot 5)]]
     "I see. I will take my leave then."]
    ["Reinhardt" [[:zarya_rein :_hello (scoot -10)] [:symmetra :_neutral (scoot 5)]]
     "No stay! Even if you do not join us in drinking you should join us in battle! This morning, we will go FLANKING!"]
    :-> [:spawn :zarya-choice]]

   [:spawn :zarya-choice]
   [:miranda/text-option
    "What will you do?"
    ["Sally forth with the tanks" (constantly true)
     [:-> [:spawn :zarya :yes]]]
    ["Converse with your other teammates" (constantly true)
     [:-> [:spawn :zarya :no]]]]

   [:spawn :zarya :yes]
   [:miranda/dialogue
    ["Symmetra" [[:zarya_rein :_neutralRight (scoot -10)] [:symmetra :_explainUncomfortable (scoot 5)]]
     "This seems seems strategically unsound but I suppose some one has to keep an eye on you two."]
    ["The Tanks" [[:zarya_rein :_pleased (scoot -10)] [:symmetra :_frustratedConfused (scoot 5)]]
     "HUZZAH!"]
    :-> [:zarya :cutscene]]

   [:spawn :zarya :no]
   [:miranda/dialogue
    ["Symmetra" [[:zarya_rein :_neutralRight (scoot -10)] [:symmetra :_explain (scoot 5)]]
     "I’m not sure that that would be the most tactically appropriate position for any of us. But I will take your offer under consideration, after I check back in with the rest of our teammates."]
    :-> [:spawn :choice]]

   [:zarya :cutscene]
   [:miranda/characters
    [[]]
    :-> [:zarya :cutscene :text]]

   [:zarya :cutscene :text]
   [:miranda/narration
    "In their inebriated state, Zarya and Reinhardt decided it would be great fun if they traded weapons, which had mixed results. Zarya had no trouble scoring kills with Reinhardt’s oversized hammer. Reinhardt, however, attempted to use the Particle Cannon as a pistol, insisting on shooting it one handed. With you tagging behind them, the three of you managed to create and impenetrable cluster of shields which allowed you charge quite far into enemy territory."
    "Despite the unusual strategy, the attack went surprisingly well. That is, until Reinhardt decided to perform his ultimate using Zarya’s gun, shattering it instantly. You were wiped out before capturing the final point and were unable to recover, since your tanks spent the rest of the match drunkenly laughing at the absurdity of it all."
    :=> [:volskaya [:spawn :intro] 0]]})
