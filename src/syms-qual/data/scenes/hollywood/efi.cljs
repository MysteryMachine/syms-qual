(ns syms-qual.data.scenes.hollywood.efi)

(def start-date
  [:transition :miranda/mutation->basic
   [[:-> [:anubis :pharah :confirm]]
    (fn []
      ;;TODO: mutate state to indicate date
      )]])

(def data
  {[:hollywood :efi 0]
   [:miranda/dialogue
    ["Symmetra" [] "Hello!"]
    ["Lucio" [] "Hey, why the long face? The game isn’t over yet! We got this."]
    ["Efi" [] "Hello miss! I like your outfit a lot!"]
    ["Symmetra" [] "Why, thank you! I appreciate your kind sentiments, but feel that the blame for our poor performance last round falls squarely on my shoulders."]
    ["Orisa" [] "Don’t be so hard on yourself! Without your teleporter we would not have lasted as long as we did! Your actions were an essential part of what limited success we had!"]
    ["Symmetra" [] "You flattery is not deserved, but I will make every effort to be worthy of your praise going forward. We must come up with a solid strategy for the next round."]
    ["Lucio" [] "So I was thinking. The teleporter’s greatest weakness is that it needs to be placed away from the action, right? But if there was a way to protect it and have it close by that would be the best of both worlds! We should definitely strap that thing to Orisa here!"]
    ["Efi" [] "A mobile teleportation unit? That sounds wonderful! But risky."]
    ["Lucio" [] "How is it risky? We just need to focus on keeping Orisa grooving."]
    ["Efi" [] "Lucio, you’re my dear, sweet, handsome, shining star, but  do you remember what happened last time you suggested a modification to Orisa?"]
    ["Lucio" [] "Look, strapping roller skates to Orisa didn’t work because her software just couldn’t take it. Blame the programmer, not the beautiful battle DJ."]
    ["Efi" [] "The physics of four legged wall grinding are impossible."]
    ["Lucio" [] "They said that about my two legged wall grinding. I even wrote a song about it! It was a B-track though."]
    ["Efi" [] "Yes, but you’re a pop star. People don’t question when you casually break the laws of physics."]
    ["Lucio" [] "You? You are not wrong!"]
    ["Symmetra" [] "What are you two even going on about?"]
    ["Efi" [] "Don’t mind us, Miss Vaswani, Lucio and I just like teasing. I actually think this plan is solid."]
    ["Lucio" [] "Dang right! I’m a master tactician!"]
    ["Efi" [] " Oh, Lucio…"]
    ["Efi" [] "Miss Vaswani, you know your technology best. If you decide to give this plan a go, let me know a minute or two beforehand so I can make the changes that I need."]
    :-> [:hollywood :efi :choice]]

   [:hollywood :efi :choice]
   [:miranda/text-option
    "What will you do?"
    ["Agree to Efi and Lucio’s plan" (constantly true) start-date]
    ["Converse with your other teammates" (constantly true)
     [:hollywood :efi :no]]]

   [:hollywood :efi :yes]
   [:miranda/dialogue
    ["Efi" [] "Alright! A last minute engineering challenge! Exciting!"]
    :-> [:hollywood :efi :cutscene]]

   [:hollywood :efi :no]
   [:miranda/dialogue
    ["Lucio" [] "Remember, you miss ninety nine percent of the shots you don’t take."]
    ["Symmetra" [] "Isn’t it one hundred?"]
    ["Lucio" [] "Sometimes a ball just accidentally bounces into the net. But you should still take this shot. Get back to us!"]
    :-> [:hollywood :choice]]

   [:hollywood :efi :cutscene]
   [:miranda/narration
    "While the mobile teleporter seemed like a good idea in principle, in practice it achieved only mixed results. It worked brilliantly on the first objective, allowing Orisa to flank around the back of the point and safely teleport in the rest of your team for a surprise attack from behind. However, by the time your team began to actually push the payload, the defenders had figured out your strategy and made targeting Orisa and your attached teleporter their top priority, forcing you to abandon the tactic. Having invested too much energy into this single idea, your team could not adapt well enough to finalize the push and you were stopped short of your goal. "
    :-> [:lijang :intro]]})
