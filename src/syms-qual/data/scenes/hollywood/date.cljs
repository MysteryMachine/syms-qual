(ns syms-qual.data.scenes.hollywood.date
  (:require [carmen.util :as anim :refer [scoot]]
            [syms-qual.util :as util :refer [inc-transition]]))

(def data
  {[:objective :sombra 2]
   [:miranda/dialogue
    ["Sombra" []
     "It’s a great day to sit on the objective, isn’t it?"]
    ["Symmetra" []
     "Hoho, certainly you do not mean literally."]
    ["Sombra" []
     "Yes, literally. Crush Guy Fieri under the weight of your justice."]
    ["Reaper" []
     "He is eating Hollywood wings, do not interrupt him."]
    ["Symmetra" []
     "Ugh, his face is nothing but sauce. I feel unclean just looking at him."]
    ["Reaper" []
     "Yes. It is beautiful. I will need private time to think about this moment in the future."]
    ["Sombra" []
     "Guy Fieri is at least 20% sauce by mass."]
    ["Symmetra" []
     "A man cannot be sauce."]
    ["Sombra" []
     "He’s an omnic, mi amor, why else do you think he is still alive?. Transhumanism at its finest, it’s downright romantic."]
    ["Reaper" []
     "With literal sauce stores."]
    ["Symmetra" []
     "Does he shoot it on food?"]
    ["Reaper" []
     "The ratings depend on it."]
    ["Symmetra" []
     "I do not understand your fascination with this man, Sombra. Nor how you convinced Overwatch to allow us to escort him on this mission."]
    ["Reaper" []
     "Well, it turns out that Overwatch’s fans, surprisingly, overlap largely with fan’s of late 2010’s memes. So we persuaded them that this would be great form of cross platform advertising."]
    ["Sombra" []
     "It’s probably cause of Lucio. He specifically specializes in 2010’s era techno. I think it’s just a decade that is back in vogue."]
    ["Symmetra" []
     "I always did think his music felt rather antiquated."]
    ["Sombra" []
     "Symmetra! Quickly! Our opponents!"]
    ["Symmetra" []
     "I see them!"]
    :-> []]

   [:objective :sombra :date :cutscene 0]
   [:miranda/narration
    "As the payload rounds the corner you face off once more with the defending team. Thanks to your successful previous attack, your ultimate is ready to go and you are able to quickly deploy a shield generato2r. You manage to catch the defenders in a pincer attack, trapping them between the three of you on the payload and Lucio and Orisa who had flanked around the back. With the additional health provided by your shield generator, you are easily able to outlast them, and the payload continues on its steady course forward."
    :-> [:objective :sombra :date 0]]

   [:objective :sombra :date 0]
   [:miranda/dialogue
    ["Sombra" []
     "Ehehe, this plan is really working."]
    ["Symmetra" []
     "It only seems logical that focusing our efforts on the objective would yield such results."]
    ["Sombra" []
     "Hey, you’re not wrong. I’m just not used to doing things so directly."]
    ["Reaper" []
     "I’m gonna catch up with the others to secure the next checkpoint. You two stay here and make sure the payload keeps moving. I’m sure you’ll appreciate the alone time. Guard Fieri with your lives."]
    ["Sombra" []
     "Mira, abuelo, if you don’t...ugh, he’s gone."]
    ["Sombra" []
     "I think we’re pushing through the set for the new novela virtual Virtumundo has been recording, “Amor de un Androide”, it’s the hot new thing."]
    :-> [:objective :sombra :date :option 0]]

   [:objective :sombra :date :option 0]
   [:miranda/option
    "Symmetra" []
    "Virtual novela? You mean those soap opera things?"
    "You watch a lot of bad television, Sombra."]

   [:objective :sombra :date :option 0 0]
   [:miranda/dialogue
    ["Sombra" []
     "You’ve never seen? Dios mio, we have to go to Reaper’s tia’s house after to go watch an episode."]
    ["Symmetra" []
     "His aunt?"]
    ["Sombra" []
     "Asuncion is literally the sweetest woman you’ll ever meet, the reaping bits that Gabe likes aren’t a family thing, he’s like, the edgy gay goth sheep."]
    ["Symmetra" []
     "Oh?"]
    ["Sombra" []
     "Tia Asuncion is, like, totally hooking up with an Omnic too, so she’s way into this novella. Lots of emotions for her to work through."]
    :-> []]

   [:objective :sombra :date :option 0 1]
   [:miranda/dialogue
    ["Sombra" []
     "Hey!  I’ll have you know, the online novela meme community is quite strong. Much like the pro wrestling meme scene."]
    ["Symmetra" []
     "You watch pro wrestling as well?"]
    ["Sombra" []
     "It’s the same thing, except you swap the amount of sex they have in novellas, with the amount of violence they have in wrestling. The core components are still there. Betrayal for no good reason. Love for no good reason. Just a bunch of terrible actors really diving into the drama of the human condition."]
    :-> [:objective :sombra :date 1]]

   [:objective :sombra :date 1]
   [:miranda/dialogue
    ["Symmetra" []
     "You have a... unique perspective, on the artistic merits of such material. Have you always been a fan of these sorts of programs?"]
    ["Sombra" []
     "I guess. Novelas were always in the background growing up. The adults always made me quiet down when their favorites came on. Back then I was too busy trading bitcoins on the darkweb for MMO gold to pay close attention. But eventually, I started to, and now I’m a fan."]
    ["Sombra" []
     "I got Gabe to start watching with me. It’s our slice of normalcy."]
    ["Symmetra" []
     "You two have such a strange relationship."]
    ["Sombra" []
     "Hehe, it’s funny yeah. When I joined Talon, I wasn’t exactly expecting to make friends. I had schemes and machinations of my own going on, so I was pretty surprised when I accidentally found myself a weird edgy father figure. I don’t think I’d trade my family for anything, though."]
    ["Symmetra" []
     "I feel a similar sort of tie to my work at Vishkar."]
    ["Sombra" []
     "Really? I thought after our afternoon together you’d be questioning your corporate loyalty. I thought you weren’t into moral greys, how is Vishkar any different from what we did?"]
    ["Symmetra" []
     "Vishkar does not promote terrorism"]
    ["Sombra" []
     "Oh? And those developments in Rio? Definitely no terrorism involved in getting those approved... You had nothing to do with that I presume?"]
    ["Symmetra" []
     "I..."]
    ["Sombra" []
     "And now you’ve displaced a bunch of folks. Well done, law and order. "]
    ["Symmetra" []
     "We--"]
    ["Sombra" []
     "Oh shit, duck!"]
    :-> [:objective :sombra :date :cutscene 1]]

   [:objective :sombra :date :cutscene 1]
   [:miranda/narration
    "Thanks to Sombra’s warning you manage to narrowly avoid the incoming Roadhog hook, diving out of the way in the nick of time, but its arrival brings an abrupt end to your conversation. Sombra seem hesitant to say anything other than the bare minimum to necessary to keep the payload moving forward. Your team successfully reaches the final check point before the timer expires, granting you the opportunity to win the match in the third and final round. You capture the point quickly and after a brief victory celebration on the point, just as you’re about to pack up, Sombra approaches you again."
    :-> [:objective :sombra :date 2]]

   [:objective :sombra :date 2]
   [:miranda/dialogue
    ["Sombra" []
     "Hey, listen. I know I was out of line. I, uh, sorry."]
    :-> [:objective :sombra :date :option 1]]

   [:objective :sombra :date :option 1]
   [:miranda/option
    "" []
    ""]

   [:objective :sombra :date :option 1 0]
   [:miranda/dialogue
    ["Symmetra" []
     "Your sense of justice is truly unexpected. I’m surprised, considering your notorious status as criminal scum."]
    ["Sombra" []
     "The scummiest! I’m like Robin Hood if he was gayer but also awful."]
    :-> [:objective :sombra :date 3]]

   [:objective :sombra :date :option 1 1]
   [:miranda/dialogue
    ["Symmetra" []
     "I respect that."]
    ["Sombra" []
     "Thanks. I’ll be sure to meddle more in the future."]
    :-> [:objective :sombra :date 3]]

   [:objective :sombra :date 3]
   [:miranda/dialogue
    ["Symmetra" []
     "I know you think I am naive, but trust me when I say believe in the work that Vishkar is doing. "]
    ["Symmetra" []
     "I believe in the power of our technology to change the world for the better. I understand that the day has not yet come where all can benefit equally, but I believe that my efforts are bringing us closer to that day. Our technology will bring benefit to so many people. With it, we will house the world. "]
    ["Sombra" []
     "That would be nice, but, mira, it’s not technology alone that’s going to make these people’s lives better. "]
    ["Sombra" []
     "Come with me and let me show you. You’ve lived in ivory towers made of light for too long."]
    ["Symmetra" []
     "I’m not sure..."]
    ["Sombra" []
     "You wanna help common people, right? Reaper’s Tia is literally my favorite person. I’ll introduce you. Come carry groceries for Tia Asuncion and her Omnic boytoy, and get a taste of normal life. I think you’ll see things in a new and different light. I’ll take you tonight!"]
    ["Symmetra" []
     "I am not sure I can make it tonight. These matches exhaust me, and I will need some quiet alone time before I am ready."]
    ["Sombra" []
     "Hey! We have a few extra days in LA before our next match. Take your time. If you can make it this weekend there’s an exciting holiday special episode. "]
    ["Symmetra" []
     "Alright, Ms. Sombra, you can stop tugging at my sleeve. I’ll make the effort."]
    ["Sombra" []
     "You have my number. Remember, I hacked it. With hacking. And don’t forget to click the link! Hasta. "]
    :-> [:objective :sombra :date :cutscene 3]]

   [:objective :sombra :date :cutscene 3]
   [:miranda/narration
    "After some days of much needed rest, you felt ready to take Sombra up on her offer and met up with her and Reaper at Asuncion’s quaint house. Her living room featured a hodgepodge of mismatched furniture, some salvaged, and some probably bought on the cheap. Despite that, you could feel a great sense of pride in her home. Sombra and Reaper made themselves comfortable on the floor, while offering you a fold out chair near the food Tia Asuncion had made."
    "The food was delicious and Reaper’s overreactions to the inane plot twists of the novella were quite amusing, as were Sombra’s snide comments and his very vocal insistence that she keep them to herself. She spent most of the episode alternating between pulling up fan memes about recurring characters and plot points to show you, and trying to surreptitiously take some photos of the two you, though she was not quite as sneaky as she thought she was. After the screening, you left with a hard-light tupperware of full of treats and, about 20 minutes after you’d walked out the door, a snapchat from Sombra."
    :-> [:lijang :intro]]

   [:objective :sombra :non-date :cutscene]
   [:miranda/narration
    "As the payload rounds the corner you face off once more with the defending team. You manage to quickly defeat them with a pincer attack, trapping them between the three of you on the payload and Lucio and Orisa who had flanked around their backside. After the team fight, your team pushes on ahead to clear the way, leaving you alone to continue escorting the payload."
    " You set up your teleporter on the car beside you, in case you need back up. On occasion, someone pops through to give you a high five for doing the hard work of escorting but your journey to the end of the map is largely uneventful. Having completed the course without going into overtime, your team is granted the opportunity to win the match in a third and final round by recapturing the first point. You do so with ease netting yourself and hard fought victory."
    :=> [:lijiang [:spawn :intro] 0]]})
