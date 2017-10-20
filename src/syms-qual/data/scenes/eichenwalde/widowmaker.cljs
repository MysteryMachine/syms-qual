(ns syms-qual.data.scenes.eichenwalde.widowmaker)

(def start-date
  [:transition :miranda/mutation->basic
   [[:-> [:anubis :pharah :confirm]]
    (fn []
      ;;TODO: mutate state to indicate date
      )]])

(def data
  {[:eichenwalde :widowmaker 0]
   [:miranda/dialogue
    ["Symmetra" [] "Mrs. LaCroix, though we have been on the same team before, I don’t think we’ve gotten a real chance to talk."]
    ["Widowmaker" [] "I am not one for idle chit chat. The only reason I am still talking to you is because in this building, there is no stable perch for me to grapple onto. I cannot escape from being here. On the ground. With you."]
    ["Symmetra" [] "Were we not in a diner in our first mission? I do not believe I saw a perch there."]
    ["Widowmaker" [] "That is the thing about spiders. We are good at finding small cracks and wedging ourselves in there. How do you think my spine got this damaged?"]
    ["Symmetra" [] "I am unsure if you are being honest, or if you are playing with me."]
    ["Widowmaker" [] "It was caving. I do a lot of unnecessarily claustrophobic caving. Wriggling through the warm, unmoving, tight stones underground? That’s the only time I really feel alive now that I’m in the “lay low for a while after that last big hit” period of my assassin career climb."]
    ["Symmetra" [] "I’ve always had an interest in caving. Maybe you could take me on day?"]
    ["Widowmaker" [] "Yes. I will. Caving is very unsafe. If something were to happen to you, I would be very proud of myself."]
    ["Symmetra" [] "Is this your way of telling me you would not like to take me caving with you?"]
    ["Widowmaker" [] "Both are fine. Either I do not have to talk to you, or I can be indirectly responsible for your demise."]
    ["Symmetra" [] "I, um, see. I think, uh, I think I will go."]
    ["Widowmaker" [] "No, wait, return. I have a proposition for you."]
    :-> [:eichenwalde :widowmaker :option 0]]

   [:eichenwalde :widowmaker :option 0]
   [:miranda/option
    "Symmetra" []
    "No thank you, Mrs. LaCroix, I have understood your point."
    "What is this proposition you speak of?"] ;; TODO: transition this directly to widomaker 1

   [:eichenwalde :widowmaker :option 0 0]
   [:miranda/dialogue
    ["Widowmaker" [] "You will listen."]
    ["Symmetra" [] "No."]
    ["Widowmaker" [] "Look, please? I offer my condolences for my being edgy. "]
    ["Symmetra" [] "Are you apologizing?"]
    ["Widowmaker" [] "No. I just sympathize with your bad choice of thinking I wanted a conversation. I offer similar condolences for, say, Sombra’s investment in Bitcoin or Reaper’s purchase of a Hot Topic Franchise. Poor fool, he thought he could make a killing selling vintage belts with studs."]
    ["Widowmaker" [] "At any rate, your assumption that light conversation would be somehow useful to you is something I pity. My condolences."]
    ["Symmetra" [] "Just spill it, Mrs. LaCroix. What is it you need from me?"]
    :-> []]

   [:eichenwalde :widowmaker 1]
   [:miranda/dialogue
    ["Widowmaker" [] "You do not get to know it yet. Sombra is on the other team, and you are most likely a mole. I will reveal my plan only when you are ensnared in the spider’s web."]
    ["Symmetra" [] "I will not get anywhere near any cobwebs, Mrs. LaCroix."]
    ["Widowmaker" [] "The Spider’s Web is a hipster coffee shop located in the foyer of this old castle down the road from here. Last year Reaper convinced everyone to crash it on Halloween while wearing costumes he had made them based on some Dr. Junkenstein story Reinhardt wrote for Torbjorn’s children. He and Angela kept threatening to drag the other customers into the woods and everyone ended up trashing a bunch of the castle’s security bots claiming they were zombies? It was this whole big thing, in any case they are banned from the store forever. I am not banned, however, because I do not do holidays. "]
    ["Symmetra" [] "That certainly sounds like something Reaper would do."]
    ["Widowmaker" [] " Ha! Indeed. Reaper mocks 76 for being a stereotypical American, and yet he’s was always the one insisting they all celebrate his ridiculous American holiday every year. Regardless, the roof of The Spider’s Web is the perfect vantage point from which to attack the objective. They will never see it coming."]
    ["Symmetra" [] "So your plan is for me to fortify your position in this place?"]
    ["Widowmaker" [] "Oh. Pff. No. Why would I do that?"]
    ["Symmetra" [] "Mrs. LaCroix, I am no mole, you can drop the act."]
    ["Widomaker" [] "Never. Sombra’s ears are everywhere. Look, just show up to the place."]
    :-> [:eichenwalde :widowmaker :choice]]

   [:eichenwalde :widowmaker :choice]
   [:miranda/text-option
    "What will you do?"
    ["Show up to the place" (constantly true) start-date]
    ["Converse with your other teammates" (constantly true)
     [:eichenwalde :widowmaker :no]]]

   [:eichenwalde :widowmaker :yes]
   [:miranda/dialogue
    ["Symmetra" [] "Your plan better be good, Mrs. LaCroix."]
    ["Widowmaker" [] "Humph."]
    :-> [:eichenwalde :widowmaker :cutscene]]

   [:eichenwalde :widowmaker :no]
   [:miranda/dialogue
    ["Widowmaker" [] "I will give you another chance. If you decide to support me, I will allow it."]
    :-> [:eichenwalde :choice]]

   [:eichenwalde :widowmaker :cutscene]
   [:miranda/narration
    "Apparently, when Reaper and friends were arrested for blowing up the coffee shop, he named Amelie LaCroix as the person who could be held responsible for the damages. They recognized Widowmaker from her blue tint, and immediately arrested her for failing to pay for the damages to the shop that Halloween. They arrested you both, detaining you together for the hour it took her to call up Doomfist and have him free up the funds so you two could make bail. The match was lost badly. Widowmaker looked angry at you, but you could quite easily ascertain she was too embarrassed to say anything about the events that transpired."
    :-> [:junkertown :intro]]})
