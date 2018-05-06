(ns syms-qual.data.scenes.junkertown.date-1
  (:require [carmen.util :as anim :refer [scoot]]
            [syms-qual.util :as util :refer [inc-transition]]))

(def strap-in
  [:miranda/dialogue
   ["Roadhog" [] "Time to go, friends."]
   ["Junkrat" [] "Aye aye! Strap yourself in, Satya, we don’t respect stop signs!"]
   ["Symmetra" [] "Excuse me?"]
   ["Junkrat" [] "Can’t respect what isn’t there! Yahoo!"]])

(def data
  {[:spawn :junkrat 1]
   [:miranda/dialogue
    ["Junkrat" [] "Efi! I got her to agree to make the part."]
    ["Efi" [] "Oh yeah? I see. I suppose my ship wins out over my Lucio fandom."]
    ["Symmetra" [] "Huh?"]
    ["Efi" [] "Well, I wanted you to take me to Luciobol, but I also wanted you to go with Junky cause I ship it. You know what they say, if you love something, let it go. If they kiss a cute boy, write secret forbidden love story."]
    ["Junkrat" [] "I don’t think anyone’s ever said that."]
    ["Efi" [] "Tell that to my Fall Out Boy/Panic at the Disco slash fic."]
    ["Symmetra" [] "Efi, there are a lot of complex moral and ethical issues with shipping real live people, you should really think about--"]
    ["Efi" [] "If you love me let me gooooo!"]
    ["Junkrat" [] "I do like that song, actually."]
    ["Efi" [] "Yeah. Imagine being caught between shipping your friends, and needing to use them to give you a ride to a Luciobol game."]
    ["Junkrat" [] "It’s a story for the ages."]
    ["Efi" [] "A veritable tragedy!"]
    ["Efi" [] "But love wins out. But back to the point of this meeting. Symmetra, here are the specifications for the part."]
    ["Symmetra" [] "Did you even hear anything that--- You know what, it’s fine. Let me see those."]
    ["Symmetra" [] "Hmm, this  does not seem all too complicated, here, let me try this."]
    [nil [] "You bend light to produce the required part."]
    ["Efi" [] "Yeah! That looks good. Thanks!"]
    ["Junkrat" [] "Thanks a lot for takin’ the time, Efi."]
    ["Efi" [] "Yeah! No worries. I know this is an important day for you."]
    ["Junkrat" [] "Yeah."]
    ["Symmetra" [] "What’s so important about it."]
    ["Junkrat" [] "…"]
    ["Efi" [] "Well? Tell her!"]
    ["Junkrat" [] "Darl’ uh."]
    ["Symmetra" [] "…"]
    ["Junkrat" [] "Nerves running high today for a lot of different reasons, but I gotta admit, there are some feelings involved here and I’ve been struggling to find a way to tell you..."]
    ["Junkrat" [] "And... This place we’re going, it’s a safe space for me… and I wanted to you to join us because you also make me feel safe and..."]
    ["Junkrat" [] "So if you come, you gotta understand that this is...uh…"]
    ["Efi" [] "It’s a date, Satya! There may be kissing! Maybe there won’t be if you don’t like kissing! But there very well could be smooches!"]
    :-> [:spawn :junkrat :choice]]

   [:spawn :junkrat :choice]
   [:miranda/option
    "Symmetra" []
    "I’m sorry, Jamie. I value your friendship but I don’t share your romantic intentions."
    "I will join you, Jamie. I’d like to see where things go."]

   [:spawn :junkrat :choice 0]
   (concat
    [:miranda/dialogue
     ["Junkrat" [] "I see. Well! That’s fine!"]
     ["Efi" [] "Oh boo! I have to cross the ship out from my shipping matrix."]
     ["Junkrat" [] "Efi...I still feel like having a shipping chart is maybe not a thing you should do?"]
     ["Efi" [] "It’s a matrix, Junky. Don’t devalue the mathematical value of my shipping matrix."]
     ["Junkrat" [] "Look, Efi. Relationships, to some people, aren’t just a casual thing you get in and out of. It’s good to respect people’s feelings."]
     ["Junkrat" [] "Satya shouldn’t need to feel awkward about saying no."]
     ["Symmetra" [] "Thank you, Jamie."]
     ["Junkrat" [] "Well! Let’s finish installing this part. Roadie will be here soon."]]
    (inc-transition
     [:-> [:spawn :junkrat 2]]
     :junkrat/no-date))

   [:spawn :junkrat :choice 1]
   (concat
    [:miranda/dialogue
     ["Junkrat" [] "Perfect! Roadhog is bringing billy tea."]
     ["Efi" [] "Yes! I knew there was some chemistry. I’m so excited to see cute vacation photos of you when you go steady!"]
     ["Junkrat" [] "Let’s be honest, the only point to have a relationship in the first place is to have cute vacation photos."]
     ["Efi" [] "Agreed!"]
     ["Junkrat" [] "We gotta focus, though, loves. We shouldn’t delay! Date time approaches!"]]
    (inc-transition
     [:-> [:spawn :junkrat 2]]
     :points/junkrat))

   [:spawn :junkrat 2]
   (concat
    [:miranda/narration
     "You get to work on the the bike, fixing it just as Roadhog walks up with a basket full of food."]
    (inc-transition
     [:-> [:spawn :junkrat 3]]
     :points/junkrat))


   [:spawn :junkrat 3]
   [:miranda/dialogue
    ["Roadhog" [] "Hi."]
    :transition :miranda/conditional
    [#(= (:points/junkrat %) 3) [:-> [:spawn :no-date :talk]]
     :else                      [:-> [:spawn :junkrat 4]]]]

   [:spawn :no-date :talk]
   [:miranda/dialogue
    ["Junkrat" [] "Hey. Satya. Thanks for helping out with the bike and for being so understanding in general."]
    ["Symmetra" [] "Think nothing of it!"]
    ["Roadhog" [] "We owe you dinner."]
    ["Junkrat" [] "Yeah, next time you’re in town! We’ll eat real good."]
    ["Roadhog"  [] "Dog’s eye and dead horse."]
    ["Symmetra" [] "I am not sure this is a delicacy for which I have the stomach."]
    ["Junkrat" [] "No, no, it’s not-- it’s… a rhyming thing. Meat pie and tomato sauce. And they’ve got veggie types too if you’d rather."]
    ["Symmetra" [] "That sounds much more appetising. I would love to. Enjoy your date."]
    ["Junkrat" [] "I’ll do me best! Have a good’un!"]
    :-> [:spawn :no-date :final]]

   [:spawn :no-date :final]
   [:miranda/narration
    "You go back to the match in time to help out with the very last seconds, but are not allowed to participate. The replacements Efi managed to rig up do okay, but you still do not manage to win. You decide to go have some quiet time before your flight back tomorrow.
"
    :=> [:gibralter [:spawn :intro] 0]]

   [:spawn :junkrat 4]
   [:miranda/dialogue
    ["Junkrat" [] "Roadie! She said yes!"]
    ["Roadhog" [] "Cool."]
    ["Junkrat" [] "Right?  Ehehee!"]
    ["Junkrat" [] "So. I’ve got you a helmet. Figured you’d want safety first. We have a two seat bike. Do you want your own seat, Satya?"]
    :-> [:spawn :junkrat :option 0]]

   [:spawn :junkrat :option 0]
   [:miranda/option
    "Symmetra" []
    "Yes! Sorry, I need my personal space."
    "It is too dangerous for you to not be in the sidecar. You can sit on my lap."]

   [:spawn :junkrat :option 0 0]
   [:miranda/dialogue
    ["Junkrat" [] "No problem! It’s uh, a little more of a dangerous ride from me, but it’s nothing that can’t be cured with some of Roadhog’s aromatherapy."]
    ["Roadhog" [] "Breathing deeply into nice smells is good self care."]
    ["Junkrat" [] "That literally heals broken bones!"]
    ["Roadhog" [] "..."]
    :-> [:spawn :junkrat 5 :a]]

   [:spawn :junkrat :option 0 1]
   [:miranda/dialogue
    ["Junkrat" [] "I. Um. Yes."]
    ["Junkrat" [] "I will do that."]
    ["Symmetra" [] "Hah. You’re so red."]
    ["Junkrat" [] "H-hush!"]
    :-> [:spawn :junkrat 5 :b]]

   [:spawn :junkrat 5 :a]
   (concat strap-in [:-> [:junkrat-a-2]])

   [:spawn :junkrat 5 :b]
   (concat strap-in [:-> [:junkrat-a-1]])

   [:junkrat-a-1]
   [:miranda/characters
    [[]]
    :-> [:junkrat-a-1 :text]]

   [:junkrat-a-1 :text]
   [:miranda/narration
    "You did not expect Junkrat to be so warm and were vaguely concerned it might be related to the reportedly high volume of radiation in Junkertown, but you suppose it did explain his proclivity for being shirtless in a wide variety of climates."
    "Your deliberation on this matter was cut short by the sudden acceleration of the motorcycle at which point you decided to focus all of your energy on wrapping your arms as tightly as possible his waist in an attempt to function as a human seatbelt."
    "Although the high speeds with which Roadhog navigated the winding roads of the town were quite nerve wracking, but the complete lack of traffic allayed some of your fears."
    "Soon the ragtag structures and rusted out undercarriages of Junkertown gave way to rolling plains, and you found a nice spot in which to lay down your blanket. After you had settled in, Roadhog prepared the spread, beginning to heat up food with a small camping stove."
    :-> [:field 0]]

   [:junkrat-a-2]
   [:miranda/characters
    [[]]
    :-> [:junkrat-a-2 :text]]

   [:junkrat-a-2 :text]
   [:miranda/narration
    "Although the high speeds with which Roadhog navigated the winding roads of the town were quite nerve wracking, but the complete lack of traffic allayed some of your fears."
    "Soon the ragtag structures and rusted out undercarriages of Junkertown gave way to rolling plains, and you found a nice spot in which to lay down your blanket. After you had settled in, Roadhog prepared the spread, beginning to heat up food with a small camping stove."
    :-> [:field 0]]})
