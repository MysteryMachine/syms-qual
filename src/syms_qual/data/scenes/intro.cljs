(ns syms-qual.data.scenes.intro)

(def data
  {[:menu-pink]
   [:miranda/narration
    [:div
     [:p.notice-head "NOTICE"]
     [:hr.notice-hr ]
     [:p.notice-text
      "Thanks for playing! Symmetra's Qualifying Matches automatically saves your game using cookies. Please be sure to enable cookies if you have disabled them."]]
    :-> [:a]]

   [:a]
   [:miranda/narration
    "As you board the transport parked on the helipad you feel your stomach knot in anticipation. Today is the day you must participate in the first of your qualifying matches under the recently reinstated Overwatch program. Over the next ten weeks, these matches will determine your placement within the program’s competitive hierarchy by testing your combat skills."
    :-> [:a :img]]

   [:a :img]
   [:miranda/characters
    [[]]
    :-> [:b]]

   [:b]
   [:miranda/narration
    "Originally developed as an international military task force to deal with the robot wars of the Omnic Crisis, Overwatch was disbanded several years ago at the behest of the UN. However, some of their former agents, namely a hyper intelligent talking gorilla and a time traveling lesbian, have taken it upon themselves to revive the program. After regaining UN approval with the help of a new sponsor, they have begun recruiting new and former members back into its ranks. "
    :-> [:b :img]]

   [:b :img]
   [:miranda/characters
    [[]]
    :-> [:c]]

   [:c]
   [:miranda/narration
    "While you can’t imagine what your employer, The Vishkar Corporation, is going to gain from your participation in such an operation, it’s not your place to question their orders. From the intel they’ve gathered, it seems Overwatch agent’s missions largely consist of attempting, and mostly failing to escort payloads. Vishkar strategists have advised you to focus on maintaining direct contact with this payload in your qualifying endeavors"
    :-> [:c :img]]

   [:c :img]
   [:miranda/characters
    [[]]
    :-> [:d]]

   [:d]
   [:miranda/narration
    "However, your superiors have also indicated that gaining intel on the project as a whole is an equally important part of your mission and to this end have suggested you get to know some of your teammates. While you personally feel it is important to maintain Vishkar’s worldwide reputation for excellence by performing well in your matches, how you prioritize these goals has been left at your discretion."
    :-> [:d :img]]

   [:d :img]
   [:miranda/characters
    [[]]
    :=> [:route-66 [:diner :intro] 0]]})
