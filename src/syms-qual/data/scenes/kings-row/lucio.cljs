(ns syms-qual.data.scenes.kings-row.lucio)

(def start-date
  [:transition :miranda/mutation->basic
   [[:-> [:anubis :pharah :confirm]]
    (fn []
      ;;TODO: mutate state to indicate date
      )]])

(def data
  {[:kings-row :lucio 0]
   [:miranda/dialogue
    ["Bastion" [] "Dweet doot doot."]
    ["Lucio" [] "Aw, yeah! That’d be awesome!"]
    ["Symmetra" [] "I hope I’m not interrupting."]
    ["Lucio" [] "We were talking about our upcoming collab album, I’ll send you a copy when we release it."]
    ["Symmetra" [] "I do not mean to insult you but your gift would be wasted on me. Most pop music is not to my liking."]
    ["Lucio" [] "I hear you  But this specific album? It’s gonna be real, Symmetra, let me tell you."]
    ["Symmetra" [] "I want to believe you, but no matter how many inspirational quotes you have sampled over repetitive beats, I’ve failed to find any of them moving.  "]
    ["Lucio" [] "All the 2010’s inspired electronica you’ve heard from me, it pays the bills, but this is different. This is my passion project."]
    ["Lucio" [] "It’s my secret album. Under my pseudonym, Carmen Fragando. It’s all audio samples of our operations here mixed with Tropicalia era Brazilian music. Carmen Miranda, especially."]
    ["Symmetra" [] "That, um, seems rather inappropriate."]
    ["Lucio" [] "Don’t worry, they’re all ethically sourced. I strap a microphone to old Bastion here, and record the sounds of all of our matches here!"]
    ["Symmetra" [] "That still seems inappropriate."]
    ["Lucio" [] "I mean, yes we are recording the noises of our dying bodies as they’re torn apart, only to be revived by unnatural technology."]
    ["Bastion" [] "Bwee boop. Kip. Kip. Kip. Reeeech."]
    ["Lucio" [] "Right! And, like, are we even the same people once we come back alive? Like, am I some sort of demon Lucio? Is Bastion just a shell of their original self?"]
    ["Bastion" [] "Bweeeeep."]
    ["Lucio" [] "Like, sure we’ve saved their memories before they died, but they and their adorably be-shorted sidekick, what happened to them?"]
    ["Lucio" [] "Nier: Automata was a masterpiece."]
    ["Symmetra" [] "Huhhh?"]
    ["Lucio" [] "Look, you don’t have to worry. I actually asked everyone’s permission for this project, and making art about all this weird dying and reviving we’re always doing is probably gonna make everyone sleep a little better at night, right?"]
    ["Symmetra" [] "And what do you propose?"]
    ["Lucio" [] "Okay. We need better samples. More prolonged sessions of shooting."]
    ["Bastion" [] "Bweeee."]
    ["Lucio" [] "Right, but people keep flanking Bastion. I need you to guard their flank on defense, and to set up with them on the payload on offense. But, here’s the important part, you have to let Bastion do the killing."]
    ["Bastion" [] "Whrrrr."]
    ["Lucio" [] "You’ll ruin the sample if you kill people yourself."]
    ["Lucio" [] "I’ll be wearing a fruit hat, and blasting Carmen Miranda songs. They won’t heal you, but we’ll be making real art."]
    :-> [:kings-row :choice]]

   [:kings-row :lucio :choice]
   [:miranda/text-option
    "What will you do?"
    ["Produce real art." (constantly true) start-date]
    ["Converse with your other teammates" (constantly true)
     [:kings-row :lucio :no]]]

   [:kings-row :lucio :yes]
   [:miranda/dialogue
    ["Symmetra" [] "I do not quite understand it myself, but I feel this strange desire to help you."]
    ["Lucio" [] "Aw yeah, it’s because no one can resist the fresh smell of real art."]
    ["Symmetra" [] "I should take a break after this. All this Overwatching has apparently affected my ability to make rational choices."]
    :-> [:kings-row :lucio :cutscene]]

   [:kings-row :lucio :no]
   [:miranda/dialogue
    ["Symmetra" [] "This proposal is both unethical, and impractical. Lucio, you should consider not making this album."]
    ["Lucio" [] "Well, I can’t really produce it without you, so if you change your mind, let us know. "]
    ["Lucio" [] "Just know, you’re missing the opportunity to get your name in the liner notes. Break into the music biz!"]
    ["Symmetra" [] "No. Goodbye."]
    :-> [:kings-row :choice]]

   [:kings-row :lucio :cutscene]
   [:miranda/narration
    "To everyone’s surprise, it turned out that when combined with Lucio’s Crossfader technology, Carmen Miranda’s music had actually had a damage booting effect. With the extra firepower her tropical songs provided, your team managed to hold onto the first point for an impressive period of time, despite your personal lack of kills as per Lucio’s request. Bastion’s one omnic onslaught could not last forever though and ultimately your team was overrun and your opponents easily escorted the payload to its destination. You ditched the gimmick for the offensive round, but even so, you could not manage to complete the map."
    :-> [:hollywood :intro]]})
