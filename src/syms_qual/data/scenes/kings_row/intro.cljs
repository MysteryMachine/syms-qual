(ns syms-qual.data.scenes.kings-row.intro
  (:require [syms-qual.util :as util :refer [toggle-transition]]))

(def data
  {[:street :intro]
    [:miranda/narration
     [:div
      [:p.notice-head "WEEK 4"]
      [:hr.notice-hr ]
      [:p.notice-text
       [:div "KING'S ROW"]
       [:div "United Kingdom"]]]
    :-> [:street :intro2]]

  [:street :intro2]
   [:miranda/narration
    "Upon your arrival, you survey the first point of the map, trying to decide on the best location to set up. Although, there are many good options, you can't quite make up your mind. As you are trying to decide, the rest of your teammates arrive and begin to set up on their own, each in different locations, making your decision all the more difficult."
    "Torbjorn quickly gets to work placing his turret extremely far forward, just outside of the opponent’s spawn doors. Meanwhile, Bastion and Lucio are perched on the high ground in the back corner. Finally, Roadhog and Junkrat are huddled over something, you can't quite make out what, just inside the choke point. You decide to consult with your teammates before picking which position to fortify."
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
