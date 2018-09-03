(ns syms-qual.data.scenes.dorado.genji
  (:require [carmen.util :as anim :refer [scoot]]
            [syms-qual.util :as util :refer [inc-transition]]))

(def data
  {[:spawn :genji 0]
   [:miranda/dialogue
    ["Zenyatta" [[:genji :_neutral (scoot -80 18 1.5)] [:zenyatta :_pray (scoot -80 -18 1.5)] [:symmetra :_confused (scoot 80 6 1.5)]]
     "Genji, does it hurt?"]
    ["Genji" [[:genji :_stop (scoot 18)] [:zenyatta :_neutral (scoot -18)] [:symmetra :_awkward (scoot 6)]]
     "No, master, my ass does not hurt."]
    ["Zenyatta" [[:genji :_neutral (scoot 18)] [:zenyatta :_focus (scoot -18)] [:symmetra :_frustratedConfused (scoot 6)]]
     "Your ass, from when it fell down from heaven."]
    ["Symmetra" [[:genji :_neutral (scoot 18)] [:zenyatta :_neutral (scoot -18)] [:symmetra :_helloNeutral (scoot 6)]]
     "Hello, Genji."]
    ["Genji" [[:genji :_hello (scoot 18)] [:zenyatta :_neutral (scoot -18)] [:symmetra :_neutral (scoot 6)]]
     "Satya. Hello. I see you are spending quality time with my master."]
    ["Symmetra" [[:genji :_neutral (scoot 18)] [:zenyatta :_neutral (scoot -18)] [:symmetra :_skeptical (scoot 6)]]
     "The more quality time I spend with him, the harder I find it to believe that THIS is the Omnic master that taught you tranquility."]
    ["Genji" [[:genji :_pointUp (scoot 18)] [:zenyatta :_neutral (scoot -18)] [:symmetra :_confused (scoot 6)]]
     "Yes. He taught me to embrace the cyber."]
    ["Zenyatta" [[:genji :_neutral (scoot 18)] [:zenyatta :_explain (scoot -18)] [:symmetra :_confused (scoot 6)]]
     "Genji spent countless hours meditating upon the cyber. Now he has cybered a lot."]
    ["Genji" [[:symmetra :_confused (scoot 6)] [:genji :_explain (scoot 18)] [:zenyatta :_neutral (scoot -18)]]
     "Cybering has helped me learn to forgive myself."]
    ["Zenyatta" [[:genji :_neutral (scoot 18)] [:zenyatta :_explain (scoot -18)] [:symmetra :_confused (scoot 6)]]
     "It is good that Angela has allowed you to continue to cyber."]
    ["Genji" [[:genji :_hands2 (scoot 18)] [:zenyatta :_neutral (scoot -18)] [:symmetra :_confused (scoot 6)]]
     "Yes. Together, we cyber."]
    ["Zenyatta" [[:genji :_neutral (scoot 18)] [:zenyatta :_pointUp (scoot -18)] [:symmetra :_confused (scoot 6)]]
     "Remember, all forms of the cyber are good. Well punctuated cyber with good grammar is just as valid as bad shitpost cyber."]
    ["Symmetra" [[:genji :_neutral (scoot 18)] [:zenyatta :_neutral (scoot -18)] [:symmetra :_skeptical (scoot 6)]]
     "Are you two discussing…"]
    ["Zenyatta" [[:genji :_neutral (scoot 18)] [:zenyatta :_explain (scoot -18)] [:symmetra :_skeptical (scoot 6)]]
     "You do not wish to hear about the path to tranquility? If you do not wish to meditate upon the glory of the cyber, we can move on to a different topic of conversation."]
    ["Genji" [[:genji :_bow (scoot 18)] [:zenyatta :_neutral (scoot -18)] [:symmetra :_neutral (scoot 6)]]
     "My apologies, Satya. Zenyatta and I are quite intimate, I often forget that our manner of communicating with one another maybe be weird and difficult to comprehend for others."]
    ["Zenyatta" [[:genji :_neutral (scoot 18)] [:zenyatta :_pointUp (scoot -18)] [:symmetra :_WTF (scoot 6)]]
     "Genji has installed me into his system, much like a Bonzi buddy. I sing to him. I also steal his credit card information."]
    ["Genji" [[:genji :_pointUp (scoot 18)] [:zenyatta :_neutral (scoot -18)] [:symmetra :_WTF (scoot 6)]]
     "Master, perhaps you should consider the Iris for a second."]
    ["Zenyatta" [[:genji :_neutral (scoot 18)] [:zenyatta :_excited (scoot -18)] [:symmetra :_WTF (scoot 6)]]
     "An excellent suggestion."]
    ["Genji" [[:symmetra :_neutral (scoot 6)] [:genji :_explain (scoot 18)] [:zenyatta :_neutral (scoot -18)]]
     "Anyway, Satya, this match is hopeless. We’re all heading to Calveras for a drink. You should join us."]
    ["Zenyatta" [[:symmetra :_neutral (scoot 6)] [:genji :_neutral (scoot 18)] [:zenyatta :_explain (scoot -18)]]
     "Except for me. I will be doing yoga. Here in the courtyard. Sombra has helped me reprogram the spawn so we may stay after our allotted time has expired."]
    ["Genji" [[:symmetra :_neutral (scoot 6)] [:genji :_explain (scoot 18)] [:zenyatta :_neutral (scoot -18)]]
     "Also Mei is possibly dipping out. I think she has crossfit tomorrow. I already told her that kipping is an affront to proper form, but she tells me she trusts Zarya’s workout advice more than mine. That is fair, but I hope she does not continue to injure herself."]
    :-> [:spawn :genji :option 0]]

   [:spawn :genji :option 0]
   [:miranda/option
    "Symmetra" [[:symmetra :_neutral (scoot 6)] [:genji :_neutral (scoot 18)] [:zenyatta :_neutral (scoot -18)]]
    ["Having lived through Zarya's training regimen, I must say it was quite intense." #(= 1 (:volskaya/sombra %))]
    "Zarya is a professional athlete. I thought her advice would be trustworthy..."
    "How has Mei injured herself?"]

   [:spawn :genji :option 0 0]
   [:miranda/dialogue
    ["Genji" [[:symmetra :_neutral (scoot 6)] [:genji :_explain (scoot 18)] [:zenyatta :_neutral (scoot -18)]]
     "I see. How do you feel?"]
    ["Symmetra" [[:symmetra :_explainUncomfortable (scoot 6)] [:genji :_neutral (scoot 18)] [:zenyatta :_neutral (scoot -18)]]
     "I’m okay. The classes became more infrequent after Zarya drained her 401k to go all in on Bitcoin."]
    ["Zenyatta" [[:symmetra :_neutral (scoot 6)] [:genji :_neutral (scoot 18)] [:zenyatta :_explain (scoot -18)]]
     "If I may interrupt."]
    ["Genji" [[:symmetra :_neutral (scoot 6)] [:genji :_thinking (scoot 18)] [:zenyatta :_neutral (scoot -18)]]
     "Yes, master?"]
    ["Zenyatta" [[:symmetra :_WTF (scoot 6)] [:genji :_neutral (scoot 18)] [:zenyatta :_pointUp (scoot -18)]]
     "The reason Genji’s butt is so hot, dear friends."]
    ["Symmetra" [[:symmetra :_explainWTF (scoot 6)] [:genji :_neutral (scoot 18)] [:zenyatta :_neutral (scoot -18)]]
     "Sombra installed a bitcoin miner in his butt?"]
    ["Zenyatta" [[:symmetra :_WTF (scoot 6)] [:genji :_neutral (scoot 18)] [:zenyatta :_excited (scoot -18)]]
     "Yes."]
    ["Genji" [[:symmetra :_WTF (scoot 6)] [:genji :_explain (scoot 18)] [:zenyatta :_neutral (scoot -18)]]
     "Angela was confused as to why my glutes were overheating. Master! I could have caught on fire. Why did you not warn us?"]
    ["Zenyatta" [[:symmetra :_WTF (scoot 6)] [:genji :_neutral (scoot 18)] [:zenyatta :_pointUp (scoot -18)]]
     "Yes."]
    ["Genji" [[:symmetra :_neutral (scoot 6)] [:genji :_neckHand (scoot 18)] [:zenyatta :_neutral (scoot -18)]]
     "Well. At least I can have Sombra hack my butt to remove the miner. That will stop the overheating."]
    ["Zenyatta" [[:symmetra :_eyeRoll (scoot 6)] [:genji :_neutral (scoot 18)] [:zenyatta :_fingerGuns (scoot -18)]]
     "Nice."]
    ["Symmetra" [[:symmetra :_explainWTF (scoot 6)] [:genji :_neutral (scoot 18)] [:zenyatta :_neutral (scoot -18)]]
     "Do you actually trust her to remove the miners?"]
    ["Genji" [[:symmetra :_neutral (scoot 6)] [:genji :_hello (scoot 18)] [:zenyatta :_neutral (scoot -18)]]
     "Good point. I will forge my own path in removing the bitcoin miner from my own cyberbutt. In the meantime, I am just glad your personal training has stopped."]
    ["Genji" [[:symmetra :_neutral (scoot 6)] [:genji :_thinking (scoot 18)] [:zenyatta :_neutral (scoot -18)]]
     "Those two severely undernourished themselves."]
    ["Symmetra" [[:symmetra :_explainUncomfortable (scoot 6)] [:genji :_neutral (scoot 18)] [:zenyatta :_neutral (scoot -18)]]
     "Yes. Zarya insisted we stopped eating fruits and vegetables while in her program. I am glad to have cauliflower bhaji back in my life."]
    :-> [:spawn :genji 1]]

   [:spawn :genji :option 0 1]
   [:miranda/dialogue
    ["Genji" [[:symmetra :_neutral (scoot 6)] [:genji :_pointUp (scoot 18)] [:zenyatta :_neutral (scoot -18)]]
     "It is not."]
    ["Genji" [[:symmetra :_neutral (scoot 6)] [:genji :_hands1 (scoot 18)] [:zenyatta :_neutral (scoot -18)]]
     "Zarya has torn both of her ACLs."]
    ["Genji" [[:symmetra :_neutral (scoot 6)] [:genji :_hands2 (scoot 18)] [:zenyatta :_neutral (scoot -18)]]
     "Twice."]
    ["Genji" [[:symmetra :_neutral (scoot 6)] [:genji :_fingerGuns (scoot 18)] [:zenyatta :_neutral (scoot -18)]]
     "In the same month."]
    ["Symmetra" [[:symmetra :_confused (scoot 6)] [:genji :_neutral (scoot 18)] [:zenyatta :_neutral (scoot -18)]]
     "How did she recover so quickly?"]
    ["Genji" [[:symmetra :_neutral (scoot 6)] [:genji :_explain (scoot 18)] [:zenyatta :_neutral (scoot -18)]]
     "The fact that we have the technology to literally bring people back from the dead has allowed her to take her overtraining to new levels. But she claims that it is because she polishes off an entire tub of protein powder, and only protein powder, a day. As does Mei."]
    :-> [:spawn :genji 1]]

   [:spawn :genji :option 0 2]
   [:miranda/dialogue
    ["Genji" [[:symmetra :_neutral (scoot 6)] [:genji :_thinking (scoot 18)] [:zenyatta :_neutral (scoot -18)]]
     "They both got scurvy for a bit."]
    ["Symmetra" [[:symmetra :_bewildered (scoot 6)] [:genji :_neutral (scoot 18)] [:zenyatta :_neutral (scoot -18)]]
     "What?"]
    ["Genji" [[:symmetra :_confused (scoot 6)] [:genji :_explain (scoot 18)] [:zenyatta :_neutral (scoot -18)]]
     "Their diet is puzzling. Zarya thinks fruits are for weaklings."]
    ["Symmetra" [[:symmetra :_explainUncomfortable (scoot 6)] [:genji :_neutral (scoot 18)] [:zenyatta :_neutral (scoot -18)]]
     "What do they eat? Scurvy is not easy to get in these modern times."]
    ["Genji" [[:symmetra :_confused (scoot 6)] [:genji :_explain (scoot 18)] [:zenyatta :_neutral (scoot -18)]]
     "Just protein shakes."]
    ["Symmetra" [[:symmetra :_frustratedConfused (scoot 6)] [:genji :_neutral (scoot 18)] [:zenyatta :_neutral (scoot -18)]]
     "Zarya is always talking about the benefits of protein powder but I didn't realize it was literally the only thing they consumed."]
    :-> [:spawn :genji 1]]

   [:spawn :genji 1]
   [:miranda/dialogue
    ["Symmetra" [[:symmetra :_explainWTF (scoot 6)] [:genji :_neutral (scoot 18)] [:zenyatta :_neutral (scoot -18)]]
     "How have those two not entered a state of rabbit starvation?"]
    ["Genji" [[:symmetra :_WTF (scoot 6)] [:genji :_pointUp (scoot 18)] [:zenyatta :_neutral (scoot -18)]]
     "Zarya has her own brand of protein shake and it’s pretty weird. It is cut with Soylent, the product of an old Silicon Valley company that went out of business decades ago once they modified their product to kill off your entire stomach flora."]
    ["Symmetra" [[:symmetra :_explainAngry (scoot 6)] [:genji :_neutral (scoot 18)] [:zenyatta :_neutral (scoot -18)]]
     "How is this woman alive?"]
    ["Genji" [[:symmetra :_WTF (scoot 6)] [:genji :_explain (scoot 18)] [:zenyatta :_neutral (scoot -18)]]
     "You do not question Russia’s strongest living person."]
    ["Genji" [[:symmetra :_WTF (scoot 6)] [:genji :_pointUp (scoot 18)] [:zenyatta :_neutral (scoot -18)]]
     "Nor do you question Russia’s strongest living thing."]
    ["Genji" [[:symmetra :_WTF (scoot 6)] [:genji :_neckHand (scoot 18)] [:zenyatta :_neutral (scoot -18)]]
     "It…"]
    ["Symmetra" [[:symmetra :_skeptical (scoot 6)] [:genji :_neutral (scoot 18)] [:zenyatta :_neutral (scoot -18)]]
     "What is it?"]
    ["Genji" [[:symmetra :_frustrated (scoot 6)] [:genji :_explain (scoot 18)] [:zenyatta :_neutral (scoot -18)]]
     "It is Zarya’s pet bear. She feeds it that protein. She also gave it her haircut."]
    ["Symmetra" [[:symmetra :_frustratedConfused (scoot 6)] [:genji :_neutral (scoot 18)] [:zenyatta :_neutral (scoot -18)]]
     "…"]
    ["Zenyatta" [[:symmetra :_frustratedConfused (scoot 6)] [:genji :_neutral (scoot 18)] [:zenyatta :_excited (scoot -18)]]
     "I love Zarya. The bear."]
    ["Genji" [[:symmetra :_eyeRoll (scoot 6)] [:genji :_pointUp (scoot 18)] [:zenyatta :_neutral (scoot -18)]]
     "Also she named it Zarya. So it would be named “after the strongest thing she could think of.”"]
    ["Symmetra" [[:symmetra :_eyeRoll (scoot 6)] [:genji :_neutral (scoot 18)] [:zenyatta :_neutral (scoot -18)]]
     "..."]
    ["Genji" [[:symmetra :_neutral (scoot 6)] [:genji :_bow (scoot 18)] [:zenyatta :_neutral (scoot -18)]]
     "Anyway, please accompany us to the bar. Your companionship would be greatly appreciated."]
    ["Zenyatta" [[:symmetra :_neutral (scoot 6)] [:genji :_neutral (scoot 18)] [:zenyatta :_explain (scoot -18)]]
     "Why have alcohol when you could train sensibly with a robot master?”"]
    ["Genji" [[:symmetra :_neutral (scoot 6)] [:genji :_whisper (scoot 18)] [:zenyatta :_neutral (scoot -18)]]
     "He just listens to vaporwave and holds crow pose for an hour. Trust me, you do not want this."]
    :-> [:spawn :genji :choice]]

   [:spawn :genji :choice]
   [:miranda/text-option
    "What will you do?"
    ["Accompany the gang to the bar." (constantly true)
     [:-> [:spawn :genji :yes]]]
    ["Train sensibly with robot master" (constantly true)
     [:-> [:spawn :genji :zen]]]
    ["Talk to your other teammates" (constantly true)
     [:-> [:spawn :genji :no]]]]

   [:spawn :genji :yes]
   [:miranda/dialogue
    ["Genji" [[:symmetra :_smile (scoot 6)] [:genji :_fist (scoot 18)] [:zenyatta :_neutral (scoot -18)]]
     "Alright! Tequila!"]
    :-> [:calveras :sombra 0]]

   [:spawn :genji :zen]
   [:miranda/dialogue
    ["Symmetra" [[:symmetra :_neutral (scoot 6)] [:genji :_whisper (scoot 18)] [:zenyatta :_neutral (scoot -18)]]
     "I warned you. Don’t say I did not warn you."]
    :-> [:zenyatta]]

   [:spawn :genji :no]
   [:miranda/dialogue
    ["Genji" [[:symmetra :_neutral (scoot 6)] [:genji :_explain (scoot 18)] [:zenyatta :_neutral (scoot -18)]]
     "Yeah. Sure. Just don’t let anyone talk you into an exercise regimen."]
    ["Symmetra" [[:symmetra :_explainUncomfortable (scoot 6)] [:genji :_neutral (scoot 18)] [:zenyatta :_neutral (scoot -18)]]
     "I will try."]
    :-> [:spawn :choice]]

   [:zenyatta]
   [:miranda/characters
    [[]]
    :-> [:zenyatta :text]]

   [:zenyatta :text]
   [:miranda/narration
    "Obviously, you lost the match. You, however, did develop a taste for vaporwave, and an hour of crow pose was extremely invigorating. Your excellent self care regimen ensures that you are always extremely limber, perfectly poised to spend comedic amounts of time in a single yoga pose. Besides, all that blood rushing to your head let you get some quality thinking time."
    :=> [:blizzard-world [:hotel :intro] 0]]})
