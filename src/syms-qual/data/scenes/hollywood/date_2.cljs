(ns syms-qual.data.scenes.hollywood.date-2
  (:require [carmen.util :as anim :refer [scoot fade-out]]
            [syms-qual.util :as util :refer [inc-transition]]))

(def data
  {[:objective :sombra :date 2]
   [:miranda/dialogue
    ["Sombra" [[:sombra :_awkwardSad (scoot -6)] [:symmetra :_sad (scoot 2)]]
     "Hey, listen. I know I was out of line. I, uh, sorry."]
    :-> [:objective :sombra :date :option 1]]

   [:objective :sombra :date :option 1]
   [:miranda/option
    "Symmetra" [[:sombra :_neutral2 (scoot -6)] [:symmetra :_neutral (scoot 2)]]
    "Your points have merit. I...have some demons I have let lie dormant for too long."
    "Perhaps, but I have not had someone challenge me like that in quite a while."]

   [:objective :sombra :date :option 1 0]
   [:miranda/dialogue
    ["Symmetra" [[:sombra :_neutral (scoot -6)] [:symmetra :_sadSmile (scoot 2)]]
     "Your sense of justice is truly unexpected. I’m surprised, considering your notorious status as criminal scum."]
    ["Sombra" [[:sombra :_flirty (scoot -6)] [:symmetra :_smile (scoot 2)]]
     "The scummiest! I’m like Robin Hood if he was gayer but also awful."]
    :-> [:objective :sombra :date 3]]

   [:objective :sombra :date :option 1 1]
   [:miranda/dialogue
    ["Symmetra" [[:sombra :_neutral (scoot -6)] [:symmetra :_explainUncomfortable (scoot 2)]]
     "I respect that."]
    ["Sombra" [[:sombra :_flirty (scoot -6)] [:symmetra :_smile (scoot 2)]]
     "Thanks. I’ll be sure to meddle more in the future."]
    :-> [:objective :sombra :date 3]]

   [:objective :sombra :date 3]
   [:miranda/dialogue
    ["Symmetra" [[:sombra :_neutral (scoot -6)] [:symmetra :_dissappointed (scoot 2)]]
     "I know you think I am naive, but trust me when I say believe in the work that Vishkar is doing. "]
    ["Symmetra" [[:sombra :_neutral (scoot -6)] [:symmetra :_explainUncomfortable (scoot 2)]]
     "I believe in the power of our technology to change the world for the better. I understand that the day has not yet come where all can benefit equally, but I believe that my efforts are bringing us closer to that day."]
    ["Sombra" [[:sombra :_nostalgicSad (scoot -6)] [:symmetra :_neutral (scoot 2)]]
     "That would be nice, but, mira, it’s not technology alone that’s going to make these people’s lives better. "]
    ["Sombra" [[:sombra :_explainHand (scoot -6)] [:symmetra :_neutral (scoot 2)]]
     "If you want to help people, you need to actually talk to them first. You’ve lived in ivory towers made of light for too long."]
    ["Symmetra" [[:sombra :_neutral2 (scoot -6)] [:symmetra :_explainSad (scoot 2)]]
     "I don't know if..."]
    ["Sombra" [[:sombra :_explain (scoot -6)] [:symmetra :_neutral (scoot 2)]]
     "You wanna help common people, right? Then you need to actually talk to them. I'll introduce you to  Reaper’s Tia, she is literally my favorite person. Come carry groceries for Tia Asuncion and her Omnic boytoy, and watch some novellas with us. Get a taste of normal life. How about tonight?"]
    ["Symmetra" [[:sombra :_neutral (scoot -6)] [:symmetra :_dissappointed (scoot 2)]]
     "I am not sure I can make it tonight. These matches exhaust me, and I will need some quiet alone time before I am ready."]
    ["Sombra" [[:sombra :_explainHand (scoot -6)] [:symmetra :_smile (scoot 2)]]
     "Hey! We have a few extra days in LA before our next match. Take your time. If you can make it this weekend there’s an exciting holiday special episode. "]
    ["Symmetra" [[:sombra :_neutral (scoot -6)] [:symmetra :_sass (scoot 2)]]
     "Alright, Ms. Sombra, you can stop tugging at my sleeve. I’ll make the effort."]
    ["Sombra" [[:sombra :_camo (fade-out [-6 0] 2)] [:symmetra :_sass (scoot 2)]]
     "You have my number. Remember, I hacked it. With hacking. And don’t forget to click the link! Hasta. "]
    :-> [:sombra :cutscene]]

   [:sombra :cutscene]
   [:miranda/characters
    [[]]
    :-> [:sombra :cutscene :text]]

   [:sombra :cutscene :text]
   [:miranda/narration
    "After some days of much needed rest, you felt ready to take Sombra up on her offer and met up with her and Reaper at Asuncion’s quaint house. Her living room featured a hodgepodge of mismatched furniture, some salvaged, and some probably bought on the cheap. Despite that, you could feel a great sense of pride in her home. Sombra and Reaper made themselves comfortable on the floor, while offering you a fold out chair near the food Tia Asuncion had made."
    "The food was delicious and Reaper’s overreactions to the inane plot twists of the novella were quite amusing, as were Sombra’s snide comments and his very vocal insistence that she keep them to herself.
She spent most of the episode alternating between pulling up fan memes about recurring characters and plot points to show you, and trying to surreptitiously take some photos of the two you, though she was not quite as sneaky as she thought she was."
    :-> [:hotel :intro]]

   [:hotel :intro]
   [:miranda/narration
    "After the screening, you returned to your hotel with a hard-light tupperware of full of treats and, about 20 minutes after you’d walked out the door, a snapchat from Sombra."
    :-> [:hotel :cutscene]]

   [:hotel :cutscene]
   [:miranda/characters
    [[[:photos :_sombraDate2] [:phones :_symHand]]]
    :-> [:hotel :cutscene :text]]

   [:hotel :cutscene :text]
   [:miranda/dialogue
    ["Symmetra" [[:photos :_sombraDate2] [:phones :_symHand]]
     "Who was Benjamin? The omnic that liked pigeons?"]
    :=> [:lijiang [:spawn :intro] 0]]})
