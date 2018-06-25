(ns syms-qual.data.scenes.volskaya.mei
  (:require [carmen.util :as anim :refer [scoot]]
            [syms-qual.util :as util :refer [inc-transition]]))

(def data
  {[:spawn :mei 0]
   [:miranda/dialogue
    ["Zarya" [[:zarya_mei :_zaryaYell (scoot -90 -20 1)] [:symmetra :_awkward (scoot 73 3 1)]] "You! Wimpy one!"]
    ["Symmetra" [[:zarya_mei :_neutralUp (scoot -20)] [:symmetra :_confused (scoot 3)]]
     "Um, yes?"]
    :transition :miranda/conditional
    [:anubis/zarya-chat [:-> [:spawn :mei 1]]
     :else              [:-> [:spawn :mei :option 0 1]]]]

   [:spawn :mei 1]
   [:miranda/dialogue
    ["Mei" [[:zarya_mei :_meiHi (scoot -20)] [:symmetra :_confused (scoot 3)]]
     "Hiya!"]
    ["Symmetra" [[:zarya_mei :_neutralUp (scoot -20)] [:symmetra :_helloNeutral (scoot 3)]]
     "Hello?"]
    ["Zarya" [[:zarya_mei :_zaryaYell (scoot -20)] [:symmetra :_awkward (scoot 3)]]
     "Your body still puny."]
    ["Zarya" [[:zarya_mei :_zaryaSkeptical (scoot -20)] [:symmetra :_awkward (scoot 3)]]
     "Have you taken protein supplement like instructed?"]
    :-> [:spawn :mei :option 0]]

   [:spawn :mei :option 0]
   [:miranda/option
    "Symmetra" [[:zarya_mei :_neutralDown (scoot -20)] [:symmetra :_awkward (scoot 3)]]
    "[Lie] Um! Yes!"
    "No. I did not."]

   [:spawn :mei :option 0 0]
   [:miranda/dialogue
    ["Mei" [[:zarya_mei :_meiDisappointed (scoot -20)] [:symmetra :_frustratedConfused (scoot 3)]]
     "Did you skip leg day?"]
    ["Zarya" [[:zarya_mei :_zaryaExplain (scoot -20)] [:symmetra :_frustratedConfused (scoot 3)]]
     "My ice wife is correct. Your wimpy legs tremble under your puny bulk."]
    ["Mei" [[:zarya_mei :_meiPoint (scoot -20)] [:symmetra :_1000Mile (scoot 3)]]
     "And you’re not wearing pants!"]
    ["Symmetra" [[:zarya_mei :_neutralDown (scoot -20)] [:symmetra :_explainUncomfortable (scoot 3)]]
     "It’s, um, just that, I am cold."]
    ["Zarya" [[:zarya_mei :_zaryaExplain (scoot -20)] [:symmetra :_awkward (scoot 3)]]
     "Lack of bulk. Muscle and fat help to insulate. I teach you bulking later."]
    :-> [:spawn :mei 2]]

   [:spawn :mei :option 0 1]
   [:miranda/dialogue
    ["Mei" [[:zarya_mei :_meiPoint (scoot -20)] [:symmetra :_awkward (scoot 3)]]
     "You look frosty!"]
    ["Zarya" [[:zarya_mei :_zaryaExplain (scoot -20)] [:symmetra :_frustratedConfused (scoot 3)]]
     "Is not frost, ice wife. Is weak legs, buckle under her meager bulk. You should have some good Russian protein powder. You mix in drink. Taste like tushonka."]
    ["Mei" [[:zarya_mei :_meiHi (scoot -20)] [:symmetra :_frustratedConfused (scoot 3)]]
     "It’s weird but effective! Zarya has me on a weightlifting bulking schedule!"]
    ["Zarya" [[:zarya_mei :_zaryaExplain (scoot -20)] [:symmetra :_frustratedConfused (scoot 3)]]
     "Ice wife literally capable of deadlifting armored Reinhardt. Very dense muscle."]
    :-> [:spawn :mei 2]]

   [:spawn :mei 2]
   [:miranda/dialogue
    ["Zarya" [[:zarya_mei :_zaryaSmutty (scoot -20)] [:symmetra :_1000Mile (scoot 3)]]
     "And between you and me, ice wife is at most delectable at the end of bulking phase."]
    ["Mei" [[:zarya_mei :_meiBlush (scoot -20)] [:symmetra :_1000Mile (scoot 3)]]
     "Xiǎo zhū pó! I’m not THAT strong."]
    ["Zarya" [[:zarya_mei :_zaryaExplain (scoot -20)] [:symmetra :_1000Mile (scoot 3)]]
     "Is true. But my ice queen is in the top tenth percentile of strength. Easily! Ice wife! Please demonstrate that value of proper physical conditioning by deadlifting our weak comrade, here."]
    ["Symmetra" [[:zarya_mei :_neutralDown (scoot -20)] [:symmetra :_angry (scoot 3)]]
     "She will do no such thing!"]
    ["Mei" [[:zarya_mei :_meiDisappointedZarya (scoot -20)] [:symmetra :_angry (scoot 3)]]
     "Bǎobèi! We have to talk strategy!"]
    ["Zarya" [[:zarya_mei :_zaryaExplain (scoot -20)] [:symmetra :_frustrated (scoot 3)]]
     "No. I have already strategized. Weakling, give your turret supply to me. I will shot putt them into the enemy lines. Ice wife will block their escape and ensure no stragglers survive."]
    ["Mei" [[:zarya_mei :_meiEvilSmile (scoot -20)] [:symmetra :_frustratedConfused (scoot 3)]]
     "No prisoners!"]
    ["Zarya" [[:zarya_mei :_zaryaEvilSmile (scoot -20)] [:symmetra :_frustratedConfused (scoot 3)]]
     "The strong do not take prisoners."]
    ["Symmetra" [[:zarya_mei :_makeOuts (scoot -20)] [:symmetra :_1000Mile (scoot 3)]]
     "I. Um. Will consider your proposal. And return. Later. Maybe."]
    :-> [:spawn :mei :choice]]

   [:spawn :mei :choice]
   [:miranda/text-option
    "What will you do?"
    ["Submit to rigorous physical activity" (constantly true)
     [:-> [:spawn :mei :yes]]]
    ["Converse with your other teammates" (constantly true)
     [:-> [:spawn :mei :no]]]]

   [:spawn :mei :yes]
   (concat
    [:miranda/dialogue
     ["Symmetra" [[:zarya_mei :_makeOuts (scoot -20)] [:symmetra :_explainUncomfortable (scoot 3)]]
      "I think your plan is optimal. I will aid you."]
     ["Symmetra" [[:zarya_mei :_makeOuts (scoot -20)] [:symmetra :_frustratedConfused (scoot 3)]]
      "But let me emphasize I am doing this in a strictly professional sense."]
     ["Zarya" [[:zarya_mei :_zaryaEvilSmile (scoot -20)] [:symmetra :_frustratedConfused (scoot 3)]]
      "Good. We will show them a new form of fear."]]
    (inc-transition [:-> [:zarya :cutscene]] :points/payload :volskaya/mei))

   [:spawn :mei :no]
   [:miranda/dialogue
    ["Symmetra" [[:zarya_mei :_makeOuts (scoot -20)] [:symmetra :_pointBack (scoot 3)]]
     "I’ll, um, be going then."]
    :-> [:spawn :choice]]

   [:zarya :cutscene]
   [:miranda/characters
    [[]]
    :-> [:zarya :cutscene :text]]

   [:zarya :cutscene :text]
   [:miranda/narration
    "Zarya’s shot putt idea worked wonderfully. While the two of you worked together to lob the turrets from long range, Mei and the rest of the team worked to zone and surround them, eventually whittling their defences down to nothing. On defense, a similarly humiliating fate befell the enemy team who was unable to even pass the first choke point. Mei and Zarya celebrated the easy victory with far too many public displays of affection. "
    :=> [:kings-row [:street :intro] 0]]})
