(ns syms-qual.data.scenes.volskaya.intro
  (:require [syms-qual.util :as util :refer [toggle-transition]]))

(def data
  {[:spawn :intro]
    [:miranda/narration
     [:div
      [:p.notice-head "WEEK 3"]
      [:hr.notice-hr ]
      [:p.notice-text
       [:div "VOLSKAYA INDUSTRIES"]
       [:div "Russia"]]]
    :-> [:spawn :intro2]]

  [:spawn :intro2]
   [:miranda/narration
    "It sure is chilly! Some more weather appropriate gear might have been better. Of course, you stopped wearing pants into battle since that one event. You know the one. It was uncouth. You must never think of it again. Nevertheless, you are here, and you hope some action will warm your body and spirit."
    "You find Zarya near the front door, doing exercises with Mei slung over her shoulders, using her as a human squat bar. In the back, Zenyatta is seated at the top of the stairs, the quiet dings of his orbs echoing in your ears. Finally, at the front desk, you see Widowmaker and Sombra engaged in what seems to be some lively debate."
    :-> [:spawn :choice]]

   [:spawn :choice]
   [:miranda/text-option
    "What will you do?"
    ["Chat with Zenyatta" (comp not :volskaya/zenyatta-chat)
     (toggle-transition [:-> [:spawn :zenyatta 0]] :volskaya/zenyatta-chat)]
    ["Go with Zenyatta" :volskaya/zenyatta-chat
     [:-> [:spawn :zenyatta :yes]]]

    ["Chat with Sombra and Widowmaker" (comp not :volskaya/sombra-chat)
     (toggle-transition [:-> [:spawn :sombra 0]] :volskaya/sombra-chat)]
    ["Go with Sombra" :volskaya/sombra-chat
     [:-> [:spawn :sombra :yes]]]

    ["Chat with Zarya and Mei" (comp not :volskaya/mei-chat)
     (toggle-transition [:-> [:spawn :mei 0]] :volskaya/mei-chat)]
    ["Go with Zarya and Mei" :volskaya/mei-chat
     [:-> [:spawn :mei :yes]]]]})
