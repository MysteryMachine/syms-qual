(ns syms-qual.data.scenes.dorado.sombra
  (:require [carmen.util :as anim :refer [scoot]]
            [syms-qual.util :as util :refer [inc-transition]]))

(def data
  {[:spawn :sombra 0]
    [:miranda/dialogue
    ["Sombra" [[:sombra :_wave (scoot -80 12 1.5)]  [:doomfist :_neutral (scoot -80 -20 1.5)] [:symmetra :_smile (scoot 80 10 1.5)]]
      "Satya! Come here!"]
     ["Symmetra" [[:sombra :_neutral (scoot 12)]  [:doomfist :_neutral (scoot -20)] [:symmetra :_helloWarm (scoot 10)]]
      "How are you doing, Sombra?"]
     ["Sombra" [[:sombra :_introBehind (scoot 12)]  [:doomfist :_neutral (scoot -20)] [:symmetra :_smile (scoot 10)]]
      "I’m sure you know Akande. "]
     ["Doomfist" [[:sombra :_neutral (scoot 12)]  [:doomfist :_wave (scoot -20)] [:symmetra :_smile (scoot 10)]]
      "Hello again, Satya."]
     ["Sombra" [[:sombra :_leanin (scoot 12)]  [:doomfist :_neutral (scoot -20)] [:symmetra :_smile (scoot 10)]]
      "Akande and I are taking all the cool kids in the match to the bar. Be there or be, like, doing yoga with Zenyatta."]
     ["Zenyatta" [[:sombra :_neutral (scoot 12 18 1.5)]  [:doomfist :_smirk (scoot -20 -3 1.5)] [:zenyatta :_wave (scoot -80 -22 1.5)] [:symmetra :_smile (scoot 10)]]
      "Hello, Sombra. How did you know I would be doing yoga?"]
     ["Sombra" [[:sombra :_self (scoot 18)]  [:doomfist :_neutral (scoot -3)] [:zenyatta :_neutral (scoot -22)] [:symmetra :_confused (scoot 10)]]
      "I have implanted a worm into your neural systems. I know your every thought."]
     ["Zenyatta" [[:sombra :_neutral (scoot 18)]  [:doomfist :_neutral (scoot -3)] [:zenyatta :_pointUp (scoot -22)] [:symmetra :_confused (scoot 10)]]
      "I feel like this may raise existential concerns, does it not?"]
     ["Sombra" [[:sombra :_shrug (scoot 18)]  [:doomfist :_neutral (scoot -3)] [:zenyatta :_neutral (scoot -22)] [:symmetra :_confused (scoot 10)]]
      "Maybe?"]
     ["Doomfist" [[:sombra :_neutral (scoot 18)]  [:doomfist :_eyeRoll (scoot -3)] [:zenyatta :_neutral (scoot -22)] [:symmetra :_confused (scoot 10)]]
      "You are probably fine."]
     ["Zenyatta" [[:sombra :_laugh (scoot 18)]  [:doomfist :_laugh (scoot -3)] [:zenyatta :_excited (scoot -22)] [:symmetra :_confused (scoot 10)]]
      "Wonderful! It is as if I am living in a thought experiment."]
     ["Sombra" [[:sombra :_wink (scoot 18)]  [:doomfist :_smirk (scoot -3)] [:zenyatta :_neutral (scoot -22)] [:symmetra :_confused (scoot 10)]]
      "That’s my boy."]
     ["Symmetra" [[:sombra :_neutral (scoot 18)]  [:doomfist :_neutral (scoot -3)] [:zenyatta :_neutral (scoot -22)] [:symmetra :_skeptical (scoot 10)]]
      "I...have concerns?"]
     ["Sombra" [[:sombra :_flirty (scoot 18)]  [:doomfist :_neutral (scoot -3)] [:zenyatta :_neutral (scoot -22)] [:symmetra :_skeptical (scoot 10)]]
      "Hey who has time for ethics when we’ll be having tequila and/or your favorite nonalcoholic beverage of choice! Getting drunk isn’t required, but your presence is!"]
     ["Doomfist" [[:sombra :_neutral (scoot 18)]  [:doomfist :_pointUp (scoot -3)] [:zenyatta :_neutral (scoot -22)] [:symmetra :_neutral (scoot 10)]]
      "There is no shame in a Shirley Temple. You can carbo load on them with me, if you wish."]
     ["Zenyatta" [[:sombra :_neutral (scoot 18)]  [:doomfist :_neutral (scoot -3)] [:zenyatta :_explain (scoot -22)] [:symmetra :_neutral (scoot 10)]]
      "Or, you could join me in a refreshing round of yoga."]
     ["Sombra" [[:sombra :_vodkaHoldOn (scoot 18)]  [:doomfist :_neutral (scoot -3)] [:zenyatta :_neutral (scoot -22)] [:symmetra :_WTF (scoot 10)]]
      "Hush, I can’t get this into the bar so we have to finish it on the way!"]

     :-> [:spawn :sombra :choice]]

  [:spawn :sombra :choice]
   [:miranda/text-option
    "What will you do?"
    ["Accompany the gang to the bar." (constantly true)
     [:-> [:spawn :sombra :yes]]]
     ["Have a refreshing round of yoga" (constantly true)
      [:-> [:spawn :sombra :zen]]]
    ["Talk to your other teammates" (constantly true)
     [:-> [:spawn :sombra :no]]]]

   [:spawn :sombra :yes]
   [:miranda/dialogue
   ["Symmetra" [[:sombra :_vodkaHoldOn (scoot 18)]  [:doomfist :_neutral (scoot -3)] [:zenyatta :_neutral (scoot -22)] [:symmetra :_no (scoot 10)]]
    "Let us go. However, I will not be touching ANY of your warm pocket vodka."]
   ["Sombra" [[:sombra :_vodkaShrug (scoot 18)]  [:doomfist :_neutral (scoot -3)] [:zenyatta :_neutral (scoot -22)] [:symmetra :_neutral (scoot 10)]]
     "Suit yourself. More for me!"]
    :-> [:calveras :sombra 0]]

   [:spawn :sombra :zen]
   [:miranda/dialogue
   ["Sombra" [[:symmetra :_neutral (scoot 10)] [:sombra :_dismayed (scoot 18)]  [:doomfist :_neutral (scoot -3)] [:zenyatta :_neutral (scoot -22)]]
     "Mas por que?"]
   ["Zenyatta" [[:sombra :_frown (scoot 18)]  [:doomfist :_neutral (scoot -3)] [:zenyatta :_excited (scoot -22)] [:symmetra :_neutral (scoot 10)]]
       "Why not have your worm figure it out?"]
   ["Sombra" [[:sombra :_awkward (scoot 18)]  [:doomfist :_laugh (scoot -3)] [:zenyatta :_neutral (scoot -22)] [:symmetra :_interested (scoot 10)]]
         "..."]
    :-> [:zenyatta]]

   [:spawn :sombra :no]
   [:miranda/dialogue
   ["Symmetra" [[:sombra :_neutral (scoot 18)]  [:doomfist :_neutral (scoot -3)] [:zenyatta :_neutral (scoot -22)] [:symmetra :_explain (scoot 10)]]
     "I’m going to see what others are doing."]
   ["Sombra" [[:sombra :_wave (scoot 18)]  [:doomfist :_neutral (scoot -3)] [:zenyatta :_neutral (scoot -22)] [:symmetra :_neutral (scoot 10)]]
       "Ok! But please come back"]
    :-> [:spawn :choice]]})
