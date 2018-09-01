(ns syms-qual.data.scenes.route-66.options
  (:require [carmen.util :as anim :refer [scoot move]]))

(defn talk-to [name date]
  (fn [state]
    (-> state
        (assoc  (keyword "route-66" name) true)
        (update :route-66/first-chat #(or %1 %2) (keyword name)))))

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
    ["Talk to Reaper" (comp not :route-66/reaper) reaper-option]
    ["Talk to Ana and McCree" (comp not :route-66/ana) ana-option]
    ["Talk to Roadhog" (comp not :route-66/roadhog) roadhog-option]]

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
    ["Symmetra" [[:reaper :_neutral (scoot -80 -10 1.5)] [:symmetra :_helloNeutral (scoot 80 0 1.5)]]
     "Gabriel, I mean, Reaper."]
    ["Reaper" [[:reaper :_explain (scoot -10)] [:symmetra :_neutral]]
     "WHAT IS IT?"]
    ["Symmetra" [[:reaper :_neutral (scoot -10)] [:symmetra :_explain]]
     "Do you have any additional tactical input on the enemy team?"]
    ["Reaper" [[:reaper :_point-up (scoot -10)] [:symmetra :_neutral]]
     "THEY ARE ALL A BUNCH OF INCOMPETENTS. THE ONLY REAL THREAT IS SOMBRA."]
    ["Symmetra" [[:reaper :_neutral (scoot -10)] [:symmetra :_confused]]
     "Sombra?"]
    ["Reaper" [[:reaper :_explain (scoot -10)] [:symmetra :_neutral]]
     "YES. AN EFFECTIVE HACKER. SHE PERFECTLY COUNTERS MY KIT. I SUSPECT TALON HIRED HER BECAUSE I AM UNSTOPPABLE OTHERWISE."]
    ["Reaper" [[:reaper :_phoneCheck (scoot -10)] [:symmetra :_smile]]
     "HERE WE ARE ON VACATIO-- I MEAN A LEGITIMATE BUSINESS TRIP THAT SOMBRA DID NOT PAY FOR WITH SIPHONED OVERWATCH FUNDS. SHE'S THE ONE IN THE MIDDLE."]
    :-> [:diner :dialogue [:option 3 :reaper] :photo]]

   [:diner :dialogue [:option 3 :reaper] :photo]
   [:miranda/characters
    [[[:photos :_sombraDate0] [:phones :_reaperHand]]]
    :-> [:diner :option [:option 3 :reaper] 0]]

   [:diner :option [:option 3 :reaper] 0]
   [:miranda/option
    "Symmetra" [[:photos :_sombraDate0] [:phones :_reaperHand]]
    "Are those...vibrams? "
    "That hairstyle is an interesting choice for a terrorist."
    "[Quietly blush]"]

   [:diner :option [:option 3 :reaper] 0 0]
   [:miranda/dialogue
    ["Reaper" [[:photos :_sombraDate0] [:phones :_reaperHand]]
     "GOOD EYES. THESE SWEET VIBRAMS ARE THE SOURCE OF HER LEGENDARY MOBILITY."]
    :-> [:diner :dialogue [:option 3 :reaper] 1]]

   [:diner :option [:option 3 :reaper] 0 1]
   [:miranda/dialogue
    ["Reaper" [[:photos :_sombraDate0] [:phones :_reaperHand]]
     "I AGREE. ALL BLACK IS THE BEST COLOR. SHE INSISTS ON THE PURPLE FOR DATING PURPOSES. I'LL NEVER UNDERSTAND THESE MODERNS GAYS."]
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
    ["Reaper" [[:reaper :_point-up (scoot -75 -10 1)] [:symmetra :_embarassed (scoot -25 0 1)]]
     "SHE WILL HACK HEALTHPACKS, WHICH IS A HUGE SETBACK SINCE ANA SPENDS MORE TIME SHOOTING THE ENEMY THAN HEALING. THANKFULLY, WE HAVE YOU AS ADDITIONAL SUPPORT."]
    ["Symmetra" [[:reaper :_neutral (scoot -10)] [:symmetra :_explainUncomfortable]]
     "Healing is not part of my functions."]
    ["Reaper" [[:reaper :_extra (scoot -10)] [:symmetra :_frown]]
     "WAIT, WHY DID YOU ENLIST AS A SUPPORT HERO? I WOULDN’T HAVE COMPOSED THE TEAM THIS WAY IF I KNEW."]
    ["Symmetra" [[:reaper :_exasperated (scoot -10)] [:symmetra :_explainAngry]]
     "My functions all support you. As for my offensive bent, one does not need to be supported if the enemy is already dead."]
    ["Reaper" [[:reaper :_point-up (scoot -10)] [:symmetra :_frown]]
     "OF COURSE! DEATH. VERY FINE. WE WILL DECIMATE THE ENEMY TEAM BEFORE NEEDING TO HEAL. EXCELLENT STRATEGY."]
    ["Symmetra" [[:reaper :_neutral (scoot -10)] [:symmetra :_explainWTF]]
     "Sure."]
    ["Reaper" [[:reaper :_point-up (scoot -10)] [:symmetra :_WTF]]
     "GOOD TALK."]
     ["Reaper" [[:reaper :_headphones (scoot -10)] [:symmetra :_WTF]]
      "NOW IF YOU’LL EXCUSE ME I HAVE SOME EVANESCENCE I NEED TO GO LISTEN TO."]
    :transition :miranda/conditional
    option-end]

   [:diner :option 3 1]
   [:miranda/dialogue
    ["Ana" [[:mccree :_neutral (scoot -80 0 1.5)][:ana :_sass (scoot -80 -20 1.5)] [:symmetra :_neutral (scoot 80 0 1.5)]]
     "Satya, darling. Why don’t you take a seat?"]
    ["Symmetra" [[:mccree :_neutral][:ana :_sass (scoot -20)] [:symmetra :_helloWarm]]
     "Thank you. I will rest my feet for a while."]
    :-> [:diner :option [:option 3 :ana] 0]]

   [:diner :option [:option 3 :ana] 0]
   [:miranda/option
    "Symmetra" [[:mccree :_neutral] [:ana :_sass (scoot -20)] [:symmetra :_neutral]]
    "Reaper was a poor choice for a captain."
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
    ["Ana" [[:mccree :_phoneTexting] [:ana :_roll-eyes (scoot -20)] [:symmetra :_neutral]]
     "What is there to say? When does violence actually resolve much in the world? Sure, Overwatch was needed for the Omnic Crisis, but outside of situations like that, violence only tends to exacerbate the conditions that caused the violence in the first place."]
    ["Ana" [[:mccree :_phoneTexting] [:ana :_explain (scoot -20)] [:symmetra :_neutral]]
     "You enjoy order, do you not? We Overwatch agents are dangerous. There cannot be order if we are allowed to go free. The world cannot get rid of us either. God forbid, another Omnic Crisis type event occurs, and the world no longer has such a military force."]
    ["McCree" [[:mccree :_fingerGuns] [:ana :_sass (scoot -20)] [:symmetra :_neutral]]
     "In peace, the world has no use for soldiers, darling."]
    ["Symmetra" [[:mccree :_neutral] [:ana :_sass (scoot -20)] [:symmetra :_explain]]
     "So this program allows Overwatch to exist in a bubble? To develop technology and maintain its super soldiers without letting them loose on the world?"]
    ["Ana" [[:mccree :_neutral] [:ana :_drink (scoot -20)] [:symmetra :_neutral]]
     "That's right. Vishkar probably wanted to get its hands in the cookie jar. And here you are."]
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
     "Oh Jesse, knock it off. Anyway, Satya, I’m team captain. I only went through with Reaper’s draft because I thought it was fine."]
    :-> [:diner :dialogue [:option 3 :ana] 1]]

   [:diner :dialogue [:option 3 :ana] 1]
   [:miranda/dialogue
    ["Ana" [[:mccree :_phoneTexting] [:ana :_explain (scoot -20)] [:symmetra :_neutral]]
     "Anyway, as it's your first day, I do have a piece of advice for you. My daughter, Fareeha, is on the other team. She uses long range rockets, which I think will pose a threat to your static defenses."]
    ["McCree" [[:mccree :_selfie] [:ana :_drink (scoot -20)] [:symmetra :_neutral]]
     "I’d be extra careful with her today. She’s been dumped recently and hasn’t been taking it well."]
    ["Ana" [[:mccree :_selfie] [:ana :_cranky (scoot -20)] [:symmetra :_neutral]]
     "Put that phone down, Jesse. This is serious."]
    ["McCree" [[:mccree :_phoneTexting] [:ana :_cranky (scoot -20)] [:symmetra :_confused]]
     "I can be serious! Here, you need to watch out for the one with legs that could crush a watermelon."]
    :-> [:diner :dialogue [:option 3 :ana] :photo]]

   [:diner :dialogue [:option 3 :ana] :photo]
   [:miranda/characters
    [[[:photos :_pharahDate0] [:phones :_mccreeHand]]]
    :-> [:diner :dialogue [:option 3 :ana] :photo 1]]

   [:diner :dialogue [:option 3 :ana] :photo 1]
   [:miranda/dialogue
    ["Symmetra" [[:symmetra :_embarassed (scoot -25)]]
     "Such power. I can see in her eyes that she is a woman of much discipline. I admire that."]
    ["Ana" [[:mccree :_phoneSteal (scoot -60 -0 1)] [:symmetra :_embarassed (scoot -25 0 1)]]
     "This is mine now. You’re not getting it back."]
    ["McCree" [[:mccree :_phoneSteal2] [:ana :_cranky (scoot -20)] [:symmetra :_neutral]]
     "But Hanzo hasn’t sent me a selfie back."]
    ["Ana" [[:mccree :_phoneSteal2] [:ana :_explain (scoot -20)] [:symmetra :_neutral]]
     "You best be on your way. This is going to take a while."]
    ["McCree" [[:mccree :_phoneSteal2] [:ana :_drink (scoot -20)] [:symmetra :_awkward]]
     "Ana, pleeeeeeease! I was gonna get that hot left titty pic!"]
    :transition :miranda/conditional
    option-end]

   [:diner :option 3 2]
   [:miranda/dialogue
    ["Roadhog" [[:roadhog :_neutral (scoot -80 -12 1.5)] [:symmetra :_neutral (scoot 80 0 1.5)]]
     "Hi."]
    ["Symmetra" [[:roadhog :_neutral (scoot -12)] [:symmetra :_helloNeutral]]
     "H-hello."]
    ["Roadhog" [[:roadhog :_neutral2 (scoot -12)] [:symmetra :_neutral]]
     "Welcome to the team. I’m the Hog. Want some tea?"]
    :-> [:diner :option :roadhog]]

   [:diner :option :roadhog]
   [:miranda/option
    "Symmetra" [[:roadhog :_neutral2 (scoot -12)] [:symmetra :_neutral]]
    "You don’t strike me as the sort of person who drinks tea."
    "Oh! Thank you."]

   [:diner :option :roadhog 0]
   [:miranda/dialogue
    ["Roadhog" [[:roadhog :_drink (scoot -12)] [:symmetra :_neutral]]
     "Old habit. Helps me focus. Cups are over there."]
    ["Symmetra" [[:roadhog :_drink (scoot -12)] [:symmetra :_no]]
     "Thank you, but I will decline. I would like to avoid caffeine jitters."]
    :-> [:diner :dialogue [:option 3 :roadhog] 1]]

   [:diner :option :roadhog 1]
   [:miranda/dialogue
    ["Roadhog" [[:roadhog :_drink (scoot -12)] [:symmetra :_neutral]]
     "Help yourself. I make it strong, there’s hot water in the back if you want it weaker."]
    ["Symmetra" [[:roadhog :_drink (scoot -12)] [:symmetra :_smile]]
     "I will not take much. I’d like to avoid the jitters."]
    :-> [:diner :dialogue [:option 3 :roadhog] 1]]

   [:diner :dialogue [:option 3 :roadhog] 1]
   [:miranda/dialogue
    ["Symmetra" [[:roadhog :_neutral (scoot -12)] [:symmetra :_explainUncomfortable]]
     "So, what brings you to Overwatch?"]
    ["Roadhog" [[:roadhog :_neutral2 (scoot -12)] [:symmetra :_neutral]]
     "Keeping an eye on a friend."]
    ["Symmetra" [[:roadhog :_neutral2 (scoot -12)] [:symmetra :_confused]]
     "A friend?"]
    ["Roadhog" [[:roadhog :_drink (scoot -12)] [:symmetra :_confused]]
     "Of sorts. Junkrat. I’m his... bodyguard. He’s a good boy. Mostly."]
    ["Symmetra" [[:roadhog :_neutral (scoot -12)] [:symmetra :_thinking]]
     "Junkrat… that sounds familiar..."]
    ["Roadhog" [[:roadhog :_neutral2 (scoot -12)] [:symmetra :_neutral]]
     "Probably this."]
    :-> [:diner :dialogue [:option 3 :roadhog] :photo]]

   [:diner :dialogue [:option 3 :roadhog] :photo]
   [:miranda/characters
    [[[:photos :_wanted]]]
    :-> [:diner :dialogue [:option 3 :roadhog] 2]]

   [:diner :dialogue [:option 3 :roadhog] 2]
   [:miranda/dialogue
    ["Symmetra" [[:roadhog :_drink (scoot -12)] [:symmetra :_explainWTF]]
     "Ah yes, I remember now I saw you on the news. The situation with Lumerico. You are criminals! What are you doing as part of a worldwide peacekeeping organization?"]
    ["Roadhog" [[:roadhog :_shrug (scoot -12)] [:symmetra :_WTF]]
     "They offered. We accepted. Same as you."]
    ["Symmetra" [[:roadhog :_neutral (scoot -12)] [:symmetra :_angry]]
     "We are nothing alike."]
    ["Roadhog" [[:roadhog :_drink (scoot -12)] [:symmetra :_angry]]
     "Maybe. Doesn’t matter. We’re here now. And now’s what matters. A group like this leaves some space for... serendipity."]
    ["Symmetra" [[:roadhog :_neutral (scoot -12)] [:symmetra :_skeptical]]
     "An interesting perspective."]
    ["Roadhog" [[:roadhog :_neutral (scoot -12)] [:symmetra :_neutral]]
     "..."]
    [nil [[:roadhog :_neutral (scoot -12)] [:symmetra :_neutral]]
     "He seems to have gone back to meditating."]
    :transition :miranda/conditional
    option-end]})
