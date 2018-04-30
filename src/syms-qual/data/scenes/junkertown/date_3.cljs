(ns syms-qual.data.scenes.junkertown.date-3
  (:require [carmen.util :as anim :refer [scoot]]
            [syms-qual.util :as util :refer [inc-transition]]))

(def data
  {[:field :date-3 0]
   [:miranda/dialogue
    ["Junkrat" [] "Oy, sorry, love. Didn’t mean to wake you. Just trying to make myself a pick me up."]
    ["Symmetra" [] "May I have some?"]
    ["Junkrat" [] "It’s got a minute or two until it’s ready."]
    ["Symmetra" [] "I can wait."]
    ["Junkrat" [] "It’ is gorgeous here, innit? I close my eyes just for a second and when I open ‘em again I’m dazzled all over."]
    ["Symmetra" [] "The view is definitely quite fine."]
    ["Junkrat" [] "Hang on a tick…you talkin’ about me, aren’t you, you cheeky rascal."]
    :-> [:field :date-3 :option 0]]

   [:field :date-3 :option 0]
   [:miranda/option
    "Symmetra"
    "It is quite easy to make you blush, Jamie."
    "That was not a euphemism, Jamie."]

   [:field :date-3 :option 0 0]
   [:miranda/dialogue
    ["Junkrat" [] "That’s unfair! I wasn’t prepared!"]
    ["Symmetra" [] "You should always be prepared for love and support."]
    ["Junkrat" [] "For real?"]
    ["Symmetra" [] "No. I’m not a true support. You should prepare for a powerfully structured defense that is off meta on most maps."]
    ["Junkrat" [] "Is this another joke? Or is that a euphemism? I don’t have a dang clue."]
    ["Symmetra" [] "I leave it up to your interpretation."]
    :-> [:field :date-3 1]]

   [:field :date-3 :option 0 1]
   [:miranda/dialogue
    ["Junkrat" [] "Oh. Uh! So sorry."]
    ["Symmetra" [] "Don’t be. Of course I like you too."]
    ["Junkrat" [] "Ehehehehe."]
    :-> [:field :date-3 1]]

   [:field :date-3 1]
   [:miranda/dialogue
    ["Junkrat" [] "Here, have some proper billy tea."]
    [nil [] "Junkrat hands you a cup of tea."]
    ["Junkrat"  [] "How is it?"]
    :-> []]

   [:field :date-3 :option 1]
   [:miranda/option
    "Symmetra"
    "Go for the kiss."
    "Flirt."]

   [:field :date-3 :option 1 0]
   [:miranda/dialogue
    ["Symmetra" [] "Hm..."]
    ["Junkrat" [] "Oy, you said no sugar, right?"]
    ["Symmetra" [] "No sugar for the tea but I would like something sweet"]
    ["Junkrat" [] "I knew we should have packed some honey. Or agave…"]
    ["Junkrat" [] "Wait, what’s this staring?"]
    :-> [:field :kiss]]

   [:field :kiss]
   [:miranda/characters
    [[]]
    :-> [:field :date-3 2]]

   [:field :date-3 :option 1 1]
   [:miranda/dialogue
    ["Symmetra" [] "Perfect. What a sweet boy. Mako’s right about you, you know."]
    ["Junkrat" [] "Hehe, I try."]
    ["Symmetra" [] "Keep this up and you might get those head scratches after all."]
    ["Junkrat" [] "Yes’m! I’ll keep working hard at being a good boy."]
    :-> [:field :date-3 2]]

   [:field :date-3 2]
   [:miranda/dialogue
    ["Junkrat" [] "I’m glad you came out here with us. I know a place can’t really be a gift, but if I was gonna give you something it would be time here, as a thank you for putting up with all of my nonsense."]
    ["Symmetra" [] "What do you mean?"]
    ["Junkrat" [] "Well, you helped me out in King’s Row. It was one silly little problem but I was damn near having a mini panic attack over needing that shim."]
    ["Symmetra" [] "I didn’t realize. I’m so sorry..."]
    ["Junkrat" [] "And Lucio and D.Va are right good mates, but they’re so intense with the streaming and performing, I feel like I gotta be on all the time around them... Knowing you’d show up made it feel safer. Took a lot of the pressure off."]
    ["Junkrat" [] "And even today, leaving everyone in the lurch, I thought I could take it, but I just had to get out of there. And you helped me do that too."]
    ["Symmetra" [] "You don’t need to thank me, Jamie. And it isn’t nonsense. This job is stressful."]
    ["Symmetra" [] "I’m glad my being here has helped you. I think I’ve also found it comforting to have someone else who’s as stressed out by people as I am to commiserate with."]
    ["Junkrat" [] "Yeah, I guess it’s some of that…. What’s that word Roadie’s always using."]
    ["Symmetra" [] "Serendipity."]
    ["Junkrat" [] "Yeah. Some of that. Might be chance, but at least it’s a chance you can make something new out of."]
    ["Symmetra" [] "I was not pleased when I was first assigned as Vishkar’s representative to Overwatch but my time here has given me some new perspective in ways I did not expect. As our time here draws to a close I am starting worry about going home."]
    ["Junkrat" [] "Yeah, nothing like going somewhere new to make you think hard about where you’ve been."]
    ["Symmetra" [] "I do miss home, the comfort and familiarity of my routine there. I had no interest in leaving and being here is much more exhausting. But getting some distance from my work there has allowed me space to think about it."]
    ["Junkrat" [] "Distance is important. I never really wanted to leave Junkertown but getting thrown out was probably the best thing that ever happened to me."]
    ["Symmetra" [] "Oh, I’m sorry. I had no idea that had happened to you. Is that why you had such a hard time today?"]
    ["Junkrat" [] "Coming back today made me feel all nostalgic. And sad. And homesick. But, I also think was the first time I really felt like I could look at the place from the outside. Living here really messed me up."]
    ["Junkrat" [] "It’s complicated, right? In some ways I’m proud of being from here. It taught me to tinker, to work with my hands and fend for myself. But all that stuff was a survival mechanism, and the other survival mechanisms I picked up...well, they turned me into someone I didn’t wanna be."]
    ["Symmetra" [] "I don’t think you’re a bad person, Jamie."]
    ["Junkrat" [] "I’m trying my best, darl but I’ve done a lot of bad things. I spent the whole year after we were kicked out being nothing but petty, spending all my time trying to go through with this harebrained scheme to get revenge on the queen for giving us the boot."]
    ["Symmetra" [] "I mean, there are worse--"]
    ["Junkrat" [] "It’s ok. You don’t have to try and make me feel better about myself. I’m a work in progress. I’m learning to tinker with my own insides, same as pulling out wiring and changing circuits. Sometimes I have to break things down and build them back. Replace parts. It’s an ongoing process. Nothing stays fixed for good, but I feel better working on things piece by piece instead of takin’ or leaving  the whole gadget."]
    ["Symmetra" [] "I admire how frankly you can speak about these things. Regrettably, I do not think any support I could offer would be of much use to you."]
    ["Junkrat" [] "It’s ok! And I didn’t mean to talk so much about myself. Once I start going I never know when to shut up. Even if you don’t feel like you’ve got anything to say just having someone to listen is nice."]
    ["Junkrat" [] "But me and my big mouth aside, we started talkin’ about this cause you said you were worried about going home to Vishkar right? I’m sure they’re right good people, I don’t think they’d send such a hard working employee here if there wasn’t a good reason."]
    ["Symmetra" [] "I… Vishkar has been everything to me. But I’ve been having my doubts, lately."]
    ["Junkrat" [] "How so, love?"]
    ["Symmetra" [] "It’s like you said, just because something needs a fix or two, it does not mean we ought to demolish it and replace the thing entirely."]
    ["Symmetra" [] "But I’ve started to wonder if Vishkar, and their work…"]
    ["Symmetra" [] "I wonder if I’ve been treating people as disposable."]
    ["Junkrat" [] "…"]
    ["Symmetra" [] "Vishkar’s emphasis on order and structure always made sense to me. I was a bright young girl when I started there, always receiving praise for my accomplishments. It was easy to fall into a comfortable rhythm and not think to hard about what I was doing."]
    ["Symmetra" [] " I never questioned my moral implications of my actions because I assumed someone up above me had already done the thinking for me. After all, I was always told Vishkar was making the world a better place. And it wasn’t until recently that I started to realize that that might not be true."]
    ["Junkrat" [] "I feel you. Realizing the water you've been swimming in is full of garbage is a tough pill to swallow. Err, I’m getting my metaphors all mixed up. What was that thing Roadie was telling me about what the hell is water..."]
    ["Junkrat" [] "Something about wanting to drink a Fosters with Wallace? I don’t know what he was on about that stuff right nasty."]
    ["Symmetra" [] "I believe he was referring to a David Foster Wallace quote about fish not knowing that they swim in water."]
    ["Junkrat" [] "Yeah that’s it! It’s hard to recognize the it when you’re in the middle of it. They send you here afraid you were gonna call the clean up crew?"]
    ["Symmetra" [] " An astute observation. I am not sure. I’ve spent a lot of time on this trip trying to answer the question for myself. But I no longer feel like I can trust my superiors nor do I think they trust me."]
    ["Junkrat" [] "Buncha wankers!"]
    ["Symmetra" [] "It’s okay. My time here has allowed me to experiment with a new way of being. I just do not know if I could resume living my life the way I used to if I were recalled to Utopea. All of that this uncertainty is very frightening to me."]
    ["Junkrat" [] "Sometimes it’s ok to just take things one day at a time."]
    ["Symmetra" [] "..."]
    ["Junkrat" [] " Satya?"]
    ["Symmetra" [] "Is it okay if we talk about something else? I opened up because I wanted to reciprocate your candidness, but it is difficult for me to talk about these sorts of things at length."]
    ["Junkrat" [] " Sure thing, love."]
    ["Symmetra" [] "But I am glad that we can talk. I would like to continue our conversation at some point in the future, but--"]
    ["Symmetra" [] " I just… I have lot of difficulty verbalizing my thoughts when I am emotional if I have not had adequate time to prepare and think."]
    ["Junkrat" [] "No worries, darl. I’m here for whatever you need."]
    ["Junkrat" [] "Chockie-bickie?"]
    ["Symmetra" [] "This is quite good too!"]
    ["Junkrat" [] "Yeah Roadie’s really been baking up a storm since we got back."]
    ["Symmetra" [] "Speaking of Mako, there he is now."]
    ["Roadhog" [] "Hello, friends. Nap well?"]
    ["Junkrat" [] "Ehehehehe."]
    ["Roadhog" [] "Good. Thanks for taking care of my sweet boy."]
    ["Symmetra" [] "My pleasure. I’ve had a great time."]
    ["Roadhog" [] "Wonderful. But it’s getting dark. We should go."]
    ["Junkrat" [] "Right. Right. Busted headlights. Low visibility and all that. Just, uh..."]
    ["Junkrat" [] "Here, gather around."]
    [nil [] "Junkrat takes a photo of the three of you in front of the sunset."]
    :-> [:junkrat-b]]

   [:junkrat-b]
   [:miranda/characters
    [[]]
    :-> [:junkrat-b :text]]

   [:junkrat-b :text]
   [:miranda/narration
    "Refreshed from your excursion into nature you pile back onto the motorcycle to begin your journey back to Junkertown. As the sun fades from the sky, the lights in the shanty town spread out before you slowly begin to flicker on. "
    "Once you arrive back at the cabin, Junkrat invites you to stay and join them in a TV marathon slumber party, to which you agree. Roadhog sets up the projector and the couch while Junkrat shows you his collection in progress projects and sketched out plans he has stashed around the warehouse. After deciding on The Great British Bake-Off, you snuggle in to enjoy the show, finally indulging Junkrat in his long standing request for head rubs."
    :=> [:gibralter [:spawn :intro] 0]]})
