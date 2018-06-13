(ns syms-qual.data.scenes.gibralter.date-2
  (:require [carmen.util :as anim :refer [scoot]]
            [syms-qual.util :as util :refer [inc-transition]]))

(def post-kiss
  [:miranda/dialogue
   [nil [[:pharah :_underCarry (scoot 0 100 4)]] "To your surprise, Pharah immediately sweeps you off your feet, and you roll gracefully down the lane in her arms"]
   [nil [[:pharah :_underCarry2 (scoot -80 0 2)]] "After doing a lap around the rink she deposits you safely back on your feet."]
   ["Pharah" [[:pharah :_underNeutralBlushTalk (scoot -3)] [:symmetra :_coy (scoot -5)]] "Umm…"]
   ["Symmetra" [[:pharah :_underNeutralBlush (scoot -3)] [:symmetra :_flirty (scoot -5)]] "Wowzers?"]
   ["Pharah" [[:pharah :_underEmbarassed (scoot -3)] [:symmetra :_smile (scoot -5)]] "Yup. I, um, think all these old machines are warmed up. It’s all bright now. And um."]
   ["Pharah" [[:pharah :_underNeutralBlushTalk (scoot -3)] [:symmetra :_smile (scoot -5)]] "Warm."]
   ["Symmetra" [[:pharah :_underNeutralBlush (scoot -3)] [:symmetra :_coy (scoot -5)]] "Too warm to keep skating?"]])

