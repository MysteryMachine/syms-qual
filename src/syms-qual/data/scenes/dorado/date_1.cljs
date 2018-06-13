(ns syms-qual.data.scenes.dorado.date-1
  (:require [carmen.util :as anim :refer [scoot]]
            [syms-qual.util :as util :refer [inc-transition]]))

(def data
  {[:calveras :sombra 0]
   [:miranda/narration
   "Upon your arrival at the bar you are surprised to find five members of the other team there as well. The sudden influx of people and social interaction makes you a bit anxious so you hang towards the back of the group, making you the last one into the building. You take a seat in a corner, next to Doomfist and Genji, who are also sitting quietly. You hope it is not an awkward silence, and that this is just the place people can be quiet."
   :-> [:calveras :sombra 1]]

   [:calveras :sombra 1]
   [:miranda/dialogue
    ["Symmetra" [[:doomfist :_drinking (scoot -80 5 1.5)] [:genji :_thinking (scoot -80 -10 1.5)] [:symmetra :_embarassed (scoot 80 5 1.5)]] "…"]
    ["Doomfist" [[:doomfist :_drinkWave (scoot 5)] [:genji :_neutral (scoot -10)] [:symmetra :_smile (scoot 5)]] "Ah! Good, here comes Sombra with our next round."]
    ["Sombra" [[:sombra :_drinkWave (scoot -80 18 1.5)]  [:doomfist :_drinkHold (scoot 5 -8 1.5)] [:genji :_neutral (scoot -10 -14 1.5)] [:symmetra :_smile (scoot 5 10 1.5)]] "Hola, jerkwads! How’s it hanging."]
    ["Genji" [[:sombra :_drinkNeutral (scoot 18)]  [:doomfist :_drinkHold (scoot -8)] [:genji :_explain (scoot -14)] [:symmetra :_smile (scoot 10)]] "None of my body parts hang. I am cyber-tight. Angela has ensured that."]
    ["Sombra" [[:sombra :_drink (scoot 18)]  [:doomfist :_drinkHold (scoot -8)] [:genji :_neutral (scoot -14)] [:symmetra :_awkward (scoot 10)]] "Genji do you listen to what comes out of that mouth?"]
    ["Genji" [[:sombra :_drinkNostalgic (scoot 18)]  [:doomfist :_drinking (scoot -8)] [:genji :_pointUp (scoot -14)] [:symmetra :_awkward (scoot 10)]] "Yes. I cyber listen to the cyber conversation."]
    ["Sombra" [[:sombra :_drinkAwkward (scoot 18)]  [:doomfist :_drinkHold (scoot -8)] [:genji :_neutral (scoot -14)] [:symmetra :_awkward (scoot 10)]] "Genji…"]
    ["Sombra" [[:sombra :_drinkExplain (scoot 18)]  [:doomfist :_drinkHold (scoot -8)] [:genji :_neutral (scoot -14)] [:symmetra :_smile (scoot 10)]] "The worst part of you is I have no clue if you are kidding ever?"]
    ["Genji" [[:sombra :_drinkNeutral (scoot 18)]  [:doomfist :_drinkHold (scoot -8)] [:genji :_explain (scoot -14)] [:symmetra :_awkward (scoot 10)]] "I never kid, Sombra. Now, if you excuse me, Angela has called for me. She says my gluteal cyber implants need oiling."]
    ["Sombra" [[:sombra :_drink (scoot 18 12 2.5)]  [:doomfist :_drinking (scoot -8 -20 2.5)] [:genji :_bow (scoot -14 -80 2)] [:symmetra :_embarassed (scoot 5)]] "..."]
    ["Sombra" [[:sombra :_drinkExplainConfused (scoot 12)]  [:doomfist :_drinkHold (scoot -20)] [:symmetra :_embarassed (scoot 5)]] "That was... a booty call, right?"]
    :-> [:calveras :sombra :option 0]]

    [:calveras :sombra :option 0]
    [:miranda/option
    "Symmetra" [[:sombra :_drinkNeutral (scoot 12)]  [:doomfist :_drinkHold (scoot -20)] [:symmetra :_embarassed (scoot 5)]]
    "I did not need these mental images."
    "I have very mixed feelings about the thoughts in my head."
    "I hope they have a good time."]

    [:calveras :sombra :option 0 0]
    [:miranda/dialogue
     ["Doomfist" [[:sombra :_drinkNeutral (scoot 12)]  [:doomfist :_drinkExplainConcerned (scoot -20)] [:symmetra :_embarassed (scoot 5)]] "Same. It’s an invasion of my personal thought space. I need that space for focusing on other more important issues."]
     ["Sombra" [[:sombra :_drinkShrug (scoot 12)]  [:doomfist :_drinking (scoot -20)] [:symmetra :_embarassed (scoot 5)]] "But like, what if it’s NOT a sex thing?"]
     ["Doomfist" [[:sombra :_drink (scoot 12)]  [:doomfist :_drinkPointUp (scoot -20)] [:symmetra :_embarassed (scoot 5)]] "Other more important issues, Sombra. I have no time for ninja butt distractions."]
     ["Sombra" [[:sombra :_drinkExplain (scoot 12)]  [:doomfist :_drinkHold (scoot -20)] [:symmetra :_embarassed (scoot 5)]] "But--"]
     ["Doomfist" [[:sombra :_drinkNeutral (scoot 12)]  [:doomfist :_drinkNo (scoot -20)] [:symmetra :_embarassed (scoot 5)]] "No butts. Focus."]
     :-> [:calveras :sombra 2]]

    [:calveras :sombra :option 0 1]
    [:miranda/dialogue
     ["Sombra" [[:sombra :_drink (scoot 12)]  [:doomfist :_drinkHold (scoot -20)] [:symmetra :_embarassed (scoot 5)]] "I don’t. Just a nice couple, oiling a cyber butt."]
     ["Doomfist" [[:sombra :_drinkNeutral (scoot 12)]  [:doomfist :_drinkSkeptical (scoot -20)] [:symmetra :_embarassed (scoot 5)]] "…"]
     ["Sombra" [[:sombra :_drinkExplainConfused (scoot 12)]  [:doomfist :_drinkSkeptical (scoot -20)] [:symmetra :_embarassed (scoot 5)]] "What?"]
     ["Doomfist" [[:sombra :_drink (scoot 12)]  [:doomfist :_drinkExplainConcerned (scoot -20)] [:symmetra :_embarassed (scoot 5)]] "I have several cybernetic implants. You do not just oil an implant."]
     ["Sombra" [[:sombra :_drinkFlirty (scoot 12)]  [:doomfist :_drinkSkeptical (scoot -20)] [:symmetra :_embarassed (scoot 5)]] "Would you care to elaborate on that?"]
     ["Doomfist" [[:sombra :_drink (scoot 12)]  [:doomfist :_drinkNo (scoot -20)] [:symmetra :_embarassed (scoot 5)]] "No, that is something that should stay between a man and his physician. We have more important things to think about."]
     :-> [:calveras :sombra 2]]

    [:calveras :sombra :option 0 2]
    [:miranda/dialogue
     ["Sombra" [[:sombra :_drinkPoint (scoot 12)]  [:doomfist :_drinking (scoot -20)] [:symmetra :_strainedSmile (scoot 5)]] "Me too. And frankly, I’m jealous. I’ve had a lot of augmentations made, but nothing like what Genji’s done. Getting to rebuild everything from the ground up."]
     ["Doomfist" [[:sombra :_drink (scoot 12)]  [:doomfist :_drinkSkeptical (scoot -20)] [:symmetra :_strainedSmile (scoot 5)]] "I’ve got implants, but thinking of having to go that far gives me the shivers."]
     ["Sombra" [[:sombra :_drinkShrug (scoot 12)]  [:doomfist :_drinkSkeptical (scoot -20)] [:symmetra :_smile (scoot 5)]] "I’m glad we live in a time where a body can be hacked, just like any other thing, and I’m sure Genji’s happy to not be roadkill."]
     ["Doomfist" [[:sombra :_drink (scoot 12)]  [:doomfist :_drinkNo (scoot -20)] [:symmetra :_1000Mile (scoot 5)]] "Fine. I mostly just don’t want to think too hard about the wonders of Genji’s cyber...parts."]
     ["Sombra" [[:sombra :_drinkLaugh (scoot 12)]  [:doomfist :_drinkSkeptical (scoot -20)] [:symmetra :_strainedSmile (scoot 5)]] "Snort."]
     ["Doomfist" [[:sombra :_drink (scoot 12)]  [:doomfist :_drinkSkeptical (scoot -20)] [:symmetra :_strainedSmile (scoot 5)]] "What?"]
     ["Sombra" [[:sombra :_drinkFlirty (scoot 12)]  [:doomfist :_drinkSkeptical (scoot -20)] [:symmetra :_embarassed (scoot 5)]] "Nothing! Nothing!"]
     ["Doomfist" [[:sombra :_drink (scoot 12)]  [:doomfist :_drinkExplainConcerned (scoot -20)] [:symmetra :_embarassed (scoot 5)]] "...resuming the conversation."]
      :-> [:calveras :sombra 2]]

 [:calveras :sombra 2]
  [:miranda/dialogue
    ["Doomfist" [[:sombra :_drinkNeutral (scoot 12)]  [:doomfist :_drinkPointUp (scoot -20)] [:symmetra :_neutral (scoot 5)]] "We have mysteries that need solving. And more importantly, figure out if you can get us to Isla de las Munecas this weekend after the match."]
    ["Sombra" [[:sombra :_drinkTongue (scoot 12)]  [:doomfist :_drinking (scoot -20)] [:symmetra :_confused (scoot 5)]] "You really wanna go there? That place looked gross and I’ve heard their wifi reception is terrible."]
    ["Doomfist" [[:sombra :_drinkNeutral (scoot 12)]  [:doomfist :_drinkExplain (scoot -20)] [:symmetra :_confused (scoot 5)]] "Amelie is very excited for all of the spider selfie possibilities. Well, as excited as a woman with no feelings can be about anything."]
    ["Symmetra" [[:sombra :_drinkNeutral (scoot 12)]  [:doomfist :_drinkHold (scoot -20)] [:symmetra :_explainUncomfortable (scoot 5)]] "I’m sorry, I’m terribly lost."]
    ["Sombra" [[:sombra :_drinkLaugh (scoot 12)]  [:doomfist :_drinking (scoot -20)] [:symmetra :_smile (scoot 5)]] "Gah, my bad. We had our monthly Talon unit bonding pizza party pajama-ganza yesterday and we, uh, kinda spent all night watching ghost shows."]
    ["Doomfist" [[:sombra :_drinkNeutral (scoot 12)]  [:doomfist :_drinkPointUpEyes (scoot -20)] [:symmetra :_smile (scoot 5)]] "It was not just ghosts. I was also unsolved true crime mysteries which are way more plausible and interesting."]
    ["Sombra" [[:symmetra :_smile (scoot 5)] [:sombra :_drinkExplainConfused (scoot 12)] [:doomfist :_drinkHold (scoot -20)]] "Yeah, yeah. Mostly it’s good because of the dynamic between the hosts. It’s just these two funny dudes and one really believes in ghosts and the other doesn’t. Personally? I believe in them, but they spook me good."]
    ["Symmetra" [[:sombra :_drinkNeutral (scoot 12)]  [:doomfist :_drinkHold (scoot -20)] [:symmetra :_explain (scoot 5)]] "Don’t you two live with a person who is some sort of ghost? How could you be fearful of them?"]
    ["Sombra" [[:symmetra :_neutral (scoot 5)] [:sombra :_drinkExplain (scoot 12)] [:doomfist :_drinking (scoot -20)]] "Look, there’s something very different between a funny hot topic dad ghost, and the ghost of some alleged demon thing possessing a young girl out of nowhere."]
    ["Doomfist" [[:sombra :_drink (scoot 12)]  [:doomfist :_drinkExplain (scoot -20)] [:symmetra :_neutral (scoot 5)]] "Yes, just as there is something very different about a cool battlefield death, and being axe murdered while you are asleep."]
    ["Sombra" [[:symmetra :_neutral (scoot 5)] [:sombra :_drinkLeanIn (scoot 12)] [:doomfist :_drinkHold (scoot -20)]] "I’ve heard when you die a cool battlefield death you get to have even cooler battles in the afterlife. With people that actually draft proper teams!"]
    ["Doomfist" [[:symmetra :_neutral (scoot 5)] [:sombra :_drinkNeutral (scoot 12)] [:doomfist :_drinking (scoot -20)]] "In my group of friends, we refer to it as Grandmaster Rank."]
    ["Sombra" [[:symmetra :_neutral (scoot 5)] [:sombra :_drinkAww (scoot 12)] [:doomfist :_drinkHold (scoot -20)]] "That’s really beautiful."]
    ["Doomfist" [[:symmetra :_neutral (scoot 5)] [:sombra :_drinkNeutral (scoot 12)] [:doomfist :_drinkPointUp (scoot -20)]] "I am told that those who ascend to this rank, get magical animating graffiti, but I have not seen it for myself."]
    ["Sombra" [[:symmetra :_neutral (scoot 5)] [:sombra :_drinkShrug (scoot 12)] [:doomfist :_drinking (scoot -20)]] "Anyways, we got a poor night’s sleep because we were watching videos late into the night and then at the Witching Hour, we had a seance and some spooky shit went down."]
    ["Doomfist" [[:symmetra :_neutral (scoot 5)] [:sombra :_drink (scoot 12)] [:doomfist :_drinkEyeRoll (scoot -20)]] "Nothing happened, Sombra."]
    ["Sombra" [[:symmetra :_neutral (scoot 5)] [:sombra :_drinkExplainAngry (scoot 12)] [:doomfist :_drinkSkeptical (scoot -20)]] "Damnit, Akande. That fucking thing spelled out amigo."]
    ["Doomfist" [[:symmetra :_neutral (scoot 5)] [:sombra :_drink (scoot 12)] [:doomfist :_drinkPointUp (scoot -20)]] "No, it spelled adingo."]
    ["Sombra" [[:symmetra :_neutral (scoot 5)] [:sombra :_drinkShrug (scoot 12)] [:doomfist :_drinkHold (scoot -20)]] "So the ghost isn’t very good at spelling out spanish words. All I know is, there’s probably some little kid looking for his amigo in our house."]
    ["Doomfist" [[:symmetra :_confused (scoot 5)] [:sombra :_drinkNeutral (scoot 12)] [:doomfist :_drinkPoint (scoot -20)]] "Or it is an Australian canine of hotly debated taxonomic classification. Duck Duck Go that fact, Sombra, it will surprise you. Perhaps the ghost is the ghost of a long gone biologist speaking out from the other side about the dingo’s taxonomic classification."]
    ["Sombra" [[:symmetra :_confused (scoot 5)] [:sombra :_drinkNostalgic (scoot 12)] [:doomfist :_drinking (scoot -20)]] "Pinche mierda, Akande, that’s a sound theory. We have to help him."]
     ["Symmetra" [[:symmetra :_explainUncomfortable (scoot 5)] [:sombra :_drinkNeutral (scoot 12)] [:doomfist :_drinkHold (scoot -20)]] "I am still confused about several parts of this conversation. How do I Duck Duck Go?"]
     ["Sombra" [[:symmetra :_neutral (scoot 5)] [:sombra :_drinkHack (scoot 12)] [:doomfist :_drinkHold (scoot -20)]] "I can’t wait to tell the internet about this. I’m putting that on my blog, http://thegayest.technology."]
     ["Doomfist" [[:symmetra :_confused (scoot 5)] [:sombra :_drinkHack (scoot 12)] [:doomfist :_drinkExplainConcerned (scoot -20)]] "Wait, that’s a valid domain name?"]
     ["Sombra" [[:symmetra :_confused (scoot 5)] [:sombra :_drink (scoot 12)] [:doomfist :_drinkHold (scoot -20)]] "Absolutely. I have so many bad domain names. At least a third of my money goes to maintaining good domain names and to hosting for one off domain name jokes."]
     ["Doomfist" [[:symmetra :_neutral (scoot 5)] [:sombra :_drinkNeutral (scoot 12)] [:doomfist :_drinkPointUp (scoot -20)]] "Anyway, Duck Duck Go is a search engine. Talon members have been taken off many normal public websites for safety reasons."]
     ["Sombra" [[:symmetra :_neutral (scoot 5)] [:sombra :_drinkExplain (scoot 12)] [:doomfist :_drinkHold (scoot -20)]] "And ethical reasons. Ask Jeeves should have won the search engine wars. Then we’d have a lot less overpaid, mediocre engineers writing awful manifestos. They’re very high on my list of people I’m going to haunt once I die."]
     ["Doomfist" [[:symmetra :_neutral (scoot 5)] [:sombra :_drinkNeutral (scoot 12)] [:doomfist :_drinking (scoot -20)]] "You have a list?"]
     ["Sombra" [[:symmetra :_neutral (scoot 5)] [:sombra :_drinkPoint (scoot 12)] [:doomfist :_drinkHold (scoot -20)]] "What kind of villain would I be if I didn’t have a grudge list? Get your act together, Akande."]
     ["Doomfist" [[:symmetra :_neutral (scoot 5)] [:sombra :_drink (scoot 12)] [:doomfist :_drinkPointUp (scoot -20)]] "I don’t have a list because when someone displeases me, I find them and kill them immediately. I’m very efficient."]
     ["Sombra" [[:symmetra :_neutral (scoot 5)] [:sombra :_drinkPft (scoot 12)] [:doomfist :_drinkHold (scoot -20)]] "No way, true villainy is all about the long term planning and high quality pay off. I’ve been working on this haunting plan for a while."]
     ["Doomfist" [[:symmetra :_neutral (scoot 5)] [:sombra :_drinkNeutral (scoot 12)] [:doomfist :_drinkExplain (scoot -20)]] "With the tech dudebros, even if you can’t haunt them you could at least hack their internet of things coffee makers to make them display spooky messages."]
     ["Sombra" [[:symmetra :_WTF (scoot 5)] [:sombra :_drinkNostalgic (scoot 12)] [:doomfist :_drinking (scoot -20)]] "They won’t be able to sleep knowing the coffee they’re drinking is ghost coffee."]
     ["Symmetra" [[:symmetra :_explainWTF (scoot 5)] [:sombra :_drinkNeutral (scoot 12)] [:doomfist :_drinkHold (scoot -20)]] "I do not think technical workers will immediately jump to a supernatural conclusion. They will probably think they are hacked."]
     ["Sombra" [[:symmetra :_WTF (scoot 5)] [:sombra :_drinkArmUp (scoot 12)] [:doomfist :_drinking (scoot -20)]] "I will be sure to directly state, “Hey, this is a ghost, and not just a hacker that hates dudebros.”"]
     ["Doomfist" [[:symmetra :_WTF (scoot 5)] [:sombra :_drinkNostalgic (scoot 12)] [:doomfist :_drinkEyeRoll (scoot -20)]] "Ah yes, that would definitely be good enough evidence for me."]
     ["Sombra" [[:symmetra :_WTF (scoot 5)] [:sombra :_drinkExplain (scoot 12)] [:doomfist :_drinkEyeRoll (scoot -20)]] "I mean even if that doesn't work, I can just lock them out of coffee, right? That’s terrifying by itself."]
    [nil [[:symmetra :_explainUncomfortable (scoot 5)] [:sombra :_drinkLaugh (scoot 12)] [:doomfist :_drinking (scoot -20)]] "You have a few more drinks with the Talon operatives as they continue to elaborate on their future ghost plans. As the conversation winds down, they seem to be preparing to leave."]
     :transition :miranda/conditional
     [#(= (:points/sombra %) 3)  [:-> [:calveras :sombra :date]]
      :else                      [:-> [:calveras :sombra :no-date]]]]

    [:calveras :sombra :no-date]
    [:miranda/dialogue
     ["Sombra" [[:sombra :_drinkExplain (scoot 12)]  [:doomfist :_drinkHold (scoot -20)] [:symmetra :_smile (scoot 5)]] "Hey, Satya. I think Doomie and I are heading out. We’re gonna do another seance."]
     ["Doomfist" [[:sombra :_drinkNeutral (scoot 12)]  [:doomfist :_drinkWave (scoot -20)] [:symmetra :_smile (scoot 5)]] "Have a good night, Satya. Take care."]
     ["Symmetra" [[:sombra :_drinkWave (scoot 12 -80 1.5)]  [:doomfist :_drinkHold (scoot -20 -80 1.5)] [:symmetra :_helloWarm (scoot 5)]] "Have a good night!"]

     :-> [:hotel :text]]

     [:hotel :text]
     [:miranda/narration
      "You make your way quietly to your hotel where you spend the rest of the night reading and relaxing. You eventually find yourself quite sleepy, and you tuck yourself into bed."
      :=> [:blizzard-world [:hotel :intro] 0]]

    [:calveras :sombra :date]
    [:miranda/dialogue
     ["Sombra" [[:symmetra :_smile (scoot 5)] [:sombra :_wave (scoot 12)] [:doomfist :_neutral (scoot -20)]] "Satya! Doomfist and I are going to meet up with the rest of the Talon crew and have another seance. We’re going to try to summon a mirror ghost Reaper swears he saw as a child called Bloody Mary."]
     ["Doomfist" [[:symmetra :_smile (scoot 5)] [:sombra :_neutral (scoot 12)] [:doomfist :_pointUp (scoot -20)]] "Gabriel is not actively participating in anything but drinks. He is making bloody marys, because they are thematic, but he said he “does not fuck with ghosts.”"]
     ["Sombra" [[:symmetra :_neutral (scoot 5)] [:sombra :_explainHand (scoot 12)] [:doomfist :_neutral (scoot -20)]] "Reaper’s a bruja, dude. He has literally dedicated his life to a Lechuza cosplay."]
     ["Symmetra" [[:symmetra :_confused (scoot 5)] [:sombra :_neutral (scoot 12)] [:doomfist :_neutral (scoot -20)]] "Lechuza?"]
     ["Sombra" [[:symmetra :_confused (scoot 5)] [:sombra :_explainCondescendSmile (scoot 12)] [:doomfist :_neutral (scoot -20)]] "Like, a magical owl witch thing. Really spooky. Oddly, it’s Reaper exact aesthetic. I bet you didn’t know that all sorts of dads are into cryptids these days. Dream dads with horrifying cryptid dreams. Just wanna kiss those dads."]
     ["Doomfist" [[:symmetra :_confused (scoot 5)] [:sombra :_neutral (scoot 12)] [:doomfist :_armsCross (scoot -20)]] "Sombra. You have lost us. Again."]
     ["Sombra" [[:symmetra :_neutral (scoot 5)] [:sombra :_shrug (scoot 12)] [:doomfist :_armsCrossNeutral (scoot -20)]] "Alls I’m saying is Reaper knows better than to fuck with the supernatural."]
     :-> [:calveras :sombra :option 1]]

     [:calveras :sombra :option 1]
     [:miranda/option
      "Symmetra" [[:symmetra :_skeptical (scoot 5)] [:sombra :_neutral (scoot 12)] [:doomfist :_armsCrossNeutral (scoot -20)]]
      "If you are a believer as well, why not heed his warnings?"
      "There is too much to do in this life. Why worry about the afterlife?"]

     [:calveras :sombra :option 1 0]
     [:miranda/dialogue
      ["Sombra" [[:symmetra :_skeptical (scoot 5)] [:sombra :_explain (scoot 12)] [:doomfist :_armsCrossNeutral (scoot -20)]]
       "Tryna keep Dorado weird, toots."]
      ["Symmetra" [[:symmetra :_explainWTF (scoot 5)] [:sombra :_neutral (scoot 12)] [:doomfist :_armsCrossNeutral (scoot -20)]]
       "Toots? Seriously?"]
      ["Sombra" [[:symmetra :_WTF (scoot 5)] [:sombra :_explainAwkward (scoot 12)] [:doomfist :_armsCrossNeutral (scoot -20)]]
       "Fine. I’m a woman on a mission Symmetra. I have to keep this town haunted as heck."]
      ["Doomfist" [[:symmetra :_WTF (scoot 5)] [:sombra :_awkward (scoot 12)] [:doomfist :_point (scoot -20)]]
       "I have been hearing a lot of mysterious unexplained noises since we arrived in Dorado. Although now that I think about it, they have mostly been near technology of some sort or another. Is this your doing?"]

      :-> [:calveras :sombra 3]]

     [:calveras :sombra :option 1 1]
     [:miranda/dialogue
      ["Sombra" [[:symmetra :_confused (scoot 5)] [:sombra :_explain (scoot 12)] [:doomfist :_armsCrossNeutral (scoot -20)]]
       "Cause that’s where all the weird stuff is."]
      ["Doomfist" [[:symmetra :_neutral (scoot 5)] [:sombra :_nostalgic (scoot 12)] [:doomfist :_explainConcerned (scoot -20)]]
       "You run several Twitter accounts where you furry roleplay with yourself in a polycule."]
      ["Sombra" [[:symmetra :_skeptical (scoot 5)] [:sombra :_explainAngry (scoot 12)] [:doomfist :_neutral (scoot -20)]]
       "It’s a honeypot for assholes, Doomfist. If they pick on me, I hack them."]
      ["Sombra" [[:symmetra :_eyeRoll (scoot 5)] [:sombra :_flirty (scoot 12)] [:doomfist :_neutral (scoot -20)]]
       "Also I do it for the fan art."]
      ["Sombra" [[:symmetra :_frustratedConfused (scoot 5)] [:sombra :_nostalgic (scoot 12)] [:doomfist :_neutral (scoot -20)]]
       "And the narrated youtube tributes."]
      ["Sombra" [[:symmetra :_neutral (scoot 5)] [:sombra :_explainHand (scoot 12)] [:doomfist :_neutral (scoot -20)]]
       "Look, having a fursona or two does not count as weird."]
      ["Doomfist" [[:symmetra :_neutral (scoot 5)] [:sombra :_frown (scoot 12)] [:doomfist :_explainConcerned (scoot -20)]]
        "Having a fursona is fine. Having several in a self directed love polygon is weird."]
       ["Sombra" [[:symmetra :_WTF (scoot 5)] [:sombra :_explainCondescendSmile (scoot 12)] [:doomfist :_neutral (scoot -20)]]
        "And that is why you were hacked. Asshole."]
       ["Doomfist" [[:symmetra :_WTF (scoot 5)] [:sombra :_frown (scoot 12)] [:doomfist :_point (scoot -20)]]
        "Wait. The beeping on my computer? It’s some sort of prank?"]
      :-> [:calveras :sombra 3]]

 [:calveras :sombra 3]
  [:miranda/dialogue
     ["Sombra" [[:symmetra :_WTF (scoot 5)] [:sombra :_explainCondescendSmile (scoot 12)] [:doomfist :_neutral (scoot -20)]] "That’s the Hechizeros, Doomfist, and I WILL honor their memory. Don’t you ever ask me to stop loving El Sondito or to stop hacking my friend’s computers so that they are haunted by it playing softly and subliminally at all times."]
     ["Symmetra" [[:symmetra :_skeptical (scoot 5)] [:sombra :_neutral (scoot 12)] [:doomfist :_neutral (scoot -20)]] "I...see. Are we going? I think I’m feeling fine to go summon ghosts with you."]
     ["Sombra" [[:symmetra :_eyeRoll (scoot 5)] [:sombra :_browseDickButt (scoot 12)] [:doomfist :_eyeRoll (scoot -20)]] "Sure, but on the way we are watching that music video. You will not see a more excited pianist in your entire life."]
     :-> [:room :sombra 4]]})
