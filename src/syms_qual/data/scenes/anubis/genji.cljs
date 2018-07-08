(ns syms-qual.data.scenes.anubis.genji
  (:require [carmen.util :as anim :refer [scoot]]
            [syms-qual.util :as util :refer [inc-transition]]))

(def data
  {[:spawn :genji 0]
   [:miranda/dialogue
    ["Symmetra" [[:genji_mercy :_laugh (scoot -75 -5 1)] [:symmetra :_helloNeutral (scoot 73 3 1)]]
     "How do you do, teammates? Am I interrupting anything?"]
    ["Mercy" [[:genji_mercy :_embarassed (scoot -5)] [:symmetra :_neutral (scoot 3)]]
     "Oh no, Satya, of course not! You’ll have to excuse us if we’re going overboard with the jokes."]
    ["Genji" [[:genji_mercy :_stop (scoot -5)] [:symmetra :_neutral (scoot 3)]]
     "Let us stop, for now. Symmetra is likely to be the only other teammate we have who will be entirely present for this mission."]
    ["Symmetra" [[:genji_mercy :_neutral (scoot -5)] [:symmetra :_explain (scoot 3)]]
     "What do you mean?"]
    ["Genji" [[:genji_mercy :_genjiExplain (scoot -5)] [:symmetra :_neutral (scoot 3)]]
     "Zarya and Reinhardt have gotten their hands on an irresponsible quantity of liquor, and, well, Fareeha and Angela have some colorful history. Fareeha’s emotions will be clouding her mind. It is likely that she will not perform well today."]
    ["Mercy" [[:genji_mercy :_lookBack (scoot -5)] [:symmetra :_neutral (scoot 3)]]
     "Poor Fareeha."]
    ["Mercy" [[:symmetra :_neutral (scoot 3)] [:genji_mercy :_mercyExplain (scoot -5)]]
     "Look, Satya, we’re going to need you in this upcoming fight."]
    ["Genji" [[:genji_mercy :_genjiExplain (scoot -5)] [:symmetra :_neutral (scoot 3)]]
     "We are trying to figure out how to most effectively harness your skills on the offense portions of the match."]
    ["Symmetra" [[:genji_mercy :_neutral (scoot -5)] [:symmetra :_explainWTF (scoot 3)]]
     "Excuse me?"]
    ["Genji" [[:genji_mercy :_genjiExplain (scoot -5)] [:symmetra :_frown (scoot 3)]]
     "We do not mean to offend, it’s just that your arsenal features several static elements. Tactically, attack requires mobility."]
    :-> [:spawn :genji :option]]

   [:spawn :genji :option]
   [:miranda/option
    "Symmetra" [[:genji_mercy :_neutral (scoot -5)] [:symmetra :_neutral (scoot 3)]]
    "I see what you mean."
    "This is a common misconception, but one of Vishkar’s top engineers, Dr. Kaplan, has revised my arsenal for just such a purpose. "]

   [:spawn :genji :option 0]
   [:miranda/dialogue
    ["Symmetra" [[:genji_mercy :_neutral (scoot -5)] [:symmetra :_thinking (scoot 3)]]
     "It is difficult to make use of my turrets if I can not place them in locations where the enemy is sure to go."]
    ["Mercy" [[:symmetra :_neutral (scoot 3)] [:genji_mercy :_mercyExplain (scoot -5)]]
     "Right! So, Genji and I have been brainstorming. "]
    ["Symmetra" [[:genji_mercy :_neutral (scoot -5)] [:symmetra :_explain (scoot 3)]]
     "And to what conclusions have you come?"]
    :-> [:spawn :genji 1]]

   [:spawn :genji :option 1]
   [:miranda/dialogue
    ["Mercy" [[:symmetra :_confused (scoot 3)] [:genji_mercy :_Skeptical (scoot -5)]]
     "Well, certainly the mobile shield and a shield generator with which he has equipped you are quite helpful, but they still only offer a limited level of support on attack."]
    ["Symmetra" [[:genji_mercy :_neutral (scoot -5)] [:symmetra :_pointUp (scoot 3)]]
     "I’d be careful to criticize Dr. Kaplan’s engineering, Dr. Ziegler. We have a saying in the Vishkar Corporation, “Mess with Jeff, prepare for death.” His designs have time and time again proven to be quite successful."]
    ["Mercy" [[:genji_mercy :_what (scoot -5)] [:symmetra :_sass (scoot 3)]]
     "Oh, um. What?"]
    ["Genji" [[:genji_mercy :_point (scoot -5)] [:symmetra :_sass (scoot 3)]]
     "As ex-Yakuza, I often considered my former work environment to have been quite toxic, but this Dr. Kaplan seems to be worse than my brother."]
    ["Symmetra" [[:genji_mercy :_neutral (scoot -5)] [:symmetra :_frustrated (scoot 3)]]
     "Look, I see how my turrets might require some tactical creativity to be utilized. What is your suggestion?"]
    :-> [:spawn :genji 1]]

   [:spawn :genji 1]
   [:miranda/dialogue
    ["Genji" [[:genji_mercy :_genjiExplain (scoot -5)] [:symmetra :_neutral (scoot 3)]]
     "Okay, this is going to sound weird but..."]
    ["Genji" [[:genji_mercy :_hands1 (scoot -5)] [:symmetra :_neutral (scoot 3)]]
     "Turret..."]
    ["Genji" [[:genji_mercy :_hands2 (scoot -5)] [:symmetra :_WTF (scoot 3)]]
     "blade."]
    ["Symmetra" [[:genji_mercy :_neutral (scoot -5)] [:symmetra :_confused (scoot 3)]]
     "Turret?"]
    ["Mercy" [[:symmetra :_confused (scoot 3)] [:genji_mercy :_mercyExplain (scoot -5)]]
     "Blade."]
    ["Symmetra" [[:genji_mercy :_neutral (scoot -5)] [:symmetra :_no] (scoot 3)] "
I am sorry, Dr. Ziegler, what you ask is infeasible. Vishkar Corporation safety guidelines prohibit me from attaching my turrets to anything but static surfaces. You could damage yourself with the beams."]
    ["Genji" [[:genji_mercy :_point (scoot -5)] [:symmetra :_neutral (scoot 3)]]
     "We had considered this, but I am not merely a man."]
    ["Mercy" [[:genji_mercy :_angry (scoot -5)] [:symmetra :_skeptical (scoot 3)]]
     "Damn it Satya, he’s a cyborg ninja. Dodging lasers is his forte."]
    ["Genji" [[:genji_mercy :_strained (scoot -5)] [:symmetra :_skeptical (scoot 3)]]
     "We recognize the risk, but we think the payoff will be worth it. Please give our proposition a thought."]
    :-> [:spawn :genji-choice]]

   [:spawn :genji-choice]
   [:miranda/text-option
    "What will you do?"
    ["Forge the ultimate weapon" (constantly true)
     [:-> [:spawn :genji :yes]]]
    ["Converse with your other teammates first" (constantly true)
     [:-> [:spawn :genji :no]]]]

   [:spawn :genji :yes]
   (concat
    [:miranda/dialogue
     ["Symmetra" [[:genji_mercy :_neutral (scoot -5)] [:symmetra :_sass (scoot 3)]]
      "Alright you’ve won me over. I do love a good design challenge."]
     ["Genji" [[:genji_mercy :_bow (scoot -5)] [:symmetra :_sass (scoot 3)]]
      "Thank you, you won’t regret it!"]]
    (inc-transition [:-> [:genji :cutscene]] :points/payload))

   [:spawn :genji :no]
   [:miranda/dialogue
    ["Symmetra" [[:genji_mercy :_neutral (scoot -5)] [:symmetra :_explainUncomfortable (scoot 3)]]
     "I will consider your request and check in with you later."]
    ["Genji" [[:genji_mercy :_bow (scoot -5)] [:symmetra :_neutral (scoot 3)]]
     "Thank you."]
    :-> [:spawn :choice]]

   [:genji :cutscene]
   [:miranda/characters
    [[]]
    :-> [:genji :cutscene :text]]

   [:genji :cutscene :text]
   [:miranda/narration
    "With you combined forces, the level of destruction you and Genji unleashed was legendary. You gave him not just a turret blade, but turrets everywhere. His ability to deflect projectiles with his blade while still inflicting damage with your turrets was, frankly, probably not physically possible. You would question this, but, seeing as cyberninjutsu is not your forte, you figured it was better to just not ask. The power of this ridiculous combo was enough to compensate for a very drunk Reinhardt and Zarya. Your team quickly captured both points on attack and put up and impenetrable defense in the second round.
"
    :=> [:volskaya [:spawn :intro] 0]]})
