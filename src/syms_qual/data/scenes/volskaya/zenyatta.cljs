(ns syms-qual.data.scenes.volskaya.zenyatta
  (:require [carmen.util :as anim :refer [scoot]]
            [syms-qual.util :as util :refer [inc-transition]]))

(def data
  {[:spawn :zenyatta 0]
   [:miranda/dialogue
    ["Zenyatta" [[:zenyatta :_wave (scoot -75 -5 1)] [:symmetra :_helloWarm (scoot 73 3 1)]]
     "Peace be upon you, teammate. The light of the Iris shines within you."]
    :-> [:spawn :option 0]]

   [:spawn :option 0]
   [:miranda/option
    "Symmetra" [[:zenyatta :_wave (scoot -5)] [:symmetra :_neutral (scoot 3)]]
    "Greetings to you as well."
    "How does an iris produce light?"]

   [:spawn :option 0 0]
   [:miranda/dialogue
    ["Zenyatta" [[:zenyatta :_neutral (scoot -5)] [:symmetra :_neutral (scoot 3)]]
     "I sense much thirst within you."]
    ["Symmetra" [[:zenyatta :_neutral (scoot -5)] [:symmetra :_scandalized (scoot 3)]]
     "Excuse me?"]
    ["Zenyatta" [[:zenyatta :_explain (scoot -5)] [:symmetra :_scandalized (scoot 3)]]
     "Yes, the thirst of a true scholar, for the light of the iris."]
    ["Symmetra" [[:zenyatta :_neutral (scoot -5)] [:symmetra :_embarassed (scoot 3)]]
     "Oh. Um. Yes."]
    ["Zenyatta" [[:zenyatta :_pointUp (scoot -5)] [:symmetra :_awkward (scoot 3)]]
     "Granted, much like our teammates, you are thirsty in other ways."]
    ["Zenyatta" [[:zenyatta :_focus (scoot -5)] [:symmetra :_awkward (scoot 3)]]
     "But let us focus on the iris for now."]
    ["Symmetra" [[:zenyatta :_neutral (scoot -5)] [:symmetra :_embarassed (scoot 3)]]
     "Oh, okay?"]
    ["Zenyatta" [[:zenyatta :_explain (scoot -5)] [:symmetra :_neutral (scoot 3)]]
     "I sense disquiet in your soul. It is unwise to begin the match already in such a state. Before the round starts, I urge you to join me in a moment of meditation. It will clear your mind, and bring order to it’s chaos."]
    ["Symmetra" [[:zenyatta :_neutral (scoot -5)] [:symmetra :_thinking (scoot 3)]]
     "Hm, order you say. That does sound appealing..."]
    :-> [:spawn :zenyatta :choice]]

   [:spawn :option 0 1]
   [:miranda/dialogue
    ["Zenyatta" [[:zenyatta :_confused (scoot -5)] [:symmetra :_neutral (scoot 3)]]
     "Excuse me?"]
    ["Symmetra" [[:zenyatta :_confused (scoot -5)] [:symmetra :_explain (scoot 3)]]
     "It is quite literally an apparatus in your eye responsible for allowing light from some other source to enter your eye and stimulate your retina."]
    ["Zenyatta" [[:zenyatta :_pointUp (scoot -5)] [:symmetra :_neutral (scoot 3)]]
     "Such a star pupil you are! You have answered your own question!"]
    ["Symmetra" [[:zenyatta :_neutral (scoot -5)] [:symmetra :_explainWTF (scoot 3)]]
     "See, no I have not. The light still comes from another source. A telescope is a lens in much the same way."]
    ["Zenyatta" [[:zenyatta :_explain (scoot -5)] [:symmetra :_WTF (scoot 3)]]
     "A way to gaze into the light--"]
    ["Symmetra" [[:zenyatta :_explain (scoot -5)] [:symmetra :_explainAngry (scoot 3)]]
     "Of the st-"]
    ["Zenyatta" [[:zenyatta :_excited (scoot -5)] [:symmetra :_frustrated (scoot 3)]]
     "Of the iris!"]
    ["Symmetra" [[:zenyatta :_neutral (scoot -5)] [:symmetra :_frown (scoot 3)]]
     "I do not comprehend your metaphor."]
    ["Zenyatta" [[:zenyatta :_explain (scoot -5)] [:symmetra :_frown (scoot 3)]]
     "I am not being metaphorical."]
    ["Symmetra" [[:zenyatta :_neutral (scoot -5)] [:symmetra :_explainAngry (scoot 3)]]
     "I am unsure what I should be thinking, at this point."]
    ["Zenyatta" [[:zenyatta :_pointUp (scoot -5)] [:symmetra :_frown (scoot 3)]]
     "Your mind is clouded. You should join me, my friend, in meditation. Meditation is the lens that focuses the light of the iris into view."]
    :-> [:spawn :zenyatta :choice]]

   [:spawn :zenyatta :choice]
   [:miranda/text-option
    "What will you do?"
    ["Meditate with Zenyatta" (constantly true)
     [:-> [:spawn :zenyatta :yes]]]
    ["Converse with your other teammates" (constantly true)
     [:-> [:spawn :zenyatta :no]]]]


   [:spawn :zenyatta :yes]
   (concat
    [:miranda/dialogue
      ["Zenyatta" [[:zenyatta :_excited (scoot -5)] [:symmetra :_smile (scoot 3)]]
       "Excellent! First we shall go over some breathing exercises."]
      ["Symmetra" [[:zenyatta :_excited (scoot -5)] [:symmetra :_confused (scoot 3)]]
       "But you don’t even--  You know what, nevermind. Enlighten me."]]
    (inc-transition [:-> [:zenyatta :cutscene]] :volskaya/zenyatta))

   [:spawn :zenyatta :no]
   [:miranda/dialogue
    ["Zenyatta" [[:zenyatta :_explain (scoot -5)] [:symmetra :_neutral (scoot 3)]]
     "If you change your mind let me know. We can go over some breathing exercises when you return."]
    ["Symmetra" [[:zenyatta :_neutral (scoot -5)] [:symmetra :_no (scoot 3)]]
     "But you don’t even--  You know what, nevermind."]
    :-> [:spawn :choice]]

   [:zenyatta :cutscene]
   [:miranda/characters
    []
    :-> [:zenyatta :cutscene :text]]

   [:zenyatta :cutscene :text]
   [:miranda/narration
    "Zenyatta’s meditation technique seems to have proved a little too relaxing, seeing as you both fell asleep! No one on your team bothered to wake you. Although someone,  who you have a sneaking suspicion was Sombra, seems to have decorated both your faces. You defended well, due to your good rest, but you were ultimately unable to hold the point long enough to force a tie."
    :=> [:kings-row [:street :intro] 0]]})
