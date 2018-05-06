(ns syms-qual.data.scenes.junkertown.efi
  (:require [carmen.util :as anim :refer [scoot]]
            [syms-qual.util :as util :refer [inc-transition]]))

(def data
  {[:spawn :efi 0]
   [:miranda/dialogue
    ["Symmetra" [] "Hello, you two."]
    ["Orisa" [] "Greetings!"]
    ["Efi" [] "Symmetra! Just the gal I was looking for!"]
    ["Symmetra" [] "What can I help you with, Efi?"]
    ["Efi" [] "I, um, just have a big favor to ask of you."]
    ["Symmetra" [] "Yes?"]
    ["Efi" [] "There’s a Luciobol match at the stadium in Sydney today!"]
    ["Symmetra" [] "Oh is there?"]
    ["Efi" [] "Can’t you just hear it now? The roar of the crowd? The bwomp of the boops? The audible joy of extreme wall riding?"]
    ["Orisa" [] "I can’t wait for you to finish updating my OS so I can use those skates that Lucio gave me. I wish to share in the extreme joy."]
    ["Efi" [] "Which is why it is imperative that I go to the match today! It is a research trip. Won’t you come with me, Symmetra?"]
    ["Symmetra" [] "I’m not much of a sports fan, but thank you for the invitation."]
    ["Efi" [] "Symmetra! Of all the people in this program, I thought you’d understand the thrill of seeing high level performance regardless of the field."]
    ["Efi" [] "Plus. It’s a gaggle of cloned Lucios, playing a game together."]
    ["Efi" [] "Number one? That’s babe-a-licious."]
    ["Efi" [] "Number two? That’s a philosophical issue fit for a philosopher-queen. Is it even ethical to play rip-off Rocket League with your own clones?"]
    ["Symmetra" [] "I’m sorry, Efi."]
    ["Efi" [] "Look, let me level with you. I need a ride to get to this event. I’m a dang super genius but I’m not a licensed driver. I could build a self driving car, but apparently in this country you need a license for those too!"]
    ["Symmetra" [] "I see. I do not know if I’ll be able to abandon the match."]
    ["Efi" [] "Ughhhhhh…"]
    ["Symmetra" [] "Efi?"]
    ["Efi" [] "Don’t mind me. I’m just trying to see if pre-teen angst translates into me getting more of what I want."]
    ["Symmetra" [] "And your verdict?"]
    ["Efi" [] "I don’t think it will. I’d love it so much if we went, though. I’ll buy you a cute and stylishly cut replica jersey and everything! But, I get it, Satya, you have responsibilities."]
    ["Efi" [] "However…"]
    ["Symmetra" [] "However?"]
    ["Efi" [] "With the abundance of scrap in the current location, I could probably whip up a robotic replacement for you. It shouldn’t take me more than a couple of minutes to get something running then we just strap your gun to them and we’re good to go."]
    ["Symmetra" [] "While that is a good idea, it goes against all kinds of Vishkar regulations."]
    ["Efi" [] "So?"]
    ["Symmetra" [] "Breaking rules is bad?"]
    ["Efi" [] "Not if they’re silly rules. I’m a child genius, I can say what is and is not proper usage of technology."]
    ["Symmetra" [] "You have a point, but I am still unsure. I will need some time to ruminate on this."]
    ["Efi" [] "Alright! Let me know."]
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
    ["Symmetra" [] "I think I’ve decided. I will join you."]
    ["Efi" [] "Yeeaaaaah! I’m ready."]
    :-> [:efi]]

   [:spawn :efi :no]
   [:miranda/dialogue
    ["Efi" [] "Yeah. I understand. Let me know if you change your mind."]
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
