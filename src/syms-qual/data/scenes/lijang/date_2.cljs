(ns syms-qual.data.scenes.lijang.date-2
  (:require [carmen.util :as anim :refer [scoot]]
            [syms-qual.util :as util :refer [inc-transition]]))

(def data
  {[:arcade :dva :cutscene 3]
   [:miranda/narration
    "Suddenly, you hear a racket coming from in front of the camera."
    :-> [:arcade :dva 4]]

   [:arcade :dva 4]
   [:miranda/dialogue
    ["D.Va" []
     "Ohhhh! These noobs just got dunked on! Now they gotta give me their lunch money!"]
    ["Lucio" []
     "Everyone, it’s terrible, our heel, D.Va. Did you know that the D in D.Va actually stands for Dastardly? Well, now, after defeating some young children at video games, she’s taking their lunch money too! What say you, viewers, about this display?"]
    ["D.Va" []
     "I don’t care about the viewers? I’m here for the money! Pay up!"]
    ["Lucio" []
     "You heard it here, folks, D.Va has sold out! Will anyone stand up for the youths?"]
    ["Junkrat" []
     "Oi! D.Va! I’ll take ya! "]
    ["D.Va" []
     "Ha! Hardly a challenge! Why not make it a 2v1? I can take it."]
    ["Lucio" []
     "Will Junkrat find a partner to take down monster heel D.Va in her reign of terror?"]
    ["Junkrat" []
     "I nominate Symmetra!"]
    ["Lucio" []
     "He nominates the beautiful and talented Symmetra to take D.Va on in Fighters of the Storm 2! Will she do it?"]
    ["Lucio" []
     "You cool?"]
    ["Symmetra" []
     "Yes. I will try."]
    ["Lucio" []
     "You heard it here, folks, she’s ready to try! It’s a 2v1 match! It’s for the children, y’all!"]
    ["Junkrat" []
     "I will defend your honor and your lunch money, arcade ankle biters!"]
    :-> [:arcade :dva :cutscene 4]]

   [:arcade :dva :cutscene 4]
   [:miranda/narration
    "The children give Junkrat a weird look. He shrugs it off and you both settle in to play. You assume D.Va could probably beat you two, even with this disadvantage, but you get the impression that she is taking it easy so that she does not actually have to rob these little kids of their money. You glance over to her chat, everyone is cheering for her to win. You spend a few moments considering whether or not the mob of internet strangers literally wants D.Va to rob small children before deciding it’s best not to think too hard about it. You and Junkrat manage to snag a close victory.
"
    :-> [:arcade :dva 5]]

   [:arcade :dva 5]
   [:miranda/dialogue
    ["Junkrat" []
     "Explosive! Fantastic! I, uh, think that’s the first time I’ve ever won?"]
    ["Symmetra" []
     "You’ve never managed to win?"]
    ["Junkrat" []
     "Look, I play farming simulators and JRPGs pretty exclusively? Fighting games just aren’t in my arsenal. I can’t tell the difference between a one frame link and a neutral."]
    ["Symmetra" []
     "I...see."]
    ["D.Va" []
     "Well, chat, there you have it. I’m not literally robbing children. Drop some Kappas in the chat."]
    ["Symmetra" []
     "Some what?"]
    ["Junkrat" []
     "No idea, mate. When they talk to the chat I just smile and nod."]
    ["D.Va" []
     "Alright, alright. How about some Q and A with our victors. What do you say?"]
    ["Symmetra" []
     "I suppose."]
    ["Junkrat" []
     "Will it be some questions from Teen Vogue?"]
    ["D.Va" []
     "Of course! I even got the special retro-chic paper edition as a collectible since Lu is the beautiful cover boy this month."]
    ["Lucio" []
     "Stop it! You’re making me blush!"]
    ["D.Va" []
     " Anyway, this month’s quiz is “Do you want your partner to be a boyfriend, a puppy, or a comrade in overthrowing capitalism?!”"]
    ["Junkrat" []
     "Oh boy!"]
    ["D.Va" []
     "Question one! What do you most seek in your potential partner!"]
    :-> [:arcade :dva :quiz 1]]

   [:arcade :dva :quiz 1]
   [:miranda/option
    "Symmetra" []
    ["Soft, warm fur." (constantly true)
     (inc-transition [:-> [:arcade :dva 6]] :points/puppy)]
    ["Good pecs." (constantly true)
     (inc-transition [:-> [:arcade :dva 6]] :points/partner)]
    ["The ability to organize political rallies in which to engage the proletariat in the revolution."
     (constantly true)
     (inc-transition [:-> [:arcade :dva 6]] :points/commie)]]

   [:arcade :dva 6]
   [:miranda/dialogue
    ["Junkrat" [] "Definitely fur!"]
    ["D.Va" [] "Question two! When in bed with your partner, where do they lie?"]
    :-> [:arcade :dva :quiz 2]]

   [:arcade :dva :quiz 2]
   [:miranda/option
    "Symmetra" []
    ["At the foot of the bed." (constantly true)
     (inc-transition [:-> [:arcade :dva 7]] :points/puppy)]
    ["Right beside you, gazing into your eyes." (constantly true)
     (inc-transition [:-> [:arcade :dva 7]] :points/partner)]
    ["Next to the seized means of production." (constantly true)
     (inc-transition [:-> [:arcade :dva 7]] :points/commie)]]

   [:arcade :dva 7]
   [:miranda/dialogue
    ["Junkrat" [] "Right next ta me!"]
    ["D.Va" [] "Final question! What sort of birthday gift would you want from your partner?"]
    :-> [:arcade :dva :quiz 3]]

   [:arcade :dva :quiz 3]
   [:miranda/option
    "Symmetra" []
    ["A thoughtful item reflecting their careful attention to your wants and interests."
     (constantly true)
     (inc-transition [:-> [:arcade :dva 8]] :points/puppy)]
    ["A gently used tennis ball." (constantly true)
     (inc-transition [:-> [:arcade :dva 8]] :points/partner)]
    ["A hammer and sickle." (constantly true)
     (inc-transition [:-> [:arcade :dva 8]] :points/commie)]]

   [:arcade :dva 8]
   [:miranda/dialogue
    ["Junkrat" []
     "Oh, a tough one. I think I’m going to have to go with the tools."]
    ["D.Va" []
     "Alright! Lemme tally up the results. "]
    ["D.Va" []
     "Jamie! It seems like you want a human that is metaphorically a communist dog, a dog that is metaphorically a communist human, or something in between that is literally a communist human-dog hybrid."]
    ["Lucio" []
     "RIP Nina Tucker, y’all."]
    ["D.Va" []
     "Lucio, it’s still too early to joke about that."]
    ["Lucio" []
     "I hear ya."]
    :transition :miranda/conditional
    [#(> (:points/partner %) 1) [:-> [:arcade :dva :quiz :boyfriend]]
     #(> (:points/puppy %) 1)   [:-> [:arcade :dva :quiz :puppy]]
     #(> (:points/commie %) 1)  [:-> [:arcade :dva :quiz :commie]]
     :else                      [:-> [:arcade :dva :quiz :nina]]]]

   [:arcade :dva :quiz :boyfriend]
   [:miranda/dialogue
    ["D.Va" []
     "And Symmetra! You want a boyfriend!"]
    ["Junkrat" []
     "Ehehehe."]
    ["Symmetra" []
     "Hush!"]
    :-> [:arcade :dva 9]]

   [:arcade :dva :quiz :puppy]
   [:miranda/dialogue
    ["D.Va" []
     "And it looks like Symmetra wants a puppy!"]
    ["Junkrat" []
     "A strong choice."]
    ["Symmetra" []
     "A obedient hound would be fun."]
    :-> [:arcade :dva 9]]

   [:arcade :dva :quiz :commie]
   [:miranda/dialogue
    ["D.Va" []
     "Symmetra! Aww! You want a comrade in the revolution!"]
    ["Junkrat" []
     "Frankly, I’m embarrassed I didn’t get that."]
    ["Symmetra" []
     "Capitalism is too disorderly for my taste."]
    :-> [:arcade :dva 9]]

   [:arcade :dva :quiz :nina]
   [:miranda/dialogue
    ["D.Va" [] "Symmetra apparently wants the same thing! That’s kinda romantic!"]
    ["Symmetra" [] "No."]
    ["Junkrat" [] "I like romance, but yeah, no."]
    ["D.Va" [] "Wow. I kinda feel attacked right now?"]
    ["Junkrat" [] "Eheheheh."]
    :-> [:arcade :dva 9]]

   [:arcade :dva 9]
   [:miranda/dialogue
    ["D.Va" []
     "Well! Now we’ve met the champs! But we gotta vacate the premises immediately! We’re getting awkward looks from management after almost mugging children! Thank you! Good night! Love, D.Va!"]
    :-> [:arcade :cutscene 5]]

   [:arcade :cutscene 5]
   [:miranda/narration
    "Everyone in the room helps management clean up the establishment. Before leaving, Junkrat comes up to you to say good-bye."
    :-> [:arcade :dva 10]]

   [:arcade :dva 10]
   [:miranda/dialogue
    ["Junkrat" []
     "Hey! Uh! I just wanted to thank ya for coming out! Good seeing you, and cheers to our mutual fighting game victory!"]
    ["Symmetra" []
     "Ah! Thank you. I’m glad I could help you save those children from being robbed live on a gaming website for all to see."]
    ["Junkrat" []
     "Ehehehe. Yeah. Well, I, uh, can’t dawdle. Roadie’s trying to catch this American livestream of puppies, and it’s almost dinner time for them! We can’t miss it! Good night!"]
    ["Symmetra" []
     "Good night!"]
    :-> [:arcade :dva :cutscene :final]]

   [:arcade :dva :cutscene :final]
   [:miranda/narration
    "You manage to find your way back through the dense maze of streets and make it safely  to your hotel. Your jam packed day was quite exhausting and you welcome the soft embrace of your bed.  You awaken the next morning feeling slightly better after a good night’s rest. Upon checking your phone you discover a long string of text messages from D.Va thanking you profusely for your participation in yesterday’s live stream and complimenting your nascent fighting game skills. At the end of the messages is included a screencap that a viewer had taken of the stream."
    :=> [:eichenwalde [:spawn :intro] 0]]})
