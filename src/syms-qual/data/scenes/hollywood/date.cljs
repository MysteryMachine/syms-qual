(ns syms-qual.data.scenes.hollywood.date
  (:require [carmen.util :as anim :refer [scoot]]
            [syms-qual.util :as util :refer [inc-transition]]))

(def data
  {[:objective :sombra 2]
   [:miranda/dialogue
    ["Sombra" [[:reaper :_neutral (scoot -86 -6 1)] [:sombra :_explainHand (scoot -74 -14 1)] [:symmetra :_neutral (scoot 84 4 1)]]
     "It’s a great day to sit on the objective, isn’t it?"]
    ["Symmetra" [[:reaper :_neutral (scoot -6)] [:sombra :_neutral (scoot -14)] [:symmetra :_laugh (scoot 4)]]
     "Hoho, certainly you do not mean literally."]
    ["Sombra" [[:reaper :_neutral (scoot -6)] [:sombra :_leanin (scoot -14)] [:symmetra :_smile (scoot 4)]]
     "Yes, literally. Crush Guy Fieri under the weight of your justice."]
    ["Reaper" [[:reaper :_point-up (scoot -6)] [:sombra :_neutral (scoot -14)] [:symmetra :_neutral (scoot 4)]]
     "He is eating Hollywood wings, do not interrupt him."]
    ["Symmetra" [[:reaper :_neutral (scoot -6)] [:sombra :_neutral (scoot -14)] [:symmetra :_explainWTF (scoot 4)]]
     "Ugh, his face is nothing but sauce. I feel unclean just looking at him."]
    ["Reaper" [[:reaper :_explain (scoot -6)] [:sombra :_neutral (scoot -14)] [:symmetra :_neutral (scoot 4)]]
     "Yes. It is beautiful. I will need private time to think about this moment in the future."]
    ["Sombra" [[:reaper :_neutral (scoot -6)] [:sombra :_laugh (scoot -14)] [:symmetra :_neutral (scoot 4)]]
     "Guy Fieri is at least 20% sauce by mass."]
    ["Symmetra" [[:reaper :_neutral (scoot -6)] [:sombra :_neutral (scoot -14)] [:symmetra :_explain (scoot 4)]]
     "A man cannot be sauce."]
    ["Sombra" [[:reaper :_neutral (scoot -6)] [:sombra :_explainHand (scoot -14)] [:symmetra :_neutral (scoot 4)]]
     "He’s an omnic, mi amor, why else do you think he is still alive? Transhumanism at its finest, it’s downright romantic."]
    ["Reaper" [[:reaper :_explain (scoot -6)] [:sombra :_neutral (scoot -14)] [:symmetra :_neutral (scoot 4)]]
     "With tactical sauce caches, so that he can ensure that his supremacy over Flavortown remains supreme."]
    ["Symmetra" [[:reaper :_neutral (scoot -6)] [:sombra :_neutral (scoot -14)] [:symmetra :_confused (scoot 4)]]
     "Does he shoot it on food?"]
    ["Reaper" [[:reaper :_point-up (scoot -6)] [:sombra :_neutral (scoot -14)] [:symmetra :_confused (scoot 4)]]
     "The ratings depend on it."]
    ["Symmetra" [[:reaper :_neutral (scoot -6)] [:sombra :_neutral (scoot -14)] [:symmetra :_explain (scoot 4)]]
     "I do not understand your fascination with this man, Sombra. Nor how you convinced Overwatch to allow us to escort him on this mission."]
    ["Reaper" [[:reaper :_explain (scoot -6)] [:sombra :_neutral (scoot -14)] [:symmetra :_confused (scoot 4)]]
     "Well, it turns out that Overwatch’s fans, surprisingly, overlap largely with fan’s of late 2010’s memes. So we persuaded them that this would be great form of cross platform advertising."]
    ["Sombra" [[:reaper :_neutral (scoot -6)] [:sombra :_explain (scoot -14)] [:symmetra :_confused (scoot 4)]]
     "It’s probably cause of Lucio. He specifically specializes in 2010’s era techno. I think it’s just a decade that is back in vogue."]
    ["Symmetra" [[:reaper :_neutral (scoot -6)] [:sombra :_neutral (scoot -14)] [:symmetra :_thinking (scoot 4)]]
     "I always did think his music felt rather antiquated."]
    ["Sombra" [[:reaper :_neutral (scoot -6)] [:sombra :_point (scoot -14)] [:symmetra :_neutral (scoot 4)]]
     "Symmetra! Quickly! Our opponents!"]
    ["Reaper" [[:reaper :_reverseLeave (scoot -6)] [:sombra :_point (scoot -14)] [:symmetra :_craftTurret (scoot 4)]]
     "Time to go put this team on my back. Later, fuckers."]
    :transition :miranda/conditional
    [#(= (:points/sombra %) 2) [:-> [:set :sombra :date :cutscene 0]]
     :else [:-> [:set :sombra :non-date :cutscene]]]]

   [:set :sombra :date :cutscene 0]
   [:miranda/narration
    "As the payload rounds the corner you face off once more with the defending team. Thanks to your successful previous attack, your ultimate is ready to go and you are able to quickly deploy a shield generator. You manage to catch the defenders in a pincer attack, trapping them between the three of you on the payload and Lucio and Orisa who had flanked around the back. With the additional health provided by your shield generator, you are easily able to outlast them, and the payload continues on its steady course forward."
    :-> [:set :sombra :date 0]]

   [:set :sombra :date 0]
   [:miranda/dialogue
    ["Sombra" [[:reaper :_neutral (scoot -86 -6 1)] [:sombra :_leanin (scoot -74 -14 1)] [:symmetra :_smile (scoot 84 4 1)]]
     "Ehehe, this plan is really working."]
    ["Symmetra" [[:reaper :_neutral (scoot -6)] [:sombra :_neutral (scoot -14)] [:symmetra :_explainUncomfortable (scoot 4)]]
     "It only seems logical that focusing our efforts on the objective would yield such results."]
    ["Sombra" [[:reaper :_neutral (scoot -6)] [:sombra :_explainHand (scoot -14)] [:symmetra :_smile (scoot 4)]]
     "Hey, you’re not wrong. I’m just not used to doing things so directly."]
    ["Reaper" [[:reaper :_point-up (scoot -6)] [:sombra :_neutral (scoot -14)] [:symmetra :_neutral (scoot 4)]]
     "I’m gonna catch up with the others to secure the next checkpoint. You two stay here and make sure the payload keeps moving. I’m sure you’ll appreciate the alone time. Guard Fieri with your lives."]
    ["Sombra" [[:reaper :_reverseLeave (scoot -6 100 2)] [:sombra :_yell (scoot -14 -6 2)] [:symmetra :_awkward (scoot 4 2 2)]]
     "Mira, abuelo, if you don’t...ugh, he’s gone."]
    ["Sombra" [[:sombra :_explainAwkward (scoot -6)] [:symmetra :_smile (scoot 2)]]
     "I think we’re pushing through the set for the new novela virtual Virtumundo has been recording, “Amor de un Androide Gaucho”, it’s the hot new thing."]
    :-> [:set :sombra :date :option 0]]

   [:set :sombra :date :option 0]
   [:miranda/option
    "Symmetra" [[:sombra :_neutral (scoot -6)] [:symmetra :_neutral (scoot 2)]]
    "Virtual novela? You mean those soap opera things?"
    "You watch a lot of bad television, Sombra."]

   [:set :sombra :date :option 0 0]
   [:miranda/dialogue
    ["Sombra" [[:sombra :_surprised (scoot -6)] [:symmetra :_neutral (scoot 2)]]
     "You’ve never seen it? Dios mio, we have to go to Reaper’s tia’s house after to go watch an episode."]
    ["Symmetra" [[:sombra :_neutral (scoot -6)] [:symmetra :_skeptical (scoot 2)]]
     "Reaper has an aunt? That he visits regularly?"]
    ["Sombra" [[:sombra :_nostalgic (scoot -6)] [:symmetra :_smile (scoot 2)]]
     "Asuncion is literally the sweetest woman you’ll ever meet, the reaping bits that Gabe likes aren’t a family thing, he’s like, the edgy gay goth black sheep."]
    ["Symmetra" [[:sombra :_neutral (scoot -6)] [:symmetra :_confused (scoot 2)]]
     "Oh?"]
    ["Sombra" [[:sombra :_explainHand (scoot -6)] [:symmetra :_neutral (scoot 2)]]
     "Tia Asuncion is, like, totally hooking up with an Omnic too, so she’s way into this novella. Lots of emotions for her to work through."]
    :-> [:set :sombra :date 1]]

   [:set :sombra :date :option 0 1]
   [:miranda/dialogue
    ["Sombra" [[:sombra :_leanin (scoot -6)] [:symmetra :_neutral (scoot 2)]]
     "Hey!  I’ll have you know, the online novela meme community is quite strong. Much like the pro wrestling meme scene."]
    ["Symmetra" [[:sombra :_neutral (scoot -6)] [:symmetra :_skeptical (scoot 2)]]
     "You watch pro wrestling as well?"]
    ["Sombra" [[:sombra :_shrug (scoot -6)] [:symmetra :_skeptical (scoot 2)]]
     "Novellas and wrestling are the same formula — violence, love, and betrayal. The Golden Lovers breaking up literally ruined romance for me."]
    :-> [:set :sombra :date 1]]

   [:set :sombra :date 1]
   [:miranda/dialogue
    ["Symmetra" [[:sombra :_neutral (scoot -6)] [:symmetra :_explainUncomfortable (scoot 2)]]
     "You have a... unique perspective, on the artistic merits of such material. Have you always been a fan of these sorts of programs?"]
    ["Sombra" [[:sombra :_awkwardSad (scoot -6)] [:symmetra :_neutral (scoot 2)]]
     "I guess. Novelas were always in the background growing up. The adults always made me quiet down when their favorites came on."]
    ["Sombra" [[:sombra :_explainAwkward (scoot -6)] [:symmetra :_neutral (scoot 2)]]
     "Back then I was too busy trading bitcoins on the darkweb for MMO gold to pay close attention. But eventually, I started to, and now I’m a fan."]
    ["Sombra" [[:sombra :_nostalgic (scoot -6)] [:symmetra :_neutral (scoot 2)]]
     "I got Gabe to start watching with me. It’s our slice of normalcy."]
    ["Symmetra" [[:sombra :_neutral (scoot -6)] [:symmetra :_confused (scoot 2)]]
     "You two have such a strange relationship."]
    ["Sombra" [[:sombra :_explainCondescendSmile (scoot -6)] [:symmetra :_neutral (scoot 2)]]
     "Hehe, it’s funny yeah. When I joined Talon, I wasn’t exactly expecting to make friends. I had schemes and machinations of my own going on, so I was pretty surprised when I accidentally found myself a weird edgy father figure."]
    ["Sombra" [[:sombra :_wink (scoot -6)] [:symmetra :_neutral (scoot 2)]]
     "I don’t think I’d trade my family for anything, though."]
    ["Symmetra" [[:sombra :_neutral2 (scoot -6)] [:symmetra :_explainUncomfortable (scoot 2)]]
     "I feel a similar sort of tie to my work at Vishkar."]
    ["Sombra" [[:sombra :_nostalgicSad (scoot -6)] [:symmetra :_neutral (scoot 2)]]
     "Really? I thought after our afternoon together you’d be questioning your corporate loyalty."]
    ["Symmetra" [[:sombra :_frown (scoot -6)] [:symmetra :_explainWTF (scoot 2)]]
     "I am not loyal to the corporation. I am loyal to the company's mission."]
    ["Sombra" [[:sombra :_nostalgic (scoot -6)] [:symmetra :_sad (scoot 2)]]
     "Makes sense. Rio was a real tour de force of mission and values based action."]
    ["Symmetra" [[:sombra :_frown (scoot -6)] [:symmetra :_explainSad (scoot 2)]]
     "I..."]
    ["Sombra" [[:sombra :_explainCondescend (scoot -6)] [:symmetra :_sad (scoot 2)]]
     "Only an architecture company with true moral fortitude could displace that many people that quickly. Well done, law and order."]
    ["Symmetra" [[:sombra :_frown (scoot -6)] [:symmetra :_explainSad (scoot 2)]]
     "We—"]
    ["Sombra" [[:sombra :_point (scoot -6)] [:symmetra :_bewildered (scoot 2)]]
     "Oh shit, duck!"]
    :-> [:set :sombra :date :cutscene 1]]

   [:set :sombra :date :cutscene 1]
   [:miranda/narration
    "Thanks to Sombra’s warning you manage to narrowly avoid the incoming Roadhog hook, diving out of the way in the nick of time, but its arrival brings an abrupt end to your conversation. Sombra seem hesitant to say anything other than the bare minimum to necessary to keep the payload moving forward."
    :-> [:objective :sombra :date :cutscene 1]]

   [:objective :sombra :date :cutscene 1]
   [:miranda/narration
    "Your team successfully reaches the final check point before the timer expires, granting you the opportunity to win the match in the third and final round. You capture the point quickly and after a brief victory celebration on the point, just as you’re about to pack up, Sombra approaches you again."
    :-> [:objective :sombra :date 2]]

   [:set :sombra :non-date :cutscene]
   [:miranda/narration
    "As the payload rounds the corner you face off once more with the defending team. You manage to quickly defeat them with a pincer attack, trapping them between the three of you on the payload and Lucio and Orisa who had flanked around their backside. After the team fight, your team pushes on ahead to clear the way, leaving you alone to continue escorting the payload."
    :-> [:objective :sombra :non-date :cutscene]]

   [:objective :sombra :non-date :cutscene]
   [:miranda/narration
    "You set up your teleporter on the car beside you, in case you need back up. On occasion, someone pops through to give you a high five for doing the hard work of escorting but your journey to the end of the map is largely uneventful. Having completed the course without going into overtime, your team is granted the opportunity to win the match in a third and final round by recapturing the first point. You do so with ease netting yourself a hard fought victory."
    :=> [:lijiang [:spawn :intro] 0]]})
