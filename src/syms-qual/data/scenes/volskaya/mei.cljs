(ns syms-qual.data.scenes.volskaya.mei)

(def start-date
  [:transition :miranda/mutation->basic
   [[:-> [:anubis :pharah :confirm]]
    (fn []
      ;;TODO: mutate state to indicate date
      )]])

(def data
  {[:volskaya :mei 0]
   [:miranda/dialogue
    ["Zarya" [] "You! Wimpy one!"]
    ["Symmetra" [] "Um, yes?"]
    :-> []] ;; TODO: conditional transition here

   [:volskaya :mei 1]
   [:miranda/dialogue
    ["Mei" [] "Hiya!"]
    ["Symmetra" [] "Hello?"]
    ["Zarya" [] "Your body still puny. "]
    ["Zarya" [] "Have you taken protein supplement like instructed?"]
    :-> [:volskaya :mei :option 0]]

   [:volskaya :mei :option 0]
   [:miranda/option
    "Symmetra" []
    "[Lie] Um! Yes!"
    "No. I did not."]

   [:volskaya :mei :option 0 0]
   [:miranda/dialogue
    ["Mei" [] "Did you skip leg day?"]
    ["Zarya" [] "My ice wife is correct. Your wimpy legs tremble under your puny bulk."]
    ["Mei" [] "And you’re not wearing pants!"]
    ["Symmetra" [] "It’s, um, just that, I am cold."]
    ["Zarya" [] "Let us get some training before the match! Here, you may squat beautiful ice wife."]
    ["Mei" [] "Wow, Zarya, do you really think this is a good idea?"]
    ["Zarya" [] "Is not. We train other way around. Ice wife, please deadlift weakling to demonstrate value of proper physical conditioning."]
    :-> [:volskaya :mei 1]]

   [:volskaya :mei :option 0 1]
   [:miranda/dialogue
    ["Mei" [] "You look frosty!"]
    ["Zarya" [] "Is not frost, ice wife. Is weak legs, buckle under her meager bulk. You should have some good Russian protein powder. You mix in drink. Taste like tushonka."]
    ["Mei" [] "It’s weird but effective! Zarya has me on a weightlifting bulking schedule!"]
    ["Zarya" [] "Ice wife literally capable of deadlifting armored Reinhardt. Very dense muscle."]
    ["Zarya" [] "And between you and me, ice wife is at most delectable at the end of bulking phase."]
    ["Mei" [] "Xiǎo zhū pó! I’m not THAT strong."]
    ["Zarya" [] "Is true. But my ice queen is in the top tenth percentile of strength. Easily! Ice wife! Please demonstrate that value of proper physical conditioning by deadlifting our weak comrade, here."]
    :-> []]

   [:volskaya :mei 2]
   [:miranda/dialogue
    ["Symmetra" [] "She will do no such thing!"]
    ["Mei" [] "Bǎobèi! We have to talk strategy!"]
    ["Zarya" [] "No. I have already strategized. Weakling, give your turret supply to me. I will shot putt them into the enemy lines. Ice wife will block their escape and ensure no stragglers survive."]
    ["Mei" [] "No prisoners!"]
    ["Zarya" [] "The strong do not take prisoners."]
    ["Symmetra" [] "I. Um. Will consider your proposal. And return. Later. Maybe."]
    :-> [:volskaya :mei :choice]]

   [:volskaya :mei :choice]
   [:miranda/text-option
    "What will you do?"
    ["Go with Zarya and Mei" (constantly true) start-date]
    ["Converse with your other teammates" (constantly true)
     [:volskaya :mei :no]]]

   [:volskaya :mei :yes]
   [:miranda/dialogue
    ["Zarya" [] "Good. We will show them a new form of fear."]
    :-> [:volskaya :mei :cutscene]]

   [:volskaya :mei :no]
   [:miranda/dialogue
    ["Symmetra" [] "I’ll, um, be going then."]
    :-> [:volskaya :choice]]

   [:volskaya :mei :cutscene]
   [:miranda/narration
    "Zarya’s shot putt idea worked wonderfully. While the two of you worked together to lob the turrets from long range, Mei and the rest of the team worked to zone and surround them, eventually whittling their defences down to nothing. On defense, a similarly humiliating fate befell the enemy team who was unable to even pass the first choke point. Mei and Zarya celebrated the easy victory with far too many public displays of affection. "
    :-> [:kings-row :intro]]})
