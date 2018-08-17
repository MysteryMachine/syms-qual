(ns syms-qual.data.scenes.gibralter.mercy
  (:require [carmen.util :as anim :refer [scoot]]
            [syms-qual.util :as util :refer [inc-transition]]))

(def data
  {[:spawn :mercy 0]
   [:miranda/dialogue
    ["Mercy" [[:mercy :_wave (scoot -80 -15 1)]  [:symmetra :_neutral (scoot 80 0 1)]] "Satya! Hello! Come! Come! You must absolutely try these extra virgin Shirley Temples."]
    ["Symmetra" [[:mercy :_neutral (scoot -15)]  [:symmetra :_helloNeutral (scoot 0)]] "Angela, hello!"]
    ["Mercy" [[:mercy :_explain (scoot -15)]  [:symmetra :_neutral (scoot 0)]] "I know what you are thinking, “Golly, how can a Shirley Temple be extra virgin?”"]
    ["Symmetra" [[:mercy :_neutral (scoot -15)]  [:symmetra :_explain (scoot 0)]] "Not really. I am anticipating some barbarous substitution that would ruin the drinks initial intent."]
    ["Mercy" [[:mercy :_explain (scoot -15)]  [:symmetra :_neutral (scoot 0)]] "Well, you see--"]
    ["Mercy" [[:mercy :_surprised (scoot -15)]  [:symmetra :_neutral (scoot 0)]] "wait really?"]
    ["Mercy" [[:mercy :_explainOffended (scoot -15)]  [:symmetra :_neutral (scoot 0)]] "I think that is literally the lowest vote of confidence I have ever received in my life."]
    ["Symmetra" [[:mercy :_neutral (scoot -15)]  [:symmetra :_pointUp (scoot 0)]] "You chose to wear Uggs to this match, Angela. They are over your uniform, and your uniform has shoes built into it."]
    ["Mercy" [[:mercy :_smile (scoot -15)]  [:symmetra :_neutral (scoot 0)]] "They’re retro-chic!"]
    ["Symmetra" [[:mercy :_neutral (scoot -15)]  [:symmetra :_no (scoot 0)]] "They are not. As a card carrying member of the fashion community, I can say, with confidence, that Uggs have not come back."]
    ["Mercy" [[:mercy :_wrist (scoot -15)]  [:symmetra :_neutral (scoot 0)]] "Um…"]
    ["Symmetra" [[:mercy :_wrist (scoot -15)]  [:symmetra :_explain (scoot 0)]] "Angela, I understand that festivities are occurring, but it’s a poor choice to wear these boots out in the battlefield."]
    ["Mercy" [[:mercy :_explain (scoot -15)]  [:symmetra :_neutral (scoot 0)]] " Let me…"]
    ["Symmetra" [[:mercy :_neutral (scoot -15)]  [:symmetra :_confused (scoot 0)]] "Yes?"]
    ["Mercy" [[:mercy :_drinkGesture (scoot -15)]  [:symmetra :_neutral (scoot 0)]] "I feel like I can redeem myself if I tell you about this cocktail."]
    ["Symmetra" [[:mercy :_neutral (scoot -15)]  [:symmetra :_bored (scoot 0)]] "Out with it then."]
    ["Mercy" [[:mercy :_explain (scoot -15)]  [:symmetra :_neutral (scoot 0)]] "Okay. So. Thanksgiving."]
    ["Symmetra" [[:mercy :_neutral (scoot -15)]  [:symmetra :_frustratedConfused (scoot 0)]] "This is already going poorly."]
    ["Mercy" [[:mercy :_wrist (scoot -15)]  [:symmetra :_frustratedConfused (scoot 0)]] "Oh, hush!"]
    ["Symmetra" [[:mercy :_wrist (scoot -15)]  [:symmetra :_eyeRoll (scoot 0)]] "Hushing."]
    ["Mercy" [[:mercy :_smileExplain (scoot -15)]  [:symmetra :_eyeRoll (scoot 0)]] "So. Thanksgiving. You know what goes with pumpkin pie? Cranberry sauce. They’re both fall flavors, right?"]
    ["Symmetra" [[:mercy :_neutral (scoot -15)]  [:symmetra :_explain (scoot 0)]] "I am not versed in Swiss Thanksgiving tradition."]
    ["Mercy" [[:mercy :_explain (scoot -15)]  [:symmetra :_neutral (scoot 0)]] "Oh, it’s American Thanksgiving. We celebrated a lot of American Holidays on base. Both Jack and Gabe were very insistent on that matter. "]
    ["Mercy" [[:mercy :_lookBack (scoot -15)]  [:symmetra :_neutral (scoot 0)]] "A meaner person might even say, pushy, but I didn’t say that."]
    ["Mercy" [[:mercy :_smileExplain (scoot -15)]  [:symmetra :_neutral (scoot 0)]] "Anyway, they are. You’ll easily want to eat both things in one meal."]
    ["Symmetra" [[:mercy :_neutral (scoot -15)]  [:symmetra :_explain (scoot 0)]] "Okay."]
    ["Mercy" [[:mercy :_explain (scoot -15)]  [:symmetra :_neutral (scoot 0)]] "So I was thinking. Ginger ale. Sounds a little...wild, doesn’t it?"]
    ["Symmetra" [[:mercy :_neutral (scoot -15)]  [:symmetra :_explainWTF (scoot 0)]] " No."]
    ["Mercy" [[:mercy :_lookAwayExplain (scoot -15)]  [:symmetra :_WTF (scoot 0)]] "So let’s substitute that weird flavor and the “ale” with something a little more wholesome."]
    ["Symmetra" [[:mercy :_neutral (scoot -15)]  [:symmetra :_explainWTF (scoot 0)]] "Angela, for someone who consistently brings people back from the dead, you should really learn to live a little."]
    ["Mercy" [[:mercy :_angry (scoot -15)]  [:symmetra :_neutral (scoot 0)]] "The cocktail, Satya. Damnit. The cocktail. It’s a pumpkin spice latte with some cranberry syrup."]
    ["Mercy" [[:mercy :_lookAwayExplain (scoot -15)]  [:symmetra :_neutral (scoot 0)]] "Cranberry syrup’s a lot like grenadine. And the flavors are much more wholesome."]
    ["Mercy" [[:mercy :_smile (scoot -15)]  [:symmetra :_neutral (scoot 0)]] "It’s like Thanksgiving in a can."]
    ["Mercy" [[:mercy :_thinkingExplain (scoot -15)]  [:symmetra :_WTF (scoot 0)]] "Except it’s really not? One time McCree bought an entire Thanksgiving dinner in a can and that worked out sort of poorly."]
    ["Mercy" [[:mercy :_explain (scoot -15)]  [:symmetra :_WTF (scoot 0)]] "You know how his beard sort of doesn’t grow in fully?"]
    ["Symmetra" [[:mercy :_smile (scoot -15)]  [:symmetra :_explainWTF (scoot 0)]] "I feel like she is talking at me, and not to me."]
    ["Mercy" [[:mercy :_pointUp (scoot -15)]  [:symmetra :_awkward (scoot 0 3 2)]] "Ever since he had that Thanksgiving Dinner in a Can, he stopped growing some of his facial hair, but has since had back hair that uncannily resembles a turkey dinner inside a pentagram."]
    ["Mercy" [[:mercy :_lookAwayExplain (scoot -15)]  [:symmetra :_awkward (scoot 3 6 2)]] "Haha, I bet it’s the preservatives. It was an IKEA™ brand dinner, who knows what they put into that."]
    ["Mercy" [[:mercy :_smileExplain (scoot -15)]  [:symmetra :_awkward (scoot 6 9 2)]] "In fact Reaper told him it was an experimental can but he ate it anyway. Reaper sure loves IKEA™. He gets all sorts of early access products from them."]
    ["Mercy" [[:mercy :_smile (scoot -15)]  [:symmetra :_awkward (scoot 9 12 2)]] "In fact our catering is from them."]
    ["Mercy" [[:mercy :_explain (scoot -15)]  [:symmetra :_awkward (scoot 12 15 2)]] "Did I ever tell you that I got a name change? I wasn’t originally Angela, but I really felt like it was more on brand than my old name."]
    ["Mercy" [[:mercy :_smileExplain (scoot -15)]  [:symmetra :_awkward (scoot 15 18 2)]] "Do you get it? Angela, because I’m a guardian angel?"]
    ["Symmetra" [[:mercy :_fly (scoot -15 10 2)]  [:symmetra :_awkwardTalk (scoot 18 20 2)]] "Okay, Angela. I’m going now."]
    :transition :miranda/conditional
    [#(= (:points/pharah %) 2) [:-> [:spawn :pharah :date]]
     :else                      [:-> [:spawn :pharah :no-date]]]]

   [:spawn :pharah :no-date]
   [:miranda/dialogue
    ["Mercy" [[:mercy :_gollyFist (scoot 10 -15 2)]  [:symmetra :_awkward (scoot 20 0 2)]] "Gonna go party harder, huh? Well, don’t let me stop you. I have to drive home tonight, so I don’t even think I’ll finish this EVST."]
    ["Mercy" [[:mercy :_explain (scoot -15)] [:symmetra :_awkward (scoot 0 3 2)]] "That’s short for an extra virgin Shirley Temple."]
    ["Mercy" [[:mercy :_lookAwayExplain (scoot -15)] [:symmetra :_awkward (scoot 3 6 2)]] "I should really start watching those movies."]
    ["Mercy" [[:mercy :_smile (scoot -15)] [:symmetra :_awkward (scoot 6 9 2)]] "Shirley Temple is sort of an aesthetic I really think I can pull off, you know?"]
    ["Mercy" [[:mercy :_smileExplain (scoot -15)] [:symmetra :_awkward (scoot 9 12 2)]] "Youth is sort of important to me, it’s why I lab ratted myself with youth serum."]
    ["Mercy" [[:mercy :_pointUp (scoot -15)] [:symmetra :_awkward (scoot 12 15 2)]] "The secret? It’s re-runs of Sex in the City."]
    ["Symmetra" [[:mercy :_fly (scoot -15 10 2)] [:symmetra :_awkwardTalk (scoot 15 18 2)]] "Are you following me? I said I was leaving."]
    [nil [[:mercy :_fly (scoot 10 110 2)] [:symmetra :_awkward (scoot 18 80 2)]] "You run. Fast. Thankfully, you lose her, despite her Guardian Angeling to you a few more times."]
    :-> [:spawn :choice]]

   [:spawn :pharah :date]
   [:miranda/dialogue
    ["Mercy" [[:mercy :_gollyFist (scoot 10 -15 2)]  [:symmetra :_awkward (scoot 20 0 2)]] "Gonna go party harder, huh? Well, don’t let me stop you. I have to drive home tonight, so I don’t even think I’ll finish this EVST."]
    ["Mercy" [[:mercy :_lookAwayExplain (scoot -15)] [:symmetra :_awkward (scoot 0 3 2)]] "That’s short for an extra virgin Shirley Temple."]
    ["Mercy" [[:mercy :_smileExplain (scoot -15)] [:symmetra :_awkward (scoot 3 6 2)]] "I love her movies. We should watch some! I think there are few in the old DVD collection Fareeha had in her childhood room here on base."]
    ["Mercy" [[:mercy :_explain (scoot -15)] [:symmetra :_awkward (scoot 6 9 2)]] "I would say we should go bust in there and grab them, but I think she’s up there right now listening to that mix tape she made that’s just The Final Countdown on loop for 20 minutes."]
    ["Mercy" [[:mercy :_lookAwayExplain (scoot -15)] [:symmetra :_awkward (scoot 9 12 2)]] "She does that whenever she’s trying to psyche herself up to do something, but she’s not even in the match today. I wonder what she’s going to do? Oh my god. I hope it’s nothing dangerous."]
    ["Mercy" [[:mercy :_pointUp (scoot -15)] [:symmetra :_awkward (scoot 12 15 2)]] "Oh! You know what’s even better than Shirley Temple? Disney movies, I think there’s a copy of Beauty and the Beast up there too."]
    ["Symmetra" [[:mercy :_fly (scoot -15 10 2)] [:symmetra :_frustratedConfused (scoot 15 18 2)]] "I have been trying to leave to the past 5 minutes but you keep Guardian Angeling to me. Please stop. I do not care about your children’s media viewing habits."]
    ["Mercy" [[:mercy :_lookAwayExplain (scoot 10 -15 2)] [:symmetra :_frustrated (scoot 18 0 2)]] "Do you think you can start calling it “Guardian Angela-ing”? I think it’s really funny, and I’m trying to start a thing."]
    [nil [[:mercy :_neutral (scoot -15)]  [:symmetra :_phoneCheck (scoot 0)]] "Suddenly, your phone buzzes."]
    ["Pharah" [[:mercy :_explain (scoot -15)]  [:symmetra :_phoneCheck (scoot 0)]] "hi im bad at textin but wryd?"]
    ["Symmetra" [[:mercy :_lookBack (scoot -15)]  [:symmetra :_phoneCheck (scoot 0)]] "I have been cornered by Angela who will not stop talking about inane nonsense I do not care about. I am trying to escape. "]
    ["Pharah" [[:mercy :_lookAwayExplain (scoot -15)]  [:symmetra :_phoneCheck (scoot 0)]] "haha tell her there r free kale smoothies in winstons office and she will prob leave 2 get 1 she got him a juicer for christmas 10 yrs ago n is super passive aggressive about how little he uses it"]
    ["Mercy" [[:mercy :_wrist (scoot -15)]  [:symmetra :_phoneCheck (scoot 0)]] "Who is it? A special someone? Tell me all the details, Satya. I love to have that good gossip with my gal pals."]
    ["Symmetra" [[:mercy :_neutral (scoot -15)]  [:symmetra :_phoneCheckTalk (scoot 0)]] "Apparently Winston is in his office asking if anyone wants a free juicer?"]
    ["Mercy" [[:mercy :_reverseFly (scoot -15 -80 2)] [:symmetra :_phoneCheck (scoot 0 -25 2)]] "Oh is he now…"]
    ["Symmetra" [[:symmetra :_phoneCheck (scoot -25)]] "Thank you, you have saved me 🙏🏾"]
    ["Pharah" [[:symmetra :_phoneCheck (scoot -25)]] "lol np if u want 2 escape further i know a gud spot we should go 4 a d8"]
    ["Pharah" [[:symmetra :_phoneCheck (scoot -25)]] "If you want 2 d8?"]
    ["Pharah" [[:symmetra :_phoneCheck (scoot -25)]] "lol jk"]
    ["Pharah" [[:symmetra :_phoneCheck (scoot -25)]] "no not jk"]
    ["Pharah" [[:symmetra :_phoneCheck (scoot -25)]] "sry im nervous"]
    :-> [:spawn :mercy :choice]]

   [:spawn :mercy :choice]
   [:miranda/text-option
    "What will you do?"
    ["Date that bird girl" (constantly true)
     [:-> [:spawn :mercy :yes]]]
    ["Hold off on replying to talk to your other teammates" (constantly true)
     [:-> [:spawn :mercy :no]]]]

   [:spawn :mercy :yes]
   (concat
    [:miranda/dialogue
      ["Symmetra" [[:symmetra :_phoneSigh (scoot -25)]] "She is a tragic texter, but at least she is cute."]
     ["Symmetra" [[:symmetra :_phoneCoy (scoot -25)]] "And she’s so muscular she could snap a man in two. A prime characteristic in a romantic partner. I will reply with a yes."]]
    (inc-transition [:-> [:door :pharah 0]] :points/pharah))

   [:spawn :mercy :no]
   [:miranda/dialogue
    ["Symmetra" [[:symmetra :_phoneSkeptical (scoot -25)]] "I’m unsure if it’s an appropriate time to be running off on a date. I need to finish assessing the situation here first before I reply."]
    :-> [:spawn :choice]]})
