(ns syms-qual.data.scenes.route-66.dates
  (:require [syms-qual.data.animation :as anim :refer [scoot]]))

(def data
  {[:diner :junkrat]
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
    :transition :miranda/simple-split
    {[:a] [:diner :dialogue 3 :a]
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
   :transition :miranda/simple-split
   {[:a] [:diner :sombra :extra]
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
   :transition :miranda/simple-split
   {[:a] [:diner :ending :ana]
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
   :transition :miranda/simple-split
   {[:a] [:diner :scene 7 :a]
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
