(ns syms-qual.data.scenes.eichenwalde.pharah
  (:require [carmen.util :as anim :refer [scoot]]
            [syms-qual.util :as util :refer [inc-transition]]))

(def data
  {[:spawn :pharah 0]
   [:miranda/dialogue
    ["Symmetra" [[:reinhardt :_neutral (scoot -80 -10 1)] [:ana :_neutral (scoot -82 -12 1)] [:symmetra :_helloWarm (scoot 85 5 1)]]
     "Hello all. It is good to see you."]
    ["Reinhardt" [[:reinhardt :_explainSmile (scoot -10)] [:ana :_neutral (scoot -12)] [:symmetra :_smile (scoot 5)]]
     "Satya! Ah! It is good to see you again my friend! Welcome to my homeland!"]
    ["Symmetra" [[:reinhardt :_neutral (scoot -10)] [:ana :_neutral (scoot -12)] [:symmetra :_explainUncomfortable (scoot 5)]]
     "The countryside here is quite beautiful. I greatly enjoyed the views from the transport on the way here."]
    ["Ana" [[:reinhardt :_neutral (scoot -10)] [:ana :_drink (scoot -12)] [:symmetra :_neutral (scoot 5)]]
     "Satya, darling, Reinhardt, Pharah and I will be sitting on the objective today. We invite you to join us."]
    ["Symmetra" [[:reinhardt :_neutral (scoot -10)] [:ana :_neutral (scoot -12)] [:symmetra :_explainUncomfortable (scoot 5)]]
     "If I may be frank, I am worried about our composition."]
    ["Reinhardt" [[:reinhardt :_pointUp (scoot -10)] [:ana :_neutral (scoot -12)] [:symmetra :_awkward (scoot 5)]]
     "You can be Frank if you want to, but I must insist upon a full name of Francis, so that you can be hoity-toity at parties!"]
    ["Ana" [[:reinhardt :_wince (scoot -10)] [:ana :_roll-eyes (scoot -12)] [:symmetra :_neutral (scoot 5)]]
     "Reinhardt!"]
    ["Reinhardt" [[:reinhardt :_explainConcernedBack (scoot -10)] [:ana :_neutral (scoot -12)] [:symmetra :_smile (scoot 5)]]
     "Don’t be all business, Ana. If she’s worried, she needs a joke."]
    ["Ana" [[:reinhardt :_neutral (scoot -10)] [:ana :_drink (scoot -12)] [:symmetra :_neutral (scoot 5)]]
     "Fine. Anyway, Satya, darling, do not worry about our composition. I have been informed by a reliable source that both Sombra and Moira are ditching the match today for something they described as 'weeb shit'."]
    ["Reinhardt" [[:reinhardt :_explainSmileBack (scoot -10)] [:ana :_drink (scoot -12)] [:symmetra :_awkward (scoot 5)]]
     "Was your reliable source Sombra's blog? I tried to follow it for a while, but I did not understand what a waifu was."]
    ["Ana" [[:reinhardt :_neutral (scoot -10)] [:ana :_explain (scoot -12)] [:symmetra :_awkward (scoot 5)]]
     "Victory is MY waifu, Reinhardt. That is why I have researched my opponent's habits in depth. It is why I managed to decrypt Sombra's vapid internet speech to arrive at this intel."]
    ["Ana" [[:reinhardt :_neutral (scoot -10)] [:ana :_drink (scoot -12)] [:symmetra :_neutral (scoot 5)]]
     "But let's stay focused. They will not be here. That means that even when Widowmaker and Hanzo decide not to do anything, it’s still 4v4, and we have the most competent member of this unit."]
    ["Reinhardt" [[:reinhardt :_laugh (scoot -10)] [:ana :_drink (scoot -12)] [:symmetra :_smile (scoot 5)]]
     "Oh, Ana, that just isn’t true. I’m not that great."]
    ["Ana" [[:reinhardt :_neutral (scoot -10)] [:ana :_explainEyesClosed (scoot -12)] [:symmetra :_neutral (scoot 5)]]
     "I’m talking about myself. I have the highest rank. "]
    ["Reinhardt" [[:reinhardt :_laugh (scoot -10)] [:ana :_sass (scoot -12)] [:symmetra :_smile (scoot 5)]]
     "Do you? I do not check mine. I am simply happy to smash with my big hammer."]
    ["Ana" [[:reinhardt :_neutral (scoot -10)] [:ana :_drink (scoot -12)] [:symmetra :_neutral (scoot 5)]]
     "I know, darling. Anyway, Satya, do not fret, I have carried teams worse than this."]
    ["Reinhardt" [[:reinhardt :_laugh (scoot -10)] [:ana :_neutral (scoot -12)] [:symmetra :_neutral (scoot 5)]]
     "Like that one team that was just support heroes after Reaper no showed."]
    ["Ana" [[:reinhardt :_laugh (scoot -10)] [:ana :_laugh (scoot -12)] [:symmetra :_smile (scoot 5)]]
     "And he was captain! He drafted all supports because he claimed he’d be invincible with enough healing."]
    ["Reinhardt" [[:reinhardt :_explainSmileBack (scoot -10)] [:ana :_neutral (scoot -12)] [:symmetra :_smile (scoot 5)]]
     "Ahahah, Gabriel. That man has made many mistakes but he sure knows how to make me laugh. "]
    ["Ana" [[:reinhardt :_neutral (scoot -10)] [:ana :_sassTalk (scoot -12)] [:symmetra :_smile (scoot 5)]]
     "We’ll be getting the last laugh today. I will make sure of it."]
    ["Symmetra" [[:reinhardt :_neutral (scoot -10)] [:ana :_neutral (scoot -12)] [:symmetra :_explainUncomfortable (scoot 5)]]
     "I feel more comfortable knowing you feel confident going into this match."]
    ["Ana" [[:reinhardt :_neutral (scoot -10)] [:ana :_explainEyesClosed (scoot -12)] [:symmetra :_awkward (scoot 5)]]
     "As you should. Don’t ever doubt my skills."]
    ["Reinhardt" [[:reinhardt :_explainSmile (scoot -10)] [:ana :_neutral (scoot -12)] [:symmetra :_smile (scoot 5)]]
     "Ana is just superior. You’d think her back would hurt with how much she has to carry us."]
    ["Ana" [[:reinhardt :_neutral (scoot -10)] [:ana :_drink (scoot -12)] [:symmetra :_awkward (scoot 5)]]
     "You don’t seem to carry anyone and your back’s terrible. "]
    ["Reinhardt" [[:reinhardt :_wince (scoot -10)] [:ana :_neutral (scoot -12)] [:symmetra :_neutral (scoot 5)]]
     "My armor and hammer are already quite heavy on their own. That’s why I rely on your impeccable shot calling."]
    ["Ana" [[:reinhardt :_neutral (scoot -10)] [:ana :_explain (scoot -12)] [:symmetra :_neutral (scoot 5)]]
     "I do have a plan, but compensating for Hanzo’s terrible draft is going to be extremely difficult. Winston’s system is nonsense."]
    ["Reinhardt" [[:reinhardt :_explainSmileBack (scoot -10)] [:ana :_cranky (scoot -12)] [:symmetra :_neutral (scoot 5)]]
     "I think that it’s nice that you get to be captain if your birthday is coming up."]
    ["Ana" [[:reinhardt :_neutral (scoot -10)] [:ana :_drink (scoot -12)] [:symmetra :_neutral (scoot 5)]]
     "Half of our agents do not care about working to fulfill the objectives as a team, they just want to have some sort of free for all death match. Widomaker and Hanzo cry about being under utilized, and then they go and build teams like this."]
    ["Pharah" [[:reinhardt :_neutral (scoot -10 -15 1)] [:ana :_neutral (scoot -12 -17 1)]
               [:pharah :_reverseSalute (scoot 80 35 1)] [:symmetra :_neutral (scoot 5 -20 1)]]
     "Oh, hello mother, who is…"]
    ["Pharah" [[:reinhardt :_neutral (scoot -15)] [:ana :_neutral (scoot -17)]
               [:pharah :_reverseExplainBackBlush (scoot 35 10 1)] [:symmetra :_coy (scoot -20 10 1)]]
     "Satya? What has she told you? Mama, I swear..."]
    ["Reinhardt" [[:reinhardt :_explainSmile (scoot -15)] [:ana :_neutral (scoot -17)]
                  [:pharah :_reverseNeutral (scoot 10)] [:symmetra :_neutral (scoot 10)]]
     "Relax, Kinder treat, your mother hasn’t said anything embarrassing."]
    ["Ana" [[:reinhardt :_neutral (scoot -15)] [:ana :_drink (scoot -17)]
            [:pharah :_reversePeek (scoot 10)] [:symmetra :_awkward (scoot 10)]]
     "Yet."]
    ["Ana" [[:reinhardt :_neutral (scoot -15)]
            [:pharah :_reverseNeutral (scoot 10)] [:symmetra :_neutral (scoot 10)]
            [:ana :_explainEyesClosed (scoot -17)]]
     "Anyway, I was recruiting her to join us on the payload. I will see you all there. Dismissed."]
    :-> [:spawn :pharah :choice]]

   [:spawn :pharah :choice]
   [:miranda/text-option
    "What will you do?"
    ["I wanna meet that payload" (constantly true)
     [:-> [:spawn :pharah :yes]]]
    ["Converse with your other teammates" (constantly true)
     [:-> [:spawn :pharah :no]]]]

   [:spawn :pharah :yes]
   (concat
    [:miranda/dialogue
     ["Ana" [[:reinhardt :_neutral (scoot -15)] [:ana :_sassTalk (scoot -17)]
             [:pharah :_reverseNeutral (scoot 10)] [:symmetra :_neutral (scoot 10)]]
      "Satya, darling. I’m glad to see that I will not need to administer discipline."]]
    (inc-transition [:-> [:spawn :pharah 1]] :points/payload :points/pharah))

   [:spawn :pharah :no]
   [:miranda/dialogue
    ["Ana" [[:reinhardt :_neutral (scoot -15)] [:ana :_cranky (scoot -17)]
            [:pharah :_reverseNeutral (scoot 10)] [:symmetra :_neutral (scoot 10)]]
     "Allow me to reiterate that this is not a choice. If I catch you doing something wacky with Hanzo or Widow, there will be consequences."]
    :-> [:spawn :choice]]

   [:spawn :pharah 1]
   [:miranda/dialogue
    ["Symmetra" [[:reinhardt :_neutral (scoot -15)] [:ana :_drink (scoot -17)]
                 [:pharah :_reverseNeutral (scoot 10)] [:symmetra :_awkwardTalk (scoot 10)]]
     "Oh. Um, yes."]
    ["Reinhardt" [[:reinhardt :_laugh (scoot -15)] [:ana :_neutral (scoot -17)]
                  [:pharah :_reverseNeutral (scoot 10)] [:symmetra :_awkward (scoot 10)]]
     "Oh, do not mind her. Ana runs a tight ship is all."]
    :transition :miranda/conditional
    [#(> (:points/pharah %) 0) [:-> [:spawn :pharah 2 :a]]
     :else                     [:-> [:spawn :pharah 2 :b]]]]

   [:spawn :pharah 2 :a]
   [:miranda/dialogue
    ["Ana" [[:reinhardt :_neutral (scoot -15)]
            [:pharah :_reverseNeutral (scoot 10)]
            [:ana :_explain (scoot -17)]
            [:symmetra :_neutral (scoot 10)]]
     "Am I wrong though? Satya’s avoided the payload in most of her matches. I’m glad to see her turning things around."]
    ["Symmetra" [[:reinhardt :_neutral (scoot -15)] [:ana :_neutral (scoot -17)]
                 [:pharah :_reverseNeutral (scoot 10)] [:symmetra :_explainUncomfortable (scoot 10)]]
     "I have found that bonding with my teammates first is an important part of creating a cohesive unit."]
    ["Pharah" [[:reinhardt :_neutral (scoot -15)] [:ana :_neutral (scoot -17)]
               [:pharah :_reverseExplain (scoot 10)] [:symmetra :_neutral (scoot 10)]]
     "Yes, mother. Let her build a sense of camaraderie for asking her to lay down her life in combat."]
    ["Ana" [[:reinhardt :_eek (scoot -15)] [:ana :_drink (scoot -17)]
            [:pharah :_reversePeek (scoot 10)] [:symmetra :_1000Mile (scoot 10)]]
     "‘Ibna, do not think I didn’t notice you avoiding your duties to go on a date. If you wanted to do that, you might as well have remained a civilian like mama wanted, darling."]
    :-> [:spawn :pharah 3]]

   [:spawn :pharah 2 :b]
   [:miranda/dialogue
    ["Ana" [[:reinhardt :_neutral (scoot -15)] [:ana :_crankyTalk (scoot -17)]
            [:pharah :_reverseNeutral (scoot 10)] [:symmetra :_neutral (scoot 10)]]
     "I’m a little tired of seeing people treat this program so lightly, Reinhardt. If I wanted to have my time wasted I wouldn’t have bothered to come out of retirement. This is a combat simulator not a dating service. "]
    ["Pharah" [[:reinhardt :_neutral (scoot -15)] [:ana :_cranky (scoot -17)]
               [:pharah :_reverseExplain (scoot 10)] [:symmetra :_neutral (scoot 10)]]
     "Mama, I don’t think that’s fair to--"]
    ["Ana" [[:reinhardt :_eek (scoot -15)] [:ana :_drink (scoot -17)]
            [:pharah :_reverseDowncast (scoot 10)] [:symmetra :_awkward (scoot 10)]]
     "Don’t interrupt me, soldier. I did not ask for your opinion."]
    :-> [:spawn :pharah 3]]

   [:spawn :pharah 3]
   [:miranda/dialogue
    ["Pharah" [[:reinhardt :_eek (scoot -15)] [:ana :_cranky (scoot -17)]
               [:pharah :_reverseDowncast (scoot 10)] [:symmetra :_awkward (scoot 10)]]
     "..."]
    ["Ana" [[:reinhardt :_eek (scoot -15)] [:ana :_crankyTalk (scoot -17)]
            [:pharah :_reverseDowncast (scoot 10)] [:symmetra :_awkward (scoot 10)]]
     "Get to your post and provide us with some aerial support"]
    :-> [:objective :cutscene 12]]

   [:objective :cutscene 12]
   [:miranda/narration
    "Despite your numbers disadvantage, your attack round goes surprisingly well. There seems to be no one on the enemy team capable of dealing with Pharah’s aerial offense and her cover fire allows you, Ana, and Reinhardt to easily move through the choke point. Once you are through, Ana splits off to take the high ground, allowing her to safely provide long distance healing as the rest of you fight to capture control of the payload. Once the battering ram is in your possession, you manage to quickly traverse the rest of the map, taking  the second and the third points with ease."
    "Flush with the victory of your previous round, you begin to prepare for you turn on defense, setting up your turrets on the arc of the bridge with anticipatory glee. Once the round starts however, it becomes evident that most of the enemy team has decided to abandon the match. As you wait for the time limit on the round to expire, you sit with Pharah and Reinhardt in front of the payload while Ana lurks some distance off, crouched on the sniper’s perch on the far side of the point."
    :-> [:objective :pharah 4]]})
