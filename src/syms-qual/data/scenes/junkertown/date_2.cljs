(ns syms-qual.data.scenes.junkertown.date-2
  (:require [carmen.util :as anim :refer [scoot]]
            [syms-qual.util :as util :refer [inc-transition]]))

(def data
  {[:field 0]
   [:miranda/dialogue
    ["Roadhog" [] "Quiche?"]
    ["Symmetra" [] "Why, thank you."]
    [nil [] "You take a bite."]
    ["Symmetra" [] "Roadhog, this is delicious."]
    ["Roadhog" [] "Please. Call me Mako."]
    ["Junkrat" [] "Or Roadie!"]
    ["Roadhog" [] "Mako."]
    ["Junkrat" [] "You meanie!"]
    ["Roadhog" [] "You can use Roadie. For historical reasons. Not her."]
    ["Symmetra" [] "Mako is fine. Thanks a lot for inviting me. I’m really glad to spend this time with you."]
    ["Roadhog"  [] "One lump or two?"]
    ["Symmetra" [] "No sugar for me, thank you."]
    ["Junkrat" [] "Feels good to be out here. Have some space to think. When it’s quiet like this, all the commotion in the ol’ noggin rattles around until it all just settles down."]
    ["Symmetra" [] "I’m glad to be in a place where I can be quiet."]
    ["Junkrat" [] "Yeah, it’s nice. Don’t feel like I have to fill up all the dead air with chit-chat. It’s just…"]
    ["Junkrat" [] "Comfortable silence."]
    ["Symmetra" [] "…"]
    ["Junkrat" [] "..."]
    ["Roadhog"  [] "Tea’s ready. I’ll let you two have some space."]
    ["Junkrat" [] "_smooch: Thanks Roadie."]
    [nil [] "For a while you sit in silence watching the clouds pass."]
    ["Symmetra" [] "Jaime?"]
    ["Junkrat" [] "Yes?"]
    ["Symmetra" [] "That cloud over there closely resembles a whale, does it not?"]
    ["Junkrat" [] "Very like a whale!"]
    ["Symmetra" [] "And that one’s a woman dancing."]
    ["Junkrat" [] "Yeah I think I see it. But those two collided.  She’s still dancing but now she’s like the centaur top half of a giant duck."]
    ["Symmetra" [] "Haha, I suppose. Although I think it looks more like a"]
    :-> [:field :option 0]]

   [:field :option 0]
   [:miranda/option
    "Symmetra" []
    "Goose Centaur"
    "Steaming Kettle"]

   [:field :option 0 0]
   [:miranda/dialogue
    ["Symmetra" [] "The neck is too long for a goose"]
    ["Junkrat" [] "Does it really count as a neck when its a human torso?"]
    ["Symmetra" [] "Good point. I shall have to more carefully consult the Encyclopedia of Sky Cryptids I brought with me."]
    ["Junkrat" [] "I’m glad you brought yours. I knew I was forgetting something important when I packed up this afternoon."]
    :-> [:field 1]]

   [:field :option 0 1]
   [:miranda/dialogue
    ["Junkrat" [] "Ooh, I’d love a cuppa"]
    ["Junkrat" [] "I’ll get up and make some."]
    ["Junkrat" [] "…"]
    ["Junkrat" [] "...In a minute…"]
    :-> [:field 1]]

   [:field 1]
   [:miranda/dialogue
    ["Junkrat" [] "That one’s a drunk lizard. She’s got her arms up like ‘uhhhh,’ holding a bottle of tequila, having a real good time."]
    ["Symmetra" [] "There’s her drinking buddy, the.."]
    :-> [:field :option 1]]

   [:field :option 1]
   [:miranda/text-option
    "Symmetra"
    "Angry Rabbit"
    "Galloping Hippo"
    "Six Legged Bear"]

   [:field :option 1 0]
   [:miranda/dialogue
    ["Junkrat" [] "Do you think she’s friends with the rabbit in the moon?"]
    ["Symmetra" [] "I didn’t know there were rabbits on the moon. I’ve only heard Winston talk about the other apes but I suppose it makes sense there would have been a variety of types of lab animals."]
    ["Junkrat" [] "No I meant like the myth about the rabbit in the moon making mochi."]
    ["Symmetra" [] "Oh."]
    ["Junkrat" [] "We should convince Roadie to whip us up a batch.. Roadie made this bonza coconut butter mochi but the buncha drongos on the other team saw it on the table and ate it while they were sitting in spawn last round. I’m quite upset."]
    :-> [:field 2]]

   [:field :option 1 1]
   [:miranda/dialogue
    ["Junkrat" [] "Naw, it looks way too vicious! Haven’t you seen those adorable baby hippo videos on youtube? I love watching those when I need to calm down."]
    ["Symmetra" [] "You know hippos kill more people annually than sharks? Junkrat: That’s bloody terrifying. I’m so upset."]
    :-> [:field 2]]

   [:field :option 1 2]
   [:miranda/dialogue
    ["Junkrat" [] "Like Zarya’s bear, Zarya?"]
    ["Symmetra" [] "I do not think Zarya’s bear has six legs."]
    ["Junkrat" [] "What? I was told she was the the strongest bear in the world. I expected six legs. I’m very disappointed."]
    :-> [:field 2]]

   [:field 2]
   [:miranda/dialogue
    ["Symmetra" [] "Well, I’ll cheer you up with that ice cream cone floating beneath her."]
    ["Junkrat" [] "That’s not a ice cream cone, it’s face. The face of Snorey McSleepyPants the patron saint of really good naps."]
    ["Symmetra" [] "I’m not sure I see it."]
    ["Junkrat" [] "It’s a tiny face, but a great big nose."]
    ["Symmetra" [] "Oh, it’s clearer now that the winds picked up. It’s grown some straggly bits of hair. They look rather like you don’t they."]
    ["Junkrat" [] "Ha, I guess. Your reckon we’re related?"]
    ["Symmetra" [] "Perhaps."]
    ["Junkrat" [] "I feel like I ought to get more preferential treatment if we’re family. I’m always asking for their help when I’ve got insomnia but they never respond."]
    ["Symmetra" [] "How rude."]
    ["Junkrat" [] "I’ve heard if you get real quiet though, you can hear their snoring in the wind."]
    ["Symmetra" [] "It might not be them then, I don’t think I can hear it."]
    ["Junkrat" [] "You gotta close your eyes and listen."]
    ["Symmetra" [] "Ah, there it is."]
    ["Junkrat" [] "…"]
    ["Symmetra" [] "Jamie?"]
    :-> [:field 3]]

   [:field 3]
   [:miranda/narration
    "You look over to find Junkrat lying quite still with his eyes closed and a faint smile on his lips. You can’t quite tell whether he’s feigning it or if he’s actually asleep but you are starting to feel quite drowsy yourself in the warmth of the afternoon sun."
    "Your eyelids feeling heavy, you lie down beside him, enjoying the faint heat radiating from his torso and the cool breeze tousling your hair. For a while, you watch the clouds pass, painting strange shadows over your bodies, the blanket, and the grass around you, as they move with the wind. Eventually, after dipping in and out of consciousness for sometime, you doze off."
    "You are awakened by the gentle hiss of the kettle and the smell of brewing tea."
    :-> [:field :date-3 0]]})
