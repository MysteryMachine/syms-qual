(ns syms-qual.data.scenes.eichenwalde.pharah)

(def start-date
  [:transition :miranda/mutation->basic
   [[:-> [:anubis :pharah :confirm]]
    (fn []
      ;;TODO: mutate state to indicate date
      )]])

(def data
  {[:eichenwalde :pharah 0]
   [:miranda/dialogue
    ["Symmetra" [] "Hello all. It is good to see you."]
    ["Reinhardt" [] "Satya! Ah! It is good to see you again my friend! Welcome to my homeland!"]
    ["Symmetra" [] "Likewise, Reinhardt. The countryside here is quite beautiful. I greatly enjoyed the views from the transport on the way here."]
    ["Ana" [] "Satya, darling, Reinhardt, Pharah and I will be sitting on the objective today. We invite you to join us."]
    ["Symmetra" [] "I am worried about our composition, if I can be frank."]
    ["Reinhardt" [] "You can be Frank if you want to, but I must insist upon a full name of Francis, so that you can be hoity-toity at parties!"]
    ["Ana" [] "Reinhardt!"]
    ["Reinhardt" [] "Don’t be all business, Ana. If she’s worried, she needs a joke."]
    ["Ana" [] "Fine. Anyway, Satya, darling, do not worry about our composition. I have been informed by a reliable source that Sombra is ditching the match today. That means that even when Widowmaker and Hanzo decide not to do anything, it’s still 4v5, and we have the most competent member of this unit."]
    ["Reinhardt" [] "Oh, Ana, that just isn’t true. I’m not that great."]
    ["Ana" [] "I’m talking about myself. I have the highest rank. "]
    ["Reinhardt" [] "Do you? I do not check mine. I am simply happy to smash with my big hammer."]
    ["Ana" [] "I know, darling. Anyway, Satya, do not fret, I have carried teams worse than this."]
    ["Reinhardt" [] "Like that one team that was just support heroes after Reaper no showed."]
    ["Ana" [] "And he was captain! He drafted all supports because he claimed he’d be invincible with enough healing."]
    ["Reinhardt" [] "Ahahah, Gabriel. That man has made many mistakes but he sure knows how to make me laugh. "]
    ["Ana" [] "We’ll be getting the last laugh today. I will make sure of it."]
    ["Symmetra" [] "I feel more comfortable knowing you feel confident going into this match."]
    ["Ana" [] "As you should. Don’t ever doubt my skills."]
    ["Reinhardt" [] "Ana is just superior. You’d think her back would hurt with how much she has to carry us."]
    ["Ana" [] "You don’t seem to carry anyone and your back’s terrible. "]
    ["Reinhardt" [] "My armor and hammer are already quite heavy on their own. That’s why I rely on your impeccable shot calling."]
    ["Ana" [] "I do have a plan, but compensating for Hanzo’s terrible draft is going to be extremely difficult. Winston’s system is nonsense."]
    ["Reinhardt" [] "I think that it’s nice that you get to be captain if your birthday is coming up."]
    ["Ana" [] "Half of our agents do not care about working to fulfill the objectives as a team, they just want to have some sort of free for all death match. Widomaker and Hanzo cry about being under utilized, and then they go and build teams like this."]
    ["Pharah" [] "Oh, hello mother, who is…"]
    ["Pharah" [] "Satya? What has she told you? Mama, I swear..."]
    ["Reinhardt" [] "Relax, Kinder treat, your mother hasn’t said anything embarrassing."]
    ["Ana" [] "Yet."]
    ["Pharah" [] "…"]
    ["Ana" [] "Anyway, I was recruiting her to join us on the payload. I will see you all there. Dismissed."]
    :-> [:eichenwalde :pharah :choice]]

   [:eichenwalde :pharah :choice]
   [:miranda/text-option
    "What will you do?"
    ["I wanna meet that payload." (constantly true) start-date]
    ["Converse with your other teammates" (constantly true)
     [:eichenwalde :pharah :no]]]

   [:eichenwalde :pharah :yes]
   [:miranda/dialogue
    ["Ana" [] "Good to go? Alright. Let’s roll out."]
    :-> [:eichenwalde :pharah 1]]

   [:eichenwalde :pharah :no]
   [:miranda/dialogue
    ["Ana" [] "Allow me to reiterate that this is not a choice. If I catch you doing something wacky with Hanzo or Widow, there will be consequences."]
    :-> [:eichenwalde :choice]]

   [:eichenwalde :pharah 1]
   [:miranda/dialogue
    ["Ana" [] "Ah. Hello, Satya. I’m glad to see that I will not need to administer discipline."]
    ["Symmetra" [] "Oh. Um, yes."]
    ["Reinhardt" [] "Oh, do not mind her. Ana runs a tight ship is all."]
    :-> []] ;; TODO: conditional transition here

   [:eichenwalde :pharah 2 :a]
   [:miranda/dialogue
    ["Ana" [] "Am I wrong though? Satya’s avoided the payload in most of her matches. I’m glad to see her turning things around."]
    ["Symmetra" [] " I have found that bonding with my teammates first is an important part of creating a cohesive unit."]
    ["Pharah" [] "Yes, mother. Let her build a sense of camaraderie for asking her to lay down her life in combat."]
    ["Ana" [] "‘Ibna, do not think I didn’t notice you avoiding your duties to go on a date. If you wanted to do that, you might as well have remained a civilian like mama wanted, darling."]
    :-> [:eichenwalde :pharah 3]]

   [:eichenwalde :pharah 2 :b]
   [:miranda/dialogue
    ["Ana" [] "I’m a little tired of seeing people treat this program so lightly, Reinhardt. If I wanted to have my time wasted I wouldn’t have bothered to come out of retirement. This is a combat simulator not a dating service. "]
    ["Pharah" [] "Mama, I don’t think that’s fair to--"]
    ["Ana" [] "Don’t interrupt me, soldier. I did not ask for your opinion."]
    :-> [:eichenwalde :pharah 3]]

   [:eichenwalde :pharah 3]
   [:miranda/dialogue
    ["Pharah" [] " ..."]
    ["Ana" [] " Get to your post and provide us with some aerial support"]
    :-> [:eichenwalde :pharah :cutscene 0]]

   [:eichenwalde :pharah :cutscene 0]
   [:miranda/narration
    "Despite your numbers disadvantage, your attack round goes surprisingly well. There seems to be no one on the enemy team capable of dealing with Pharah’s aerial offense and her cover fire allows you, Ana, and Reinhardt to easily move through the choke point. Once you are through, Ana splits off to take the high ground, allowing her to safely provide long distance healing as the rest of you fight to capture control of the payload. Once the battering ram is in your possession, you manage to quickly traverse the rest of the map, taking  the second and the third points with ease. Flush with the victory of your previous round, you begin to prepare for you turn on defense, setting up your turrets on the arc of the bridge with anticipatory glee. Once the round starts however, it becomes evident that most of the enemy team has decided to abandon the match. As you wait for the time limit on the round to expire, you sit with Pharah and Reinhardt in front of the payload while Ana lurks some distance off, crouched on the sniper’s perch on the far side of the point."
    :-> [:eichenwalde :pharah 4]]

   [:eichenwalde :pharah 4]
   [:miranda/dialogue
    ["Reinhardt" [] "It’s uh, quiet here, isn’t it?"]
    ["Symmetra" [] "I, for one, am enjoying the silence."]
    ["Pharah" [] "…"]
    ["Reinhardt" [] "Fareeha."]
    ["Pharah" [] "Yes?"]
    ["Reinhardt" [] "Don’t let what your mother said get to you, okay?"]
    ["Pharah" [] "It’s fine Reinhardt. I’m a soldier. I can handle being called out by my superiors."]
    ["Reinhardt" [] "Well, if you want to talk about it, I’m here for you, sweetie."]
    :-> [:eichenwalde :pharah ]] ;; TODO: custom transition

   [:eichenwalde :pharah :date 0]
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
    :-> [:eichenwalde :pharah :date :option 0]]

   [:eichenwalde :pharah :date :option 0]
   [:miranda/option
    "Symmetra" []
    "Children cannot turn into the devil, what really happened?"
    "Why the devil?"]

   [:eichenwalde :pharah :date :option 0 0]
   [:miranda/dialogue
    ["Pharah" [] "It’s an urban legend? All I know is, was that teen me was incredibly psyched to turn into some kind of queer super devil and start a coven and go live in the woods. "]
    ["Reinhardt" [] "And those urban legends always start with a grain of truth, Satya! I’m sure they actually turned into the devil."]
    ["Pharah" [] "Yeah, Reaper got turned into and evil cloud, why can’t some queer girls become the devil?"]
    ["Symmetra" [] "Because they didn’t have access to modern medical technology?"]
    ["Pharah" [] "That’s what you think. Alls I’m saying is I bet they’re out there now, being really gay. In the woods. Having a great time. I missed my chance."]
    ["Symmetra" [] "I mean, you are pretty gay, and you can fly, and we are currently on the edge of the woods, so really you are living out your childhood dreams as we speak."]
    ["Pharah" [] "Ha, you’re right."]
    :-> [:eichenwalde :pharah :date 1]]

   [:eichenwalde :pharah :date :option 0 1]
   [:miranda/dialogue
    ["Pharah" [] "A metaphor? If anyone has to be really gay it’s the devil, right?"]
    ["Reinhardt" [] "I don’t think queer people are evil."]
    ["Pharah" [] "I don’t either, I’m just saying, the devil’s probably chill and respects your pronouns. Like, I bet the devil just knows, they don’t even need to ask."]
    ["Symmetra" [] "Does the devil have a tumblr?"]
    ["Pharah" [] "Dude, I think someone I know follows it? It’s just like, all gay stuff, all the time. All the new ships. Posting, all day. My friend says that even if they spend all day reading that tumblr, they can never scroll to the bottom."]
    ["Pharah" [] "It can’t be a real person."]
    ["Pharah" [] "It has to be the gaydevil."]
    :-> [:eichenwalde :pharah :date 1]]

   [:eichenwalde :pharah :date 1]
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
    :-> [:eichenwalde :pharah :date :option 1]]

   [:eichenwalde :pharah :date :option 1]
   [:miranda/option
    "Symmetra" []
    "I admire your strength, Fareeha."
    "Maybe sending the boy to the hospital was overkill?"]

   [:eichenwalde :pharah :date :option 1 0]
   [:miranda/dialogue
    ["Pharah" [] "Thank you. I just wish my mother could as well"]
    ["Symmetra" [] "I’m sure she does. "]
    ["Reinhardt" [] "I know she is not the best mother, but at least her problem is overprotecting."]
    :-> [:eichenwalde :pharah :date 2]]

   [:eichenwalde :pharah :date :option 1 1]
   [:miranda/dialogue
    ["Pharah" [] "Maybe bullying my friend was overkill!"]
    :-> [:eichenwalde :pharah :date 2]]

   [:eichenwalde :pharah :date 2]
   [:miranda/dialogue
    ["Pharah" [] "Bluh. I know I’m more bitter than I should be. I have friends with much worse mothers. You always get these narratives about how parents are always redeemable and they always care and even if they mess up it’s with your best interest at heart."]
    ["Pharah" [] "I stayed friends with that boy. His parents acted like saints when they kicked him out."]
    ["Pharah" [] " Mama can be a bit much but at least she didn’t do that."]
    ["Reinhardt" [] "You two can be so hard on each other, it breaks my heart. You’re alike in so many ways."]
    ["Pharah" [] "…yeah."]
    ["Pharah" [] "Looks like the match is over. I see mama climbing down."]
    :-> [:eichenwalde :pharah :cutscene 2]]

   [:eichenwalde :pharah :not-date 0]
   [:miranda/dialogue
    ["Pharah" [] "Now is not an appropriate time, Reinhardt, this is a family issue."]
    ["Reinhardt" [] "Ah, yes. Sure. We will talk later."]
    :-> [:eichenwalde :pharah :cutscene 2]]

   [:eichenwalde :pharah :cutscene 2]
   [:miranda/narration
    "The match ends with the last of your enemies simply quitting. Ana jumps down from her perch and waves hello."
    :-> [:eichenwalde :pharah 5]]

   [:eichenwalde :pharah 5]
   [:miranda/dialogue
    ["Ana" [] "Fareeha."]
    ["Pharah" [] "Yes, ma’am?"]
    ["Ana" [] "At ease, soldier. I’ve come to apologize for lashing out. I was frustrated about something else, and I lashed out at you. It was unfair to you, and inappropriate from a superior officer."]
    ["Pharah" [] "Mama."]
    ["Ana" [] "These military drills are pointless, and I don’t want to be the hardass who makes it so people have to take them seriously. I guess I just felt like if we didn’t take them seriously, it would mean Overwatch had really turned into something meaningless."]
    ["Symmetra" [] "As of this week, we’ve regained UN sanction. I hardly think they would have chosen to support us if they did not believe the program to be worthwhile."]
    ["Ana" [] "It’s to keep us under their thumb. It would be a disaster if Overwatch were to go rogue, and a cell as small and talented as us is not easily handled."]
    ["Reinhardt" [] "With an army this small, we could be very good at gorilla warfare. It’s why Winston is in charge now."]
    ["Ana" [] "I’m going to pretend that I didn’t hear that."]
    ["Pharah" [] "Same, but gay."]
    ["Symmetra" [] "So, you suggesting this program exists more as a way to maintain Overwatch sanctioned, but isolated?"]
    ["Ana" [] "Right. And so we run these pointless matches. Akande and I often complain about this to each other. We’re doomed to roll this payload up the hill."]
    ["Ana" [] "Anyway, I don’t blame you for taking a break. Even if Winston does."]
    ["Pharah" [] "At least this family can agree Winston is meta scum."]
    ["Ana" [] "Absolutely, darling. Why will he not let us snipe in peace?"]
    ["Symmetra" [] "I could not agree more. What a try hard."]
    ;; You all share a hearty chortle.
    ["Ana" [] "Shall we get dinner, everyone?"]
    ["Reinhardt" [] "I know a currywurst place we can go to!"]
    ["Ana" [] "That sound good to everyone?"]
    ["Symmetra" [] "I, for one, do not wish to have the worst curry."]
    ["Pharah" [] "Symmetra, no it’s--"]
    ["Ana" [] "She is making a joke, darling, don’t correct her."]
    ["Pharah" [] "Ah. Okay. Currywurst then!"]
    :-> [:eichenwalde :pharah :cutscene 3]]

   [:eichenwalde :pharah :cutscene 3]
   [:miranda/narration
    "You arrive at the currywurst place, and they do not seem to be happy to have two people in power armor patronizing their restaurant. The old floorboards creak audibly under the immense weight of your party and the manager seems quite concerned. A vengeful glare from Ana cuts short any commentary the waitstaff might have had and they resign themselves to their fates.  After some more bad puns, Reinhardt orders a currywurst and a pint for everyone."
    :-> [:eichenwalde :pharah 6]]

   [:eichenwalde :pharah 6]
   [:miranda/dialogue
    ["Ana" [] "Reinhardt, you did not even ask Satya if she drinks or not."]
    :-> [:eichenwalde :pharah :option 3]]

   [:eichenwalde :pharah :option 3]
   [:miranda/option
    "Symmetra" []
    "I will accept the drink, thank you."
    "No thank you, I do not drink."]

   [:eichenwalde :pharah :option 3 0]
   [:miranda/dialogue
    ["Reinhardt" [] "Prost!"]
    ["Symmetra" [] "Prost, everyone."]
    :-> [:eichenwalde :pharah 7]]

   [:eichenwalde :pharah :option 3 1]
   [:miranda/dialogue
    ["Reinhardt" [] "See, here, Ana, you will learn of the brilliance of the Reinhardt system. You order a beer without asking, and if they say no, now you are a beer richer. Prost!"]
    :-> [:eichenwalde :pharah 7]]

   [:eichenwalde :pharah 7]
   [:miranda/dialogue
    ["Ana" [] "Reinhardt, do not get drunk in that power armor, you will literally die."]
    ["Reinhardt" [] "I do not fear death!"]
    ["Pharah" [] "I’ll drink to that."]
    ["Ana" [] "‘Ibna, I understand we just had a reconciliatory moment but please do not terrify your mama by getting drunk in power armor."]
    ["Pharah" [] "Affirmative, ma’am."]
    ["Ana" [] "Good. I have a breathalyzer just for these occasions. When you learn to keep one on you when getting drunk with brutes in power armor."]
    ["Reinhardt" [] "You get drunk in well polished, durasteel, hydraulic power armor once in your late twenties, and suddenly one can never be trusted again."]
    ["Ana" [] "Ruining people’s fun by carrying a breathalyzer at all times is my specific brand of comedy. And you didn’t just get drunk. You got drunk and tried to race a train by rocket charging on the train tracks."]
    ["Reinhardt" [] "But you are leaving out the important part! Which is that I won!"]
    ;You and Pharah start whispering to each other on your edge of the table.
    ["Pharah" [] "Think we’re finally free of the nagging? I have heard this story so many times. It goes on for a while."]
    ["Symmetra" [] "I think they are adorable."]
    ["Pharah" [] "Give it a few more months, and we’ll see you how you feel."]
    ["Symmetra" [] "Of course."]
    ["Pharah" [] "But it’s good to have her talking to me like this. Being treated like a soldier’s all I ever wanted."]
    ["Symmetra" [] "Well, if you want to be treated like a soldier, then you best prepare to pass that breathalyzer. "]
    ["Pharah" [] "Oh geez, not you too!"]
    ["Symmetra" [] "I’ll do it if you do it."]
    :-> []] ;; TODO: conditional transition

   [:eichenwalde :pharah :date :cutscene 4]
   [:miranda/narration
    "You enjoy the rest of the evening, listen to Reinhardt’s old stories, and Pharah and Ana’s amusing interjections.  As the evening draws to a close, the four of you make your way outside to begin the trek back to your nearby hotel. Before you set out, Ana insists on breathalyzing Reinhardt despite that fact that he ultimately only had two beers. After examining, the results she passes the breathalyzer to Pharah, who shoots you a playful glance before stepping in to have her turn as well. She and Ana exchange a smile, and Ana applies the test. Pharah hands you the breathalyzer."
    :-> [:eichenwalde :pharah :date 5]]

   [:eichenwalde :pharah :date 5]
   [:miranda/dialogue
    ["Pharah" [] " Your turn!"]
    ["Symmetra" [] "You want me to blow into this thing?"]
    ["Pharah" [] " Something like that! Strike a pose!"]
    ["Symmetra" [] " As you wish."]
    ["Pharah" [] "Hehe. Get closer!"]
    ;Pharah snaps a selfie.
    ["Pharah" [] "What is your phone number?"]
    :-> [:eichenwalde :pharah :cutscene :date :final]]

   [:eichenwalde :pharah :cutscene :date :final]
   [:miranda/narration
    "Pharah walks you home. She nervously leaves you at the door, turning beet red at the last minute, freezing up. You wave her goodnight and blow a kiss. A few minutes after, a text message arrives on your phone; Pharah had sent you the breathalyzer selfie as memento.
"
    :-> [:junkertown :intro]]

   [:eichenwalde :pharah :cutscene :not-date :final]
   [:miranda/narration
    "You enjoy the rest of the evening, listening to Reinhardt’s old stories and Pharah and Ana’s amusing interjections. As the evening draws to a close, the four of you make your way outside to begin the trek back to your nearby hotel. Before you set out, Ana insists on breathalyzing Reinhardt despite that fact that he ultimately only had two beers. Afterwards, she passes the breathalyzer to Pharah, requesting that she take the test as well. She and Ana exchange a smile, and Ana applies the test. Once she is satisfied with the results, you head back to the hotel listening to one last story from Reinhardt as you walk. "
    :-> [:junkertown :intro]]})
