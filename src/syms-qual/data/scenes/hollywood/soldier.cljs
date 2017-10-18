(ns syms-qual.data.scenes.hollywood.soldier)

(def start-date
  [:transition :miranda/mutation->basic
   [[:-> [:anubis :pharah :confirm]]
    (fn []
      ;;TODO: mutate state to indicate date
      )]])

(def data
  {[:hollywood :soldier 0]
   [:miranda/dialogue
    ["Soldier76" [] "I can’t believe Gabe and I ended up on the same team! This never happens. It feels so unnatural."]
    ["Symmetra" [] "I’m sure you’ll be able to find a way to overcome your differences for the sake of the team."]
    ["Soldier76" [] "I don’t play by the rules anymore. My objective is now singular. Hookie."]
    ["Symmetra" [] "What?"]
    ["Soldier76" [] "Gabe always gave me crap for dragging him to all the tourist attractions whenever I came to visit him but now I can tank his win ratio and avoid having to listen to his incessant whining. "]
    ["Symmetra" [] "I thought you two had some weird “give it your violent best” pact going on.  "]
    ["Soldier76" [] "Don’t mock my love, soldier. It’s fiery, hot, mysterious, and not our concern right now. I’m recruiting you. You’ve been drafted to ride the TMZ hover bus with me."]
    ["Symmetra" [] "I don’t--"]
    ["Soldier76" [] "We rendezvous by the Hollywood sign!"]
    ["Symmetra" [] "Uh--"]
    ["Soldier76" [] "And go to Ripley’s Believe It or Not! A quality, American, educational experience. "]
    ["Reaper" [] "This guy running his mouth about all that tourist crap again?"]
    ["Symmetra" [] "Well--"]
    ["Reaper" [] "Vacationing in LA is bullshit! I hate all people and they should get the hell out of my city. You wanna go on a real vacation you go to Indiana."]
    ["Symmetra" [] "Where?"]
    ["Reaper" [] "Their corn is not a fucking joke. Those were the freshest tortillas I’ve ever made in my LIFE. I slaughtered Jack’s mother’s garden, and made a pico de gallo so good, that I almost gave up my life of violence against people, to turn my wrath exclusively against plant based life forms. I invited Lucio to the next trip. He promises me that Brazilian cuisine has new and exciting ways to put corn on American staples."]
    ["Lucio" [] "I will make you the best vegan X-Tudo you’ve ever had in your LIFE."]
    ["Sombra" [] "It’s not a X-Tudo without meat, Lucio. The word “tudo” means everything, and you can’t say it has everything if it doesn’t have meat."]
    ["Lucio" [] "Look, the tudo refers to food, and animals are not food, they are friends."]
    ["Efi" [] "It’s true! Lucio’s vegan X-Tudo is everything one would need in a meal, as advertised."]
    ["Reaper" [] "Between you and me, I’m only in it for putting corn on pizza. "]
    ["Symmetra" [] "Could you not do that yourself?"]
    ["Reaper" [] "And ruin the authenticity? No thank you."]
    ["Symmetra" [] "It’s not like there is any finesse involved with adding corn to a pizza."]
    ["Reaper" [] "Look. Once, while on the crapper, I grabbed a cooking magazine Genji left on the stand and then attempted to make a Japanese pizza with corn and mayo. Let’s just say those are dark times I’ve put behind me."]
    ["Symmetra" [] "You are a strange and confusing man."]
    ["Reaper" [] "With wonderful vacation photos. Dear unholy gods, I love my vacation photos. Here. Tell me you’ve not had a corn based revelation."]
    :-> [:hollywood :soldier :cutscene 0]]

   [:hollywood :soldier :cutscene 0]
   [:miranda/narration
    "Reaper shows you the Indiana photo"
    :-> [:hollywood :soldier :option 0]]

   [:hollywood :soldier :option 0]
   [:miranda/option
    "Symmetra" []
    "Um. I suppose I have?"
    "What is that object behind you?"]

   [:hollywood :soldier :option 0 0]
   [:miranda/dialogue
    ["Reaper" [] "I’m glad you’ve come to see things my way. The right way. I’ll invite you instead of Widowmaker to our next trip. Her palette had her eyeing the snails on the ground with more gusto than the big, ripe, American corn growing to the heavens."]
    :-> [:holywood :soldier 1]]

   [:hollywood :soldier :option 0 1]
   [:miranda/dialogue
    ["Reaper" [] "Oh, well, we made Widow take the photo, but she wanted to be in it too and we tried to have her do it as a selfie but she’s really bad at it and it didn’t work so we decided to compromise and just stick her rifle in the corn so it’d be like she was in the picture, even though she wasn’t really in the picture."]
    :-> [:holywood :soldier 1]]

   [:hollywood :soldier 1]
   [:miranda/dialogue
    ["Symmetra" [] "That’s actually quite insulting."]
    ["Reaper" [] "The woman has no feelings. You can’t hurt something that does not exist, Symmetra. Rule number one of combat."]
    ["Reaper" [] "Oh, wait, I’m getting a message."]
    ["Reaper" [] "It’s just a shitty photoshop of Widowmaker flipping off corn?"]
    ["Sombra" [] " I’m so glad I installed Photoshop on my work gloves."]
    ["Soldier76" [] "Alright, alright. It’s time for everyone to disperse, you’re crowding my recruit and I."]
    ["Reaper" [] "If you let that man take a picture of you in front the Beverly Hills sign you are dead to me!"]
    ["Reaper" [] "Fuck you, Jack."]
    ["Soldier76" [] "Love you too, asshole."]
    ["Soldier76" [] "I’ll pay for your bus ticket if you come with me."]
    ["Symmetra" [] "I really don’t--"]
    ["Soldier76" [] "And I’ll buy you dinner at Benihanas."]
    :-> [:hollywood :soldier :choice]]

   [:hollywood :soldier :choice]
   [:miranda/text-option
    "What will you do?"
    ["Go with 76" (constantly true) start-date]
    ["Converse with your other teammates" (constantly true)
     [:hollywood :soldier :no]]]

   [:hollywood :soldier :yes]
   [:miranda/dialogue
    ["Symmetra" [] "I can’t say no to free really, really terrible food."]
    ["Soldier 76"  [] "Has anyone ever told you your attitude is very unamerican? Get a grip, soldier."]
    :-> [:hollywood :soldier :cutscene 1]]

   [:hollywood :soldier :no]
   [:miranda/dialogue
    ["Symmetra" [] "I really should be getting back to the rest of the team."]
    ["Soldier76" [] "The offer still stands. You’re the only person on this team I feel I can trick into going with me, so don’t go proving me wrong now."]
    :-> [:hollywood :choice]]

   [:hollywood :soldier :cutscene 1]
   [:miranda/narration
    "Despite Soldier’s promises to the contrary, the distance from spawn to the stop for the TMZ bus proved to be quite a formidable trek on foot. Upon arrival, you attempted board only to be turned away due to Morrison’s stubborn insistence on open-carrying his plasma rifle and rockets. Between the heat, the long walk and the loudly droning argument between Soldier and the bus driver, your mind began to wander, as you feverishly hoped that watching a man light your dinner on fire in front of you would ultimately make up for this thus far dismal experience.  As you contemplated the sequence of terrible decisions which had lead your life to this point, you were snapped back to reality by the roar of the departing, bus followed shortly by the loud buzzing of Soldier’s phone. It was a Snapchat ostensibly from Reaper, though Sombra seemed to be operating the camera judging by the prominent sound of her wild giggling. The shaky footage revealed both Reaper and Guy Fieri standing on top of the payload mooning the camera while simultaneously flipping it off and chanting in unison, “Fuck you Morrison!” After taking minute to compose himself, Soldier sadly informed you that without the bus you had no easy way of making it to Benihanas but offered to treat you to the nearby Panda Express Express instead. You firmly, but politely declined, and left without making eye contact."
    :-> [:lijang :intro]]})
