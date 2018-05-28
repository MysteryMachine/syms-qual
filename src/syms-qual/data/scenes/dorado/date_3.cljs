(ns syms-qual.data.scenes.dorado.date-3
  (:require [carmen.util :as anim :refer [scoot]]
            [syms-qual.util :as util :refer [inc-transition]]))

(def data
  {[:sombra-c :cutscene]
   [:miranda/characters
   [[]]
   :-> [:sombra-c :cutscene :text]]

   [:sombra-c :cutscene :text]
    [:miranda/narration
    "Sombra leads you seductively up the stairs before abruptly scrambling out the window on the landing. The slickness of the roof tiles and the steepness of their grade give you pause for a second, but after a brief moment, you resolutely grab her outstretched hand and she pulls you up to join her. After getting your bearings, you look out over the bay to see the sun just beginning to crest over the hills on its far side."
    "Soft future funk plays out the speakers embedded in Sombra’s gloves, and the sound surrounds you as she loops her arm around your waist and leans her head against your shoulder. You pull her close enjoying the moment, noting the glisten of the sun on the water and the boats, the way it highlights the stray strands of Sombra’s hair. You can tell she is searching for something to say, but eventually she grows comfortable with the silence as together you watch the sun slowly creep higher into the sky."
    :-> [:roof :date-3 0]]

   [:roof :date-3 0]
    [:miranda/dialogue
    ["Sombra" [[:symmetra_sombra :_neutral]] "…"]
     :transition :miranda/conditional
     [#(= 1 :sombra/kiss) [:-> [:roof :date-3 0 0 :a]]
      :else [:-> [:roof :date-3 0 1]]]]

   [:roof :date-3 0 0 :a]
   [:miranda/dialogue
    ["Symmetra" [[:symmetra_sombra :_smooch]] "..."]
    :-> [:roof :date-3 0 1]]

   [:roof :date-3 0 1]
   [:miranda/dialogue
        ["Sombra" [[:symmetra_sombra :_sombraTalk]] "I’m glad you stayed."]
    ["Symmetra" [[:symmetra_sombra :_symmetraStrainedSmileBlush]] "So am I."]
    ["Sombra" [[:symmetra_sombra :_sombraTalkLookUp]] "Do you think you’ll get to stay here much longer? Overwatch, I mean."]
    ["Symmetra" [[:symmetra_sombra :_symmetraExplainConcerned]] "I don’t get to decide my assignments. But given some of my recent behavior, I am assuming Vishkar intends to keep me away from Utopea."]
    ["Sombra" [[:symmetra_sombra :_sombraExplain]] "Well, whether you stay or you go, you’ll probably be seeing a lot of me either through Overwatch or here in Dorado. I know Vishkar’s had their eyes on this place for a while now."]
    ["Symmetra" [[:symmetra_sombra :_symmetraExplainConcerned]] "You are referring to the developments planned for Dorado?"]
    ["Symmetra" [[:symmetra_sombra :_symmetraExplain]] "Look. If we come here, I will not let the past repeat itself. I promise. It is still our mission to make the world a better place. I think the Vishkar leadership can be made to see reason."]
    ["Sombra" [[:symmetra_sombra :_sombraExplainSkeptical]] " I doubt it. Sanjay is working with us. You know that right? Your boss has a reserved seat at the big Talon round table."]
    ["Symmetra" [[:symmetra_sombra :_neutralSadLookUp]] " …"]
    ["Sombra" [[:symmetra_sombra :_sombraTalkSad]] "World’s a piece of shit, mi amor."]
    ["Symmetra" [[:symmetra_sombra :_neutralSad]] "…"]
    ["Symmetra" [[:symmetra_sombra :_symmetraExplainUncomfortable]] "Well, Talon has you and Vishkar has me. If you can work from behind the scenes to affect the change that really matters, I’m sure I can learn to do the same."]
    ["Sombra" [[:symmetra_sombra :_sombraExplain]] "We're gonna be the vigilante girlfriends of justice? I’m into it."]
    ["Symmetra" [[:symmetra_sombra :_symmetraBewildered]] "Hum?"]
    ["Symmetra" [[:symmetra_sombra :_symmetraExplainEarnest]] " I...I will do my best."]
    ["Sombra" [[:symmetra_sombra :_sombraExplain]] "Be careful, okay? Riding the line at a place like this isn’t easy. So many people trying to use technology for good have only ended up building the tools to help corporations screw us. But I believe in you Satya. You can find a way to make it work, but it’s going to be hard."]
    ["Symmetra" [[:symmetra_sombra :_symmetraStrainedSmileBlush]] "Your praise is a heavy burden, but I will do my best to live up to your expectations."]
    ["Sombra" [[:symmetra_sombra :_sombraTalkSmile]] "I’m sure you will, whitehat."]
    ["Symmetra" [[:symmetra_sombra :_symmetraExplainUncomfortable]] " I’ll try to be. But I’ve committed my share of crimes too."]
    ["Sombra" [[:symmetra_sombra :_sombraExplainBlush]] "It’s probably why you’re on a date with a terrorist."]
    ["Symmetra" [[:symmetra_sombra :_symmetraExplainUncomfortable]] "I’m trying to be serious! Why do you keep making jokes?"]
    ["Sombra" [[:symmetra_sombra :_sombraTalkSadSmile]] "I’m just torn between wanting to enjoy the moment and being worried about you and me and the future and the fate of humanity. You know. Small funny stuff that’s great joke material."]
    ["Symmetra" [[:symmetra_sombra :_symmetraTalkSadSmile]] "I suppose trying to process what going to happen from here on out is quite overwhelming."]
    ["Sombra" [[:symmetra_sombra :_sombraTalkSadSadSmile]] "Yeah. I don’t think we’ll have another sunrise like this together for quite a while after this."]
    ["Symmetra" [[:symmetra_sombra :_neutralSad]] " ..."]
    ["Symmetra" [[:symmetra_sombra :_sombraExplainLookUp]] "Hey, no long face. For now we gotta fight the good fight but the whole point is to make the world into a place worth living in. Once that’s done we can retire to a nice east facing lake somewhere in Canada and wear cardigans together."]
    ["Symmetra" [[:symmetra_sombra :_symmetraThinking]] "The cardigans really enhance the romance of the thing."]
    ["Sombra" [[:symmetra_sombra :_sombraExplainLookUp]] "There’ll be other sunrises for us to sit and watch together though, even if they’re few and far between."]
    ["Symmetra" [[:symmetra_sombra :_lookUpSadSmile]] "..."]
    ["Sombra" [[:symmetra_sombra :_sombraExplainSad]] "Hey, um, sorry if I’m bumming you out, but I’m really glad we got to spend this time together at least. And...sorry we didn’t see ghosts? I really hoped this’d be the day we’d record definitive proof."]
    ["Symmetra" [[:symmetra_sombra :_symmetraExplain]] "Do not worry about the ghosts. I bet people would decry the evidence as fake anyway."]
    ["Sombra" [[:symmetra_sombra :_sombraLaugh]] "Internet savvy, this one! It’s true. I guess it’s like what people say, the truth is out there."]
    ["Symmetra" [[:symmetra_sombra :_symmetraConfused]] "How is that relevant to--"]
    ["Sombra" [[:symmetra_sombra :_sombraTalkConfused]] "I just have X-Files on the brain after you brought it up downstairs."]
    ["Symmetra" [[:symmetra_sombra :_symmetraThinking]] "I see, carry on."]
    ["Sombra" [[:symmetra_sombra :_sombraExplain]] "This is actually the part where I call you a cab and go be pathetic on a waterbed."]
    ["Symmetra" [[:symmetra_sombra :_symmetraLaugh]] "Haha. We will have to watch this show in the future, Sombra. A marathon until another sunrise."]
    ["Symmetra" [[:symmetra_sombra :_symmetraExplainEarnest]] "But first we have to get off of this roof which is a slightly daunting prospect."]
    ["Sombra" [[:symmetra_sombra :_sombraTalkSmirk]] "Don’t worry, my vibrams have excellent traction. If you slip I’ll be sure to catch you."]
    :-> [:room :date-3 1]]

    [:room :date-3 1]
     [:miranda/dialogue
    ["Symmetra" [[:sombra :_neutral (scoot -80 -3 1.5)] [:symmetra :_yawn (scoot 80 -5 1.5)]] "I didn’t realize how tired I was until right now. I suppose you really should call me that cab."]
    ["Sombra" [[:sombra :_explainHand (scoot -3)] [:symmetra :_yawn (scoot -5)]] "I mean you have been awake for almost 24 hours at this point, haven’t you?"]
    ["Symmetra" [[:sombra :_smile (scoot -3)] [:symmetra :_asleep (scoot -5)]] "…"]
    ["Sombra" [[:sombra :_leanInConcerned (scoot -3)] [:symmetra :_asleep (scoot -5)]] "Satya?"]
    ["Symmetra" [[:sombra :_smile (scoot -3)] [:symmetra :_bewildered (scoot -5)]] "...What? My eyes went all out of focus."]
    ["Sombra" [[:sombra :_laugh (scoot -3)] [:symmetra :_awkward (scoot -5)]] "Ha, you’re falling asleep on your feet. Here, sit down and hold Señor Bear Bear while I call you a call the car service."]
    ["Symmetra" [[:sombra :_smile (scoot -3)] [:symmetra :_yawnBear (scoot -5)]] "I don’t want to intrude…"]
    ["Sombra" [[:sombra :_browsePhone (scoot -3)] [:symmetra :_asleepBear (scoot -5)]] "Mierda, she’s already passed out."]
    :-> [:hotel :date-3 3]]

    [:hotel :date-3 3]
     [:miranda/narration
      "Sombra called you a cab and escorted you back to your hotel. You slept soundly on her shoulder on the ride there. Once inside you collapsed into bed and fell into a deep sleep and dreamed of Canadian lakes."
      :=> [:blizzard [:hotel :intro] 0]]})
