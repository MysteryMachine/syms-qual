(ns syms-qual.data.scenes.eichenwalde.hanzo)

(def start-date
  [:transition :miranda/mutation->basic
   [[:-> [:anubis :pharah :confirm]]
    (fn []
      ;;TODO: mutate state to indicate date
      )]])

(def data
  {[:eichenwalde :hanzo 0]
   [:miranda/dialogue
    ["Symmetra" [] "Hello!"]
   ["Hanzo" [] "…"]
   ["Symmetra" [] "You are Hanzo, yes?"]
   ["Hanzo" [] "…"]
   ["Symmetra" [] "Hello?"]
   ["Hanzo" [] "Hello. What do you want?"]
   ["Symmetra" [] "I thought we could discuss strategy for this match."]
   ["Hanzo" [] "I do not care. I drafted all snipers so that I could sit here and rot. Alone. We cannot win."]
   ["Symmetra" [] "Surely, there is still some way we can manage, isn’t there?"]
   ["Hanzo" [] "No. Go away."]
   :-> [:eichenwalde :hanzo :option 0]]

  [:eichenwalde :hanzo :option 0]
  [:miranda/option
   "Symmetra" []
   "Do you plan on just texting McCree all day, and not even helping?"
   "Fine. We will win without your aid."]

  [:eichenwalde :hanzo :option 0 0]
  [:miranda/dialogue
   ["Hanzo" [] "You are welcome to try. I, instead, will focus on having a drink."]
   :-> [:eichenwalde :hanzo 1]]

  [:eichenwalde :hanzo :option 0 1]
  [:miranda/dialogue
   ["Hanzo" [] "No. I cannot. McCree is teaching a square dancing class in a few minutes. I am angrily reviewing this sake I am having for SakeAdvocate.com. Alone.."]
   :-> [:eichenwalde :hanzo 1]]

  [:eichenwalde :hanzo 1]
  [:miranda/dialogue
   ["Hanzo" [] "Ah yes. Sake. My favorite drink with which to lie on the ground and think about all of the mistakes I have ever made..."]
   ["Symmetra" [] "I see."]
   ["Hanzo" [] "Oh...no."]
   ["Symmetra" [] "Excuse me?"]
   ["Hanzo" [] "I’m out of sake. There are no liquor stores in this neighborhood. And all the taps in this place are dry. I will have to...attend a bar."]
   ["Symmetra" [] "So go?"]
   ["Hanzo" [] "No. I do not visit bars alone. Not anymore. Not after that one matcha latte with irish cream incident."]
   ["Symmetra" [] "That sounds pretty tasty."]
   ["Hanzo" [] "Exactly. I cannot get near a mixed drink. That latte cost 15 dollars and I had four. If I go to the bar alone, it’ll be all over."]
   ["Symmetra" [] "So it’s not the alcohol that’s the problem is…"]
   ["Hanzo" [] "I am a man of discipline, Satya. I drink responsibly, and I know my limits, as high as they may be. But since McCree has introduced me to the concept of “brunch” I have lost all self control."]
   ["Symmetra" [] "Isn’t brunch more about the food than the alcohol?"]
   ["Hanzo" [] "It’s about the whole experience. The perfect Michelada with just the right garnish of lime and Tajin to complement your huevos rancheros. Chicken and waffles with spiked sweet tea? Have you ever even had a grapefruit mimosa? Have you ever dipped an egg in toast, and then washed it down with some sparkling wine inside freshly squeezed juice?"]
   ["Symmetra" [] "I mean, yes?"]
   ["Hanzo" [] "It’s brunch time, Symmetra. If you let me go to that bar alone, I WILL have brunch."]
   ["Symmetra" [] "I am happy for you?"]
   ["Hanzo" [] "You shouldn’t be. My wallet cannot handle how much I love brunch. McCree and I already live an exquisitely lavish gay lifestyle. Our budget does not have room for another brunch. Why do you think he’s trying to supplement our Overwatch income by teaching square dancing? Come with me. You must make sure I do not break the bank with deviled eggs and sparkling ciders."]
   :-> [:eichenwalde :hanzo :choice]]

   [:eichenwalde :hanzo :choice]
   [:miranda/text-option
    "What will you do?"
    ["" (constantly true) start-date]
    ["Converse with your other teammates" (constantly true)
     [:eichenwalde :hanzo :no]]]

   [:eichenwalde :hanzo :yes]
   [:miranda/dialogue
    ["Hanzo" [] "I suppose you can just limit me to reasonable amount of brunch."]
    :-> [:eichenwalde :hanzo :cutscene]]

   [:eichenwalde :hanzo :no]
   [:miranda/dialogue
    ["Hanzo" [] "You cannot stop me, Satya. I can climb up walls and you cannot. Thus, I will go alone. But! I am sending you the bill if I go overboard. Come meet me at the bar  if you change your mind."]
    :-> [:eichenwalde :choice]]

   [:eichenwalde :hanzo :cutscene]
   [:miranda/narration
    "Your attempts to resist the lure of brunch are short lived, after splitting a pitcher of sangria with Hanzo, you gave in and each got an order of hazelnut waffles with blackberry cream paired the bottomless drink of the day, a delicious blend of blackberry liqueur, lemon, and Weissbier. Just as your food was about to arrive, McCree also showed up. Apparently the mere mention of brunch in Hanzo’s texts had prompted him to abandon his square dancing class, leaving them to watch “The Good, The Bad, And the Ugly”, claiming they’d need to better understand the cowboy lifestyle to be able to dance. You three had a very tasty brunch, and it was only mildly marred by McCree getting a whole lot of egg yolk on his beard and poncho."
    :-> [:junkertown :intro]]})
