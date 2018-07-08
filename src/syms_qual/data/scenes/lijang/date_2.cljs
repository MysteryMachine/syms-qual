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
    ["D.Va" [[:dva :_dunk (scoot -80 10 1)]]
     "Ohhhh! These noobs just got dunked on! Now they gotta give me their lunch money!"]
    ["Lucio" [[:dva :_dunk (scoot 10)] [:lucio :_micExplain (scoot -80 0 1)]]
     "Everyone, it’s terrible, our heel, D.Va. Did you know that the D in D.Va actually stands for Dastardly? Well, now, after defeating some young children at video games, she’s taking their lunch money too! What say you, viewers, about this display?"]
    ["D.Va" [[:dva :_handsHips (scoot 10 -5 1)] [:lucio :_micNeutral]]
     "I don’t care about the viewers? I’m here for the money! Pay up!"]
    ["Lucio" [[:dva :_handsHipsGum (scoot -5 10 1)] [:lucio :_micFist]]
     "You heard it here, folks, D.Va has sold out! Will anyone stand up for the youths?"]
    ["Junkrat" [[:dva :_handsHipsGum (scoot 10 5 1)]
                [:lucio :_micNeutral (scoot 0 -5 1)]
                [:junkrat :_reversePointUp (scoot 80 25 1)]]
     "Oi! D.Va! I’ll take ya! "]
    ["D.Va" [[:dva :_dunk (scoot 5 -5 1)]
             [:lucio :_micNeutral (scoot -5)]
             [:junkrat :_reverseNeutral (scoot 25)]]
     "Ha! Hardly a challenge! Why not make it a 2v1? I can take it."]
    ["Lucio" [[:dva :_handsHips (scoot -5 -15 1)]
              [:lucio :_micPoint (scoot -5)]
              [:junkrat :_reverseNeutral (scoot 25)]]
     "Will Junkrat find a partner to take down monster heel D.Va in her reign of terror?"]
    ["Junkrat" [[:dva :_handsHips (scoot -15)]
                [:lucio :_micNeutral (scoot -5)]
                [:junkrat :_reverseBack (scoot 25 5 1)]]
     "I nominate Symmetra!"]
    ["Lucio" [[:dva :_handsHips (scoot -15 -80 1)]
              [:lucio :_micExplain (scoot -5 15 1)]
              [:junkrat :_reverseBack (scoot 5 100 1)]]
     "He nominates the beautiful and talented Symmetra to take D.Va on in Fighters of the Storm 2! Will she do it?"]
    ["Lucio" [[:symmetra :_awkward (scoot 80 20 1)]
              [:lucio :_micCool (scoot 15 30 1)]]
     "You cool?"]
    ["Symmetra" [[:symmetra :_explainUncomfortable (scoot 20 0 1)]
                 [:lucio :_micNeutral (scoot 30 0 1)]]
     "Yes. I will try."]
    ["Lucio" [[:symmetra :_awkward]
              [:lucio :_micExplain]]
     "You heard it here, folks, she’s ready to try! It’s a 2v1 match! It’s for the children, y’all!"]
    ["Junkrat" [[:symmetra :_awkward (scoot 0 20 1)]
                [:junkrat :_reverseFist (scoot 80 0 1)]
                [:lucio :_micNeutral]]
     "I will defend your honor and your lunch money, arcade ankle biters!"]
    :-> [:junkrat-b]]

   [:junkrat-b]
   [:miranda/characters
    [[]]
    :-> [:junkrat-b :text]]

   [:junkrat-b :text]
   [:miranda/narration
    "The children give Junkrat a weird look. He shrugs it off and you both settle in to play. You assume D.Va could probably beat you two, even with this disadvantage, but you get the impression that she is taking it easy so that she does not actually have to rob these little kids of their money."
    "You glance over to her chat, everyone is cheering for her to win. You spend a few moments considering whether or not the mob of internet strangers literally wants D.Va to rob small children before deciding it’s best not to think too hard about it. You and Junkrat manage to snag a close victory."
    :-> [:arcade :dva 5]]

   [:arcade :dva 5]
   [:miranda/dialogue
    ["Junkrat" [[:dva :_neutral (scoot -25)] [:junkrat :_reverseShyBlush (scoot 5)] [:symmetra :_smile (scoot 5)]]
     "Explosive! Fantastic! I, uh, think that’s the first time I’ve ever won?"]
    ["Symmetra" [[:dva :_neutral (scoot -25)] [:junkrat :_reverseNeutral (scoot 5)] [:symmetra :_confused (scoot 5)]]
     "You’ve never managed to win?"]
    ["Junkrat" [[:dva :_neutralGum (scoot -25)] [:junkrat :_reverseBack (scoot 5)] [:symmetra :_neutral (scoot 5)]]
     "Look, I play farming simulators and JRPGs pretty exclusively? Fighting games just aren’t in my arsenal. I can’t tell the difference between a one frame link and a neutral."]
    ["Symmetra" [[:dva :_neutral (scoot -25)] [:junkrat :_reverseNeutral (scoot 5)] [:symmetra :_skeptical (scoot 5)]]
     "I...see."]
    ["D.Va" [[:dva :_explainChat (scoot -25)] [:junkrat :_reverseSmileNod (scoot 5)] [:symmetra :_awkward (scoot 5)]]
     "Well, chat, there you have it. I’m not robbing literal children. Drop some Kappas in the chat."]
    ["Symmetra" [[:dva :_neutral (scoot -25)] [:junkrat :_reverseNeutral (scoot 5)] [:symmetra :_confused (scoot 5)]]
     "Some what?"]
    ["Junkrat" [[:dva :_neutralGum (scoot -25)] [:junkrat :_reverseSmileNod (scoot 5)] [:symmetra :_confused (scoot 5)]]
     "No idea, mate. When they talk to the chat I just smile and nod."]
    ["D.Va" [[:junkrat :_reverseNeutral (scoot 5)] [:symmetra :_neutral (scoot 5)] [:dva :_point (scoot -25)]]
     "Alright, alright. How about some Q and A with our victors. What do you say?"]
    ["Symmetra" [[:dva :_neutral (scoot -25)] [:junkrat :_reverseNeutral (scoot 5)] [:symmetra :_explainUncomfortable (scoot 5)]]
     "I suppose."]
    ["Junkrat" [[:dva :_neutral (scoot -25)] [:junkrat :_reversePointUp (scoot 5)] [:symmetra :_awkward (scoot 5)]]
     "Will it be some questions from Teen Vogue?"]
    ["D.Va" [[:dva :_teenVogue (scoot -25)] [:junkrat :_reverseNeutral (scoot 5)] [:symmetra :_neutral (scoot 5)]]
     "Of course! I even got the special retro-chic paper edition as a collectible since Lu is the beautiful cover boy this month."]
    ["Lucio" [[:lucio :_smile (scoot -80 -10 1)] [:dva :_read (scoot -25)] [:junkrat :_reverseNeutral (scoot 5)] [:symmetra :_smile (scoot 5)]]
     "Stop it! You’re making me blush!"]
    ["D.Va" [[:lucio :_smile (scoot -10 -80 1)] [:dva :_readTalk (scoot -25)] [:junkrat :_reverseSmileNod (scoot 5)] [:symmetra :_awkward (scoot 5)]]
     " Anyway, this month’s quiz is \"Do you want your partner to be a boyfriend, a puppy, or a comrade in overthrowing capitalism?!\""]
    ["Junkrat" [[:dva :_read (scoot -25)] [:junkrat :_reverseFistSmile (scoot 5)] [:symmetra :_awkward (scoot 5)]]
     "Oh boy!"]
    ["D.Va" [[:dva :_readTalkSad (scoot -25)] [:junkrat :_reverseNeutral (scoot 5)] [:symmetra :_neutral (scoot 5)]]
     "Question one! What do you most seek in your potential partner!"]
    :-> [:arcade :dva :quiz 1]]

   [:arcade :dva :quiz 1]
   [:miranda/option
    "Symmetra" [[:dva :_read (scoot -25)] [:junkrat :_reverseNeutral (scoot 5)] [:symmetra :_neutral (scoot 5)]]
    ["Soft, warm fur." (constantly true)
     (inc-transition [:-> [:arcade :dva 6]] :points/puppy)]
    ["Good pecs." (constantly true)
     (inc-transition [:-> [:arcade :dva 6]] :points/partner)]
    ["The ability to organize political rallies in which to engage the proletariat in the revolution."
     (constantly true)
     (inc-transition [:-> [:arcade :dva 6]] :points/commie)]]

   [:arcade :dva 6]
   [:miranda/dialogue
    ["Junkrat" [[:dva :_read (scoot -25)] [:junkrat :_reversePointUp (scoot 5)] [:symmetra :_neutral (scoot 5)]] "Definitely fur!"]
    ["D.Va" [[:dva :_readTalk (scoot -25)] [:junkrat :_reverseNeutral (scoot 5)] [:symmetra :_neutral (scoot 5)]] "Question two! When in bed with your partner, where do they lie?"]
    :-> [:arcade :dva :quiz 2]]

   [:arcade :dva :quiz 2]
   [:miranda/option
    "Symmetra" [[:dva :_read (scoot -25)] [:junkrat :_reverseNeutral (scoot 5)] [:symmetra :_neutral (scoot 5)]]
    ["At the foot of the bed." (constantly true)
     (inc-transition [:-> [:arcade :dva 7]] :points/puppy)]
    ["Right beside you, gazing into your eyes." (constantly true)
     (inc-transition [:-> [:arcade :dva 7]] :points/partner)]
    ["Next to the seized means of production." (constantly true)
     (inc-transition [:-> [:arcade :dva 7]] :points/commie)]]

   [:arcade :dva 7]
   [:miranda/dialogue
    ["Junkrat" [[:dva :_read (scoot -25)] [:junkrat :_reverseWink (scoot 5)] [:symmetra :_neutral (scoot 5)]] "Right next ta me!"]
    ["D.Va" [[:dva :_readTalkSad (scoot -25)] [:junkrat :_reverseNeutral (scoot 5)] [:symmetra :_neutral (scoot 5)]] "Final question! What sort of birthday gift would you want from your partner?"]
    :-> [:arcade :dva :quiz 3]]

   [:arcade :dva :quiz 3]
   [:miranda/option
    "Symmetra" [[:dva :_read (scoot -25)] [:junkrat :_reverseNeutral (scoot 5)] [:symmetra :_neutral (scoot 5)]]
    ["A thoughtful item reflecting their careful attention to your wants and interests."
     (constantly true)
     (inc-transition [:-> [:arcade :dva 8]] :points/puppy)]
    ["A gently used tennis ball." (constantly true)
     (inc-transition [:-> [:arcade :dva 8]] :points/partner)]
    ["A hammer and sickle." (constantly true)
     (inc-transition [:-> [:arcade :dva 8]] :points/commie)]]

   [:arcade :dva 8]
   [:miranda/dialogue
    ["Junkrat" [[:dva :_read (scoot -25)] [:junkrat :_reverseThinking (scoot 5)] [:symmetra :_neutral (scoot 5)]]
     "Oh, a tough one. I think I’m going to have to go with the tools."]
    ["D.Va" [[:dva :_readTalk (scoot -25)] [:junkrat :_reverseNeutral (scoot 5)] [:symmetra :_neutral (scoot 5)]]
     "Alright! Lemme tally up the results. "]
    ["D.Va" [[:dva :_shrugTeenVogue (scoot -25)] [:junkrat :_reverseNeutral (scoot 5)] [:symmetra :_awkward (scoot 5)]]
     "Jamie! It seems like you want a human that is metaphorically a communist dog, a dog that is metaphorically a communist human, or something in between that is literally a communist human-dog hybrid."]
    ["Lucio" [[:lucio :_weeping (scoot -80 -10 1)] [:dva :_read (scoot -25)] [:junkrat :_reverseNeutral (scoot 5)] [:symmetra :_awkward (scoot 5)]]
     "RIP Nina Tucker, y’all."]
    ["D.Va" [[:lucio :_weeping (scoot -10)] [:dva :_readTalkSad (scoot -25)] [:junkrat :_reverseNeutral (scoot 5)] [:symmetra :_awkward (scoot 5)]]
     "Lucio, it’s still too early to joke about that."]
    ["Lucio" [[:lucio :_wipeTears (scoot -10 -80 1 1)] [:dva :_read (scoot -25)] [:junkrat :_reverseNeutral (scoot 5)] [:symmetra :_awkward (scoot 5)]]
     "I hear ya."]
    :transition :miranda/conditional
    [#(> (:points/partner %) 1) [:-> [:arcade :dva :quiz :boyfriend]]
     #(> (:points/puppy %) 1)   [:-> [:arcade :dva :quiz :puppy]]
     #(> (:points/commie %) 1)  [:-> [:arcade :dva :quiz :commie]]
     :else                      [:-> [:arcade :dva :quiz :nina]]]]

   [:arcade :dva :quiz :boyfriend]
   [:miranda/dialogue
    ["D.Va" [[:dva :_teenVogue (scoot -25)] [:junkrat :_reverseSmileNod (scoot 5)] [:symmetra :_1000Mile (scoot 5)]]
     "And Symmetra! You want a boyfriend!"]
    ["Junkrat" [[:dva :_neutral (scoot -25)] [:junkrat :_reverseShyBlush (scoot 5)] [:symmetra :_1000Mile (scoot 5)]]
     "Ehehehe."]
    ["Symmetra" [[:dva :_neutral (scoot -25)] [:junkrat :_reverseSmileNod (scoot 5)] [:symmetra :_coy (scoot 5)]]
     "Hush!"]
    :-> [:arcade :dva 9]]

   [:arcade :dva :quiz :puppy]
   [:miranda/dialogue
    ["D.Va" [[:dva :_teenVogue (scoot -25)] [:junkrat :_reverseSmileNod (scoot 5)] [:symmetra :_smile (scoot 5)]]
     "And it looks like Symmetra wants a puppy!"]
    ["Junkrat" [[:dva :_neutral (scoot -25)] [:junkrat :_reversePointUp (scoot 5)] [:symmetra :_neutral (scoot 5)]]
     "Good choice, darl!"]
    ["Symmetra" [[:dva :_neutral (scoot -25)] [:junkrat :_reverseNeutral (scoot 5)] [:symmetra :_sass (scoot 5)]]
     "A obedient hound would be fun."]
    :-> [:arcade :dva 9]]

   [:arcade :dva :quiz :commie]
   [:miranda/dialogue
    ["D.Va" [[:dva :_teenVogue (scoot -25)] [:junkrat :_reverseSmileNod (scoot 5)] [:symmetra :_smile (scoot 5)]]
     "Symmetra! Aww! You want a comrade in the revolution!"]
    ["Junkrat" [[:dva :_neutral (scoot -25)] [:junkrat :_reverseShrug (scoot 5)] [:symmetra :_smile (scoot 5)]]
     "Frankly, I’m embarrassed I didn’t get that."]
    ["Symmetra" [[:dva :_neutral (scoot -25)] [:junkrat :_reverseSmileNod (scoot 5)] [:symmetra :_sass (scoot 5)]]
     "Capitalism is too disorderly for my taste."]
    :-> [:arcade :dva 9]]

   [:arcade :dva :quiz :nina]
   [:miranda/dialogue
    ["D.Va" [[:dva :_teenVogue (scoot -25)] [:junkrat :_reverseNeutral (scoot 5)] [:symmetra :_neutral (scoot 5)]] "Symmetra apparently wants the same thing! That’s kinda romantic!"]
    ["Symmetra" [[:dva :_neutral (scoot -25)] [:junkrat :_reverseNeutral (scoot 5)] [:symmetra :_no (scoot 5)]] "No."]
    ["Junkrat" [[:dva :_neutral (scoot -25)] [:junkrat :_reverseSmileNod (scoot 5)] [:symmetra :_neutral (scoot 5)]] "I like romance, but yeah, no."]
    ["D.Va" [[:dva :_attacked (scoot -25)] [:junkrat :_reverseNeutral (scoot 5)] [:symmetra :_smile (scoot 5)]] "Wow. I kinda feel attacked right now?????"]
    ["Junkrat" [[:dva :_neutralGum (scoot -25)] [:junkrat :_reverseSmileNod (scoot 5)] [:symmetra :_smile (scoot 5)]] "Eheheheh."]
    :-> [:arcade :dva 9]]

   [:arcade :dva 9]
   [:miranda/dialogue
    ["D.Va" [[:dva :_shrugTeenVogue (scoot -25)] [:junkrat :_reverseNeutral (scoot 5)] [:symmetra :_smile (scoot 5)]]
     "Well! Now we’ve met the champs! But we gotta vacate the premises immediately! We’re getting awkward looks from management after almost mugging children! Thank you! Good night! Love, D.Va!"]
    :-> [:arcade :cutscene 5]]

   [:arcade :cutscene 5]
   [:miranda/narration
    "Everyone in the room helps management clean up the establishment. Before leaving, Junkrat comes up to you to say good-bye."
    :-> [:arcade :dva 10]]

   [:arcade :dva 10]
   [:miranda/dialogue
    ["Junkrat" [[:junkrat :_ballConfused (scoot -80 -10 1)] [:symmetra :_smile (scoot 70 0 1)]]
     "Hey! Uh! I just wanted to thank ya for coming out! Good seeing you, and cheers to our mutual fighting game victory!"]
    ["Symmetra" [[:junkrat :_ballNeutral (scoot -10)]  [:symmetra :_smug]]
     "Ah! Thank you. I’m glad I could help you save those children from being robbed live on a gaming website for all to see."]
    ["Junkrat" [[:junkrat :_shyblush (scoot -10)]  [:symmetra :_smile]]
     "Ehehehe. Yeah. Well, I, uh, can’t dawdle. Roadie’s trying to catch this American livestream of puppies, and it’s almost dinner time for them! We can’t miss it! Good night!"]
    ["Symmetra" [[:junkrat :_ballNeutral (scoot -10)]  [:symmetra :_helloWarm]]
     "Good night!"]
    :-> [:hotel 1]]

   [:hotel 1]
   [:miranda/narration
    "You manage to find your way back through the dense maze of streets and make it safely  to your hotel. Your jam packed day was quite exhausting and you welcome the soft embrace of your bed.  You awaken the next morning feeling slightly better after a good night’s rest and begin your morning routine by checking your phone."
    :-> [:hotel 2]]

   [:hotel 2]
   [:miranda/characters
    [[[:photos :_junkratDate2] [:phones :_symHand]]]
    :-> [:hotel 2 :text]]

   [:hotel 2 :text]
   [:miranda/dialogue
    [nil [[:photos :_junkratDate2] [:phones :_symHand]]
     "You discover a long string of text messages from D.Va thanking you profusely for your participation in yesterday’s live stream and complimenting your nascent fighting game skills. At the end of the messages is included a screencap that a viewer had taken of the stream."]
    :=> [:eichenwalde [:spawn :intro] 0]]})
