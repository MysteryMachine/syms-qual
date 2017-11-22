(ns syms-qual.data.scenes.volskaya.date)

(def data
  {[:point-a-notp :sombra 3]
   [:miranda/dialogue
    ["Sombra" [] "Surprise! It’s me."]
    ["Symmetra" [] "Oh! I didn’t see you there."]
    ["Sombra" [] "That was the general idea, yeah. Anyway, work is over, fun starts now."]
    ["Symmetra" [] "Yes, you said you had a gag you thought would impress me?"]
    ["Sombra" [] "Absolutely. Your teleporter. Let’s use it to prank people."]
    ["Symmetra" [] "Excuse me?"]
    ["Sombra" [] "Make it face the water. Let’s have our teammates go for a swim."]
    ["Symmetra" [] "I thought YOU were planning on doing a physical gag. This entire gag seems to be predicated on my skills alone. I also cannot envision my teammates being able to trust me after this."]
    ["Sombra" [] "Relaxa-te, mi amor, who is going to be angry about this? Zenyatta will probably just float on the water, right? He floats on land, why wouldn’t he float on water? Zarya and Mei LOVE ice. Zarya took a swim in this river before the match started, even. And Widowmaker? She’s already got frostbite. She can’t get MORE frostbitten, even if she wanted to. Plus, as soon as they fall in, it’ll trigger out of bounds mechanisms on the match programming that will teleport them back to spawn."]
    ["Symmetra" [] "I see. This is why you kept the robot in the back. You intend to forfeit the first point in order to prank people."]
    ["Sombra" [] "Exactly!"]
    :-> [:volskaya :sombra :option 2]]

   [:volskaya :sombra :option 2]
   [:miranda/option
    "Symmetra" []
    "I suppose the prank is relatively harmless, given our team composition."
    "I don’t foresee this going well for us."]

   [:volskaya :sombra :option 2 0]
   [:miranda/dialogue
    ["Sombra" [] "That’s my girl. I knew I could count on you to have some fun."]
    :-> [:voslkaya :sombra 4]]

   [:volskaya :sombra :option 2 1]
   [:miranda/dialogue
    ["Sombra" [] "Hey, now. A deal’s a deal. If there’s one thing I can count on you straightlaced types for it’s not going back on your word."]
    ["Symmetra" [] "Clearly you do not have much experience in the exciting world of corporate espionage. But yes, I suppose I should honor our agreement despite my reservations. As long as we are clear that you are to be held wholly responsible for whatever detrimental fall out may occur from this action."]
    ["Sombra" [] " Us spending some quality time together is well worth a possible black eye from the world’s strongest homo, in my opinion."]
    ["Symmetra" [] "I see. As long as you’re the one taking the punches."]
    ["Sombra" [] "Gladly, mi amor."]
    :-> [:volskaya :sombra 4]]

   [:volskaya :sombra :cutscene 2]
   [:miranda/narration
    "After setting up your teleporter near the river’s edge on the back of the first point you and Sombra take a seat to watch the ensuing pandemonium. Zenyatta comes through the teleporter and instantly sinks. Sombra cannot contain her laughter, but quickly attempts to regain her composure and shoots you a look of feigned horror mixed with an apologetic shrug. Widowmaker comes next, but reacts instantly, grappling up a building and flipping you two off as she zips away from the battlefield. Sombra returns her one fingered salute as you watch her disappear into the distance. You awkwardly wait for a few more seconds before Zarya passes through the teleporter but manages to stop herself short of falling over the edge."
    :-> [:volskaya :sombra 5]]

   [:volskaya :sombra 5]
   [:miranda/dialogue
    ["Zarya" [] " Ah ha! This is why you always walk backwards when passing through teleporter, just as Grandfather said. "]
    ["Zarya" [] "YOU TWO! I thought we were losing because Omnic is bad healer but it is because of you, fake support, and criminal with bad ombre! I will crush you."]
    ["Sombra" [] "It’s just a prank! Give us a break."]
    ["Zarya" [] "Hacker, the only reason I show leniency until now is Ms. Volskaya has instructed me to ignore old grudge. "]
    ["Zarya" [] "This is new grudge now. "]
    ["Zarya" [] "Ice wife!"]
    ["" [] "Mei appears through the teleporter."]
    ["Zarya" [] "It appears team discipline is in need of improvement. Come we have much work to do."]
    ["" [] "Mei pulls out her gun."]
    ["Zarya" [] "You will now regret your lack of physical training, thin one."]
    :-> [:volskaya :sombra :cutscene 3]]

   [:volskaya :sombra :cutscene 3]
   [:miranda/narration
    "You and Sombra make a mad dash for one of the nearby apartment complexes, hoping to avoid Zarya and Mei’s wrath. Your light clothing gave you the edge in agility you needed to escape your two more appropriately dressed teammates and you manage to hide yourselves inside after a frantic sprint. "
    :-> [:volskaya :sombra 6]]

   [:volskaya :sombra 6]
   [:miranda/dialogue
    ["Sombra" [] "Haha, did you see their faces?"]
    ["Symmetra" [] "Did you see yours? I thought you must have wet yourself!"]
    ["Sombra" [] "Maybe I did! Covertly."]
    ["Symmetra" [] "And maybe I’m grossed out. Overtly."]
       ["Sombra" [] "Ah! I’m glad I didn’t get beat up over that.  Now, mi dulcito, we can begin the romantic portion of this date in style."]
   ["Symmetra" [] "This is your idea of a date? Breaking into a stranger’s apartment?"]
   ["Sombra" [] "As a hacker, I can attest that nothing get’s me going more than some breaking and entering."]
   ["Symmetra" [] "I don’t think so."]
   ["Sombra" [] "Fair."]
   ["" [] "You hear some loud beeping come out of Sombra."]
   ["Sombra" [] "Um. Uh, oh."]
   ["Sombra" [] "Seems like the Volskaya industries firewall has been beefed up since I was last here? They have, um, managed to shut me out? It looks like the giant robot has been rerouted to shoot at our team, instead."]
   ["Symmetra" [] "We should make haste back to the point."]
   ["Sombra" [] "Do you have a deathwish? With that freaky protein powder, Zarya has been genetically modifying herself to be Dio Brando from JoJo’s Bizzare adventure. AFTER he became a vampire. I’ve seen her literally walk up stone pillars."]
   ["Symmetra" [] "Your reference is lost on me."]
   ["Sombra" [] "He’s a dude you definitely do not want to mess with. Do you know what happened to people that crossed him? They lost everything. Even their own BODY."]
   ["Symmetra" [] "What?"]
   ["Sombra" [] "I’ll send you a YouTube link later. Trust me, no anime connoisseur can get by without having watched least some of that legendary series. Imagine the goodest boy. This is a series where the goodest boy goes on to do the goodest things."]
   ["Symmetra" [] "I do not have time to discuss old pop culture references with you Sombra. We need to return to the match. Although with our teammates outnumbered they have most likely already lost."]
   ["Sombra" [] "Good call! Let’s give up. I’m glad you’ve come to your senses! Wanna watch anime intros with me while we wait for this thing to blow over?"]
   ["Symmetra" [] "We will be arrested if we get caught in this home."]
   ["Sombra" [] "This is Volskaya industries guest housing. That’s why they keep it so close to an active war zone. I’ve hacked everything for us so things are nice and snug."]
   ["Sombra" [] "Good old Russian cybersecurity. They’re very good at hacking, but also very good at getting hacked."]
   ["Symmetra" [] "If I recall correctly, you said the same thing about the robot that was supposed to win the match for us."]
   ["Symmetra" [] "But fine. Seeing as there are no plausible alternatives, I’ll watch whatever it is you want me to watch."]
    :-> [:volskaya :sombra :cutscene 4]]

   [:volskaya :sombra :cutscene 4]
   [:miranda/narration
    "You spend maybe 30 minutes indulging Sombra in her dorky anime bullshit, until your anxiety about the match results becomes unbearable. You make up your mind to leave, but ultimately, decide returning to the hotel while Zarya was still angry could result in some unfortunate consequences. After several minutes of angry pacing you make your peace and sit back down."
    :-> [:volskay :sombra 7]]

   [:volskaya :sombra 7]
   [:miranda/dialogue
    ["Sombra" [] "Hey. Um. Sorry you got stuck with me all day."]
    ["Symmetra" [] "It was fine. But, your show is not my thing"]
    ["Sombra" [] "That’s fair."]
    ["Symmetra" [] "..."]
    ["Sombra" [] "If I’m going to be honest, I’m having a blast. Getting in trouble and then nestling away with someone cute is my idea of a great afternoon."]
    ["Symmetra" [] "Ms. Sombra!"]
    ["Sombra" [] "Just two cuties, committing cybercrimes against the military industrial complex. Possibly covertly blowing up millions of dollars of equipment."]
    ["Symmetra" [] "You did what?"]
    ["Sombra" [] "I said possibly! And it’s not like it’s a bad thing. You like peace and order, right? Giant mechas are not going to contribute to that."]
    ["Symmetra" [] "Well, in the future, please do not commit acts of terrorism in the name of my ideals."]
    ["Sombra" [] "You talk about this as if it were planned. I just saw an opportunity and went for it.."]
    ["Symmetra" [] "Your laize-faire attitude toward your work is unusual, but it does not change the fact that you are a terrorist."]
    ["Sombra" [] "A terrorist with an accomplice! You were happy to employ my hacking when it suited your purposes. That’s the problem with you law and order types. You’re very happy to excuse your own transgressions and blame others."]
    ["Symmetra" [] "I do not think employing military hardware on a battlefield to aid in battle is the same as causing damage to private property."]
    ["Sombra" [] "Private property, ha, lo--"]
    ["Symmetra" [] "But, you are right. I am an accomplice. I should consider my actions more seriously so I do not betray my own ideals."]
    ["Sombra" [] "...oh."]
    ["" [] "You sit in silence for several minutes before Sombra speaks."]
    ["Sombra" [] "You know, for an over-serious authoritarian type, you’re surprisingly, um...not a shitbag. It’s refreshing to see someone like you keep your moral code and take personal responsibility, for once."]
    :-> [:volskaya :sombra :option 4]]

   [:volskaya :sombra :option 4]
   [:miranda/option
    "Symmetra" []
    "And for a terrorist, you’re not scum."
    "You may be terrorist scum, but at least I had a good time."]

   [:volskaya :sombra :option 4 0]
   [:miranda/dialogue
    ["Sombra" [] "Not scum I can work with!"]
    ["Sombra" [] "Next step, flirting!"]
    ["Symmetra" [] "Next time, do not start with acts of terrorism."]
    ["Sombra" [] "Ease you into dismantling the military-industrial complex, got it. Next time we’ll maybe just throw blood on Volskaya executives."]
    ["Symmetra" [] "Start smaller."]
    ["Sombra" [] "We’ll shake our fists from far away at the military-industrial complex?"]
    ["Symmetra" [] "There we go."]
    :-> [:volskaya :sombra 8]]

   [:volskaya :sombra :option 4 1]
   [:miranda/dialogue
    ["Sombra" [] "A successful first date, then!"]
    ["Symmetra" [] "I wouldn’t call it a success."]
    ["Sombra" [] "A non disastrous first date."]
    ["Symmetra" [] "I wouldn’t---"]
    ["Sombra" [] "We didn’t get punched?"]
    ["Symmetra" [] "Sure."]
    ["Sombra" [] "Well there we go!"]
    :-> [:volskaya :sombra 8]]

   [:volskaya :sombra 8]
   [:miranda/dialogue
    ["Symmetra" [] "I do not like admitting this, but the prank WAS rather humorous."]
    ["Sombra" [] "Worth the loss?"]
    ["Symmetra" [] "No, but today wasn’t all bad. ."]
    ["Sombra" [] "What I’m hearing is that you had a good time hanging out with a cute and debaucherous lady all day but you’re ashamed to admit it."]
    ["Symmetra" [] "Perhaps."]
    ["Symmetra" [] "In any case, I am ready to leave. I think we may be able to recover our bags from the hotel without getting assaulted now."]
    ["Sombra" [] "I can risk my skin for you. I’ll infiltrate all sneaky like."]
    ["Symmetra" [] "How chivalrous."]
    ["Sombra" [] "Why, thank you!"]
    ["Symmetra" [] "But it will not be necessary. I have repaired our standing with Zarya and Mei."]
    ["Sombra" [] "Oh really? How so?"]
    ["Symmetra" [] "You are not the only covert operative here. I have been surreptitiously texting them to negotiate a settlement while we hid in this room. They have agreed to find you exclusively liable and will forgive us on the condition that we both attend their intense personal training 24-7 boot-camp for the next week, for which you will be paying."]
    ["Sombra" [] " That sounds...expensive."]
    ["Symmetra" [] "I guess you better make sure the bitcoin miners in my turrets are working overtime. Please do not burn anything down."]
    ["Sombra" [] "Shit."]
    :-> [:volskaya :cutscene 5]]

   [:volskaya :cutscene 5]
   [:miranda/narration
    "You make your way back to the hotel, and are immediately met by Zarya and Mei, who are packing protein powder and Nike tracksuits for the both of you. After buying their expensive personal training package, you begin your workout regimen. You and Sombra do not have time to exchange words, and after the workout is over, you do not have the energy to do much but slink back into your rooms and fall asleep. The following week is a blur of chalk flavored agony. When you finally arrive home, you sleep for 2 days straight in an attempt to revitalize your system for the upcoming matches. Once you wake up, you discover you have received a string of incoherent snapchats from Sombra, which seem to be chronicling the previous week. Although it is hard to tell what is happening in most of them, the clearest one seems to be Sombra crying in front of a flaming warehouse when filled with your converted bitcoin mining turrets."
    :-> [:kings-row :intro]]})
