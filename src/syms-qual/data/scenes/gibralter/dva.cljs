(ns syms-qual.data.scenes.gibralter.dva
  (:require [carmen.util :as anim :refer [scoot]]
            [syms-qual.util :as util :refer [inc-transition]]))

(def data
  {[:spawn :dva 0]
   [:miranda/dialogue
    ["Tracer" [[:dva :_switchGum (scoot -80 -5 1.5)] [:tracer :_wave (scoot -80 -18 1.5)] [:symmetra :_smile (scoot 80 8 1.5)]] "Satya! Cheers, love!"]
    ["D.Va" [[:tracer :_neutral (scoot -18)] [:dva :_switchShrug (scoot -5)] [:symmetra :_smile (scoot 8)]] "Oh em gee, it’s my favorite light bender."]
    ["Tracer" [[:dva :_neutral (scoot -5)] [:tracer :_explain (scoot -18)] [:symmetra :_smile (scoot 8)]] "You should really do karate while you bend light, Satya."]
    ["D.Va" [[:dva :_fingerGuns (scoot -5)] [:tracer :_neutral (scoot -18)] [:symmetra :_smile (scoot 8)]] "And get a cool facial scar. Swear vengeance on the Avatar."]
    ["Tracer" [[:dva :_neutral (scoot -5)] [:tracer :_bewildered (scoot -18)] [:symmetra :_smile (scoot 8)]] "Hey, that rhymed."]
    ["D.Va" [[:tracer :_neutral (scoot -18)] [:dva :_shrug (scoot -5)] [:symmetra :_smile (scoot 8)]] "I’m a natural poet."]
    ["Symmetra" [[:tracer :_neutral (scoot -18)] [:dva :_neutral (scoot -5)] [:symmetra :_helloWarm (scoot 8)]] "Hello, ladies. Having a fun time already, I see. Getting pumped to escort that payload?"]
    ["D.Va" [[:tracer :_neutral (scoot -18)] [:dva :_handsHipsGum (scoot -5)] [:symmetra :_smile (scoot 8)]] "As if! We’re preparing our cosplay. We’re putting on a show."]
    ["Symmetra" [[:tracer :_neutral (scoot -18)] [:dva :_handsHips (scoot -5)] [:symmetra :_explainWTF (scoot 8)]] "You...are not escorting the objective?"]
    ["Tracer" [[:tracer :_smile (scoot -18)] [:dva :_handsHipsGum (scoot -5)] [:symmetra :_WTF (scoot 8)]] "No!"]
    ["D.Va" [[:tracer :_neutral (scoot -18)] [:dva :_attacked (scoot -5)] [:symmetra :_WTF (scoot 8)]] "Naw. That’s something tryhards do."]
    ["Tracer" [[:dva :_neutral (scoot -5)] [:tracer :_explain (scoot -18)] [:symmetra :_WTF (scoot 8)]] "I really only try and get a good K/D."]
    ["Symmetra" [[:tracer :_neutral (scoot -18)] [:dva :_neutral (scoot -5)] [:symmetra :_confused (scoot 8)]] "D.Va, are you not accountable to the South Korean government?"]
    ["D.Va" [[:tracer :_neutral (scoot -18)] [:dva :_point (scoot -5)] [:symmetra :_confused (scoot 8)]] "LOL, no. I’m a celebrity, Satya. We’re not really people. With...responsibilities."]
    ["Symmetra" [[:tracer :_neutral (scoot -18)] [:dva :_neutral (scoot -5)] [:symmetra :_explainWTF (scoot 8)]] "This raises future questions, though. If you’re not accountable, why send you as a representative?"]
    ["D.Va" [[:tracer :_neutral (scoot -18)] [:dva :_point (scoot -5)] [:symmetra :_WTF (scoot 8)]] "Oh! I can see how this is confusing. You know those ugly DX Racer chairs?"]
    ["Symmetra" [[:tracer :_neutral (scoot -18)] [:dva :_neutral (scoot -5)] [:symmetra :_explainWTF (scoot 8)]] "Sure."]
    ["D.Va" [[:tracer :_neutral (scoot -18)] [:dva :_explain (scoot -5)] [:symmetra :_WTF (scoot 8)]] "They were bought out by a mysterious shadow company, and now instead of giving free gaming chairs to streamers, they give out free Mekas. OBS comes pre-installed to livestream the warfare. I’m actually being sent here by them."]
    ["Symmetra" [[:tracer :_neutral (scoot -18)] [:dva :_neutral (scoot -5)] [:symmetra :_skeptical (scoot 8)]] "That sounds...unethical."]
    ["D.Va" [[:tracer :_neutral (scoot -18)] [:dva :_switchCheck (scoot -5)] [:symmetra :_WTF (scoot 8)]] "Wait a sec."]
    ["D.Va" [[:tracer :_neutral (scoot -18)] [:dva :_switchTalk (scoot -5)] [:symmetra :_WTF (scoot 8)]] "Oh em gee, everybody, I just got a hundred dollar donation. The donation reads, 'LOL who is this lady gtfo and get back to owning noobs hana love ur stream and much love.''"]
    ["D.Va" [[:tracer :_neutral (scoot -18)] [:dva :_switchGrin (scoot -5)] [:symmetra :_WTF (scoot 8)]] "D’aww! Thank you, imnotanassimjusttrolling for the donation! And you know what that means!"]
    ["D.Va" [[:tracer :_neutral (scoot -18)] [:dva :_switchThumbsUp (scoot -5)] [:symmetra :_frustrated (scoot 8)]] "I’ve raised enough money to go to Military Industrial Complex Gaming Con, sponsored by IKEA! I’m so excited to get to try out Soldier Simulator X: Final Remix Delta."]
    ["Tracer" [[:tracer :_smile (scoot -18)] [:dva :_neutral (scoot -5)] [:symmetra :_frustratedConfused (scoot 8)]] "I hear that’s a good one!"]
    ["D.Va" [[:tracer :_neutral (scoot -18)] [:dva :_shrug (scoot -5)] [:symmetra :_eyeRoll (scoot 8)]] "It sure is, Tracer! But we all know, LOL, I’m just doing it for the internet fame."]
    ["D.Va" [[:tracer :_neutral (scoot -18)] [:dva :_dunk (scoot -5)] [:symmetra :_eyeRoll (scoot 8)]] "Can I get some DVAsellouts in the chat? If you can’t use the emote, be sure to subscribe to tell me that I sold out!"]
    ["Symmetra" [[:tracer :_neutral (scoot -18)] [:dva :_neutral(scoot -5)] [:symmetra :_frustrated (scoot 8)]] "Okay, so, back on topic."]
    ["D.Va" [[:tracer :_neutral (scoot -18)] [:dva :_explain (scoot -5)] [:symmetra :_WTF (scoot 8)]] "Sure."]
    ["Symmetra" [[:tracer :_neutral (scoot -18)] [:dva :_handsHipsGum (scoot -5)] [:symmetra :_explainWTF (scoot 8)]] "You’re not fighting?"]
    ["Tracer" [[:tracer :_smile (scoot -18)] [:dva :_handsHipsSmile (scoot -5)] [:symmetra :_WTF (scoot 8)]] "Nope! We’re doing our Sonic 2 and Knuckles race cosplay."]
    ["Symmetra" [[:tracer :_neutral (scoot -18)] [:dva :_neutral (scoot -5)] [:symmetra :_eyeRoll (scoot 8)]] "For internet money?"]
    ["Tracer" [[:tracer :_smile (scoot -18)] [:dva :_neutral (scoot -5)] [:symmetra :_eyeRoll (scoot 8)]] "Yeah! I just wanna be featured on the stream, ya know?"]
    ["D.Va" [[:tracer :_neutral (scoot -18)] [:dva :_explainGum (scoot -5)] [:symmetra :_eyeRoll (scoot 8)]] "It’s a good stream, Satya."]
    :transition :miranda/conditional
    [#(= 1 (:lijiang/dva %)) [:-> [:spawn :dva :good-strim :a]]
     :else        [:-> [:spawn :dva :good-strim :b]]]]

   [:spawn :dva :good-strim :a]
   [:miranda/dialogue
    ["Symmetra" [[:tracer :_neutral (scoot -18)] [:dva :_neutral (scoot -5)] [:symmetra :_explainUncomfortable (scoot 8)]] "I mean yes, your stream is quite enjoyable. I had a good time participating in it. But there is a time and a place for such things and this is neither."]
    :transition :miranda/conditional
    [#(= (:points/payload %) 7) [:-> [:spawn :dva :a]]
     :else                      [:-> [:spawn :dva :b]]]]

   [:spawn :dva :good-strim :b]
   [:miranda/dialogue
    ["Symmetra" [[:tracer :_neutral (scoot -18)] [:dva :_neutral (scoot -5)] [:symmetra :_explainWTF (scoot 8)]] "Sure. But I want to win this match."]
    :transition :miranda/conditional
    [#(= (:points/payload %) 7) [:-> [:spawn :dva :a]]
     :else                      [:-> [:spawn :dva :b]]]]

   [:spawn :dva :a]
   [:miranda/dialogue
    ["Tracer" [[:tracer :_bewildered (scoot -18)] [:dva :_neutral (scoot -5)] [:symmetra :_skeptical (scoot 8)]] "That reminds me! Everyone else on the other team was saying they didn’t feel like going up against you!"]
    ["D.Va" [[:tracer :_neutral (scoot -18)] [:dva :_point (scoot -5)] [:symmetra :_neutral (scoot 8)]] "Your track record as a tryhard has spirits low on the other side."]
    ["Tracer" [[:dva :_neutral (scoot -5)] [:tracer :_explain (scoot -18)] [:symmetra :_neutral (scoot 8)]] "We have a tactic that will allow our team to win. But we need to find a printer."]
    ["Symmetra" [[:tracer :_neutral (scoot -18)] [:dva :_handsHipsGum (scoot -5)] [:symmetra :_confused (scoot 8)]] "A printer?"]
    ["D.Va" [[:tracer :_neutral (scoot -18)] [:dva :_handsHipsSmile (scoot -5)] [:symmetra :_confused (scoot 8)]] "With bluetooth capabilities."]
    ["Symmetra" [[:tracer :_neutral (scoot -18)] [:dva :_neutral (scoot -5)] [:symmetra :_explainUncomfortable (scoot 8)]] "Why?"]
    ["Tracer" [[:dva :_neutral (scoot -5)] [:tracer :_explain (scoot -18)]  [:symmetra :_neutral (scoot 8)]] "I’m sure if we send out invitations to our stream race, we can get the enemy team to play hookie. Their morale is rock bottom."]
    ["D.Va" [[:tracer :_neutral (scoot -18)] [:dva :_fingerGuns (scoot -5)] [:symmetra :_neutral (scoot 8)]] "Then all you need to do is ride the payload."]
    ["Symmetra" [[:tracer :_neutral (scoot -18)] [:dva :_neutral (scoot -5)] [:symmetra :_explainUncomfortable (scoot 8)]] "I am skeptical of this plan. And also do not know where to find a printer. Unless there is perhaps one in Winston’s office?"]
    ["D.Va" [[:tracer :_neutral (scoot -18)] [:dva :_explain (scoot -5)] [:symmetra :_neutral (scoot 8)]] "It got thrown through the window when Reaper broke in here a few months ago. Apparently some Talon operative wanted him to throw down the keys to the place? I don’t know how he misheard that one."]
    ["D.Va" [[:tracer :_neutral (scoot -18)] [:dva :_explainGum (scoot -5)] [:symmetra :_neutral (scoot 8)]] "But anyway... why don’t you just build us one out of hard light?"]
    ["Symmetra" [[:tracer :_neutral (scoot -18)] [:dva :_neutral (scoot -5)] [:symmetra :_skeptical (scoot 8)]] "..."]
    ["D.Va" [[:tracer :_neutral (scoot -18)] [:dva :_understanding (scoot -5)] [:symmetra :_skeptical (scoot 8)]] "Look, my stream artist worked really hard on these invitations. Just help us out."]
    :-> [:spawn :dva :a :option]]

   [:spawn :dva :a :option]
   [:miranda/text-option
    "What will you do?"
    ["Believe in the power of the printed word" (constantly true)
     [:-> [:spawn :dva :a :option :yes]]]
    ["Talk to your other teammates." (constantly true)
     [:-> [:spawn :dva :a :option :no]]]]

   [:spawn :dva :a :option :yes]
   (concat
    [:miranda/dialogue
     ["Symmetra" [[:tracer :_neutral (scoot -18)] [:dva :_neutral (scoot -5)] [:symmetra :_frustratedConfused (scoot 8)]] "Fine. I will do it."]
     ["Symmetra" [[:tracer :_neutral (scoot -18)] [:dva :_neutral (scoot -5)] [:symmetra :_craftPrinter (scoot 8)]] "Here."]
     ["Tracer" [[:tracer :_smile (scoot -18)] [:dva :_neutral (scoot -5)] [:symmetra :_neutral (scoot 8)]] "Smashing! Now you just gotta sit on the payload!"]
     ["Symmetra" [[:tracer :_neutral (scoot -18 -80 1)] [:dva :_neutral (scoot -5)] [:symmetra :_explain (scoot 8)]] "I hope your printer ploy works."]
     ["Tracer" [[:dva :_neutral (scoot -5)] [:tracer :_flyers (scoot -80 -18 1)] [:symmetra :_neutral (scoot 8)]] " I’ll zip around to distribute flyers ASAP!!"]]
    (inc-transition
     [:-> [:dva]]
     :points/payload))

   [:spawn :dva :a :option :no]
   [:miranda/dialogue
    ["Symmetra" [[:tracer :_neutral (scoot -18)] [:dva :_neutral (scoot -5)] [:symmetra :_explainUncomfortable(scoot 8)]] "I’m still not sure about my faith in this plan."]
    ["Tracer" [[:tracer :_smile (scoot -18)] [:dva :_neutral (scoot -5)] [:symmetra :_neutral (scoot 8)]] "That’s fair! We’ll be here working on these costumes if you change your mind."]
    :-> [:spawn :choice]]

   [:spawn :dva :b]
   [:miranda/dialogue
    ["D.Va" [[:tracer :_neutral (scoot -18)] [:dva :_understanding (scoot -5)] [:symmetra :_WTF (scoot 8)]] "Ana is feeling her prime today. I don’t suggest going out there. She WILL crush you under her beautiful sniper sandals."]
    ["Tracer" [[:tracer :_smile (scoot -18)] [:dva :_neutral (scoot -5)] [:symmetra :_WTF (scoot 8)]] "Ana has great taste in shoes. We have that in common!"]
    ["D.Va" [[:tracer :_neutral (scoot -18)] [:dva :_attacked (scoot -5)] [:symmetra :_WTF (scoot 8)]] "No. Your shoes are trash. Go back to work on the cosplay."]
    ["Tracer" [[:tracer :_smile (scoot -18 -80 1.5)] [:dva :_neutralGum (scoot -5)] [:symmetra :_WTF (scoot 8)]] "Aye aye!"]
    :-> [:spawn :dva :b :option]]

   [:spawn :dva :b :option]
   [:miranda/text-option
    "What will you do?"
    ["Go get crushed by Ana" (constantly true)
     [:-> [:spawn :dva :b :option :yes]]]
    ["Go talk to you other teammates" (constantly true)
     [:-> [:spawn :dva :b :option :no]]]]

   [:spawn :dva :b :option :yes]
   [:miranda/dialogue
    ["Symmetra" [[:dva :_neutral (scoot -5)] [:symmetra :_frustratedConfused (scoot 8)]] "Well. Here goes nothing."]
    ["Tracer" [[:tracer :_sonic (scoot -80 -18 1.5)] [:dva :_neutral (scoot -5)] [:symmetra :_WTF (scoot 8)]] "Good luck, Satya!"]
    :-> [:spawn :dva-b]]

   [:spawn :dva :b :option :no]
   [:miranda/dialogue
    ["Tracer" [[:tracer :_sonic (scoot -80 -18 1.5)] [:dva :_neutral (scoot -5)] [:symmetra :_WTF (scoot 8)]] "If your not going to compete you may as well come watch the race! You know where to find us! It’s gonna be great!"]
    :-> [:spawn :choice]]

   [:dva]
   [:miranda/characters
    [[]]
    :-> [:dva :text]]

   [:dva :text]
   [:miranda/narration
    "After building a printer and helping Tracer and D.Va create flyers for their event, you literally sat alone by yourself on the payload, and no one showed up to defend. On defense, no one showed up to escort the payload. Winston was seen crying golden tears of joy at your dedication. Truly, your love of the payload was the inspirational love story that he needed for this day of mirth. You pat yourself on the back for your good deed."
    :=> [:dorado [:spawn :intro] 0]]

   [:spawn :dva-b]
   [:miranda/narration
    "You prepare to attack, with no accompanying teammates. Though many of your opponents have indeed left to watch the race, Ana and Reinhardt stand firm on defense. It is two versus one, and their superior range and fortifications ensure you are unable to make any headway."
    "Ana consistently makes tea over your crushed body after every single kill. You suss out that she enjoys victory a little too much, even if the circumstances aren’t necessarily honorable. You suppose that is the sort of thing that would inspire a person to become a sniper in the first place."
    :=> [:dorado [:spawn :intro] 0]]})
