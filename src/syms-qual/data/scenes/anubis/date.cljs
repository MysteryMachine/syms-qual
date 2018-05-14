(ns syms-qual.data.scenes.anubis.date
  (:require [carmen.util :as anim :refer [scoot]]
            [syms-qual.util :as util :refer [inc-transition]]))

(def data
  {[:spawn :pharah :date-start]
   [:miranda/dialogue
    ["Pharah" [[:symmetra :_smile (scoot 0)] [:pharah :_determined (scoot -10)]]
     "Oh? Oh my god, yes! I mean."]
    ["Pharah" [[:pharah :_embarassed (scoot -10)] [:symmetra :_smile (scoot 0)]]
     "I mean, sure!"]
    ["Reinhardt" [[:zarya_rein :_hello (scoot -100 -20 1)] [:pharah :_neutralBackBlush (scoot -10 50 1)] [:symmetra :_smile (scoot 0 60 1)]]
     "You go on your date, Fareeha! Zarya and I will be sure to ensure victory!"]
    ["Zarya" [[:zarya_rein :_explain (scoot -20)] [:pharah :_neutralBackBlush (scoot 50)]]
     "Fareeha, be sure to convince young lady to join our training regimen. Is important to build muscle as to hold bigger gun. Her gun is too puny."]
    ["Pharah" [[:zarya_rein :_neutralRight (scoot -20)] [:pharah :_geez (scoot 50)]]
     "You two! Geez!"]
    ["Pharah" [[:zarya_rein :_neutralRight (scoot -20)] [:pharah :_embarassedBack (scoot 50)]]
     "I’m leaving now."]
    ["Reinhardt" [[:zarya_rein :_pleased (scoot -20)] [:pharah :_neutralBackBlush (scoot 50)]]
     "Your mama will be so pleased you took her advice!"]
    ["Pharah" [[:zarya_rein :_pleased (scoot -20)] [:pharah :_embarassedAngryBack (scoot 50)]]
     "REINHARDT!"]
    :-> [:pharah-a :cutscene]]

   [:pharah-a :cutscene]
   [:miranda/characters
    [[]]
    :-> [:pharah-a :cutscene :text]]

   [:pharah-a :cutscene :text]
   [:miranda/narration
    "After some adorably awkward hemming and hawing, Pharah gathers you into her arms, and jump jets up into the sky. It is a bit alarming being so high without so much as a safety harness, but you grip your arms tightly around her neck and try your best to divert your focus towards literally anything other than the distance which you are from the ground. After a short flight, the two of you descend back to earth a few blocks away, just outside a small cafe."
    :-> [:cafe 0]]

   [:cafe 0]
   [:miranda/dialogue
    ["Pharah" [[:pharah :_smile (scoot -110 -10 1)] [:symmetra :_smile (scoot -100 0 1)]]
     "I’ll go in! I’ll be back in just a minute!"]
    ["Symmetra" [[:pharah :_neutralBack (scoot -10 -100 2)] [:symmetra :_helloWarm (scoot 0)]]
     "I’ll wait here!"]
    ["Symmetra" [[:symmetra :_thinking (scoot 0)]]
     "I really hope we return in time for the match."]
    ["Pharah" [[:pharah :_karkadeTalk (scoot -100 -10 1)] [:symmetra :_smile (scoot 0)]]
     "I got us both karkade, I hope you like it!"]
    ["Symmetra" [[:pharah :_karkadeHold (scoot -10)] [:symmetra :_karkadeTalk (scoot 0)]]
     "Oh?"]
    ["Pharah" [[:pharah :_karkadeTalk (scoot -10)] [:symmetra :_karkadeHold (scoot 0)]]
     "I figured this would be more refreshing and I wanted to make sure you would have something delicious, since you took a risk to come out here with me."]
    ["Symmetra" [[:pharah :_karkadeDown (scoot -10)] [:symmetra :_karkadeTalk (scoot 0)]]
     "Well, thank you, Miss Amari. It’s a lovely color."]
    ["Pharah" [[:pharah :_karkadeEmbarassed (scoot -10)] [:symmetra :_karkadeSmile (scoot 0)]]
     "Okay! People on dates take food selfies, right? Here, give me your phone."]
    :-> [:cafe 0 0 :show]]

   [:cafe 0 0 :show]
   [:miranda/characters
    [[[:photos :_pharahDate1] [:phones :_symHand]]]
    :-> [:cafe 0 1]]

   [:cafe 0 1]
   [:miranda/dialogue
    ["Symmetra" [[:photos :_pharahDate1] [:phones :_symHand]]
     "What a nice photo! Your self-photography skills are impressive!"]
    ["Pharah" [[:photos :_pharahDate1] [:phones :_symHand]]
     "I mean, I grew up with Jesse so I’d be pretty embarrassed if they weren't."]
    ["Symmetra" [[:pharah :_karkadeHold (scoot -10)] [:symmetra :_karkade-Drink (scoot 0)]]
     "This is quite good!"]
    ["Pharah" [[:pharah :_karkadeDrink (scoot -10)] [:symmetra :_karkadeDown (scoot 0)]]
     "It’s one of my favorites. I always drank it in the summers when I was little."]
    ["Symmetra" [[:pharah :_karkadeHold (scoot -10)] [:symmetra :_karkadeTalk (scoot 0)]]
     "That’s right, this is your hometown isn’t it?"]
    ["Pharah" [[:pharah :_karkadeTalk (scoot -10)] [:symmetra :_karkadeSmile (scoot 0)]]
     "Well yes and no. You never really stay in one place too long in a military family."]
    ["Symmetra" [[:pharah :_karkadeDrink (scoot -10)] [:symmetra :_karkadeBlush (scoot 0)]]
     "Ah, yes. You’ve been around Overwatch basically your whole life haven’t you? I’m sure you have many interesting stories."]
    ["Pharah" [[:pharah :_karkadeUncomfortable (scoot -10)] [:symmetra :_karkadeDown (scoot 0)]]
     "Eh. It was whatever. Military families are tough."]
    :-> [:cafe :option 0]]

   [:cafe :option 0]
   [:miranda/option
    "Symmetra" [[:pharah :_karkadeUncomfortable (scoot -10)] [:symmetra :_karkadeConcerned (scoot 0)]]
    "I feel like I have struck a nerve. Should we discuss something else?"
    "You make light of it, but it sounds like it must have been a stressful environment as a child."]

   [:cafe :option 0 0]
   [:miranda/dialogue
    ["Pharah" [[:pharah :_karkadeExplainUnsure (scoot -10)] [:symmetra :_karkadeHold (scoot 0)]]
     "Oh, no. Growing up in Overwatch was fine. I guess I’m just avoiding a ghost from my past, right now."]
    ["Symmetra" [[:pharah :_karkadeHold (scoot -10)] [:symmetra :_karkade-Drink (scoot 0)]]
     "Reaper?"]
    ["Pharah" [[:pharah :_karkadeLaugh (scoot -10)] [:symmetra :_karkadeSmile (scoot 0)]]
     "Oh, no, no. "]
    ["Pharah" [[:pharah :_karkadeBold (scoot -10)] [:symmetra :_karkadeSmile (scoot 0)]]
     "Don’t worry about that. You’re Overwatch now too, so if we’re going to have a future together, it’s maybe important that you learn about its past."]
    ["Symmetra" [[:pharah :_karkadeHold (scoot -10)] [:symmetra :_karkadeBlush (scoot 0)]]
     "A future together?"]
    ["Pharah" [[:pharah :_karkadeEmbarassed (scoot -10)] [:symmetra :_karkadeBlush (scoot 0)]]
     "As agents! Um. Yeah."]
    :-> [:cafe 1]]

   [:cafe :option 0 1]
   [:miranda/dialogue
    ["Pharah" [[:pharah :_karkadeExplainConfident (scoot -10)] [:symmetra :_karkadeHold (scoot 0)]]
     "Look, if it was tough, I came out of it even tougher. I’ve always dreamed of being a soldier, and I’m happy to be one now."]
    ["Symmetra" [[:pharah :_karkadeHold (scoot -10)] [:symmetra :_karkade-Drink (scoot 0)]]
     "So why are we avoiding the mission to have coffee?"]
    ["Pharah" [[:pharah :_karkadeBold (scoot -10)] [:symmetra :_karkadeHold (scoot 0)]]
     "If my life in the military has taught me anything it’s that you must strike decisively! This date is bold move but a risk worth taking! Our team is gonna kill us! But, I think it was worth it."]
    ["Symmetra" [[:pharah :_karkadeHold (scoot -10)] [:symmetra :_karkadeConcerned (scoot 0)]]
     "It seems like your time in Overwatch taught you recklessness more than bravery."]
    ["Pharah" [[:pharah :_karkadeLaugh (scoot -10)] [:symmetra :_karkadeBlush (scoot 0)]]
     "Haha, reckless in love as in the battlefield."]
    :-> [:cafe 1]]

   [:cafe 1]
   [:miranda/dialogue
    ["Symmetra" [[:pharah :_karkadeHold (scoot -10)] [:symmetra :_karkadeTalk (scoot 0)]]
     "You’re a cute one, Ms. Amari. "]
    ["Pharah" [[:pharah :_karkadeBold (scoot -10)] [:symmetra :_karkade-Drink (scoot 0)]]
     "Hehe, I’m trying my best. I’m glad you’ve joined our ranks. Overwatch has a long and storied history that I’m excited to finally officially be a part of. I think you’ll like it here too. "]
    ["Symmetra" [[:pharah :_karkadeHold (scoot -10)] [:symmetra :_karkadeSmile (scoot 0)]]
     "I certainly hope so."]
    ["Pharah" [[:pharah :_karkadeEmbarassed (scoot -10)] [:symmetra :_karkadeHold (scoot 0)]]
     "But, um, stories! You wanted to hear stories, right? If its stories you want, I’ve got some but they’re probably not as exciting as you might think. What they do include, however, are cute photos of baby Pharah!"]
    ["Symmetra" [[:pharah :_karkadeHold (scoot -10)] [:symmetra :_karkadeTalk (scoot 0)]]
     "Sure!"]
    :-> [:cafe 1 0 :show]]

   [:cafe 1 0 :show]
   [:miranda/characters
    [[[:photos :_rollerSkate] [:phones :_pharahHand]]]
    :-> [:cafe 1 0]]

   [:cafe 1 0]
   [:miranda/dialogue
    ["Pharah" [[:photos :_rollerSkate] [:phones :_pharahHand]]
     "Here is Reaper teaching me how to roller skate."]
    ["Symmetra" [[:photos :_rollerSkate] [:phones :_pharahHand]]
     "Ha! Those shorts!"]
    ["Pharah" [[:photos :_rollerSkate] [:phones :_pharahHand]]
     "Gabe has legs like a rhino. He’s 100% beef."]
    ["Symmetra" [[:photos :_rollerSkate] [:phones :_pharahHand]]
     "Absolutely! I’m surprised he padded you this heavily."]
    ["Pharah" [[:photos :_rollerSkate] [:phones :_pharahHand]]
     "That was mom’s request. Though, I suppose the influence was a good one. Heavy padding in the past prepared me for my heavily armored future?"]
    ["Symmetra" [[:photos :_rollerSkate] [:phones :_pharahHand]]
     "Hum, a cute concept, but I don’t quite think things work that way."]
    ["Pharah" [[:photos :_rollerSkate] [:phones :_pharahHand]]
      "You’d be surprised!"]
    :-> [:cafe 1 1 :show]]

   [:cafe 1 1 :show]
   [:miranda/characters
    [[[:photos :_golf] [:phones :_pharahHand]]]
    :-> [:cafe 1 1]]

   [:cafe 1 1]
   [:miranda/dialogue
    ["Pharah" [[:photos :_golf] [:phones :_pharahHand]]
     "Okay, another one. Um, here’s Jack teaching me to golf."]
    ["Symmetra" [[:photos :_golf] [:phones :_pharahHand]]
     "Hum. Heavily padded again."]
     ["Pharah" [[:photos :_golf] [:phones :_pharahHand]]
      "Ha ha ha. Um. Mother was concerned about stray golf balls hitting me."]
    :-> [:cafe 1 2 :show]]

   [:cafe 1 2 :show]
   [:miranda/characters
    [[[:photos :_mathletes] [:phones :_pharahHand]]]
    :-> [:cafe 1 2]]

   [:cafe 1 2]
   [:miranda/dialogue
    ["Pharah" [[:photos :_mathletes] [:phones :_pharahHand]]
     "Um, um. Here! Torbjorn cheering me on in matheletes!"]
    ["Symmetra" [[:photos :_mathletes] [:phones :_pharahHand]]
     "I did not know you wore glasses!"]
    ["Pharah" [[:photos :_mathletes] [:phones :_pharahHand]]
     "I did not. They are, um, Gunnars. You know. The ones meant to protect eyes from glare."]
    ["Symmetra" [[:photos :_mathletes] [:phones :_pharahHand]]
     "Ana protecting you from the glare of the computer monitor."]
    :-> [:cafe 1 3 :show]]

   [:cafe 1 3 :show]
   [:miranda/characters
    [[[:photos :_familyPhoto] [:phones :_pharahHand]]]
    :-> [:cafe 1 3]]

   [:cafe 1 3]
   [:miranda/dialogue
    ["Pharah" [[:photos :_familyPhoto] [:phones :_pharahHand]]
     "Um. Yeah. Um, um, um. Here! This one has a good story too!"]
    ["Symmetra" [[:photos :_familyPhoto] [:phones :_pharahHand]]
     "Oh what a cute family photo. Wait, is Reinhardt crying? And is that Reaper, and is he bleeding? What is happening in this photo?"]
    ["Pharah" [[:photos :_familyPhoto] [:phones :_pharahHand]]
     "This was the day Jack and Gabe came out to us! If you want a slice of Overwatch history, this is something you can’t get from the history books."]
    ["Symmetra" [[:photos :_familyPhoto] [:phones :_pharahHand]]
     "This seems like a relatively private matter, but if you insist. I’m quite surprised to discover how many of the agents here are gossips."]
    ["Pharah" [[:photos :_familyPhoto] [:phones :_pharahHand]]
     "It’s relevant! Jack and Gabriel’s relationship was the bedrock of our big messy family. With the constant traveling and changing scenery, their stable loving relationship gave us something to come back to. "]
    ["Symmetra" [[:photos :_familyPhoto] [:phones :_pharahHand]]
     "The passion does not seem to have died down."]
    ["Pharah" [[:photos :_familyPhoto] [:phones :_pharahHand]]
     "Those two certainly have not lost their edge. So, it all started when Gabriel decided it was time to come out to us. The way he tells it, he decided the only proper way for them to come out, was with a public test of love."]
    ["Symmetra" [[:photos :_familyPhoto] [:phones :_pharahHand]]
     "I suppose it’s not surprising that he would find a way to make even something intended to be romantic into some form of competition. "]
    ["Pharah" [[:photos :_familyPhoto] [:phones :_pharahHand]]
     "Heh, of course. So, to make sure everyone would be around to see it, he came up with some excuse about mission to go pacify some rival gangs or something. I don’t really remember, mother just tells me it sounded fishy."]
    :-> [:flashback 0]]

   [:flashback 0]
   [:miranda/dialogue
    ["Pharah" [[:jack :_waiting]]
     "Gabe sent Jack to rough up some local hooligans, and told him to rendezvous back at the safe house we were all holed up in. Gabe heads off in some other direction soon after."]
    ["Pharah" [[:jack :_coms]]
     "We wait around for them. Jack reports a success on his end, and fifteen minutes later,we suddenly get a distress signal from Gabe. "]
    ["Pharah" [[:jack :_turretSit]]
     "The remaining agents decided they needed to search for him, so they leave me behind with Torbjorn’s turret for protection. None of the gang members had rockets or sniper rifles, so a Torbjorn turret was literally the safest place to be."]
    ["Ana" [[:jack :_turretHammer]]
     "Fareeha, stay inside, stay safe. Do not open this door for anyone. If someone shoots at the turret, take this hammer and just, like, smack it, ok?"]
    ["Pharah"  [[:jack :_ok]]
     "Will Gabe be ok, mama?"]
    ["Ana" [[:jack :_fine]]
     "He will be fine, sweetie. I even promise he will survive the brutal verbal beat down he will be receiving for making us worry."]
    ["Pharah" [[:jack :_where]]
     "So I’m in this house, sitting on the turret looking out the tiny barred up window, and I see Jack run up to my mom and as soon as he’s is within earshot he launches into this overdramatic tirade demanding to know where Gabriel is. "]
    ["Pharah" [[:jack :_overreacting]]
     "Everyone is trying to get him to calm down but he is not having any of it. They are all starting to get heated, arguing about what to do when I see just this streak of color moving across the square that’s barreling towards them. "]
    ["Pharah" [[:jack :_lightbulb]]
     "And as this is happening I can see the light bulbs going off in Jack’s head as he realizes that the man running through the plaza has a bloody Blackwatch uniform clenched in his hand."]
    ["Symmetra" [[:jack :_lightbulb]]
     "Oh dear."]
    ["Pharah" [[:jack :_punch]]
     "So Jack gets a good few punches in, before knocking off the man’s mask. Lo and behold, it was Gabe?"]
    ["Pharah" [[:jack :_overreacting2]]
     "Jack was furious. He demanded to know why Reaper would such a cruel joke. Mama made some comment about how boys are always playing stupid pranks, and that prompts Jack to start yelling about how Gabe is more than just some locker buddy to him."]
    ["Pharah" [[:jack :_speech]]
     "Gabe grabs Jack and tells him he could not love a man who wasn’t willing to go to the furthest extremes for him and that this had all been a test of his devotion. He looks Jack dead in the eyes, tears welling up, and he dramatically tells him, “you passed.”"]
    ["Pharah" [[:jack :_smooch]]
     "And I kid you not, they made out, immediately, bloody nose and all. "]
    :-> [:cafe 2]]

   [:cafe 2]
   [:miranda/dialogue
    ["Pharah" [[:pharah :_karkadeExplainUnsure (scoot -10)] [:symmetra :_karkadeHold (scoot 0)]]
     "And that was his test of love? Would you angrily beat up a gang member if they were holding me hostage or something?"]
    ["Symmetra" [[:pharah :_karkadeHold (scoot -10)] [:symmetra :_karkadeConcerned (scoot 0)]]
     "Maybe he is specifically into men that are willing to commit war crimes in his name?"]
    ["Pharah" [[:pharah :_karkadeDrink (scoot -10)] [:symmetra :_karkadeDown (scoot 0)]]
     "...that might explain why Overwatch had to be disbanded."]
    ["Symmetra" [[:pharah :_karkadeHold (scoot -10)] [:symmetra :_karkadeLaugh (scoot 0)]]
     "Well, we will do our best to avoid romantic gestures that might end this current iteration of Overwatch."]
    ["Pharah" [[:pharah :_karkadeLaugh (scoot -10)] [:symmetra :_karkade-Drink (scoot 0)]]
     "Deal!"]
    ["Pharah" [[:pharah :_karkadeExplainUnsure (scoot -10)] [:symmetra :_karkadeHold (scoot 0)]]
     "But if you take away the weird aggro makeouts, it was actually a formative moment for me."]
    ["Symmetra" [[:pharah :_karkadeDrink (scoot -10)] [:symmetra :_karkadeConcerned (scoot 0)]]
     "Formative? How so? It sounds like a funny story one might tell, but formative is not a word that comes to mind."]
    ["Pharah" [[:pharah :_karkadeBold (scoot -10)] [:symmetra :_karkadeHold (scoot 0)]]
     "Well, when your mother is so protective, it can feel difficult to do what’s unexpected. I spent a lot of time bottling up my feelings for girls because I thought it’d prompt mom to add yet another layer of padding to my life."]
    :-> [:office 0]]

   [:office 0]
   [:miranda/dialogue
    ["Pharah" [[:jack :_babyGay]]
     "Gabriel was the first person I ever came out to. He told me..."]
    ["Gabe" [[:jack :_babyGay]]
     "Don’t let ANYONE tell you that you can’t be the biggest, toughest homo ever."]
    :-> [:cafe 3]]

   [:cafe 3]
   [:miranda/dialogue
    ["Symmetra" [[:pharah :_karkadeDrink (scoot -10)] [:symmetra :_karkadeTalk (scoot 0)]]
     "That is sweet."]
    ["Pharah" [[:pharah :_karkadeBold (scoot -10)] [:symmetra :_karkadeHold (scoot 0)]]
     "Granted, he was projecting himself onto me, but I’d like to think I followed his advice."]
    ["Symmetra" [[:pharah :_karkadeHold (scoot -10)] [:symmetra :_karkade-Drink (scoot 0)]]
     "That certainly sounds like Reaper, from what little I know of him..."]
    ["Pharah" [[:pharah :_karkadeLaugh (scoot -10)] [:symmetra :_karkadeSmile (scoot 0)]]
     "It sure does..."]
    ["Symmetra" [[:pharah :_karkadeHold (scoot -10)] [:symmetra :_karkadeConcerned (scoot 0)]]
     "Thank you for opening up to me, Ms. Amari. Do you feel like this is an appropriate time to head back?"]
    ["Pharah" [[:pharah :_karkadeEmbarassed (scoot -10)] [:symmetra :_karkadeHold (scoot 0)]]
     "Jeepers! We’re late. Oh, geez, Satya, I’m so sorry. I promised you we’d be back quickly. The offensive round of the match is probably over by now."]
    ["Symmetra" [[:pharah :_karkadeDown (scoot -10)] [:symmetra :_karkadeConcerned (scoot 0)]]
     "Let us work hard, to make up for it. I would like to put up a strong show for the second half in order to compensate. Defense is my specialty after all."]
    :-> [:pharah-b]]

   [:pharah-b]
   [:miranda/characters
    [[]]
    :-> [:pharah-b :text]]

   [:pharah-b :text]
   [:miranda/narration
    "Your team’s offense had apparently been stifled rather quickly, going four versus six. Mercy was quite visibly upset, and shot some nasty looks at Pharah, who was incapable of returning eye contact. The rest of the team did not seem to mind much though. Genji was quietly aloof and Reinhardt and Zarya’s drunken teasing about your romantic getaway occupied much more of the conversation than the upcoming defense."
    "You all held the first objective until overtime, and it seemed like the match might go the way of a tie, but a well placed scatter arrow eliminated you, your teleporter, and your team’s hopes of further contesting the point."
    :=> [:volskaya [:spawn :intro] 0]]})
