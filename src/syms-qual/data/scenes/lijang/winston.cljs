(ns syms-qual.data.scenes.lijang.winston
  (:require [carmen.util :as anim :refer [scoot]]
            [syms-qual.util :as util :refer [inc-transition]]))

(def data
  {[:spawn :winston 0]
   [:miranda/dialogue
    ["Symmetra" [[:winston :_neutral (scoot -95 -15 1)] [:symmetra :_helloWarm (scoot 82 2 1)]]
     "You must be Dr. Winston. Hello, I do not believe we have had the chance to meet."]
    ["Winston" [[:winston :_explain (scoot -15)] [:symmetra :_smile (scoot 2)]]
     "Dr. Winston was my mentor, just call me Winston. But yes! Ms. Vaswani! I’m thrilled to have such a skilled Architech as yourself joining our ranks! Vishakr’s hard light technology holds wondrous opportunities for the world."]
    ["Symmetra" [[:winston :_neutral (scoot -15)] [:symmetra :_explainUncomfortable (scoot 2)]]
     "I agree. And thank you."]
    ["Winston" [[:winston :_pointUp (scoot -15)] [:symmetra :_smile (scoot 2)]]
     "Let’s talk strategy, shall we?"]
    ["Symmetra" [[:winston :_neutral (scoot -15)] [:symmetra :_explainUncomfortable (scoot 2)]]
     "Straight to the point, I admire that."]
    ["Winston" [[:winston :_self (scoot -15)] [:symmetra :_smile (scoot 2)]]
     "Ah yes. This Overwatch program was my idea after all, trying as hard as I can just seems appropriate."]
    ["Symmetra" [[:winston :_neutral (scoot -15)] [:symmetra :_explainUncomfortable (scoot 2)]]
     "I agree."]
    ["Winston" [[:winston :_airQuotes (scoot -15)] [:symmetra :_smile (scoot 2)]]
     "I’ve, haha, even gotten a cute nickname from some of our younger members. They call me \"The Tryhard.\" I don’t let it get to my head. Picking a strong composition is the right thing to do."]
    ["Symmetra" [[:winston :_neutral (scoot -15)] [:symmetra :_skeptical (scoot 2)]]
     "You’re very practical."]
    ["Winston" [[:winston :_nervous (scoot -15)] [:symmetra :_neutral (scoot 2)]]
     "I must admit, though. I’m a little worried about our draft. Our entire composition is very dive oriented, other than you."]
    ["Symmetra" [[:winston :_neutral (scoot -15)] [:symmetra :_thinking (scoot 2)]]
     "I suppose I will have some trouble in a team of our structure."]
    ["Winston" [[:winston :_explain (scoot -15)] [:symmetra :_neutral (scoot 2)]]
     "I do not mean to offend! You’re a wonderful artist, and engineer, but the mobile nature of our team means we’ll need to employ science in order to fully utilize you."]
    ["Symmetra" [[:winston :_neutral (scoot -15)] [:symmetra :_explain (scoot 2)]]
     "I see. What do you propose?"]
    ["Winston" [[:winston :_pointUp (scoot -15)] [:symmetra :_neutral (scoot 2)]]
     "Let us work together to augment my barrier projector technology with your hard light technology. I believe if we do this, we will be able to provide superior support to our mobile flankers."]
    ["Symmetra" [[:winston :_neutral (scoot -15)] [:symmetra :_bigSmile (scoot 2)]]
     "That is a creative solution!"]
    ["Winston" [[:winston :_explain (scoot -15)] [:symmetra :_bigSmile (scoot 2)]]
     "I think it will greatly improve our ability to stay on the objective."]
    :-> [:spawn :winston :choice]]

   [:spawn :winston :choice]
   [:miranda/text-option
    "What will you do?"
    ["Believe in the power of science" (constantly true)
     [:-> [:spawn :winston :yes]]]
    ["Converse with your other teammates" (constantly true)
     [:-> [:spawn :winston :no]]]]

   [:spawn :winston :yes]
   (concat
    [:miranda/dialogue
     ["Symmetra" [[:winston :_neutral (scoot -15)] [:symmetra :_explain (scoot 2)]]
      "I am ready. Shall we get to work?"]
     ["Winston" [[:winston :_explain (scoot -15)] [:symmetra :_neutral (scoot 2)]]
      "We don’t have much time to figure this out. Let’s hurry!"]]
    (inc-transition [:-> [:winston]] :points/payload))

   [:spawn :winston :no]
   [:miranda/dialogue
    ["Symmetra" [[:winston :_neutral (scoot -15)] [:symmetra :_explain (scoot 2)]]
     "I’d like to consult with other teammates to get their strategic take."]
    ["Winston" [[:winston :_nervous (scoot -15)] [:symmetra :_neutral (scoot 2)]]
     "Of course. Well, come see me if you want to give this a shot."]
    :-> [:spawn :choice]]

   [:winston]
   [:miranda/characters
    [[]]
    :-> [:winston :text]]

   [:winston :text]
   [:miranda/narration
    "While the Winston’s hard light augmented shield was not perfect, it was still a powerful addition to the team. Despite this stratagem, it seemed like your engineering success was more the result of several characters standing on the point. Your team manages to take the match 2-1."
    :=> [:eichenwalde [:spawn :intro] 0]]})
