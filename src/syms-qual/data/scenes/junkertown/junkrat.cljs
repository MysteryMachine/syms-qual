(ns syms-qual.data.scenes.junkertown.junkrat
  (:require [carmen.util :as anim :refer [scoot]]
            [syms-qual.util :as util :refer [inc-transition]]))

(def data
  {
   []
   [:miranda/dialogue
    ["Symmetra" [] "Hello."]
    ["Junkrat" [] "Hey."]
    ["Symmetra" [] "Are you alright? You seem concerned."]
    :-> []]

   [:street :junkrat :no-date]
   [:miranda/dialogue
    ["Junkrat" [] "Just a bit preoccupied. Err, apologies in advance, love, but me n’ Roadie are headin’ out on a date for this second half of the match."]
    ["Symmetra" [] "You’re abandoning you’re duty?"]
    ["Junkrat" [] "Y-yeah. Haven’t been home in quite a while. And there’s some old business we gotta attend to."]
    ["Symmetra" [] "I see. Enjoy yourselves. We will try and make it work without you."]
    ["Junkrat" [] "Thanks! Efi told me she could rig up some sort of replacement ‘bot for me, so that should work out fine for you all."]
    ["Symmetra" [] "I see."]
    :-> [:street :choice]]

   [:street :junkrat :date]
   [:miranda/dialogue
    ["Junkrat" [] "I--"]
    ["Junkrat" [] "I can’t do this. I’ve got to get out of here now. Me n’ Roadie were planning to take off after the match and I was hoping you’d wanna join us but I think we’re gonna have to cut out early."]
    ["Symmetra" [] "Did something happen?"]
    ["Junkrat" [] " I thought I was ready to come home but… I… I’m just having a rough day. We’re heading out to one of those fields of flowers I was telling you about before. I hate to you let you down. You’ve got a hell of a work ethic, makes a bloke wanna try and keep up. But I, I just can’t."]
    ["Symmetra" [] "It’s alright, Jamie. Taking care of yourself comes first. I’m sure we will find a way to manage."]
    ["Junkrat" [] "You’re too kind. And… uh… Well, um I hate to be ditchin’ the match and asking a favor all at once but, here’s the thing. The hog’s busted. We sorta gotta repair it to get out there."]
    ["Symmetra" [] "Roadhog is injured? Can he not simple huff whatever it is he huffs during combat and return to normal?"]
    ["Junkrat" [] "What? No. The motorcycle. A hog. Is busted."]
    ["Junkrat" [] "Oh."]
    ["Junkrat" [] "Ok, yeah, I see how that could’ve been confusing."]
    ["Symmetra" [] "I was jesting."]
    ["Junkrat" [] "I’m gonna level with ya, darl’, you’re very good at going over my head. I’m a simple boy with simple humor needs."]
    ["Symmetra" [] "Do not worry, I will refine you. Like a crude oil into medical grade plastics."]
    ["Junkrat" [] "Can I be a monster truck tire instead?"]
    ["Symmetra" [] "Hmm. I’ll consider your request."]
    ["Symmetra" [] "So what do we need to do to fix this motorcycle?"]
    ["Junkrat" [] "I talked with Efi, and she says she can fix the ol’ girl, but we’re missing a part… which I was hoping you could make out of hard light?"]
    ["Symmetra" [] "You know, for a man who prides himself on being able to make everything out of other people’s garbage you seem to have been needing my fancy newfangled manufacturing expertise quite frequently these days."]
    ["Junkrat" [] "Trust me I’ve searched high and low for this thing but there’s a powerful lack of brake pads in a world that’s mostly moved on from wheels. This is, scout’s honor, not some harebrained scheme to spend time with my favorite gal."]
    ["Symmetra" [] "I see. Well, that sounds like a reasonable explanation."]
    ["Junkrat" [] "So you’ll help?"]
    :-> [:street :junkrat :choice]]

   [:street :junkrat :choice]
   [:miranda/text-option
    "What will you do?"
    ["Fix the hog and miss the slog" (constantly true)
     [:-> [:street :- :yes]]]
    ["Converse with your other teammates" (constantly true)
     [:-> [:street :- :no]]]]

   [:street :junkrat :yes]
   [:miranda/dialogue
    ["Symmetra" [] "Sure. Let’s talk to Efi."]
    ["Junkrat" [] "Aw yeah! Let’s go, darl."]
    :-> [:stret :junkrat 1]]

   [:street :junkrat :no]
   [:miranda/dialogue
    ["Symmetra" [] "Let me consider my options."]
    ["Junkrat" [] "Alrighty."]
    :-> [:street :choice]]})
