(ns syms-qual.data.scenes.eichenwalde.date)

(def data
  {[:spawn :pharah 4]
   [:miranda/dialogue
    ["Reinhardt" [] "It’s uh, quiet here, isn’t it?"]
    ["Symmetra" [] "I, for one, am enjoying the silence."]
    ["Pharah" [] "…"]
    ["Reinhardt" [] "Fareeha."]
    ["Pharah" [] "Yes?"]
    ["Reinhardt" [] "Don’t let what your mother said get to you, okay?"]
    ["Pharah" [] "It’s fine Reinhardt. I’m a soldier. I can handle being called out by my superiors."]
    ["Reinhardt" [] "Well, if you want to talk about it, I’m here for you, sweetie."]
    :-> [:spawn :pharah ]] ;; TODO: custom transition

   [:spawn :pharah :date 0]
   [:miranda/dialogue
    ["Pharah" [] "…"]
    ["Reinhardt" [] "Remember summer camp?"]
    ["Pharah" [] "The one where mama dragged me out for punching a fucker?"]
    ["Reinhardt" [] "It kicked off your fucker punching career."]
    ["Pharah" [] "Remember when I knocked Gabe out cold while boxing?"]
    ["Reinhardt" [] "Well, he is a fucker, that is for sure."]
    ["Symmetra" [] "…"]
    ["Pharah" [] "Oh, sorry Satya. I didn’t mean to cut you out of the conversation. Should we talk about something else?"]
    ["Symmetra" [] "I don’t mind. Your stories are amusing, it’s just hard not to feel as though I am prying by listening."]
    ["Reinhardt" [] "Don’t be silly, you’re part of the Overwatch family as well. And what is family for but oversharing? Would you like to hear the story of Fareeha’s first fist fight? ."]
    ["Symmetra" [] "That does sound entertaining.."]
    ["Reinhardt" [] "Would you like to do the honors or should I?"]
    ["Pharah" [] "Go ahead. I never did quite manage to master your flair for the dramatic."]
    ["Reinhardt" [] "Alright, so, that summer, you wanted to join the Overwatch Youth Corps. A summer camp put on by some of the folks in the Overwatch program in order to teach kids about some of the skills real life Overwatch agents used. Sure, we had some military style drills."]
    ["Pharah" [] "It sounded hardcore! I’d heard it was like those military camps you send rebellious youth to. I wanted that intensity. I wanted to get ripped and do weapons drills."]
    ["Reinhardt" [] "Well, yes it was rigorous, but with children that wanted to be there! And unlike military camp, it was less punishment and more learning!"]
    ["Pharah" [] "We should start one of those programs again, in the future."]
    ["Reinhardt" [] "Err, well, maybe giving children all the tools they need to create technologically proficient paramilitary organizations is not what the world needs anymore."]
    ["Pharah" [] "Children are the future, Reinhardt, you have to trust them."]
    ["Reinhardt" [] "I agree! But we can trust them with less violent things, which is why your mother and I tried so hard to convince you to join the Girl Guides of Canada instead. Canoeing and plant identification are also valuable skills. But, ultimately, you insisted on going to that weird religious camp where they didn’t teach you anything useful."]
    ["Pharah" [] "You’re jumping ahead! Just let me tell it, if you’re gonna rush it!"]
    ["Reinhardt" [] "Good! Good! Yes, tell us."]
    ["Pharah" [] "OK, I had my heart set on joining the Youth Corp, but my mother wanted we nowhere near it. We argued and argued but she would not budge."]
    ["Pharah" [] "After weeks of whining and begging she finally conceded that I could go to a camp. Any camp I wanted, as long as it wasn’t the youth corp."]
    ["Pharah" [] "She and Rein both tried really hard to convince me to join the Girl Guides of Canada but I did not want to spend my summer wearing a sash and a neckerchief selling cookies. I wanted to shoot things and meet girls."]
    ["Pharah" [] " So with those two things as my criteria, I started looking. But with so many options available, I was having trouble deciding."]
    ["Pharah" [] "So I’m sitting there with all of my pamphlets, and about 500 tabs open on my browser making pro and con lists for all of my choices, when Gabe drops by, and in typical Gabe fashion, tells me a scary story."]
    ["Pharah" [] "Apparently, there was this super religious camp where they force you and your bunk mates to spend a night alone in an abandoned cabin and come face to face with the devil."]
    ["Pharah" [] "Legend has it that 70 years ago were some kids were so gay that the night it was their turn to stay in the cabin, they turned into the devil themselves, like the most intense beautiful and amazing devils covered in wings and eyes and hands."]
    ["Pharah" [] "And once I heard that, I knew had to go. I was ready to be the devil. I was ready to be very gay and also fly."]
    ["Reinhardt" [] "I did not know that was why you chose that place. It was so unlike you to want to go to such a religious summer camp."]
    :-> [:spawn :pharah :date :option 0]]

   [:spawn :pharah :date :option 0]
   [:miranda/option
    "Symmetra" []
    "Children cannot turn into the devil, what really happened?"
    "Why the devil?"]

   [:spawn :pharah :date :option 0 0]
   [:miranda/dialogue
    ["Pharah" [] "It’s an urban legend? All I know is, was that teen me was incredibly psyched to turn into some kind of queer super devil and start a coven and go live in the woods. "]
    ["Reinhardt" [] "And those urban legends always start with a grain of truth, Satya! I’m sure they actually turned into the devil."]
    ["Pharah" [] "Yeah, Reaper got turned into and evil cloud, why can’t some queer girls become the devil?"]
    ["Symmetra" [] "Because they didn’t have access to modern medical technology?"]
    ["Pharah" [] "That’s what you think. Alls I’m saying is I bet they’re out there now, being really gay. In the woods. Having a great time. I missed my chance."]
    ["Symmetra" [] "I mean, you are pretty gay, and you can fly, and we are currently on the edge of the woods, so really you are living out your childhood dreams as we speak."]
    ["Pharah" [] "Ha, you’re right."]
    :-> [:spawn :pharah :date 1]]

   [:spawn :pharah :date :option 0 1]
   [:miranda/dialogue
    ["Pharah" [] "A metaphor? If anyone has to be really gay it’s the devil, right?"]
    ["Reinhardt" [] "I don’t think queer people are evil."]
    ["Pharah" [] "I don’t either, I’m just saying, the devil’s probably chill and respects your pronouns. Like, I bet the devil just knows, they don’t even need to ask."]
    ["Symmetra" [] "Does the devil have a tumblr?"]
    ["Pharah" [] "Dude, I think someone I know follows it? It’s just like, all gay stuff, all the time. All the new ships. Posting, all day. My friend says that even if they spend all day reading that tumblr, they can never scroll to the bottom."]
    ["Pharah" [] "It can’t be a real person."]
    ["Pharah" [] "It has to be the gaydevil."]
    :-> [:spawn :pharah :date 1]]

   [:spawn :pharah :date 1]
   [:miranda/dialogue
    ["Symmetra" [] "So how did attending this camp ultimately result in a fist fight? I am assuming your fistfight was not with the devil."]
    ["Pharah" [] "Haha, no nothing like that. Long story short, a kid said something homophobic to this tiny gay boy and I punched him in the jaw."]
    ["Pharah" [] "Fuckers got punched. Justice got served. End of story."]
    ["Reinhardt" [] "After all that build up your final delivery was terrible! You should have let me tell it. You’ve left out all the savory details!"]
    ["Pharah" [] "I mean. It may have been a diving punch from the top of a diving board and he may have pressed charges, but that’s justice. Homophobes get punched. And when they’re healing? They get…"]
    ["Pharah" [] "Just ice."]
    ["Reinhardt" [] "Didn’t he have to get some minor surgery?"]
    ["Pharah" [] "Mama had a fit. In my defence, the bully was literally picking on my buddy when I landed that super punch. Camp counselors talked about how there should have been a peaceful resolution, but even 12 year olds know what happen to snitches."]
    ["Reinhardt" [] "Ana was pretty furious. She hoped a quiet religious camp would mean Fareeha would stay out of trouble. Now she was paying damages for Fareeha’s defense of her friends."]
    ["Pharah" [] "I do not understand the point of raising a daughter to be strong, if you are not willing to let her use her strength for something worthwhile."]
    :-> [:spawn :pharah :date :option 1]]

   [:spawn :pharah :date :option 1]
   [:miranda/option
    "Symmetra" []
    "I admire your strength, Fareeha."
    "Maybe sending the boy to the hospital was overkill?"]

   [:spawn :pharah :date :option 1 0]
   [:miranda/dialogue
    ["Pharah" [] "Thank you. I just wish my mother could as well"]
    ["Symmetra" [] "I’m sure she does. "]
    ["Reinhardt" [] "I know she is not the best mother, but at least her problem is overprotecting."]
    :-> [:spawn :pharah :date 2]]

   [:spawn :pharah :date :option 1 1]
   [:miranda/dialogue
    ["Pharah" [] "Maybe bullying my friend was overkill!"]
    :-> [:spawn :pharah :date 2]]

   [:spawn :pharah :date 2]
   [:miranda/dialogue
    ["Pharah" [] "Bluh. I know I’m more bitter than I should be. I have friends with much worse mothers. You always get these narratives about how parents are always redeemable and they always care and even if they mess up it’s with your best interest at heart."]
    ["Pharah" [] "I stayed friends with that boy. His parents acted like saints when they kicked him out."]
    ["Pharah" [] " Mama can be a bit much but at least she didn’t do that."]
    ["Reinhardt" [] "You two can be so hard on each other, it breaks my heart. You’re alike in so many ways."]
    ["Pharah" [] "…yeah."]
    ["Pharah" [] "Looks like the match is over. I see mama climbing down."]
    :-> [:spawn :pharah :cutscene 2]]

   [:spawn :pharah :not-date 0]
   [:miranda/dialogue
    ["Pharah" [] "Now is not an appropriate time, Reinhardt, this is a family issue."]
    ["Reinhardt" [] "Ah, yes. Sure. We will talk later."]
    :-> [:spawn :pharah :cutscene 2]]

   [:spawn :pharah :cutscene 2]
   [:miranda/narration
    "The match ends with the last of your enemies simply quitting. Ana jumps down from her perch and waves hello."
    :-> [:spawn :pharah 5]]})
