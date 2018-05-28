(ns syms-qual.data.scenes.dorado.date-2
  (:require [carmen.util :as anim :refer [scoot fade-out fade-in]]
            [syms-qual.util :as util :refer [inc-transition]]))

(def data
  {[:room :sombra 4]
   [:miranda/narration
   "You arrive at Sombra’s house, when Reaper suddenly rushes out in an angry fit."
   :-> [:room :sombra 5]]

   [:room :sombra 5]
   [:miranda/dialogue
    ["Reaper" [[:symmetra :_reverse (scoot -80 10 1.5)] [:sombra :_neutral (scoot -80 -20 1.5)] [:reaper :_reverseExtra (scoot 80 20 1.5)]] "You goddamn asshole. I was just trying to cook some bacon in your microwave, since you live like an animal and your stove is filled entirely with spare hard drives, when suddenly it started playing El Sondito."]
    ["Reaper" [[:symmetra :_reverse (scoot 10)] [:sombra :_neutral (scoot -20)] [:reaper :_reversePointUp (scoot 20)]] "I fucking swear I told you to never play that song in front of me ever again. A person can only take so many nightcore remixes before they’re fucking sick of it, Sombra."]
    ["Sombra" [[:symmetra :_reverse (scoot 10)] [:sombra :_wave (scoot -20)] [:reaper :_reverseNeutral (scoot 20)]] "Hola."]
    ["Reaper" [[:symmetra :_reverse (scoot 10)] [:sombra :_neutral (scoot -20)] [:reaper :_reverseExplain (scoot 20)]] "...I see you’ve brought your girlfriend?"]
    ["Sombra" [[:symmetra :_reverse (scoot 10)] [:sombra :_explainAngryBlush (scoot -20)] [:reaper :_reverseNeutral (scoot 20)]] "She’s not my girlfriend, asshole."]
    ["Sombra" [[:symmetra :_reverse (scoot 10)] [:sombra :_shrugAwkwardBlush (scoot -20)] [:reaper :_reverseNeutral (scoot 20)]] " I mean, maybe we’ll get there but how can I say someone’s my girlfriend when we haven’t even been haunted by an angry spirit together."]
    ["Reaper" [[:symmetra :_reverse (scoot 10)] [:sombra :_neutral (scoot -20)] [:reaper :_reversePointUp (scoot 20)]] "Look. The ghosts can stay, that’s fine. El Sondito? Not in my house."]
    ["Sombra" [[:symmetra :_reverse (scoot 10)] [:sombra :_selfConfused (scoot -20)] [:reaper :_reverseNeutral (scoot 20)]] "But this is my house."]
    ["Reaper" [[:symmetra :_reverse (scoot 10)] [:sombra :_neutral (scoot -20)] [:reaper :_reverseExplain (scoot 20)]] "Wherever Lechuza rests her head is her home, Sombra."]
    ["Sombra" [[:symmetra :_reverse (scoot 10)] [:sombra :_shrug (scoot -20)] [:reaper :_reverseNeutral (scoot 20)]] "Fine. I’m not arguing with Lechuza."]
    ["Reaper" [[:symmetra :_reverse (scoot 10)] [:sombra :_neutral (scoot -20)] [:reaper :_reversePoint (scoot 20)]] "Good. I will eat your head like an owl will devour a mouse if you play that goddamn song. Especially if it’s sped up."]
    ["Sombra" [[:symmetra :_reverse (scoot 10)] [:sombra :_salute (scoot -20)] [:reaper :_reverseNeutral (scoot 20)]] "Yes ma’am."]
    ["sombra" [[:symmetra :_reverse (scoot 10)] [:sombra :_neutral (scoot -20)] [:reaper :_reverseLeave (scoot 20 80 1.5)]] "Good. Welcome to my home."]
    :-> [:sombra-a :cutscene]]

    [:sombra-a :cutscene]
    [:miranda/characters
    [[]]
    :-> [:sombra-a :cutscene :text]]

    [:sombra-a :cutscene :text]
    [:miranda/narration
    "You are impressed by the spread which Reaper seems to have created using only the portable hot plate he brought with him and the previously mentioned microwave. There is a build your own bloody mary bar set up on one of the tables allowing to you to pick from a variety of garnishes and determine the strength of your own drink."
    "Reaper has made himself one which appears to be about 75% vodka containing several strips of bacon, a stalk of celery, a collection of pickles, 5 olives, and an entire hamburger balanced precariously on a skewer. You all snack and mill about waiting for the witching hour to arrive."
    :-> [:room :sombra 6]]

  [:room :sombra 6]
  [:miranda/dialogue
    ["Sombra" [[:reaper :_neutral (scoot -80 -3.5 1.5)][:doomfist :_neutral (scoot -80 -20 1.5)] [:sombra :_reverseExplain (scoot 80 3 1.5)] [:symmetra :_neutral (scoot 80 13 1.5)]] "Where is everyone? I thought this was supposed to be another group bonding activity."]
    ["Reaper" [[:sombra :_reverse (scoot 3)] [:symmetra :_neutral (scoot 13)] [:reaper :_explain (scoot -3.5)][:doomfist :_neutral (scoot -20)]] "Widow texted and said quote, “Fuck all of you I’m going to sleep” and I haven’t heard from Moira but knowing her she’s probably uglycrying to Devilman Crybaby or something."]
    ["Sombra" [[:reaper :_neutral (scoot -3.5)][:doomfist :_neutral (scoot -20)] [:sombra :_reverseExplainHand (scoot 3)] [:symmetra :_neutral (scoot 13)]] "Fine, I guess we’ll start getting set up without them. Okay. So we’ve all had drinks. And we have several mirrors."]
    ["Doomfist" [[:sombra :_reverse (scoot 3)] [:symmetra :_neutral (scoot 13)] [:reaper :_neutral (scoot -3.5)][:doomfist :_pointUp (scoot -20)]] "It’s basically a hall of mirrors in this place."]
    ["Sombra" [[:reaper :_neutral (scoot -3.5)][:doomfist :_neutral (scoot -20)] [:sombra :_reverseFistHand (scoot 3)] [:symmetra :_neutral (scoot 13)]] "This is good. My internet research indicates that a high concentration of mirrors is critical for the success of this ritual."]
    ["Symmetra" [[:sombra :_reverse (scoot 3)] [:symmetra :_confused (scoot 13)] [:reaper :_neutral (scoot -3.5)][:doomfist :_neutral (scoot -20)]] "What? Why?"]
    ["Sombra" [[:reaper :_neutral (scoot -3.5)][:doomfist :_neutral (scoot -20)] [:sombra :_reverseExplainHand (scoot 3)] [:symmetra :_confused (scoot 13)]] "How’s a ghost going to know which mirror to show up in? They can’t pinpoint the exact mirror. Maybe they show up in little Pablo’s bathroom mirror in the house over. I do not want to scare children."]
    ["Reaper" [[:sombra :_reverse (scoot 3)] [:symmetra :_neutral (scoot 13)] [:reaper :_rosaryOffer (scoot -3.5)][:doomfist :_neutral (scoot -20)]] "Symmetra, feel free to take a rosary to ward off the spirits."]
    ["Symmetra" [[:sombra :_reverse (scoot 3)] [:symmetra :_no (scoot 13)] [:reaper :_rosaryOffer (scoot -3.5)][:doomfist :_neutral (scoot -20)]] "I am fine. But thank you."]
    ["Reaper" [[:sombra :_reverse (scoot 3)] [:symmetra :_WTF (scoot 13)] [:reaper :_rosaryPointUp (scoot -3.5)][:doomfist :_neutral (scoot -20)]] "Hah. You and Doomfist say this now, but wait until you are haunted."]
    ["Doomfist" [[:sombra :_reverse (scoot 3)] [:symmetra :_WTF (scoot 13)] [:reaper :_rosaryNeutral (scoot -3.5)][:doomfist :_eyeRoll (scoot -20)]] "The only thing haunting me is the crushing weight of the poor choices I’ve made. They’ve brought me here."]
    ["Reaper" [[:sombra :_reverse (scoot 3)] [:symmetra :_WTF (scoot 13)] [:reaper :_rosaryPointUp (scoot -3.5)][:doomfist :_eyeRoll (scoot -20)]] "That’s right, asshole. The spookiest thing ever is adulthood."]
    ["???" [[:sombra :_reverseGhost (scoot 3)] [:symmetra :_bewildered (scoot 13)] [:reaper :_rosaryNeutral (scoot -3.5)][:doomfist :_smirk (scoot -20)]] "Knock-knock."]
    ["Sombra" [[:sombra :_reverseGhost (scoot 3)] [:symmetra :_bewildered (scoot 13)] [:reaper :_rosaryNeutral (scoot -3.5)][:doomfist :_smirk (scoot -20)]] "!!!"]
    ["Doomfist" [[:sombra :_reverseGhost (scoot 3)] [:symmetra :_bewildered (scoot 13)] [:reaper :_rosaryNeutral (scoot -3.5)][:doomfist :_eyeRoll (scoot -20)]] "I’ll get it."]
    ["Sombra" [[:reaper :_reverseRosaryNeutral (scoot -38 -1 1.5)] [:sombra :_reverseGhost (scoot 3 5 1.5)] [:symmetra :_neutral (scoot 13)] [:doomfist :_eyeRoll (scoot -20 -80 1.5)]] "!!!"]
    ["Reaper" [[:moira :_ghost (scoot -40 0 1)] [:reaper :_rosarySalt (scoot -1)] [:sombra :_reverseGhost (scoot 5)] [:symmetra :_WTF (scoot 13)]] "Oh no a ghost! Begone spirit! Salt splash!"]
    ["Moira" [[:moira :_ghost (fade-out [0 0] 1)] [:moira :_faceWipe (fade-in [-6 0] 1)][:reaper :_reverseRosaryNeutral (scoot -1)] [:sombra :_reverseLaugh (scoot 5)] [:symmetra :_smile (scoot 13)]] "I would have prefered it on the rim of the glass rather than thrown directly in my mouth but we’ll consider it a start."]
    ["Reaper" [[:reaper :_reverseRosaryPointUp (scoot -1)] [:moira :_pour1 (scoot -6)] [:sombra :_reverse (scoot 5)] [:symmetra :_smile (scoot 13)]] "I didn’t think you were coming."]
    ["Symmetra" [[:moira :_pour2 (scoot -6)][:reaper :_reverseRosaryNeutral (scoot -1)] [:sombra :_reverse (scoot 5)] [:symmetra :_explainUncomfortable (scoot 13)]] "Neither did I. I’m surprised you would have any interest in anything as unscientific as ghosts, Dr. O’Deorain."]
    ["Moira" [[:moira :_shrimp (scoot -6)][:reaper :_reverseRosaryNeutral (scoot -1)] [:sombra :_reverse (scoot 5)] [:symmetra :_confused (scoot 13)]] "I don’t. I just missed dinner and I heard Gabriel was making Bloody Marys so I figured I’d stop by before I got back to the lab."]
    ["Symmetra" [[:moira :_burger (scoot -6)][:reaper :_reverseRosaryNeutral (scoot -1)] [:sombra :_reverse (scoot 5)] [:symmetra :_explainWTF (scoot 13)]] "Won’t alcohol on an empty stomach make it difficult for you to do your work?"]
    ["Moira" [[:moira :_pickles (scoot -6)][:reaper :_reverseRosaryNeutral (scoot -1)] [:sombra :_reverse (scoot 5)] [:symmetra :_neutral (scoot 13)]] "Haha, don’t be silly. I altered my liver cells to transform alcohol into caffeine ages ago. I’ll be nice and focused. Ok, burger... shrimp... one, two, three pickles, I’ll be on my way then."]
    ["Moira" [[:reaper :_reverseRosaryNeutral (scoot -1)] [:moira :_bloodyExplain (scoot -6)] [:sombra :_reverseAwkard (scoot 5)] [:symmetra :_confused (scoot 13)]] "Oh, Sombra! A little bird just told me FSPA dropped early. I’d send you a link but I’m sure you’ll find it before I even get home so I won’t bother. Night!"]
    ["Sombra" [[:moira :_ghost (fade-in [0 0] 0.5)] [:reaper :_reverseRosaryNeutral (scoot -1)] [:moira :_bloodyExplain (fade-out [-6 0] 0.5)] [:sombra :_reverseAwkward (scoot 5)] [:symmetra :_confused (scoot 13)]] "..."]
    ["Doomfist" [[:moira :_ghost (scoot 0 -80 1.5)] [:reaper :_rosaryNeutral (scoot 33 -3.5 1.5)] [:doomfist :_explainConcerned (scoot -80 -20 1.5)]  [:sombra :_reverseAwkward (scoot 5 3 1.5)] [:symmetra :_confused (scoot 13)]] "FPSP, what?"]
    ["Reaper" [[:sombra :_reverseAwkward (scoot 3)] [:symmetra :_confused (scoot 13)] [:reaper :_rosaryExplain (scoot -3.5)] [:doomfist :_smirk (scoot -20)]] "Some nerd shit I’m sure."]
    ["Sombra" [[:reaper :_rosaryNeutral (scoot -3.5)] [:doomfist :_smirk (scoot -20)] [:sombra :_reverseAwkwardExplain (scoot 3)] [:symmetra :_confused (scoot 13)]] "Ok, let’s go talk to some ghosts. Time’s a wastin.’ Chop chop!"]
    :-> [:room :sombra 7]]

   [:room :sombra 7]
    [:miranda/narration
     "As per Reaper’s instructions, you attempt to make contact with Bloody Mary, by spinning around before looking into the mirror and quickly repeating her name 13 times. Unsurprisingly, this yields no results. Sombra suggests you attempt a more traditional seance approach and you, Sombra, and Doomfist join in a cross-legged circle on the floor, holding hands around a ring of candles."
     :-> [:sombra-b :cutscene]]

    [:sombra-b :cutscene]
     [:miranda/characters
     [[]]
     :-> [:sombra-b :cutscene :text]]

    [:sombra-b :cutscene :text]
     [:miranda/narration
     "Sombra asks that you all close your eyes and begins to address the spirits.You are unafraid of the supernatural, and this exercise in particularly seems quite silly, but as you sit in the dark you find Sombra’s firm grip on your hand, the warmth of her palm, and the sound of her voice to all be quite comforting. After several minutes pass with no results you all give up and break the circle. "
     :-> [:room :sombra 8]]

     [:room :sombra 8]
     [:miranda/dialogue
       ["Reaper" [[:sombra :_reverse (scoot 80 3 1.5)] [:symmetra :_neutral (scoot 80 13 1.5)] [:reaper :_rosaryExplain (scoot -80 -3.5 1.5)][:doomfist :_neutral (scoot -80 -20 1.5)]] "Clearly she didn’t show up because I am the much scarier ghost. This house is not big enough for the both of us."]
       ["Sombra" [[:sombra :_reverseNostalgicAngry (scoot 3)] [:symmetra :_neutral (scoot 13)] [:reaper :_rosaryNeutral (scoot -3.5)][:doomfist :_neutral (scoot -20)]] "Pinche Mary. I bet she showed up next door and scared the crap out of little Pablo. No wonder she is the patron saint of wine moms. Drunkenly showed up to the wrong spot. I’ll have to send him hacked WoW gold as an apology."]
       ["Symmetra" [[:sombra :_reverseNostalgicAngry (scoot 3)] [:symmetra :_explainUncomfortable (scoot 13)] [:reaper :_rosaryNeutral (scoot -3.5)][:doomfist :_neutral (scoot -20)]] "I’m sure he’ll appreciate that."]
       ["Sombra" [[:reaper :_rosaryNeutral (scoot -3.5)][:doomfist :_neutral (scoot -20)] [:sombra :_reverseExplainSad (scoot 3)] [:symmetra :_neutral (scoot 13)]] "Sad to see my little foray into the supernatural didn’t really yield anything. I suppose I’ll have to keep my ambitions of becoming a literal ghost in the machine for another day. "]
       ["Symmetra" [[:reaper :_rosaryNeutral (scoot -3.5)][:doomfist :_neutral (scoot -20)][:sombra :_reverse (scoot 3)] [:symmetra :_explainUncomfortable (scoot 13)]] "You have plenty to do in this life, Sombra. I don’t think you need to worry about becoming a ghost yet."]
       ["Sombra" [[:reaper :_rosaryNeutral (scoot -3.5)][:doomfist :_neutral (scoot -20)][:sombra :_reverseNostalgic (scoot 3)] [:symmetra :_neutral (scoot 13)]] "Yeah, I guess I’ll have to settle for being the philosophical ghost in the machine."]
       ["Doomfist" [[:reaper :_rosaryNeutral (scoot -3.5)][:doomfist :_armsCross (scoot -20)][:sombra :_reverse (scoot 3)] [:symmetra :_neutral (scoot 13)]] "Cartesian dualism is bullshit."]
       ["Sombra" [[:reaper :_rosaryNeutral (scoot -3.5)][:doomfist :_armsCrossNeutral (scoot -20)][:sombra :_reverseExplainHand (scoot 3)] [:symmetra :_neutral (scoot 13)]] "Shush! I’m confident I’ll have figured out a way to upload my consciousness to the internet before I kick it. Transhumanism is dope."]
       ["Doomfist" [[:reaper :_rosaryNeutral (scoot -3.5)][:doomfist :_laugh (scoot -20)][:sombra :_reverseNostalgicAngry (scoot 3)] [:symmetra :_WTF (scoot 13)]] "Then you can shitpost from your view from eternity."]
       ["Sombra" [[:reaper :_rosaryNeutral (scoot -3.5)][:doomfist :_smirk (scoot -20)][:sombra :_reverseRollEyes (scoot 3)] [:symmetra :_neutral (scoot 13)]] "Shut up, Akande! No one likes your shitty philosophy jokes."]
       ["Doomfist" [[:reaper :_rosaryNeutral (scoot -3.5)][:doomfist :_point
        (scoot -20)][:sombra :_reverse (scoot 3)] [:symmetra :_neutral (scoot 13)]] "That’s it, I’m leaving. No one compliments Descartes to my face. Even indirectly."]
       ["Reaper" [[:reaper :_rosaryPointUp (scoot -3.5 -17 1.5)][:doomfist :_eyeRoll (scoot -20 -80 1.5)][:sombra :_reverse (scoot 3 -2 1.5)] [:symmetra :_neutral (scoot 13 10 1.5)]] "Same. Your ghosts are bullshit. I told you if you wanted ghosts you needed to have gone on a haunted corn ride like they have in Indiana."]
       ["Symmetra" [[:reaper :_rosaryPointUp (scoot -17 -80 1.5)] [:sombra :_neutral (scoot 41 -3 1.5)] [:symmetra :_explainUncomfortable (scoot 10 0 1.5)]] "It's quite late. I suppose I should depart as well."]
       [nil [[:sombra :_flirty (scoot -3)] [:symmetra :_phoneCheck (scoot 0)]] "Suddenly, your phone buzzes."]
       :-> [:room :sombra 9]]

       [:room :sombra 9]
       [:miranda/characters
        [[[:photos :_sombraDate3] [:phones :_symHand]]]
        :-> [:room :sombra 10]]

    [:room :sombra 10]
      [:miranda/dialogue
      ["Symmetra" [[:sombra :_flirty (scoot -3)] [:symmetra :_phoneCheckTalk (scoot 0)]] "You have further plans for me?"]
      ["Sombra" [[:sombra :_shrugAwkwardBlush (scoot -3)] [:symmetra :_neutral (scoot 0)]] "I, uh, have this new show I thought we could watch together. It’s, um, got like...anime dog...people and…"]
      ["Sombra" [[:sombra :_flirty (scoot -3)] [:symmetra :_neutral (scoot 0)]] "I know it’s been a long day but maybe it can be a little longer for a  movie date night?"]
      :-> [:room :sombra :option 0]]

      [:room :sombra :option 0]
      [:miranda/option
       "Symmetra" [[:sombra :_flirty (scoot -3)] [:symmetra :_neutral (scoot 0)]]
       "A date sounds fine, but perhaps this anime would not be to my taste."
       "I am sorry, Sombra. I don’t think I feel that way towards you."]

      [:room :sombra :option 0 1]
       [:miranda/dialogue
        ["Sombra" [[:sombra :_shrugAwkwardBlush (scoot -3)] [:symmetra :_dissappointed (scoot 0)]] "Ah! Um. No worries."]
        ["Symmetra" [[:sombra :_nostalgicSad (scoot -3)] [:symmetra :_explainUncomfortable (scoot 0)]] "Today was fun, nonetheless."]
        ["Sombra" [[:sombra :_nervousBlush (scoot -3)] [:symmetra :_strainedSmile (scoot 0)]] "Yeah! Let’s forge a new ghostly path in friendship or something."]
        :-> [:hotel :sombra 11]]

      [:hotel :sombra 11]
        [:miranda/narration
         "You call yourself a cab and wave goodbye to Sombra, who, despite trying to act cheerful, seems a bit somber. You arrive back at the hotel and despite your exhaustion aren't yet able to fall asleep. Now that you're alone all this talk of ghosts has given you a case of the jitters. You finally pass out just as the morning sun is beginning to peek through your curtains."
         :=> [:blizzard :hotel 0]]

      [:room :sombra :option 0 0]
   (concat
    [:miranda/dialogue
      ["Sombra" [[:sombra :_thinking (scoot -3)] [:symmetra :_strainedSmile (scoot 0)]] "Dog girls being gay at a high school not for you? Yeah...I can see how that could be a niche taste. Hm."]
     ]
    (inc-transition
     [:-> [:room :sombra :option 1]]
     :points/sombra))

  [:room :sombra :option 1]
   [:miranda/option
    "Symmetra" [[:sombra :_flirty (scoot -3)] [:symmetra :_flirty (scoot 0)]]
    "Suggest some kissing action"
    "Suggest some cuddling action"]

   [:room :sombra :option 1 0]
   (concat
    [:miranda/dialogue
     ["Symmetra" [[:sombra :_flirty (scoot -3)] [:symmetra :_coy (scoot 0)]] "Well, perhaps...we can simply ignore the anime…"]
     ["Sombra" [[:sombra :_leanin (scoot -3)] [:symmetra :_embarassed (scoot 0)]] "With kissing?"]
     ["Symmetra" [[:sombra :_flirty (scoot -3)] [:symmetra :_strainedSmile (scoot 0)]] "Perhaps!"]
     ["Sombra" [[:sombra :_explain (scoot -3)] [:symmetra :_awkward (scoot 0)]] "No."]
     ["Symmetra" [[:sombra :_neutral (scoot -3)] [:symmetra :_bewildered (scoot 0)]] "Oh. I’m sorry, I thought…"]
     ["Sombra" [[:sombra :_explainAwkward (scoot -3)] [:symmetra :_neutral (scoot 0)]] "I’ve been waiting months for Frisbee Star: Pup Academia to come out, and I am NOT getting spoilers while making out."]
     ["Sombra" [[:sombra :_flirty (scoot -3)] [:symmetra :_smile (scoot 0)]] "Can we make out to some X-Files, to keep it thematic?"]
     ["Symmetra" [[:sombra :_flirty (scoot -3)] [:symmetra :_laugh (scoot 0)]] "Haha, whatever you like."]]
    (inc-transition [:-> [:room :sombra 12] :sombra/kiss]))

   [:room :sombra :option 1 1]
   (concat
    [:miranda/dialogue
      ["Symmetra" [[:sombra :_smile (scoot -3)] [:symmetra :_explainUncomfortable (scoot 0)]] "Maybe we can skip on the anime dogs, and watch something scary? You can put your arm around me and everything."]
      ["Sombra" [[:sombra :_flirty (scoot -3)] [:symmetra :_smile (scoot 0)]] "I suppose Frisbee Star: Pup Academia can wait. We can watch X-Files which is both romantic AND spooky. I will comfort the crap out of you."]]
    (inc-transition [:-> [:room :sombra 12] :sombra/hug]))

 [:room :sombra 12]
  [:miranda/dialogue
    ["Sombra" [[:sombra :_browseXFiles (scoot -3)] [:symmetra :_smile (scoot 0)]] "Let me check my Netflix. The next episode on my X-Files queue is…"]
    ["Sombra" [[:sombra :_browseHome (scoot -3)] [:symmetra :_smile (scoot -5)]] "Home. Nope. Definitely not that one. Let’s do the Christmas episode."]
    ["Symmetra" [[:sombra :_browseHome (scoot -3)] [:symmetra :_flirty (scoot -5)]] "Haha. Sombra, you don’t have to try so hard."]
    ["Sombra" [[:sombra :_explainAwkward (scoot -3)] [:symmetra :_flirty (scoot 0)]] "Um, but I do?"]
    ["Sombra" [[:sombra :_fistHandSurprised (scoot -3)] [:symmetra :_smile (scoot -5)]] "Oh my god, curse my vitamin D bereft, but adorably goth self!"]
    ["Symmetra" [[:sombra :_smile (scoot -3)] [:symmetra :_confused (scoot -5)]] "Excuse me?"]
    ["Sombra" [[:sombra :_explainHand (scoot -3)] [:symmetra :_coy (scoot -5)]] "Let’s watch the sunrise together! That’s romantic! I can do romantic things that don’t involve being a nerd!"]
    ["Symmetra" [[:sombra :_smile (scoot -3)] [:symmetra :_strainedSmile (scoot -5)]] "Haha, sure. Let’s go up."]
    :-> [:sombra-c :cutscene]]})
