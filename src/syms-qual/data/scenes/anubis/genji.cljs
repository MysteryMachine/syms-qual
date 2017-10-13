(ns syms-qual.data.scenes.anubis.genji)

(def start-date
  [:transition :miranda/mutation->basic
   [[:-> [:anubis :pharah :confirm]]
    (fn []
      ;;TODO: mutate state to indicate date
      )]])

(def data
  {[:anubis :genji 0]
   [:miranda/dialogue
    ["Symmetra" [] "How do you do, teammates? Am I interrupting anything?"]
    ["Mercy" [] "Oh no, Satya, of course not! You’ll have to excuse us if we’re going overboard with the jokes."]
    ["Genji" [] "Let us stop, for now. Symmetra is likely to be the only other teammate we have who will be entirely present for this mission."]
    ["Symmetra" [] "What do you mean?"]
    ["Genji" [] "Zarya and Reinhardt have gotten their hands on an irresponsible quantity of liquor, and, well, Fareeha and Angela have some colorful history. Fareeha’s emotions will be clouding her mind. It is likely that she will not perform well today."]
    ["Mercy" [] "Poor Fareeha. Look, Satya, we’re going to need you in this upcoming fight."]
    ["Genji" [] "We are trying to figure out how to most effectively harness your skills on the offense portions of the match."]
    ["Symmetra" [] "Excuse me?"]
    ["Genji" [] "We do not mean to offend, it’s just that your arsenal features several static elements. Tactically, attack requires mobility."]
    :-> [:anubis :genji :option]]

   [:anubis :genji :option]
   [:miranda/option
    "Symmetra" []
    "I see what you mean. It is difficult to make use of my turrets if I can not place them in locations where the enemy is sure to go."
    "This is a common misconception, but one of Vishkar’s top engineers, Dr. Kaplan, has revised my arsenal for just such a purpose. "]

   [:anubis :genji :option 0]
   [:miranda/dialogue
    ["Mercy" [] "Right! So, Genji and I have been brainstorming. "]
    ["Symmetra" [] "And to what conclusions have you come?"]
    :-> [:anubis :genji 1]]

   [:anubis :genji :option 1]
   [:miranda/dialogue
    ["Mercy" [] "Well, certainly the mobile shield and a shield generator with which he has equipped you are quite helpful, but they still only offer a limited level of support on attack."]
    ["Symmetra" [] "I’d be careful to criticize Dr. Kaplan’s engineering, Dr. Ziegler. We have a saying in the Vishkar corporation, “Mess with Jeff, prepare for death.” His designs have time and time again proven to be quite successful."]
    ["Mercy" [] "Oh, um. What?"]
    ["Genji" [] "As ex-Yakuza, I often considered my former work environment to have been quite toxic, but this Dr. Kaplan seems to be worse than my brother."]
    ["Symmetra" [] "Look, I see how my turrets might require some tactical creativity to be utilized. What is your suggestion?"]
    :-> [:anubis :genji 1]]

   [:anubis :genji 1]
   [:miranda/dialogue
    ["Genji" [] "Okay, this is going to sound weird but."]
    ["Genji" [] "Turret"]
    ["Genji" [] "blade."]
    ["Symmetra" [] "Turret?"]
    ["Mercy" [] "Blade."]
    ["Symmetra" [] "I am sorry, Dr. Ziegler, what you ask is infeasible. Vishkar Corporation safety guidelines prohibit me from attaching my turrets to anything but static surfaces. You could damage yourself with the beams."]
    ["Genji" [] "We had considered this, but I am not merely a man."]
    ["Mercy" [] "Damn it Satya, he’s a cyborg ninja. Dodging lasers is his forte."]
    ["Genji" [] "We recognize the risk, but we think the payoff will be worth it. Please give our proposition a thought."]
    :-> [:anubis :genji-choice]]

   [:anubis :genji-choice]
   [:miranda/text-option
    "What will you do?"
    ["Get coffee with Pharah" (constantly true) start-date]
    ["Converse with your other teammates" (constantly true)
     [:-> [:anubis :genji :no]]]]

   [:anubis :genji :yes]
   [:miranda/dialogue
    ["Symmetra" [] "Alright you’ve won me over. I do love a good design challenge. "]
    ["Genji" [] "Thank you, you won’t regret it!"]
    :-> [:anubis :genji :cutscene]]

   [:anubis :genji :no]
   [:miranda/dialogue
    ["Symmetra" [] "I will consider your request and check in with you later."]
    ["Genji" [] "Thank you."]
    :-> [:anubis :choice]]

   [:anubis :genji :cutscene]
   [:miranda/narration
    "With you combined forces, the level of destruction you and Genji unleashed was legendary. You gave him not just a turret blade, but turrets everywhere. His ability to deflect projectiles with his blade while still inflicting damage with your turrets was, frankly, probably not physically possible. You would question this, but, seeing as cyberninjutsu is not your forte, you figured it was better to just not ask. The power of this ridiculous combo was enough to compensate for a very drunk Reinhardt and Zarya. Your team quickly captured both points on attack and put up and impenetrable defense in the second round.
"
    :-> [:volskaya :intro]]})


