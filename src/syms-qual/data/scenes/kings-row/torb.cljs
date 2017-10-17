(ns syms-qual.data.scenes.kings-row.torb)

(def start-date
  [:transition :miranda/mutation->basic
   [[:-> [:anubis :pharah :confirm]]
    (fn []
      ;;TODO: mutate state to indicate date
      )]])

(def data
  {[:kings-row :torb 0]
   [:miranda/dialogue
    ["Symmetra" [] "I see you’ve set up quite far forward. Do you think it is wise to be so aggressive on defense? Would it not be more prudent to create a cohesive front line with the rest of our teammates?"]
    ["Torbjorn" [] "Feck no. I’m not getting anywhere near there. I’d rather choke on my Cröönchy Stars. I’m not to pleased to have that damn tin can on our team and I’d like to stay as far away from them as possible."]
    ["Symmetra" [] "I see."]
    ["Torbjorn" [] "But I suppose I’m also kind of torn. I don’t like Omnics, but I do like turrets. I just can’t make up my mind which of those things is more important."]
    ["Symmetra" [] "Our team is quite adept at turret based combat."]
    ["Torbjorn" [] "Hehe, that we are. Though I don’t expect you or the bot will be able to keep up with my baby here. I bet you did not know that the sugar in cereal could be combusted to create power."]
    ["Symmetra" [] "I...I suppose not?"]
    ["Torbjorn" [] "The most important rule of engineering, don’t let anyone put junk in your machinery. I only power my machines with the finest breakfast cereals. Prepare to taste the literally sweet taste of defeat at the hands of my turret."]
    ["Symmetra" [] "Ha, don’t make me laugh. Hard light is the vastly superior technology.  Your steel and gunpowder is antiquated dirt. Neolithic, even."]
    ["Torbjorn" [] "You’re just gliding in on a shrimp sandwich with that instant hard light junk you make! Real craftsmanship takes time and effort! "]
    ["Symmetra" [] "I have spent countless hours designing this system! While you twiddle your thumbs babysitting your single precious turret, I can easily deploy 5 or 6 units while also shielding and transporting our team. You are no match for me."]
    ["Torbjorn" [] "Haha, I like an engineer with an ego, care to make a wager? Best eliminations wins the pot. You’re a hot shot, I’ll give you that, and your technology is cute, but it’s no match for experience. "]
    :-> [:kings-row :torb :choice]]

   [:kings-row :torb :choice]
   [:miranda/text-option
    "What will you do?"
    ["Accept Torbjorn’s challenge" (constantly true) start-date]
    ["Converse with your other teammates" (constantly true)
     [:kings-row :torb :no]]]

   [:kings-row :torb :yes]
   [:miranda/dialogue
    ["Symmetra" [] "I will destroy you."]
    :-> [:kings-row :torb :cutscene]]

   [:kings-row :torb :no]
   [:miranda/dialogue
    ["Symmetra" [] "It is beneath me to engage in this sophomoric contest. I must discuss strategy with our other teammates."]
    ["Torbjorn" [] "Heh, I knew you were all talk."]
    :-> [:kings-row :choice]]

   [:kings-row :torb :cutscene]
   [:miranda/narration
    "You easily crushed Torbjorn’s feeble attempt at friendly rivalry, scoring an elimination count three times greater than his, however your inability to work as a team cost you the match. With both of you chasing risky kills in an attempt to one up each other, your defensive line fell apart and your teammates were unable to pick up your slack. Once the payload started rolling things truly fell apart, as the stationary nature of your turret heavy composition made it difficult to adapt to a moving target, allowing the enemy team to easily push through all three points. Your mobility problems continued in the offensive round, and though you were able to capture the payload you were unable to complete the map. It turns out getting a good K/D in a team game is not the formula for victory."
    :-> [:hollywood :intro]]})
