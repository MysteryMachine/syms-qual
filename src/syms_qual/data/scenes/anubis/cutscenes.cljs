(ns syms-qual.data.scenes.anubis.cutscenes
  (:require [syms-qual.util :as util :refer [toggle-transition]]))

(def data
  {[:spawn :intro]
    [:miranda/narration
     [:div
      [:p.notice-head "WEEK 2"]
      [:hr.notice-hr ]
      [:p.notice-text
       [:div "TEMPLE OF ANUBIS"]
       [:div "Egypt"]]]
    :-> [:spawn :intro2]]

    [:spawn :intro2]
   [:miranda/narration
    "You arrive early expecting to be the first one there, but are surprised to discover that today, all of your teammates are quite prompt as well! You feel the warmth of hope fill your core, only to have it quickly dwindle as the details of the place start to form a more accurate picture in your mind."
    "Pharah is sitting alone at the desk tucked in the far back corner of spawn, gazing nervously at another corner of the room. Following her gaze, you find Mercy and Genji, giggling furiously, deeply engaged in what you can only assume is a long convoluted inside joke. Across the room you see Reinhardt and Zarya, who appear to be holding some sort of drinking contest with several dubious looking plastic bottles of vodka. You breathe deeply and try to strike up some conversation."
    :-> [:spawn :choice]]

   [:spawn :choice]
   [:miranda/text-option
    "What will you do?"
    ["Chat with Genji and Mercy" (comp not :anubis/genji-chat)
     (toggle-transition [:-> [:spawn :genji 0]] :anubis/genji-chat)]
    ["Go with Genji and Mercy" :anubis/genji-chat
     [:-> [:spawn :genji :yes]]]

    ["Chat with Pharah" (comp not :anubis/pharah-chat)
     (toggle-transition [:-> [:spawn :pharah 0]] :anubis/pharah-chat)]
    ["Go with Pharah" :anubis/pharah-chat
     [:-> [:spawn :pharah :date-start]]]

    ["Chat with Zarya and Reinhardt" (comp not :anubis/zarya-chat)
     (toggle-transition [:-> [:spawn :zarya 0]] :anubis/zarya-chat)]
    ["Go with Zarya and Reinhardt" :anubis/zarya-chat
     [:-> [:spawn :zarya :yes]]]]})
