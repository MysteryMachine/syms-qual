(ns syms-qual.data.scenes.anubis.pharah
  (:require [carmen.util :as anim :refer [scoot]]
            [syms-qual.util :as util :refer [inc-transition]]))

(def data
  {[:spawn :pharah 0]
   [:miranda/dialogue
    ["Symmetra" [[:pharah :_neutralBack (scoot -80 -10 1)] [:symmetra :_helloWarm (scoot 70 0 1)]]
     "Greetings! It is good to see you again, Fareeha! Are you excited for todays match?"]
    ["Pharah" [[:pharah :_embarassedForward (scoot -10)] [:symmetra :_smile (scoot 0)]]
     "Hehe, yeah... something like that... you know... It feels pretty weird being here... You think you know what it’s gonna be like but then...There’s that lingering familiarity but it’s not the same..."]
    ["Symmetra" [[:pharah :_neutralBackBlush (scoot -10)] [:symmetra :_confused (scoot 0)]]
     "I’m not sure I understand..."]
    ["Pharah" [[:pharah :_embarassed (scoot -10)] [:symmetra :_neutral (scoot 0)]]
     "You know I’m just not quite sure I’m ready to... you know... ummm... be uh, fighting! Yeah, fighting so close to home. It’s strange... You wanna, uh, get that coffee? We’ve got some time before the match starts and I know a great cafe around the corner from here."]
    ["Symmetra" [[:pharah :_neutral (scoot -10)] [:symmetra :_confused (scoot 0)]]
     "Is the match not starting soon?"]
    ["Pharah" [[:symmetra :_neutral (scoot 0)] [:pharah :_explainEmbarassed (scoot -10)]]
     "Well. Yes."]
    ["Symmetra" [[:pharah :_neutral (scoot -10)] [:symmetra :_angry (scoot 0)]]
     "Are you suggesting truancy, Miss Amari?"]
    ["Pharah" [[:pharah :_embarassedForward (scoot -10)] [:symmetra :_angry (scoot 0)]]
     "I mean. We’ll just go there and back! We’ll have enough time to join the team in the second phase of the first point."]
    ["Symmetra" [[:pharah :_neutral (scoot -10)] [:symmetra :_explain (scoot 0)]]
     "I’m only qualifying, Miss Amari, would it not reflect poorly on my employer and I if I were to miss part of my second match?"]
    ["Pharah" [[:pharah :_embarassedBack (scoot -10)] [:symmetra :_neutral (scoot 0)]]
     "It’d mean a lot to me."]
    :-> [:spawn :pharah :option 0]]

   [:spawn :pharah :option 0]
   [:miranda/option
    "Symmetra" [[:pharah :_smile (scoot -10)] [:symmetra :_neutral (scoot 0)]]
    "Are you saying this is a date, Miss Amari?"
    "Am I to take it that this excursion is for purposes other than our job as Overwatch agents?"]

   [:spawn :pharah :option 0 0]
   [:miranda/dialogue
    ["Pharah" [[:pharah :_determined (scoot -10)] [:symmetra :_coy (scoot 0)]]
     "If that’s what you want!"]
    ["Symmetra" [[:pharah :_smile (scoot -10)] [:symmetra :_flirty (scoot 0)]]
     "Adorable. I would most certainly enjoy escorting you, but I cannot promise that I will be able to shirk my duties for our excursion."]
    :-> [:spawn :pharah :choice]]

   [:spawn :pharah :option 0 1]
   [:miranda/dialogue
    ["Pharah" [[:symmetra :_coy (scoot 0)] [:pharah :_determined (scoot -10)]]
     "Can’t it be both? I can promise you that my personal performance on the battlefield will be greatly improved if we go."]
    ["Symmetra" [[:pharah :_smile (scoot -10)] [:symmetra :_thinking (scoot 0)]]
     " I suppose it is our best interest for all members of the team to be in peak mental and physical condition for the fight ahead. I will consider your proposal."]
    :-> [:spawn :pharah :choice]]


   [:spawn :pharah :choice]
   [:miranda/text-option
    "What will you do?"
    ["Get coffee with Pharah" (constantly true)
     [:-> [:spawn :pharah :confirm]]]
    ["Converse with your other teammates" (constantly true)
     [:-> [:spawn :pharah :goodbye]]]]

   [:spawn :pharah :confirm]
   (concat
    [:miranda/dialogue
      ["Symmetra" [[:pharah :_smile (scoot -10)] [:symmetra :_coy (scoot 0)]]
       "Well, I’ve considered it, and as long as you assure me we will return quickly, I can’t see how it will do much harm."]]
    (inc-transition [:-> [:spawn :pharah :date-start]] :points/pharah))

   [:spawn :pharah :goodbye]
   [:miranda/dialogue
    ["Pharah" [[:pharah :_neutral (scoot -10)] [:symmetra :_smile (scoot 0)]]
     "Well, if you do decide to give things a shot, let me know."]
    :-> [:spawn :choice]]})


