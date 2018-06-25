(ns syms-qual.data.scenes.hollywood.intro
  (:require [syms-qual.util :as util :refer [toggle-transition]]))

(def data
  {[:spawn :intro]
   [:miranda/narration
    "Much to your embarrassment, you arrived late this morning. Several streets had been blocked off for a film shoot, and the ensuing traffic caused significant delays. Tragically, you arrived only minutes before the match was to begin, and had to rush to set up your turrets. Due to your poor turret placement, the opposing team captured the first point quickly."
    "Despite this, you redeemed yourself with a well timed teleporter deployment, halting the attackers’ momentum. With the reinforcements you provided, your team managed to stall the progress of payload, driving the match well into overtime before the round reached its ultimate conclusion. With the guilt of your late arrival weighing heavily upon your shoulders, you took the brief intermission between rounds as opportunity to catch up with your teammates."
    :-> [:spawn :choice]]

   [:spawn :choice]
   [:miranda/text-option
    "What will you do?"
    ["Talk to Efi, Orisa, and Lucio" (comp not :hollywood/efi-chat)
     (toggle-transition [:-> [:spawn :efi 0]] :hollywood/efi-chat)]
    ["Talk to Sombra and Reaper" (comp not :hollywood/sombra-chat)
     (toggle-transition [:-> [:spawn :sombra 0]] :hollywood/sombra-chat)]
    ["Talk to Soldier 76" (comp not :hollywood/soldier-chat)
     (toggle-transition [:-> [:spawn :soldier 0]] :hollywood/soldier-chat)]

    ["Go with Efi, Orisa, and Lucio" :hollywood/efi-chat
     [:-> [:spawn :efi :yes]]]
    ["Go with Sombra and Reaper" :hollywood/sombra-chat
     [:-> [:spawn :sombra :yes]]]
    ["Go with Soldier 76" :hollywood/soldier-chat
     [:-> [:spawn :soldier :yes]]]]})
