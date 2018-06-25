(ns syms-qual.data.scenes.kings-row.intro
  (:require [syms-qual.util :as util :refer [toggle-transition]]))

(def data
  {[:street :intro]
   [:miranda/narration
    "You arrive nice and early, eager to perform your duties.  You survey the first point of the map, trying to decide on the best location to set up your turrets, as the rest of your teammates arrive. They seem to have a variety of opinions on
 where best to set up."
    "Torbjorn quickly gets to work placing his turret extremely far forward, just outside of the opponent’s spawn doors. Meanwhile, Bastion and Lucio sit nonchalantly on the high ground in the back corner of the objective. Finally, Roadhog and Junkrat are huddled over something, you can’t quite make out what, just inside the choke point. You had been considering all of these locations but hadn’t quite made up your mind which you liked best yet. You decide to consult with your teammates before picking which position to fortify."
    :-> [:street :choice]]

   [:street :choice]
   [:miranda/text-option
    "What will you do?"
    ["Talk to Torbjorn" (comp not :kings-row/torb-chat)
     (toggle-transition [:-> [:street :torb 0]] :kings-row/torb-chat)]
    ["Talk to Junkrat and Roadhog" (comp not :kings-row/junkrat-chat)
     (toggle-transition [:-> [:street :junkrat 0]] :kings-row/junkrat-chat)]
    ["Talk to Bastion and Lucio" (comp not :kings-row/lucio-chat)
     (toggle-transition [:-> [:street :lucio 0]] :kings-row/lucio-chat)]

    ["Go with Torbjorn" :kings-row/torb-chat
     [:-> [:street :torb :yes]]]
    ["Go with Junkrat and Roadhog" :kings-row/junkrat-chat
     [:-> [:street :junkrat :yes]]]
    ["Go with Bastion and Lucio" :kings-row/lucio-chat
     [:-> [:street :lucio :yes]]]]})
