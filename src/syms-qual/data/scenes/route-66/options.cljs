(ns syms-qual.data.scenes.route-66.options
  (:require [syms-qual.data.animation :as anim :refer [scoot]]))

(def data
  {[:diner :option 3]
  [:miranda/text-option
   "You have a few minutes before the match begins, which teammates will you engage with?"
   "Reaper"
   "Ana and McCree"
   "Roadhog"]

  [:diner :prepare]
  [:miranda/text-option
   "What will you do?"
   "Converse with your other teammates"
   "Prepare for the attack"]

  [:diner :option 3 0]
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
   ["Reaper" []
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

  [:diner :option 3 1]
  [:miranda/dialogue
   ["Ana" [] "Satya, darling. Why don’t you take a seat?"]
   ["Symmetra" [] "Thank you. I will rest my feet for a while"]
   :-> [:diner :option [:option 3 :ana] 0]]

  [:diner :option [:option 3 :ana] 0]
  [:miranda/option
   "Symmetra" []
   "Who are we up against today?"
   "You didn’t finish telling me what your motivations were for engaging in this dirty business."
   "The team captain seems rather bizarre."]

  [:diner :option [:option 3 :ana] 0 0]
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

  [:diner :option [:option 3 :ana] 0 1]
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

  [:diner :option [:option 3 :ana] 0 2]
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

  [:diner :option 3 2]
  [:miranda/dialogue
   ["Roadhog" []
    "Hi"]
   ["Symmetra" []
    "H-hello"]
   ["Roadhog" []
    "Welcome to the team. I’m the Hog. Want some tea"]
   :-> [:diner :option :roadhog]]

  [:diner :option :roadhog]
  [:miranda/option
   "Symmetra" []
   "You don’t strike me as the sort of person who drinks tea."
   "Oh! Thank you."]

  [:diner :option :roadhog 0]
  [:miranda/dialogue
   ["Roadhog" []
    "Old habit. Helps me focus. Cups are over there"]
   ["Symmetra" []
    "Thank you, but I will decline. I would like to avoid caffeine jitters"]
   :-> [:diner :dialogue [:option 3 :roadhog] 1]]

  [:diner :option :roadhog 1]
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
   :-> [:diner :prepare]]})
