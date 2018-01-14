(ns syms-qual.data.scenes.hollywood.intro)

(def data
  {[:spawn :intro]
   [:miranda/narration
    "Much to your embarrassment, you arrived late this morning. Several streets had been blocked off for a film shoot, and the ensuing traffic caused significant delays. Tragically, you arrived only minutes before the match was to begin, and had to rush to set up your turrets. Due to your poor turret placement, the opposing team captured the first point quickly. Despite this, you redeemed yourself with a well timed teleporter deployment, halting the attackers’ momentum. With the reinforcements you provided, your team managed to stall the progress of payload, driving the match well into overtime before it reached its ultimate conclusion. With the guilt of your late arrival weighing heavily upon your shoulders, you took the brief intermission between rounds as opportunity to catch up with your teammates."
    :-> [:hollywood :choice]]

   [:hollywood :choice]
   [:miranda/text-option
    "What will you do?"
    ["Talk to Efi, Orisa, and Lucio" (constantly true) [:hollywood :efi 0]]
    ["Talk to Sombra and Reaper" (constantly true) [:hollywood :sombra 0]]
    ["Talk to Soldier 76" (constantly true) [:hollywood :soldier 0]]]})
