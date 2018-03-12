(ns syms-qual.data.scenes.eichenwalde.widowmaker
  (:require [carmen.util :as anim :refer [scoot]]
            [syms-qual.util :as util :refer [inc-transition]]))

(def data
  {[:spawn :widowmaker 0]
   [:miranda/dialogue
    ["Symmetra" [[:widowmaker :_neutralRight (scoot -80 -28 1)] [:symmetra :_helloWarm (scoot 62 0 1)]]
     "Mrs. LaCroix, though we have been on the same team before, I don’t think we’ve gotten a real chance to talk."]
    ["Widowmaker" [[:widowmaker :_tch (scoot -28)] [:symmetra :_neutral (scoot 0)]]
     "I am not one for idle chit chat. The only reason I am still talking to you is because in this building, there is no stable perch for me to grapple onto. I cannot escape from being here. On the ground. With you."]
    ["Symmetra" [[:widowmaker :_neutralRight (scoot -28)] [:symmetra :_skeptical (scoot 0)]]
     "Were we not in a diner in our first mission? I do not believe I saw a perch there."]
    ["Widowmaker" [[:widowmaker :_explain (scoot -28)] [:symmetra :_neutral (scoot 0)]]
     "That is the thing about spiders. We are good at finding small cracks and wedging ourselves in there. How do you think my spine got this damaged?"]
    ["Symmetra" [[:widowmaker :_neutralRight (scoot -28)] [:symmetra :_confused (scoot 0)]]
     "I am unsure if you are being honest, or if you are playing with me."]
    ["Widowmaker" [[:widowmaker :_eyeRoll (scoot -28)] [:symmetra :_confused (scoot 0)]]
     "It was caving. I do a lot of unnecessarily claustrophobic caving. Wriggling through the warm, unmoving, tight stones underground? That’s the only time I really feel alive now that I’m in the \"lay low for a while after that last big hit\" period of my assassin career climb."]
    ["Symmetra" [[:widowmaker :_neutralRight (scoot -28)] [:symmetra :_explainUncomfortable (scoot 0)]]
     "I’ve always had an interest in caving. Maybe you could take me one day?"]
    ["Widowmaker" [[:widowmaker :_explainSmile (scoot -28)] [:symmetra :_neutral (scoot 0)]]
     "Yes. I will. Caving is very unsafe. If something were to happen to you, I would be very proud of myself."]
    ["Symmetra" [[:widowmaker :_neutralRight (scoot -28)] [:symmetra :_explainWTF (scoot 0)]]
     "Is this your way of telling me you would not like to take me caving with you?"]
    ["Widowmaker" [[:widowmaker :_explainBack (scoot -28)] [:symmetra :_WTF (scoot 0)]]
     "Both are fine. Either I do not have to talk to you, or I can be indirectly responsible for your demise."]
    ["Symmetra" [[:widowmaker :_neutralRight (scoot -28)] [:symmetra :_explainWTF (scoot 0 10 0.5)]]
     "Ah. I will leave, then."]
    ["Widowmaker" [[:widowmaker :_point (scoot -28)] [:symmetra :_neutral (scoot 10)]]
     "No, wait, return. I have a proposition for you."]
    :-> [:spawn :widowmaker :option 0]]

   [:spawn :widowmaker :option 0]
   [:miranda/option
    "Symmetra" [[:widowmaker :_neutralRight (scoot -28)] [:symmetra :_WTF (scoot  10 0 0.5)]]
    "No thank you, Mrs. LaCroix, I have understood your point."
    "What is this proposition you speak of?"]

   [:spawn :widowmaker :option 0 0]
   [:miranda/dialogue
    ["Widowmaker" [[:widowmaker :_explain (scoot -28)] [:symmetra :_WTF (scoot 0)]]
     "You must listen. Do not make that face when I am talking to you."]
    ["Symmetra" [[:widowmaker :_neutralRight (scoot -28)] [:symmetra :_no (scoot 0)]]
     "No."]
    ["Widowmaker" [[:widowmaker :_tch (scoot -28)] [:symmetra :_neutral (scoot 0)]]
     "Look, please? I offer my condolences for my being edgy. "]
    ["Symmetra" [[:widowmaker :_neutralRight (scoot -28)] [:symmetra :_explain (scoot 0)]]
     "Are you apologizing?"]
    ["Widowmaker" [[:widowmaker :_explainBack (scoot -28)] [:symmetra :_WTF (scoot 0)]]
     "No. I just sympathize with your bad choice of thinking I wanted a conversation. I offer similar condolences for, say, Sombra’s investment in Bitcoin or Reaper’s purchase of a Hot Topic Franchise."]
    ["Widowmaker" [[:widowmaker :_eyeRoll (scoot -28)] [:symmetra :_WTF (scoot 0)]]
     "Damn fool, he thought he could make a killing selling vintage belts with studs."]
    ["Widowmaker" [[:widowmaker :_explain (scoot -28)] [:symmetra :_WTF (scoot 0)]]
     "At any rate, your assumption that light conversation would be somehow useful to you is something I pity. My condolences."]
    ["Symmetra" [[:widowmaker :_neutralRight (scoot -28)] [:symmetra :_explainWTF (scoot 0)]]
     "Just spill it, Mrs. LaCroix. What is it you need from me?"]
    :-> [:spawn :widowmaker :lazy 0]]

   [:spawn :widowmaker :lazy 0]
   [:miranda/dialogue
    ["Widowmaker" [[:widowmaker :_eyeRoll (scoot -28)] [:symmetra :_WTF (scoot 0)]]
     "You do not get to know it yet. Sombra is on the other team, and you are most likely a mole. I will reveal my plan only when you are ensnared in the spider’s web."]
    :-> [:spawn :widowmaker 1]]

   [:spawn :widowmaker :option 0 1]
   [:miranda/dialogue
    ["Widowmaker" [[:widowmaker :_eyeRoll (scoot -28)] [:symmetra :_WTF (scoot 0)]]
     "You do not get to know it yet. Sombra is on the other team, and you are most likely a mole. I will reveal my plan only when you are ensnared in the spider’s web."]
    :-> [:spawn :widowmaker 1]]


   [:spawn :widowmaker 1]
   [:miranda/dialogue
    ["Symmetra" [[:widowmaker :_neutralRight (scoot -28)] [:symmetra :_angry (scoot 0)]]
     "I will not get anywhere near any cobwebs, Mrs. LaCroix."]
    ["Widowmaker" [[:widowmaker :_explain (scoot -28)] [:symmetra :_neutral (scoot 0)]]
     "The Spider’s Web is a hipster coffee shop located in the foyer of this old castle down the road from here."]
    ["Widowmaker" [[:widowmaker :_point (scoot -28)] [:symmetra :_neutral (scoot 0)]]
     "Last year Reaper convinced everyone to crash it on Halloween while wearing costumes he had made them based on some Dr. Junkenstein story Reinhardt wrote for Torbjorn’s children."]
    ["Widowmaker" [[:widowmaker :_explainBack (scoot -28)] [:symmetra :_neutral (scoot 0)]]
     "He and Angela kept threatening to drag the other customers into the woods and everyone ended up trashing a bunch of the castle’s security bots claiming they were zombies?"]
    ["Widowmaker" [[:widowmaker :_eyeRoll (scoot -28)] [:symmetra :_neutral (scoot 0)]]
     "It was this whole big thing, in any case they are banned from the store forever. I am not banned, however, because I do not do holidays. "]
    ["Symmetra" [[:widowmaker :_neutralRight (scoot -28)] [:symmetra :_thinking (scoot 0)]]
     "That certainly sounds like something Reaper would do."]
    ["Widowmaker" [[:widowmaker :_laugh (scoot -28)] [:symmetra :_neutral (scoot 0)]]
     "Ha! Indeed. Reaper mocks 76 for being a stereotypical American, and yet he’s was always the one insisting they all celebrate his ridiculous American holiday every year."]
    ["Widowmaker" [[:widowmaker :_point (scoot -28)] [:symmetra :_neutral (scoot 0)]]
     "Regardless, the roof of The Spider’s Web is the perfect vantage point from which to attack the objective. They will never see it coming."]
    ["Symmetra" [[:widowmaker :_neutralRight (scoot -28)] [:symmetra :_explainUncomfortable (scoot 0)]]
     "So your plan is for me to fortify your position in this place?"]
    ["Widowmaker" [[:widowmaker :_eyeRoll (scoot -28)] [:symmetra :_neutral (scoot 0)]]
     "Oh. Pff. No. Why would I do that?"]
    ["Symmetra" [[:widowmaker :_neutralRight (scoot -28)] [:symmetra :_explainUncomfortable (scoot 0)]]
     "Mrs. LaCroix, I am no mole, you can drop the act."]
    ["Widomaker" [[:widowmaker :_point (scoot -28)] [:symmetra :_WTF (scoot 0)]]
     "Never. Sombra’s ears are everywhere. Look, just show up to the place."]
    :-> [:spawn :widowmaker :choice]]

   [:spawn :widowmaker :choice]
   [:miranda/text-option
    "What will you do?"
    ["Show up to the place" (constantly true)
     [:-> [:spawn :widowmaker :yes]]]
    ["Converse with your other teammates" (constantly true)
     [:-> [:spawn :widowmaker :no]]]]

   [:spawn :widowmaker :yes]
   [:miranda/dialogue
    ["Symmetra" [[:widowmaker :_neutralRight (scoot -28)] [:symmetra :_eyeRoll (scoot 0)]]
     "Your plan better be good, Mrs. LaCroix."]
    ["Widowmaker" [[:widowmaker :_tch (scoot -28)] [:symmetra :_neutral (scoot 0)]]
     "Tch."]
    :-> [:widowmaker]]

   [:spawn :widowmaker :no]
   [:miranda/dialogue
    ["Widowmaker" [[:widowmaker :_eyeRoll (scoot -28)] [:symmetra :_neutral (scoot 0)]]
     "I will give you another chance. If you decide to support me, I will allow it."]
    :-> [:spawn :choice]]

   [:widowmaker]
   [:miranda/characters
    [[]]
    :-> [:widowmaker :text]]


   [:widowmaker :text]
   [:miranda/narration
    "Apparently, when Reaper and friends were arrested for blowing up the coffee shop, he named Amelie LaCroix as the person who could be held responsible for the damages. They recognized Widowmaker from her blue tint, and immediately arrested her for failing to pay for the damages to the shop from last Halloween."
    "They arrested you both, detaining you together for the hour it took her to call up Doomfist and have him free up the funds so you two could make bail. The match was lost badly. Widowmaker looked angry at you, but you could quite easily ascertain she was too embarrassed to say anything about the events that transpired."
    :=> [:junkertown [:spawn :intro] 0]]})
