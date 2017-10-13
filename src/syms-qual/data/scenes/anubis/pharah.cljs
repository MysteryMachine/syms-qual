(ns syms-qual.data.scenes.anubis.pharah)

(def start-date
  [:transition :miranda/mutation->basic
   [[:-> [:anubis :pharah :confirm]]
    (fn []
      ;;TODO: mutate state to indicate date
      )]])

(def data
  {[:anubis :pharah 0]
   [:miranda/dialogue
    ["Symmetra" [] "Greetings! It is good to see you again, Fareeha! Are you excited for todays match?"]
    ["Pharah" [] "Hehe, yeah… something like that… you know… It feels pretty weird being here…. You think you know what it’s gonna be like but then….There’s that lingering familiarity but it’s not the same…"]
    ["Symmetra" [] "I’m not sure I understand…."]
    ["Pharah" [] "You know I’m just not quite sure I’m ready to… you know… ummm… be uh, fighting! Yeah, fighting so close to home. It’s strange…. You wanna, uh, get that coffee? We’ve got some time before the match starts and I know a great cafe around the corner from here."]
    ["Symmetra" [] "Is the match not starting soon?"]
    ["Pharah" [] "Well. Yes."]
    ["Symmetra" [] "Are you suggesting truancy, Miss Amari?"]
    ["Pharah" [] "I mean. We’ll just go there and back! We’ll have enough time to join the team in the second phase of the first point."]
    ["Symmetra" [] "I’m only qualifying, Miss Amari, would it not reflect poorly on my employer and I if I were to miss part of my second match?"]
    ["Pharah" [] "It’d mean a lot to me."]
    :-> [:anubis :pharah :option 0]]

   [:anubis :pharah :option 0]
   [:miranda/option
    "Symmetra" []
    "Are you saying this is a date, Miss Amari?"
    "Am I to take it that this excursion is for purposes other than our job as Overwatch agents?"]

   [:anubis :pharah :option 0 0]
   [:miranda/dialogue
    ["Pharah" [] "If that’s what you want!"]
    ["Symmetra" [] "Adorable. I would most certainly enjoy escorting you, but I cannot promise that I will be able to shirk my duties for our excursion."]
    :-> [:anubis :pharah :choice]]

   [:anubis :pharah :choice]
   [:miranda/text-option
    "What will you do?"
    ["Get coffee with Pharah" (constantly true) start-date]
    ["Converse with your other teammates" (constantly true)
     [:-> [:anubis :pharah :goodbye]]]]

   [:anubis :pharah :goodbye]
   [:miranda/dialogue
    ["Symmetra" [] "Well, I’ve considered it, and as long as you assure me we will return quickly, I can’t see how it will do much harm."]
    :-> [:anubis :date-start]]

   [:anubis :pharah :confirm]
   [:miranda/dialogue
    ["Pharah" [] "Well, if you do decide to give things a shot, let me know."]
    :-> [:anubis :choice]]

   [:anubis :date-start]
   [:miranda/dialogue
    ["Pharah" [] "Oh? Oh my god, yes! I mean."]
    ["Pharah" [] "I mean, sure!"]
    ["Reinhardt" [] "You go on your date, Fareeha! Zarya and I will be sure to ensure victory!"]
    ["Zarya" [] "Fareeha, be sure to convince young lady to join our training regimen. Is important to build muscle as to hold bigger gun. Her gun is too puny."]
    ["Pharah" [] "You two! Geez!"]
    ["Pharah" [] "I’m leaving now."]
    ["Reinhardt" [] "Your mama will be so pleased you took her advice!"]
    ["Pharah" [] "REINHARDT!"]
    :-> [:anubis :date :cutscene 0]]

   [:anubis :date :cutscene 0]
   [:miranda/narration
    "After some adorably awkward hemming and hawing, Pharah gathers you into her arms, and jump jets up into the sky. The aerial view of the the city is quite breathtaking, though you are not entirely sure whether it is the scenery or your proximity to Fareeha that has left you short of breath. After a short flight, the two of you descend back to earth a few blocks away, just outside a small cafe. 
"
    :-> [:karkade 0]]

   [:karkade 0]
   [:miranda/dialogue
    ["Pharah" [] "I’ll go in! I’ll be back in just a minute!"]
    ["Symmetra" [] "I’ll wait here!"]
    ["" [] "Pharah comes back after a few minutes with two cups, and hands one to you."]
    ["Pharah" [] "I got us both karkade, I hope you like it!"]
    ["Symmetra" [] "Oh? I was expecting coffee."]
    ["Pharah" [] "I figured this would be more refreshing and I wanted to make sure you would have something delicious, since you took a risk to come out here with me."]
    ["Symmetra" [] "Well, thank you, Miss Amari. It’s a lovely color."]
    ["Pharah" [] "The pink compliments the blue of your dress quite nicely! Here, give me your phone.  "]
    ["Symmetra" [] "What a nice photo! Your self-photography skills are impressive!"]
    ["Pharah" [] "I mean, I grew up with Jesse so I’d be pretty embarrassed if they weren't."]
    ["Symmetra" [] "This is quite good!"]
    ["Pharah" [] "It’s one of my favorites. I always drank it in the summers when I was little."]
    ["Symmetra" [] "That’s right, this is your hometown isn’t it?"]
    ["Pharah" [] "Well yes and no. You never really stay in one place too long in a military family."]
    ["Symmetra" [] "Ah, yes. You’ve been around Overwatch basically your whole life haven’t you? I’m sure you have many interesting stories."]
    ["Pharah" [] "Eh. It was whatever. Military families are tough."]
    :-> [:karkade :option 0]]

   [:karkade :option 0]
   [:miranda/option
    "Symmetra" []
    "I feel like I have struck a nerve. Should we discuss something else?"
    "You make light of it, but it sounds like it must have been a stressful environment as a child."]

   [:karkade :option 0 0]
   [:miranda/dialogue
    ["Pharah" [] "Oh, no. Growing up in Overwatch was fine. I guess I’m just avoiding a ghost from my past, right now."]
    ["Symmetra" [] "Reaper?"]
    ["Pharah" [] "Oh, no, no. "]
    ["Pharah" [] "Don’t worry about that. You’re Overwatch now too, so if we’re going to have a future together, it’s maybe important that you learn about its past."]
    ["Symmetra" [] "A future together?"]
    ["Pharah" [] "As agents! Um. Yeah."]
    :-> [:karkade 1]]

   [:karkade :option 0 1]
   [:miranda/dialogue
    ["Pharah" [] "Look, if it was tough, I came out of it even tougher. I’ve always dreamed of being a soldier, and I’m happy to be one now."]
    ["Symmetra" [] "So why are avoiding the mission to have coffee?"]
    ["Pharah" [] "If my life in the military has taught me anything it’s that you must strike decisively! This date is bold move but a risk worth taking! Our team is gonna kill us! But, I think it was worth it."]
    ["Symmetra" [] "It seems like your time in Overwatch taught you recklessness more than bravery."]
    ["Pharah" [] "Haha, reckless in love as in the battlefield."]
    :-> [:karkade 1]]

   [:karkade 1]
   [:miranda/dialogue
    ["Symmetra" [] "You’re a cute one, Ms. Amari. "]
    ["Pharah" [] "Hehe, I’m trying my best. I’m glad you’ve joined our ranks. Overwatch has a long and storied history that I’m excited to finally officially be a part of. I think you’ll like it here too. "]
    ["Symmetra" [] "I certainly hope so."]
    ["Pharah" [] "But, um, stories! You wanted to hear stories, right? If its stories you want, I’ve got some but they’re probably not as exciting as you might think. What they do include, however, are cute photos of baby Pharah!"]
    ["Symmetra" [] "Sure!"]
    ["Pharah" [] "Here is Reaper teaching me how to roller skate."]
    ["Symmetra" [] "Ha! Those shorts!"]
    ["Pharah" [] "Gabe has legs like a rhino. He’s 100% beef."]
    ["Symmetra" [] "Absolutely! I’m surprised he padded you this heavily."]
    ["Pharah" [] "That was mom’s request. Though, I suppose the influence was a good one. Heavy padding in the past prepared me for my heavily armored future?"]
    ["Symmetra" [] "Hum, a cute concept, but I don’t quite think things work that way."]
    ["Pharah" [] "You’d be surprised! Okay, another one. Um, here’s Jack teaching me to golf."]
    ["Symmetra" [] "Hum. Heavily padded again."]
    ["Pharah" [] "Ha ha ha. Um. Mother was concerned about stray golf balls hitting me. Um, um. Here! Torbjorn cheering me on in matheletes!"]
    ["Symmetra" [] "I did not know you wore glasses!"]
    ["Pharah" [] "I did not. They are, um, Gunnars. You know. The ones meant to protect eyes from glare."]
    ["Symmetra" [] "Ana protecting you from the glare of the computer monitor."]
    ["Pharah" [] "Um. Yeah. Um, um, um. Here! This one has a good story too!"]
    ["Symmetra" [] "Soldier 76 is making out with Reaper...are...are they bleeding?"]
    ["Pharah" [] "This was the day they came out to us! If you want a slice of Overwatch history, this is something you can’t get from the history books."]
    ["Symmetra" [] "This seems like a relatively private matter, but if you insist. I’m quite surprised to discover how many of the agents here are gossips."]
    ["Pharah" [] " It’s relevant! Jack and Gabriel’s relationship was the bedrock of our big messy family. With the constant traveling and changing scenery, their stable loving relationship gave us something to come back to. "]
    ["Symmetra" [] "The passion does not seem to have died down."]
    ["Pharah" [] " Those two certainly have not lost their edge. So, it all started when Gabriel decided it was time to come out to us. The way he tells it, he decided the only proper way for them to come out, was with a public test of love."]
    ["Symmetra" [] "I suppose it’s not surprising that he would find a way to make even something intended to be romantic into some form of competition. "]
    ["Pharah" [] "Heh, of course. So, to make sure everyone would be around to see it, he came up with some excuse about mission to go pacify some rival gangs or something. I don’t really remember, mother just tells me it sounded fishy."]
    ["Pharah" [] " Gabe sent Jack to rough up some local hooligans, and told him to rendezvous back at the safe house we were all holed up in. Gabe heads off in some other direction soon after."]
    ["Pharah" [] "We wait around for them. Jack reports a success on his end, and fifteen minutes later,we suddenly get a distress signal from Gabe. "]
    ["Pharah" [] " The remaining agents decided they needed to search for him, so they leave me behind with Torbjorn’s turret for protection. None of the gang members had rockets or sniper rifles, so a Torbjorn turret was literally the safest place to be."]
    ["Ana" [] "Fareeha, stay inside, stay safe. Do not open this door for anyone. If someone shoots at the turret, take this hammer and just, like, smack it, ok?"]
    ["Pharah"  [] "Will Gabe be ok, mama?"]
    ["Ana" [] "He will be fine, sweetie. I even promise he will survive the brutal verbal beat down he will be receiving for making us worry."]
    ["Pharah" [] "So I’m in this house, sitting on the turret looking out the tiny barred up window, and I see Jack run up to my mom and as soon as he’s is within earshot he launches into this overdramatic tirade demanding to know where Gabriel is. "]
    ["Pharah" [] "Everyone is trying to get him to calm down but he is not having any of it. They are all starting to get heated, arguing about what to do when I see just this streak of color moving across the square that’s barreling towards them. "]
    ["Pharah" [] "And as this is happening I can see the light bulbs going off in Jack’s head as he realizes that the man running through the plaza has a bloody Blackwatch uniform clenched in his hand."]
    ["Symmetra" [] "Oh dear."]
    ["Pharah" [] "So Jack gets a good few punches in, before knocking off the man’s mask. Lo and behold, it was Gabe?"]
    ["Pharah" [] "Jack was furious. He demanded to know why Reaper would such a cruel joke. Mama made some comment about how boys are always playing stupid pranks, and that prompts Jack to start an entire tirade about how Gabe is more than just some locker buddy to him."]
    ["Pharah" [] "Gabe grabs, and looks him dead in the eye. He tells him he could not love a man who wasn’t willing to go to the furthest extremes for him. He looks Jack dead in the eyes, tears welling up, and he dramatically tells him, “you passed.”"]
    ["Pharah" [] "And I kid you not, they make out, immediately, bloody nose and all. "]
    ["Pharah" [] " And that was his test of love? Would you angrily beat up a gang member if they were holding me hostage or something?"]
    ["Symmetra" [] "Maybe he specifically is into men that are willing to commit war crimes in his name?"]
    ["Pharah" [] "...that might explain why Overwatch had to be disbanded."]
    ["Symmetra" [] "Well, we will do our best to avoid romantic gestures that might end this current iteration of Overwatch."]
    ["Pharah" [] " Deal!"]
    ["Pharah" [] "But if you take away the weird aggro makeouts, it was actually a formative moment for me."]
    ["Symmetra" [] "Formative? How so? It sounds like a funny story one might tell, but formative is not a word that comes to mind."]
    ["Pharah" [] "Well, when your mother is so protective, it can feel difficult to do what’s unexpected. I spent a lot of time bottling up my feelings for girls because I thought it’d prompt mom to add yet another layer of padding to my life."]
    ["Pharah" [] "Gabriel was the first person I ever came out to. He told me,"]
    ["Gabe" [] "Don’t let ANYONE tell you that you can’t be the biggest, toughest homo ever. "]
    ["Symmetra" [] "That is sweet."]
    ["Pharah" [] "Granted, he was projecting himself onto me, but I’d like to think I followed his advice."]
    ["Symmetra" [] "That certainly sounds like Reaper, from what little I know of him…"]
["Pharah" [] "It sure does…."]
    ["Symmetra" [] "Thank you for opening up to me, Ms. Amari. Do you feel like this is an appropriate time to head back?"]
    ["Pharah" [] "Jeepers! We’re late. Oh, geez, Satya, I’m so sorry. I promised you we’d be back quickly. The offensive round of the match is probably over by now."]
    ["Symmetra" [] "Let us work hard, to make up for it. I would like to put up a strong show for the second half in order to compensate. Defense is my specialty after all."]
    :-> [:karkade :cutscene 1]]

   [:karkade :cutscene 1]
   [:miranda/narration
    "Your team’s offense had apparently been stifled rather quickly, going four versus six. Mercy was quite visibly upset, and shot some nasty looks at Pharah, who was incapable of returning eye contact. The rest of the team did not seem to mind much though. Genji was quietly aloof and Reinhardt and Zarya’s drunken teasing about your romantic getaway occupied much more of the conversation than the upcoming defense. You all held the first objective until overtime, and it seemed like the match might go the way of a tie, but a well placed scatter arrow eliminated you, your teleporter, and your team’s hopes of further contesting the point."
    :-> [:volskaya :intro]]})


