(ns syms-qual.data.scenes.junkertown.date-2
  (:require [carmen.util :as anim :refer [scoot fade-out fade-in move]]
            [syms-qual.util :as util :refer [inc-transition]]))

(def data
  {[:field 0]
   [:miranda/dialogue
    ["Roadhog" [[:clouds :_field (move [0 -25])][:junkrat :_ballSmile (scoot -75 6 1.5)] [:roadhog :_quicheOffer (scoot -80 -22 1.5)] [:symmetra :_smile (scoot 80 8 1.5)]] "Quiche?"]
    ["Symmetra" [[:clouds :_field (move [0 -25])][:junkrat :_ballSmile (scoot 6)] [:roadhog :_neutral (scoot -22)] [:symmetra :_quiche (scoot 8)]] "Why, thank you."]
    ["Symmetra" [[:clouds :_field (move [0 -25])][:junkrat :_ballSmile (scoot 6)] [:roadhog :_drink (scoot -22)] [:symmetra :_quicheChew (scoot 8)]] "..."]
    ["Symmetra" [[:clouds :_field (move [0 -25])][:junkrat :_ballSmileNod (scoot 6)] [:roadhog :_neutral (scoot -22)] [:symmetra :_quicheHand (scoot 8)]] "Roadhog, this is delicious."]
    ["Roadhog" [[:clouds :_field (move [0 -25])][:junkrat :_ballSmile (scoot 6)] [:roadhog :_drink (scoot -22)] [:symmetra :_quicheChew2 (scoot 8)]] "Please. Call me Mako."]
    ["Junkrat" [[:clouds :_field (move [0 -25])][:junkrat :_ballPointUp (scoot 6)] [:roadhog :_drink (scoot -22)] [:symmetra :_quicheChew2 (scoot 8)]] "Or Roadie!"]
    ["Roadhog" [[:clouds :_field (move [0 -25])][:junkrat :_ballSmile (scoot 6)] [:roadhog :_neutral2 (scoot -22)] [:symmetra :_smile (scoot 8)]] "Mako."]
    ["Junkrat" [[:clouds :_field (move [0 -25])][:junkrat :_handsHips (scoot 6)] [:roadhog :_neutral (scoot -22)] [:symmetra :_smile (scoot 8)]] "You meanie!"]
    ["Roadhog" [[:clouds :_field (move [0 -25])][:junkrat :_ballSmileNod (scoot 6)] [:roadhog :_explain (scoot -22)] [:symmetra :_smile (scoot 8)]] "You can use Roadie. For historical reasons. Not her."]
    ["Symmetra" [[:clouds :_field (move [0 -25])][:junkrat :_ballSmileNod (scoot 6)] [:roadhog :_neutral (scoot -22)] [:symmetra :_bigSmile (scoot 8)]] "Mako is fine. Thanks a lot for inviting me. I’m really glad to spend this time with you."]
    ["Roadhog"  [[:clouds :_field (move [0 -25])][:junkrat :_ballSmile (scoot 6)] [:roadhog :_pointUp (scoot -22)] [:symmetra :_smile (scoot 8)]] "One lump or two?"]
    ["Symmetra" [[:clouds :_field (move [0 -25])][:junkrat :_ballSmile (scoot 6)] [:roadhog :_neutral (scoot -22)] [:symmetra :_noSmile (scoot 8)]] "No sugar for me, thank you."]
    ["Junkrat" [[:clouds :_field (move [0 -25])][:junkrat :_ballThinkingSmile (scoot 6)] [:roadhog :_drink (scoot -22)] [:symmetra :_smile (scoot 8)]] "Feels good to be out here. Have some space to think. When it’s quiet like this, all the commotion in the ol’ noggin rattles around until it all just settles down."]
    ["Symmetra" [[:clouds :_field (move [0 -25])][:junkrat :_ballThinkingSmile (scoot 6)] [:roadhog :_neutral (scoot -22)] [:symmetra :_lookUpBlush (scoot 8)]] "I’m glad to be in a place where I can be quiet."]
    ["Junkrat" [[:clouds :_field (move [0 -25])][:junkrat :_shyblush (scoot 6)] [:roadhog :_neutral (scoot -22)] [:symmetra :_lookUpBlush (scoot 8)]] "Yeah, it’s nice. Don’t feel like I have to fill up all the dead air with chit-chat. It’s just…"]
    ["Junkrat" [[:clouds :_field (move [0 -25])][:junkrat :_ballConfusedBlushLeft (scoot 6)] [:roadhog :_drink (scoot -22)] [:symmetra :_lookUpBlush (scoot 8)]] "Comfortable silence."]
    ["Symmetra" [[:clouds :_field (move [0 -25])][:junkrat :_shyblush (scoot 6)] [:roadhog :_drink (scoot -22)] [:symmetra :_coy (scoot 8)]] "…"]
    ["Junkrat" [[:clouds :_field (move [0 -25])][:junkrat :_ballAdoringBlush (scoot 6)] [:roadhog :_drink (scoot -22)] [:symmetra :_coy (scoot 8)]] "..."]
    ["Roadhog"  [[:clouds :_field (move [0 -25])][:junkrat :_ballAdoringBlush (scoot 6)] [:roadhog :_neutral2 (scoot -22)] [:symmetra :_coy (scoot 8)]] "Tea’s ready. I’ll let you two have some space."]
    ["Junkrat" [[:clouds :_field (move [0 -25])][:roadhog :_smooch (scoot -22)] [:symmetra :_coy (scoot 8)]] "Thanks Roadie."]
    ["Symmetra" [[:clouds :_field (move [0 -25])][:junkrat :_shyblush (scoot 6 0 1)] [:roadhog :_neutral (scoot -22 -80 1)] [:symmetra :_lookUpBlush (scoot 8 -2 1)]] "..."]
    [nil [[:clouds :_field (move [0 -25] [0 25] 4)]
          [:junkrat :_shyblush (move [0 0] [0 100] 4)]
          [:symmetra :_lookUpBlush (move [-2 0] [-2 100] 4)]]
     "For a while you sit in silence watching the clouds pass."]
    ["Symmetra" [[:clouds :_field (move [0 25])] [:clouds :_whale (scoot 100 60 2)]] "Jaime?"]
    ["Junkrat" [[:clouds :_field (move [0 25])][:clouds :_whale (scoot 60 40 2)]] "Yes?"]
    ["Symmetra" [[:clouds :_field (move [0 25])][:clouds :_whale (scoot 40 10 2)] [:hands :_symPoint (scoot 0)]] "That cloud over there closely resembles a whale, does it not?"]
    ["Junkrat" [[:clouds :_field (move [0 25])][:clouds :_whale (scoot 10 -20 2)] [:clouds :_dance (scoot 80 40 2)][:hands :_junkPoint (scoot 0)]] "Very like a whale!"]
    ["Symmetra" [[:clouds :_field (move [0 25])][:clouds :_whale (scoot -20 -80 2)][:clouds :_dance (scoot 40 20 2)] [:hands :_symPoint (scoot 0)]] "And that one’s a woman dancing."]
    ["Junkrat" [[:clouds :_field (move [0 25])][:clouds :_dance (fade-out [20 0] 1)] [:clouds :_centaur (fade-in [20 0] 1)] [:hands :_junkExplain (scoot 0)]] "Yeah I think I see it. But those two collided.  She’s still dancing but now she’s like the centaur top half of a giant duck."]
    ["Symmetra" [[:clouds :_field (move [0 25])][:clouds :_centaur (scoot 20 15 2)]] "Haha, I suppose. Although I think it looks more like a"]
    :-> [:field :option 0]]

   [:field :option 0]
   [:miranda/option
    "Symmetra" [[:clouds :_field (move [0 25])][:clouds :_centaur (scoot 15)]]
    "Goose Centaur"
    "Steaming Kettle"
    "Very Small Snake Who Had A Very Large Breakfast"]

   [:field :option 0 0]
   [:miranda/dialogue
    ["Symmetra" [[:clouds :_field (move [0 25])][:clouds :_centaur (scoot 15 0 2)] [:hands :_symExplain (scoot 0)]] "The neck is too long for a duck."]
    ["Junkrat" [[:clouds :_field (move [0 25])][:clouds :_centaur (scoot 0 -15 2)] [:hands :_junkPoint (scoot 0)]] "Does it really count as a neck when its a human torso?"]
    ["Symmetra" [[:clouds :_field (move [0 25])][:clouds :_centaur (scoot -15 -30 2)]] "Good point. I shall have to more carefully consult the Encyclopedia of Sky Cryptids I brought with me."]
    ["Junkrat" [[:clouds :_field (move [0 25])][:clouds :_centaur (scoot -30 -45 2)] [:hands :_junkExplain (scoot 0)]] "I’m glad you brought yours. I knew I was forgetting something important when I packed up this afternoon."]
    :-> [:field 1]]

   [:field :option 0 1]
   [:miranda/dialogue
    ["Junkrat" [[:clouds :_field (move [0 25])][:clouds :_centaur (scoot 15 0 2)]] "Ooh, I’d love a cuppa"]
    ["Junkrat" [[:clouds :_field (move [0 25])][:clouds :_centaur (scoot 0 -15 2)]] "I’ll get up and make some."]
    ["Junkrat" [[:clouds :_field (move [0 25])][:clouds :_centaur (scoot -15 -30 2)]] "…"]
    ["Junkrat" [[:clouds :_field (move [0 25])][:clouds :_field (move [0 25])][:clouds :_centaur (scoot -30 -45 2)]] "...In a minute…"]
    :-> [:field 1]]

   [:field 1]
   [:miranda/dialogue
    ["Junkrat" [[:clouds :_field (move [0 25])][:clouds :_centaur (scoot -45 -100 2)] [:clouds :_lizard (scoot 85 25 2)] [:hands :_junkPoint (scoot 0)]] "That one’s a drunk lizard. She’s got her arms up like ‘uhhhh,’ holding a bottle of tequila, having a real good time."]
    ["Symmetra" [[:clouds :_field (move [0 25])][:clouds :_lizard (scoot 25 -30 2)] [:clouds :_bear (scoot 85 30 2)] [:hands :_symPoint (scoot 0)]] "There’s her drinking buddy, the.."]
    :-> [:field :option 1]]

   [:field :option 1]
   [:miranda/option
    "Symmetra" [[:clouds :_field (move [0 25])][:clouds :_lizard (scoot -30 -80 2)] [:clouds :_bear (scoot  30 0 2)]]
    "Angry Rabbit"
    "Galloping Hippo"
    "Six Legged Bear"]

   [:field :option 1 0]
   [:miranda/dialogue
    ["Junkrat" [[:clouds :_field (move [0 25])][:clouds :_bear (scoot 0 -5 1)] [:hands :_junkExplain (scoot 0)]] "Do you think she’s friends with the rabbit in the moon?"]
    ["Symmetra" [[:clouds :_field (move [0 25])][:clouds :_bear (scoot -5 -10 1)] [:hands :_symPoint (scoot 0)]] "I didn’t know there were rabbits on the moon. I’ve only heard Winston talk about the other apes but I suppose it makes sense there would have been a variety of types of lab animals."]
    ["Junkrat" [[:clouds :_field (move [0 25])][:clouds :_bear (scoot -10 -15 1)] [:hands :_junkExplain (scoot 0)]] "No I meant like the myth about the rabbit in the moon making mochi."]
    ["Symmetra" [[:clouds :_field (move [0 25])][:clouds :_bear (scoot -15 -20 1)]] "Oh."]
    ["Junkrat" [[:clouds :_field (move [0 25])][:clouds :_bear (scoot -20 -25 1)]] "We should convince Roadie to whip us up a batch.. Roadie made this bonza coconut butter mochi but the buncha drongos on the other team saw it on the table and ate it while they were sitting in spawn last round. I’m quite upset."]
    :-> [:field 2]]

   [:field :option 1 1]
   [:miranda/dialogue
    ["Junkrat" [[:clouds :_field (move [0 25])][:clouds :_bear (scoot 0 -8 1)] [:hands :_junkExplain (scoot 0)]] "Naw, it looks way too vicious! Haven’t you seen those adorable baby hippo videos on youtube? I love watching those when I need to calm down."]
    ["Symmetra" [[:clouds :_field (move [0 25])][:clouds :_bear (scoot -8 -16 1)] [:hands :_symPoint (scoot 0)]] "You know hippos kill more people annually than sharks?"]
    ["Junkrat" [[:clouds :_field (move [0 25])][:clouds :_bear (scoot -16 -25 1)]] "That’s bloody terrifying. I’m so upset."]
    :-> [:field 2]]

   [:field :option 1 2]
   [:miranda/dialogue
    ["Junkrat" [[:clouds :_field (move [0 25])][:clouds :_bear (scoot 0 -8 1)] [:hands :_junkExplain (scoot 0)]] "Like Zarya’s bear, Zarya?"]
    ["Symmetra" [[:clouds :_field (move [0 25])][:clouds :_bear (scoot -8 -16 1)]] "I do not think Zarya’s bear has six legs."]
    ["Junkrat" [[:clouds :_field (move [0 25])][:clouds :_bear (scoot -16 -25 1)]] "What? I was told she was the the strongest bear in the world. I expected six legs. I’m very disappointed."]
    :-> [:field 2]]

   [:field 2]
   [:miranda/dialogue
    ["Symmetra" [[:clouds :_field (move [0 25])][:clouds :_bear (scoot -25 -90 2)] [:clouds :_cone (scoot 60 10 2)]] "Well, I’ll cheer you up with that ice cream cone floating beneath her."]
    ["Junkrat" [[:clouds :_field (move [0 25])][:clouds :_cone (scoot 10 5 2)]] "That’s not a ice cream cone, it’s face. The face of Snorey McSleepyPants the patron saint of really good naps."]
    ["Symmetra" [[:clouds :_field (move [0 25])][:clouds :_cone (scoot 5 0 2)]] "I’m not sure I see it."]
    ["Junkrat" [[:clouds :_field (move [0 25])][:clouds :_cone (scoot 0 -5 2)]] "It’s a tiny face, but a great big nose."]
    ["Symmetra" [[:clouds :_field (move [0 25])][:clouds :_cone (fade-out [-5 0] 1)][:clouds :_snore (fade-in [-5 0] 1)]] "Oh, it’s clearer now that the winds picked up. It’s grown some straggly bits of hair. They look rather like you don’t they."]
    ["Junkrat" [[:clouds :_field (move [0 25])][:clouds :_snore (scoot -5 -10 2)]] "Ha, I guess. Your reckon we’re related?"]
    ["Symmetra" [[:clouds :_field (move [0 25])][:clouds :_snore (scoot -10 -15 2)]] "Perhaps."]
    ["Junkrat" [[:clouds :_field (move [0 25])][:clouds :_snore (scoot -15 -20 2)]] "I feel like I ought to get more preferential treatment if we’re family. I’m always asking for their help when I’ve got insomnia but they never respond."]
    ["Symmetra" [[:clouds :_field (move [0 25])][:clouds :_snore (scoot -20 -25 2)]] "How rude."]
    ["Junkrat" [[:clouds :_field (move [0 25])][:clouds :_snore (scoot -25 -30 2)]] "I’ve heard if you get real quiet though, you can hear their snoring in the wind."]
    ["Symmetra" [[:clouds :_field (move [0 25])][:clouds :_snore (scoot -30 -35 2)]] "It might not be them then, I don’t think I can hear it."]
    ["Junkrat" [[:clouds :_field (move [0 25])][:clouds :_snore (scoot -35 -40 2)]] "You gotta close your eyes and listen."]
    ["Symmetra" [[:clouds :_field (move [0 25])][:clouds :_snore (scoot -40 -45 2)]] "Ah, there it is."]
    ["Junkrat" [[:clouds :_field (move [0 25])][:clouds :_snore (scoot -45 -50 2)]] "…"]
    ["Symmetra" [[:clouds :_field (move [0 25])][:clouds :_snore (scoot -50 -80 3)]] "Jamie?"]
    :-> [:junkrat-b]]

    [:junkrat-b]
    [:miranda/characters
     [[]]
     :-> [:junkrat-b :text]]

  [:junkrat-b :text]
   [:miranda/narration
    "You look over to find Junkrat lying quite still with his eyes closed and a faint smile on his lips. You can’t quite tell whether he’s feigning it or if he’s actually asleep but you are starting to feel quite drowsy yourself in the warmth of the afternoon sun."
    "Your eyelids feeling heavy, you lie down beside him, enjoying the faint heat radiating from his torso and the cool breeze tousling your hair. For a while, you watch the clouds pass, painting strange shadows over your bodies, the blanket, and the grass around you, as they move with the wind. Eventually, after dipping in and out of consciousness for sometime, you doze off."
    :-> [:field :date-3 5]]})
