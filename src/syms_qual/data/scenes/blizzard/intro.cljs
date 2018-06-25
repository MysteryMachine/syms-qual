(ns syms-qual.data.scenes.blizzard.intro
  (:require [carmen.util :as anim :refer [scoot]]
            [syms-qual.util :as util :refer [inc-transition]]))

(def data
  {[:hotel :intro]
   [:miranda/narration
    "After 10 long weeks your qualifying is finally over! With a great sense of anticipation you open your most recent email from Winston expecting it to contain the results of all your hard work, your final skill ranking. To your dismay though, it contains only a ticket to Blizzard World and instructions to on how to get there for you commencement party."
    "Although a noisy theme park is probably one of the least inviting environments to you possible, you supposed that given Overwatch’s penchant for over the top displays you should have expected they would attempt to throw a party of some sort. With a sigh you board the transport and prepare to face the crowd."
    :transition :miranda/conditional
    [#(= (:points/payload %) 9)  [:-> [:gate :gm]]
     #(= (:points/payload %) 0)  [:-> [:gate :bronze]]
     :else                       [:-> [:gate :middle 0]]]]

   [:gate :middle 0]
   [:miranda/narration
    "The sales clerk at the entrance booth accepts your ticket and directs you towards the “party zone” Winston has reserved for the occasion. After consulting the map to double check your route, you manage to find your way there."
    :-> [:party :middle 1]]

   [:party :middle 1]
   [:miranda/narration
    "Despite your apprehensions, the location seems manageable. Since the area was reserved it was considerably less crowded than the main park and the view overlooking the artificial lake give you a calm place to rest your eyes in the surrounding sea of movement."
    :-> [:party :winston 0]]

   [:party :winston 0]
   [:miranda/dialogue
    ["Winston" [[:winston :_explain (scoot -95 -15 1)] [:symmetra :_neutral (scoot 82 2 1)]]
     "Symmetra! Congratulations! Now that you’re here the party can really begin! But first, I want to present you with the results of all your hard work. Can I get a drumroll from the crowd please?"]
    :transition :miranda/conditional
    [#(<= (:points/payload %) 2)  [:-> [:party :gold]]
     #(<= (:points/payload %) 5)  [:-> [:party :plat]]
     :else                        [:-> [:party :diamond]]]]

   [:party :gold]
   [:miranda/dialogue
    ["Winston" [[:gifts :_gold]]
     "For you excellent service and support of your comrades, I am pleased to award you the rank of Gold!"]
    :-> [:party :end]]
   
   [:party :plat]
   [:miranda/dialogue
    ["Winston" [[:gifts :_plat]]
     "For you excellent service and superior strategizing, I am pleased to award you the rank of Platinum!"]
    :-> [:party :end]]

   [:party :diamond]
   [:miranda/dialogue
    ["Winston" [[:gifts :_diamond]]
     "For you excellent service and your exemplary dedication to the payload, I am pleased to award you the rank of Diamond!"]
    :-> [:party :end]]

   [:party :end]
   [:miranda/dialogue
    ["Winston" [[:winston :_explain (scoot -15)] [:symmetra :_smile (scoot 2)]]
     "Congratulations and thank you for all your hard work."]
    ["Symmetra" [[:winston :_neutral (scoot -15)] [:symmetra :_explainUncomfortable (scoot 2)]]
     "Thank you. I look forward to our continued work together in the future."]
    ["Winston" [[:winston :_explain (scoot -15)] [:symmetra :_smile (scoot 2)]]
     "Excellent! As do I. Now, if you’ll excuse me, I would like to go be the first in line to get one of Lucio’s vegan X-tudos. You are welcome to be second. Or you can go mingle."]
    ["Symmetra" [[:winston :_explain (scoot -15 -80 1)] [:moira :_ghost (scoot -40 13 3)] [:symmetra :_thinking (scoot 2)]]
     "I’m not ready to eat yet so I suppose I will mingle."]
    :-> [:party :moira 0]]

   [:gate :bronze]
   [:miranda/narration
    "The sales clerk at the entrance booth accepts your ticket and directs you towards the “party zone” Winston has reserved for the occasion. After consulting the map to double check your route, you begin to make your way through the park."
    :-> [:gate :efi 0]]

   [:gate :efi 0]
   [:miranda/dialogue
    ["Efi" [[:efi :_whisper (scoot -80 -8 1)] [:symmetra :_smile (scoot 80 0 1)]]
     "Pssst"]
    ["Symmetra" [[:efi :_neutral (scoot -8)] [:symmetra :_helloWarm (scoot 0)]]
     "Oh, hello, Efi."]
    ["Efi" [[:efi :_pointUpEyesClosed (scoot -8)] [:symmetra :_smile (scoot 0)]]
     "I’m here to steal you away before you get to the party. I saw Winston getting ready and he has an eleven page speech prepared. Trust me you should run while you can."]
    ["Symmetra" [[:efi :_neutral (scoot -8)] [:symmetra :_thinking (scoot 0)]]
     "That does sound quite tedious…"]
    ["Efi" [[:efi :_lookBack (scoot -8)] [:symmetra :_smile (scoot 0)]]
     "Also, I may have managed to get me and my ten best friends fast pass tickets for The Hellscream. And you? You are one of the ten."]
    ["Symmetra" [[:efi :_neutral (scoot -8)] [:symmetra :_explainUncomfortable (scoot 0)]]
     "I’m not much one for roller coasters…"]
    ["Efi" [[:efi :_armsUpExcited (scoot -8)] [:symmetra :_skeptical (scoot 0)]]
     "Symmetra! I promise it’ll be fun. When have I ever steered you wrong?"]
    ["Symmetra" [[:efi :_eyeRoll (scoot -8)] [:symmetra :_pointUp (scoot 0)]]
     "We will be on rails, Efi. Steering is not an option."]
    ["Efi" [[:efi :_armsUpEyesClosed (scoot -8)] [:symmetra :_smile (scoot 0)]]
     "Symmetra, pleaaaaaase."]
    ["Symmetra" [[:efi :_smug (scoot -8)] [:symmetra :_bigSmile (scoot 0)]]
     "I still have not recovered from the existential horror show that was the Luciobol game, but I can't say no to that face."]
    :-> [:bronze]]

   [:bronze]
   [:miranda/characters
    [[]]
    :-> [:bronze :text]]

   [:bronze :text]
   [:miranda/narration
    "Despite your apprehensions, as promised The Hellscream proved to be quite enjoyable and thrilling. Additionally, the automated photo captured of you and your companions descending from the ride’s highest peak provided you with an amusing memento of your trip."
    :-> [:party :winston 4]]

   [:party :winston 4]
   [:miranda/characters
    [[[:gifts :_photo]]]
    :-> [:party :winston 1]]

   [:party :winston 1]
   [:miranda/dialogue
    [nil [[:gifts :_photo]]
     "You've received - A SOUVENIR PHOTO"]
    ["Winston" [[:winston :_explain (scoot -95 -15 1)] [:symmetra :_awkward (scoot 82 2 1)]]
     "I’m so sad you missed my speech! Everyone there said it was very inspirational."]
    ["Symmetra" [[:winston :_neutral (scoot -15)] [:symmetra :_awkwardTalk (scoot 2)]]
     "I’m sorry, I, uh, some other things came up on my way here…"]
    ["Winston" [[:winston :_explain (scoot -15)] [:symmetra :_strainedSmile (scoot 2)]]
     "It’s ok. Efi showed me the coaster cam from The Hellscream. It seems like you had a good time! Here’s your ensignia by the way."]
    ["Winston" [[:gifts :_bronze]]
     "You’ve achieved the rank of Bronze."]
    ["Symmetra" [[:winston :_neutral (scoot -15)] [:symmetra :_explainUncomfortable (scoot 2)]]
     "Thank you, sir."]
    ["Winston" [[:winston :_pointUp (scoot -15)] [:symmetra :_awkward (scoot 2)]]
     "You know what that means!"]
    ["Symmetra" [[:winston :_neutral (scoot -15)] [:symmetra :_embarassed (scoot 2)]]
     "Huh?"]
    ["Winston" [[:winston :_explain (scoot -15)] [:symmetra :_embarassed (scoot 2)]]
     "There’s always room for improvement! I believe in you! I know you can climb that ladder!"]
    ["Symmetra" [[:winston :_neutral (scoot -15)] [:symmetra :_explainUncomfortable (scoot 2)]]
     "Thanks, Winston. I will do my best. I aspire to one day be able to try as hard as you do."]
    ["Winston" [[:winston :_airQuotes (scoot -15)] [:symmetra :_smile (scoot 2)]]
     "I’ve recently realized that “The Tryhard” nickname was not, in fact, meant to be complementary. But that’s ok. I’m fine being a try hard."]
    ["Winston" [[:winston :_explain (scoot -15)] [:symmetra :_smile (scoot 2)]]
     "But I can also have fun! I mean, look at how I just glossed over you missing my speech! And I did organize this whole amusement park trip myself. I’m a fun guy!"]
    ["Symmetra" [[:winston :_neutral (scoot -15)] [:symmetra :_explain (scoot 2)]]
     "Yes, you are. Thanks so much for organizing this."]
    ["Winston" [[:winston :_pointUp (scoot -15)] [:symmetra :_smile (scoot 2)]]
     "I’m such a fun guy I’m going to stop monopolizing your time and let you go enjoy the festivities. Also because I want to be the first in line to get one of Lucio’s vegan X-tudos. You are welcome to be second. Or you can go mingle."]
    ["Symmetra" [[:winston :_neutral (scoot -15 -80 1)] [:moira :_ghost (scoot -40 13 3)] [:symmetra :_thinking (scoot 2)]]
     "I’m not hungry quite yet so I will mingle I suppose."]
    :-> [:party :moira 0]]

   [:gate :gm]
   [:miranda/narration
    "The sales clerk at the entrance booth accepts your ticket and you find Winston and the rest of your teammates eagerly awaiting your arrival just inside the front gate."
    :-> [:gate :winston 0]]

   [:gate :winston 0]
   [:miranda/dialogue
    ["Winston" [[:winston :_explain (scoot -95 -15 1)] [:symmetra :_1000Mile (scoot 82 2 1)]]
     "There she is! The woman of the hour! I tried to write you speech but I was so overcome with emotion I couldn’t get anything down. Symmetra, you are the highest scoring member ever to qualify in the Overwatch program!"]
    ["Winston" [[:gifts :_gm]]
     "I am delighted to award you the rank of Grandmaster!"]
    :-> [:gm]]

   [:gm]
   [:miranda/characters
    [[]]
    :-> [:gm :text]]

   [:gm :text]
   [:miranda/narration
    "Much to your embarrassment, everyone, at Winston’s behest, insisted on carrying you parade style from the gate to the party area he had reserved for the occasion. Once there, he presented you with a large and elaborate cake made in the shape of the Grandmasters ensignia. Although the overly flamboyant ceremony was not to your taste, the cake was quite delicious and you couldn’t help but feel a swell of pride at you accomplishments. "
    :-> [:party :winston 3]]

   [:party :winston 3]
   [:miranda/characters
    [[[:gifts :_cake]]]
    :-> [:party :winston 2]]

   [:party :winston 2]
   [:miranda/dialogue
    [nil [[:gifts :_cake]]
     "You've received - DELICIOUS CAKE"]
    ["Winston" [[:winston :_explain (scoot -95 -15 1)] [:symmetra :_smile (scoot 82 2 1)]]
     "It has been such a joy having you on our team! I was worried you wouldn’t be able to make your kit work in the current meta but you’ve really come into your own! "]
    ["Symmetra" [[:winston :_neutral (scoot -15)] [:symmetra :_sass (scoot 2)]]
     "Thank you for your kind words, Winston. My time here has given me a lot to think about. Between our shield experiments on Lijiang and my work with Miss Zarayanova on increasing my turrets mobility I have several ideas about ways to improve."]
    ["Winston" [[:winston :_pointUp (scoot -15)] [:symmetra :_smile (scoot 2)]]
     "I'm excited to see what you come up with! I hope you enjoy the party. Personally, I am going to go be first in line for one of Lucio’s vegan X-tudos. You are welcome to be second or you can go start mingling!"]
    ["Symmetra" [[:winston :_explain (scoot -15 -80 1)] [:moira :_ghost (scoot -40 13 3)] [:symmetra :_thinking (scoot 2)]]
     "I’m not ready to eat yet so I suppose I will mingle."]
    :-> [:party :moira 0]]})
