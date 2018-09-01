(ns syms-qual.data.scenes.junkertown.date-3
  (:require [carmen.util :as anim :refer [scoot]]
            [syms-qual.util :as util :refer [inc-transition]]))

(def data
  {[:field :date-3 5]
   [:miranda/narration
        "You are awakened by the gentle hiss of the kettle and the smell of brewing tea."
    :-> [:field :date-3 0]]

  [:field :date-3 0]
   [:miranda/dialogue
    ["Junkrat" [[:junkrat :_ballSmileNod (scoot -80 -9 1.5)] [:symmetra :_smile (scoot 80 0 1.5)]] "Oy, sorry, love. Didn’t mean to wake you. Just trying to make myself a pick me up."]
    ["Symmetra" [[:junkrat :_ballSmileNod (scoot -9)] [:symmetra :_bigSmile (scoot 0)]] "May I have some?"]
    ["Junkrat" [[:junkrat :_ballConfusedEyesClosed (scoot -9)] [:symmetra :_smile (scoot 0)]] "Certainly! But it’s got a minute or two until it’s ready."]
    ["Symmetra" [[:junkrat :_ballSmile (scoot -9)] [:symmetra :_coy (scoot 0)]] "I can wait."]
    ["Junkrat" [[:junkrat :_ballThinkingSmile (scoot -9)] [:symmetra :_coy (scoot 0)]] "It’ is gorgeous here, innit? I close my eyes just for a second and when I open ‘em again I’m dazzled all over."]
    ["Symmetra" [[:junkrat :_ballThinkingSmile (scoot -9)] [:symmetra :_flirty (scoot 0)]] "The view is definitely quite fine."]
    ["Junkrat" [[:junkrat :_scandalized2 (scoot -9)] [:symmetra :_flirty (scoot 0)]] "Hang on a tick…you talkin’ about me, aren’t you, you cheeky rascal."]
    :-> [:field :date-3 :option 0]]

   [:field :date-3 :option 0]
   [:miranda/option
    "Symmetra" [[:junkrat :_scandalized2 (scoot -9)] [:symmetra :_flirty (scoot 0)]]
    "It is quite easy to make you blush, Jamie."
    "That was not a euphemism, Jamie."]

   [:field :date-3 :option 0 0]
   [:miranda/dialogue
    ["Junkrat" [[:junkrat :_terrifiedBlushLeftExtra (scoot -9)] [:symmetra :_sass (scoot 0)]] "That’s unfair! I wasn’t prepared!"]
    ["Symmetra" [[:junkrat :_ballSmileNod (scoot -9)] [:symmetra :_pointUp (scoot 0)]] "You should always be prepared for love and support."]
    ["Junkrat" [[:junkrat :_armsUpSmile (scoot -9)] [:symmetra :_sass (scoot 0)]] "For real?"]
    ["Symmetra" [[:junkrat :_ballSmile (scoot -9)] [:symmetra :_pointUp (scoot 0)]] "No. I’m not a true support. You should prepare for a powerfully structured defense that is off meta on most maps."]
    ["Junkrat" [[:junkrat :_wrist (scoot -9)] [:symmetra :_sass (scoot 0)]] "Is this another joke? Or is that a euphemism? I don’t have a dang clue."]
    ["Symmetra" [[:junkrat :_ballSmile (scoot -9)] [:symmetra :_flirty (scoot 0)]] "I leave it up to your interpretation."]
    :-> [:field :date-3 1]]

   [:field :date-3 :option 0 1]
   [:miranda/dialogue
    ["Junkrat" [[:junkrat :_ballEmbarassedBlush (scoot -9)] [:symmetra :_strainedSmile (scoot 0)]] "Oh. Uh! So sorry."]
    ["Symmetra" [[:junkrat :_ballSmileNod (scoot -9)] [:symmetra :_embarassed (scoot 0)]] "Don’t be. Of course I like you too."]
    ["Junkrat" [[:junkrat :_shyblush (scoot -9)] [:symmetra :_strainedSmile (scoot 0)]] "Ehehehehe."]
    :-> [:field :date-3 1]]

   [:field :date-3 1]
   [:miranda/dialogue
    ["Junkrat" [[:junkrat :_teacupOffer (scoot -9)] [:symmetra :_smile (scoot 0)]] "Here, have some proper billy tea."]
    ["Junkrat"  [[:junkrat :_teacupExplain (scoot -9)] [:symmetra :_teacupDrink (scoot 0)]] "How is it?"]
    :-> [:field :date-3 :option 1]]

   [:field :date-3 :option 1]
   [:miranda/option
    "Symmetra" [[:junkrat :_teacupHold (scoot -9)] [:symmetra :_teacupHold (scoot 0)]]
    "Go for the kiss."
    "Flirt."]

   [:field :date-3 :option 1 0]
   [:miranda/dialogue
    ["Symmetra" [[:junkrat :_teacupOh (scoot -9)] [:symmetra :_teacupThinking (scoot 0)]] "Hm..."]
    ["Junkrat" [[:junkrat :_teacupNervous (scoot -9)] [:symmetra :_teacupSmile (scoot 0 -8 2)]] "Oy, you said no sugar, right?"]
    ["Symmetra" [[:junkrat :_teacupOh (scoot -9)] [:symmetra :_teacupSass (scoot -8 -16 2)]] "No sugar for the tea but I would like something sweet"]
    ["Junkrat" [[:junkrat :_teacupFibbinSad (scoot -9)] [:symmetra :_teacupSass (scoot -16 -24 2)]] "I knew we should have packed some honey. Or agave…"]
    ["Junkrat" [[:junkrat :_teacupScandalized (scoot -9)] [:symmetra :_teacupSass (scoot -24 -32 2)]] "Wait, what’s this staring?"]
    ["Symmetra" [[:junkrat :_smooch (scoot -9)]] "…"]
    ["Junkrat" [[:junkrat :_teacupAdoringBlush (scoot -9)] [:symmetra :_teacupSass (scoot -32 0 3)]] "…"]
    :-> [:field :date-3 2]]

   [:field :date-3 :option 1 1]
   [:miranda/dialogue
    ["Symmetra" [[:junkrat :_teacupHold (scoot -9)] [:symmetra :_teacupSass (scoot 0)]] "Perfect. What a sweet boy. Mako’s right about you, you know."]
    ["Junkrat" [[:junkrat :_teacupShyBlush (scoot -9)] [:symmetra :_teacupSass (scoot 0)]] "Hehe, I try."]
    ["Symmetra" [[:junkrat :_teacupOh (scoot -9)] [:symmetra :_teacupDrink (scoot 0)]] "Keep this up and you might get those head scratches after all."]
    ["Junkrat" [[:junkrat :_teacupAdoringBlush (scoot -9)] [:symmetra :_teacupSmile (scoot 0)]] "Yes’m! I’ll keep working hard at being a good boy."]
    :-> [:field :date-3 2]]

   [:field :date-3 2]
   [:miranda/dialogue
    ["Junkrat" [[:junkrat :_teacupShyBlush (scoot -9)] [:symmetra :_teacupSmile (scoot 0)]] "I’m glad you came out here with us. I know a place can’t really be a gift, but if I was gonna give you something it would be time here, as a thank you for putting up with all of my nonsense."]
    ["Symmetra" [[:junkrat :_teacupHold (scoot -9)] [:symmetra :_teacupDrink (scoot 0)]] "What do you mean?"]
    ["Junkrat" [[:junkrat :_teacupExplain (scoot -9)] [:symmetra :_teacupSmile (scoot 0)]] "Well, you helped me out in King’s Row. It was one silly little problem but I was damn near having a mini panic attack over needing that shim."]
    ["Symmetra" [[:junkrat :_teacupHold (scoot -9)] [:symmetra :_teacupConcerned (scoot 0)]] "I didn’t realize. I’m so sorry..."]
    ["Junkrat" [[:junkrat :_teacupFibbinSad (scoot -9)] [:symmetra :_teacupHold (scoot 0)]] "And Lucio and D.Va are right good mates, but they’re so intense with the streaming and performing, I feel like I gotta be on all the time around them... Knowing you’d show up made it feel safer. Took a lot of the pressure off."]
    ["Junkrat" [[:junkrat :_teacupExplainConcerned (scoot -9)] [:symmetra :_teacupHold (scoot 0)]] "And even today, leaving everyone in the lurch, I thought I could take it, but I just had to get out of there. And you helped me do that too."]
    ["Symmetra" [[:junkrat :_teacupSadSmile (scoot -9)] [:symmetra :_teacupLookDown (scoot 0)]] "You don’t need to thank me, Jamie. And it isn’t nonsense. This job is stressful."]
    ["Symmetra" [[:junkrat :_teacupSadSmile (scoot -9)] [:symmetra :_teacupDrink (scoot 0)]] "I’m glad my being here has helped you. I think I’ve also found it comforting to have someone else who’s as stressed out by people as I am to commiserate with."]
    ["Junkrat" [[:junkrat :_teacupDrink (scoot -9)] [:symmetra :_teacupSadSmile (scoot 0)]] "Yeah, I guess it’s some of that…. What’s that word Roadie’s always using."]
    ["Symmetra" [[:junkrat :_teacupHold (scoot -9)] [:symmetra :_teacupExplain (scoot 0)]] "Serendipity."]
    ["Junkrat" [[:junkrat :_teacupOh (scoot -9)] [:symmetra :_teacupSmile (scoot 0)]] "Yeah. Some of that. Might be chance, but at least it’s a chance you can make something new out of."]
    ["Symmetra" [[:junkrat :_teacupSadSmile (scoot -9)] [:symmetra :_teacupLookDown (scoot 0)]] "I was not pleased when I was first assigned as Vishkar’s representative to Overwatch but my time here has given me some new perspective in ways I did not expect. As our time here draws to a close I am starting worry about going home."]
    ["Junkrat" [[:junkrat :_teacupDrink (scoot -9)] [:symmetra :_teacupSadSmile (scoot 0)]] "Yeah, nothing like going somewhere new to make you think hard about where you’ve been."]
    ["Symmetra" [[:junkrat :_teacupSadSmile (scoot -9)] [:symmetra :_teacupLookBack (scoot 0)]] "I do miss home, the comfort and familiarity of my routine there. I had no interest in leaving and being here is much more exhausting. But getting some distance from my work there has allowed me space to think about it."]
    ["Junkrat" [[:junkrat :_teacupHeadHand (scoot -9)] [:symmetra :_teacupHold (scoot 0)]] "Distance is important. I never really wanted to leave Junkertown but getting thrown out was probably the best thing that ever happened to me."]
    ["Symmetra" [[:junkrat :_teacupDrink (scoot -9)] [:symmetra :_teacupConcerned (scoot 0)]] "Oh, I’m sorry. I had no idea that had happened to you. Is that why you had such a hard time today?"]
    ["Junkrat" [[:junkrat :_teacupLookDownTalk (scoot -9)] [:symmetra :_teacupHold (scoot 0)]] "Coming back today made me feel all nostalgic. And sad. And homesick. But, I also think was the first time I really felt like I could look at the place from the outside. Living here really messed me up."]
    ["Junkrat" [[:junkrat :_teacupExplainConcerned (scoot -9)] [:symmetra :_teacupHold (scoot 0)]] "It’s complicated, right? In some ways I’m proud of being from here. It taught me to tinker, to work with my hands and fend for myself. But all that stuff was a survival mechanism, and the other survival mechanisms I picked up...well, they turned me into someone I didn’t wanna be."]
    ["Symmetra" [[:junkrat :_teacupDrink (scoot -9)] [:symmetra :_teacupConcerned (scoot 0)]] "I don’t think you’re a bad person, Jamie."]
    ["Junkrat" [[:junkrat :_teacupHeadHand (scoot -9)] [:symmetra :_teacupHold (scoot 0)]] "I’m trying my best, darl but I’ve done a lot of bad things. I spent the whole year after we were kicked out being nothing but petty, spending all my time trying to go through with this harebrained scheme to get revenge on the queen for giving us the boot."]
    ["Symmetra" [[:junkrat :_teacupSadSmile (scoot -9)] [:symmetra :_teacupExplainUncomfortable (scoot 0)]] "I mean, there are worse--"]
    ["Junkrat" [[:junkrat :_teacupOh (scoot -9)] [:symmetra :_teacupHold (scoot 0)]] "It’s ok. You don’t have to try and make me feel better about myself. I know I’m still a work in progress."]
    ["Junkrat" [[:junkrat :_teacupDrink (scoot -9)] [:symmetra :_teacupSadSmile (scoot 0)]] "I’m still learning to tinker with my own insides, how to break things down and build them back up. It’s an ongoing process. Nothing stays fixed for good, but I feel better working on things piece by piece instead of takin’ or leaving  the whole gadget."]
    ["Symmetra" [[:junkrat :_teacupSadSmile (scoot -9)] [:symmetra :_teacupLookDown (scoot 0)]] "I admire how frankly you can speak about these things. Regrettably, I do not think any support I could offer would be of much use to you."]
    ["Junkrat" [[:junkrat :_teacupOh (scoot -9)] [:symmetra :_teacupSadSmile (scoot 0)]] "It’s ok! And I didn’t mean to talk so much about myself. Once I start going I never know when to shut up. Even if you don’t feel like you’ve got anything to say just having someone to listen is nice."]
    ["Junkrat" [[:junkrat :_teacupExplainConcerned (scoot -9)] [:symmetra :_teacupSadSmile (scoot 0)]] "But me and my big mouth aside, we started talkin’ about this cause you said you were worried about going home to Vishkar right? I’m sure they’re right good people, I don’t think they’d send such a hard working employee to do outside work if there wasn’t a good reason."]
    ["Symmetra" [[:junkrat :_teacupSadSmile (scoot -9)] [:symmetra :_teacupLookDown (scoot 0)]] "I… Vishkar has been everything to me. But I’ve been having my doubts, lately."]
    ["Junkrat" [[:junkrat :_teacupDrink (scoot -9)] [:symmetra :_teacupThinkingSad (scoot 0)]] "How so, love?"]
    ["Symmetra" [[:junkrat :_teacupSadSmile (scoot -9)] [:symmetra :_teacupConcerned (scoot 0)]] "It’s like you said, just because something needs a fix or two, it does not mean we ought to demolish it and replace the thing entirely."]
    ["Symmetra" [[:junkrat :_teacupSadSmile (scoot -9)] [:symmetra :_teacupLookBack (scoot 0)]] "But I’ve started to wonder if Vishkar, and their work…"]
    ["Symmetra" [[:junkrat :_teacupSadSmile (scoot -9)] [:symmetra :_teacupLookDown (scoot 0)]] "I wonder if I’ve been treating people as disposable."]
    ["Junkrat" [[:junkrat :_teacupLookDown (scoot -9)] [:symmetra :_teacupSadSmile (scoot 0)]] "…"]
    ["Symmetra" [[:junkrat :_teacupLookDown (scoot -9)] [:symmetra :_teacupLookDown (scoot 0)]] "Vishkar’s emphasis on order and structure always made sense to me. I was a bright young girl when I started there, always receiving praise for my accomplishments. It was easy to fall into a comfortable rhythm and not think to hard about what I was doing."]
    ["Symmetra" [[:junkrat :_teacupLookDown (scoot -9)] [:symmetra :_teacupLookBack (scoot 0)]] " I never questioned my moral implications of my actions because I assumed someone up above me had already done the thinking for me. I was always told Vishkar was making the world a better place. And it wasn’t until recently that I started to realize that that might not be true."]
    ["Junkrat" [[:junkrat :_teacupHeadHand (scoot -9)] [:symmetra :_teacupSadSmile (scoot 0)]] "I feel you. Realizing the water you've been swimming in is full of garbage is a tough pill to swallow. "]
    ["Junkrat" [[:junkrat :_teacupOh (scoot -9)] [:symmetra :_teacupDrink (scoot 0)]] "Err, I’m getting my metaphors all mixed up. But you get what I mean."]
    ["Symmetra" [[:junkrat :_teacupOh (scoot -9)] [:symmetra :_teacupExplainUncomfortable (scoot 0)]] "Yes I think we understand each other."]
    ["Junkrat" [[:junkrat :_teacupExplain (scoot -9)] [:symmetra :_teacupHold (scoot 0)]] "You found something rotten in the state of Vishkar and they sent you here afraid you were gonna call the clean up crew to get rid of that smell."]
    ["Symmetra" [[:junkrat :_teacupSadSmile (scoot -9)] [:symmetra :_teacupThinkingSad (scoot 0)]] " An interesting hypothesis, but one I have not managed to prove conclusively. Regardless, I no longer feel like I can trust my superiors nor do I think they trust me."]
    ["Junkrat" [[:junkrat :_teacupDrink (scoot -9)] [:symmetra :_teacupSadSmile (scoot 0)]] "Buncha wankers!"]
    ["Symmetra" [[:junkrat :_teacupSadSmile (scoot -9)] [:symmetra :_teacupLookDown (scoot 0)]] "It’s okay. My time here has allowed me to experiment with a new way of being. I just do not know if I could resume living my life the way I used to if I were recalled to Utopea. All of that this uncertainty is very frightening to me."]
    ["Junkrat" [[:junkrat :_teacupHeadTiltTalk (scoot -9)] [:symmetra :_teacupSadSmile (scoot 0)]] "Sometimes it’s ok to just take things one day at a time."]
    ["Symmetra" [[:junkrat :_teacupLookDown (scoot -9)] [:symmetra :_teacupSadSmile (scoot 0)]] "..."]
    ["Junkrat" [[:junkrat :_teacupHeadTiltTalk (scoot -9)] [:symmetra :_teacupSadSmile (scoot 0)]] " Satya?"]
    ["Symmetra" [[:junkrat :_teacupHeadTilt (scoot -9)] [:symmetra :_teacupLookDown (scoot 0)]] "Is it okay if we talk about something else? I opened up because I wanted to reciprocate your candidness, but it is difficult for me to talk about these sorts of things at length."]
    ["Junkrat" [[:junkrat :_teacupSadSmile (scoot -9)] [:symmetra :_teacupSadSmile (scoot 0)]] " Sure thing, love."]
    ["Symmetra" [[:junkrat :_teacupSadSmile (scoot -9)] [:symmetra :_teacupLookBack (scoot 0)]] "But I am glad that we can talk. I would like to continue our conversation at some point in the future, but--"]
    ["Symmetra" [[:junkrat :_teacupSadSmile (scoot -9)] [:symmetra :_teacupLookDown (scoot 0)]] " I just… I have lot of difficulty verbalizing my thoughts when I am emotional if I have not had adequate time to prepare and think."]
    ["Junkrat" [[:junkrat :_teacupOh (scoot -9)] [:symmetra :_teacupSadSmile (scoot 0)]] "No worries, darl. I’m here for whatever you need."]
    ["Junkrat" [[:junkrat :_chocoOffer (scoot -9)] [:symmetra :_teacupSadSmile (scoot 0)]] "Chockie-bickie?"]
    ["Symmetra" [[:junkrat :_chocoEat (scoot -9)] [:symmetra :_chocoChew (scoot 0)]] "This is quite good too!"]
    ["Junkrat" [[:junkrat :_chocoExplain (scoot -9)] [:symmetra :_chocoChew (scoot 0)]] "Yeah Roadie’s really been baking up a storm since we got back."]
    ["Symmetra" [[:junkrat :_ballSmile (scoot -9)] [:symmetra :_helloWarm (scoot 0)]] "Speaking of Mako, there he is now."]
    ["Roadhog" [[:junkrat :_ballSmile (scoot -9 6 2)] [:roadhog :_wave (scoot -80 -22 2)] [:symmetra :_smile (scoot 0 8 2)]] "Hello, friends. Nap well?"]
    ["Junkrat" [[:junkrat :_shyblush (scoot 6)] [:roadhog :_neutral (scoot -22)] [:symmetra :_smile (scoot 8)]] "Ehehehehe."]
    ["Roadhog" [[:junkrat :_shyblush (scoot 6)] [:roadhog :_drink (scoot -22)] [:symmetra :_smile (scoot 8)]] "Good. Thanks for taking care of my sweet boy."]
    ["Symmetra" [[:junkrat :_ballAdoringBlushDown (scoot 6)] [:roadhog :_neutral (scoot -22)] [:symmetra :_strainedSmile (scoot 8)]] "My pleasure. I’ve had a great time."]
    ["Roadhog" [[:junkrat :_ballSmile (scoot 6)] [:roadhog :_neutral2 (scoot -22)] [:symmetra :_smile (scoot 8)]] "Wonderful. But it’s getting dark. We should go."]
    ["Junkrat" [[:junkrat :_ballBack (scoot 6)] [:roadhog :_neutral (scoot -22)] [:symmetra :_smile (scoot 8)]] "Right. Right. Busted headlights. Low visibility and all that. Just, uh..."]
    ["Junkrat" [[:junkrat :_phonePhoto (scoot 6)] [:roadhog :_neutral (scoot -22)] [:symmetra :_smile (scoot 8)]] "Here, gather around."]
    :-> [:field :date-3 3]]

    [:field :date-3 3]
    [:miranda/characters
     [[[:photos :_junkratDate3Junk] [:phones :_junkratHand]]]
     :-> [:field :date-3 4]]

   [:field :date-3 4]
    [:miranda/narration
    "Refreshed from your excursion into nature you pile back onto the motorcycle to begin your journey back to Junkertown. As the sun fades from the sky, the lights in the shanty town spread out before you slowly begin to flicker on."
       :-> [:junkrat-c]]

   [:junkrat-c]
   [:miranda/characters
    [[]]
    :-> [:junkrat-c :text]]

   [:junkrat-c :text]
   [:miranda/narration
    "Once you arrive back in town, Junkrat invites you to stay and join them in a TV marathon slumber party, to which you agree. Roadhog sets up the projector and makes some kettle corn, while Junkrat shows you his collection of in progress projects and sketched out plans he has stashed around the warehouse. After deciding on The Great Australian Bake-Off, you snuggle in to enjoy the show, finally indulging Junkrat in his long standing request for head rubs."
    :=> [:gibralter [:spawn :intro] 0]]})
