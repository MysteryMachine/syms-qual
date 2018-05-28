(ns syms-qual.data.scenes.blizzard.one
  (:require [carmen.util :as anim :refer [scoot fade-out fade-in]]
            [syms-qual.util :as util :refer [inc-transition]]))

(def data
  {[:party :moira 0]
    [:miranda/dialogue
    ["Symmetra" [[:moira :_ghost (fade-out [13 0] 1)] [:moira :_neutral (fade-in [5 0] 1)] [:symmetra :_bewildered (scoot 2)]]
      "I know I’ve had some time to get used to it, but that still startles me every time you do it."]
    ["Moira" [[:moira :_explain (scoot 5)] [:symmetra :_smile (scoot 2)]]
      "My apologizes. But I find that both a quick entrance and quick exit is most suitable at these functions. Parties like these are not my strong suit."]
    ["Symmetra" [[:moira :_neutral (scoot 5)] [:symmetra :_explainUncomfortable (scoot 2)]]
      "To be honest they aren’t really mine either. "]
    ["Moira" [[:moira :_explainLaugh (scoot 5)] [:symmetra :_smile (scoot 2)]]
      "Haha, I might have guessed. I think we have a lot in common, you and I. It’s a pity we didn’t get to spend more time together."]
    ["Symmetra" [[:moira :_neutral (scoot 5)] [:symmetra :_explainUncomfortable (scoot 2)]]
      "With an organization of this size and scope some scheduling issues were bound to arise."]
    ["Moira" [[:moira :_explain (scoot 5)] [:symmetra :_smile (scoot 2)]]
      "You should visit my lab in Oasis some time. I think you’d like it there."]
    ["Symmetra" [[:moira :_neutral (scoot 5)] [:symmetra :_sass (scoot 2)]]
      "I’d love to. Have you--"]
     ["Moira" [[:moira :_lookBack (scoot 5)] [:symmetra :_bewildered (scoot 2)]]
      "Quiet. Oh sweet Sasuke’s up-do, I think my niece is on my trail. Enough of this small talk. I must escape."]
     ["Symmetra" [[:moira :_neutral (scoot 5)] [:symmetra :_confused (scoot 2)]]
      "From your neice?"]
     ["Moira" [[:moira :_explain (scoot 5)] [:symmetra :_awkward (scoot 2)]]
      "That animal prefers dubs to subs, Symmetra. She is sub-human, and I refuse to even consider her replacement to one of my lab apes. At least they respect the honor of the original nihon-go. Please perform some sort of verbal Kagemane no Jutsu on her so I may escape."]
     ["Symmetra" [[:moira :_ghost (fade-in [13 0] 0.5)] [:moira :_neutral (fade-out [5 0] 0.5)] [:symmetra :_awkward (scoot 2)]]
      "..."]
     ["???" [[:symmetra :_awkward (scoot 2)] [:moira :_ghost (scoot 13 100 2)]]
       "Was that Aunt Moira? I swear that it was, but it seems like she disappears into thin air everytime I catch sight of her. She keeps going on about subs or something, but I don’t understand what substitution jutsu has to do with anything I’m talking about?"]
     ["Tracer" [[:symmetra :_smile (scoot 2)] [:tracer :_wave (scoot -80 -15 1.5)]]
      "Emily, there you are! Satya, have you met my girlfriend, yet?"]
     ["Symmetra" [[:symmetra :_helloWarm (scoot 2)] [:tracer :_neutral (scoot -15)]]
      "Pleased to make your acquaintance!"]
     ["Emily" [[:symmetra :_smile (scoot 2)] [:tracer :_neutral (scoot -15)]]
      "Likewise!"]
      ["Symmetra" [[:symmetra :_explain (scoot 2)] [:tracer :_neutral (scoot -15)]]
      "How did your race end up going, Lena?"]
     ["Tracer" [[:symmetra :_WTF (scoot 2)] [:tracer :_smile (scoot -15)]]
      "Fast!"]
      ["Symmetra" [[:symmetra :_WTF (scoot 2)] [:tracer :_neutral (scoot -15)]]
      "..."]
      ["Emily" [[:symmetra :_WTF (scoot 2)] [:tracer :_neutral (scoot -15)]]
      "I think I see her over there by the open bar. Come on, let’s go!"]
      ["Tracer" [[:symmetra :_neutral (scoot 2)] [:tracer :_wave (scoot -15)]]
      "Gotta run. But good to see you!"]
      ["Symmetra" [[:symmetra :_skeptical (scoot 2)] [:tracer :_neutral (scoot -15 90 1.5)]]
        "Hmmm, what’s that obnoxious hammering noise..."]
      ["Torbjorn" [[:symmetra :_WTF (scoot 2)] [:torbjorn :_crankyCart (scoot -65 -10 6)]]
        "..."]
      ["Symmetra" [[:symmetra :_explainWTF (scoot 2)] [:torbjorn :_crankyCart (scoot -10 0 3)]]
        "Did you just build a military grade IKEA turret in an amusement park? What is wrong with you?"]
      ["Torbjorn" [[:symmetra :_WTF (scoot 2)] [:torbjorn :_handHipAngryCart (scoot 0 10 3)]]
        "Don’t tell me how to live my life!"]
      ["Symmetra" [[:symmetra :_eyeRoll (scoot 2)] [:torbjorn :_crankyCart (scoot 10 105 7.5)]]
        "..."]
      ["Doomfist" [[:symmetra :_neutral (scoot 2)] [:widowmaker :_neutralRight (scoot -80 -15 1.5)] [:doomfist :_point (scoot -80 -20 1.5)]]
        "Satya! Congrats for not punking out for ten matches."]
      ["Widowmaker" [[:symmetra :_WTF (scoot 2)] [:widowmaker :_tch (scoot -15)] [:doomfist :_neutral (scoot -20)]]
      "Tch. Her gun does not even require aiming. Disgusting."]
      ["Doomfist" [[:symmetra :_WTF (scoot 2)] [:widowmaker :_tch (scoot -15)] [:doomfist :_smirk (scoot -20)]]
       "Oh."]
      ["Doomfist" [[:symmetra :_neutral (scoot 2)] [:widowmaker :_neutral (scoot -15)] [:doomfist :_phoneHold (scoot -20)]]
        "Who could be calling me? I told everyone I was not to be disturbed while I was here."]
      ["Doomfist" [[:symmetra :_frustratedConfused (scoot 2)] [:widowmaker :_neutral (scoot -15)] [:doomfist :_phoneTalk (scoot -20)]]
        "What do you mean someone assembled an IKEAtm military grade turret on a children’s theme park ride? This is a PR nightmare."]
      ["Doomfist" [[:symmetra :_frustratedConfused (scoot 2)] [:widowmaker :_neutral (scoot -15)] [:doomfist :_armsCrossSalty (scoot -20)]]
        "Looks like we have some cleaning up to do. Let’s go, La Croix."]
      [nil [[:symmetra :_distracted (scoot 2)] [:widowmaker :_neutral (scoot -15 -80 1.5)] [:doomfist :_armsCrossSalty (scoot -20 -80 1.5)]]
        "Your stomach begins to grumble and you decide it might be time to hit up the grill."]
      ["Efi" [[:bastion :_neutral (scoot -80 -2 1.5)] [:orisa :_neutralHappy (scoot -85 -18 1.5)] [:efi :_wave (scoot -80 -24 1.5)] [:symmetra :_smile (scoot 2 5 1.5)]]
        "Symmetra! Just the gal I was looking for!"]
      ["Symmetra" [[:bastion :_neutral (scoot -2)] [:orisa :_neutralHappy (scoot -18)] [:efi :_neutral (scoot -24)] [:symmetra :_explainUncomfortable (scoot 5)]]
          "Hello, Efi. I was just on the way to the grill to grab some food."]
      ["Efi" [[:bastion :_neutral (scoot -2)] [:orisa :_neutralHappy (scoot -18)] [:efi :_smug (scoot -24)] [:symmetra :_smile (scoot 5)]]
        "Are you sure? Because I’m pretty sure you should come with us to ride some amazing roller coasters!"]
      ["Symmetra" [[:bastion :_neutral (scoot -2)] [:orisa :_neutralHappy (scoot -18)] [:efi :_neutral (scoot -24)] [:symmetra :_thinking (scoot 5)]]
        "I don’t know. I’m pretty hungry. I think I’ll catch up with you guys later."]
      ["Efi" [[:bastion :_neutral (scoot -2 -80 3)] [:orisa :_neutralHappy (scoot -18 -85 3)] [:efi :_wave (scoot -24 -80 3)] [:symmetra :_smile (scoot 5)]]
        "Alright! We'll save you a spot in line."]
      ["Lucio" [[:lucio :_smile (scoot -80 5 1.5)]  [:symmetra :_smile (scoot 5)]]
        "Symmetra! Congrats on your big day! If your here for an X-Tudo though, you’re gonna have to wait. Winston just took like 5 of them and left. I need time to make more."]
      ["Soldier 76" [[:soldier76 :_grillDrinkPointUp (scoot 80 18 1.5)] [:lucio :_neutral (scoot 5 -5 1.5)]  [:symmetra :_neutral (scoot 5 7 1.5)]]
        "Lucio, stop trying to push your veganism onto other people. She’s obviously here for a real burger. Plain. Meat. Bun. Free ketchup I smuggled out of the McDonalds in my tactical fanny pack. The true American picnic staple."]
      ["Soldier 76" [[:soldier76 :_grillDrink (scoot 18)] [:lucio :_neutral (scoot -5)]  [:symmetra :_confused (scoot 7)]]
        "Just say the word, soldier, and I will incinerate ground animal carcasses in your honor."]
      ["Symmetra" [[:soldier76 :_grillDrinkNeutral (scoot 18)] [:lucio :_neutral (scoot -5)]  [:symmetra :_no (scoot 7)]]
      "I'm not sure that will not be necessary..."]
      ["Reaper" [[:soldier76 :_grillDrinkNeutral (scoot 18 10 1.5)] [:reaper :_reverseExplain (scoot 80 11 1.5)] [:lucio :_neutral (scoot -5 -7 1.5)]  [:symmetra :_confused (scoot 7)]]
      "You can calm down now. I’m here. My elotes are obviously the best thing on this grill and you don’t have to waste time pretending to be nice to these two terrible cooks anymore."]
      ["Mei" [[:zarya :_skeptical (scoot -80 -15 1.5)] [:mei :_confused (scoot -80 -20 1.5)] [:soldier76 :_grillDrinkNeutral (scoot 10 18 1.5)] [:reaper :_reverseNeutral (scoot 11 15 1.5)] [:lucio :_jammin (scoot -7 25 1.5)] [:symmetra :_confused (scoot 7 9 1.5)]]
      "Is this all there is? Someone said there were turkey legs."]
      ["Zarya" [[:zarya :_pointUp (scoot -15)] [:mei :_confused (scoot -20)] [:soldier76 :_grillDrinkNeutral (scoot 18)] [:reaper :_reverseNeutral (scoot 15)] [:lucio :_jammin (scoot 25)] [:symmetra :_confused (scoot 9)]]
      "We make special exception from important weight lifting diet and there is only mediocre American picnic food? Terrible."]
      ["Symmetra" [[:zarya :_skeptical (scoot -15)] [:mei :_confused (scoot -20)] [:soldier76 :_grillDrinkNeutral (scoot 18)] [:reaper :_reverseNeutral (scoot 15)] [:lucio :_jammin (scoot 25)] [:symmetra :_explainUncomfortable (scoot 9)]]
      "I think I saw some for sale at the souvenir carts on my way here?"]
      ["Zarya" [[:zarya :_pointUp (scoot -15)] [:mei :_thumbsUp (scoot -20)] [:soldier76 :_grillDrinkNeutral (scoot 18)] [:reaper :_reverseNeutral (scoot 15)] [:lucio :_jammin (scoot 25)] [:symmetra :_confused (scoot 9)]]
      "Thank you for this valuable information, puny one. I would invite you to join us but I do not think you will be able to keep up with such small legs. Ice wife, lets go! Full sprint pace. We must limit our exposure to cardio so we not lose gains."]
      ["Lucio" [[:zarya :_neutral (scoot -15 -80 1.5)] [:mei :_thumbsUp (scoot -20 -80 1.5)] [:soldier76 :_grillDrinkNeutral (scoot 18 10 1.5)] [:reaper :_reverseNeutral (scoot 15 9 1.5)] [:lucio :_prayExplainHappy (scoot 25 -7 1.5)] [:symmetra :_confused (scoot 9 7 1.5)]]
       "Anyway, so what can we get you?"]
        :-> [:party :lucio :option 0]]

  [:party :lucio :option 0]
    [:miranda/option
    "Symmetra" [[:soldier76 :_grillDrinkNeutral (scoot 10)] [:reaper :_reverseNeutral (scoot 9)] [:lucio :_neutral (scoot -7)] [:symmetra :_thinking (scoot 7)]]
    "I was hoping for an X-Tudo."
     "Actually, a plain burger does sound nice."
     "The corn looks quite good."]

    [:party :lucio :option 0 0]
     [:miranda/dialogue
      ["Reaper" [[:soldier76 :_grillDrink (scoot 10)] [:reaper :_reverseExplain (scoot 9)] [:lucio :_neutral (scoot -7)] [:symmetra :_smile (scoot 7)]]
        "I know I was complaining earlier but the X-Tudo does live up to the hype, despite the fake meat."]
      ["Lucio" [[:soldier76 :_grillDrinkNeutral (scoot 10)] [:reaper :_reverseNeutral (scoot 9)] [:lucio :_pointUp (scoot -7)] [:symmetra :_smile (scoot 7)]]
        "It is gonna be a little bit like I said though."]
      ["Reaper" [[:soldier76 :_grillDrinkNeutral (scoot 10)] [:reaper :_reversePointUp (scoot 9)] [:lucio :_jammin (scoot -7)] [:symmetra :_smile (scoot 7)]]
        "While you’re waiting you should try and find Sombra. She was looking for you earlier. I think I saw her last with Moira."]
      ["Symmetra" [[:soldier76 :_grillDrink (scoot 10)] [:reaper :_reverseNeutral (scoot 9)] [:lucio :_jammin (scoot -7)] [:symmetra :_thinking (scoot 7)]]
        "I’ll see if I can find her."]
        :-> [:party :sombra 0]]

    [:party :lucio :option 0 1]
     [:miranda/dialogue
      ["Soldier 76" [[:soldier76 :_grillDrink (scoot 10)] [:reaper :_reverseNeutral (scoot 9)] [:lucio :_neutral (scoot -7)] [:symmetra :_neutral (scoot 7)]]
          "You’re damn right. 2 minutes."]
       ["Symmetra" [[:soldier76 :_grillDrinkNeutral (scoot 10)] [:reaper :_reverseNeutral (scoot 9)] [:lucio :_jammin (scoot -7)] [:symmetra :_explainUncomfortable (scoot 7)]]
        "How did you manage to get a grill into the amusement park anyway?"]
       ["Soldier 76" [[:soldier76 :_grillDrinkPointUp (scoot 10)] [:reaper :_reverseNeutral (scoot 9)] [:lucio :_jammin (scoot -7)] [:symmetra :_awkward (scoot 7)]]
        "If the people at the gate didn’t feel the need ask about what I’m capable of fitting down my pants, I don’t see why you would, soldier. Hotdog while you wait?"]
       ["Symmetra" [[:soldier76 :_grillDrinkNeutral (scoot 10)] [:reaper :_reverseNeutral (scoot 9)] [:lucio :_jammin (scoot -7)] [:symmetra :_no (scoot 7)]]
          "I think I’ll pass. On everything actually."]
         ["Reaper" [[:soldier76 :_grillDrinkNeutral (scoot 10)] [:reaper :_reverseExplain (scoot 9)] [:lucio :_neutral (scoot -7)] [:symmetra :_neutral (scoot 7)]]
          "If you’re leaving, see if you can find Sombra. She was looking for you earlier. I think I saw her last with Moira."]
         ["Symmetra" [[:soldier76 :_grillDrink (scoot 10)] [:reaper :_reverseNeutral (scoot 9)] [:lucio :_neutral (scoot -7)] [:symmetra :_explainUncomfortable (scoot 7)]]
          "I’ll see if I can find her."]
         :-> [:party :sombra 0]]

        [:party :lucio :option 0 2]
         [:miranda/dialogue
          ["Reaper" [[:soldier76 :_grillDrinkNeutral (scoot 10)] [:reaper :_reverseExtra (scoot 9)] [:lucio :_neutral (scoot -7)] [:symmetra :_awkward (scoot 7)]]
           "Ha! Suck it, Morrison!"]
          ["Reaper" [[:soldier76 :_grillDrinkNeutral (scoot 10)] [:reaper :_reversePointUp (scoot 9)] [:lucio :_neutral (scoot -7)] [:symmetra :_neutral (scoot 7)]]
           "These still need to cook a bit though. I’ll let you know when they’re done to cheesy perfection."]
          ["Symmetra" [[:soldier76 :_grillDrink (scoot 10)] [:reaper :_reverseNeutral (scoot 9)] [:lucio :_neutral (scoot -7)] [:symmetra :_sass (scoot 7)]]
           "I do love cheese. Both as a strategy and a topping."]
          ["Reaper" [[:soldier76 :_grillDrinkNeutral (scoot 10)] [:reaper :_reverseExplain (scoot 9)] [:lucio :_neutral (scoot -7)] [:symmetra :_sass (scoot 7)]]
           "While you’re waiting you should try and find Sombra. She was looking for you earlier. I think I saw her last with Moira."]
          ["Symmetra" [[:soldier76 :_grillDrinkNeutral (scoot 10)] [:reaper :_reverseNeutral (scoot 9)] [:lucio :_neutral (scoot -7)] [:symmetra :_thinking (scoot 7)]]
           "I’ll see if I can find her."]
          :-> [:party :sombra 0]]})