(def data
  {[:rink :pharah 4]
   [:miranda/narration
   "After this slight detour, you landed outside of the base’s old skating rink, a gift given to Pharah by Soldier 76, Ana, Reaper, and Reinhardt on her 16th birthday. The facility was built using all of Overwatch’s recreation funds for that year, something Reaper had promised he could recoup with his DJing skills."
   :-> [:rink :pharah 5]]

   [:rink :pharah 5]
   [:miranda/dialogue
    ["Pharah" [[:pharah :_underEmbarassed (scoot -80 -5 1)] [:symmetra :_smile (scoot -80 0 1)]] "Oh boy. Getting the power armor into that coin locker was not easy."]
    ["Symmetra" [[:pharah :_underNeutral (scoot -5)] [:symmetra :_sass (scoot 0)]] "Shows you right for rocket jumping everywhere."]
    ["Pharah" [[:pharah :_underShrug (scoot -5)] [:symmetra :_smile (scoot 0)]] "What, you don’t think it’s romantic? Me hoisting you into my arms and carrying you over the rooftops? Can you really blame me?"]
    ["Symmetra" [[:pharah :_underNeutral (scoot -5)] [:symmetra :_flirty (scoot 0)]] "Perhaps I cannot. I will not confess."]
    ["Pharah" [[:pharah :_underFlirty (scoot -5)] [:symmetra :_flirty (scoot 0)]] "Well, I can’t make you. Ehehehe. But! I think I got it. Those shoes we found on the rental rack fit ok?"]
    ["Symmetra" [[:pharah :_underNeutral (scoot -5)] [:symmetra :_explainUncomfortable (scoot 0)]] "Yes. They are actually quite comfortable. I was pleasantly surprised. How about your childhood skates?"]
    ["Pharah" [[:pharah :_underSmileDown (scoot -5)] [:symmetra :_smile (scoot 0)]] "Looks like I had my growth spurts early! Size 11s still fit! Ready to go?"]
    ["Symmetra" [[:pharah :_underNeutral (scoot -5)] [:symmetra :_bigSmile (scoot 0)]] "Certainly."]
    ["Pharah" [[:pharah :_underHandLead (scoot -5 -10 1)]] "The lights haven’t quite warmed up so watch your step. You can hold my hand if you’re feeling off balance."]
    ["Symmetra" [[:pharah :_underHandHold (scoot -10 5 2)]] "You seem quite comfortable."]
    ["Pharah" [[:pharah :_underHandShrug (scoot 5 -8 2)]] "Flying, skating, it’s the same basic thing."]
    ["Symmetra" [[:pharah :_underNeutralBlush (scoot -8 -3 2)] [:symmetra :_coy (scoot -10 0 2)]] "Oh is it, Ms. Amari?"]
    ["Pharah" [[:pharah :_underEmbarassed (scoot -3 -10 2)] [:symmetra :_coy (scoot 0 -7 2)]] "Nooo, but it’s like riding a bike. I spent a lot of time on these skates. You don’t just forget."]
    ["Pharah" [[:pharah :_underBold (scoot -10 -3 2)] [:symmetra :_flirty (scoot -7 0 2)]] "Not to mention, you’re pretty comfortable yourself, Ms. Vaswani."]
    ["Symmetra" [[:pharah :_underNeutralBlush (scoot -3 -12 2)] [:symmetra :_dancePose (scoot 0 -10 2)]] "I’m a dancer. Watch."]
    :-> [:pharah-b :cutscene]]

    [:pharah-b :cutscene]
    [:miranda/characters
    [[]]
    :-> [:pharah-b :cutscene :text]]

    [:pharah-b :cutscene :text]
    [:miranda/narration
    "You break from Pharah, and begin to gracefully skating upon the ground, drawing upon your considerable balance and dance skill. Your freestyle increases in intensity, and you catch Pharah watching in a stupor, with a flushed face. You decide to take it down a notch, and you skate back up to her."
    :-> [:rink :pharah 6]]

  [:rink :pharah 6]
  [:miranda/dialogue
    ["Pharah" [[:pharah :_underScandalized (scoot 80 10 2)]] "Excellent, isn’t it?"]
    ["Pharah" [[:pharah :_underWow (scoot 10)]] "Wowzers."]
    ["Symmetra" [[:pharah :_underNeutralBlush (scoot 3 -5 2)] [:symmetra :_laugh (scoot -10 0 2)]] "Haha, wowzers, Ms. Amari?"]
    ["Pharah" [[:pharah :_underFlirty (scoot -5 -10 2)] [:symmetra :_smile (scoot 0 -5 2)]] "You heard me. Now that’s what I call talent."]
    ["Pharah" [[:pharah :_underEmbarassed (scoot -10 3 2)] [:symmetra :_smile (scoot -5 5 2)]] "I had forgotten how nice skating is. I feel silly for having quit. Silly teen Fareeha."]
    ["Symmetra" [[:pharah :_underNeutralBlush (scoot 3 -10 2)] [:symmetra :_flirty (scoot 5 -13 2)]] "It’s not too late to pick it back up."]
    ["Pharah" [[:pharah :_underExplainEmbarassed (scoot -10 1 2)] [:symmetra :_smile (scoot -13 -2 2)]] "I think I can do without the roller derby. I feel like I have enough stress and competition in my life just from the day to day grind in Overwatch."]
    ["Pharah" [[:pharah :_underEmbarassed (scoot 1 -3 2)] [:symmetra :_smile (scoot -2 -10 2)]] "But maybe the parts of skating that don't belong in my life anymore can stay in the past where they belong. And we can do something different and better without them."]
    ["Pharah" [[:symmetra :_flirty (scoot -10 -9 2)] [:pharah :_underNeutralBlushTalk (scoot -3 3 2)]] "Maybe I can just start skating like this, instead."]
    ["Pharah" [[:symmetra :_flirty (scoot -9 -17 2)] [:pharah :_underNeutralBlushTalk (scoot 3 0 2)]] "With you."]

    :-> [:rink :pharah :option 2]]

   [:rink :pharah :option 2]
   [:miranda/option
    "Symmetra" [[:symmetra :_flirty (scoot -17)] [:pharah :_underNeutralBlush (scoot 0)]]
    "Kiss that bird"
    "Hug that bird"]

   [:rink :pharah :option 2 0]
    [:miranda/dialogue
     ["Symmetra" [[:pharah :_underSmooch (scoot 0)]] "..."]
     :-> [:rink :pharah 7 :kiss]]

   [:rink :pharah :option 2 1]
    [:miranda/dialogue
     ["Symmetra" [[:pharah :_underHug (scoot 0)]] "I’d love to."]
     :-> [:rink :pharah 7 :hug]]

   [:rink :pharah 7 :hug]
   (concat post-kiss [:-> [:rink :pharah :date 7 :hug 2]])

   [:rink :pharah 7 :kiss]
   (concat post-kiss [:-> [:rink :pharah :date 7 :kiss 2]])

   [:rink :pharah :date 7 :kiss 2]
   [:miranda/dialogue
    ["Pharah" [[:pharah :_underBold (scoot -3)] [:symmetra :_coy (scoot -5)]] "If there’s more kissing, I’m game."
     ] :-> [:rink :pharah :date 7]]

   [:rink :pharah :date 7 :hug 2]
   [:miranda/dialogue
    ["Pharah" [[:pharah :_underBold (scoot -3)] [:symmetra :_coy (scoot -5)]] "If I get to see more of that dancing, I’m game."]
    :-> [:rink :pharah :date 7]]

   [:rink :pharah :date 7]
   [:miranda/dialogue
    ["Symmetra" [[:pharah :_underNeutralBlush (scoot -3)] [:symmetra :_sass (scoot -5)]] "Haha, I see your inhibitions are broken."]
    ["Pharah" [[:pharah :_underEmbarassed (scoot -3)] [:symmetra :_smile (scoot -5)]] "I’m glad."]
    ["Symmetra" [[:pharah :_underNeutralBlush (scoot -3)] [:symmetra :_bigSmile (scoot -5)]] "Me too. Shall we continue?"]
    :-> [:pharah-c :cutscene]]

    [:pharah-c :cutscene]
    [:miranda/characters
    [[]]
    :-> [:pharah-c :cutscene :text]]

    [:pharah-c :cutscene :text]
    [:miranda/narration
    "You two continue to skate for a little while longer, and discover that with a bit of practice, you are able to execute some basic partnered skating moves. You continue to play on the rink until exhaustion hits you."
    :-> [:hotel :pharah 7]]

    [:hotel :pharah 7]
    [:miranda/narration
     "After Pharah changes back into her Raptora suit, she flies you back to your room, leaving you at the door."
     :-> [:hotel :pharah 8]]

    [:hotel :pharah 8]
    [:miranda/dialogue
     ["Pharah" [[:pharah :_explain (scoot -80 -18 1)] [:symmetra :_smile (scoot 80 5 1)]] "So, I’ll see you later?"]
     ["Symmetra" [[:pharah :_smile (scoot -18)] [:symmetra :_sass (scoot 5)]] "Your assignment, if you choose to accept it, is to take me out on another date as soon as you are able."]
     ["Pharah" [[:pharah :_helloNeutral (scoot -18)] [:symmetra :_smile (scoot 5)]] "Yes ma’am!"]
     ["Symmetra" [[:pharah :_smile (scoot -18)] [:symmetra :_helloWarm (scoot 5)]] "Good. Have a good night."]
     ["Pharah" [[:pharah :_goodnight (scoot -18)] [:symmetra :_bigSmile (scoot 5)]] "Goodnight!"]
     :-> [:hotel :pharah 10]]

     [:hotel :pharah 10]
     [:miranda/narration
      "A few hours later, you check your phone to find that Pharah sent a photo of you two dancing."
      :-> [:hotel :pharah 9]]

    [:hotel :pharah 9]
    [:miranda/characters
     [[[:photos :_pharahDate3] [:phones :_symHand]]]
     :-> [:hotel 2 :text]]

    [:hotel 2 :text]
    [:miranda/dialogue
      ["Pharah" [[:photos :_pharahDate3] [:phones :_symHand]]
      "i asked sombra and she managed to get this for us from the security cameras hope u like it"]
     :=> [:dorado [:spawn :intro] 0]]})
