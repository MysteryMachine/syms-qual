(ns syms-qual.data.scenes.volskaya.date
  (:require [carmen.util :as anim :refer [scoot fade-in]]
            [syms-qual.util :as util :refer [inc-transition]]))

(def data
  {[:point-a-notp :sombra 3]
   [:miranda/dialogue
    ["Symmetra" [[:symmetra :_confused (scoot 40 0 1)]]  "What was that?"]
    ["Sombra" [[:sombra :_camo (fade-in [-3 0] 1)] [:symmetra :_confused (scoot 0)]]
     "Surprise! It’s me."]
    ["Symmetra" [[:sombra :_smile (scoot -3)] [:symmetra :_smile (scoot 0)]]
     "Oh! I didn’t see you there."]
    ["Sombra" [[:sombra :_leanin (scoot -3)] [:symmetra :_smile (scoot 0)]]
     "That was the general idea, yeah. Anyway, work is over, fun starts now."]
    ["Symmetra" [[:sombra :_leanin (scoot -3)] [:symmetra :_explain (scoot 0)]]
     "Yes, you said you had a gag you thought would impress me?"]
    ["Sombra" [[:sombra :_explain (scoot -3)] [:symmetra :_neutral (scoot 0)]]
     "Absolutely. Your teleporter. Let’s use it to prank people."]
    ["Symmetra" [[:sombra :_neutral (scoot -3)] [:symmetra :_bewildered (scoot 0)]]
     "Excuse me?"]
    ["Sombra" [[:sombra :_explainHand (scoot -3)] [:symmetra :_bewildered (scoot 0)]]
     "Make it face the water. Let’s have our teammates go for a swim."]
    ["Symmetra" [[:sombra :_neutral (scoot -3)] [:symmetra :_skeptical (scoot 0)]]
     "I thought YOU were planning on doing a physical gag. This entire gag seems to be predicated on my skills alone. I also cannot envision my teammates being able to trust me after this."]
    ["Sombra" [[:sombra :_leanin (scoot -3)] [:symmetra :_skeptical (scoot 0)]]
     "Relaxa-te, mi amor, who is going to be angry about this? Zenyatta will probably just float on the water, right? He floats on land, why wouldn’t he float on water?"]
    ["Sombra" [[:sombra :_wink (scoot -3)] [:symmetra :_skeptical (scoot 0)]]
     "Zarya and Mei LOVE ice. Zarya took a swim in this river before the match started, even."]
    ["Sombra" [[:sombra :_shrugAwkward (scoot -3)] [:symmetra :_skeptical (scoot 0)]]
     "And Widowmaker? She’s already got frostbite. She can’t get MORE frostbitten, even if she wanted to. Plus, as soon as they fall in, it’ll trigger out of bounds mechanisms on the match programming that will teleport them back to spawn."]
    ["Symmetra" [[:sombra :_neutral (scoot -3)] [:symmetra :_thinking (scoot 0)]]
     "I see. This is why you kept the robot in the back. You intend to forfeit the first point in order to prank people."]
    ["Sombra" [[:sombra :_wink (scoot -3)] [:symmetra :_thinking (scoot 0)]]
     "Exactly!"]
    :-> [:point-a-notp :sombra :option 2]]

   [:point-a-notp :sombra :option 2]
   [:miranda/option
    "Symmetra" [[:sombra :_neutral (scoot -3)] [:symmetra :_neutral (scoot 0)]]
    "I suppose the prank is relatively harmless, given our team composition."
    "I don’t foresee this going well for us."]

   [:point-a-notp :sombra :option 2 0]
   [:miranda/dialogue
    ["Sombra" [[:sombra :_explain (scoot -3)] [:symmetra :_smile (scoot 0)]]
     "That’s my girl. I knew I could count on you to have some fun."]
    :-> [:sombra-a :cutscene]]

   [:point-a-notp :sombra :option 2 1]
   [:miranda/dialogue
    ["Sombra" [[:sombra :_explainAngry (scoot -3)] [:symmetra :_neutral (scoot 0)]]
     "Hey, now. A deal’s a deal. If there’s one thing I can count on you goody-goody types for it’s not going back on your word."]
    ["Symmetra" [[:sombra :_frown (scoot -3)] [:symmetra :_sass (scoot 0)]]
     "Clearly you do not have much experience in the exciting world of corporate espionage. But yes, I suppose I should honor our agreement despite my reservations."]
    ["Symmetra" [[:sombra :_smile] [:symmetra :_explainWTF]]
     "As long as we are clear that you are to be held wholly responsible for whatever detrimental fall out may occur from this action."]
    ["Sombra" [[:sombra :_flirty (scoot -3)] [:symmetra :_neutral (scoot 0)]]
     "Us spending some quality time together is well worth a possible black eye from the world’s strongest homo, in my opinion."]
    ["Symmetra" [[:sombra :_flirty (scoot -3)] [:symmetra :_eyeRoll (scoot 0)]]
     "I see. As long as you’re the one taking the punches."]
    ["Sombra" [[:sombra :_leanin (scoot -3)] [:symmetra :_neutral (scoot 0)]]
     "Gladly, mi amor."]
    :-> [:sombra-a :cutscene]]

   [:sombra-a :cutscene]
   [:miranda/characters
    [[]]
    :-> [:sombra-a :cutscene :text]]

   [:sombra-a :cutscene :text]
   [:miranda/narration
    "After setting up your teleporter near the river’s edge on the back of the first point you and Sombra take a seat to watch the ensuing pandemonium. Zenyatta comes through the teleporter and instantly sinks. Sombra cannot contain her laughter, but quickly attempts to regain her composure and shoots you a look of feigned horror mixed with an apologetic shrug."
    "Widowmaker comes next, but reacts instantly, grappling up a building and flipping you two off as she zips away from the battlefield. Sombra returns her one fingered salute as you watch her disappear into the distance. You awkwardly wait for a few more seconds before Zarya passes through the teleporter but manages to stop herself short of falling over the edge."
    :-> [:point-a :sombra 5]]

   [:point-a :sombra 5]
   [:miranda/dialogue
    ["Zarya" [[:zarya :_angryTalk (scoot -85 -25 1)]
              [:sombra :_reverse (scoot 60 0 1)]
              [:symmetra :_neutral (scoot 70 10 1)]]
     "Ah ha! This is why you always walk backwards when passing through teleporter, just as Grandfather said. "]
    ["Zarya" [[:zarya :_point (scoot -25)]
              [:sombra :_reverse (scoot 0)]
              [:symmetra :_neutral (scoot 10)]]
     "YOU TWO! I thought we were losing because Omnic is bad healer but it is because of you, fake support, and criminal with bad ombre! I will crush you."]
    ["Sombra" [[:zarya :_skeptical (scoot -25)]
               [:sombra :_reverseLaugh (scoot 0)]
               [:symmetra :_neutral (scoot 10)]]
     "It’s just a prank! Give us a break."]
    ["Zarya" [[:zarya :_pointUp (scoot -25)]
              [:sombra :_reverse (scoot 0)]
              [:symmetra :_neutral (scoot 10)]]
     "Hacker, the only reason I show leniency until now is Ms. Volskaya has instructed me to ignore old grudge. "]
    ["Zarya" [[:zarya :_point (scoot -25)]
              [:sombra :_reverse (scoot 0)]
              [:symmetra :_neutral (scoot 10)]]
     "This is new grudge now."]
    ["Zarya" [[:zarya :_yellBack (scoot -25)]
              [:sombra :_reverse (scoot 0)]
              [:symmetra :_awkward (scoot 10)]]
     "Ice wife!"]
    ["Zarya" [[:zarya :_angryTalk (scoot -25 -5 1)]
              [:sombra :_reverse (scoot 0)]
              [:symmetra :_awkward (scoot 10)]
              [:mei :_TP (scoot -48 -18 2)]]
     "It appears team discipline is in need of improvement. Come we have much work to do."]
    ["Zarya" [[:zarya :_angryTalk (scoot -5 95 2 2)]
              [:sombra :_reverse (scoot 0 100 2 2)]
              [:symmetra :_awkward (scoot 10 110 2 2)]
              [:mei :_gun (scoot -18 88 2 2)]]
     "You will now regret your lack of physical training, thin one."]
    :-> [:point-a :sombra :cutscene 3]]

   [:point-a :sombra :cutscene 3]
   [:miranda/narration
    "You and Sombra make a mad dash for one of the nearby apartment complexes, hoping to avoid Zarya and Mei’s wrath. Your light clothing gave you the edge in agility you needed to escape your two more appropriately dressed teammates and you manage to hide yourselves inside after a frantic sprint. "
    :-> [:apartment :sombra 6]]

   [:apartment :sombra 6]
   [:miranda/dialogue
    ["Sombra" [[:sombra :_laugh (scoot -43 -3 1)] [:symmetra :_smile (scoot 40 0 1)]]
     "Haha, did you see their faces?"]
    ["Symmetra" [[:sombra :_laugh (scoot -3)] [:symmetra :_explainUncomfortable (scoot 0)]]
     "Did you see yours? I thought you must have wet yourself!"]
    ["Sombra" [[:sombra :_explain (scoot -3)] [:symmetra :_neutral (scoot 0)]]
     "Maybe I did! Covertly."]
    ["Symmetra" [[:sombra :_neutral (scoot -3)] [:symmetra :_frustratedConfused (scoot 0)]]
     "And maybe I’m grossed out. Overtly."]
    ["Sombra" [[:sombra :_nostalgic (scoot -3)] [:symmetra :_neutral (scoot 0)]]
     "Ah! I’m glad I didn’t get beat up over that.  Now, mi dulcito, we can begin the romantic portion of this date in style."]
    ["Symmetra" [[:sombra :_smile (scoot -3)] [:symmetra :_explain (scoot 0)]]
     "This is your idea of a date? Breaking into a stranger’s apartment?"]
    ["Sombra" [[:sombra :_self (scoot -3)] [:symmetra :_neutral (scoot 0)]]
     "As a hacker, I can attest that nothing get’s me going more than some breaking and entering."]
    ["Symmetra" [[:sombra :_neutral (scoot -3)] [:symmetra :_no (scoot 0)]]
     "I don’t think so."]
    ["Sombra" [[:sombra :_shrug (scoot -3)] [:symmetra :_neutral (scoot 0)]]
     "One day you'll understand the ecstasy of commiting crimes against capitalist pigs."]
    [nil [[:sombra :_browseConcerned (scoot -3)] [:symmetra :_neutral (scoot 0)]]
     "You hear some loud beeping come out of Sombra."]
    ["Sombra" [[:sombra :_browseConcernedTalk (scoot -3)] [:symmetra :_neutral (scoot 0)]]
     "Um. Uh, oh."]
    ["Sombra" [[:sombra :_browseExplain (scoot -3)] [:symmetra :_awkward (scoot 0)]]
     "Seems like the Volskaya industries firewall has been beefed up since I was last here? They have, um, managed to shut me out? It looks like the giant robot has been rerouted to shoot at our team, instead."]
    ["Sombra" [[:sombra :_browseConcernedTalk (scoot -3)] [:symmetra :_awkward (scoot 0)]]
     "Oh. It's flipping our team off too. Real classy, Volskaya."]
    ["Symmetra" [[:sombra :_browseConcerned (scoot -3)] [:symmetra :_explain (scoot 0)]]
     "We should make haste back to the point."]
    ["Sombra" [[:sombra :_browseExplain (scoot -3)] [:symmetra :_angry (scoot 0)]]
     "Do you have a death wish? With that freaky protein powder, Zarya has been genetically modifying herself to be Dio Brando from JoJo’s Bizzare adventure. AFTER he became a vampire. I’ve seen her literally walk up stone pillars."]
    ["Symmetra" [[:sombra :_frown (scoot -3)] [:symmetra :_explainWTF (scoot 0)]]
     "Your reference is lost on me."]
    ["Sombra" [[:sombra :_fistHand (scoot -3)] [:symmetra :_skeptical (scoot 0)]]
     "He’s a dude you definitely do not want to mess with. Do you know what happened to people that crossed him? They lost everything."]
    ["Symmetra" [[:sombra :_smile (scoot -3)] [:symmetra :_confused (scoot 0)]]
     "What?"]
    ["Sombra" [[:sombra :_nostalgic (scoot -3)] [:symmetra :_confused (scoot 0)]]
     "I’ll send you a YouTube link later. Trust me, no anime connoisseur can get by without having watched least some of that legendary series. Imagine the goodest boy. This is a series where the goodest boy goes on to do the goodest things."]
    ["Symmetra" [[:sombra :_nostalgic (scoot -3)] [:symmetra :_no (scoot 0)]]
     "I do not have time to discuss old pop culture references with you Sombra. We need to return to the match. Although with our teammates outnumbered they have most likely already lost."]
    ["Sombra" [[:sombra :_wink (scoot -3)] [:symmetra :_frown (scoot 0)]]
     "Good call! Let’s give up. I’m glad you’ve come to your senses! Wanna watch Vine compliations with me while we wait for this thing to blow over?"]
    ["Symmetra" [[:sombra :_neutral (scoot -3)] [:symmetra :_frustrated (scoot 0)]]
     "We will be arrested if we get caught in this home."]
    ["Sombra" [[:sombra :_shrug (scoot -3)] [:symmetra :_WTF (scoot 0)]]
     "This is Volskaya industries guest housing. That’s why they keep it so close to an active war zone. I’ve hacked everything for us so things are nice and snug."]
    ["Sombra" [[:sombra :_nostalgic (scoot -3)] [:symmetra :_WTF (scoot 0)]]
     "Good old Russian cybersecurity. They’re very good at hacking, but also very good at getting hacked."]
    ["Symmetra" [[:sombra :_nostalgic (scoot -3)] [:symmetra :_explainWTF (scoot 0)]]
     "If I recall correctly, you said the same thing about the robot that was supposed to win the match for us."]
    ["Symmetra" [[:sombra :_neutral (scoot -3)] [:symmetra :_neutral (scoot 0)]]
     "But fine. Seeing as there are no plausible alternatives, I’ll watch whatever it is you want me to watch."]
    :-> [:apartment :sombra :cutscene 4]]

   [:apartment :sombra :cutscene 4]
   [:miranda/narration
    "You spend maybe 30 minutes indulging Sombra in her dorky internet bullshit, until your anxiety about the match results becomes unbearable. You make up your mind to leave, but ultimately, decide returning to the hotel while Zarya was still angry could result in some unfortunate consequences. After several minutes of angry pacing you make your peace and sit back down."
    :-> [:apartment :sombra 7]]})
