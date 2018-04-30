(ns syms-qual.data.scenes.dorado.intro
  (:require [syms-qual.util :as util :refer [toggle-transition]]))

(def data
  {[:street :intro]
   [:miranda/narration
    "You find the church courtyard which serves as the offensive spawn room to have a pleasant peaceful atmosphere and you enjoy looking out at the boats gently bobbing in the moonlit harbor before the match begins."
    "To your dismay, the mood of the match itself is anything but calm. Your team is quite scattered and cannot mount any sort of coordinated push despite your best efforts. All of your attacks are quickly and brutally shut down and you are unable to move the payload more than a few meters beyond your own spawn doors. The round ends with almost no progress having been made, making  your round on defense nearly impossible. As you gather your belongings in preparation for your turn on defense, Zenyatta approaches you. "
    :-> [:street :choice]]

   [:street :choice]
   [:miranda/text-option
    "What will you do?"
    ["Talk to Sombra" (comp not :dorado/sombra-chat)
     (toggle-transition [:-> [:street :sombra 0]] :dorado/sombra-chat)]
    ["Talk to Mei" (comp not :dorado/mei-chat)
     (toggle-transition [:-> [:street :mei 0]] :dorado/mei-chat)]
    ["Talk to Genji" (comp not :dorado/genji-chat)
     (toggle-transition [:-> [:street :genji 0]] :dorado/genji-chat)]

    ["Go with Mei" :dorado/-chat
     [:-> [:street :mei :yes]]]
    ["Go to the bar" :dorado/sombra-chat
     [:-> [:street :sombra :yes]]]
    ["Go with Zenyatta" :dorado/zenyatta-chat
     [:-> [:street :zenyatta :yes]]]]

   [:street :- :no]
   [:miranda/dialogue

    :-> [:street :choice]]

   [:-]
   [:miranda/characters
    [[]]
    :-> [:- :text]]

   [:- :text]
   [:miranda/narration
    ""
    :=> [:- [:spawn :intro] 0]]})
