(ns syms-qual.data.scenes.volskaya.sombra
  (:require [carmen.util :as anim :refer [scoot]]
            [syms-qual.util :as util :refer [inc-transition]]))

(def data
  {[:spawn :sombra 0]
   [:miranda/dialogue
    ["Sombra"
     [[:widowmaker :_neutral (scoot  80 22 1)]
      [:sombra :_explain (scoot -63 -5 1)]]
     "Look, all I’m saying is you should be um."]
    ["Sombra"
     [[:widowmaker :_neutral (scoot 22)]
      [:sombra :_browseTranslation (scoot -5)]]
     "Um wait."]
    ["Sombra"
     [[:widowmaker :_neutral (scoot 22)]
      [:sombra :_browseTranslationSmile (scoot -5)]]
     "Ah! Here! Fabricant de veuve!"]
    ["Widowmaker"
     [[:widowmaker :_despise (scoot 22)]
      [:sombra :_browseTranslationSmile (scoot -5)]]
     "I despise you."]
    ["Sombra"
     [[:widowmaker :_despise (scoot 22 3 1)]
      [:sombra :_wave (scoot -5 -15 1)]
      [:symmetra :_smile (scoot 80 5 1)]]
     "Satya! Come here."]
    ["Symmetra"
     [[:widowmaker :_neutral (scoot 3)]
      [:sombra :_neutral (scoot -15)]
      [:symmetra :_helloWarm (scoot 5)]]
     "Me? Oh. Hello."]
    ["Widowmaker"
     [[:widowmaker :_tch (scoot 3)]
      [:sombra :_neutral (scoot -15)]
      [:symmetra :_smile (scoot 5)]]
     "Tch."]
    ["Sombra"
     [[:widowmaker :_tch (scoot 3)]
      [:sombra :_explainHand (scoot -15)]
      [:symmetra :_smile (scoot 5)]]
     "I was just telling my friend she should French up her name."]
    ["Widowmaker"
     [[:symmetra :_smile (scoot 5)]
      [:widowmaker :_explain (scoot 3)]
      [:sombra :_neutral (scoot -15)]]
     "And I am telling her to sit on it."]
    ["Widowmaker"
     [[:widowmaker :_bird (scoot 3)]
      [:sombra :_laugh (scoot -15)]
      [:symmetra :_awkward (scoot 5)]]
     "And spin."]
    :-> [:spawn :sombra :option 0]]

   [:spawn :sombra :option 0]
   [:miranda/option
    "Symmetra"
    [[:widowmaker :_bird (scoot 3)]
     [:sombra :_neutral (scoot -15)]
     [:symmetra :_awkward (scoot 5)]]
    "What...?"
    "You should let Widowmaker call herself what she likes."]

   [:spawn :sombra :option 0 0]
   [:miranda/dialogue
    ["Widowmaker"
     [[:symmetra :_neutral (scoot 5)]
      [:widowmaker :_explainBack (scoot 3)]
      [:sombra :_shrug (scoot -15)]]
     "See. Go to hell, Sombra."]
    :-> [:spawn :sombra 1]]

   [:spawn :sombra :option 0 1]
   [:miranda/dialogue
    ["Widowmaker"
     [[:symmetra :_neutral (scoot 5)]
      [:widowmaker :_point (scoot 3)]
      [:sombra :_shrug (scoot -15)]]
     "Stay out of this. I don’t need you defending me from the likes of this..."]
    ["Widowmaker"
     [[:widowmaker :_despise (scoot 3)]
      [:sombra :_tongue (scoot -15)]
      [:symmetra :_neutral (scoot 5)]]
     "Degenerate."]
    ["Widowmaker"
     [[:symmetra :_neutral (scoot 5)]
      [:widowmaker :_explainBack (scoot 3)]
      [:sombra :_tongue (scoot -15)]]
     "But it does help my point. You are not funny."]
    :-> [:spawn :sombra 1]]

   [:spawn :sombra 1]
   [:miranda/dialogue
    ["Sombra"
     [[:widowmaker :_neutral (scoot 3)]
      [:sombra :_self (scoot -15)]
      [:symmetra :_neutral (scoot 5)]]
     "Excuse me, I am hilarious!"]
    ["Symmetra"
     [[:widowmaker :_neutral (scoot 3)]
      [:sombra :_neutral (scoot -15)]
      [:symmetra :_explain (scoot 5)]]
     "I do not comprehend why Widowmaker’s name should be in French just because she is French. We are in an international organization."]
    ["Sombra"
     [[:widowmaker :_neutral (scoot 3)]
      [:sombra :_shrug (scoot -15)]
      [:symmetra :_neutral (scoot 5)]]
     "Look, it’s not my fault her name sounds terrible in French. My name sounds GREAT in Spanish."]
    ["Widowmaker"
     [[:widowmaker :_despise (scoot 3)]
      [:sombra :_neutral (scoot -15)]
      [:symmetra :_neutral (scoot 5)]]
     "It IS Spanish."]
    ["Sombra"
     [[:widowmaker :_despise (scoot 3)]
      [:sombra :_explain (scoot -15)]
      [:symmetra :_neutral (scoot 5)]]
     "Exactly, hermana! You need to have some pride!"]
    ["Widowmaker"
     [[:widowmaker :_leave (scoot 3)]
      [:sombra :_neutral (scoot -15)]
      [:symmetra :_neutral (scoot 5)]]
     "I’m leaving."]
    ["Sombra"
     [[:widowmaker :_leave (scoot 3 80 1.5)]
      [:sombra :_tongue (scoot -15 -3 1.5)]
      [:symmetra :_neutral (scoot 5 0 1.5)]]
     "Fine!"]
    ["Sombra" [[:sombra :_flirty (scoot -3)] [:symmetra :_awkward (scoot 0)]]
     "It just means I can finally get my flirt on."]
    ["Symmetra" [[:sombra :_flirty (scoot -3)] [:symmetra :_coy (scoot 0)]]
     "Excuse me?"]
    ["Sombra" [[:sombra :_leanin (scoot -3)] [:symmetra :_coy (scoot 0)]]
     "With you! I uh, hope that I perform my flirting functions admirably and everything goes according to plan."]
    ["Symmetra" [[:sombra :_leanin (scoot -3)] [:symmetra :_frustratedConfused (scoot 0)]]
     "What?"]
    ["Sombra" [[:sombra :_flirty (scoot -3)] [:symmetra :_frustratedConfused (scoot 0)]]
     "I’m sure if you let me, I can perform my proper function as a cute girlfriend."]
    :-> [:spawn :sombra :option 1]]

   [:spawn :sombra :option 1]
   [:miranda/option
    "Symmetra" [[:sombra :_flirty (scoot -3)] [:symmetra :_neutral (scoot 0)]]
    "These jokes are not to my liking."
    "Are you mocking me?"]

   [:spawn :sombra :option 1 0]
   [:miranda/dialogue
    ["Sombra" [[:sombra :_leanin (scoot -3)] [:symmetra :_eyeRoll (scoot 0)]]
     "Well, am I at least going in the right direction?"]
    ["Symmetra" [[:sombra :_leanin (scoot -3)] [:symmetra :_explain (scoot 0)]]
     "Perhaps, but if you are intent on continuing, I insist your jokes be of a higher caliber."]
    ["Sombra" [[:sombra :_nostalgic (scoot -3)] [:symmetra :_neutral (scoot 0)]]
     "I mean, I’ve got a pretty great joke in mind for our next round, but it’s more of a, uh, physical comedy gag. And I’m going to need your help."]
    :-> [:spawn :sombra 2]]

   [:spawn :sombra :option 1 1]
   [:miranda/dialogue
    ["Sombra" [[:sombra :_surprised (scoot -3)] [:symmetra :_frown (scoot 0)]]
     "What? No!"]
    ["Sombra" [[:sombra :_explainHand (scoot -3)] [:symmetra :_frown (scoot 0)]]
     "Well, yes, but only in the most affectionate way possible. You’re so super serious, but I bet you have a soft spot for bad girls. I think we could have a lot of fun together if you’ll give me a shot."]
    :-> [:spawn :sombra 2]]

   [:spawn :sombra 2]
   [:miranda/dialogue
    ["Sombra" [[:sombra :_flirty (scoot -3)] [:symmetra :_neutral (scoot 0)]]
     "Come goof off with me for a little! I promise only the highest quality hijinks that will more than make up for my bad attempts at flirting."]
    ["Symmetra" [[:sombra :_neutral (scoot -3)] [:symmetra :_no (scoot 0)]]
     "Forget it. I am not aiding and abetting in whatever you’re thinking of."]
    ["Sombra" [[:sombra :_leanin (scoot -3)] [:symmetra :_neutral (scoot 0)]]
     "There’s something in it for you, if you do it."]
    ["Symmetra" [[:sombra :_neutral (scoot -3)] [:symmetra :_angry (scoot 0)]]
     "Oh? And what is that? Malware installed on my phone?"]
    ["Sombra" [[:sombra :_nostalgic (scoot -3)] [:symmetra :_frown (scoot 0)]]
     "I have most definitely NOT installed bitcoin miners in all your turrets, I promise."]
    ["Sombra" [[:sombra :_explainHand (scoot -3)] [:symmetra :_frown (scoot 0)]]
     "But no. See, this battleground offers me a unique advantage, one that I’m only willing to use if a certain vixen plays a harmless prank with me."]
    ["Symmetra" [[:sombra :_neutral (scoot -3)] [:symmetra :_explain (scoot 0)]]
     "I’m listening."]
    ["Sombra" [[:sombra :_wink (scoot -3)] [:symmetra :_neutral (scoot 0)]]
     "The prank will remain secret. The advantage I’ll bestow upon you is that I’ll use my, um, secret contacts within Spawn to hack one of the Svyatogors."]
    ["Sombra" [[:sombra :_shrug (scoot -3)] [:symmetra :_sass (scoot 0)]]
     "With a giant military robot to fight for us it should be an easy win no matter what happens."]
    :-> [:spawn :sombra :choice]]

   [:spawn :sombra :choice]
   [:miranda/text-option
    "What will you do?"
    ["Just go do a prank, bro" (constantly true)
     [:-> [:spawn :sombra :yes]]]
    ["Converse with your other teammates" (constantly true)
     [:-> [:spawn :sombra :no]]]]

   [:spawn :sombra :yes]
   (concat
    [:miranda/dialogue
     ["Symmetra" [[:sombra :_neutral (scoot -3)] [:symmetra :_explainUncomfortable (scoot 0)]]
      "Your plan sounds adequate. With such an advantage, I do not think we can lose. How wonderful to be allowed some time for whimsy."]
     ["Sombra" [[:sombra :_explain (scoot -3)] [:symmetra :_smile (scoot 0)]]
      "I knew you’d come around! "]
     ["Sombra" [[:sombra :_self (scoot -3)] [:symmetra :_awkward (scoot 0)]]
      "Thank you, charmingly good looks."]
     ["Symmetra" [[:sombra :_self (scoot -3)] [:symmetra :_no (scoot 0 20 2)]]
      "I’ve changed my mind, I’m going with the ice lesbians."]
     ["Sombra" [[:sombra :_dismayed (scoot -3)] [:symmetra :_no (scoot 20)]]
      "What? No, come back!"]
     ["Symmetra" [[:sombra :_dismayed (scoot -3)] [:symmetra :_laugh (scoot 20 0 1.5)]]
      "I’m joking, see, I can be fun."]
     ["Symmetra" [[:sombra :_neutral (scoot -3)] [:symmetra :_explainWTF (scoot 0)]]
      "But your plan better work,  I do not intend to lose this match."]
     ["Sombra" [[:sombra :_salute (scoot -3)] [:symmetra :_frown (scoot 0)]]
      "Aye aye, ma’am!"]
     ["Sombra" [[:sombra :_self (scoot -3)] [:symmetra :_eyeRoll (scoot 0)]]
      "Gosh, I love bossy girls."]]
    (inc-transition [:-> [:point-a-notp :cutscene]] :points/sombra :volskaya/sombra))

   [:spawn :sombra :no]
   [:miranda/dialogue
    ["Symmetra" [[:sombra :_neutral (scoot -3)] [:symmetra :_explainUncomfortable (scoot 0)]]
     "Possibly. Let me check in with our other teammates first."]
    :-> [:spawn :choice]]

   [:point-a-notp :cutscene]
   [:miranda/narration
    "True to her word, Sombra managed to hack one of the Svyatogors. Its offense was absolute, and you captured both points as quickly as it took for you to walk to them. As you began to set up for the defensive round, you noticed that Sombra had parked the robot inside the second point hangar, rather than on the first point with the rest of your team."
    "After some deliberation, you decided that it did not really matter if you held on the first or second point, and were just about to resume placing your turrets when you felt a strange tapping on your shoulder. You looked back, but there was no one to be found."
    :-> [:point-a-notp :sombra 3]]})
