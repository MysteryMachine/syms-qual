(ns syms-qual.data.scenes.junkertown.date-1
  (:require [carmen.util :as anim :refer [scoot]]
            [syms-qual.util :as util :refer [inc-transition]]))

(def strap-in
  [:miranda/dialogue
   ["Roadhog" [[:junkrat :_ballSmileNod (scoot 5)] [:roadhog :_basket (scoot -22)] [:symmetra :_helmetNeutral (scoot 8)]] "Time to go, friends."]
   ["Junkrat" [[:junkrat :_ballPointUp (scoot 5)] [:roadhog :_basket (scoot -22)] [:symmetra :_helmetNeutral (scoot 8)]] "Aye aye! Strap yourself in, Satya, we don’t respect stop signs!"]
   ["Symmetra" [[:junkrat :_ballSmile (scoot 5)] [:roadhog :_basket (scoot -22)] [:symmetra :_helmetBewildered (scoot 8)]] "Excuse me?"]
   ["Junkrat" [[:junkrat :_ballWink (scoot 5)] [:roadhog :_basket (scoot -22)] [:symmetra :_helmetBewildered (scoot 8)]] "Can’t respect what isn’t there! Yahoo!"]])

(def data
  {[:spawn :junkrat 1]
   [:miranda/dialogue
    ["Junkrat" [[:junkrat :_ballSmile (scoot -80 -3 1)] [:efi :_neutral (scoot -80 -18 1)] [:symmetra :_smile (scoot 0 3 1)]] "Efi! I got her to agree to make the part."]
    ["Efi" [[:junkrat :_ballSmileNod (scoot -3)] [:efi :_smug (scoot -18)] [:symmetra :_neutral (scoot 3)]] "Oh yeah? I see. I suppose my ship wins out over my Lucio fandom."]
    ["Symmetra" [[:junkrat :_ballSmileNod (scoot -3)] [:efi :_smug (scoot -18)] [:symmetra :_confused (scoot 3)]] "Huh?"]
    ["Efi" [[:junkrat :_ballSmileNod (scoot -3)] [:efi :_explain (scoot -18)] [:symmetra :_confused (scoot 3)]] "Well, I wanted you to take me to Luciobol, but I also wanted you to go with Junky cause I ship it. You know what they say, if you love something, let it go. If they kiss a cute boy, write secret forbidden love story."]
    ["Junkrat" [[:junkrat :_ballFrown (scoot -3)] [:efi :_smug (scoot -18)] [:symmetra :_confused (scoot 3)]] "I don’t think anyone’s ever said that."]
    ["Efi" [[:junkrat :_ballSmileNod (scoot -3)] [:efi :_pointUp (scoot -18)] [:symmetra :_confused (scoot 3)]] "Tell that to my Fall Out Boy/Panic at the Disco slash fic."]
    ["Symmetra" [[:junkrat :_ballSmileNod (scoot -3)] [:efi :_neutral (scoot -18)] [:symmetra :_explainUncomfortable (scoot 3)]] "Efi, there are a lot of complex moral and ethical issues with shipping real live people, you should really think about--"]
    ["Efi" [[:junkrat :_ballSmileNod (scoot -3)] [:efi :_armsUpEyesClosed (scoot -18)] [:symmetra :_awkward (scoot 3)]] "If you love me let me gooooo!"]
    ["Junkrat" [[:junkrat :_wrist (scoot -3)] [:efi :_smile (scoot -18)] [:symmetra :_awkward (scoot 3)]] "I do like that song, actually."]
    ["Efi" [[:junkrat :_ballSmileNod (scoot -3)] [:efi :_lookBack (scoot -18)] [:symmetra :_awkward (scoot 3)]] "Yeah. Imagine being caught between shipping your friends, and needing to use them to give you a ride to a Luciobol game."]
    ["Junkrat" [[:junkrat :_ballPointUp (scoot -3)] [:efi :_neutral (scoot -18)] [:symmetra :_awkward (scoot 3)]] "It’s a story for the ages."]
    ["Efi" [[:junkrat :_ballSmileNod (scoot -3)] [:efi :_armsUpStressed (scoot -18)] [:symmetra :_awkward (scoot 3)]] "A veritable tragedy!"]
    ["Efi" [[:junkrat :_ballSmileNod (scoot -3)] [:efi :_pointUpEyesClosed (scoot -18)] [:symmetra :_awkward (scoot 3)]] "But love wins out."]
    ["Efi" [[:junkrat :_ballSmileNod (scoot -3)] [:efi :_explain (scoot -18)] [:symmetra :_awkward (scoot 3)]] "Anyway, back to the point of this meeting. Symmetra, here are the specifications for the part."]
    ["Symmetra" [[:junkrat :_ballSmileNod (scoot -3)] [:efi :_neutral (scoot -18)] [:symmetra :_frustratedConfused (scoot 3)]] "Did you even listen to anything that I was--- You know what, it’s fine. Let me see those."]
    ["Symmetra" [[:junkrat :_ballSmile (scoot -3)] [:efi :_neutral (scoot -18)] [:symmetra :_craftBrake (scoot 3)]] "Hmm, this  does not seem all too complicated, here, let me try this."]
    ["Efi" [[:junkrat :_ballSmile (scoot -3)] [:efi :_smile (scoot -18)] [:symmetra :_craftBrake (scoot 3)]] "Yeah! That looks good. Thanks! Now just let me get this installed."]
    ["Junkrat" [[:junkrat :_fibbin (scoot -3)] [:efi :_smile (scoot -18)] [:symmetra :_smile (scoot 3)]] "Thanks a lot for takin’ the time, Efi."]
    ["Efi" [[:junkrat :_ballSmileNod (scoot -3)] [:efi :_explain (scoot -18)] [:symmetra :_smile (scoot 3)]] "Yeah! No worries. I know this is an important day for you."]
    ["Junkrat" [[:junkrat :_ballEmbarassedBlush (scoot -3)] [:efi :_neutral (scoot -18)] [:symmetra :_smile (scoot 3)]] "Yeah."]
    ["Symmetra" [[:junkrat :_ballEmbarassedBlush (scoot -3)] [:efi :_neutral (scoot -18)] [:symmetra :_explainUncomfortable (scoot 3)]] "What’s so important about it."]
    ["Junkrat" [[:junkrat :_coughBlush (scoot -3)] [:efi :_smile (scoot -18)] [:symmetra :_1000Mile (scoot 3)]] "…"]
    ["Efi" [[:junkrat :_coughBlush (scoot -3)] [:efi :_smug (scoot -18)] [:symmetra :_1000Mile (scoot 3)]] "Well? Tell her!"]
    ["Junkrat" [[:junkrat :_ballConfusedBlush (scoot -3)] [:efi :_neutral (scoot -18)] [:symmetra :_1000Mile (scoot 3)]] "Darl’ uh."]
    ["Symmetra" [[:junkrat :_ballConfusedBlush (scoot -3)] [:efi :_neutral (scoot -18)] [:symmetra :_embarassed (scoot 3)]] "…"]
    ["Junkrat" [[:junkrat :_terrifiedBlushLeft (scoot -3)] [:efi :_neutral (scoot -18)] [:symmetra :_embarassed (scoot 3)]] "Nerves running high today for a lot of different reasons, but I gotta admit, there are some feelings involved here and I’ve been struggling to find a way to tell you..."]
    ["Junkrat" [[:junkrat :_handHipsBlush (scoot -3)] [:efi :_neutral (scoot -18)] [:symmetra :_embarassed (scoot 3)]] "And... This place we’re going, it’s a safe space for me… and I wanted to you to join us because you also make me feel safe and..."]
    ["Junkrat" [[:junkrat :_ballAdoringBlushDown (scoot -3)] [:efi :_neutral (scoot -18)] [:symmetra :_embarassed (scoot 3)]] "So if you come, you gotta understand that this is...uh…"]
    ["Efi" [[:junkrat :_ballAdoringBlushDown (scoot -3)] [:efi :_armsUpExcited (scoot -18)] [:symmetra :_embarassed (scoot 3)]] "It’s a date, Satya! There may be kissing! Maybe there won’t be if you don’t like kissing! But there very well could be smooches!"]
    :-> [:spawn :junkrat :choice 2]]

   [:spawn :junkrat :choice 2]
   [:miranda/option
    "Symmetra" [[:junkrat :_ballAdoringBlushDown (scoot -3)] [:efi :_neutral (scoot -18)] [:symmetra :_embarassed (scoot 3)]]
    "I will join you, Jamie. I’d like to see where things go."
    "I’m sorry, Jamie. I value your friendship but I don’t share your romantic intentions."]

   [:spawn :junkrat :choice 2 1]
   (concat
    [:miranda/dialogue
     ["Junkrat" [[:junkrat :_ballConfused (scoot -3)] [:efi :_neutral (scoot -18)] [:symmetra :_neutral (scoot 3)]] "I see. Well! That’s fine!"]
     ["Efi" [[:junkrat :_ballSmileNod (scoot -3)] [:efi :_smug (scoot -18)] [:symmetra :_neutral (scoot 3)]] "Oh boo! I have to cross the ship out from my shipping matrix."]
     ["Junkrat" [[:junkrat :_fibbinSad (scoot -3)] [:efi :_smug (scoot -18)] [:symmetra :_neutral (scoot 3)]] "Efi...I still feel like having a shipping chart is maybe not a thing you should do?"]
     ["Efi" [[:junkrat :_ballSmileNod (scoot -3)] [:efi :_pointUpEyesClosed (scoot -18)] [:symmetra :_neutral (scoot 3)]] "It’s a matrix, Junky. Don’t devalue the mathematical value of my shipping matrix."]
     ["Junkrat" [[:junkrat :_ballExplainConcerned (scoot -3)] [:efi :_smug (scoot -18)] [:symmetra :_neutral (scoot 3)]] "Look, Efi. Relationships, to some people, aren’t just a casual thing you get in and out of. It’s good to respect people’s feelings."]
     ["Junkrat" [[:junkrat :_ballPointUpSerious (scoot -3)] [:efi :_smug (scoot -18)] [:symmetra :_neutral (scoot 3)]] "Satya shouldn’t need to feel awkward about saying no."]
     ["Symmetra" [[:junkrat :_ballSmileNod (scoot -3)] [:efi :_neutral (scoot -18)] [:symmetra :_explainUncomfortable (scoot 3)]] "Thank you, Jamie."]
     ["Junkrat" [[:junkrat :_ballBack (scoot -3)] [:efi :_neutral (scoot -18)] [:symmetra :_neutral (scoot 3)]] "Well! Let’s finish installing this part. Roadie will be here soon."]]
    (inc-transition
     [:-> [:spawn :junkrat 2]]
     :junkrat/no-date))

   [:spawn :junkrat :choice 2 0]
   (concat
    [:miranda/dialogue
     ["Junkrat" [[:junkrat :_shyblush (scoot -3)] [:efi :_smile (scoot -18)] [:symmetra :_smile (scoot 3)]] "Perfect! Roadhog is bringing billy tea."]
     ["Efi" [[:junkrat :_shyblush (scoot -3)] [:efi :_pointUp (scoot -18)] [:symmetra :_smile (scoot 3)]] "Yes! I knew there was some chemistry. I’m so excited to see cute vacation photos of you when you go steady!"]
     ["Junkrat" [[:junkrat :_wrist (scoot -3)] [:efi :_neutral (scoot -18)] [:symmetra :_smile (scoot 3)]] "Let’s be honest, the only point to have a relationship in the first place is to have cute vacation photos."]
     ["Efi" [[:junkrat :_ballSmileNod (scoot -3)] [:efi :_smile (scoot -18)] [:symmetra :_smile (scoot 3)]] "Agreed!"]
     ["Junkrat" [[:junkrat :_ballPointUp (scoot -3)] [:efi :_neutral (scoot -18)] [:symmetra :_smile (scoot 3)]] "We gotta focus, though, loves. We shouldn’t delay! Date time approaches!"]]
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
    ["Roadhog" [[:junkrat :_ballSmile (scoot 5)] [:roadhog :_basket (scoot -80 -22 1)] [:symmetra :_smile (scoot 8)]] "Hi."]
    :transition :miranda/conditional
    [#(= (:points/junkrat %) 3) [:-> [:spawn :no-date :talk]]
     :else                      [:-> [:spawn :junkrat 4]]]]

   [:spawn :no-date :talk]
   [:miranda/dialogue
    ["Junkrat" [[:junkrat :_ballConfused (scoot 5)] [:roadhog :_basket (scoot -22)] [:symmetra :_smile (scoot 8)]] "Hey. Satya. Thanks for helping out with the bike and for being so understanding in general."]
    ["Symmetra" [[:junkrat :_ballSmile (scoot 5)] [:roadhog :_basket (scoot -22)] [:symmetra :_sass (scoot 8)]] "Think nothing of it!"]
    ["Roadhog" [[:junkrat :_ballSmile (scoot 5)] [:roadhog :_basketExplain (scoot -22)] [:symmetra :_smile (scoot 8)]] "We owe you dinner."]
    ["Junkrat" [[:junkrat :_ballPointUp (scoot 5)] [:roadhog :_basket2 (scoot -22)] [:symmetra :_smile (scoot 8)]] "Yeah, next time you’re in town! We’ll eat real good."]
    ["Roadhog"  [[:junkrat :_ballSmileNod (scoot 5)] [:roadhog :_basket (scoot -22)] [:symmetra :_bewildered (scoot 8)]] "Dog’s eye and dead horse."]
    ["Symmetra" [[:junkrat :_ballSmileNod (scoot 5)] [:roadhog :_basket (scoot -22)] [:symmetra :_skeptical (scoot 8)]] "I am not sure this is a delicacy for which I have the stomach."]
    ["Junkrat" [[:junkrat :_ballExplain (scoot 5)] [:roadhog :_basket (scoot -22)] [:symmetra :_neutral (scoot 8)]] "No, no, it’s not-- it’s… a rhyming thing. Meat pie and tomato sauce. And they’ve got veggie types too if you’d rather."]
    ["Symmetra" [[:junkrat :_ballSmile (scoot 5)] [:roadhog :_basket (scoot -22)] [:symmetra :_explainUncomfortable (scoot 8)]] "That sounds much more appetising. I would love to. Enjoy your date."]
    ["Junkrat" [[:junkrat :_ballWink (scoot 5)] [:roadhog :_basket (scoot -22)] [:symmetra :_smile (scoot 8)]] "I’ll do me best! Have a good’un!"]
    :-> [:spawn :no-date :final]]

   [:spawn :no-date :final]
   [:miranda/narration
    "You go back to the match in time to help out with the very last seconds, but are not allowed to participate. The replacements Efi managed to
 rig up do okay, but you still do not manage to win. You decide to go have some quiet time before your flight back tomorrow.
"
    :=> [:gibralter [:spawn :intro] 0]]

   [:spawn :junkrat 4]
   [:miranda/dialogue
    ["Junkrat" [[:junkrat :_shyblush (scoot 5)] [:roadhog :_basket (scoot -22)] [:symmetra :_smile (scoot 8)]] "Roadie! She said yes!"]
    ["Roadhog" [[:junkrat :_shyblush (scoot 5)] [:roadhog :_basket2 (scoot -22)] [:symmetra :_smile (scoot 8)]] "Cool."]
    ["Junkrat" [[:junkrat :_ballAdoringBlushDown (scoot 5)] [:roadhog :_basket (scoot -22)] [:symmetra :_strainedSmile (scoot 8)]] "Right?  Ehehee!"]
    ["Junkrat" [[:junkrat :_helmet (scoot 5)] [:roadhog :_basket (scoot -22)] [:symmetra :_smile (scoot 8)]] "So. I’ve got you a helmet. Figured you’d want safety first. We have a two seat bike. Do you want your own seat, Satya?"]
    :-> [:spawn :junkrat :option 0]]

   [:spawn :junkrat :option 0]
   [:miranda/option
    "Symmetra" [[:junkrat :_helmet (scoot 5)] [:roadhog :_basket (scoot -22)] [:symmetra :_smile (scoot 8)]]
    "Yes! Sorry, I need my personal space."
    "It is too dangerous for you to not be in the sidecar. You can sit on my lap."]

   [:spawn :junkrat :option 0 0]
   [:miranda/dialogue
    ["Junkrat" [[:junkrat :_ballPointUp (scoot 5)] [:roadhog :_basket (scoot -22)] [:symmetra :_helmetNeutral (scoot 8)]] "No problem! It’s uh, a little more of a dangerous ride from me, but it’s nothing that can’t be cured with some of Roadhog’s aromatherapy."]
    ["Roadhog" [[:junkrat :_ballSmileNod (scoot 5)] [:roadhog :_basket2 (scoot -22)] [:symmetra :_helmetNeutral (scoot 8)]] "Breathing deeply into nice smells is good self care."]
    ["Junkrat" [[:junkrat :_ballPointUp (scoot 5)] [:roadhog :_basket (scoot -22)] [:symmetra :_helmetBewildered (scoot 8)]] "That literally heals broken bones!"]
    ["Roadhog" [[:junkrat :_ballPointUp (scoot 5)] [:roadhog :_basket2 (scoot -22)] [:symmetra :_helmetBewildered (scoot 8)]] "..."]
    :-> [:spawn :junkrat 5 :a]]

   [:spawn :junkrat :option 0 1]
   [:miranda/dialogue
    ["Junkrat" [[:junkrat :_scandalized2 (scoot 5)] [:roadhog :_basket (scoot -22)] [:symmetra :_helmetNeutral (scoot 8)]] "I. Um. Yes."]
    ["Junkrat" [[:junkrat :_scandalizedTalk (scoot 5)] [:roadhog :_basket (scoot -22)] [:symmetra :_helmetNeutral (scoot 8)]] "I will do that."]
    ["Symmetra" [[:junkrat :_scandalized2 (scoot 5)] [:roadhog :_basket (scoot -22)] [:symmetra :_helmetLaugh (scoot 8)]] "Hah. You’re so red."]
    ["Junkrat" [[:junkrat :_terrifiedBlushLeftExtra (scoot 5)] [:roadhog :_basket (scoot -22)] [:symmetra :_helmetLaugh (scoot 8)]] "H-hush!"]
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
