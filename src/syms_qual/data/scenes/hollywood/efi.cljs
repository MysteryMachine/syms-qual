(ns syms-qual.data.scenes.hollywood.efi
  (:require [carmen.util :as anim :refer [scoot]]
            [syms-qual.util :as util :refer [inc-transition]]))

(def data
  {[:spawn :efi 0]
   [:miranda/dialogue
    ["Symmetra" [[:orisa :_neutral (scoot -85 0 1)] [:lucio :_jammin (scoot -90 -5 1)]
                 [:efi :_neutral (scoot -70 15 1)] [:symmetra :_helloNeutral (scoot 92 7 1)]]
     "Hello."]
    ["Lucio" [[:orisa :_neutral]  [:symmetra :_neutral (scoot 7)]
              [:efi :_neutral (scoot 15)] [:lucio :_point (scoot -5)]]
     "Hey, why the long face? The game isn’t over yet! We got this."]
    ["Efi" [[:orisa :_neutral] [:lucio :_neutral (scoot -5)]
            [:efi :_wave (scoot 15)] [:symmetra :_sadSmile (scoot 7)]]
     "Hello miss! I like your outfit a lot!"]
    ["Symmetra" [[:orisa :_neutral] [:lucio :_neutral (scoot -5)]
                 [:efi :_neutral (scoot 15)] [:symmetra :_explainSad (scoot 7)]]
     "Why, thank you! I appreciate your kind sentiments, but feel that the blame for our poor performance last round falls squarely on my shoulders."]
    ["Orisa" [[:orisa :_pointUp] [:lucio :_neutral (scoot -5)]
              [:efi :_neutral (scoot 15)] [:symmetra :_sadSmile (scoot 7)]]
     "Don’t be so hard on yourself! Without your teleporter we would not have lasted as long as we did! Your actions were an essential part of what limited success we had!"]
    ["Symmetra" [[:orisa :_neutral] [:lucio :_neutral (scoot -5)]
                 [:efi :_neutral (scoot 15)] [:symmetra :_explainUncomfortable (scoot 7)]]
     "You flattery is not deserved, but I will make every effort to be worthy of your praise going forward. We must come up with a solid strategy for the next round."]
    ["Lucio" [[:orisa :_neutralHappy] [:lucio :_explainForward (scoot -5)]
              [:efi :_neutral (scoot 15)] [:symmetra :_neutral (scoot 7)]]
     "So I was thinking. The teleporter’s greatest weakness is that it needs to be placed away from the action, right? But if there was a way to protect it and have it close by that would be the best of both worlds! We should definitely strap that thing to Orisa here!"]
    ["Efi" [[:orisa :_neutralHappy] [:lucio :_neutral (scoot -5)]
            [:efi :_pointUp (scoot 15)] [:symmetra :_neutral (scoot 7)]]
     "A mobile teleportation unit? That sounds wonderful! But risky."]
    ["Lucio" [[:orisa :_neutralHappy] [:lucio :_jammin (scoot -5)]
              [:efi :_neutral (scoot 15)] [:symmetra :_neutral (scoot 7)]]
     "How is it risky? We just need to focus on keeping Orisa grooving."]
    ["Efi" [[:orisa :_neutralHappy] [:lucio :_neutral (scoot -5)]
            [:efi :_smug (scoot 15)] [:symmetra :_neutral (scoot 7)]]
     "Lucio, you’re my dear, sweet, handsome, shining star, but do you remember what happened last time you suggested a modification to Orisa?"]
    ["Lucio" [[:orisa :_neutral] [:lucio :_lament (scoot -5)]
              [:efi :_neutral (scoot 15)] [:symmetra :_awkward (scoot 7)]]
     "Look, strapping roller skates to Orisa didn’t work because her software just couldn’t take it. Blame the programmer, not the beautiful battle DJ."]
    ["Efi" [[:orisa :_neutral] [:lucio :_neutral (scoot -5)]
            [:efi :_armsUpStressed (scoot 15)] [:symmetra :_awkward (scoot 7)]]
     "The physics of four legged wall grinding are impossible."]
    ["Lucio" [[:orisa :_neutral] [:lucio :_smug (scoot -5)]
              [:efi :_neutral (scoot 15)] [:symmetra :_awkward (scoot 7)]]
     "They said that about my two legged wall grinding. I even wrote a song about it! It's a little known B-track only the REAL Lucio fans know."]
    ["Efi" [[:orisa :_neutral] [:lucio :_neutral (scoot -5)]
            [:efi :_pointUpEyesClosed (scoot 15)] [:symmetra :_awkward (scoot 7)]]
     "Yes, but you’re a pop star. People don’t question when you casually break the laws of physics."]
    ["Lucio" [[:orisa :_neutralHappy] [:lucio :_smile (scoot -5)]
              [:efi :_neutral (scoot 15)] [:symmetra :_awkward (scoot 7)]]
     "You? You are not wrong!"]
    ["Symmetra" [[:orisa :_neutral] [:lucio :_neutral (scoot -5)]
                 [:efi :_neutral (scoot 15)] [:symmetra :_confused (scoot 7)]]
     "What are you two even going on about?"]
    ["Efi" [[:orisa :_neutral] [:lucio :_neutral (scoot -5)]
            [:symmetra :_neutral (scoot 7)] [:efi :_explain (scoot 15)]]
     "Don’t mind us, Miss Vaswani, Lucio and I just like teasing. I actually think this plan is solid."]
    ["Lucio" [[:orisa :_neutralHappy] [:lucio :_jammin (scoot -5)]
              [:efi :_neutral (scoot 15)] [:symmetra :_neutral (scoot 7)]]
     "Dang right! Tactics are my jam."]
    ["Efi" [[:orisa :_neutralHappy] [:lucio :_jammin (scoot -5)]
            [:efi :_smug (scoot 15)] [:symmetra :_neutral (scoot 7)]]
     "Oh, Lucio…"]
    ["Efi" [[:orisa :_neutralHappy] [:lucio :_neutral (scoot -5)]
            [:symmetra :_neutral (scoot 7)] [:efi :_explain (scoot 15)]]
     "Miss Vaswani, you know your technology best. If you decide to give this plan a go, let me know a minute or two beforehand so I can make the changes that I need."]
    :-> [:spawn :efi :choice]]

   [:spawn :efi :choice]
   [:miranda/text-option
    "What will you do?"
    ["Agree to Efi and Lucio’s plan" (constantly true)
     [:-> [:spawn :efi :yes]]]
    ["Converse with your other teammates" (constantly true)
     [:-> [:spawn :efi :no]]]]

   [:spawn :efi :yes]
   [:miranda/dialogue
    ["Efi" [[:orisa :_neutral] [:lucio :_neutral (scoot -5)]
            [:efi :_armsUpExcited (scoot 15)] [:symmetra :_neutral (scoot 7)]]
     "Alright! A last minute engineering challenge! Exciting!"]
    :-> [:lucio]]

   [:spawn :efi :no]
   [:miranda/dialogue
    ["Lucio" [[:orisa :_neutral] [:lucio :_prayExplain (scoot -5)]
              [:efi :_smug (scoot 15)] [:symmetra :_neutral (scoot 7)]]
     "Remember, you miss ninety nine percent of the shots you don’t take."]
    ["Symmetra" [[:orisa :_neutralHappy] [:lucio :_prayExplainNeutral (scoot -5)]
                 [:efi :_smug (scoot 15)] [:symmetra :_explain (scoot 7)]]
     "Isn’t it one hundred?"]
    ["Lucio" [[:orisa :_neutralHappy] [:lucio :_prayExplainHappy (scoot -5)]
              [:efi :_smug (scoot 15)] [:symmetra :_neutral (scoot 7)]]
     "Sometimes a ball just accidentally bounces into the net. But you should still take this shot. Get back to us!"]
    :-> [:spawn :choice]]

   [:lucio]
   [:miranda/characters
    [[]]
    :-> [:lucio :text]]

   [:lucio :text]
   [:miranda/narration
    "While the mobile teleporter seemed like a good idea in principle, in practice it achieved only mixed results. It worked brilliantly on the first objective, allowing Orisa to flank around the back of the point and safely teleport in the rest of your team for a surprise attack from behind."
    "However, by the time your team began to actually push the payload, the defenders had figured out your strategy and made targeting Orisa and your attached teleporter their top priority, forcing you to abandon the tactic. Having invested too much energy into this single idea, your team could not adapt well enough to finalize the push and you were stopped short of your goal. "
    :=> [:lijiang [:spawn :intro] 0]]})
