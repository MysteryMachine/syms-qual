(ns syms-qual.data.scenes.junkertown.efi
  (:require [carmen.util :as anim :refer [scoot]]
            [syms-qual.util :as util :refer [inc-transition]]))

(def data
  {[:spawn :efi 0]
   [:miranda/dialogue
    ["Symmetra" [[:orisa :_neutral (scoot -80 -3 1.5)] [:efi :_neutral (scoot -80 -13 1.5)]  [:symmetra :_helloWarm (scoot 80 5 1.5)]] "Hello, you two."]
    ["Orisa" [[:orisa :_wave (scoot -3)] [:efi :_smile (scoot -13)]  [:symmetra :_smile (scoot 5)]] "Greetings!"]
    ["Efi" [[:orisa :_neutralHappy (scoot -3)] [:efi :_wave (scoot -13)]  [:symmetra :_smile (scoot 5)]] "Symmetra! Just the gal I was looking for!"]
    ["Symmetra" [[:orisa :_neutralHappy (scoot -3)] [:efi :_neutral (scoot -13)]  [:symmetra :_explainUncomfortable (scoot 5)]] "What can I help you with, Efi?"]
    ["Efi" [[:orisa :_neutralHappy (scoot -3)] [:efi :_lookBack (scoot -13)]  [:symmetra :_smile (scoot 5)]] "I, um, just have a big favor to ask of you."]
    ["Symmetra" [[:orisa :_neutralHappy (scoot -3)] [:efi :_neutral (scoot -13)]  [:symmetra :_sass (scoot 5)]] "Yes?"]
    ["Efi" [[:orisa :_neutralHappy (scoot -3)] [:efi :_explain (scoot -13)]  [:symmetra :_sass (scoot 5)]] "There’s a Luciobol match at the stadium in Sydney today!"]
    ["Symmetra" [[:orisa :_neutralHappy (scoot -3)] [:efi :_neutral (scoot -13)]  [:symmetra :_interested (scoot 5)]] "Oh is there?"]
    ["Efi" [[:orisa :_neutralHappy (scoot -3)] [:efi :_armsUpBall (scoot -13)]  [:symmetra :_smile (scoot 5)]] "Can’t you just hear it now? The roar of the crowd? The bwomp of the boops? The audible joy of extreme wall riding?"]
    ["Orisa" [[:orisa :_pointUp (scoot -3)] [:efi :_smile (scoot -13)]  [:symmetra :_smile (scoot 5)]] "I can’t wait for you to finish updating my OS so I can use those skates that Lucio gave me. I too wish to share in the extreme joy."]
    ["Efi" [[:orisa :_neutralHappy (scoot -3)] [:efi :_pointUp (scoot -13)]  [:symmetra :_smile (scoot 5)]] "Which is why it is imperative that I go to the match today! It is a research trip. Won’t you come with me, Symmetra?"]
    ["Symmetra" [[:orisa :_neutral (scoot -3)] [:efi :_neutral (scoot -13)]  [:symmetra :_explainUncomfortable (scoot 5)]] "I’m not much of a sports fan, but thank you for the invitation."]
    ["Efi" [[:orisa :_neutral (scoot -3)] [:efi :_smug (scoot -13)]  [:symmetra :_neutral (scoot 5)]] "Symmetra! Of all the people in this program, I thought you’d understand the thrill of seeing high level performance regardless of the field."]
    ["Efi" [[:orisa :_neutral (scoot -3)] [:efi :_explain (scoot -13)]  [:symmetra :_neutral (scoot 5)]] "Plus. It’s a gaggle of cloned Lucios, playing a game together."]
    ["Efi" [[:orisa :_neutralHappy (scoot -3)] [:efi :_pointUp (scoot -13)]  [:symmetra :_neutral (scoot 5)]] "Number one? That’s babe-a-licious."]
    ["Efi" [[:orisa :_neutralHappy (scoot -3)] [:efi :_two (scoot -13)]  [:symmetra :_awkward (scoot 5)]] "Number two? That’s a philosophical issue fit for a philosopher-queen. Is it even ethical to play rip-off Rocket League with your own clones?"]
    ["Symmetra" [[:orisa :_neutralHappy (scoot -3)] [:efi :_neutral (scoot -13)]  [:symmetra :_explainSad (scoot 5)]] "I’m sorry, Efi."]
    ["Efi" [[:orisa :_neutral (scoot -3)] [:efi :_explain (scoot -13)]  [:symmetra :_sadSmile (scoot 5)]] "Look, let me level with you. I need a ride to get to this event. I’m a dang super genius but I’m not a licensed driver. I could build a self driving car, but apparently in this country you need a license for those too!"]
    ["Symmetra" [[:orisa :_neutral (scoot -3)] [:efi :_smug (scoot -13)]  [:symmetra :_explainUncomfortable (scoot 5)]] "I see. But I do not know if I’ll be able to abandon the match."]
    ["Efi" [[:orisa :_neutral (scoot -3)] [:efi :_eyeRoll (scoot -13)]  [:symmetra :_neutral (scoot 5)]] "Ughhhhhh…"]
    ["Symmetra" [[:orisa :_neutral (scoot -3)] [:efi :_eyeRoll (scoot -13)]  [:symmetra :_confused (scoot 5)]] "Efi?"]
    ["Efi" [[:orisa :_neutral (scoot -3)] [:efi :_lookBack (scoot -13)]  [:symmetra :_confused (scoot 5)]] "Don’t mind me. I’m just trying to see if pre-teen angst translates into me getting more of what I want."]
    ["Symmetra" [[:orisa :_neutral (scoot -3)] [:efi :_smug (scoot -13)]  [:symmetra :_skeptical (scoot 5)]] "And your verdict?"]
    ["Efi" [[:orisa :_neutralHappy (scoot -3)] [:efi :_pointUp (scoot -13)]  [:symmetra :_WTF (scoot 5)]] "I don’t think it will."]
    ["Efi" [[:orisa :_neutralHappy (scoot -3)] [:efi :_armsUpEyesClosed (scoot -13)]  [:symmetra :_awkward (scoot 5)]] "I’d love it so much if we went, though. I’ll buy you a cute and stylishly cut replica jersey and everything!"]
    ["Efi" [[:orisa :_neutralHappy (scoot -3)] [:efi :_explain (scoot -13)]  [:symmetra :_awkward (scoot 5)]] "But, I get it, Satya, you have responsibilities."]
    ["Efi" [[:orisa :_neutralHappy (scoot -3)] [:efi :_smug (scoot -13)]  [:symmetra :_confused (scoot 5)]] "However…"]
    ["Symmetra" [[:orisa :_neutralHappy (scoot -3)] [:efi :_neutral (scoot -13)]  [:symmetra :_skeptical (scoot 5)]] "However?"]
    ["Efi" [[:orisa :_neutralHappy (scoot -3)] [:efi :_pointUp (scoot -13)]  [:symmetra :_skeptical (scoot 5)]] "With the abundance of scrap in the current location, I could probably whip up a robotic replacement for you. It shouldn’t take me more than a couple of minutes to get something running then we just strap your gun to them and we’re good to go."]
    ["Symmetra" [[:orisa :_neutralHappy (scoot -3)] [:efi :_smile (scoot -13)]  [:symmetra :_explain (scoot 5)]] "While that is a good idea, it goes against all kinds of Vishkar regulations."]
    ["Efi" [[:orisa :_neutralHappy (scoot -3)] [:efi :_smug (scoot -13)]  [:symmetra :_neutral (scoot 5)]] "So?"]
    ["Symmetra" [[:orisa :_neutralHappy (scoot -3)] [:efi :_smug (scoot -13)]  [:symmetra :_confused (scoot 5)]] "Breaking rules is bad?"]
    ["Efi" [[:orisa :_neutralHappy (scoot -3)] [:efi :_lookBack (scoot -13)]  [:symmetra :_confused (scoot 5)]] "Not if they’re silly rules. I’m a child genius, I can say what is and is not proper usage of technology."]
    ["Symmetra" [[:orisa :_neutralHappy (scoot -3)] [:efi :_neutral (scoot -13)]  [:symmetra :_thinking (scoot 5)]] "You have a point, but I am still unsure. I will need some time to ruminate on this."]
    ["Efi" [[:orisa :_neutralHappy (scoot -3)] [:efi :_wave (scoot -13)]  [:symmetra :_smile (scoot 5)]] "Alright! Let us know what you decide"]
    :-> [:spawn :efi :choice]]

   [:spawn :efi :choice]
   [:miranda/text-option
    "What will you do?"
    ["Enjoy a sports" (constantly true)
     [:-> [:spawn :efi :yes]]]
    ["Let down your smol friend" (constantly true)
     [:-> [:spawn :efi :no]]]]

   [:spawn :efi :yes]
   [:miranda/dialogue
    ["Symmetra" [[:orisa :_neutralHappy (scoot -3)] [:efi :_smile (scoot -13)]  [:symmetra :_explainUncomfortable (scoot 5)]] "I think I’ve decided. I will join you."]
    ["Efi" [[:orisa :_neutralHappy (scoot -3)] [:efi :_armsUpExcited (scoot -13)]  [:symmetra :_smile (scoot 5)]] "Yeeaaaaah! I’m ready! Let's go!"]
    :-> [:efi]]

   [:spawn :efi :no]
   [:miranda/dialogue
    ["Efi" [[:orisa :_neutral (scoot -3)] [:efi :_lookBack (scoot -13)]  [:symmetra :_neutral (scoot 5)]] "Yeah. I understand. Let me know if you change your mind."]
    :-> [:spawn :choice]]

   [:efi]
   [:miranda/characters
    [[]]
    :-> [:efi :text]]

   [:efi :text]
   [:miranda/narration
    "Though Efi’s pitch had convinced you that your time at the match would be enjoyable, you could not help but spend the entire show pondering the existential horror of seeing clones of your friend engage in a sport. The real Lucio MCed the event, or so you hoped. I couldn’t shake the feeling that maybe every interaction you have had with Lucio had been with a clone."
    "After all, why would a busy pop star engage in paramilitary operations? Unnerved, you excuse yourself a little early and went to the parking lot to do some hard thinking. After the event was over, you escorted Efi back to Junkertown, only to learn that your team had lost the match."
    :=> [:gibralter [:spawn :intro] 0]]})
