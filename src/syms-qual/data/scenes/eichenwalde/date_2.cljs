(ns syms-qual.data.scenes.eichenwalde.date-2)

(def data
  {[:spawn :pharah 5]
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
    :-> [:spawn :pharah :cutscene 3]]

   [:spawn :pharah :cutscene 3]
   [:miranda/narration
    "You arrive at the currywurst place, and they do not seem to be happy to have two people in power armor patronizing their restaurant. The old floorboards creak audibly under the immense weight of your party and the manager seems quite concerned. A vengeful glare from Ana cuts short any commentary the waitstaff might have had and they resign themselves to their fates.  After some more bad puns, Reinhardt orders a currywurst and a pint for everyone."
    :-> [:spawn :pharah 6]]

   [:spawn :pharah 6]
   [:miranda/dialogue
    ["Ana" [] "Reinhardt, you did not even ask Satya if she drinks or not."]
    :-> [:spawn :pharah :option 3]]

   [:spawn :pharah :option 3]
   [:miranda/option
    "Symmetra" []
    "I will accept the drink, thank you."
    "No thank you, I do not drink."]

   [:spawn :pharah :option 3 0]
   [:miranda/dialogue
    ["Reinhardt" [] "Prost!"]
    ["Symmetra" [] "Prost, everyone."]
    :-> [:spawn :pharah 7]]

   [:spawn :pharah :option 3 1]
   [:miranda/dialogue
    ["Reinhardt" [] "See, here, Ana, you will learn of the brilliance of the Reinhardt system. You order a beer without asking, and if they say no, now you are a beer richer. Prost!"]
    :-> [:spawn :pharah 7]]

   [:spawn :pharah 7]
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

   [:spawn :pharah :date :cutscene 4]
   [:miranda/narration
    "You enjoy the rest of the evening, listen to Reinhardt’s old stories, and Pharah and Ana’s amusing interjections.  As the evening draws to a close, the four of you make your way outside to begin the trek back to your nearby hotel. Before you set out, Ana insists on breathalyzing Reinhardt despite that fact that he ultimately only had two beers. After examining, the results she passes the breathalyzer to Pharah, who shoots you a playful glance before stepping in to have her turn as well. She and Ana exchange a smile, and Ana applies the test. Pharah hands you the breathalyzer."
    :-> [:spawn :pharah :date 5]]

   [:spawn :pharah :date 5]
   [:miranda/dialogue
    ["Pharah" [] " Your turn!"]
    ["Symmetra" [] "You want me to blow into this thing?"]
    ["Pharah" [] " Something like that! Strike a pose!"]
    ["Symmetra" [] " As you wish."]
    ["Pharah" [] "Hehe. Get closer!"]
    ;Pharah snaps a selfie.
    ["Pharah" [] "What is your phone number?"]
    :-> [:spawn :pharah :cutscene :date :final]]

   [:spawn :pharah :cutscene :date :final]
   [:miranda/narration
    "Pharah walks you home. She nervously leaves you at the door, turning beet red at the last minute, freezing up. You wave her goodnight and blow a kiss. A few minutes after, a text message arrives on your phone; Pharah had sent you the breathalyzer selfie as memento.
"
    :-> [:junkertown :intro]]

   [:spawn :pharah :cutscene :not-date :final]
   [:miranda/narration
    "You enjoy the rest of the evening, listening to Reinhardt’s old stories and Pharah and Ana’s amusing interjections. As the evening draws to a close, the four of you make your way outside to begin the trek back to your nearby hotel. Before you set out, Ana insists on breathalyzing Reinhardt despite that fact that he ultimately only had two beers. Afterwards, she passes the breathalyzer to Pharah, requesting that she take the test as well. She and Ana exchange a smile, and Ana applies the test. Once she is satisfied with the results, you head back to the hotel listening to one last story from Reinhardt as you walk. "
    :-> [:junkertown :intro]]})
