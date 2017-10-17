(ns syms-qual.data.scenes.kings-row.junkrat)

(def start-date
  [:transition :miranda/mutation->basic
   [[:-> [:anubis :pharah :confirm]]
    (fn []
      ;;TODO: mutate state to indicate date
      )]])

(def data
  {[:kings-row :junkrat 0]
   [:miranda/dialogue
    ["Junkrat" [] "Owyagarn, awright?"]
    ["Symmetra" [] "Pardon?"]
    :-> []] ;; TODO: this should be a conditional transition

   [:kings-row :junkrat 0 :a]
   [:miranda/dialogue
    ["Junkrat" [] "Ol’ pig face here was telling me he had his eye out for you yesterday but you were a no show. You’re not gonna go skippin’ out on us again are ya? I got plans for you."]
    :-> [:kings-row :junkrat 1]]

   [:kings-row :junkrat 0 :b]
   [:miranda/dialogue
    ["Junkrat" [] "Ol’ pig face here was telling me about your shot putt shenanigans yesterday. Glad I wasn’t the one taking the laser orbs to the face, but gotta admit that was pretty damn clever combo. Reckon you and me oughtta make some teammate magic of our own happen today."]
    :-> [:kings-row :junkrat 1]]

   [:kings-row :junkrat 0 :c]
   [:miranda/dialogue
    ["Junkrat" [] "Ol’ pig face here was telling me about your wild robot rodeo. yesterday. We heard Winston mention that Volskaya Industries got hacked, and the turned the robot on your team. That’s what happens when you ride the bull"]
    :-> [:kings-row :junkrat 1]]

   [:kings-row :junkrat 1]
   [:miranda/dialogue
    ["Symmetra" [] "Let me guess; you want me to attach my turrets to something weird, in some sort of hairbrained scheme to surprise our enemy with an unusual attack. What is it? Turrets on Roadhog’s hook? Attach my teleporter to your Rip-tire? Hide my shield generator up your nose?"]
    ["Junkrat" [] "No, why would I want to go and do something impractical and overly complicated like that?"]
    ["Symmetra" [] "Have you gotten a good look at yourself lately?"]
    ["Junkrat" [] "I don’t make it a habit to pay attention mirrors, love. The human psyche has this nasty tendency to judge itself unfairly. "]
    ["Junkrat" [] "Roadie and I have instead made a habit of practicing self love and acceptance."]
    ["Roadhog" [] "The boy is handsome. Don’t bully my friend."]
    ["Junkrat" [] "Roadie! You sweetheart. She’s not being a bully, she’s just not gotten a chance to know us. Now look, Satya…"]
    ["Symmetra" [] "Symmetra."]
    ["Junkrat" [] "Err, Symmetra, yes, our plan involves nothing like that. Roadie and I have build a new contraption, a hooking device. For now we’ve hidden it just behind the choke, but once we’re on offense we plan to attach to the payload. "]
    ["Junkrat" [] "The way it works is that we’ve added a radio transmitter to my trap, and when it springs, the device detects the"]
    :-> [:kings-row :junkrat :option 0]]

   [:kings-row :junkrat :option 0]
   [:miranda/option
    "Symmetra" []
    "Oh? I must say, that’s an ingenious little trick. I’m assuming some form of explosive is involved afterwards?"
    "It sounds like you do not need my help."]

   [:kings-row :junkrat :option 0 0]
   [:miranda/dialogue
    ["Junkrat" [] "Too right!"]
    ["Junkrat" [] "We’re planning on using it keep our back lines free of that skull face guy and the little speedy one since they’re always mucking up the works. The only thing missing, is we need a slight shim for the device. See, right here, we’re having some poor contact, and the thing won’t fire at times."]
    :-> [:kings-row :junkrat 2]]

   [:kings-row :junkrat :option 0 1]
   [:miranda/dialogue
    ["Junkrat" [] "But I do! The device is having some issues with the timing mechanism, some poor contact. It’s a little last minute, but could you conjure us up a shim, love?"]
    :-> [:kings-row :junkrat 2]]

   [:kings-row :junkrat 2]
   [:miranda/dialogue
    ["Symmetra" [] "A shim?"]
    ["Junkrat" [] "Aye, love, something thin we could wedge in there. My perfectly pudgy porcine pal and I would search ourselves, but we’re a ways away from a junkyard, and the match is gonna start soon."]
    ["Junkrat" [] "I gotta admit, I’m right stressed about the whole thing. Working so hard on this machine only to have it malfunction over something this silly."]
    ["Roadhog" [] "You are more than what you make, Jamie."]
    ["Junkrat" [] "Right. Right. Self-love and self-acceptance, yada yada. So waddya say?"]
    ["Symmetra" [] "I believe that  I can be of help, yes."]
    ["Junkrat" [] "Oy! Thank you! You’re a sweetheart! That, um, brings me to my next point."]
    ["Roadhog" [] "Go on."]
    ["Junkrat" [] "Aye aye! Um!"]
    ["Junkrat" [] "This plan does work better if you stay on the point  with us. What do you say? Roadie and I would really enjoy the company. "]
    ["Junkrat" [] "And not to beat a dead horse, but, since  you mentioned it, you creating a nest of your lil’ zappers right under our machine would be right nice!"]
    ["Symmetra" [] "Sigh, I knew there’d be some sort of gimmick involving my turrets."]
    ["Roadhog" [] "Let us know if you’ll join us. I’ll pack an extra sandwich."]
    ["Junkrat" [] "Fairy bread! Roadie’s specialty! What’d ya say?"]
    :-> [:kings-row :junkrat :choice]]

   [:kings-row :junkrat :choice]
   [:miranda/text-option
    "What will you do?"
    ["Work with the Junkers" (constantly true) start-date]
    ["Converse with your other teammates" (constantly true)
     [:kings-row :junkrat :no]]]

   [:kings-row :junkrat :yes]
   [:miranda/dialogue
    ["Symmetra" [] "Your proposal is suitable. I will create the shim now."]
    :-> [:kings-row :junkrat :cutscene]]

   [:kings-row :junkrat :no]
   [:miranda/dialogue
    ["Symmetra" [] "I’ll consider it! Let me just check in with our other teammates first."]
    :-> [:kings-row :choice]]

   [:kings-row :junkrat :cutscene]
   [:miranda/narration
    "The junkers make quick use of your shim, hammering it into place just in time for the match to start."
    :-> [:kings-row :junkrat 3]]

   [:kings-row :junkrat 3]
   [:miranda/dialogue
    ["Symmetra" [] "Are our preparations complete?"]
    ["Junkrat" [] "Almost! Now just stick this in your mouth and start setting up under the trap."]
    ["Symmetra" [] "What is this?"]
    ["Junkrat" [] "The booty I promised you, love. Fairy bread."]
    ["Symmetra" [] "Is this toast with...sprinkles?"]
    ["Junkrat" [] "Yes. Now make like an anime protagonist and shove it in your gob, we’re late to class, senpai."]
    ["Symmetra" [] "This is not a sandwich."]
    ["Roadhog" [] "Let’s go."]
    ["Junkrat" [] "Tasty, ‘init? I got a big sweet tooth, you can tell from all the ones that are missing. Fairy bread’s one of my favorites though, much like with explosions, I find that a dash of color really makes the experience."]
    ["Symmetra" [] "Texturally, this is not want I want from toast."]
    ["Junkrat" [] "Texture, smexture, you need to try some of my cooking one of these days, I’ll cure you of these pithy notions of texture with just a bite of my sichuan peppercorn flavoring. It’s like there are pop rocks in your mouth!"]
    ["Roadhog" [] "They ARE pop rocks."]
    ["Junkrat" [] "Oy, Roadie, shhh! Don’t betray my secret spice! People have to think it’s sichuan peppercorns."]
    ["Roadhog" [] "But it’s obvious."]
    ["Symmetra" [] " Focus, you two, our enemies are upon us."]
    ["Junkrat" [] "Ahh! You dropped the toast! We worked so hard, Roadie!"]
    ["Roadhog" [] "Shut up and shoot, handsome boy."]
    ["Junkrat" [] "Good point. I’ll give the enemy my anger, my fear, and all of my hunger!"]
    :-> [:junkrat :cutscene 1]]

   [:junkrat :cutscene 1]
   [:miranda/narration
    "The device proves to be a formidable advantage in your defense, but the enemy team eventually caught on to your gimmick, and managed to lay waste to it. Your team successfully full held the first point though, leaving your goal for the offensive round easily within reach. As you prepare for your turn on attack, you find yourself alone with Junkrat as he solemnly surveys the wreckage of his once proud creation."
    :-> [:kings-row :junkrat 4]]

   [:kings-row :junkrat 4]
   [:miranda/dialogue
    ["Symmetra" [] "Looks like they did a number on your machine."]
    ["Junkrat" [] "…"]
    ["Symmetra" [] "It performed quite commendably for a pile of scrap."]
    ["Junkrat" [] "Don’t insult me, love."]
    :-> [:kings-row :junkrat :option 1]]

   [:kings-row :junkrat :option 1]
   [:miranda/option
    "Symmetra" []
    "Insult you? I just paid you a compliment."
    "Oh. I’m sorry."]

   [:kings-row :junkrat :option 1 0]
   [:miranda/dialogue
    ["Junkrat" [] "You call that a compliment? That dang machine was an MVP, all by itself. That’s not just commendable, that’s splendiferous! European extreme, even!"]
    ["Symmetra" [] "European extreme?"]
    ["Junkrat" [] "Oy! Those dang Europeans are so competent at video games that they had to invent a whole new difficulty for them. I learned this from D.Va’s video game history class on Vimeo. This machine matches the sort of video gaming prowess one could expect from a European circa 2005."]
    ["Symmetra" [] "I do not follow, but I am happy for you."]
    ["Junkrat" [] "Thank you!"]
    ["Junkrat" [] "..."]
    ["Junkrat" [] "You smell smoke?"]
    :-> [:kings-row :junkrat 5]]

   [:kings-row :junkrat :option 1 1]
   [:miranda/dialogue
    ["Junkrat" [] "Oi! You better be! This machine was a lot more than commendable. I’m so proud of it! I’m glowing! Like a mother!"]
    ["Symmetra" [] "Are you sure you are not seeing the light from the embers in your hair?"]
    ["Junkrat" [] "That I am! It tingles, in an unpleasant way actually."]
    :-> [:kings-row :junkrat 5]]

   [:kings-row :junkrat 5]
   [:miranda/dialogue
    ["Symmetra" [] "You’re going to lose even more hair if you let it burn like that. Here, let me help you."]
    ["Junkrat" [] "Ehehe."]
    ["Symmetra" [] "What are you giggling at?"]
    ["Junkrat" [] "Nothing! Nothing!"]
    :-> [:kings-row :junkrat :option 2]]

   [:kings-row :junkrat :option 2]
   [:miranda/option
    "Symmetra" []
    "You keep those filthy hands away from me, or I’ll tear them off.
"
    "Oh gods, there are literal ashes in your hair. I feel so unclean."]

   [:kings-row :junkrat :option 2 0]
   [:miranda/dialogue
    ["Junkrat" [] "Oh! No hands here! And with these, no filth! It’s just when Roadie puts out my fires, I usually get a head rub or two."]
    ["Junkrat" [] "Ehem, I, um, just got ahead of myself. This is the part where Roadie would chime in with a stoic:"]
    ["Junkrat" [] "The boy likes head rubs. They’re nice."]
    :-> [:kings-row :junkrat 6]]

   [:kings-row :junkrat :option 2 1]
   [:miranda/dialogue
    ["Junkrat" [] "Hey! Ashes are fertile grounds, okay? In fact, I know this one guy on Youtube who, like, in his spare time just builds dirt huts and things? He makes ashes out of stuff to fertilize his perfect garden of potatoes."]
    ["Symmetra" [] "I see."]
    ["Junkrat" [] "Like, you see his skill and you think to yourself, oh, this wanker must definitely be an acca having maccas in his uni office, going to the field to research, but no, he’s just an amatuer paleolithic tribesman or something."]
    ["Symmetra" [] "I’m sure it’s very impressive."]
    ["Junkrat" [] "But sorry about your hands, love, it’s hard being an explosives expert and stayin’ clean. Here, use this. "]
    ["Symmetra" [] "I am surprised you carry wet naps."]
    ["Junkrat" [] "What, you think I’m the type of bloke to take an actual bath?"]
    ["Symmetra" [] "Ugh, I should have known better than to inquire further."]
    ["Junkrat" [] "I might make an exception for tonight though. "]
    ["Symmetra" [] "Excuse me?!"]
    ["Junkrat" [] "Gotta start cleaning up for the trip to Lijiang in a couple weeks. D.Va’s invited me to this arcade that has strict no being covered in flammable liquids policy and it takes me a while for me to completely remove them from my body. Should see if I can get in on some of those primo bubble baths Roadie’s been taking these days. "]
    :-> [:kings-row :junkrat 6]]

   [:kings-row :junkrat 6]
   [:miranda/dialogue
    ["Symmetra" [] "You and Roadhog are quite the pair."]
    ["Junkrat" [] "Some say it ain’t manly for a man to enjoy being rocked by another man, a humongous terrifying man, but Roadie’s been keeping away the nightmares for years now, that guy has."]
    ["Symmetra" [] "He rocks you to sleep?"]
    ["Junkrat" [] "The man is a living hammock. Hammocks are important because they keep you off the ground where scorpions and spiders live."]
    ["Junkrat" [] "Though, now that I think about it, there’s some irony in that, cause Roadie’s very afraid of spiders. I’m usually the one busting out the old mason jar and putting them back into the wild."]
    ["Symmetra" [] "You take spiders from the outside, and move them, what? Further outside?"]
    ["Junkrat" [] "Oy! I take offense. Roadie and I own a very nice trailer."]
    ["Symmetra" [] "With the amount of filth on you, I am not surprised your home does not have much in the way of running water"]
    ["Junkrat" [] "Hey, birds take dirt showers, it’s good enough for me, love."]
    ["Symmetra" [] "It is a miracle neither of you have died of infection thus far."]
    ["Junkrat" [] "We almost did! That one time. After the operation."]
    ["Symmetra" [] "Oh, I didn’t mean to..."]
    ["Junkrat" [] "The nuclear fallout from the explosion joined us at the hip. Here, look, this is before the doctors separated us."]
    ["Symmetra" [] "Junkrat, this is clearly a costume for a fancy dress party."]
    ["Junkrat" [] "Well, yeah. But it’s a really good one. Mostly I just wanted an excuse to show you cute photos. And how nice our trailer is. Look at us, so bright eyed and bushy tailed. Granted, most of the brightness is from my eyelashes being on fire but it still counts."]
    :-> [:kings-row :junkrat :option 3]]

   [:kings-row :junkrat :option 3]
   [:miranda/option
    "Symmetra" []
    "You’re both just wearing one large pair of pants. This hardly even counts as a costume."
    "I cannot fully process how adorable this is."]

   [:kings-row :junkrat :option 3 0]
   [:miranda/dialogue
    ["Junkrat" [] "You are saying this to the person who literally makes all their weapons out of trash."]
    ["Symmetra" [] "And they hardly count as weapons."]
    ["Junkrat" [] "But I thought you said you liked our hooking doovalacky!"]
    ["Symmetra" [] "Pardon me, I was just trying to be humorous. Also, doovalacky?"]
    ["Junkrat" [] "Like thingamabober."]
    ["Symmetra" [] "Pardon?"]
    ["Junkrat" [] "You know? Like, the thing? When you can’t remember the name of the thing?"]
    ["Symmetra" [] "I have never forgotten the name of anything."]
    ["Junkrat" [] "'S impossible. I don’t believe it."]
    ["Symmetra" [] "Well, you better start."]
    :-> [:kings-row :junkrat 7]]

   [:kings-row :junkrat :option 3 1]
   [:miranda/dialogue
    ["Junkrat" [] "Right? Best of bosom buddies."]
    ["Symmetra" [] "Best bosoms, you say? Yes, you are rather...sculpted."]
    ["Junkrat" [] "Excuse me?"]
    ["Symmetra" [] "Your pectorals exhibit perfect symmetry. "]
    ["Junkrat" [] "I. What?"]
    ["Symmetra" [] "It’s my prime criteria for masculine upper bodies. Yours is quite suitable."]
    ["Junkrat" [] "Oh. Well, alright then, love, I suppose I’ll work to keep them that way?"]
    ["Symmetra" [] "See that you do."]
    :-> [:kings-row :junkrat 7]]

   [:kings-row :junkrat 7]
   [:miranda/dialogue
    ["Junkrat" [] "Say, love. You’re acting, um, different? Dingo steal your breakfast in the past few minutes? Was it the fairy bread you dropped? That’s breakfast by some definitions."]
    ["Symmetra" [] "By no real definitions does that count as breakfast. "]
    ["Junkrat" [] "I mean you’re just…. Whatever. Thanks for giving me and Roadie the time of day, ey? Not many people ‘ere give us a fair shake. We’re rough around the edges, I admit, but the parts in the middle ain’t so bad."]
    ["Symmetra" [] "Well, I suppose I have seen the softer side of you two in the time we have been working together."]
    ["Junkrat" [] "You’re starting to get comfy with old Junky, ey? My tenderized, squishy interior finally rubbing all its viscera on ya, ey? People don’t usually see my softer side unless I accidentally explode myself."]
    ["Symmetra" [] "I am beginning to regret this decision."]
    ["Junkrat" [] "It’s too late! You’re officially in bed with criminals!"]
    ["Symmetra" [] "If you say so. Just behave, now."]
    ["Junkrat" [] "Aye, aye, I’ll be on m’ best behavior. ‘Bout time we were getting back to spawn to prepare to attack anyhow."]
    ["Symmetra" [] "Yes, let’s go."]
    :-> [:kings-row :junkrat :cutscene 3]]

   [:kings-row :junkrat :cutscene 3]
   [:miranda/narration
    "You are surprised to find yourself somewhat effortlessly synchronized with your unkempt companions, the three of you seeming to operate as your own kind of well oiled machine. Your serendipitous co-ordination manages to capture the point on your first push, ending the round in less than a minute. As you and your teammates are packing up your things, the Junkers approach you one last time asking for a picture to commemorate your stunning victory. Although you thought the pose they requested you take was rather juvenile, you have to admit the end result was quite amusing."
    :-> [:kings-row :junkrat 8]]

   [:kings-row :junkrat 8]
   [:miranda/dialogue
    ["Junkrat" [] "Smile!"]
    :-> [:hollywood :intro]]})
