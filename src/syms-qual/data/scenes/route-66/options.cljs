(ns syms-qual.data.scenes.route-66.options
  (:require [carmen.util :as anim :refer [scoot]]))

(defn talk-to [name date]
  (fn [state]
    (-> state
        (assoc  (keyword "route-66" name) true)
        (update :route-66/first-chat #(or %1 %2) (keyword name))
        (update (keyword "points" date) + 1))))

(defn talked [& names]
  (fn [state] (reduce #(and %1 (%2 state)) true names)))

(def option-end
  [(talked :route-66/roadhog :route-66/ana :route-66/reaper) [:-> [:diner :junkrat]]
   :else [:-> [:diner :prepare]]])

(def reaper-option
  [:transition :miranda/mutation->basic
   [[:-> [:diner :option 3 0]]
    (talk-to "reaper" "sombra")]])

(def ana-option
  [:transition :miranda/mutation->basic
   [[:-> [:diner :option 3 1]]
    (talk-to "ana" "pharah")]])

(def roadhog-option
  [:transition :miranda/mutation->basic
   [[:-> [:diner :option 3 2]]
    (talk-to "roadhog" "junkrat")]])

(def data
  {[:diner :prepare 0]
   [:miranda/text-option
    "You have a few minutes before the match begins, which teammates will you engage with?"
    ["Reaper" (comp not :route-66/reaper) reaper-option]
    ["Ana" (comp not :route-66/ana) ana-option]
    ["Roadhog" (comp not :route-66/roadhog) roadhog-option]]

   [:diner :prepare]
   [:miranda/text-option
    "What will you do?"
    ["Converse with your other teammates"
     (constantly true)
     [:transition :miranda/conditional
      [(talked :route-66/roadhog :route-66/ana)    reaper-option
       (talked :route-66/roadhog :route-66/reaper) ana-option
       (talked :route-66/ana :route-66/reaper)     roadhog-option
       :else [:-> [:diner :prepare 0]]]]]
    ["Prepare for the attack"
     (constantly true)
     [:-> [:diner :junkrat]]]]

   [:diner :option 3 0]
   [:miranda/dialogue
    ["Symmetra" [[:reaper :_neutral (scoot -10)] [:symmetra :_helloNeutral]]
     "Gabriel, I mean, Reaper."]
    ["Reaper" [[:reaper :_explain (scoot -10)] [:symmetra :_neutral]]
     "WHAT IS IT?"]
    ["Symmetra" [[:reaper :_neutral (scoot -10)] [:symmetra :_explain]]
     "I noticed you did not provide us with information on the rest of the enemy team. I know Lucio is on the enemy team, but who else?"]
    ["Reaper" [[:reaper :_point-up (scoot -10)] [:symmetra :_neutral]]
     "FAREEHA, ANA’S DAUGHTER. JUNKRAT, ROADHOG’S LITTLE BUDDY. REINHARDT, THAT OLD FOOL. THERE’S TRACER, WHICH IS AWKWARD CONSIDERING SHE AND WIDOWMAKER HAD SOME SORT OF ALTERCATION. SHE WENT OUT AND ELIMINATED FIVE HUNDRED OF THE TOP STRAIGHT SHOOTERS IN THE BUSINESS AFTER IT. THERE’S MEI, WHO TERRIFIES EVEN ME. THEY ARE ALL A BUNCH OF INCOMPETENTS. THE ONLY REAL THREAT IS SOMBRA."]
    ["Symmetra" [[:reaper :_neutral (scoot -10)] [:symmetra :_confused]]
     "Sombra?"]
    ["Reaper" [[:reaper :_explain (scoot -10)] [:symmetra :_neutral]]
     "YES. AN EFFECTIVE HACKER. SHE COUNTERS MY GHOST FORM INTO DEATH BLOSSOM PERFECTLY BY HACKING."]
    ["Reaper" [[:reaper :_phoneCheck (scoot -10)] [:symmetra :_smile]]
     "HERE ARE WE ON VACATION."]
    :-> [:diner :dialogue [:option 3 :reaper] :photo]]

   [:diner :dialogue [:option 3 :reaper] :photo]
   [:miranda/characters
    [[[:photos :_sombraDate0] [:phones :_reaperHand]]]
    :-> [:diner :dialogue [:option 3 :reaper] :photo 1]]

   [:diner :dialogue [:option 3 :reaper] :photo 1]
   [:miranda/dialogue
    [nil [[:photos :_sombraDate0] [:phones :_reaperHand]]
     "It’s a picture of Reaper, Sombra, and Widowmaker in France. Widowmaker is clearly annoyed."]
    :-> [:diner :option [:option 3 :reaper] 0]]

   [:diner :option [:option 3 :reaper] 0]
   [:miranda/option
    "Symmetra" [[:photos :_sombraDate0] [:phones :_reaperHand]]
    "Are those...vibrams? "
    "The chaos of her hair is, interesting."
    "[Quietly blush]"]

   [:diner :option [:option 3 :reaper] 0 0]
   [:miranda/dialogue
    ["Reaper" [[:photos :_sombraDate0] [:phones :_reaperHand]]
     "GOOD EYES. THESE SWEET VIBRAMS ARE THE SOURCE OF HER LEGENDARY MOBILITY."]
    :-> [:diner :dialogue [:option 3 :reaper] 1]]

   [:diner :option [:option 3 :reaper] 0 1]
   [:miranda/dialogue
    ["Reaper" [[:photos :_sombraDate0] [:phones :_reaperHand]]
     "I AGREE. ALL BLACK IS THE BEST COLOR. SHE INSISTS ON THE PURPLE FOR DATING PURPOSES."]
    :-> [:diner :dialogue [:option 3 :reaper] 1]]

   [:diner :option [:option 3 :reaper] 0 2]
   [:miranda/dialogue
    ["Reaper" [[:photos :_sombraDate0] [:phones :_reaperHand]]
     "YES, YOUR SILENCE SPEAKS VOLUMES. AN INTIMIDATING AGENT. I RECOMMEND STAYING AWAY FROM HER."]
    :-> [:diner :dialogue [:option 3 :reaper] 1]]

   [:diner :dialogue [:option 3 :reaper] 1]
   [:miranda/dialogue
    ["Symmetra" [[:symmetra :_embarassed (scoot -25)]]
     "What a striking agent. I have heard tales of her sabotaging Vishkar operations in Mexico. She is the enemy, but I can’t help but stare!"]
    ["Reaper" [[:reaper :_point-up (scoot -75 -10 3)] [:symmetra :_embarassed (scoot -25 0 2)]]
     "SHE WILL HACK HEALTHPACKS, WHICH IS CRITICAL SINCE ANA SPENDS MORE TIME SHOOTING THE ENEMY THAN HEALING. THANKFULLY, WE HAVE YOU AS ADDITIONAL SUPPORT."]
    ["Symmetra" [[:reaper :_neutral (scoot -10)] [:symmetra :_explain]]
     "Healing is not part of my functions. I have turrets, shields both personal and mobile, teleporters, slow zoning projectiles, and a low range homing laser."]
    ["Reaper" [[:reaper :_extra (scoot -10)] [:symmetra :_frown]]
     "WAIT WHY DID YOU ENLIST AS A SUPPORT HERO I WOULDN’T HAVE COMPOSED THE TEAM THIS WAY IF I KNEW!"]
    ["Symmetra" [[:reaper :_exasperated (scoot -10)] [:symmetra :_explainAngry]]
     "My functions all support you. As for my offensive bent, one does not need to be supported if the enemy is already dead."]
    ["Reaper" [[:reaper :_point-up (scoot -10)] [:symmetra :_frown]]
     "OF COURSE! DEATH. VERY GOOD. WE WILL DECIMATE THE ENEMY TEAM BEFORE NEEDING TO HEAL. EXCELLENT STRATEGY."]
    ["Symmetra" [[:reaper :_neutral (scoot -10)] [:symmetra :_explainWTF]]
     "I am glad we are in agreement."]
    ["Reaper" [[:reaper :_headphones (scoot -10)] [:symmetra :_neutral]]
     "GOOD TALK. NOW IF YOU’LL EXCUSE ME I HAVE SOME EVANESCENCE I NEED TO GO LISTEN TO."]
    :-> [:diner :prepare]]

   [:diner :option 3 1]
   [:miranda/dialogue
    ["Ana" [[:mccree :_neutral][:ana :_sass (scoot -20)] [:symmetra :_neutral]]
     "Satya, darling. Why don’t you take a seat?"]
    ["Symmetra" [[:mccree :_neutral][:ana :_sass (scoot -20)] [:symmetra :_helloWarm]]
     "Thank you. I will rest my feet for a while."]
    :-> [:diner :option [:option 3 :ana] 0]]

   [:diner :option [:option 3 :ana] 0]
   [:miranda/option
    "Symmetra" [[:mccree :_neutral] [:ana :_sass (scoot -20)] [:symmetra :_neutral]]
    "Who are we up against today?"
    "You didn’t finish telling me what your motivations were for engaging in this dirty business."
    "The team captain seems rather bizarre."]

   [:diner :option [:option 3 :ana] 0 0]
   [:miranda/dialogue
    ["Ana" [[:mccree :_phoneTexting] [:ana :_drink (scoot -20)] [:symmetra :_neutral]]
     "Reaper? He’s not captain darling, I am."]
    ["Symmetra" [[:mccree :_phoneTexting] [:ana :_sass (scoot -20)] [:symmetra :_bewildered]]
     "Oh? He was so insistent on deciding the strategy."]
    ["Ana" [[:mccree :_phoneTexting] [:ana :_explain (scoot -20)] [:symmetra :_neutral]]
     "Not all of us take things as seriously as him. Reaper gets caught up in competition to impress Jack."]
    ["McCree" [[:mccree :_fingerGuns] [:ana :_sass (scoot -20)] [:symmetra :_neutral]]
     "It’s an edgy gay thing, darling."]
    :-> [:diner :dialogue [:option 3 :ana] 1]]

   [:diner :option [:option 3 :ana] 0 1]
   [:miranda/dialogue
    ["Ana" [[:mccree :_neutral] [:ana :_roll-eyes (scoot -20)] [:symmetra :_neutral]]
     "What is there to say? When does violence actually resolve much in the world? Sure, Overwatch was needed for the Omnic Crisis, but outside of situations like that, violence only tends to exacerbate the conditions that caused the violence in the first place. You enjoy order, do you not? We Overwatch agents are dangerous. There cannot be order if we are allowed to go free. The world cannot get rid of us either. God forbid, another Omnic Crisis type event occurs, and the world no longer has such a military force."]
    ["McCree" [[:mccree :_phoneTexting] [:ana :_sass (scoot -20)] [:symmetra :_neutral]]
     "In peace, the world has no use for soldiers, darling."]
    ["Symmetra" [[:mccree :_phoneTexting] [:ana :_sass (scoot -20)] [:symmetra :_explain]]
     "So this program allows Overwatch to exist in a bubble? To develop technology and maintain its super soldiers without letting them loose on the world."]
    ["Ana" [[:mccree :_phoneTexting] [:ana :_drink (scoot -20)] [:symmetra :_neutral]]
     "Vishkar was probably invited to send an agent."]
    :-> [:diner :dialogue [:option 3 :ana] 1]]

   [:diner :option [:option 3 :ana] 0 2]
   [:miranda/dialogue
    ["Ana" [[:mccree :_phoneTexting] [:ana :_cranky (scoot -20)] [:symmetra :_neutral]]
     "Well! That’s rather rude."]
    ["Symmetra" [[:mccree :_phoneTexting] [:ana :_cranky (scoot -20)] [:symmetra :_confused]]
     "You seemed to be keen on poking fun at Reaper earlier. Why defend him now?"]
    ["Ana" [[:mccree :_phoneTexting] [:ana :_drink (scoot -20)] [:symmetra :_neutral]]
     "I’m not defending him, I’m defending the team captain."]
    ["Symmetra" [[:mccree :_phoneTexting] [:ana :_sass (scoot -20)] [:symmetra :_skeptical]]
     "Reaper is not captain? He was so loud about organizing our strategy."]
    ["McCree" [[:mccree :_fingerGuns] [:ana :_sass (scoot -20)] [:symmetra :_neutral]]
     "The only thing Reaper is captain of is team gay. Like, don’t get me wrong, I’m really gay. Once I make sure I get play of the match, I’m just going to go sit in a corner and text my boyfriend. Reaper though? Overwatch is just a complex fetish thing between him and Jack."]
    ["Ana" [[:mccree :_neutral] [:ana :_roll-eyes (scoot -20)] [:symmetra :_neutral]]
     "Oh Jesse, knock it off. Anyway, darling, I’m team captain. I only went through with Reaper’s team draft because I thought it was fine"]
    :-> [:diner :dialogue [:option 3 :ana] 1]]

   [:diner :dialogue [:option 3 :ana] 1]
   [:miranda/dialogue
    ["Ana" [[:mccree :_neutral] [:ana :_explain (scoot -20)] [:symmetra :_neutral]]
     "Now, in this match, you should take care in approaching three different agents. Normally I’d tell you to watch for Tracer, but, I think Amelie is pretty specifically going to be trying to shut her down."]
    ["McCree" [[:mccree :_phoneTexting] [:ana :_cranky (scoot -20)] [:symmetra :_neutral]]
     "Dang homos."]
    ["Ana" [[:mccree :_phoneTexting] [:ana :_drink (scoot -20)] [:symmetra :_neutral]]
     "Be quiet, Jesse, Junkrat is an explosives expert. He will have an easy time disabling your defenses from long range. Sombra is an excellent infiltrator and hacker. Her weaponry and mobility will also wreck havoc on your systems. The last agent is my daughter, Fareeha, who uses long range rockets. I’d be extra careful with her today. She’s been dumped and hasn’t been taking it well."]
    ["McCree" [[:mccree :_selfie] [:ana :_roll-eyes (scoot -20)] [:symmetra :_neutral]]
     "Homos, not even once."]
    ["Ana" [[:mccree :_selfie] [:ana :_cranky (scoot -20)] [:symmetra :_neutral]]
     "Put that phone down, Jesse, we get it, you’re gay. This is serious."]
    ["McCree" [[:mccree :_phoneTexting] [:ana :_cranky (scoot -20)] [:symmetra :_confused]]
     "Look, I’m serious, here’s Fareeha! Be careful! She’s lost her bird wife."]
    :-> [:diner :dialogue [:option 3 :ana] :photo]]

   [:diner :dialogue [:option 3 :ana] :photo]
   [:miranda/characters
    [[[:photos :_pharahDate0] [:phones :_mccreeHand]]]
    :-> [:diner :dialogue [:option 3 :ana] :photo 1]]

   [:diner :dialogue [:option 3 :ana] :photo 1]
   [:miranda/dialogue
    [nil [[:photos :_pharahDate0] [:phones :_mccreeHand]]
     "It's Pharah in the gym squatting some serious weight with Mercy spotting, behind Hanzo and McCree in a selfie, Ana quickly snatches the phone away."]
    ["Symmetra" [[:symmetra :_embarassed (scoot -25)]]
     "Such power. I can see in her eyes that she is a woman of much discipline. I admire that."]
    ["Ana" [[:mccree :_phoneSteal (scoot -60 -0 3)] [:symmetra :_embarassed (scoot -25 0 2)]]
     "This is mine now. You’re not getting it back."]
    ["McCree" [[:mccree :_phoneSteal2] [:ana :_cranky (scoot -20)] [:symmetra :_neutral]]
     "But Hanzo hasn’t sent me a selfie back."]
    ["Ana" [[:mccree :_phoneSteal2] [:ana :_explain (scoot -20)] [:symmetra :_neutral]]
     "You best be on your way. This is going to take a while."]
    ["McCree" [[:mccree :_phoneSteal2] [:ana :_drink (scoot -20)] [:symmetra :_neutral]]
     "Ana, pleeeeeeease!"]
    :-> [:diner :prepare]]

   [:diner :option 3 2]
   [:miranda/dialogue
    ["Roadhog" [[:roadhog :_neutral] [:symmetra :_neutral]]
     "Hi."]
    ["Symmetra" [[:roadhog :_neutral] [:symmetra :_helloNeutral]]
     "H-hello."]
    ["Roadhog" [[:roadhog :_neutral2] [:symmetra :_neutral]]
     "Welcome to the team. I’m the Hog. Want some tea?"]
    :-> [:diner :option :roadhog]]

   [:diner :option :roadhog]
   [:miranda/option
    "Symmetra" [[:roadhog :_neutral2] [:symmetra :_neutral]]
    "You don’t strike me as the sort of person who drinks tea."
    "Oh! Thank you."]

   [:diner :option :roadhog 0]
   [:miranda/dialogue
    ["Roadhog" [[:roadhog :_drink] [:symmetra :_neutral]]
     "Old habit. Helps me focus. Cups are over there."]
    ["Symmetra" [[:roadhog :_drink] [:symmetra :_no]]
     "Thank you, but I will decline. I would like to avoid caffeine jitters."]
    :-> [:diner :dialogue [:option 3 :roadhog] 1]]

   [:diner :option :roadhog 1]
   [:miranda/dialogue
    ["Roadhog" [[:roadhog :_drink] [:symmetra :_neutral]]
     "Help yourself. I make it strong, there’s hot water in the back if you want it weaker."]
    ["Symmetra" [[:roadhog :_drink] [:symmetra :_smile]]
     "I will not take much. I’d like to avoid the jitters."]
    :-> [:diner :dialogue [:option 3 :roadhog] 1]]

   [:diner :dialogue [:option 3 :roadhog] 1]
   [:miranda/dialogue
    ["Symmetra" [[:roadhog :_neutral] [:symmetra :_neutral]]
     "So, what brings you to Overwatch?"]
    ["Roadhog" [[:roadhog :_neutral2] [:symmetra :_neutral]]
     "Keeping an eye on a friend."]
    ["Symmetra" [[:roadhog :_neutral2] [:symmetra :_confused]]
     "A friend?"]
    ["Roadhog" [[:roadhog :_drink] [:symmetra :_neutral]]
     "Of sorts. Junkrat. I’m his bodyguard. He’s a good boy. Mostly."]
    ["Symmetra" [[:roadhog :_neutral] [:symmetra :_thinking]]
     "Junkrat… that sounds familiar..."]
    ["Roadhog" [[:roadhog :_neutral2] [:symmetra :_neutral]]
     "This maybe?"]
    :-> [:diner :dialogue [:option 3 :roadhog] :photo]]

   [:diner :dialogue [:option 3 :roadhog] :photo]
   [:miranda/characters
    [[[:photos :_wanted]]]
    :-> [:diner :dialogue [:option 3 :roadhog] 2]]

   [:diner :dialogue [:option 3 :roadhog] 2]
   [:miranda/dialogue
    [nil [[:photos :_wanted]] "Roadhog points at the photo."]
    ["Symmetra" [[:roadhog :_drink] [:symmetra :_frown]]
     "I remember now I saw you on the news. You are criminals! What are you doing as part of a worldwide peacekeeping organization."]
    ["Roadhog" [[:roadhog :_shrug] [:symmetra :_frown]]
     "They offered. We accepted. Same as you."]
    ["Symmetra" [[:roadhog :_neutral] [:symmetra :_angry]]
     "We are nothing alike."]
    ["Roadhog" [[:roadhog :_drink] [:symmetra :_angry]]
     "Maybe. Doesn’t matter. We’re here now. And now’s what matters. A group like this leaves some space for… serendipity."]
    ["Symmetra" [[:roadhog :_neutral] [:symmetra :_skeptical]]
     "An interesting perspective."]
    ["Roadhog" [[:roadhog :_neutral2] [:symmetra :_neutral]]
     "More tea?"]
    ["Symmetra" [[:roadhog :_neutral2] [:symmetra :_no]]
     "No, thanks."]
    ["Roadhog" [[:roadhog :_neutral] [:symmetra :_neutral]]
     "..."]
    ["Symmetra" [[:roadhog :_drink] [:symmetra :_neutral]]
     "..."]
    [nil [[:roadhog :_neutral] [:symmetra :_neutral]]
     "He seems to have gone back to meditating."]
    :transition :miranda/conditional
    option-end]})
