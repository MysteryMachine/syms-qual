(ns syms-qual.data.scenes.lijang.dva)

(def start-date
  [:transition :miranda/mutation->basic
   [[:-> [:anubis :pharah :confirm]]
    (fn []
      ;;TODO: mutate state to indicate date
      )]])

(def data
  {[:lijang :dva 0]
   [:miranda/dialogue
    ["Symmetra" [] "Shouldn’t you be preparing for the attack?"]
    ["D.Va" [] "Naw, I’m good. Dooooomfist already gave me the rundown. Besides,  I promised my viewers I would do this match unspoiled. The livestream is a lot less fun if I have a plan."]
    ["Symmetra" [] "You are broadcasting this match? I thought these were supposed to be secret? "]
    ["D.Va" [] "Look, it’s good business sense. Right now I’m playing Pachi-Mari Battle Buddies with Jamie, then we’ll have the match. After that he’s coming on as a special live guest-star to take me on in Fighters of the Storm 2. The cross traffic from the guest appearance and three different genres is gonna be great."]
    ["Symmetra" [] "I still feel that your time would be better spent focusing on the task at hand that cavorting with Internet celebrities in an elaborate marketing ploy for your stream."]
    ["D.Va" [] "Haha, Jamie’s not a celebrity, though I have been telling him he should stream some of those weird pyrotechnic kinetic sculpture projects he does under the creative tag. It’s Jamison Fawkes, you know? Our teammate? Junkrat?"]
    ["Symmetra" [] "I am surprised he can form a coherent enough strategy to even play."]
    ["D.Va" [] "He’s come up with a lot of very entertaining ways to lose at least. Besides, in Pachi-mari Battle Buddies, luck completely beats out strategy. Half the time when you’re winning, the game gives you Pachi-mari Poopy Diaper Chance Time and you lose because you don’t have a clean pair."]
    ["Symmetra" [] "I cannot imagine anyone wanting to watch that."]
    ["D.Va" [] "Naw, it makes a killing in the stream. It’s all, “LOL, get rekt D.Noob”. Then I get a bunch of donations from people trying to make me feel better. My donation alert is really good."]
    ["Lucio" [] "I composed it myself."]
    ["Symmetra" [] "Oh? Does some form of music playing when you receive a donation?"]
    ["Lucio" [] "Naw, I once dry heaved on a Dorito while guest starring the stream. D.Va was in the bathroom and I received a donation. Through the choking, I read out, “T-HACK-HACK-COUGH-HANKS FOR WHEEEEEZE THE COUGH COUGH COUGH.” Didn’t even finish the sentence. Now it’s immortalized as a donation alert. What the viewers hear is the nightcore remix version, though."]
    :-> [:lijang :dva :option]]

   [:lijang :dva :option 0]
   [:miranda/option
    "Symmetra" []
    "How is that a composition?"
    "Are your viewers not disgusted by this? Why not present a clear livestream, with minimal interference?"]

   [:lijang :dva :option 0 0]
   [:miranda/dialogue
    ["Lucio" [] "You say potato, I say batatas."]
    ["Symmetra" [] "This is not a matter of language."]
    ["Lucio" [] "Everything is a matter of language. My language shapes my reality. No one speaks exactly the same language because our definitions differ. Every person you meet speaks a strange accent."]
    ["Symmetra" [] "I suppose it is not surprising to see such insight from an artist such as yourself."]
    ["Lucio" [] "And my definition of art includes Pachi-mari Poopy Diaper Chance Time."]
    ["Symmetra" [] "Of course."]
    :-> [:lijang :dva 1]]

   [:lijang :dva :option 0 1]
   [:miranda/dialogue
    ["Lucio" [] "People don’t watch livestream for games."]
    ["Lucio" [] "They watch them so they can get attention from weird internet strangers."]
    ["D.Va" [] "It’s true, it’s why I make so much money! Omnic Terry Crews is like, low silver, but people wanna chat with him so he makes a killing."]
    ["Lucio" [] "Oh, Omnic Terry Crews. I’m glad they outfitted you with that Old Spice mist gun."]
    ["Symmetra" [] "..."]
    :-> [:lijang :dva 1]]

   [:lijang :dva 1]
   [:miranda/dialogue
    ["D.Va" [] "Look, if you want to experience a livestream for what it truly is, you need to BE the livestream. It’s like Lucio says, life imitates art."]
    ["Lucio" [] "And art imitates life."]
    ["D.Va" [] "What DOES art even mean?"]
    ["Symmetra" [] "I sense you two may be joking with me."]
    ["D.Va" [] "What if ART is the joke all along? Hum? Think on that. And if you, by any chance, are looking for a place to do that thinking, Lucio and I are trying to raise enough internet fun bucks from this match to rent out the arcade. J-Bomb’s coming too. Come hang out!"]
    ["Lucio" [] "Having a good straight woman on the stream will really aid our hijinks."]
    ["Lucio" [] "Of course, I mean the comedy variety of “straight woman”. We’ve all seen how you look at Sombra’s butt and literally no one is blaming you."]
    ["Symmetra" [] "This does not seem like my kind of event."]
    ["D.Va" [] "How about this: you and Jamie can have a nice chat with me while we drink some bubble tea. Casual. No viewer interaction. Lucio’ll be on the soundboard."]
    ["D.Va" [] "To be honest, Jamie is the one who really wanted you to come, I think he’s sweet on you...and it’s adorbs. He keeps drawing little triangles on his hands with blue gel pens."]
    ["Symmetra" [] "Spending some time with you all does sound like fun, but I do not know if I could handle the stress of such intense social interaction after a hectic match."]
    ["D.Va" [] "Hey, no pressure! And, uh, no one’s judging you if you decide to take the second half of the match to chill and get in the right headspace to hang out. Self care comes first, ya know?"]
    :-> [:lijang :dva :choice]]

   [:lijang :dva :choice]
   [:miranda/text-option
    "What will you do?"
    ["Try and go." (constantly true) start-date]
    ["Converse with your other teammates" (constantly true)
     [:lijang :dva :no]]]

   [:lijang :dva :yes]
   [:miranda/dialogue
    ["Symmetra" [] "Perhaps I’ll take it easy if we have a convincing first round. Please work extra hard during the match."]
    ["Lucio" [] "Booyah!"]
    ["D.Va" [] "We’ll pick you up a half hour after the match, we’ll need to reserve the spot!"]
    :-> [:lijang :dva :cutscene]]

   [:lijang :dva :no]
   [:miranda/dialogue
    ["Symmetra" [] "I appreciate the offer, but I’d like to focus on the match."]
    ["D.Va" [] "An excellent choice as well. Let us know if you’d like to change your mind."]
    :-> [:lijang :choice]]

   [:lijang :dva :cutscene]
   [:miranda/narration
    "Lucio and D.Va work extra hard during the match, and you get the sense the Junkrat, playing for the enemy team, might be slacking a bit to accommodate you. On more than one occasion, you found him attempting to lounge inconspicuously in some bushes, although to be honest, you are not entirely convinced that’s not just part of his usual modus operandi. You win the first round handily. As round two starts, you retreat into the ORCA and sit down for some much needed meditation. A while later, D.Va and Lucio show up to pick you up."
    :-> [:lijang :dva 2]]

   [:lijang :dva 2]
   [:miranda/dialogue
    ["D.Va" [] "Stream time! We got the shop, I hope you’re ready for literally infinite quantities of boba."]
    ["Lucio" [] "Do not look into the boba abyss. It will consume you. Also it will brutally spike your blood sugar, which is bad. Stay healthy, y’all."]
    ["D.Va" [] "Are you okay to go?"]
    :-> [:lijang :dva :option 1]]

   [:lijang :dva :option 1]
   [:miranda/option
    "Symmetra" []
    "I think so. The time I spent meditating has mentally prepared me."
    "I’m still rather stressed out. It’s just been a tough week."]

   [:lijang :dva :option 1 0]
   [:miranda/dialogue
    ["Symmetra" [] "I trust we managed to be victorious in our match?"]
    :-> [:lijang :dva 3]]

   [:lijang :dva :option 1 1]
   [:miranda/dialogue
    ["D.Va" [] "Hey, no pressure if you’re not feeling well."]
    ["Lucio" [] "I will say, boba has literally proven to be good for your soul. I know I’m giving conflicting boba facts, but a lot of boba is a good thing if you’re feeling down! You can handle an insulin spike or two every now and then. Practice regular self care, y’all."]
    ["Symmetra" [] "I thank you, but I am mostly uncertain as to the result of the match. Did my absence affect things?"]
    :-> [:lijang :dva 3]]

   [:lijang :dva 3]
   [:miranda/dialogue
    ["D.Va" [] "Oh. Um. We sorta blew it. Sorry! I don’t know what happened, winning five versus six was more difficult than we thought it’d be even with Jamie throwing as hard as he could."]
    ["Lucio" [] "He’s a thin boy, Satya, he can only throw so far."]
    ["Symmetra" [] "What a shame. It may be a mistake, but I suppose I should go, considering I threw the match too."]
    ["D.Va" [] "Ptchoooow, alright! Let’s do it!"]
    :-> []] ;; TODO: Conditional transition

   [:lijang :junkrat :cutscene 0]
   [:miranda/narration
    "The stream party begins, and D.Va and Lucio seat themselves in front of a few arcade machines, broadcasting using a camera mounted on the Meka, which they managed to squeeze into the arcade’s sizable freight elevator. Junkrat has not yet arrived, and thankfully, D.Va and Lucio do not ask you to perform just yet. You sit in a corner, observing their streaming hijinks, until Roadhog and Junkrat show up. They nod a quick hello to you before before ordering a massive tray filled with bubble teas and taking a seat in the opposite corner. Junkrat contemplatively chews his boba, nervously fidgeting with the strange red ball he seems to always be carrying, and periodically glancing your way, looking quite nervous. Eventually after  some persistent nudging from Roadhog, he grabs two drinks from the tray and heads in your direction,  but not before blowing an overdramatic kiss to his porcine friend."
    :-> [:lijang :junkrat 0]]

   [:lijang :junkrat 0]
   [:miranda/dialogue
    ["Junkrat" [] "Uh! G’day Symm!! Muggy in here, isn’t it? Want some tea?"]
    ["Symmetra" [] "I’m not fond of diminutives, but I suppose at this point you may call me Satya if you wish. As to the tea, I’m not sure it would be to my taste."]
    ["Junkrat" [] "It’s half sweet. Full strength stuff’s too much even for me. Give it a burl. If you don’t like it I’ll drink the rest."]
    ["Symmetra" [] "..."]
    ["Symmetra" [] "It’s so chewy!"]
    ["Junkrats" [] "That’s the best part!"]
    ["Symmetra" [] "It is quite a pleasing texture I suppose. Unlike that fairy bread, which was most certainly a culinary abomination."]
    ["Symmetra" [] "Exquisite! A toast to your victory!"]
    ["Junkrat" [] "Splendiferous pun!"]
    ["Symmetra" [] "I assure you, it was not intentional."]
    ["Junkrat" [] "...oh."]
    ["Symmetra" [] "..."]
    ["Junkrat" [] "Oy, geez, sorry about winnin’ the match, love. Reaper was just having a monstrous shootin’ session tonight. I think he put his big boy ghost pants on when he realized I was intentionally trying to lose."]
    ["Symmetra" [] "It is fine. Attending events such as this and getting to know people better is an important part of my work here as well."]
    ["Junkrat" [] "Yeah, socializatin’s a big part of this job. A lot bigger than I was expecting it to be when I signed up to be honest."]
    ["Symmetra" [] "Mr. Junkrat…"]
    ["Junkrat" [] "Jamie’s fine. Or whatever variation of that suits your fancy, love! Tracer calls me Jamesathan sometimes, which is weird, but I’m not about to sog up her Weetabix."]
    ["Symmetra" [] "Jamie will do nicely. Though, I will say, I’ve tried Weetabix, and it’s perfectly fine soggy."]
    ["Junkrat" [] "I’m just a boy who appreciates some crunch."]
    ["Symmetra" [] "In any case, Jamie, have you done this sort of thing with Hana and Lucio before? I’m a bit nervous. I haven’t been to an arcade like this and, I’m finding it a bit overwhelming."]
    ["Junkrat" [] "Oh thank god, I thought I was the only one that ever felt that way. It’s damn loud in here, ain’it, with the noise and the lights, all them random weird alerts going off. I love it, gets my blood pumpin’ and my ears ringin’ whenever I hang out with them, but it’s a lot to take in and by the end I always feel right burned out."]
    ["Symmetra" [] "I suppose that will make two of us then. Hana and Lucio do seem quite pleased that we came out though."]
    ["Junkrat" [] "They are! And I’m glad I came. It’s just, these days I’ve been flat out like a lizard drinking and a busy schedule’s hard to have. After a match like today’s, I get behind on me tinkering. And now devoting more time to gaming with my mates on top of that, I’m looking at twice as much time recovering from the whole thing."]
    ["Symmetra" [] "It’s good that you keep busy, at least."]
    ["Junkrat" [] "Boy do I! On top of this, I have a sweater I promised Roadie I’d knit him. Do you know how late that is? It was supposed to be a Chrissie prezzie! Christmas was 7 months ago! Granted, Roadie needs a LOT of sweater bits to keep him warm."]
    ["Symmetra" [] "I have always thought you two needed additional clothing in some of the harsher climes that we visit."]
    ["Junkrat" [] "Look who’s talking!"]
    ["Junkrat" [] "Anyway, when I feel like I’m getting behind on the things I want to do, I just always get right stressed. Finally finished that hooking dovalacky, but I’ve also got this cat powered radio-toaster multi-tool I’ve been working on for ages that’s still got a ways to go, gotta sort out my bomb stocks for next week’s match, and now this shindig. Just not enough hours in the day."]
    ["Symmetra" [] "Would it not have been better for you to take a rain check on tonight’s activities?"]
    ["Junkrat" [] "I think it’s worth it getting to see you and all. Besides, Rodie promised he’d help me calm down later. Man knows his way around a floral meditation session if you’re ever looking to unwind you should join us."]
    :-> [:lijang :junkrat :option 0]]

   [:lijang :junkrat :option 0]
   [:miranda/option
    "Symmetra" []
    "Did you make the effort just to see me?"
    "It is good that you have Roadhog to help ground you."]

   [:lijang :junkrat :option 0 0]
   [:miranda/dialogue
    ["Junkrat" [] "Oy, it wasn’t just to see you! I’ve got friends. You being here was, uh, maybe just maybe a little extra motivation."]
    ["Symmetra" [] "The effort is duly noted, Jamie."]
    ["Junkrat" [] "I mean, the tea was big part of it too.  Roadie says he’s strictly enforcing a 3 cup limit, though. I need to keep my sleep cycle consistent."]
    :-> [:lijang :junkrat 1]]

   [:lijang :junkrat :option 0 1]
   [:miranda/dialogue
    ["Junkrat" [] "Yeah. Bless that sweet boy. He’s my rock. My big mound of immovable, warm flesh. Can survive a robot’s nuclear explosion when he’s doing some deep breathing. Its freakish! In a hot way. Best of all, he smells like lilacs! You know, from all the floral meditation."]
    ["Symmetra" [] "I always did wonder how he managed to smell so nice, while at the same time being covered in dust and debris."]
    :-> [:lijang :junkrat 1]]

   [:lijang :junkrat 1]
   [:miranda/dialogue
    ["Symmrtra" [] "It must be nice to have someone like that in your life."]
    ["Junkrat" [] "He helps keep me in check, er.. Helps me try at least. Like I said, if you ever need a place to have some quiet time, you are invited to our meditation sessions. We take a break from all the chaos and find some quiet! Granted Roadie’s always pretty good with the quiet, but for me it takes some devoted concentration to shut me gob. But it’s good, it’s good. Roadie leads the session and after we have some herbal tea."]
    ["Symmetra" [] "I’ll keep that in mind! "]
    :-> [:lijang :junkrat :cutscene 1]]

   [:lijang :junkrat :cutscene 1]
   [:miranda/narration
    "Junkrat motions for Roadhog to join you at the table, and you spend some quiet time entertaining yourselves while observing the Lucio and Hana’s antics. "
    :-> [:lijang :dva :cutscene 3]]

   [:lijang :junkrat :no-date 0]
   [:miranda/narration
    "You take a seat in the corner, sipping tea and watching the Lucio and Hana’s on stream hijinks. Junkrat does not show up until quite late into the evening. He waves hello to you, and then quietly sits in the opposite corner with Roadhog, giggling at the shenanigans on the livestream. You distract yourself with your phone."
    :-> [:lijang :junkrat :no-date 1]]

   [:lijang :junkrat :no-date 1]
   [:miranda/dialogue
    ["Symmetra" [] "It’s definitely getting late."]
    :-> [:lijang :dva :cutscene 3]]

   [:lijang :dva :cutscene 3]
   [:miranda/narration
    "Suddenly, you hear a racket coming from in front of the camera.
"
    :-> [:lijang :dva 4]]

   [:lijang :dva 4]
   [:miranda/dialogue
    ["D.Va" [] "Ohhhh! These noobs just got dunked on! Now they gotta give me their lunch money!"]
    ["Lucio" [] "Everyone, it’s terrible, our heel, D.Va. Did you know that the D in D.Va actually stands for Dastardly? Well, now, after defeating some young children at video games, she’s taking their lunch money too! What say you, viewers, about this display?"]
    ["D.Va" [] "I don’t care about the viewers? I’m here for the money! Pay up!"]
    ["Lucio" [] "You heard it here, folks, D.Va has sold out! Will anyone stand up for the youths?"]
    ;; D.Va basks in the massive heat of the moment.
    ["Junkrat" [] "Oi! D.Va! I’ll take ya! "]
    ["D.Va" [] "Ha! Hardly a challenge! Why not make it a 2v1? I can take it."]
    ["Lucio" [] "Will Junkrat find a partner to take down monster heel D.Va in her reign of terror?"]
    ["Junkrat" [] "I nominate Symmetra!"]
    ["Lucio" [] "He nominates the beautiful and talented Symmetra to take D.Va on in Fighters of the Storm 2! Will she do it?"]
    ["Lucio" [] "You cool?"]
    ["Symmetra" [] "Yes. I will try."]
    ["Lucio" [] "You heard it here, folks, she’s ready to try! It’s a 2v1 match! It’s for the children, y’all!"]
    ["Junkrat" [] "I will defend your honor and your lunch money, arcade ankle biters!"]
    :-> [:lijang :dva :cutscene 4]]

   [:lijang :dva :cutscene 4]
   [:miranda/narration
    "The children give Junkrat a weird look. He shrugs it off and you both settle in to play. You assume D.Va could probably beat you two, even with this disadvantage, but you get the impression that she is taking it easy so that she does not actually have to rob these little kids of their money. You glance over to her chat, everyone is cheering for her to win. You spend a few moments considering whether or not the mob of internet strangers literally wants D.Va to rob small children before deciding it’s best not to think too hard about it. You and Junkrat manage to snag a close victory.
"
    :-> [:lijang :dva 5]]

   [:lijang :dva 5]
   [:miranda/dialogue
    ["Junkrat" [] "Explosive! Fantastic! I, uh, think that’s the first time I’ve ever won?"]
    ["Symmetra" [] "You’ve never managed to win?"]
    ["Junkrat" [] "Look, I play farming simulators and JRPGs pretty exclusively? Fighting games just aren’t in my arsenal. I can’t tell the difference between a one frame link and a neutral."]
    ["Symmetra" [] "I...see."]
    ["D.Va" [] "Well, chat, there you have it. I’m not literally robbing children. Drop some Kappas in the chat."]
    ["Symmetra" [] "Some what?"]
    ["Junkrat" [] "No idea, mate. When they talk to the chat I just smile and nod."]
    ["D.Va" [] "Alright, alright. How about some Q and A with our victors. What do you say?"]
    ["Symmetra" [] "I suppose."]
    ["Junkrat" [] "Will it be some questions from Teen Vogue?"]
    ["D.Va" [] "Of course! I even got the special retro-chic paper edition as a collectible since Lu is the beautiful cover boy this month."]
    ["Lucio" [] "Stop it! You’re making me blush!"]
    ["D.Va" [] " Anyway, this month’s quiz is “Do you want your partner to be a boyfriend, a puppy, or a comrade in overthrowing capitalism?!”"]
    ["Junkrat" [] "Oh boy!"]
    ["D.Va" [] "Question one! What do you most seek in your potential partner!"]
    :-> [:lijang :dva :quiz 1]]

   ;;TODO: Custom transitions need to be employed on all of these
   [:lijang :dva :quiz 1]
   [:miranda/option
    "Symmetra" []
    "Soft, warm fur."
    "Good pecs."
    "The ability to organize political rallies in which to engage the proletariat in the revolution."]

   [:lijang :dva 6]
   [:miranda/dialogue
    ["Junkrat" [] "Definitely fur!"]
    ["D.Va" [] "Question two! When in bed with your partner, where do they lie?"]
    :-> [:lijang :dva :quiz 2]]

   [:lijang :dva :quiz 2]
   [:miranda/option
    "Symmetra" []
    "At the foot of the bed."
    "Right beside you, gazing into your eyes."
    "Next to the seized means of production."]

   [:lijang :dva 7]
   [:miranda/dialogue
    ["Junkrat" [] "Right next ta me!"]
    ["D.Va" [] "Final question! What sort of birthday gift would you want from your partner?"]
    :-> [:lijang :dva :quiz 3]]

   [:lijang :dva :quiz 3]
   [:miranda/option
    "Symmetra" []
    "A thoughtful item reflecting their careful attention to your wants and interests."
    "A gently used tennis ball."
    "A hammer and sickle."]

   [:lijang :dva 8]
   [:miranda/dialogue
    ["Junkrat" [] "Oh, a tough one. I think I’m going to have to go with the tools."]
    ["D.Va" [] "Alright! Lemme tally up the results. "]
    ["D.Va" [] "Jamie! It seems like you want a human that is metaphorically a communist dog, a dog that is metaphorically a communist human, or something in between that is literally a communist human-dog hybrid."]
    ["Lucio" [] "RIP Nina Tucker, y’all."]
    ["D.Va" [] "Lucio, it’s still too early to joke about that."]
    ["Lucio" [] "I hear ya."]
    :-> []] ;; conditional transition

   [:lijang :dva :quiz :boyfriend]
   [:miranda/dialogue
    ["D.Va" [] "And Symmetra! You want a boyfriend!"]
    ["Junkrat" [] "Ehehehe."]
    ["Symmetra" [] "Hush!"]
    :-> [:lijang :dva 9]]

   [:lijang :dva :quiz :puppy]
   [:miranda/dialogue
    ["D.Va" [] "And it looks like Symmetra wants a puppy!"]
    ["Junkrat" [] "A strong choice."]
    ["Symmetra" [] "A obedient hound would be fun."]
    :-> [:lijang :dva 9]]

   [:lijang :dva :quiz :commie]
   [:miranda/dialogue
    ["D.Va" [] "Symmetra! Aww! You want a comrade in the revolution!"]
    ["Junkrat" [] "Frankly, I’m embarrassed I didn’t get that."]
    ["Symmetra" [] "Capitalism is too disorderly for my taste."]
    :-> [:lijang :dva 9]]

   [:lijang :dva :quiz :nina]
   [:miranda/dialogue
    ["D.Va" [] "Symmetra apparently wants the same thing! That’s kinda romantic!"]
    ["Symmetra" [] "No."]
    ["Junkrat" [] "I like romance, but yeah, no."]
    ["D.Va" [] "Wow. I kinda feel attacked right now?"]
    ["Junkrat" [] "Eheheheh."]
    :-> [:lijang :dva 9]]

   [:lijang :dva 9]
   [:miranda/dialogue
    ["D.Va" [] "Well! Now we’ve met the champs! But we gotta vacate the premises immediately! We’re getting awkward looks from management after almost mugging children! Thank you! Good night! Love, D.Va!"]
    :-> [:lijang :cutscene 5]]

   [:lijang :cutscene 5]
   [:miranda/narration
    "Everyone in the room helps management clean up the establishment. Before leaving, Junkrat comes up to you to say good-bye."
    :-> [:lijang :dva 10]]

   [:lijang :dva 10]
   [:miranda/dialogue
    ["Junkrat" [] "Hey! Uh! I just wanted to thank ya for coming out! Good seeing you, and cheers to our mutual fighting game victory!"]
    ["Symmetra" [] "Ah! Thank you. I’m glad I could help you save those children from being robbed live on a gaming website for all to see."]
    ["Junkrat" [] "Ehehehe. Yeah. Well, I, uh, can’t dawdle. Roadie’s trying to catch this American livestream of puppies, and it’s almost dinner time for them! We can’t miss it! Good night!"]
    ["Symmetra" [] "Good night!"]
    :-> [:lijang :dva :cutscene :final]]

   [:lijang :dva :cutscene :final]
   [:miranda/narration
    "You manage to find your way back through the dense maze of streets and make it safely  to your hotel. Your jam packed day was quite exhausting and you welcome the soft embrace of your bed.  You awaken the next morning feeling slightly better after a good night’s rest. Upon checking your phone you discover a long string of text messages from D.Va thanking you profusely for your participation in yesterday’s live stream and complimenting your nascent fighting game skills. At the end of the messages is included a screencap that a viewer had taken of the stream."
    :-> [:eichenwalde :intro]]})
