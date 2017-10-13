(ns syms-qual.data.scenes.volskaya.zenyatta)

(def start-date
  [:transition :miranda/mutation->basic
   [[:-> [:anubis :pharah :confirm]]
    (fn []
      ;;TODO: mutate state to indicate date
      )]])

(def data
  {[:volskaya :zenyatta 0]
   [:miranda/dialogue
    ["Zenyatta" [] "Peace be upon you, teammate. The light of the Iris shines within you."]
    :-> [:volskaya :option 0]]

   [:volskaya :option 0]
   [:miranda/option
    "Symmetra" []
    "Greetings to you as well."
    "How does an iris shine light?"]

   [:volskaya :option 0 0]
   [:miranda/dialogue
    ["Zenyatta" [] "I sense much thirst within you."]
    ["Symmetra" [] "Excuse me?"]
    ["Zenyatta" [] "Yes, the thirst of a true scholar, for the light of the iris."]
    ["Symmetra" [] "Oh. Um. Yes."]
    ["Zenyatta" [] "Granted, much like our teammates, you are thirsty in other ways."]
    ["Zenyatta" [] "but let us focus on the iris for now."]
    ["Symmetra" [] "Oh, okay?"]
    ["Zenyatta" [] "I sense disquiet in your soul. It is unwise to begin the match already in such a state. Before the round starts, I urge you to join me in a moment of meditation. It will clear your mind, and bring order to it’s chaos."]
    ["Symmetra" [] "Hm, order you say. That does sound appealing..."]
    :-> [:volskaya :zenyatta :choice]]

   [:volskaya :option 0 1]
   [:miranda/dialogue
    ["Zenyatta" [] "Excuse me?"]
    ["Symmetra" [] "It is quite literally an apparatus in your eye responsible for allowing light from some other source to enter your eye and stimulate your retina."]
    ["Zenyatta" [] "Such a star pupil you are! You have answered your own question!"]
    ["Symmetra" [] "See, no I have not. The light still comes from another source. A telescope is a lens in much the same way."]
    ["Zenyatta" [] "A way to gaze into the light--"]
    ["Symmetra" [] "Of the st-"]
    ["Zenyatta" [] "Of the iris!"]
    ["Symmetra" [] "You do not understand my metaphor."]
    ["Zenyatta" [] "And I am not being metaphorical."]
    ["Symmetra" [] "I am unsure what I should be thinking, at this point."]
    ["Zenyatta" [] "Your mind is clouded. You should join me, my friend, in meditation. Meditation is the lens that focuses the light of the iris into view."]
    :-> [:volskaya :zenyatta :choice]]

   [:volskaya :zenyatta :choice]
   [:miranda/text-option
    "What will you do?"
    ["Meditate with Zenyatta" (constantly true) start-date]
    ["Converse with your other teammates" (constantly true)
     [:volskaya :zenyatta :no]]]


   [:volskaya :zenyatta :yes]
   [:miranda/dialogue
    ["Zenyatta" [] "Excellent! First we shall go over some breathing exercises."]
    ["Symmetra" [] "But you don’t even--  You know what, nevermind. Enlighten me."]
    :-> [:volskaya :zenyatta :cutscene]]

   [:volskaya :zenyatta :no]
   [:miranda/dialogue
    ["Zenyatta" [] "If you change your mind let me know. We can go over some breathing exercises when you return."]
    ["Symmetra" [] "But you don’t even--  You know what, nevermind."]
    :-> [:volskaya :choice]]

   [:volskaya :zenyatta :cutscene]
   [:miranda/narration
    "Zenyatta’s meditation technique seems to have proved a little too relaxing, seeing as you both fell asleep! No one on your team bothered to wake you. Although someone,  who you have a sneaking suspicion was Sombra, seems to have decorated both your faces. You defended well, due to your good rest, but you were ultimately unable to hold the point long enough to force a tie."
    :-> [:kings-row :intro]]})
