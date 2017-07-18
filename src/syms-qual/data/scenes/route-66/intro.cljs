(ns syms-qual.data.scenes.route-66.intro
  (:require [carmen.util :as anim :refer [scoot]]))

(def data
  {[:diner :intro]
   [:miranda/narration
    "Today is the day you must perform your first qualifying duties under the newly reinstated Overwatch program. Although, you can’t imagine what your employer, The Vishkar Corporation, is going to gain from your participation in such a highly illegal operation, it’s not your place to question their orders. From the intel they’ve gathered, it seems Overwatch agents largely fight amongst themselves, attempting, and mostly failing to escort payloads."
    "Vishkar strategists have advised you to focus on maintaining direct contact with this payload in your qualifying endeavors, but beyond that they have concluded that the next best course of action will be to work closely with your assigned team captains to develop cohesive battle strategies over the next ten days of qualifying matches."
    "While you personally feel like it is important to to maintian Vishkar's worldwide reputation by performing well in your matches, your superiors indicated that gaining intel on the project as a whole is an equally desirable goal. How you prioritize these goals has be left to your discretion."
    :-> [:diner :dialogue 0]]

   [:diner :dialogue 0]
   [:miranda/dialogue
    ["McCree" [[:mccree :_coffeePoint] [:ana :_sass (scoot -20)] [:symmetra :_neutral]]
     "Howdy! You’re that Symmetra gal joining Overwatch from Vishkar, aren’tcha? What sort of interest could y’all have with Overwatch?"]
    :-> [:diner :option 0]]

   [:diner :option 0]
   [:miranda/option
    "Symmetra" [[:mccree :_coffeeHold] [:ana :_sass (scoot -20)] [:symmetra :_neutral]]
    "I do not know."
    "Vishkar's motivations are not for me to reveal."
    "My conjecture is that Vishkar wants data on you Overwatch anarchists."]

   [:diner :option 0 0]
   [:miranda/dialogue
    ["Symmetra" [[:mccree :_coffeeHold] [:ana :_sass (scoot -20)] [:symmetra :_explain]]
     "As a Vishkar agent, I am often required to perform my duties without direct explanation from executives. If every part of the machine questioned the machinemaker, it could not operate efficiently."]
    ["Symmetra" [[:mccree :_coffeeHold] [:ana :_sass (scoot -20)] [:symmetra :_explain]]
     "Vishkar is committed to bringing order to the world. Knowing that is enough to comfort my curiosity. How about you two? Today, will be acting with a Gabriel Reyes—"]
    :-> [:diner :dialogue 1]]

   [:diner :option 0 1]
   [:miranda/dialogue
    ["Symmetra" [[:mccree :_coffeeHold] [:ana :_sass (scoot -20)] [:symmetra :_explain]]
     "I am much more concerned with performing my function in the here and now. Our remaining teammates have yet to arrive. We still have Amelie, Mako and Gabriel—"]
    :-> [:diner :dialogue 1]]

   [:diner :option 0 2]
   [:miranda/dialogue
    ["Symmetra" [[:mccree :_coffeeHold] [:ana :_sass (scoot -20)] [:symmetra :_explain]]
     "Your operations present a great risk to our developments. Overwatch has always been an unpredictable, anarchic, destabilizing force in the world. This irresponsible development cannot go unwatched, especially with former Blackwatch agents like you and Gabriel Reyes—"]
    :-> [:diner :dialogue 1]]

   [:diner :dialogue 1]
   [:miranda/dialogue
    ["McCree" [[:mccree :_coffeeDrink] [:ana :_cranky (scoot -20)] [:symmetra :_neutral]]
     "Reaper!"]
    ["Symmetra" [[:mccree :_coffeeDrink] [:ana :_sass (scoot -20)] [:symmetra :_confused]]
     "Excuse me?"]
    ["McCree" [[:mccree :_coffeeHold] [:ana :_sass (scoot -20)] [:symmetra :_neutral]]
     "It’s Reaper. He prefers to go by Reaper."]
    ["Ana" [[:mccree :_coffeeHold] [:ana :_drink (scoot -20)] [:symmetra :_neutral]] 
     "He sure does."]
    ["Symmetra" [[:mccree :_coffeeHold] [:ana :_drink (scoot -20)] [:symmetra :_confused]]
     "I...see. Well, both of you have a history with Reyes. A dark and colorful one. What could possibly motivate you to engage in this sort of activity together?"]
    ["Ana" [[:mccree :_coffeeHold] [:ana :_explain (scoot -20)] [:symmetra :_neutral]]
     "Well, after the match, people upvote you if you do well. You see, the best reason to support in these matches is for the compliments."]
    ["McCree" [[:mccree :_coffeePoint] [:ana :_sass (scoot -20)] [:symmetra :_neutral]]
     "I, personally, enjoy the thrill of going, “it’s high noon” and shooting a bunch of technicolor weirdos. Well, that and sitting on my boyfriend's payload."]
    ["McCree" [[:mccree :_coffeeHold] [:ana :_sass (scoot -20)] [:symmetra :_neutral]]
     "Err, the payload with my boyfriend."]
    ["Ana" [[:mccree :_coffeeHold] [:ana :_cranky (scoot -20)] [:symmetra :_neutral]]
     "Jesse, I swear."]
    ["Symmetra" [[:mccree :_coffeeHold] [:ana :_sass (scoot -20)] [:symmetra :_explain]]
     "You engage in a deathsport where you are revived from the dead dozens of times for commendations and...for dating purposes? That’s—"]
    ["Reaper" [[:mccree :_coffeeSteal] [:ana :_cranky (scoot -20)] [:symmetra :_bewildered]]
     "DEATH COMES."]
    ["Reaper" [[:symmetra :_confused (scoot 0 10 2)] [:reaper :_spit (scoot 10)] [:mccree :_laugh (scoot 0 -10 2)] [:ana :_roll-eyes (scoot -20 -25 2)]]
     "OH MERCIFUL MUERTE WHAT IS THIS CRAP?"]
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
     "AND DEFACING PUBLIC PROPERTY."]
    ["Ana" [[:reaper :_point-up (scoot 10)] [:mccree :_neutral (scoot -10)] [:ana :_roll-eyes (scoot -25)] [:symmetra :_neutral (scoot 10)]]
     "Yes, of course."]
    ["Reaper" [[:reaper :_explain (scoot 10)] [:mccree :_neutral (scoot -10)] [:ana :_drink (scoot -25)] [:symmetra :_neutral (scoot 10)]]
     "NOW, FOR STRATEGY. SYMMETRA WILL COVER THE PAYLOAD IN TURRETS. ROADHOG WILL PULL THEM IN. ANA. YOU AND I WILL PERFORM THE NANO BLOSSOM."]
    :=> [:route-66 [:diner :option 1]]]

   [:diner :option 1]
   [:miranda/option
    "Symmetra" [[:reaper :_neutral (scoot 10)] [:mccree :_neutral (scoot -10)] [:ana :_sass (scoot -25)] [:symmetra :_neutral (scoot 10)]]
    "What is a Nano Blossom?"
    "Is this some modified version of your ultimate ability?"
    "[Be quiet]"]

   [:diner :option 1 0]
   [:miranda/dialogue
    ["Reaper" [[:reaper :_explain (scoot 10)] [:mccree :_phoneTexting (scoot -10)] [:ana :_roll-eyes (scoot -25)] [:symmetra :_neutral (scoot 10)]]
     "THE NANO BLOSSOM IS THE DEVASTATING COMBINATION OF ANA’S NANO BOOST TECHNOLOGY AND MY SIGNATURE MOVE, THE DEATH BLOSSOM. ME AND MY OLD...FRIEND HERE DEVELOPED IT TO OBTAIN PLAYS OF THE MATCH."]
    :-> [:diner :dialogue 2]]

   [:diner :option 1 1]
   [:miranda/dialogue
    ["Symmetra" [[:reaper :_neutral (scoot 10)] [:mccree :_phoneTexting (scoot -10)] [:ana :_sass (scoot -25)] [:symmetra :_explain (scoot 10)]]
     "I have heard of this so called Death Blossom. You, uh, supposedly just spin around, shooting a shot per shotgun, and discarding them after each move? Why would a Blackwatch agent such as yourself utilize such a crude, and frankly, bizarre method of attack?"]
    ["Reaper" [[:reaper :_explain (scoot 10)] [:mccree :_phoneTexting (scoot -10)] [:ana :_cranky (scoot -25)] [:symmetra :_neutral (scoot 10)]]
     "I DON’T KNOW WHAT THEY TAUGHT YOU AT VISHKAR, BUT THE DEATH BLOSSOM IS MY ART. MY PASSION. MY SPEED AT GUNS, A SPEED POWERED BY DEATH ITSELF, ALLOWS ME TO PAINT MY ART ON THE BATTLEFIELD."]
    :-> [:diner :dialogue 2]]

   [:diner :option 1 2]
   [:miranda/dialogue
    ["Reaper" [[:reaper :_extra (scoot 10)] [:mccree :_phoneTexting (scoot -10)] [:ana :_cranky (scoot -25)] [:symmetra :_awkward (scoot 10)]]
     "THIS COMBINATION IS THE HEIGHT OF THE META, NO ONE HAS A STRONG COUNTER."]
    :-> [:diner :dialogue 2]]

   [:diner :dialogue 2]
   [:miranda/dialogue
    ["Ana" [[:reaper :_neutral (scoot 10)] [:mccree :_phoneTexting (scoot -10)] [:ana :_drink (scoot -25)] [:symmetra :_neutral (scoot 10)]]
     "And yet last time we tried it, you let Lucio blast dubstep onto you, shooting you straight into a pit."]
    ["Reaper" [[:reaper :_explain (scoot 10)] [:mccree :_neutral (scoot -10)] [:ana :_drink (scoot -25)] [:symmetra :_neutral (scoot 10)]]
     "SHAPE GIRL, UH..."]
    ["Ana" [[:reaper :_explain (scoot 10)] [:mccree :_neutral (scoot -10)] [:ana :_cranky (scoot -25)] [:symmetra :_neutral (scoot 10)]]
     "It's Symmetra, Gabriel. Don't be rude."]
    ["Reaper" [[:reaper :_point-up (scoot 10)] [:mccree :_neutral (scoot -10)] [:ana :_drink (scoot -25)] [:symmetra :_neutral (scoot 10)]]
     "RIGHT. IT WILL BE YOUR JOB TO ENSURE LUCIO DOES NOT COME CLOSE TO ME. MAKE SURE THE ONLY BEAT HE DROPS IS THE THUD HIS BODY MAKES WHEN YOU SEND HIM STRAIGHT TO HELL."]
    :=> [:route-66 [:diner :option 2]]]

   [:diner :option 2]
   [:miranda/option
    "Symmetra" [[:reaper :_neutral (scoot 10)] [:mccree :_neutral (scoot -10)] [:ana :_sass (scoot -25)] [:symmetra :_neutral (scoot 10)]]
    "Ah, yes. He has directly opposed many Vishkar developments."
    "I agree. Lucio presents himself as a high priority target, your grudges aside."
    "Mobility is not my strong suit. Pursuing such a mobile target is folly."]

   [:diner :option 2 0]
   [:miranda/dialogue
    ["Symmetra" [[:reaper :_neutral (scoot 10)] [:mccree :_neutral (scoot -10)] [:ana :_drink (scoot -25)] [:symmetra :_frown (scoot 10)]]
     "It will be my pleasure to ensure that he is unable to pose an effective threat to our operation."]
    ["Reaper" [[:reaper :_point-up (scoot 10)] [:mccree :_neutral (scoot -10)] [:ana :_sass (scoot -25)] [:symmetra :_neutral (scoot 10)]]
     "WONDERFUL. I WILL COMPLETE MY PREPARATIONS IN SOLITUDE."]
    :-> [:diner :prepare 0]]

   [:diner :option 2 1]
   [:miranda/dialogue
    ["Reaper" [[:reaper :_point-up (scoot 10)] [:mccree :_neutral (scoot -10)] [:ana :_sass (scoot -25)] [:symmetra :_neutral (scoot 10)]]
     "MY GRUDGES ARE CRITICAL. REVENGE WILL BE HAD. NOW. I HAVE TO GO LISTEN TO SOME MUSIC BEFORE THE MATCH BEGINS."]
    :-> [:diner :prepare 0]]

   [:diner :option 2 2]
   [:miranda/dialogue
    ["Symmetra" [[:reaper :_neutral (scoot 10)] [:mccree :_neutral (scoot -10)] [:ana :_drink (scoot -25)] [:symmetra :_explain (scoot 10)]]
     "You are much more suited to hunt down such a target. I will stay on the payload."]
    ["Reaper" [[:reaper :_exasperated (scoot 10)] [:mccree :_neutral (scoot -10)] [:ana :_drink (scoot -25)] [:symmetra :_neutral (scoot 10)]]
     "WHERE IS SOMBRA WHEN YOU NEED HER? SHE WOULD LISTEN TO ME."]
    ["Ana" [[:reaper :_exasperated (scoot 10)] [:mccree :_neutral (scoot -10)] [:ana :_sass (scoot -25)] [:symmetra :_neutral (scoot 10)]]
     "Oh! We’re up against her today."]
    ["Reaper" [[:reaper :_extra (scoot 10)] [:mccree :_laugh (scoot -10)] [:ana :_roll-eyes (scoot -25)] [:symmetra :_confused (scoot 10)]]
     "WHAT? IT IS CRITICAL THAT I AM PREPARED, THEN. LEAVE ME BE."]
    :-> [:diner :prepare 0]]})
