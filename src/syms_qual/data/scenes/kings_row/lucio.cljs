(ns syms-qual.data.scenes.kings-row.lucio
  (:require [carmen.util :as anim :refer [scoot]]
            [syms-qual.util :as util :refer [inc-transition]]))

(def data
  {[:street :lucio 0]
   [:miranda/dialogue
    ["Bastion" [[:bastion :_pointUpLeft (scoot -70 -10 1)] [:lucio :_neutral (scoot -70 -10 1)]]
     "Dweet doot doot."]
    ["Lucio" [[:bastion :_neutralLeft (scoot -10)] [:lucio :_smile (scoot -10)]]
     "Aw, yeah! That’d be awesome!"]
    ["Symmetra" [[:bastion :_neutral (scoot -10)] [:lucio :_neutral (scoot -10)] [:symmetra :_helloWarm (scoot 65 5 1)]]
     "I hope I’m not interrupting."]
    ["Lucio" [[:bastion :_neutral (scoot -10)] [:lucio :_explainForward (scoot -10)] [:symmetra :_smile (scoot 5)]]
     "We were talking about our upcoming collab album, I’ll send you a copy when we release it."]
    ["Symmetra" [[:bastion :_neutral (scoot -10)] [:lucio :_neutral (scoot -10)] [:symmetra :_no (scoot 5)]]
     "I do not mean to insult you but your gift would be wasted on me. Most pop music is not to my liking."]
    ["Lucio" [[:bastion :_neutral (scoot -10)] [:lucio :_point (scoot -10)] [:symmetra :_neutral (scoot 5)]]
     "I hear you, but this specific album? It’s gonna be real high class stuff, Symmetra, let me tell you."]
    ["Symmetra" [[:bastion :_neutral (scoot -10)] [:lucio :_neutral (scoot -10)] [:symmetra :_bored (scoot 5)]]
     "I want to believe you, but no matter how many inspirational quotes you have sampled over repetitive beats, I’ve failed to find any of them moving.  "]
    ["Lucio" [[:bastion :_neutral (scoot -10)] [:lucio :_prayExplain (scoot -10)] [:symmetra :_neutral (scoot 5)]]
     "All the 2010’s inspired electronica you’ve heard from me, it pays the bills, but this is different. This is my passion project."]
    ["Lucio" [[:bastion :_neutral (scoot -10)] [:lucio :_ominous (scoot -10)] [:symmetra :_confused (scoot 5)]]
     "It’s my secret album. Under my pseudonym, Carmen Fragando. It’s all audio samples of our operations here mixed with Tropicalia era Brazilian music. Carmen Miranda, especially."]
    ["Symmetra" [[:bastion :_neutral (scoot -10)] [:lucio :_neutral (scoot -10)] [:symmetra :_explainUncomfortable (scoot 5)]]
     "That, um, seems rather inappropriate."]
    ["Lucio" [[:bastion :_neutral (scoot -10)] [:lucio :_pointUp (scoot -10)] [:symmetra :_neutral (scoot 5)]]
     "Don’t worry, they’re all ethically sourced. I strap a microphone to old Bastion here, and record the sounds of all of our matches!"]
    ["Symmetra" [[:bastion :_neutral (scoot -10)] [:lucio :_neutral (scoot -10)] [:symmetra :_explainWTF (scoot 5)]]
     "That still seems inappropriate."]
    ["Lucio" [[:bastion :_neutral (scoot -10)] [:lucio :_lament (scoot -10)] [:symmetra :_WTF (scoot 5)]]
     "I mean, yes we are recording the noises of our dying bodies as they’re torn apart, only to be revived by unnatural technology."]
    ["Bastion" [[:bastion :_pointUpRight (scoot -10)] [:lucio :_neutral (scoot -10)] [:symmetra :_WTF (scoot 5)]]
     "Bwee boop. Kip. Kip. Kip. Reeeech."]
    ["Lucio" [[:bastion :_neutral (scoot -10)] [:lucio :_ponder (scoot -10)] [:symmetra :_WTF (scoot 5)]]
     "Right! And, like, are we even the same people once we come back alive? Like, am I some sort of demon Lucio? Is Bastion just a shell of their original self?"]
    ["Bastion" [[:bastion :_neutralLeft (scoot -10)] [:lucio :_neutral (scoot -10)] [:symmetra :_WTF (scoot 5)]]
     "Bweeeeep."]
    ["Lucio" [[:bastion :_neutralLeft (scoot -10)] [:lucio :_weeping (scoot -10)] [:symmetra :_WTF (scoot 5)]]
     "Like, sure we’ve saved their memories before they died, but they and their adorably be-shorted sidekick, what happened to them?"]
    ["Lucio" [[:bastion :_neutralLeft (scoot -10)] [:lucio :_wipeTears (scoot -10)] [:symmetra :_WTF (scoot 5)]]
     "Nier: Automata was a masterpiece."]
    ["Symmetra" [[:bastion :_neutral (scoot -10)] [:lucio :_neutral (scoot -10)] [:symmetra :_confused (scoot 5)]]
     "Huhhh?"]
    ["Lucio" [[:bastion :_neutral (scoot -10)] [:lucio :_explainForward (scoot -10)] [:symmetra :_neutral (scoot 5)]]
     "Look, you don’t have to worry. I actually asked everyone’s permission for this project, and making art about all this weird dying and reviving we’re always doing is probably gonna make everyone sleep a little better at night, right?"]
    ["Symmetra" [[:bastion :_neutral (scoot -10)] [:lucio :_neutral (scoot -10)] [:symmetra :_explain (scoot 5)]]
     "And what do you propose?"]
    ["Lucio" [[:bastion :_neutral (scoot -10)] [:lucio :_prayExplainHappy (scoot -10)] [:symmetra :_neutral (scoot 5)]]
     "Okay. We need better samples. More prolonged sessions of shooting."]
    ["Bastion" [[:bastion :_pointUpRight (scoot -10)] [:lucio :_neutral (scoot -10)] [:symmetra :_neutral (scoot 5)]]
     "Bweeee."]
    ["Lucio" [[:bastion :_neutral (scoot -10)] [:lucio :_explainForward (scoot -10)] [:symmetra :_neutral (scoot 5)]]
     "Right, but people keep flanking Bastion. I need you to guard their flank on defense, and to set up with them on the payload on offense."]
    ["Lucio" [[:bastion :_neutral (scoot -10)] [:lucio :_pointUp (scoot -10)] [:symmetra :_neutral (scoot 5)]]
     "But, here’s the important part, you have to let Bastion do the killing."]
    ["Bastion" [[:bastion :_explainRight (scoot -10)] [:lucio :_neutral (scoot -10)] [:symmetra :_neutral (scoot 5)]]
     "Whrrrr."]
    ["Lucio" [[:bastion :_neutral (scoot -10)] [:lucio :_prayExplain (scoot -10)] [:symmetra :_neutral (scoot 5)]]
     "You’ll ruin the sample if you kill people yourself."]
    ["Lucio" [[:bastion :_neutral (scoot -10)] [:lucio :_ominous (scoot -10)] [:symmetra :_WTF (scoot 5)]]
     "I’ll be wearing a fruit hat, and blasting Carmen Miranda songs. It won’t heal you, but we’ll be making real art."]
    :-> [:street :lucio :choice]]

   [:street :lucio :choice]
   [:miranda/text-option
    "What will you do?"
    ["Produce real art" (constantly true)
     [:-> [:street :lucio :yes]]]
    ["Converse with your other teammates" (constantly true)
     [:-> [:street :lucio :no]]]]

   [:street :lucio :yes]
   [:miranda/dialogue
    ["Symmetra" [[:bastion :_neutral (scoot -10)] [:lucio :_neutral (scoot -10)] [:symmetra :_frustratedConfused (scoot 5)]]
     "I do not quite understand it myself, but I feel this strange desire to help you."]
    ["Lucio" [[:bastion :_neutral (scoot -10)] [:lucio :_jammin (scoot -10)] [:symmetra :_awkward (scoot 5)]]
     "Aw yeah, it’s because no one can resist the fresh smell of real art."]
    ["Symmetra" [[:bastion :_neutral (scoot -10)] [:lucio :_jammin (scoot -10)] [:symmetra :_confused (scoot 5)]]
     "I should take a break after this. All this Overwatching has apparently affected my ability to make rational choices."]
    :-> [:lucio]]

   [:street :lucio :no]
   [:miranda/dialogue
    ["Symmetra" [[:bastion :_neutral (scoot -10)] [:lucio :_neutral (scoot -10)] [:symmetra :_frustrated (scoot 5)]]
     "This proposal is both unethical, and impractical. Lucio, you should consider not making this album."]
    ["Lucio" [[:bastion :_neutral (scoot -10)] [:lucio :_lament (scoot -10)] [:symmetra :_neutral (scoot 5)]]
     "Well, I can’t really produce it without you, so if you change your mind, let us know. "]
    ["Lucio" [[:bastion :_neutral (scoot -10)] [:lucio :_point (scoot -10)] [:symmetra :_neutral (scoot 5)]]
     "Just know, you’re missing the opportunity to get your name in the liner notes. Break into the music biz!"]
    ["Symmetra" [[:bastion :_neutral (scoot -10)] [:lucio :_neutral (scoot -10)] [:symmetra :_no (scoot 5)]]
     "No. Goodbye."]
    :-> [:street :choice]]

   [:lucio]
   [:miranda/characters
    [[]]
    :-> [:lucio :text]]

   [:lucio :text]
   [:miranda/narration
    "To everyone’s surprise, it turned out that when combined with Lucio’s Crossfader technology, Carmen Miranda’s music had actually had a damage booting effect. With the extra firepower the tropicalia era songs provided, your team managed to hold onto the first point for an impressive period of time, despite your personal lack of kills. Bastion’s one omnic onslaught could not last forever though and ultimately your team was overrun and your opponents easily escorted the payload to its destination. You ditched the gimmick for the offensive round, but even so, you could not manage to complete the map."
    :=> [:hollywood [:spawn :intro] 0]]})
