(ns syms-qual.data.scenes.junkertown.junkrat
  (:require [carmen.util :as anim :refer [scoot]]
            [syms-qual.util :as util :refer [inc-transition]]))

(def data
  {[:spawn :junkrat 0]
   [:miranda/dialogue
    ["Symmetra" [[:junkrat :_neckHand (scoot -9)]  [:symmetra :_helloWarm]] "Hello."]
    ["Junkrat" [[:junkrat :_ballConfused (scoot -9)]  [:symmetra :_smile]] "Hey."]
    ["Symmetra" [[:junkrat :_ballSmileNod (scoot -9)]  [:symmetra :_explainUncomfortable]] "Are you alright? You seem concerned."]
    :transition :miranda/conditional
    [#(= (:points/junkrat %) 2) [:-> [:spawn :junkrat :date]]
     :else                      [:-> [:spawn :junkrat :no-date]]]]

   [:spawn :junkrat :no-date]
   [:miranda/dialogue
    ["Junkrat" [[:junkrat :_neckHand (scoot -9)]  [:symmetra :_neutral]] "Just a bit preoccupied. Err, apologies in advance, love, but me n’ Roadie are headin’ out on a date for this second half of the match."]
    ["Symmetra" [[:junkrat :_neckHand (scoot -9)]  [:symmetra :_dissappointed]] "You’re abandoning your duty?"]
    ["Junkrat" [[:junkrat :_ballThinking (scoot -9)]  [:symmetra :_dissappointed]] "Y-yeah. Haven’t been home in quite a while. And there’s some old business we gotta attend to."]
    ["Symmetra" [[:junkrat :_ballThinking (scoot -9)]  [:symmetra :_helloNeutral]] "I see. Enjoy yourselves. We will try and make it work without you."]
    ["Junkrat" [[:junkrat :_ballConfused (scoot -9)]  [:symmetra :_neutral]] "Thanks! Efi told me she could rig up some sort of replacement ‘bot for me, so that should work out fine for you all."]
    ["Symmetra" [[:junkrat :_neckHand (scoot -9)]  [:symmetra :_thinking]] "I see."]
    :-> [:spawn :choice]]

   [:spawn :junkrat :date]
   [:miranda/dialogue
    ["Junkrat" [[:junkrat :_ballConfused (scoot -9)]  [:symmetra :_smile]] "I--"]
    ["Junkrat" [[:junkrat :_neckHand (scoot -9)]  [:symmetra :_neutral]] "I can’t do this. I’ve got to get out of here now. Me n’ Roadie were planning to take off after the match and I was hoping you’d wanna join us but I think we’re gonna have to cut out early."]
    ["Symmetra" [[:junkrat :_neckHand (scoot -9)]  [:symmetra :_explainUncomfortable]] "Did something happen?"]
    ["Junkrat" [[:junkrat :_ballThinking (scoot -9)]  [:symmetra :_neutral]] " I thought I was ready to come home but… I… I’m just having a rough day. We’re heading out to one of those fields of flowers I was telling you about before."]
    ["Junkrat" [[:junkrat :_ballExplainConcerned (scoot -9)]  [:symmetra :_sadSmile]] "I hate to you let you down. You’ve got a hell of a work ethic, makes a bloke wanna try and keep up. But I, I just can’t."]
    ["Symmetra" [[:junkrat :_ballSmileNod (scoot -9)]  [:symmetra :_explainUncomfortable]] "It’s alright, Jamie. Taking care of yourself comes first. I’m sure we will find a way to manage."]
    ["Junkrat" [[:junkrat :_fibbinSad (scoot -9)]  [:symmetra :_smile]] "You’re too kind. And… uh… Well, um I hate to be ditchin’ the match and asking a favor all at once but, here’s the thing. The hog’s busted. We sorta gotta repair it to get out there."]
    ["Symmetra" [[:junkrat :_ballNeutral (scoot -9)]  [:symmetra :_explain]] "Roadhog is injured? Can he not simple huff whatever it is he huffs during combat and return to normal?"]
    ["Junkrat" [[:junkrat :_ballFrown (scoot -9)]  [:symmetra :_neutral]] "What? No. The motorcycle. The hog. Is busted."]
    ["Junkrat" [[:junkrat :_ballEmbarassed (scoot -9)]  [:symmetra :_smile]] "Oh."]
    ["Junkrat" [[:junkrat :_ballPoint (scoot -9)]  [:symmetra :_bigSmile]] "Ok, yeah, I see how that could’ve been confusing."]
    ["Symmetra" [[:junkrat :_ballSmileNod (scoot -9)]  [:symmetra :_sass]] "I was jesting."]
    ["Junkrat" [[:junkrat :_armsForward (scoot -9)]  [:symmetra :_sass]] "I’m gonna level with ya, darl’, you’re very good at going over my head. I’m a simple boy with simple humor needs."]
    ["Symmetra" [[:junkrat :_ballSmileNod (scoot -9)]  [:symmetra :_smug]] "Do not worry, I will refine you. Like a crude oil into medical grade plastics."]
    ["Junkrat" [[:junkrat :_armsUp (scoot -9)]  [:symmetra :_smug]] "Can I be a monster truck tire instead?"]
    ["Symmetra" [[:junkrat :_ballNeutral (scoot -9)]  [:symmetra :_thinking]] "Hmm. I’ll consider your request."]
    ["Symmetra" [[:junkrat :_ballNeutral (scoot -9)]  [:symmetra :_explain]] "So what do we need to do to fix this motorcycle?"]
    ["Junkrat" [[:junkrat :_shimGesture (scoot -9)]  [:symmetra :_neutral]] "I talked with Efi, and she says she can fix the ol’ girl, but we’re missing a part… which I was hoping you could make out of hard light?"]
    ["Symmetra" [[:junkrat :_ballSmileNod (scoot -9)]  [:symmetra :_sass]] "You know, for a man who prides himself on being able to make everything out of other people’s garbage you seem to have been needing my fancy newfangled manufacturing expertise quite frequently these days."]
    ["Junkrat" [[:junkrat :_shyblush (scoot -9)]  [:symmetra :_sass]] "Trust me I’ve searched high and low for this thing but there’s a powerful lack of brake pads in a world that’s mostly moved on from wheels. This is, scout’s honor, not some harebrained scheme to spend time with my favorite gal."]
    ["Symmetra" [[:junkrat :_ballNeutral (scoot -9)]  [:symmetra :_thinking]] "I see. Well, that sounds like a reasonable explanation."]
    ["Junkrat" [[:junkrat :_ballSmile (scoot -9)]  [:symmetra :_thinking]] "So you’ll help?"]
    :-> [:spawn :junkrat :choice]]

   [:spawn :junkrat :choice]
   [:miranda/text-option
    "What will you do?"
    ["Fix the hog and miss the slog" (constantly true)
     [:-> [:spawn :junkrat :yes]]]
    ["Converse with your other teammates" (constantly true)
     [:-> [:spawn :junkrat :no]]]]

   [:spawn :junkrat :yes]
   [:miranda/dialogue
    ["Symmetra" [[:junkrat :_ballSmile (scoot -9)]  [:symmetra :_explain]] "Sure. Let’s talk to Efi."]
    ["Junkrat" [[:junkrat :_ballPointUp (scoot -9)]  [:symmetra :_smile]] "Aw yeah! Let’s go, darl."]
    ["Junkrat" [[:junkrat :_ballBack (scoot -9 -80 2)]  [:symmetra :_smile]] "Gimme a tick, I'll get 'er."]
    :-> [:spawn :junkrat 1]]

   [:spawn :junkrat :no]
   [:miranda/dialogue
    ["Symmetra" [[:junkrat :_ballSmile (scoot -9)]  [:symmetra :_explainUncomfortable]] "Let me consider my options."]
    ["Junkrat" [[:junkrat :_ballConfused (scoot -9)]  [:symmetra :_neutral]] "Alrighty."]
    :-> [:spawn :choice]]})
