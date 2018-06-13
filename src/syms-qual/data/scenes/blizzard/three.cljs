(ns syms-qual.data.scenes.blizzard.three
  (:require [carmen.util :as anim :refer [scoot]]
            [syms-qual.util :as util :refer [inc-transition]]))

(def data
  {[:party :junkrat 0]
    [:miranda/dialogue
     ["Junkrat" [[:junkrat :_ballExplainConcerned (scoot -80 -9 1.5)] [:symmetra :_awkward (scoot 3)]]
      "You look a bit knackered, mate. There’s a quieter picnic area over that way if you need a bit of space. Just coming back from there myself actually."]
     ["Symmetra" [[:junkrat :_ballSmileNod (scoot -9)] [:symmetra :_strainedSmile (scoot 3)]]
      "Thanks. Getting away for a bit sound like a wonderful idea."]
     ["Pharah" [[:junkrat :_ballPointUp (scoot -9)] [:symmetra :_strainedSmile (scoot 3)]]
      "No worries! I don’t mean to crowd you but I did want to say congrats on finishing qualifying and all that. Have a good ‘un."]
     :-> [:picnic :brigitte 0]]

  [:party :junkrat 1]
   [:miranda/dialogue
    ["Junkrat" [[:junkrat :_ballConfusedBlush (scoot -80 -9 1.5)] [:symmetra :_smile (scoot 3)]]
      "G’day, darl! And congrats! How’s the party treating you?"]
    ["Symmetra" [[:junkrat :_ballSmileNod (scoot -9)] [:symmetra :_strainedSmile (scoot 3)]]
      "I usually find amusement parks to be a bit over stimulating but so far I am doing alright."]
    ["Junkrat" [[:junkrat :_ballAdoringBlushDown (scoot -9)] [:symmetra :_strainedSmile (scoot 3)]]
      "I’m not sure how much it’ll help but I made you something that might take the edge off a bit if you need a distraction."]
    :-> [:party :junkrat 3]]

   [:party :junkrat 3]
    [:miranda/characters
     [[[:gifts :_orb]]]
        :-> [:party :junkrat 4]]

    [:party :junkrat 4]
     [:miranda/dialogue
     [nil [[:gifts :_orb]]
      "You've received - THE FIDGET ORB"]
    ["Junkrat" [[:junkrat :_ballIntro (scoot -9)] [:symmetra :_smile (scoot 3)]]
      "I switched the colors up to try to keep it consistent with the whole look you got going on. Tried keep the paint job a little neater too but my hands are only so steady. ‘Specially after Roadie’s Beany Weenie Caffieney Jamboorie. That’s uh, our cold brew making time."]
    ["Symmetra" [[:junkrat :_ballSmile (scoot -9)] [:symmetra :_coy (scoot 3)]]
    "Thank you, Jamie, it’s perfect."]
    ["Junkrat" [[:junkrat :_fibbinBlush (scoot -9)] [:symmetra :_coy (scoot 3)]]
    "Don’t wanna crowd you on your big day, but I’m here if you need me. There’s a quieter picnic area over that way if you need a bit of a breather. Just coming back from there myself actually."]
    ["Symmetra" [[:junkrat :_ballSmileNod (scoot -9)] [:symmetra :_thinking (scoot 3)]]
    "Thanks. That actually does sound like a good idea."]
    ["Junkrat" [[:junkrat :_ballBack (scoot -9)] [:symmetra :_smile (scoot 3)]]
    "I should probably go catch up with Hog, though. He’s looking like he might start a fight with Jack over those polish sausages he’s grilling. Not too big on the pork products in our household."]
    ["Symmetra" [[:junkrat :_ballSmileNod (scoot -9)] [:symmetra :_explainUncomfortable (scoot 3)]]
    "Understandably so."]
    ["Junkrat" [[:junkrat :_ballWave (scoot -9)] [:symmetra :_smile (scoot 3)]]
      "See you ‘round, love!"]
    :-> [:picnic :brigitte 0]]

   [:picnic :brigitte 0]
    [:miranda/narration
     "You head to the picnic area to take a breather. As promised it is mostly empty aside from a lone woman sitting on the far side of square who you don’t recognize. Thankfully, she seems content to leave you alone, and after sitting in silence for some time you begin to regain your composure. Finally, as you are about to leave to return to the party, she approaches you."
    :-> [:picnic :brigitte 1]]

   [:picnic :brigitte 1]
    [:miranda/dialogue
     ["???" [[:brigitte :_wave (scoot -80 -5 1.5)] [:symmetra :_neutral (scoot 80 3 1.5)]]
      "Hey, you’re Satya, right? I just wanted to say congratulations!"]
     ["Symmetra" [[:brigitte :_neutral (scoot -5)] [:symmetra :_awkwardTalk (scoot 3)]]
      "Uh, thank you."]
     ["???" [[:brigitte :_explain (scoot -5)] [:symmetra :_awkward (scoot 3)]]
      "Reinhardt’s told you me so much about you. It’s nice to finally meet you."]
     ["Symmetra" [[:brigitte :_neutral (scoot -5)] [:symmetra :_explainUncomfortable (scoot 3)]]
       "I’m terribly sorry, and I don’t mean to be rude, but I have no idea who you are."]
     ["???" [[:brigitte :_handHead (scoot -5)] [:symmetra :_bewildered (scoot 3)]]
     "I’m so sorry! I should have introduced myself. I’m Brigitte Lindholm. Reinhardt’s squire. And Torbjorn’s daughter."]
     ["Brigitte" [[:brigitte :_explainUnsure (scoot -5)] [:symmetra :_confused (scoot 3)]]
      "And as of about 15 minutes ago the newest member of Overwatch. Winston says he expects me to “really shake up the meta.” I came by to turn in the last of my paperwork. And, you know, say hi to everyone."]
     ["Symmetra" [[:brigitte :_neutral (scoot -5)] [:symmetra :_helloWarm (scoot 3)]]
        "It’s nice to meet you Brigitte."]
     ["Brigitte" [[:brigitte :_explainUnsure (scoot -5)] [:symmetra :_neutral (scoot 3)]]
      "Can I ask you how it went? Your qualifying and everything? Now that I’ve gotten a schedule and things are real and actually happening I’m getting kind of nervous."]
     ["Symmetra" [[:brigitte :_neutral (scoot -5)] [:symmetra :_skeptical (scoot 3)]]
      "Wouldn’t you be better off asking Reinhardt or your father for advice?"]
     ["Brigitte" [[:brigitte :_lookBack (scoot -5)] [:symmetra :_skeptical (scoot 3)]]
      "They’ve been doing this forever. I don’t think they even remember what it’s like to be new. And besides I don’t want to hear what it was like in the old days. Things are different now. Or at least, I want to believe we can do better than we’ve done before."]
      ["Symmetra" [[:brigitte :_neutral (scoot -5)] [:symmetra :_confused (scoot 3)]]
         "What do you mean?"]
      ["Brigitte" [[:brigitte :_handHead (scoot -5)] [:symmetra :_confused (scoot 3)]]
       "I think Overwatch has prided itself on a lot of ideals that it hasn’t necessarily lived up to. And I’m hoping that it can find a way to do better going forward."]
      ["Symmetra" [[:brigitte :_neutral (scoot -5)] [:symmetra :_skeptical (scoot 3)]]
       "Speaking from personal experience, I don’t know how viable it is to put your trust in a large organization to do the right thing. I guess the best advice I can give you is-"]
       :-> [:picnic :brigitte :option 0]]

 [:picnic :brigitte :option 0]
   [:miranda/option
   "Symmetra" [[:brigitte :_neutral (scoot -5)] [:symmetra :_skeptical (scoot 3)]]
   "Building on the past is great but don’t let it limit how you think about the future."
    "Take it one day at a time. Take care of yourself so you can take care of others."
    "Don’t be afraid to bend the rules. Overwatch is the beginning not the end."]

   [:picnic :brigitte :option 0 0]
    [:miranda/dialogue
     ["Symmetra" [[:brigitte :_neutral (scoot -5)] [:symmetra :_explain (scoot 3)]]
       "It’s nice to see that things are getting better than they were. But defining improvement only in relation to what has come before limits the progress that could be made. Sometimes better than before still isn’t good enough. Set your own goals and be your own person."]
     ["Brigitte" [[:brigitte :_explain (scoot -5)] [:symmetra :_neutral (scoot 3)]]
       "I’ll do my best! I’ve always wanted to follow in my papa’s footsteps but I intend to make my own set of tracks as well."]
     :-> [:picnic :brigitte 2]]

   [:picnic :brigitte :option 0 1]
    [:miranda/dialogue
     ["Symmetra" [[:brigitte :_neutral (scoot -5)] [:symmetra :_explainUncomfortable (scoot 3)]]
      "Finding something that makes you happy, even if it’s not perfect, can give you the strength to keep going forward and do the more difficult work."]
      ["Brigitte" [[:brigitte :_lookBack (scoot -5)] [:symmetra :_smile (scoot 3)]]
       "I get that. Really, the only reason I joined was that I want to keep the people I care about safe. Reinhardt, and my dad."]
     :-> [:picnic :brigitte 2]]

    [:picnic :brigitte :option 0 2]
     [:miranda/dialogue
      ["Symmetra" [[:brigitte :_neutral (scoot -5)] [:symmetra :_explain (scoot 3)]]
        "The official narrative isn’t the only narrative. We have a mission statement, but it’s really up to the people working here to determine how it gets fulfilled. Overwatch has the resources. So don’t be afraid to experiment."]
      ["Brigitte" [[:brigitte :_explain (scoot -5)] [:symmetra :_smile (scoot 3)]]
        "I’ll definitely keep that in mind! Finding new ways to use the same materials is an important part of innovation. Iteration is key to the design process."]
       ["Symmetra" [[:brigitte :_neutral (scoot -5)] [:symmetra :_bigSmile (scoot 3)]]
        "It’s nice to have another designer on the team. I mean aside from your father."]
      :-> [:picnic :brigitte 2]]

    [:picnic :brigitte 2]
     [:miranda/dialogue
      ["Brigitte" [[:brigitte :_handHead (scoot -5)] [:symmetra :_neutral (scoot 3)]]
       "Hehe, thanks for putting up with him by the way. I know he can be…. kind of a lot…."]
      ["Symmetra" [[:brigitte :_neutral (scoot -5)] [:symmetra :_explainWTF (scoot 3)]]
         "You have no idea."]
      ["Symmetra" [[:brigitte :_neutral (scoot -5)] [:symmetra :_frustratedConfused (scoot 3)]]
       "I mean, I’m sure you have some idea since you grew up with him. But still."]
      ["Brigitte" [[:brigitte :_handHead (scoot -5)] [:symmetra :_strainedSmile (scoot 3)]]
       "Haha, tell me about it. You wanna head back to the party?"]
      ["Brigitte" [[:brigitte :_pieTalk (scoot -5)] [:symmetra :_smile (scoot 3)]]
       "I brought this pie but I never quite managed to get it onto the snack table."]
      ["Symmetra" [[:brigitte :_pie (scoot -5)] [:symmetra :_explainUncomfortable (scoot 3)]]
       "Certainly, lets go. What kind of pie might I ask?"]
      ["Brigitte" [[:brigitte :_pieLaugh (scoot -5 -11 1.5)] [:symmetra :_smile (scoot 3 -5 1.5)]]
        "Just plain apple. I'm not really much of a baker but I'm trying to learn."]
      ["Symmetra" [[:brigitte :_pie (scoot -11 -20 1.5)] [:symmetra :_explainUncomfortable (scoot -5 -13 1.5)]]
         "I'm sure you'll improve with a bit of practice. Baking is a science as they say."]
      ["Brigitte" [[:brigitte :_pieTalk (scoot -20 -35 1.5)] [:symmetra :_laugh (scoot -13 -35 1.5)]]
        "I'm really more of an engineer?"]
      ["Symmetra" [[:brigitte :_pie (scoot -35 -75 2)] [:symmetra :_explainUncomfortable (scoot -35 -60 2)]]
        "THIS IS A PUNCHLINE"]
      [nil [[:brigitte :_pie (scoot -75 -95 2)] [:symmetra :_smile (scoot -60 -100 2)]]
          "fading out now"]]})
