(ns syms-qual.data.scenes.eichenwalde.hanzo
  (:require [carmen.util :as anim :refer [scoot]]
            [syms-qual.util :as util :refer [inc-transition]]))


(def data
  {[:spawn :hanzo 0]
   [:miranda/dialogue
    ["Symmetra" [[:hanzo :_phoneTexting (scoot -84 -4 1)] [:symmetra :_helloWarm (scoot 81 1 1)]]
     "Hello!"]
    ["Hanzo" [[:hanzo :_neutral (scoot -4)] [:symmetra :_neutral (scoot 1)]]
     "…"]
    ["Symmetra" [[:hanzo :_neutral (scoot -4)] [:symmetra :_neutral (scoot 1)]]
     "You are Hanzo, yes?"]
    ["Hanzo" [[:hanzo :_neutral (scoot -4)] [:symmetra :_neutral (scoot 1)]]
     "…"]
    ["Symmetra" [[:hanzo :_neutral (scoot -4)] [:symmetra :_neutral (scoot 1)]]
     "Hello?"]
    ["Hanzo" [[:hanzo :_neutral (scoot -4)] [:symmetra :_neutral (scoot 1)]]
     "Hello. What do you want?"]
    ["Symmetra" [[:hanzo :_neutral (scoot -4)] [:symmetra :_neutral (scoot 1)]]
     "I thought we could discuss strategy for this match."]
    ["Hanzo" [[:hanzo :_neutral (scoot -4)] [:symmetra :_neutral (scoot 1)]]
     "I do not care. I drafted all snipers so that I could sit here and rot. Alone. We cannot win."]
    ["Symmetra" [[:hanzo :_neutral (scoot -4)] [:symmetra :_neutral (scoot 1)]]
     "Surely, there is still some way we can manage, isn’t there?"]
    ["Hanzo" [[:hanzo :_neutral (scoot -4)] [:symmetra :_neutral (scoot 1)]]
     "No. Go away."]
    :-> [:spawn :hanzo :option 0]]

   [:spawn :hanzo :option 0]
   [:miranda/option
    "Symmetra" [[:hanzo :_neutral (scoot -4)] [:symmetra :_neutral (scoot 1)]]
    "Do you plan on just texting McCree all day, and not even helping?"
    "Fine. We will win without your aid."]

   [:spawn :hanzo :option 0 0]
   [:miranda/dialogue
    ["Hanzo" [[:hanzo :_neutral (scoot -4)] [:symmetra :_neutral (scoot 1)]]
     "You are welcome to try. I, instead, will focus on having a drink."]
    :-> [:spawn :hanzo 1]]

   [:spawn :hanzo :option 0 1]
   [:miranda/dialogue
    ["Hanzo" [[:hanzo :_neutral (scoot -4)] [:symmetra :_neutral (scoot 1)]]
     "No. I cannot. McCree is teaching a square dancing class in a few minutes. I am angrily reviewing this sake I am having for SakeAdvocate.com. Alone.."]
    :-> [:spawn :hanzo 1]]

   [:spawn :hanzo 1]
   [:miranda/dialogue
    ["Hanzo" [[:hanzo :_neutral (scoot -4)] [:symmetra :_neutral (scoot 1)]]
     "Ah yes. Sake. My favorite drink with which to lie on the ground and think about all of the mistakes I have ever made..."]
    ["Symmetra" [[:hanzo :_neutral (scoot -4)] [:symmetra :_neutral (scoot 1)]]
     "I see."]
    ["Hanzo" [[:hanzo :_neutral (scoot -4)] [:symmetra :_neutral (scoot 1)]]
     "Oh...no."]
    ["Symmetra" [[:hanzo :_neutral (scoot -4)] [:symmetra :_neutral (scoot 1)]]
     "Excuse me?"]
    ["Hanzo" [[:hanzo :_neutral (scoot -4)] [:symmetra :_neutral (scoot 1)]]
     "I’m out of sake. There are no liquor stores in this neighborhood. And all the taps in this place are dry. I will have to...attend a bar."]
    ["Symmetra" [[:hanzo :_neutral (scoot -4)] [:symmetra :_neutral (scoot 1)]]
     "So go?"]
    ["Hanzo" [[:hanzo :_neutral (scoot -4)] [:symmetra :_neutral (scoot 1)]]
     "No. I do not visit bars alone. Not anymore. Not after that one matcha latte with irish cream incident."]
    ["Symmetra" [[:hanzo :_neutral (scoot -4)] [:symmetra :_neutral (scoot 1)]]
     "That sounds pretty tasty."]
    ["Hanzo" [[:hanzo :_neutral (scoot -4)] [:symmetra :_neutral (scoot 1)]]
     "Exactly. I cannot get near a mixed drink. That latte cost 15 dollars and I had four. If I go to the bar alone, it’ll be all over."]
    ["Symmetra" [[:hanzo :_neutral (scoot -4)] [:symmetra :_neutral (scoot 1)]]
     "So it’s not the alcohol that’s the problem is…"]
    ["Hanzo" [[:hanzo :_neutral (scoot -4)] [:symmetra :_neutral (scoot 1)]]
     "I am a man of discipline, Satya. I drink responsibly, and I know my limits, as high as they may be. But since McCree has introduced me to the concept of “brunch” I have lost all self control."]
    ["Symmetra" [[:hanzo :_neutral (scoot -4)] [:symmetra :_neutral (scoot 1)]]
     "Isn’t brunch more about the food than the alcohol?"]
    ["Hanzo" [[:hanzo :_neutral (scoot -4)] [:symmetra :_neutral (scoot 1)]]
     "It’s about the whole experience. The perfect Michelada with just the right garnish of lime and Tajin to complement your huevos rancheros. Chicken and waffles with spiked sweet tea? Have you ever even had a grapefruit mimosa? Have you ever dipped an egg in toast, and then washed it down with some sparkling wine inside freshly squeezed juice?"]
    ["Symmetra" [[:hanzo :_neutral (scoot -4)] [:symmetra :_neutral (scoot 1)]]
     "I mean, yes?"]
    ["Hanzo" [[:hanzo :_neutral (scoot -4)] [:symmetra :_neutral (scoot 1)]]
     "It’s brunch time, Symmetra. If you let me go to that bar alone, I WILL have brunch."]
    ["Symmetra" [[:hanzo :_neutral (scoot -4)] [:symmetra :_neutral (scoot 1)]]
     "I am happy for you?"]
    ["Hanzo" [[:hanzo :_neutral (scoot -4)] [:symmetra :_neutral (scoot 1)]]
     "You shouldn’t be. My wallet cannot handle how much I love brunch. McCree and I already live an exquisitely lavish gay lifestyle. Our budget does not have room for another brunch. Why do you think he’s trying to supplement our Overwatch income by teaching square dancing? Come with me. You must make sure I do not break the bank with deviled eggs and sparkling ciders."]
    :-> [:spawn :hanzo :choice]]

   [:spawn :hanzo :choice]
   [:miranda/text-option
    "What will you do?"
    ["Have the brunch you deserve" (constantly true)
     [:-> [:spawn :hanzo :yes]]]
    ["Converse with your other teammates" (constantly true)
     [:-> [:spawn :hanzo :no]]]]

   [:spawn :hanzo :yes]
   [:miranda/dialogue
    ["Hanzo" [[:hanzo :_neutral (scoot -4)] [:symmetra :_neutral (scoot 1)]]
     "I suppose you can just limit me to reasonable amount of brunch."]
    :-> [:hanzo]]

   [:spawn :hanzo :no]
   [:miranda/dialogue
    ["Hanzo" [[:hanzo :_neutral (scoot -4)] [:symmetra :_neutral (scoot 1)]]
     "You cannot stop me, Satya. I can climb up walls and you cannot. Thus, I will go alone. But! I am sending you the bill if I go overboard. Come meet me at the bar  if you change your mind."]
    :-> [:spawn :choice]]

   [:hanzo]
   [:miranda/characters
    [[]]
    :-> [:hanzo :cutscene]]

   [:hanzo :cutscene]
   [:miranda/narration
    "Your attempts to resist the lure of brunch are short lived, after splitting a pitcher of sangria with Hanzo, you gave in and each got an order of hazelnut waffles with blackberry cream paired the bottomless drink of the day, a delicious blend of blackberry liqueur, lemon, and Weissbier. Just as your food was about to arrive, McCree also showed up."
    "Apparently the mere mention of brunch in Hanzo’s texts had prompted him to abandon his square dancing class, leaving them to watch “The Good, The Bad, And the Ugly”, claiming they’d need to better understand the cowboy lifestyle to be able to dance. You three had a very tasty brunch, and it was only mildly marred by McCree getting a whole lot of egg yolk on his beard and poncho."
    :-> [:junkertown :intro]]})
