(ns syms-qual.data.scenes.anubis.cutscenes)

(def data
  {[:anubis :intro]
   [:miranda/narration
    "You arrive early expecting to be the first one there, but are surprised to discover that today, all of your teammates are quite prompt as well! You feel the warmth of hope fill your core, only to have it quickly dwindle as the details of the place start to form a more accurate picture in your mind. Pharah is sitting alone at the desk tucked in the far back corner of spawn, gazing nervously at another corner of the room. Following her gaze, you find Mercy and Genji, giggling furiously, deeply engaged in what you can only assume is a long convoluted inside joke. Across the room you see Reinhardt and Zarya, who appear to be holding some sort of drinking contest with several dubious looking plastic bottles of vodka. You breath deeply and try to strike up some conversation."
    :-> [:anubis :choice]]

   [:anubis :choice]
   [:miranda/text-option
    "What will you do?"
    ["Chat with Genji and Mercy" (constantly true) [:-> [:anubis :genji 0]]]
    ["Chat with Pharah" (constantly true) [:-> [:anubis :pharah 0]]]
    ["Chat with Zarya and Reinhardt" (constantly true) [:-> [:anubis :zarya 0]]]]})
