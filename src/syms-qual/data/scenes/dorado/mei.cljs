(ns syms-qual.data.scenes.dorado.mei
  (:require [carmen.util :as anim :refer [scoot]]
            [syms-qual.util :as util :refer [inc-transition]]))

(def data
  {[:spawn :mei 0]
   [:miranda/dialogue
    ["Mei" [[:mei :_handChin (scoot -80 -6 1.5)] [:symmetra :_smile (scoot 80 0 1.5)]] "Symmetra! Eek! I’ve been wanting to tell you all round, you look gorgeous in that dress."]
    :transition :miranda/conditional
    [#(= 1 (:volskaya/sombra %)) [:-> [:spawn :mei 0 :a]]
     :else [:-> [:spawn :mei 0 1]]]]

   [:spawn :mei 0 :a]
   [:miranda/dialogue
    ["Mei" [[:mei :_thumbsUp (scoot -6)] [:symmetra :_awkward (scoot 0)]] "Of course, I completely blame my workout regimen."]
    :-> [:spawn :mei 0 1]]

   [:spawn :mei 0 1]
   [:miranda/dialogue
    ["Symmetra" [[:mei :_headHand (scoot -6)] [:symmetra :_smug (scoot 0)]] "I thank you. You look extremely uncomfortable in that snow suit."]
    ["Mei" [[:mei :_collar (scoot -6)] [:symmetra :_smile (scoot 0)]] "I am so hot. It’s hard to think straight."]
    ["Zenyatta" [[:mei :_awkward (scoot -5 8 1)] [:zenyatta :_wave (scoot -80 -18 1)] [:symmetra :_awkward (scoot 0 6 1)]] "Hello, Mei. Around Genji’s butt, I also find it difficult to think straight."]
    ["Symmetra" [[:mei :_awkward (scoot 8)] [:zenyatta :_neutral (scoot -18)] [:symmetra :_explainUncomfortable (scoot 6)]] "Perhaps you should consider removing some layers?"]
    ["Mei" [[:mei :_headHand (scoot 8)] [:zenyatta :_neutral (scoot -18)] [:symmetra :_neutral (scoot 6)]] "I need to insulate myself against my own attacks. My snow robot is often a little overeager."]
    ["Zenyatta" [[:mei :_awkward (scoot 8)] [:zenyatta :_explain (scoot -18)] [:symmetra :_neutral (scoot 6)]] "I can relate. I have a cat, and I am told he sometimes skunks."]
    ["Mei" [[:mei :_confused (scoot 8)] [:zenyatta :_neutral (scoot -18)] [:symmetra :_neutral (scoot 6)]] "You are told?"]
    ["Zenyatta" [[:mei :_confused (scoot 8)] [:zenyatta :_explain (scoot -18)] [:symmetra :_neutral (scoot 6)]] "I cannot smell. Genji will be near my and his cyber senses will indicate that, indeed, there is cat butt smell on me."]
    ["Mei" [[:mei :_awkward (scoot 8)] [:zenyatta :_neutral (scoot -18)] [:symmetra :_neutral (scoot 6)]] "Oh. I see."]
    ["Symmetra" [[:mei :_awkward (scoot 8)] [:zenyatta :_neutral (scoot -18)] [:symmetra :_explainUncomfortable (scoot 6)]] "Perhaps you should offend your cat less often?"]
    ["Zenyatta" [[:mei :_awkward (scoot 8)] [:zenyatta :_excited (scoot -18)] [:symmetra :_neutral (scoot 6)]] "If my cat desires to smell, I give them my blessing to do so under the luminescent glow of the Iris."]
    :-> [:spawn :mei :option 0]]

    [:spawn :mei :option 0]
    [:miranda/option
     "Symmetra" [[:mei :_neutral (scoot 8)] [:zenyatta :_neutral (scoot -18)] [:symmetra :_neutral (scoot 6)]]
     "I do not think you understand, the cat is acting in self defense."
     "I am glad you are so supportive of your cat."]

    [:spawn :mei :option 0 0]
    [:miranda/dialogue
     ["Symmetra" [[:mei :_neutral (scoot 8)] [:zenyatta :_neutral (scoot -18)] [:symmetra :_explainUncomfortable (scoot 6)]]
      "Cats do that when they are threatened."]
     ["Zenyatta" [[:mei :_neutral (scoot 8)] [:zenyatta :_explain (scoot -18)] [:symmetra :_neutral (scoot 6)]]
      "And are we not all threatened by existence? Were it not for the...um…"]
     :-> [:spawn :mei 1]]

     [:spawn :mei :option 0 1]
     [:miranda/dialogue
      ["Mei" [[:symmetra :_neutral (scoot 6)] [:mei :_explain (scoot 8)] [:zenyatta :_neutral (scoot -18)]]
       "It’s good to give your cat the freedom of expression, even if it means you will have to replace your furniture more often."]
      ["Zenyatta" [[:mei :_neutral (scoot 8)] [:zenyatta :_pointUp (scoot -18)] [:symmetra :_neutral (scoot 6)]]
       "Ah yes, more certainly the uh..."]

      :-> [:spawn :mei 1]]

  [:spawn :mei 1]
    [:miranda/dialogue
    ["Zenyatta" [[:mei :_neutral (scoot 8)] [:zenyatta :_focus (scoot -18)] [:symmetra :_neutral (scoot 6)]] "Assist me. I desire a word that means luminous, but I require a synonym, for a lack of repetition is paramount in discussion."]
    ["Mei" [[:mei :_pointUp (scoot 8)] [:zenyatta :_neutral (scoot -18)] [:symmetra :_neutral (scoot 6)]] "Oh! I have a suggestion! Effulgent!"]
    ["Zenyatta" [[:mei :_neutral (scoot 8)] [:zenyatta :_pointUp (scoot -18)] [:symmetra :_neutral (scoot 6)]] "Yes. The effulgent light of the Iris more certainly shines on my sweet cat."]
    :transition :miranda/conditional
    [#(= (:points/payload %) 6) [:-> [:spawn :mei :a]]
     :else                      [:-> [:spawn :mei :b]]]]

   [:spawn :mei :a]
   [:miranda/dialogue
    ["Mei" [[:symmetra :_neutral (scoot 6)] [:mei :_explain (scoot 8)] [:zenyatta :_neutral (scoot -18)]] "Look, Satya, I’m going to need you on that point with me. The others are leaving to go to a bar--"]
    ["Zenyatta" [[:mei :_neutral (scoot 8)] [:zenyatta :_explain (scoot -18)] [:symmetra :_neutral (scoot 6)]] "I will be doing some yoga."]
    ["Mei" [[:mei :_confused (scoot 8)] [:zenyatta :_neutral (scoot -18)] [:symmetra :_neutral (scoot 6)]] "Wait, why do you need to do yoga? You’re a machine."]
    ["Zenyatta" [[:mei :_neutral (scoot 8)] [:zenyatta :_excited (scoot -18)] [:symmetra :_confused (scoot 6)]] "Yoga is quite A E S T H E T I C."]
    ["Symmetra" [[:mei :_neutral (scoot 8)] [:zenyatta :_neutral (scoot -18)] [:symmetra :_skeptical (scoot 6)]] "Aesthetic?"]
    ["Zenyatta" [[:mei :_neutral (scoot 8)] [:zenyatta :_explain (scoot -18)] [:symmetra :_skeptical (scoot 6)]] "Yes."]
    ["Mei" [[:mei :_pointUp (scoot 8)] [:zenyatta :_neutral (scoot -18)] [:symmetra :_skeptical (scoot 6)]] "Do you look good doing it? Or does it look good when you do it?"]
    ["Zenyatta" [[:mei :_confused (scoot 8)] [:zenyatta :_excited (scoot -18)] [:symmetra :_skeptical (scoot 6)]] "A E S T H E T I C."]
    ["Mei" [[:symmetra :_neutral (scoot 6)] [:mei :_explain (scoot 8)] [:zenyatta :_neutral (scoot -18)]] "Look, Satya, are you helping me or not? I can’t go out to drink, I need to get up early to Crossfit with my Strong Wife."]
    ["Zenyatta" [[:mei :_rollEyes (scoot 8)] [:zenyatta :_explain (scoot -18)] [:symmetra :_neutral (scoot 6)]] "Mei, this explains all your sports injuries."]
    ["Mei" [[:symmetra :_neutral (scoot 6)] [:mei :_shush (scoot 8)] [:zenyatta :_neutral (scoot -18)]] "Qīfu rén! Hush!"]
    ["Zenyatta" [[:symmetra :_neutral (scoot 6)] [:mei :_rollEyes (scoot 8)] [:zenyatta :_excited (scoot -18)]] "I recommend something better for your body. Perhaps even something A E S T H E T I C like doing yoga to vaporwave."]
    ["Mei" [[:symmetra :_neutral (scoot 6)] [:mei :_angry (scoot 8)] [:zenyatta :_neutral (scoot -18)]] "Vaporwave is an affront to actual music, like the Frozen soundtrack."]
    ["Mei" [[:symmetra :_neutral (scoot 6)] [:mei :_rollEyes (scoot 8)] [:zenyatta :_neutral (scoot -18)]] "Ugh, Philistines."]
    ["Mei" [[:symmetra :_neutral (scoot 6)] [:mei :_fist (scoot 8)] [:zenyatta :_neutral (scoot -18)]] "Satya, I’m counting on you."]
    :-> [:spawn :mei :a :option]]

   [:spawn :mei :a :option]
   [:miranda/text-option
    "What will you do?"
    ["Help Mei defend the objective" (constantly true)
     [:-> [:spawn :mei :a :option :yes]]]
    ["Embrace the tranquility of A E S T H E T I C" (constantly true)
      [:-> [:spawn :mei :a :option :zen]]]
    ["Talk to your other teammates." (constantly true)
     [:-> [:spawn :mei :a :option :no]]]]

   [:spawn :mei :a :option :yes]
   (concat
    [:miranda/dialogue
     ["Mei" [[:symmetra :_awkward (scoot 6)] [:mei :_thumbsUp (scoot 8)] [:zenyatta :_neutral (scoot -18)]] "Well, at least if I’m going to die, I’m not doing it alone this time."]]
    (inc-transition
     [:-> [:mei]]
     :points/payload))

   [:spawn :mei :a :option :zen]
   [:miranda/dialogue
    ["Mei" [[:symmetra :_neutral (scoot 6)] [:mei :_confused (scoot 8)] [:zenyatta :_neutral (scoot -18)]] "What?"]
    ["Symmetra" [[:symmetra :_explainUncomfortable (scoot 6)] [:mei :_confused (scoot 8)] [:zenyatta :_neutral (scoot -18)]] "I am sorry. We cannot win. A stretch sounds wonderful."]
    :-> [:zenyatta]]

    [:spawn :mei :a :option :no]
    [:miranda/dialogue
     ["Mei" [[:symmetra :_smile (scoot 6)] [:mei :_thumbsUp (scoot 8)] [:zenyatta :_neutral (scoot -18)]] "Okay! Try to convince them to not give up!"]
     :-> [:spawn :choice]]

   [:spawn :mei :b]
   [:miranda/dialogue
    ["Symmetra" [[:symmetra :_explainUncomfortable (scoot 6)] [:mei :_neutral (scoot 8)] [:zenyatta :_neutral (scoot -18)]] "So, I was hoping we could maybe discuss our strategy for the upcoming round?"]
    ["Mei" [[:symmetra :_neutral (scoot 6)] [:mei :_explain (scoot 8)] [:zenyatta :_neutral (scoot -18)]] "So. Here’s the deal. Everyone else is leaving for the bar and I am going home. I have gay things to do with my hot wife? The hot wife needs the cold wife. It’s a symbiotic organism. Biology 101."]
    ["Zenyatta" [[:symmetra :_WTF (scoot 6)] [:mei :_awkward (scoot 8)] [:zenyatta :_pointUp (scoot -18)]] "More like biology… 69. I believe now, we can all engage in the standard human ritual for scenarios like this."]
    ["Zenyatta" [[:symmetra :_WTF (scoot 6)] [:mei :_awkward (scoot 8)] [:zenyatta :_explain (scoot -18)]] "Please, join me."]
    ["Zenyatta" [[:symmetra :_WTF (scoot 6)] [:mei :_awkward (scoot 8)] [:zenyatta :_fingerGuns (scoot -18)]] "Nice."]
    ["Mei" [[:symmetra :_WTF (scoot 6)] [:mei :_bye (scoot 8)] [:zenyatta :_neutral (scoot -18)]] "Okay bye, Satya have fun, byeeeeeeee."]
    ["Symmetra" [[:symmetra :_explainWTF (scoot 6)] [:mei :_bye (scoot 8 -80 1.5)] [:zenyatta :_neutral (scoot -18 -5 1.5)]] "Why are you like this?"]
    ["Zenyatta" [[:symmetra :_frustrated (scoot 6)] [:zenyatta :_pointUp (scoot -5)]] "Good question. Why are any of us like anything? Gaze into the iris and contemplate that, my friend. If you wish you may do so while joining me in some relaxing yoga."]
    :-> [:spawn :mei :b :option]]

   [:spawn :mei :b :option]
   [:miranda/text-option
    "What will you do?"
    ["Devise your own strategy" (constantly true)
     [:-> [:spawn :mei :b :option :yes]]]
    ["Contemplate why you are like this" (constantly true)
      [:-> [:spawn :mei :b :option :zen]]]
    ["Talk to you other teammates" (constantly true)
     [:-> [:spawn :mei :b :option :no]]]]

   [:spawn :mei :b :option :zen]
   [:miranda/dialogue
    ["Symmetra" [[:symmetra :_explainWTF (scoot 6)] [:zenyatta :_neutral (scoot -5)]] "Fine."]
    ["Zenyatta" [[:symmetra :_WTF (scoot 6)] [:zenyatta :_explain (scoot -5)]] "To exist is to suffer. Let us all suffer under the calming tones of vaporwave and some extended crow pose."]
    :-> [:spawn :mei-b]]

    [:spawn :mei :b :option :yes]
    [:miranda/dialogue
     ["Symmetra" [[:symmetra :_eyeRoll (scoot 6)] [:zenyatta :_neutral (scoot -5)]] "I will do this all myself. It is not the first time I have done a group project by myself, only to have slackers take all the credit."]
     ["Zenyatta" [[:symmetra :_eyeRoll (scoot 6)] [:zenyatta :_explain (scoot -5)]] "A novel strategy to take in a team game. My blessings."]
     :-> [:spawn :mei-b]]

   [:spawn :mei :b :option :no]
   [:miranda/dialogue
    ["Symmetra" [[:symmetra :_eyeRoll (scoot 6)] [:zenyatta :_neutral (scoot -5)]] "Well. Time to see who else is available to salvage this doomed sinking ship. Come, Zenyatta."]
    ["Zenyatta" [[:symmetra :_eyeRoll (scoot 6)] [:zenyatta :_fingerGuns (scoot -5)]] "Nice."]
    :-> [:spawn :choice]]

   [:mei]
   [:miranda/characters
    [[]]
    :-> [:mei :text]]

   [:mei :text]
   [:miranda/narration
    "It turns out the enemy team also thought the results of the match were a foregone conclusion and had headed for the bar. The only member remaining on the enemy team was Bastion, who you and Mei had little trouble disposing of together. A well placed teleporter ensured you two that you were always able to sit on the point. It did not move an inch. Mei rewarded you with a questionable milkshake, which you felt too awkward to refuse. The ancient protein tasted chalky, and you did not need to go to the restroom for the next week."
    :=> [:blizzard-world [:hotel :intro] 0]]

   [:spawn :mei-b]
   [:miranda/narration
    "It turns out you cannot carry an Overwatch match like you could a homework assignment back in the Vishkar Academy. As soon as the spawn doors opened, Bastion’s powerful turret tore you up from range, leading to a quick and resolute defeat. As you went forward to exchange post game pleasantries with the other team you were surprised to discover that Bastion had been the only one there, as all other members of the enemy team had also left for the bar. Determined to not let your abandonment ruin your night, you head back to your hotel, take a warm bubble bath and tuck in early."
    :=> [:blizzard-world [:hotel :intro] 0]]})
