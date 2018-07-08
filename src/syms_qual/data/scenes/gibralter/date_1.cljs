(ns syms-qual.data.scenes.gibralter.date-1
  (:require [carmen.util :as anim :refer [scoot]]
            [syms-qual.util :as util :refer [inc-transition]]))

(def data
  {[:door :pharah 0]
   [:miranda/narration
   "You make your way to the front gate where Pharah had said to meet her. You are surprised to find McCree hanging out there by himself, smoking a cigar."
   :-> [:door :pharah 1]]

   [:door :pharah 1]
   [:miranda/dialogue
    ["Symmetra" [[:mccree :_neutral (scoot -80 -12 1)] [:symmetra :_helloWarm (scoot 80 0 1)]] "Hello, McCree. How’s it going?"]
    ["McCree" [[:mccree :_fingerGuns (scoot -12)] [:symmetra :_neutral (scoot 0)]] "Satya! Hey! What are you doing here."]
    ["Symmetra" [[:mccree :_neutral (scoot -12)] [:symmetra :_embarassed (scoot 0)]] "Fareeha and I are, um, going on a date."]
    ["McCree" [[:mccree :_laugh (scoot -12)] [:symmetra :_embarassed (scoot 0)]] "Is that sooooo? I’m also looking for Fareeha."]
    ["Symmetra" [[:mccree :_neutral (scoot -12)] [:symmetra :_bewildered (scoot 0)]] "Really? What for?"]
    ["McCree" [[:mccree :_leanBack (scoot -12)] [:symmetra :_neutral (scoot 0)]] "Returning an old thing of her’s. She told me to wait here too."]
    ["Symmetra" [[:mccree :_neutral (scoot -12)] [:symmetra :_explain (scoot 0)]] "Oh? What is it you are returning?"]
    ["McCree" [[:mccree :_pointDown (scoot -12)] [:symmetra :_neutral (scoot 0)]] "Take a gander down here, darling."]
    ["Symmetra" [[:mccree :_neutral (scoot -12)] [:symmetra :_skepticalDown (scoot 0)]] "Roller...skates? And you are wearing them?"]
    ["McCree" [[:mccree :_pointUp (scoot -12)] [:symmetra :_skeptical (scoot 0)]] "Fun fact, Fareeha and I have always worn the same sized shoes. I’ve broken every pair of stilettos she’s ever owned."]
    ["Symmetra" [[:mccree :_neutral (scoot -12)] [:symmetra :_confused (scoot 0)]] "Thats..."]
    ["McCree" [[:mccree :_leanBack (scoot -12)] [:symmetra :_confused (scoot 0)]] "She’s only owned one pair.  A gift from her mama. I think Ana wanted her to stop dressing so much like a boy."]
    ["McCree" [[:mccree :_leanIn (scoot -12)] [:symmetra :_WTF (scoot 0)]] "Me borrowing them and breaking them trying to stand on top of a horse at full gallop? That’s called an accidental favor."]
    ["Symmetra" [[:mccree :_neutral (scoot -12)] [:symmetra :_explainWTF (scoot 0)]] "So you also “borrowed” these skates?"]
    ["McCree" [[:mccree :_leanBack (scoot -12)] [:symmetra :_WTF (scoot 0)]] "Yeah. Borrowed. It’s more accurate to say I liberated these from her."]
    ["McCree" [[:mccree :_point (scoot -12)] [:symmetra :_WTF (scoot 0)]] "And in case you didn’t know, when Americans say liberated, it means steal. I stole."]
    ["Symmetra" [[:mccree :_neutral (scoot -12)] [:symmetra :_explainWTF (scoot 0)]] "Yes, Jesse, I’m quite familiar with the old American doublespeak."]
    ["McCree" [[:mccree :_pointUp (scoot -12)] [:symmetra :_WTF (scoot 0)]] "Don’t you be droppin’ them ten dollar words on me, Satya. It’s unfair, and downright unamerican."]
    ["Symmetra" [[:mccree :_neutral (scoot -12)] [:symmetra :_eyeRoll (scoot 0)]] "Okay, Jesse. Yes, Americans often use words wrong."]
    ["McCree" [[:mccree :_fingerGuns (scoot -12)] [:symmetra :_eyeRoll (scoot 0)]] "Heck yea we do."]
    ["Symmetra" [[:mccree :_neutral (scoot -12)] [:symmetra :_bored (scoot 0)]] "Yep."]
    ["McCree" [[:mccree :_leanBack (scoot -12)] [:symmetra :_bored (scoot 0)]] "So."]
    ["Symmetra" [[:mccree :_leanBack (scoot -12)] [:symmetra :_explainUncomfortable (scoot 0)]] "Fareeha is late, you said?"]
    ["McCree" [[:mccree :_explain (scoot -12)] [:symmetra :_neutral (scoot 0)]] "Not like her to be. But uh, yeah Sure seems that way."]
    ["Symmetra" [[:mccree :_neutral (scoot -12)] [:symmetra :_frustratedConfused (scoot 0)]] "Certainly does."]
    ["McCree" [[:mccree :_leanIn (scoot -12)] [:symmetra :_neutral (scoot 0)]] "Wanna hear the story behind these skates?"]
    ["Symmetra" [[:mccree :_neutral (scoot -12)] [:symmetra :_explain (scoot 0)]] "Sure."]
    ["McCree" [[:mccree :_pointUp (scoot -12)] [:symmetra :_neutral (scoot 0)]] "So it may surprise you on account of me being so noble and gentlemanly and all, but I used to run with some real wild boys in my time."]
    ["McCree" [[:mccree :_leanBack (scoot -12)] [:symmetra :_WTF (scoot 0)]] "You know how it is, your boyfriend asks you to join a gang and you do because you don’t yet understand that you shouldn’t have to join a gang for somebody, even if you truly love them."]
    :-> [:door :pharah :option 0]]

   [:door :pharah :option 0]
   [:miranda/option
    "Symmetra" [[:mccree :_neutral (scoot -12)] [:symmetra :_WTF (scoot 0)]]
    "I have literally never experienced that."
    "How did your parents not stop you from making that poor decision."]

   [:door :pharah :option 0 0]
    [:miranda/dialogue
     ["McCree" [[:mccree :_fingerGuns (scoot -12)] [:symmetra :_WTF (scoot 0)]] "And I have literally never experienced a classroom where I didn’t fall asleep from boredom, poindexter."]
     ["Symmetra" [[:mccree :_neutral (scoot -12)] [:symmetra :_explainWTF (scoot 0)]] "I feel like I’m more as an arts person than a bog standard nerd, Jesse. Technology is just a medium with which one can create work, the same as any other."]
     ["McCree" [[:mccree :_leanIn (scoot -12)] [:symmetra :_WTF (scoot 0)]] "There are arts nerds, Satya. They sit there makin’ art that requires some Freudian mumbo jumbo to understand and--"]
     ["Symmetra" [[:mccree :_neutral (scoot -12)] [:symmetra :_confused (scoot 0)]] "Freud is not used in academic settings any--"]
     ["McCree" [[:mccree :_point (scoot -12)] [:symmetra :_eyeRoll (scoot 0)]] "See, there’s my point."]
     :-> [:door :pharah 2]]

   [:door :pharah :option 0 1]
    [:miranda/dialogue
     ["McCree" [[:mccree :_leanIn (scoot -12)] [:symmetra :_WTF (scoot 0)]] "I was literally raised in a barn, Satya. How do you think I maintain such a strong commitment to a cowboy gimmick as a grown adult?"]
     ["Symmetra" [[:mccree :_neutral (scoot -12)] [:symmetra :_eyeRoll (scoot 0)]] "I mean, plenty of Overwatch agents maintain gimmicks that are sort of stereotypical of their home country."]
     ["McCree" [[:mccree :_pointUp (scoot -12)] [:symmetra :_eyeRoll (scoot 0)]] "You’re literally incapable of letting me have fun, Satya. Laugh at one joke. That is all I ask."]
     :-> [:door :pharah 2]]

   [:door :pharah 2]

    [:miranda/dialogue
     ["Pharah" [[:mccree :_neutral (scoot -12 -20 1.5)] [:pharah :_reverseSalute (scoot 80 8 1.5)] [:symmetra :_smile (scoot 0 10 1.5)]] "Hello?"]
     ["McCree" [[:pharah :_reverseNeutral (scoot 8)] [:mccree :_wave (scoot -20)] [:symmetra :_smile (scoot 10)]] "Fareeha!"]
     ["Pharah" [[:mccree :_neutral (scoot -20)] [:pharah :_reverseLeanIn (scoot 8)] [:symmetra :_smile (scoot 10)]] "Howdy, Jesse."]
     ["McCree" [[:pharah :_reverseNeutral (scoot 8)] [:mccree :_point (scoot -20)] [:symmetra :_smile (scoot 10)]] "Howdy, yerself soldier! I, uh, found a lil something for you. Remember the old Blackwatch pin-up military equipment?"]
     ["Pharah" [[:pharah :_reverseLaugh (scoot 8)] [:mccree :_neutral (scoot -20)] [:symmetra :_smile (scoot 10)]] "Your old “porno mags?” And your innumerable stashes of them hidden around this base? How could I forget?"]
     ["McCree" [[:pharah :_reverseNeutral (scoot 8)] [:mccree :_pointDown (scoot -20)] [:symmetra :_smile (scoot 10)]] "Them’s the ones. Lookie at what else I found hidden away with all the smut."]
     ["Pharah" [[:mccree :_neutral (scoot -20)] [:pharah :_reverseDeterminedDown (scoot 8)] [:symmetra :_smile (scoot 10)]] "My old Eagles? Holy shit, Jesse."]
     ["McCree" [[:pharah :_reverseNeutral (scoot 8)] [:mccree :_skates (scoot -20)] [:symmetra :_smile (scoot 10)]] "I now return them to you, bosom buddy."]
     ["Pharah" [[:mccree :_neutral (scoot -20)] [:pharah :_reverseHoldSkates (scoot 8)] [:symmetra :_smile (scoot 10)]] "Ugh, Jesse. I swear."]
     ["Pharah" [[:mccree :_neutral (scoot -20)] [:pharah :_reverseExplainBackBlush (scoot 8)] [:symmetra :_smile (scoot 10)]] "But um! Hi Satya. I’m glad you came. I, uh, wasn’t sure you’d wanna see me after how much of a dramatic disaster our time on the payload was."]
     ["Symmetra" [[:mccree :_neutral (scoot -20)] [:pharah :_reverseEmbarassedBack (scoot 8)] [:symmetra :_flirty (scoot 10)]] "I had a charming time, Fareeha. There wasn’t any drama, there was only some discipline administered by a senior officer. It’s to be expected in military scenarios."]
     ["McCree" [[:pharah :_reverseNeutral (scoot 8)] [:mccree :_laugh (scoot -20)] [:symmetra :_smile (scoot 10)]] "Haha, chewed out by your mama even as a grown ass soldier."]
     ["Pharah" [[:pharah :_reverseLaugh (scoot 8)] [:mccree :_neutral (scoot -20)] [:symmetra :_smile (scoot 10)]] "Shut up, buttface. So, these were with the so called porno mags?"]
     ["McCree" [[:pharah :_reverseNeutral (scoot 8)] [:mccree :_point (scoot -20)] [:symmetra :_smile (scoot 10)]] "Yep! I reckon as a teen, I stashed them with the magazines right after the heist. I stopped shootin’ assault rifles soon after my time in Gibraltar, so they got left behind in the secret stash, with the rest of the Blackwatch smut."]
     ["Symmetra" [[:pharah :_reverseNeutral (scoot 8)] [:mccree :_neutral (scoot -20)] [:symmetra :_confused (scoot 10)]] "You stole Fareeha’s skates as part of a heist?"]
     ["McCree" [[:pharah :_reverseNeutral (scoot 8)] [:mccree :_fingerGuns (scoot -20)] [:symmetra :_confused (scoot 10)]] "Naw. I used them as part of a heist. I built a Rube-Goldberg machine to rob a Del Taco."]
     ["McCree" [[:pharah :_reverseNeutral (scoot 8)] [:mccree :_leanBack (scoot -20)] [:symmetra :_neutral (scoot 10)]] "My first couple months on the job I was stationed with Reaper in LA so he could keep an eye on me.  He always insisted that if I were getting Mexican food, I was getting something real authentic, but I had some incredible hankerings for that real authentic garbage fast food flavor."]
     ["McCree" [[:pharah :_reverseNeutral (scoot 8)] [:mccree :_point (scoot -20)] [:symmetra :_WTF (scoot 10)]] "So, I partnered up with Torbjorn to rob a Del Taco."]
     ["Pharah" [[:pharah :_reverseSurprised (scoot 8)] [:mccree :_neutral (scoot -20)] [:symmetra :_WTF (scoot 10)]] "Torbjorn was in on this?"]
     ["McCree" [[:pharah :_reverseNeutral (scoot 8)] [:mccree :_laugh (scoot -20)] [:symmetra :_eyeRoll (scoot 10)]] " Darn tootin’. He was convinced that chemically testing the food from Del Taco would validate his theories about government mind control through fast food."]
     ["McCree" [[:pharah :_reverseNeutral (scoot 8)] [:mccree :_point (scoot -20)] [:symmetra :_neutral (scoot 10)]] "He couldn’t have the Del Taco purchase show up on his credit card. And he wasn’t about to use dirty paper money coated with mind altering government pollutants. I was supposed to steal the tacos and report back."]
     ["Pharah" [[:pharah :_reverseUncomfortable (scoot 8)] [:mccree :_neutral (scoot -20)] [:symmetra :_neutral (scoot 10)]] "Okay, now this story makes sense."]
     ["McCree" [[:pharah :_reverseNeutral (scoot 8)] [:mccree :_fingerGuns (scoot -20)] [:symmetra :_neutral (scoot 10)]] "What he didn’t know is I’d be taco double crossing him."]
     ["McCree" [[:pharah :_reverseNeutral (scoot 8)] [:mccree :_leanBack (scoot -20)] [:symmetra :_neutral (scoot 10)]] "So the skates were supposed to deliver us the taco after the machine did it’s job. Which it DID."]
     ["McCree" [[:pharah :_reverseNeutral (scoot 8)] [:mccree :_pointAngry (scoot -20)] [:symmetra :_neutral (scoot 10)]] "But some meddling kid had to punch me in the face."]
     ["Pharah" [[:pharah :_reverseFist (scoot 8)] [:mccree :_leanBack (scoot -20)] [:symmetra :_smile (scoot 10)]] "That kid was me. I was working a part time job at Del Taco to buy my girlfriend a necklace. I couldn’t let Jesse get away with his crime."]
     ["McCree" [[:pharah :_reverseNeutral (scoot 8)] [:mccree :_pointUp (scoot -20)] [:symmetra :_smile (scoot 10)]] "I sure wish you hadn’t. I was real young. Miss Justice, here, socked me in the face AND reported me to my superior officer. Reaper really chewed me out for it."]
     ["Pharah" [[:pharah :_reverseBold (scoot 8)] [:mccree :_salty (scoot -20)] [:symmetra :_smile (scoot 10)]] "It was over the Del Taco and not the stealing, though, wasn’t it?"]
     ["McCree" [[:pharah :_reverseLaugh (scoot 8)] [:mccree :_exclaim (scoot -20)] [:symmetra :_laugh (scoot 10)]] "He punished me by making me eat an entire bottle of Adobo. I can still taste it now."]
     :-> [:door :pharah :option 1]]

     [:door :pharah :option 1]
     [:miranda/option
      "Symmetra" [[:pharah :_reverseNeutral (scoot 8)] [:mccree :_neutral (scoot -20)] [:symmetra :_smile (scoot 10)]]
      "I am impressed at your willingness to fight a thug to protect your employer’s establishment."
      "How did your mother take the fight?"]

     [:door :pharah :option 1 0]
      [:miranda/dialogue
       ["McCree" [[:pharah :_reverseNeutral (scoot 8)] [:mccree :_pointAngry (scoot -20)] [:symmetra :_smile (scoot 10)]] "Hey!"]
       ["Pharah" [[:pharah :_reverseLaugh (scoot 8)] [:mccree :_salty (scoot -20)] [:symmetra :_smile (scoot 10)]] "Hush, you thug."]
       ["Symmetra" [[:pharah :_reverseNeutral (scoot 8)] [:mccree :_salty (scoot -20)] [:symmetra :_sass (scoot 10)]] "Well, I don’t think he’s a thug anymore."]
       ["McCree" [[:pharah :_reverseNeutral (scoot 8)] [:mccree :_leanBack (scoot -20)] [:symmetra :_smile (scoot 10)]] "Yeah!"]
       ["Pharah" [[:pharah :_reverseBold (scoot 8)] [:mccree :_neutral (scoot -20)] [:symmetra :_smile (scoot 10)]] "You were still a thug back then."]
       ["McCree" [[:pharah :_reverseLaugh (scoot 8)] [:mccree :_laugh (scoot -20)] [:symmetra :_laugh (scoot 10)]] "Well, as long as everyone understands that I’m the perfect gentleman now."]
       :-> [:door :pharah 3]]

     [:door :pharah :option 1 1]
      [:miranda/dialogue
       ["Pharah" [[:pharah :_reverseDowncast (scoot 8)] [:mccree :_neutral (scoot -20)] [:symmetra :_neutral (scoot 10)]] "Not well. She told Gabe to keep Jesse away from me. It’s probably why I never got those skates back."]
       ["McCree" [[:pharah :_reverseNeutral (scoot 8)] [:mccree :_pointUp (scoot -20)] [:symmetra :_neutral (scoot 10)]] "Fun fact, one of those skates still had a taco in it. I did NOT remove it when I packed it in."]
       ["Pharah" [[:mccree :_neutral (scoot -20)] [:pharah :_reverseAngry (scoot 8)] [:symmetra :_awkward (scoot 10)]] "You left rotten taco in my shoe?"]
       ["McCree" [[:pharah :_reverseCold (scoot 8)] [:mccree :_fingerGuns (scoot -20)] [:symmetra :_WTF (scoot 10)]] "I gave it a good wash, darlin’. Should be fine."]
       :-> [:door :pharah 3]]

    [:door :pharah 3]
     [:miranda/dialogue
      ["Symmetra" [[:pharah :_reverseNeutral (scoot 8)] [:mccree :_neutral (scoot -20)] [:symmetra :_explainUncomfortable (scoot 10)]] "So... you used to do a lot of roller skating?"]
      ["Pharah" [[:pharah :_reverseEmbarassedBack (scoot 8)] [:mccree :_neutral (scoot -20)] [:symmetra :_smile (scoot 10)]] "Roller derby, actually."]
      ["McCree" [[:pharah :_reverseNeutral (scoot 8)] [:mccree :_pointUp (scoot -20)] [:symmetra :_smile (scoot 10)]] "The Amari’s have a long and storied history of roller derby actually. Fahreeha and her grandma were both on the CaiRollers!"]
      ["Symmetra" [[:pharah :_reverseNeutral (scoot 8)] [:mccree :_neutral (scoot -20)] [:symmetra :_bewildered (scoot 10)]] "Oh really? I would not have expected your mother to allow you to play. Isn’t roller derby quite violent?"]
      ["Pharah" [[:pharah :_reverseEmbarassed (scoot 8)] [:mccree :_neutral (scoot -20)] [:symmetra :_smile (scoot 10)]] "I was pretty surprised she said yes at the time, too. I think sitto pulled some strings for me."]
      ["Pharah" [[:pharah :_reverseExplainBack (scoot 8)] [:mccree :_neutral (scoot -20)] [:symmetra :_smile (scoot 10)]] "I know I’ve complained a lot about her being overprotective but she did let me do a lot of different things as a kid, albeit with maybe more protective padding than normal."]
      ["Pharah" [[:pharah :_reverseLaugh (scoot 8)] [:mccree :_neutral (scoot -20)] [:symmetra :_laugh (scoot 10)]] "At least with roller derby all the protective padding was required so I didn’t stand out too much."]
      ["Pharah" [[:mccree :_neutral (scoot -20)] [:pharah :_reverseExplain (scoot 8)] [:symmetra :_smile (scoot 10)]] "Thanks for getting these back to me, Jesse."]
      ["McCree" [[:pharah :_reverseNeutral (scoot 8)] [:mccree :_phoneTexting (scoot -20)] [:symmetra :_smile (scoot 10)]] "Fareeha, lemme pay you back for letting me borrow these shoes for so long. I’m going to Nano Boost the heck out of your date. Why don’t you two visit the old rink?"]
      ["Pharah" [[:mccree :_phoneTexting (scoot -20)] [:pharah :_reverseExplain (scoot 8)] [:symmetra :_smile (scoot 10)]] "Because…"]
      ["Pharah" [[:mccree :_phoneTexting (scoot -20)] [:pharah :_reverseEmbarassedBack (scoot 8)] [:symmetra :_smile (scoot 10)]] "Actually that’s a great idea. I completely forgot it existed. Would you want to do that, Satya? We don’t have to if you don’t want to."]
      ["Symmetra" [[:mccree :_phoneTexting (scoot -20)] [:pharah :_reverseBack (scoot 8)] [:symmetra :_bigSmile (scoot 10)]] "I would be delighted to."]
      ["McCree" [[:pharah :_reverseNeutral (scoot 8)] [:mccree :_wave (scoot -20)] [:symmetra :_smile (scoot 10)]] "Y’all have fun now. I’m gonna go hide some of these pin-up stickers in opportune locations around Winston’s office."]
      :-> [:pharah-a :cutscene]]

      [:pharah-a :cutscene]
      [:miranda/characters
      [[]]
      :-> [:pharah-a :cutscene :text]]

      [:pharah-a :cutscene :text]
      [:miranda/narration
      "Having noticed your apprehension during you previous excursion, Pharah brought a sling for you to sit in for added security. With your mind less preoccupied with your safety, the flight was much more enjoyable."
      "Pharah gave you an aerial tour of the base relating anecdotes from her childhood about it’s various locations, pausing briefly at the top of the rock for the two of you to enjoy the stunning view. Although the view was quite breathtaking, you were not entirely sure whether it was the scenery or your proximity to Fareeha which left you so short of breath."
      :-> [:rink :pharah 4]]})
