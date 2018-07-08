(ns syms-qual.data.scenes.dorado.intro
  (:require [carmen.util :as anim :refer [scoot]]
            [syms-qual.util :as util :refer [toggle-transition]]))

(def data
  {[:spawn :intro]
    [:miranda/narration
     [:div
      [:p.notice-head "WEEK 10"]
      [:hr.notice-hr ]
      [:p.notice-text
       [:div "DORADO"]
       [:div "Mexico"]]]
    :-> [:spawn :intro2]]

  [:spawn :intro2]
   [:miranda/narration
    "You find the church courtyard which serves as the offensive spawn room to have a pleasant peaceful atmosphere and you enjoy looking out at the boats gently bobbing in the moonlit harbor before the match begins."
    "To your dismay, the mood of the match itself is anything but calm. Your team is quite scattered and cannot mount any sort of coordinated push despite your best efforts. All of your attacks are quickly and brutally shut down and you are unable to move the payload more than a few meters beyond your own spawn doors. The round ends with almost no progress having been made, making  your round on defense nearly impossible. As you gather your belongings in preparation for your turn on defense, Zenyatta approaches you. "
    :-> [:spawn :zenyatta]]

  [:spawn :zenyatta]
   [:miranda/dialogue
    ["Zenyatta" [[:zenyatta :_wave (scoot -75 -5 1)] [:symmetra :_neutral (scoot 73 3 1)]]
      "Hello, Symmetra. I apologize for our lackluster performance, but I assure you that, in the cosmic gaze of the Iris, our failures are only minute specks."]
    ["Symmetra" [[:zenyatta :_neutral (scoot -5)] [:symmetra :_helloWarm (scoot 3)]]
      "Hello, Zenyatta. Do not worry about our performance. It is still possible for us to pull out a win, is it not? If we can organize around a more structured strategy in our defense round I am hopeful for our prospects. I should discuss our strategic options with our teammates."]
    ["Zenyatta" [[:zenyatta :_explain (scoot -5)] [:symmetra :_smile (scoot 3)]]
        "Certainly. Allow me to accompany you."]
    ["Symmetra" [[:zenyatta :_neutral (scoot -5)] [:symmetra :_explainUncomfortable (scoot 3)]]
        "Very well."]
      :-> [:spawn :choice]]

   [:spawn :choice]
   [:miranda/text-option
    "What will you do?"
    ["Talk to Sombra and Doomfist" (comp not :dorado/sombra-chat)
     (toggle-transition [:-> [:spawn :sombra 0]] :dorado/sombra-chat)]
    ["Talk to Mei" (comp not :dorado/mei-chat)
     (toggle-transition [:-> [:spawn :mei 0]] :dorado/mei-chat)]
    ["Talk to Genji" (comp not :dorado/genji-chat)
     (toggle-transition [:-> [:spawn :genji 0]] :dorado/genji-chat)]

    ["Go with Mei" #(and (:dorado/mei-chat %) (= 8 (:points/payload %)))
     [:-> [:spawn :mei :yes]]]
    ["Go on the payload" #(and (:dorado/mei-chat %) (not= 8 (:points/payload %)))
     [:-> [:spawn :mei :b :option :yes]]]
    ["Go to the bar" #(or (:dorado/sombra-chat %) (:dorado/genji-chat %))
     [:-> [:spawn :sombra :yes]]]
    ["Go with Zenyatta" #(or (:dorado/sombra-chat %) (:dorado/genji-chat %) (:dorado/mei-chat %))
     [:-> [:zenyatta]]]]})
