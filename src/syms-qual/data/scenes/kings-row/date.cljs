(ns syms-qual.data.scenes.kings-row.date
  (:require [carmen.util :as anim :refer [scoot]]))

(def data
  {[:street :junkrat 3]
   [:miranda/dialogue
    ["Symmetra" [[:junkrat :_ballNeutral (scoot 5)] [:roadhog :_neutral (scoot -25)] [:symmetra :_explain (scoot 8)]]
     "Are our preparations complete?"]
    ["Junkrat" [[:junkrat :_toastOffer (scoot 5)] [:roadhog :_toast (scoot -25)] [:symmetra :_confused (scoot 8)]]
     "Almost! Now just stick this in your mouth and start setting up under the trap."]
    ["Symmetra" [[:junkrat :_toastEat (scoot 5)] [:roadhog :_toastBite (scoot -25)] [:symmetra :_toast (scoot 8)]]
     "What is this?"]
    ["Junkrat" [[:junkrat :_toastPoint (scoot 5)] [:roadhog :_toastWipe (scoot -25)] [:symmetra :_toast (scoot 8)]]
     "The booty I promised you, love. Fairy bread."]
    ["Symmetra" [[:junkrat :_ballNeutral (scoot 5)] [:roadhog :_neutral2 (scoot -25)] [:symmetra :_toastPoint (scoot 8)]]
     "Is this toast with...sprinkles?"]
    ["Junkrat" [[:junkrat :_ballWink (scoot 5)] [:roadhog :_neutral (scoot -25)] [:symmetra :_toast (scoot 8)]]
     "Yes. Now make like an anime protagonist and shove it in your gob, we’re late to class, senpai."]
    ["Symmetra" [[:junkrat :_ballNeutral (scoot 5)] [:roadhog :_neutral (scoot -25)] [:symmetra :_toastHand (scoot 8)]]
     "This is not a sandwich."]
    ["Roadhog" [[:junkrat :_ballNeutral (scoot 5)] [:roadhog :_thumbPoint (scoot -25)] [:symmetra :_toastHand (scoot 8)]]
     "Let’s go."]
    ["Junkrat" [[:junkrat :_teethPoint (scoot 5)] [:roadhog :_drink (scoot -25)] [:symmetra :_toastChew (scoot 8)]]
     "Tasty, ‘init? I got a big sweet tooth, you can tell from all the ones that are missing. Fairy bread’s one of my favorites though, much like with explosions, I find that a dash of color really makes the experience."]
    ["Symmetra" [[:junkrat :_ballNeutral (scoot 5)] [:roadhog :_neutral (scoot -25)] [:symmetra :_toastBite (scoot 8)]]
     "Texturally, this is not want I want from toast."]
    ["Junkrat" [[:junkrat :_wrist (scoot 5)] [:roadhog :_neutral (scoot -25)] [:symmetra :_toastBite (scoot 8)]]
     "Texture, smexture, you need to try some of my cooking one of these days, I’ll cure you of these pithy notions of texture with just a bite of my sichuan peppercorn flavoring. It’s like there are pop rocks in your mouth!"]
    ["Roadhog" [[:junkrat :_ballNeutral (scoot 5)] [:roadhog :_neutral2 (scoot -25)] [:symmetra :_toastBite (scoot 8)]]
     "They ARE pop rocks."]
    ["Junkrat" [[:junkrat :_shhh (scoot 5)] [:roadhog :_neutral (scoot -25)] [:symmetra :_toastBite (scoot 8)]]
     "Oy, Roadie, shhh! Don’t betray my secret spice! You know I can't afford real sichuan peppercorns."]
    ["Roadhog" [[:junkrat :_sigh (scoot 5)] [:roadhog :_neutral2 (scoot -25)] [:symmetra :_toastBite (scoot 8)]]
     "My bad."]
    ["Symmetra" [[:junkrat :_ballFrown (scoot 5)] [:roadhog :_neutral (scoot -25)] [:symmetra :_craftTurret (scoot 8)]]
     "Focus, you two, our enemies are upon us."]
    ["Junkrat" [[:junkrat :_handsDown (scoot 5)] [:roadhog :_neutral (scoot -25)] [:symmetra :_craftTurret (scoot 8)]]
     "Ahh! You dropped the toast! We worked so hard, Roadie!"]
    ["Roadhog" [[:junkrat :_handsDown (scoot 5)] [:symmetra :_craftTurret (scoot 8)] [:roadhog :_hook (scoot 5)]]
     "Shut up and shoot, handsome boy."]
    ["Junkrat" [[:junkrat :_launcher (scoot 5 15 1)]  [:symmetra :_craftTurret (scoot 8)] [:roadhog :_hook (scoot 5)]]
     "Good point. I’ll give the enemy my anger, my fear, and all of my hunger!"]
    :-> [:street :cutscene 1]]

   [:street :cutscene 1]
   [:miranda/narration
    "The device proves to be a formidable advantage in your defense, but the enemy team eventually caught on to your gimmick, and managed to lay waste to it. Your team successfully full held the first point though, leaving your goal for the offensive round easily within reach. As you prepare for your turn on attack, you find yourself alone with Junkrat as he solemnly surveys the wreckage of his once proud creation."
    :-> [:street :junkrat 4]]})
