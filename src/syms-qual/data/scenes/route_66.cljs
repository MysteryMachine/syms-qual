(ns syms-qual.data.scenes.route-66
  (:require [syms-qual.data.animation :as anim :refer [scoot]]))

(def data
  {[:diner :intro]
   [:miranda/narration
    "Today is the day you must perform your first qualifying duties under the rogue Overwatch program. Although, you can’t imagine what your employer, The Vishkar Corporation, is going to gain from your participation in such a highly illegal operation, it’s not your place to question their orders. From the intel they’ve gathered, it seems Overwatch agents fight largely fight among themselves, attempting, and mostly failing to escort payloads. Vishkar strategists have advised you to focus on maintaining direct contact with this payload in your qualifying endeavors, but beyond that they have concluded that the next best course of action will be to work closely with your assigned team captains to develop cohesive battle strategies on a day by day basis."
    :-> [:diner :dialogue 0]]

   [:diner :dialogue 0]
   [:miranda/dialogue
    ["McCree" [[:mccree :_coffeePoint] [:ana :_sass (scoot -20)] [:symmetra :_neutral]]
     "Howdy! You’re that Symmetra gal joining Overwatch from the Vishkar corporation, aren’tcha? What sort of interest could y’all have with Overwatch?"]
    :-> [:diner :option 0]]

   [:diner :option 0]
   [:miranda/option
    "Symmetra" [[:mccree :_coffeePoint] [:ana :_sass (scoot -20)] [:symmetra :_neutral]]
    "I do not know."
    {:scene [:route-66 [:diner :option 0 :a] 0]}

    "Vishkar's motivations are not for me to reveal."
    {:scene [:route-66 [:diner :option 0 :b] 0]}

    "My conjecture is that Vishkar wants data on you Overwatch anarchists."
    {:scene [:route-66 [:diner :option 0 :c] 0]}]

   [:diner :option 0 :a]
   [:miranda/dialogue
    ["Symmetra" [[:mccree :_coffeePoint] [:ana :_sass (scoot -20)] [:symmetra :_neutral]]
     "As a Vishkar agent, I am often required to perform my duties without direct explanation from executives. If every part of the machine questioned the machinemaker, it could not operate efficiently. Vishkar is committed to bringing order to the world. Knowing that is enough to comfort my curiosity. How about you two? Today, will be acting with a Gabriel Reyes -"]
    :-> [:diner :dialogue 1]]

   [:diner :option 0 :b]
   [:miranda/dialogue
    ["Symmetra" [[:mccree :_coffeePoint] [:ana :_sass (scoot -20)] [:symmetra :_neutral]]
     "I am much more concerned with performing my function in the here and now. Our remaining teammates are yet to arrive. We still have Amelie, Mako and Gabriel - "]
    :-> [:diner :dialogue 1]]

   [:diner :option 0 :c]
   [:miranda/dialogue
    ["Symmetra" [[:mccree :_coffeeHold] [:ana :_sass (scoot -20)] [:symmetra :_explain]]
     "Your operations present a great risk to our developments. Overwatch has always been an unpredictable, anarchic, destabilizing force in the world. This irresponsible development cannot go unwatched. Especially with former Blackwatch agents like you and Gabriel Reyes -"]
    :-> [:diner :dialogue 1]]

   [:diner :dialogue 1]
   [:miranda/dialogue
    ["McCree" [[:mccree :_coffeeDrink] [:ana :_cranky (scoot -20)] [:symmetra :_neutral]]
     "Reaper!"]
    ["Symmetra" [[:mccree :_coffeeDrink] [:ana :_cranky (scoot -20)] [:symmetra :_confused]]
     "Excuse me?"]
    ["McCree" [[:mccree :_coffeeHold] [:ana :_cranky (scoot -20)] [:symmetra :_neutral]]
     "It’s Reaper. He prefers to go by Reaper."]
    ["Ana" [[:mccree :_coffeeHold] [:ana :_drink (scoot -20)] [:symmetra :_neutral]]
     "He sure does."]
    ["Symmetra" [[:mccree :_coffeeHold] [:ana :_drink (scoot -20)] [:symmetra :_confused]]
     "I...see. Well, both of you have a history with Reyes. A dark and colorful one. What could possibly motivate you to engage in this sort of activity together?"]
    ["Ana" [[:mccree :_coffeeHold] [:ana :_explain (scoot -20)] [:symmetra :_neutral]]
     "Well, after the match, people upvote you if you do well. You see, the best reason to support in these matches is for the compliments."]
    ["McCree" [[:mccree :_coffeePoint] [:ana :_sass (scoot -20)] [:symmetra :_neutral]]
     "I, personally, enjoy the thrill of going, “it’s high noon” and shooting a bunch of technicolor weirdos. Well, that and sitting on the payload with my boyfriend."]
    ["Symmetra" [[:mccree :_coffeeHold] [:ana :_sass (scoot -20)] [:symmetra :_explain]]
     "You engage in a deathsport where you are revived from the dead dozens of times for commendations and...a catchphrase. That’s -"]
    ["Reaper" [[:mccree :_coffeeSteal] [:ana :_cranky (scoot -20)] [:symmetra :_neutral]]
     "DEATH COMES."]
    ["Reaper" [[:symmetra :_confused (scoot 0 10 1)] [:reaper :_spit (scoot 10)] [:mccree :_laugh (scoot 0 -10 1)] [:ana :_roll-eyes (scoot -20 -25 1)]]
     "OH MERCIFUL MUERTE WHAT IS THIS CRAP."]
    ["McCree" [[:reaper :_exasperated (scoot 10)] [:mccree :_laugh (scoot -10)] [:ana :_roll-eyes (scoot -25)] [:symmetra :_eyeRoll (scoot 10)]]
     "Haha! I told you ol’ edgy couldn’t help himself. This coffee’s terrible!"]
    ["Reaper" [[:reaper :_neutral (scoot 10)] [:mccree :_neutral (scoot -10)] [:ana :_drink (scoot -25)] [:symmetra :_neutral (scoot 10)]]
     "ANA. I AM TAKING COMMAND OF THIS UNIT. WHERE IS ROADHOG?"]
    ["Ana" [[:reaper :_neutral (scoot 10)] [:mccree :_neutral (scoot -10)] [:ana :_sass (scoot -25)] [:symmetra :_neutral (scoot 10)]]
     "Oh, Mako? Mako’s having some calm meditation time."]
    ["Reaper" [[:reaper :_explain (scoot 10)] [:mccree :_neutral (scoot -10)] [:ana :_cranky (scoot -25)] [:symmetra :_neutral (scoot 10)]]
     "WHY IS HE NOT GETTING PUMPED?"]
    ["Ana" [[:reaper :_neutral (scoot 10)] [:mccree :_neutral (scoot -10)] [:ana :_drink (scoot -25)] [:symmetra :_neutral (scoot 10)]]
     "Gabriel, darling, not everyone gets ready for action by shooting plates and cutlery."]
    ["Reaper" [[:reaper :_point-up (scoot 10)] [:mccree :_neutral (scoot -10)] [:ana :_sass (scoot -25)] [:symmetra :_neutral (scoot 10)]]
     "AND GRAFFITI."]
    ["Ana" [[:reaper :_point-up (scoot 10)] [:mccree :_neutral (scoot -10)] [:ana :_roll-eyes (scoot -25)] [:symmetra :_neutral (scoot 10)]]
     "Yes, of course."]
    ["Reaper" [[:reaper :_explain (scoot 10)] [:mccree :_neutral (scoot -10)] [:ana :_drink (scoot -25)] [:symmetra :_neutral (scoot 10)]]
     "NOW, FOR STRATEGY. SYMMETRA WILL COVER THE PAYLOAD IN TURRETS. ROADHOG WILL PULL THEM IN. ANA. YOU AND I WILL PERFORM THE NANO BLOSSOM."]
    :=> [:route-66 [:diner :option 1]]]

   [:diner :option 1]
   [:miranda/option
    "Symmetra" [[:reaper :_neutral (scoot 10)] [:mccree :_neutral (scoot -10)] [:ana :_sass (scoot -25)] [:symmetra :_neutral (scoot 10)]]
    "What is a Nano Blossom?"
    {:scene [:route-66 [:diner :option 1 :a] 0]}

    "Is this relating to your, so called, Death Blossom ultimate?"
    {:scene [:route-66 [:diner :option 1 :b] 0]}

    "[Be quiet]"
    {:scene [:route-66 [:diner :option 1 :c] 0]}]

   [:diner :option 1 :a]
   [:miranda/dialogue
    ["Reaper" [[:reaper :_explain (scoot 10)] [:mccree :_phoneTexting (scoot -10)] [:ana :_roll-eyes (scoot -25)] [:symmetra :_neutral (scoot 10)]]
     "THE NANO BLOSSOM IS THE DEVASTATING COMBINATION OF ANA’S NANO BOOST TECHNOLOGY AND MY SIGNATURE MOVE, THE DEATH BLOSSOM. MY OLD...FRIEND HERE, ANA AND I DEVELOPED IT TO OBTAIN PLAYS OF THE MATCH."]
    :-> [:diner :dialogue 2]]

   [:diner :option 1 :b]
   [:miranda/dialogue
    ["Symmetra" [[:reaper :_neutral (scoot 10)] [:mccree :_phoneTexting (scoot -10)] [:ana :_sass (scoot -25)] [:symmetra :_explain (scoot 10)]]
     "I have heard of this move. You, uh, supposedly just spin around, shooting a shot per shotgun, and discarding them after each move? Why would a Blackwatch agent such as yourself utilize such a crude, and frankly, bizarre method of attack?"]
    ["Reaper" [[:reaper :_explain (scoot 10)] [:mccree :_phoneTexting (scoot -10)] [:ana :_cranky (scoot -25)] [:symmetra :_neutral (scoot 10)]]
     "I DON’T KNOW WHAT THEY TAUGHT YOU IN VISHKAR, BUT THE DEATH BLOSSOM IS MY ART. MY PASSION. MY SPEED AT GUNS, A SPEED POWERED BY DEATH ITSELF, ALLOWS ME TO PAINT MY ART ON THE BATTLEFIELD."]
    :-> [:diner :dialogue 2]]

   [:diner :option 1 :c]
   [:miranda/dialogue
    ["Reaper" [[:reaper :_extra (scoot 10)] [:mccree :_phoneTexting (scoot -10)] [:ana :_cranky (scoot -25)] [:symmetra :_neutral (scoot 10)]]
     "THIS COMBINATION IS THE HEIGHT OF THE META, NO ONE HAS A STRONG COUNTER."]
    :-> [:diner :dialogue 2]]

   [:diner :dialogue 2]
   [:miranda/dialogue
    ["Ana" [[:reaper :_neutral (scoot 10)] [:mccree :_phoneTexting (scoot -10)] [:ana :_drink (scoot -25)] [:symmetra :_neutral (scoot 10)]]
     "And yet last time we tried it, you let Lucio blast dubstep onto you, shooting you straight into a pit."]
    ["Reaper" [[:reaper :_explain (scoot 10)] [:mccree :_neutral (scoot -10)] [:ana :_drink (scoot -25)] [:symmetra :_neutral (scoot 10)]]
     "SHAPE GIRL. IT WILL BE YOUR JOB TO ENSURE LUCIO DOES NOT COME CLOSE TO ME. MAKE HIS LIFE HELL."]
    :=> [:route-66 [:diner :option 2]]]

   [:diner :option 2]
   [:miranda/option
    "Symmetra" [[:reaper :_neutral (scoot 10)] [:mccree :_neutral (scoot -10)] [:ana :_sass (scoot -25)] [:symmetra :_neutral (scoot 10)]]
    "Ah, yes. He has directly opposed many Vishkar developments."
    {:scene [:route-66 [:diner :option 2 :a] 0]}

    "I agree. Lucio presents himself as a high priority target, your grudges aside."
    {:scene [:route-66 [:diner :option 2 :b] 0]}

    "Mobility is not my strong suit. Pursuing such a mobile target is folly."
    {:scene [:route-66 [:diner :option 2 :c] 0]}]

   [:diner :option 2 :a]
   [:miranda/dialogue
    ["Symmetra" [[:reaper :_neutral (scoot 10)] [:mccree :_neutral (scoot -10)] [:ana :_drink (scoot -25)] [:symmetra :_frown (scoot 10)]]
     "It will be my pleasure to ensure that he is unable to pose an effective threat to our operation."]
    ["Reaper" [[:reaper :_point-up (scoot 10)] [:mccree :_neutral (scoot -10)] [:ana :_sass (scoot -25)] [:symmetra :_neutral (scoot 10)]]
     "WONDERFUL. I WILL COMPLETE MY PREPARATIONS IN SOLITUDE."]
    :-> [:diner :option 3]]

   [:diner :option 2 :b]
   [:miranda/dialogue
    ["Reaper" [[:reaper :_point-up (scoot 10)] [:mccree :_neutral (scoot -10)] [:ana :_sass (scoot -25)] [:symmetra :_neutral (scoot 10)]]
     "MY GRUDGES ARE CRITICAL. REVENGE WILL BE HAD. NOW. I HAVE TO GO LISTEN TO SOME MUSIC BEFORE THE MATCH BEGINS."]
    :-> [:diner :option 3]]

   [:diner :option 2 :c]
   [:miranda/dialogue
    ["Symmetra" [[:reaper :_neutral (scoot 10)] [:mccree :_neutral (scoot -10)] [:ana :_drink (scoot -25)] [:symmetra :_neutral (scoot 10)]]
     "You are much more suited to hunt down such a target. I will stay on the payload."]
    ["Reaper" [[:reaper :_exasperated (scoot 10)] [:mccree :_neutral (scoot -10)] [:ana :_drink (scoot -25)] [:symmetra :_neutral (scoot 10)]]
     "WHERE IS SOMBRA WHEN YOU NEED HER? SHE WOULD LISTEN TO ME."]
    ["Ana" [[:reaper :_exasperated (scoot 10)] [:mccree :_neutral (scoot -10)] [:ana :_sass (scoot -25)] [:symmetra :_neutral (scoot 10)]]
     "Oh! We’re up against her today."]
    ["Reaper" [[:reaper :_extra (scoot 10)] [:mccree :_laugh (scoot -10)] [:ana :_roll-eyes (scoot -25)] [:symmetra :_confused (scoot 10)]]
     "WHAT? IT IS CRITICAL THAT I AM PREPARED, THEN. LEAVE ME BE."]
    :-> [:diner :option 3]]

   [:diner :option 3]
   [:miranda/text-option
    "You have a few minutes before the match begins, which teammates will you engage with?"
    "Reaper" {:scene [:route-66 [:diner :dialogue [:option 3 :reaper] 0] 0]}
    "Ana and McCree" {:scene [:route-66 [:diner :dialogue [:option 3 :ana] 0] 0]}
    "Roadhog" {:scene [:route-66 [:diner :dialogue [:option 3 :roadhog] 0] 0]}]

   [:diner :prepare]
   [:miranda/text-option
    "What will you do?"
    "Converse with your other teammates" {:scene [:route-66 [:diner :option 3] 0]}
    "Prepare for the attack" {:scene [:diner :junkrat]}]

   [:diner :dialogue [:option 3 :reaper] 0]
   [:miranda/dialogue
    ["Symmetra" []
     "Gabriel, I mean, Reaper."]
    ["Reaper" []
     "WHAT IS IT"]
    ["Symmetra" []
     "I noticed you did not provide us with information on the rest of the enemy team. I know Lucio is on the enemy team, but who else"]
    ["Reaper" []
     "FAREEHA, ANA’S DAUGHTER. JUNKRAT, ROADHOG’S LITTLE BUDDY. REINHARDT, THAT OLD FOOL. THERE’S TRACER, WHICH IS AWKWARD CONSIDERING SHE AND WIDOWMAKER HAD SOME SORT OF ALTERCATION. SHE WENT OUT AND ELIMINATED FIVE HUNDRED OF THE TOP STRAIGHT SHOOTERS IN THE BUSINESS AFTER IT. THERE’S MEI, WHO TERRIFIES EVEN ME. THEY ARE ALL A BUNCH OF INCOMPETENTS. THE ONLY REAL THREAT IS SOMBRA"]
    ["Symmetra" []
     "Sombra"]
    ["Reaper" []
     "YES. AN EFFECTIVE HACKER. SHE COUNTERS MY GHOST FORM INTO DEATH BLOSSOM PERFECTLY BY HACKING."]
    ["Reaper" []
     "HERE ARE WE ON VACATION"]
    :-> [:diner :dialogue [:option 3 :reaper] :photo]]

   [:diner :dialogue [:option 3 :reaper] :photo]
   [:miranda/dialogue
    [nil [] "It’s a picture of Reaper, Sombra, and Widowmaker in France. Widowmaker is clearly annoyed."]
    :-> [:diner :option [:option 3 :reaper] 0]]

   [:diner :option [:option 3 :reaper] 0]
   [:miranda/option
    "Symmetra" []

    "Are those...vibrams? "
    {:scene [:route-66 [:diner :option [:option 3 :reaper] 0 :a] 0]}

    "The chaos of her hair is, interesting."
    {:scene [:route-66 [:diner :option [:option 3 :reaper] 0 :b] 0]}

    "[Quietly blush]"
    {:scene [:route-66 [:diner :option [:option 3 :reaper] 0 :c] 0]}]

   [:diner :option [:option 3 :reaper] 0 :a]
   [:miranda/dialogue
    ["Reaper" [:diner :dialogue [:option 3 :reaper] 1]
     "GOOD EYES. THESE SWEET VIBRAMS ARE THE SOURCE OF HER LEGENDARY MOBILITY."]
    :-> [:diner :dialogue [:option 3 :reaper] 1]]

   [:diner :option [:option 3 :reaper] 0 :b]
   [:miranda/dialogue
    ["Reaper" []
     "I AGREE. ALL BLACK IS THE BEST COLOR. SHE INSISTS ON THE PURPLE FOR DATING PURPOSES."]
    :-> [:diner :dialogue [:option 3 :reaper] 1]]

   [:diner :option [:option 3 :reaper] 0 :c]
   [:miranda/dialogue
    ["Reaper" []
     "YES, YOUR SILENCE SPEAKS VOLUMES. AN INTIMIDATING AGENT. I RECOMMEND STAYING AWAY FROM HER."]
    :-> [:diner :dialogue [:option 3 :reaper] 1]]

   [:diner :dialogue [:option 3 :reaper] 1]
   [:miranda/dialogue
    ["Symmetra" []
     "What a striking agent. I have heard tales of her sabotaging Vishkar operations in Mexico. She is the enemy, but I can’t help but stare!"]
    ["Reaper" []
     " SHE WILL HACK HEALTHPACKS, WHICH IS CRITICAL SINCE ANA SPENDS MORE TIME SHOOTING THE ENEMY THAN HEALING. THANKFULLY, WE HAVE YOU AS ADDITIONAL SUPPORT."]
    ["Symmetra" []
     "Healing is not part of my functions. I have turrets, shields both personal and mobile, teleporters, slow zoning projectiles, and a low range homing laser."]
    ["Reaper" []
     "WAIT WHY DID YOU ENLIST AS A SUPPORT HERO I WOULDN’T HAVE COMPOSED THE TEAM THIS WAY IF I KNEW"]
    ["Symmetra" []
     "My functions all support you. As for my offensive bent, one does not need to be supported if the enemy is already dead."]
    ["Reaper" []
     "OF COURSE! DEATH. VERY GOOD. WE WILL DECIMATE THE ENEMY TEAM BEFORE NEEDING TO HEAL. EXCELLENT STRATEGY."]
    ["Symmetra" []
     "I am glad we are in agreement"]
    ["Reaper" []
     "GOOD TALK. NOW IF YOU’LL EXCUSE ME I HAVE SOME EVANESCENCE I NEED TO GO LISTEN TO."]
    :-> [:diner :prepare]]

   [:diner :dialogue [:option 3 :ana] 0]
   [:miranda/dialogue
    ["Ana" [] "Satya, darling. Why don’t you take a seat?"]
    ["Symmetra" [] "Thank you. I will rest my feet for a while"]
    :-> [:diner :option [:option 3 :ana] 0]]

   [:diner :option [:option 3 :ana] 0]
   [:miranda/option
    "Symmetra" []
    "Who are we up against today?"
    {:scene [:route-66 [:diner :option [:option 3 :ana] 0 :a] 0]}

    "You didn’t finish telling me what your motivations were for engaging in this dirty business."
    {:scene [:route-66 [:diner :option [:option 3 :ana] 0 :b] 0]}

    "The team captain seems rather bizarre."
    {:scene [:route-66 [:diner :option [:option 3 :ana] 0 :c] 0]}]

   [:diner :option [:option 3 :ana] 0 :a]
   [:miranda/dialogue
    ["Ana" []
     "Reaper? He’s not captain darling, I am"]
    ["Symmetra" []
     "Oh? He was so insistent on deciding the strategy"]
    ["Ana" []
     "Not all of us take things as seriously as him. Reaper gets caught up in competition to impress Jack"]
    ["McCree" []
     "It’s an edgy gay thing, darling"]
    :-> [:diner :dialogue [:option 3 :ana] 1]]

   [:diner :option [:option 3 :ana] 0 :b]
   [:miranda/dialogue
    ["Ana" []
     "What is there to say? When does violence actually resolve much in the world? Sure, Overwatch was needed for the Omnic Crisis, but outside of situations like that, violence only tends to exacerbate the conditions that caused the violence in the first place. You enjoy order, do you not? We Overwatch agents are dangerous. There cannot be order if we are allowed to go free. The world cannot get rid of us either. God forbid, another Omnic Crisis type event occurs, and the world no longer has such a military force"]
    ["McCree" []
     "In peace, the world has no use for soldiers, darling"]
    ["Symmetra" []
     "So this program allows Overwatch to exist in a bubble? To develop technology and maintain its super soldiers without letting them loose on the world"]
    ["Ana" []
     "Vishkar was probably invited to send an agent"]
    :-> [:diner :dialogue [:option 3 :ana] 1]]

   [:diner :option [:option 3 :ana] 0 :c]
   [:miranda/dialogue
    ["Ana" []
     "Well! That’s rather rude"]
    ["Symmetra" []
     "You seemed to be keen on poking fun at Reaper earlier. Why defend him now"]
    ["Ana" []
     "I’m not defending him, I’m defending the team captain"]
    ["Symmetra" []
     "Reaper is not captain? He was so loud about organizing our strategy"]
    ["McCree" []
     "The only thing Reaper is captain of is team gay. Like, don’t get me wrong, I’m really gay. Once I make sure I get play of the match, I’m just going to go sit in a corner and text my boyfriend. Reaper though? Overwatch is just a complex fetish thing between him and Jack."]
    ["Ana" []
     "Oh Jesse, knock it off. Anyway, darling, I’m team captain. I only went through with Reaper’s team draft because I thought it was fine"]
    :-> [:diner :dialogue [:option 3 :ana] 1]]

   [:diner :dialogue [:option 3 :ana] 1]
   [:miranda/dialogue
    ["Ana" []
     "Now, in this match, you should take care in approaching three different agents. Normally I’d tell you to watch for Tracer, but, I think Amelie is pretty specifically going to be trying to shut her down"]
    ["McCree" []
     "Dang homos"]
    ["Ana" []
     "Be quiet, Jesse, Junkrat is an explosives expert. He will have an easy time disabling your defenses from long range. Sombra is an excellent infiltrator and hacker. Her weaponry and mobility will also wreck havoc on your systems. The last agent is my daughter, Fareeha, who uses long range rockets. I’d be extra careful with her today. She’s been dumped and hasn’t been taking it well"]
    ["McCree" []
     "Homos, not even once"]
    ["Ana" []
     "Put that phone down, Jesse, we get it, you’re gay. This is serious"]
    ["McCree" []
     "Look, I’m serious, here’s Fareeha! Be careful! She’s lost her bird wife"]
    ["" []
     "It's Pharah in the gym squatting some serious weight with Mercy spotting, behind Hanzo and McCree in a selfie, Ana quickly snatches the phone away"]
    ["Symmetra" []
     "Such power. I can see in her eyes that she is a woman of much discipline. I admire that"]
    ["Ana" []
     "This is mine now. You’re not getting it back"]
    ["McCree" []
     "But Hanzo hasn’t sent me a selfie back"]
    ["Ana" []
     "You best be on your way. This is going to take a while"]
    ["McCree" []
     "Ana, pleeeeeeease"]
    :-> [:diner :prepare]]

   [:diner :dialogue [:option 3 :roadhog] 0]
   [:miranda/dialogue
    ["Roadhog" []
     "Hi"]
    ["Symmetra" []
     "H-hello"]
    ["Roadhog" []
     "Welcome to the team. I’m the Hog. Want some tea"]
    :-> [:diner :option [:option 3 :roadhog] 0]]

   [:diner :option [:option 3 :roadhog] 0]
   [:miranda/option
    "Symmetra" []
    "You don’t strike me as the sort of person who drinks tea."
    {:scene [:route-66 [:diner :dialogue [:option 3 :roadhog] :a] 0]}

    "Oh! Thank you."
    {:scene [:route-66 [:diner :dialogue [:option 3 :roadhog] :a] 0]}]

   [:diner :dialogue [:option 3 :roadhog] :a]
   [:miranda/dialogue
    ["Roadhog" []
     "Old habit. Helps me focus. Cups are over there"]
    ["Symmetra" []
     "Thank you, but I will decline. I would like to avoid caffeine jitters"]
    :-> [:diner :dialogue [:option 3 :roadhog] 1]]

   [:diner :dialogue [:option 3 :roadhog] :b]
   [:miranda/dialogue
    ["Roadhog" []
     "Help yourself. I make it strong, there’s hot water in the back if you want it weaker"]
    ["Symmetra" []
     "I will not take much. I’d like to avoid the jitters"]
    :-> [:diner :dialogue [:option 3 :roadhog] 1]]

   [:diner :dialogue [:option 3 :roadhog] 1]
   [:miranda/dialogue
    ["Symmetra" []
     "So, what brings you to Overwatch"]
    ["Roadhog" []
     "Keeping an eye on a friend."]
    ["Symmetra" []
     "A friend"]
    ["Roadhog" []
     "Of sorts. Junkrat. I’m his bodyguard. He’s a good boy. Mostly."]
    ["Symmetra" []
     "Junkrat… that sounds familiar.."]
    ["Roadhog" []
     "This maybe? Points at wanted poste"]
    ["Symmetra" []
     "I remember now I saw you on the news. You are criminals! What are you doing as part of a worldwide peacekeeping organization"]
    ["Roadhog" []
     "They offered. We accepted. Same as you"]
    ["Symmetra" []
     "We are nothing alike"]
    ["Roadhog" []
     "Maybe. Doesn’t matter. We’re here now. And now’s what matters. A group like this leaves some space for… serendipity."]
    ["Symmetra" []
     "An interesting perspective"]
    ["Roadhog" []
     "More tea?"]
    ["Symmetra" []
     "No, thanks"]
    ["Roadhog" []
     "..."]
    ["Symmetra" []
     "..."]
    :-> [:diner :prepare]]

   [:diner :junkrat]
   [:miranda/narration
    "Athena’s mechanized voice rings over the loud speakers: “Attack commences in thirty seconds” You make your way to one of the side exits hoping that an early flank will provide your team with a tactical advantage, when you hear a strange noise..."
    :-> [:diner :dialogue 3]]

   [:diner :dialogue 3]
   [:miranda/dialogue
    ["Symmetra" []
     "What is this snickering I hear at the door? Is a foe setting up a trap"]
    ["Junkrat" []
     "Hee hee hee hee"]
    ["Symmetra" []
     "Just what do you think you’re doing"]
    ["Junkrat" []
     "Oi! Oh! Wowee! Why hello there! Fine weather we’re having"]
    ["Symmetra" []
     "This tactic of standing right in front of our spawn point. I can’t imagine it will work out for you"]
    ["Junkrat" []
     "Oy! Giving strategic advice to your opponent before a match! Quite a sporting move"]
    ["Symmetra" []
     "I think of it more as a statement of fact"]
    ["Junkrat" []
     "So! Allow me to introduce you! I’m the bombastic Junkrat!"]
    :?> {[:a] [:diner :dialogue 3 :a]
         [:b] [:diner :dialogue 3 :b]}]

   [:diner :dialogue 3 :a]
   [:miranda/dialogue
    ["Symmetra" []
     "I was talking to your friend just a moment ago. He told me you were a good boy."]
    ["Junkrat" []
     "He said what?"]
    ["Symmetra" []
     "Oh nothing!"]
    ["Symmetra" []
     "I talked to him about Lumerico. Just what ARE you two doing, pulling a stunt like that and then coming to Overwatch?"]
    :-> [:diner :dialogue 4]]

   [:diner :dialogue 3 :b]
   [:miranda/dialogue
    ["Symmetra" []
     "I remember now I saw you on the news"]
    ["Junkrat" []
     "Oh yeah, the Lumerico thing! Me and my associate Roadhog, took the liberty of, ho, ho, liberating some funds! Created a nice distraction! And a nice boom! He he heeee"]
    ["Symmetra" []
     "How can you justify all the lives you disrupted"]
    :-> [:diner :dialogue 4]]

   [:diner :dialogue 4]
   [:miranda/dialogue
    ["Junkrat" []
     "The way I see it, I’m a tinkerer, darl. I built all my gear out of others junk. The wonderful thing about junk is that it gives you the opportunity to make something entirely new! And some things, got to be broke before they can be fixed. ‘Wos that phrase they have about omelets and eggs? Hee hee"]
    ["Symmetra" []
     "Destruction and reconstruction, huh? I suppose Overwatch gives you room for both things"]
    ["Junkrat" []
     ""]
    ["Junkrat" []
     "Well! I suppose it’s time for me to take your, uh, statement of fact, darl. I didn’t catch your name, though"]
    ["Symmetra" []
     "Satya. I go by Symmetra in Overwatch"]
    ["Junkrat" []
     "I’d tell you to give ol’ hoggie my warmest wishes, but I’ll be delivering warmth directly to the payload! Heehee! Oh! And watch your step"]
    :-> [:diner :sombra]]

   [:diner :sombra]
   [:miranda/narration
    "Despite your previous comments, you are caught in Junkrat’s trap almost immediately upon starting the match. Kaboom! You have a hard fought round, but your team is stopped just short of the final point. As you are placing turrets outside the diner for your own round on defense, you notice Sombra just inside the door, seemingly preoccupied with the glowing screen in front of her. You attempt to get her attention with a quick tap on the glass."
    :-> [:diner :dialogue 5]]

   [:diner :dialogue 5]
   [:miranda/dialogue
    ["Symmetra" []
     "Hello"]
    ["Sombra" []
     "Ah! Que onda"]
    ["Symmetra" []
     "You are Sombra, no? Your performance in the previous round was exemplary"]
    ["Sombra" []
     "Ai querida, thank you! You did well too! I, uh, can’t say it was very pleasant getting zapped by you while you were all blue and glowing"]
    ["Symmetra" []
     "Haha, between you and I, I think Ana boosted me purely to frustrate Reaper. He had this grand tactic that he held supreme. Letting someone else have the Nano Boost was her way of poking fun at him"]
    ["Sombra" []
     "Ai, Gabriel, he’s such a tryhard. He and Jack have this weird gay playground romance where they profess their love with violence"]
    ["Symmetra" []
     "I suppose it should not be unexpected that two soldiers as seasoned as they would express their love on the battlefield. Don’t get me wrong. It’s still"]
    ["Sombra" []
     "Extra"]
    ["Symmetra" []
     "Yes"]
    ["Sombra" []
     "I get it. I mean! Girl! You have some moves! I can really get behind that"]
    ["Symmetra" []
     "I still don’t know if I’m comfortable with the wanton violence"]
    ["Sombra" []
     "Well maybe you can get comfortable in some other way"]
    ["Symmetra" []
     "What"]
    ["Sombra" []
     "I’m just saying! People deal with the stress of this fucked up military sisphysian bullshit in different ways -- they hack the system, you know"]
    :?> {[:a] [:diner :sombra :extra]
         [:b] [:diner :dialogue 6]}]

   [:diner :sombra :extra]
   [:miranda/dialogue
    ["Symmetra" []
     "Like a vacation to France"]
    ["Sombra" []
     "Hum"]
    ["Symmetra" []
     "Reaper sounded quite fond of you when we spoke. I might dare say he even bordered on fatherly"]
    ["Sombra" []
     "Pinche abuelo. Giving away my cute secrets. I suppose. We’re a family of sorts"]
    :-> [:diner :dialogue 6]]

   [:diner :dialogue 6]
   [:miranda/dialogue
    ["Sombra" []
     "Look, hackers get a bad rap as destructive, but hacking’s history is much richer than that.  When you’re completely out of options, what’s a little bending of the rules? If we have to do this while the world moves on around us, I say we make it our own"]
    ["Symmetra" []
     "Novel"]
    ["Sombra" []
     "The round is starting. You should hurry"]
    ["Symmetra" []
     "I don’t believe we exchanged proper introductions. My real name is Satya"]
    ["Sombra" []
     "And mine is Sombra. Call it another hack. Hasta"]
    :?> {[:a] [:diner :ending :ana]
         [:b] [:diner :ending :reaper]
         [:c] [:diner :ending :roadhog]}]

   [:diner :ending :reaper]
   [:miranda/narration
    "Reaper was distraught this round. Between Ana Nanoboosting you, and his dismay at recruiting a support who was not a real support, he could maintain his composure. By the end of the round, he was charging alone headfirst into the enemy team, neglecting any attempt at proper positioning. With your team perpetually split, the enemy succeeded in capturing relatively quickly."
    :-> [:diner :dialogue 7]]

   [:diner :ending :roadhog]
   [:miranda/narration
    "The final round was hotly contested, and you almost succeeded in holding the first choke, pushing the point into Overtime until Junkrat and Sombra managed to obliterate half your team, blowing them up with two well co-ordinated ultimates. Your team held decently in the subsequent parts of the map, but lost the final point in Overtime."
    :-> [:diner :dialogue 7]]

   [:diner :ending :ana]
   [:miranda/narration
    "Ana’s advice paid off this round. You kept your teleporter outside of Junkrat and Pharah’s artillery range, and you covered Sombra’s several flanking routes, severely reducing her effectiveness in combat. You held out the first point into a deep Overtime contest, and managed to squeak by a win as your teleporter pushed your entire team back to the frontline to support Roadhog."
    :-> [:diner :dialogue 7]]

   [:diner :dialogue 7]
   [:miranda/dialogue
    ["Symmetra" []
     "I should return to the diner to pick up my belongings."]
    :?> {[:a] [:diner :scene 7 :a]
         [:b] [:diner :scene 7 :b]}]

   [:diner :scene 7 :a]
   [:miranda/narration
    "Ana and Pharah  seem to be discussing something quietly in the corner. You can barely make out their words."
    :-> [:diner :dialogue 7 :b]]

   [:diner :dialogue 7 :a]
   [:miranda/dialogue
    ["Ana" []
     "Fareeha, darling, it’s time to move on! If that Satya girl tickles your fancy-"]
    ["Pharah" []
     "Mama"]
    ["Ana" []
     "Look, ‘ibna, she’s over in the corner"]
    ["Pharah" []
     "Mama! She’s going to hear us, and then it’ll be weird"]
    ["Ana" []
     "You military types. You become disciplined and well trained, and it squeezes out all the real social skills. I spent years dealing with this same shyness before I just gave up and dated a civilian. ‘Ibna, if you don’t talk to others, you’ll never get to know them. Just say hello"]
    :-> [:diner :dialogue 8]]

   [:diner :scene 7 :b]
   [:miranda/narration
    "You see Pharah, Ana, and McCree discussing selfies McCree had sent to Hanzo over the round."
    :-> [:diner :dialogue 7 :b]]

   [:diner :dialogue 7 :b]
   [:miranda/dialogue
    ["McCree" []
     "This is probably the best one I took. There are some others but they’re, uh, not appropriate for sharing"]
    ["Pharah" [] "
Haha, I saw you taking those. You think you’re being sneaky, Jesse, but you always forget to account for the aerial vantage point"]
    ["McCree" []
     "Oh well in that case will you take a look? I feel like it came out alright but I’m not sure about the lighting"]
    ["Ana" []
     "Children, behave."]
    :-> [:diner :dialogue 8]]

   [:diner :dialogue 8]
   [:miranda/dialogue
    ["Pharah" []
     "Hello! Your tactics were formidable"]
    ["Symmetra" []
     "Why, thank you! I’ve found there’s a great deal of power in being able to bring your allies back from death quickly! It’s almost as if my allies never died"]
    ["Pharah" []
     "What"]
    ["Symmetra" []
     "Did you not notice the teleporter I had up? It seems like I did a better job than I thought at concealing it"]
    ["Pharah" []
     "Oh! I did notice. I mean. Don’t get me wrong you concealed your teleporter well, it took me a while to find. I, um, I just couldn’t get the proper aerial superiority in order to siege it"]
    ["Symmetra" []
     "Oh."]
    ["Pharah" []
     "It’s not like that! Our flankers just had difficulty opening space for me because you guarded the hallways so well."]
    ["Symmetra" []
     "I am Satya. You are Fareeha, right? Your mother and I had the chance to speak. She certainly lives up to her reputation as a legendary soldier, and you to her legacy"]
    ["Pharah" []
     "I don’t think my mother wishes for me to live up to her legacy but my thanks anyway"]
    ["Symmetra" []
     "Oh. My apologies. I did not mean to-"]
    ["Pharah" []
     "Don’t worry about it. Maybe we can grab some coffee later and we can swap personal stories or something"]
    ["Symmetra" []
     "That sounds like a wonderful break from all the violence"]
    ["Pharah" []
     "Good! Okay then! It’s a date"]
    ["Pharah" []
     "Um. Like. It’s all set. You know. Um. I have to jet"]
    ["Symmetra" []
     "I have to jet?"]
    ["Symmetra" []
     "Oh"]
    :-> [:diner :finale]]

   [:diner :finale]
   [:miranda/narration
    "The days event have done nothing to assuage your doubts about the Overwatch program but you can’t say they haven’t been interesting. As you board your homeward bound shuttle you cannot help but wonder what the coming days will bring."
    :-> [:route-66]]})
