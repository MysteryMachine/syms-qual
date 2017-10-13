(ns syms-qual.data.scenes.volskaya.intro)

(def data
  {[:volskaya :intro]
   [:miranda/narration
    "It sure is chilly! Some more weather appropriate gear might have been better. Of course, you stopped wearing pants into battle since that one event. You know the one. It was uncouth. You must never think of it again. Nevertheless, you are here, and you hope some action will warm your body and spirit. You find Zarya near the front door, doing exercises with Mei slung over her shoulders, using her as a human squat bar. In the back, Zenyatta is seated at the top of the stairs, the quiet dings of his orbs echoing in your ears. Finally, at the front desk, you see Widowmaker and Sombra engaged in what seems to be some lively debate."
    :-> [:volskaya :choice]]

   [:volskaya :choice]
   [:miranda/text-option
    "What will you do?"
    ["Chat with Zenyatta" (constantly true) [:-> [:volskaya :zenyatta 0]]]
    ["Chat with Sombra and Widowmaker" (constantly true) [:-> [:volskaya :sombra 0]]]
    ["Chat with Zarya and Mei" (constantly true) [:-> [:volskaya :mei 0]]]]})
