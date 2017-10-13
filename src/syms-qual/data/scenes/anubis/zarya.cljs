(ns syms-qual.data.scenes.anubis.zarya)

(def start-date
  [:transition :miranda/mutation->basic
   [[:-> [:anubis :pharah :confirm]]
    (fn []
      ;;TODO: mutate state to indicate date
      )]])

(def data
  {[:anubis :zarya 0]
   [:miranda/dialogue
    ["Symmetra" [] "Greetings, Reinhardt. It is good to see you again. I am pleased that, this time, I shall be behind your shield rather than on the receiving end of your hammer."]
    ["Reinhardt" [] "Haha! Yes our match last week was quite intense. Satya, my friend, have you met Miss Zarayanova?"]
    ["Symmetra" [] "To the best of my abilities, I have done extensive research on all the placement matches’ participants, but we have not met in person, no."]
    ["Zarya" [] "You can call me Zarya. You have strong handshake for such small woman. Confident but not aggressive. Very good, I like."]
    ["Symmetra" [] "Thank...you?"]
    ["Zarya" [] "Satya. Look. I don’t want you to think I am coming on too strong here but..."]
    ["Symmetra" [] "Y...yes?"]
    ["Zarya" [] "Being an Olympic lifter has convinced me to always shoot for the limits of possibility. In lifting. In combat."]
    ["Zarya" [] " In love."]
    :-> [:anubis :zarya :option]]

   [:anubis :zarya :option]
   [:miranda/option
    "Symmetra" []
    "Miss Zaryanova..."
    "Miss Zaryanova, I can’t deny I haven’t been quietly admiring your strength."]

   [:anubis :zarya :option 0]
   [:miranda/dialogue
    ["Symmetra" [] "..."]
    :-> [:anubis :zarya 1]]

   [:anubis :zarya :option 1]
   [:miranda/dialogue
    ["Zarya" [] "Of course you have. This is why I am quick to tell you my feelings. It is Russian way."]
    :-> [:anubis :zarya 1]]

   [:anubis :zarya 1]
   [:miranda/dialogue
    ["Zarya" [] "With such power in those arms, you could really benefit from some high quality whey protein. You have power, but if you are not dominating the puny hands of your subordinates, you will never truly achieve your potential."]
    ["Reinhardt" [] "Whey protein? Ha, you don’t need that. What you need is currywurst! I will make you some after that match. That is all the protein I ever need!"]
    ["Zarya" [] "And it is why I will beat you again today!"]
    ["Symmetra" [] "Beat him how? You are on the same team this game."]
    ["Zarya" [] "No, see, I promised old man a rematch in arm wrestling contest, but we decided it was best to save our strength for the fight ahead. Then, I found these bottles under boxes over there though, and this seemed like a suitable substitution."]
    ["Reinhardt" [] "And so, we test our livers instead! I wish we had some Bären, but I’m sure this vodka’s lighter fluid flavor will only intensify the contest! "]
    ["Symmetra" [] "You thought it was more responsible to get drunk before the match, than to arm wrestle?"]
    ["Zarya" [] "Are you questioning my ability to handle my liquor?"]
    ["Rein" [] "She is! She knows I’m going to drink you under the table!"]
    ["Zarya" [] "You’re the one who will end up on the floor, old man!"]
    ["Symmetra" [] "I see. I will take my leave then."]
    ["Reinhardt" [] "No stay! Even if you do not join us in drinking you should join us in battle! This morning, we will go FLANKING!"]
    :-> [:anubis :zarya-choice]]

   [:anubis :zarya-choice]
   [:miranda/text-option
    "What will you do?"
    ["Sally forth with the tanks" (constantly true) start-date]
    ["Converse with your other teammates" (constantly true)
     [:-> [:anubis :zarya :no]]]]

   [:anubis :zarya :yes]
   [:miranda/dialogue
    ["Symmetra" [] "This seems seems strategically unsound but I suppose some one has to keep an eye on you two."]
    ["Both" [] "HUZZAH!"]
    :-> [:anubis :zarya :cutscene]]

   [:anubis :zarya :no]
   [:miranda/dialogue
    ["Symmetra" [] "I’m not sure that that would be the most tactically appropriate position for any of us. But I will take your offer under consideration, after I check back in with the rest of our teammates."]
    :-> [:anubis :choice]]

   [:anubis :zarya :cutscene]
   [:miranda/narration
    ""
    :-> [:volskaya :intro]]})
