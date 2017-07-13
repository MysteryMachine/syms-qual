(ns syms-qual.data.scenes.route-66.dates
  (:require [carmen.util :as anim :refer [scoot qmove fade-out]]))

(defn first-chat [char]
  #(= char (:route-66/first-chat %)))

(def data
  {[:diner :junkrat]
   [:miranda/narration
    "Athena’s mechanized voice rings over the loud speakers: “Attack commences in thirty seconds” You make your way to one of the side exits hoping that an early flank will provide your team with a tactical advantage, when you hear a strange noise..."
    :-> [:diner :dialogue 3]]

   [:diner :dialogue 3]
   [:miranda/dialogue
    ["Symmetra" [[:symmetra :_confused (scoot -25)]]
     "What is this snickering I hear at the door? Is a foe setting up a trap?"]
    ["???" [[:symmetra :_frown (scoot -25)]]
     "Hee hee hee hee."]
    ["Symmetra" [[:junkrat :_triggerWave (scoot -65 -10 3)] [:symmetra :_frown (scoot -25 0 2)]]
     "Just what do you think you’re doing?"]
    ["Junkrat" [[:junkrat :_fibbin (scoot -10)] [:symmetra :_frown]]
     "Oi! Oh! Wowee! Why hello there! Fine weather we’re having!"]
    ["Symmetra" [[:junkrat :_triggerNeutral (scoot -10)] [:symmetra :_angry]]
     "This tactic of standing right in front of our spawn point. I can’t imagine it will work out for you."]
    ["Junkrat" [[:junkrat :_triggerWink (scoot -10)] [:symmetra :_angry]]
     "Oy! Giving strategic advice to your opponent before a match! Quite a sporting move."]
    ["Symmetra" [[:junkrat :_triggerNeutral (scoot -10)] [:symmetra :_explain]]
     "I think of it more as a statement of fact."]
    ["Junkrat" [[:junkrat :_triggerIntro (scoot -10)] [:symmetra :_neutral]]
     "So! Allow me to introduce you! I’m the bombastic Junkrat!"]
    :transition :miranda/conditional
    [:route-66/roadhog [:-> [:diner :dialogue 3 :a]]
     :else             [:-> [:diner :dialogue 3 :b]]]]

   [:diner :dialogue 3 :a]
   [:miranda/dialogue
    ["Symmetra" [[:junkrat :_triggerNeutral (scoot -10)] [:symmetra :_smile]]
     "I was talking to your friend just a moment ago. He told me you were a good boy."]
    ["Junkrat" [[:junkrat :_shyblush (scoot -10)] [:symmetra :_smile]]
     "He said what?"]
    ["Symmetra" [[:junkrat :_shyblush (scoot -10)] [:symmetra :_embarassed]]
     "Oh nothing!"]
    ["Symmetra" [[:junkrat :_triggerNeutral (scoot -10)] [:symmetra :_skeptical]]
     "I talked to him about Lumerico. Just what ARE you two doing, pulling a stunt like that and then coming to Overwatch?"]
    :-> [:diner :dialogue 4]]

   [:diner :dialogue 3 :b]
   [:miranda/dialogue
    ["Symmetra" [[:junkrat :_triggerNeutral (scoot -10)] [:symmetra :_bewildered]]
     "I remember now I saw you on the news."]
    ["Junkrat" [[:junkrat :_triggerExplain (scoot -10)] [:symmetra :_frown]]
     "Oh yeah, the Lumerico thing! Me and my associate Roadhog, took the liberty of, ho, ho, liberating some funds! Created a nice distraction! And a nice boom! He he heeee!"]
    ["Symmetra" [[:junkrat :_triggerNeutral (scoot -10)] [:symmetra :_explainAngry]]
     "How can you justify all the lives you disrupted?"]
    :-> [:diner :dialogue 4]]

   [:diner :dialogue 4]
   [:miranda/dialogue
    ["Junkrat" [[:junkrat :_triggerExplain (scoot -10)] [:symmetra :_neutral]]
     "The way I see it, I’m a tinkerer, darl. I built all my gear out of others junk. The wonderful thing about junk is that it gives you the opportunity to make something entirely new! And some things, got to be broke before they can be fixed. ‘Wos that phrase they have about omelets and eggs? Hee hee"]
    ["Symmetra" [[:junkrat :_triggerNeutral (scoot -10)] [:symmetra :_thinking]]
     "Destruction and reconstruction, huh? I suppose Overwatch gives you room for both things."]
    ["Junkrat" [[:junkrat :_triggerAdoringBlush (scoot -10)] [:symmetra :_thinking]]
     "..."]
    ["Junkrat" [[:junkrat :_triggerSmile (scoot -10)] [:symmetra :_neutral]]
     "Well! I suppose it’s time for me to take your, uh, statement of fact, darl. I didn’t catch your name, though."]
    ["Symmetra" [[:junkrat :_triggerNeutral (scoot -10)] [:symmetra :_smile]]
     "Satya. I go by Symmetra in Overwatch."]
    ["Junkrat" [[:junkrat :_triggerWave (scoot -10)] [:symmetra :_helloWarm]]
     "I’d tell you to give ol’ hoggie my warmest wishes, but I’ll be delivering warmth directly to the payload! Heehee! Oh! And watch your step."]
    :-> [:diner :sombra]]

   [:diner :sombra]
   [:miranda/narration
    "Despite your previous comments, you are caught in Junkrat’s trap almost immediately upon starting the match. Kaboom! You have a hard fought round, but your team is stopped just short of the final point. As you are placing turrets outside the diner for your own round on defense, you notice Sombra just inside the door, seemingly preoccupied with the glowing screen in front of her. You attempt to get her attention with a quick tap on the glass."
    :-> [:diner :dialogue 5]]

   [:diner :dialogue 5]
   [:miranda/dialogue
    ["Symmetra" [[:sombra :_browseDickButt (scoot -10)] [:symmetra :_helloWarm]]
     "Hello!"]
    ["Sombra" [[:sombra :_wave (scoot -10)] [:symmetra :_helloWarm]]
     "Ah! Que onda?"]
    ["Symmetra" [[:sombra :_neutral (scoot -10)] [:symmetra :_smile]]
     "You are Sombra, no? Your performance in the previous round was exemplary!"]
    ["Sombra" [[:sombra :_smile (scoot -10)] [:symmetra :_smile]]
     "Ah, querida, thank you! You did well too! I, uh, can’t say it was very pleasant getting zapped by you while you were all blue and glowing."]
    ["Symmetra" [[:sombra :_smile (scoot -10)] [:symmetra :_laugh]]
     "Haha, between you and I, I think Ana boosted me purely to frustrate Reaper. He had this grand tactic that he held supreme. Letting someone else have the Nano Boost was her way of poking fun at him."]
    ["Sombra" [[:sombra :_nostalgic (scoot -10)] [:symmetra :_smile]]
     "Ai, Gabriel, he’s such a tryhard. He and Jack have this weird gay playground romance where they profess their love with violence."]
    ["Symmetra" [[:sombra :_neutral (scoot -10)] [:symmetra :_thinking]]
     "I suppose it should not be unexpected that two soldiers as seasoned as they would express their love on the battlefield. Don’t get me wrong. It’s still..."]
    ["Sombra" [[:sombra :_explain (scoot -10)] [:symmetra :_thinking]]
     "Extra?"]
    ["Symmetra" [[:sombra :_explain (scoot -10)] [:symmetra :_smile]]
     "Yes."]
    ["Sombra" [[:sombra :_smile (scoot -10)] [:symmetra :_smile]]
     "I get it. I mean! Girl! You have some moves! I can really get behind that!"]
    ["Symmetra" [[:sombra :_neutral (scoot -10)] [:symmetra :_skeptical]]
     "I still don’t know if I’m comfortable with the wanton violence."]
    ["Sombra" [[:sombra :_flirty (scoot -10)] [:symmetra :_neutral]]
     "Well, maybe you can get comfortable in some other way?"]
    ["Symmetra" [[:sombra :_flirty (scoot -10)] [:symmetra :_embarassed]]
     "What?"]
    ["Sombra" [[:sombra :_laugh (scoot -10)] [:symmetra :_embarassed]]
     "I’m just saying! People deal with the stress of this fucked up military sisphysian bullshit in different ways -- they hack the system, you know."]
    :transition :miranda/conditional
    [:route-66/reaper [:-> [:diner :sombra :extra]]
     :else            [:-> [:diner :dialogue 6]]]]

   [:diner :sombra :extra]
   [:miranda/dialogue
    ["Symmetra" [[:sombra :_neutral (scoot -10)] [:symmetra :_flirty]]
     "Like a vacation to France?"]
    ["Sombra" [[:sombra :_surprised (scoot -10)] [:symmetra :_flirty]]
     "Hum?"]
    ["Symmetra" [[:sombra :_surprised (scoot -10)] [:symmetra :_sass]]
     "Reaper sounded quite fond of you when we spoke. I might dare say he even bordered on fatherly?"]
    ["Sombra" [[:sombra :_nostalgic (scoot -10)] [:symmetra :_smile]]
     "Pinche abuelo. Giving away my cute secrets. I suppose. We’re a family of sorts."]
    :-> [:diner :dialogue 6]]

   [:diner :dialogue 6]
   [:miranda/dialogue
    ["Sombra" [[:sombra :_explain (scoot -10)] [:symmetra :_neutral]]
     "Look, hackers get a bad rap as destructive, but hacking’s history is much richer than that.  When you’re completely out of options, what’s a little bending of the rules? If we have to do this while the world moves on around us, I say we make it our own."]
    ["Symmetra" [[:sombra :_smile (scoot -10)] [:symmetra :_thinking]]
     "Novel."]
    ["Sombra" [[:sombra :_smile (scoot -10)] [:symmetra :_thinking]]
     "The round is starting. You should hurry."]
    ["Symmetra" [[:sombra :_smile (scoot -10)] [:symmetra :_smile]]
     "I don’t believe we exchanged proper introductions. My real name is Satya."]
    ["Sombra" [[:sombra :_camo (fade-out [-10 0] 2)] [:symmetra :_smile]]
     "And mine is Sombra. Call it another hack. Hasta."]
    :transition :miranda/conditional
    [(first-chat :ana)     [:-> [:ana]]
     (first-chat :reaper)  [:-> [:reaper]]
     (first-chat :roadhog) [:-> [:hog]]
     :else [:-> [:hog]]]]

   [:reaper]
   [:miranda/characters
    [[]]
    :-> [:reaper :dialogue]]

   [:reaper :dialogue]
   [:miranda/narration
    "Reaper was distraught this round. Between Ana Nanoboosting you, and his dismay at recruiting a support who was not a real support, he could maintain his composure. By the end of the round, he was charging alone headfirst into the enemy team, neglecting any attempt at proper positioning. With your team perpetually split, the enemy succeeded in capturing relatively quickly."
    :-> [:street :dialogue 7]]

   [:hog]
   [:miranda/characters
    [[]]
    :-> [:hog :dialogue]]

   [:hog :dialogue]
   [:miranda/narration
    "The final round was hotly contested, and you almost succeeded in holding the first choke, pushing the point into Overtime until Junkrat and Sombra managed to obliterate half your team, blowing them up with two well co-ordinated ultimates. Your team held decently in the subsequent parts of the map, but lost the final point in Overtime."
    :-> [:street :dialogue 7]]

   [:ana]
   [:miranda/characters
    [[]]
    :-> [:ana :dialogue]]

   [:ana :dialogue]
   [:miranda/narration
    "Ana’s advice paid off this round. You kept your teleporter outside of Junkrat and Pharah’s artillery range, and you covered Sombra’s several flanking routes, severely reducing her effectiveness in combat. You held out the first point into a deep Overtime contest, and managed to squeak by a win as your teleporter pushed your entire team back to the frontline to support Roadhog."
    :-> [:street :dialogue 7]]

   [:street :dialogue 7]
   [:miranda/dialogue
    ["Symmetra" [[:symmetra :_neutral (scoot -25)]]
     "I should return to the diner to pick up my belongings."]
    :transition :miranda/conditional
    [:route-66/ana [:-> [:diner :scene 7 :a]]
     :else         [:-> [:diner :scene 7 :b]]]]

   [:diner :scene 7 :a]
   [:miranda/narration
    "Ana and Pharah  seem to be discussing something quietly in the corner. You can barely make out their words."
    :-> [:diner :dialogue 7 :a]]

   [:diner :dialogue 7 :a]
   [:miranda/dialogue
    ["Ana" [[:pharah :_reverse (scoot 15)] [:ana :_sass (scoot -10)]]
     "Fareeha, darling, it’s time to move on! If that Satya girl tickles your fancy—"]
    ["Pharah" [[:pharah :_reverseEmbarassed (scoot 15)] [:ana :_drink (scoot -10)]]
     "Mama!"]
    ["Ana" [[:pharah :_reverseEmbarassed (scoot 15)] [:ana :_explain (scoot -10)]]
     "Look, ‘ibna, she’s over in the corner."]
    ["Pharah" [[:pharah :_reversePeek (scoot 15)] [:ana :_roll-eyes (scoot -10)]]
     "Mama! She’s going to hear us, and then it’ll be weird."]
    ["Ana" [[:pharah :_reversePeek (scoot 15)] [:ana :_explain (scoot -10)]]
     "You military types. You become disciplined and well trained, and it squeezes out all the real social skills. I spent years dealing with this same shyness before I just gave up and dated a civilian. ‘Ibna, if you don’t talk to others, you’ll never get to know them. Just say hello."]
    :-> [:diner :dialogue 8]]

   [:diner :scene 7 :b]
   [:miranda/narration
    "You see Pharah, Ana, and McCree discussing selfies McCree had sent to Hanzo over the round."
    :-> [:street :narration :a]]

   [:diner :dialogue 7 :b]
   [:miranda/dialogue
    ["McCree" [[:pharah :_smile] [:mccree :_phoneShow (scoot 40)] [:ana :_cranky (scoot -15)]]
     "This is probably the best one I took. There are some others but they’re, uh, not appropriate for sharing."]
    ["Pharah" [[:pharah :_laugh] [:mccree :_phoneShow (scoot 40)] [:ana :_drink (scoot -15)]]
     "Haha, I saw you taking those. You think you’re being sneaky, Jesse, but you always forget to account for the aerial vantage point."]
    ["McCree" [[:pharah :_neutral] [:mccree :_phoneTexting (scoot 40)] [:ana :_drink (scoot -15)]]
     "Oh well in that case will you take a look? I feel like it came out alright but I’m not sure about the lighting."]
    ["Ana" [[:pharah :_neutral] [:mccree :_phoneTexting (scoot 40)] [:ana :_roll-eyes (scoot -15)]]
     "Children, behave."]
    :-> [:street :narration :a]]

   [:street :narration :a]
   [:miranda/narration
    "A few minutes pass, and you finish packing up. You leave the diner, and on your way to the transport slated to bring you back home, Pharah approaches you."
    :-> [:street :dialogue 8]]

   [:street :dialogue 8]
   [:miranda/dialogue
    ["Pharah" [[:pharah :_helloAwkward (scoot -15)] [:symmetra :_helloWarm]]
     "Hello! Your tactics were formidable!"]
    ["Symmetra" [[:pharah :_helloAwkward (scoot -15)] [:symmetra :_smile]]
     "Why, thank you! I’ve found there’s a great deal of power in being able to bring your allies back from death quickly! It’s almost as if my allies never died!"]
    ["Pharah" [[:pharah :_AnguishGay (scoot -15)] [:symmetra :_skeptical]]
     "What?"]
    ["Symmetra" [[:pharah :_anguishMild (scoot -15)] [:symmetra :_sass]]
     "Did you not notice the teleporter I had up? It seems like I did a better job than I thought at concealing it."]
    ["Pharah" [[:pharah :_embarassed (scoot -15)] [:symmetra :_sadSmile]]
     "Oh! I did notice. I mean. Don’t get me wrong you concealed your teleporter well, it took me a while to find. I, um, I just couldn’t get the proper aerial superiority in order to siege it!"]
    ["Symmetra" [[:pharah :_embarassed (scoot -15)] [:symmetra :_dissappointed]]
     "Oh."]
    ["Pharah" [[:symmetra :_dissappointed] [:pharah :_explainEmbarassed (scoot -15)]]
     "It’s not like that! Our flankers just had difficulty opening space for me because you guarded the hallways so well."]
    ["Symmetra" [[:pharah :_neutral (scoot -15)] [:symmetra :_smile]]
     "I am Satya. You are Fareeha, right? Your mother and I had the chance to speak. She certainly lives up to her reputation as a legendary soldier, and you to her legacy."]
    ["Pharah" [[:pharah :_cold (scoot -15)] [:symmetra :_smile]]
     "I don’t think my mother wishes for me to live up to her legacy, but my thanks anyway."]
    ["Symmetra" [[:pharah :_cold (scoot -15)] [:symmetra :_neutral]]
     "Oh. My apologies. I did not mean to—"]
    ["Pharah" [[:pharah :_embarassedBack (scoot -15)] [:symmetra :_neutral]]
     "Don’t worry about it. Maybe we can grab some coffee later and we can swap personal stories or something?"]
    ["Symmetra" [[:pharah :_neutral (scoot -15)] [:symmetra :_smile]]
     "That sounds like a wonderful break from all the violence."]
    ["Pharah" [[:pharah :_determined (scoot -15)] [:symmetra :_smile]]
     "Good! Okay then! It’s a date!"]
    ["Pharah" [[:pharah :_embarassed (scoot -15)] [:symmetra :_smile]]
     "Um. Like. It’s all set. You know. Um. I have to jet."]
    ["Symmetra" [[:pharah :_helmetNervous (scoot -15)] [:symmetra :_confused]]
     "I have to jet?"]
    ["Symmetra" [[:pharah :_flying (qmove [0 0] [0 -1000] 10)]
                 [:symmetra :_bewildered]]
     "Oh."]
    :-> [:street :finale]]

   [:street :finale]
   [:miranda/narration
    "The days event have done nothing to assuage your doubts about the Overwatch program but you can’t say they haven’t been interesting. As you board your homeward bound shuttle you cannot help but wonder what the coming days will bring."
    :-> [:route-66]]})
