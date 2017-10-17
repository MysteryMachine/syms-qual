(ns syms-qual.data.scenes.kings-row.intro)

(def data
  {[:kings-row :intro]
   [:miranda/narration
    "You arrive nice and early, eager to perform your duties. Your team is on defense first and you are excited to to offset last week’s performance with a strong showing this week. You survey the first point of the map, trying to decide on the best location to set up your turrets, as the rest of your teammates arrive. They seem to have a variety of opinions on where best to set up. Torbjorn quickly gets to work placing his turret extremely far forward, just outside of the opponent’s spawn doors. Meanwhile, Bastion and Lucio sit nonchalantly on the high ground in the back corner of the objective. Finally, Roadhog and Junkrat are huddled over something, you can’t quite make out what, just inside the choke point. You had been considering all of these locations but hadn’t quite made up your mind which you liked best yet. You decide to consult with your teammates before picking which position to fortify."
    :-> [:kings-row :choice]]

   [:kings-row :choice]
   [:miranda/text-option
    "What will you do?"
    ["Talk to Torbjorn" (constantly true) [:kings-row :torb 0]]
    ["Talk to Junkrat and Roadhog" (constantly true) [:kings-row :junkrat 0]]
    ["Talk to Bastion and Lucio" (constantly true) [:kings-row :lucio 0]]]})
