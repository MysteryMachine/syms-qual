(ns syms-qual.data.scenes.lijang.date-1
  (:require [carmen.util :as anim :refer [scoot]]
            [syms-qual.util :as util :refer [inc-transition]]))

(def data
  {[:spawn :dva 2]
   [:miranda/dialogue
    ["D.Va" [[:lucio :_neutral (scoot -80 -4 1)] [:symmetra :_neutral (scoot 84 4 1)] [:dva :_fingerGuns (scoot -84 -4 1)]]
     "Stream time! We got the shop, I hope you’re ready for literally infinite quantities of boba."]
    ["Lucio" [[:lucio :_prayExplain (scoot -4)] [:dva :_neutral (scoot -4)] [:symmetra :_neutral (scoot 4)]]
     "Do not look into the boba abyss. It will consume you. Also it will brutally spike your blood sugar, which is bad. Stay healthy, y’all."]
    ["D.Va" [[:lucio :_neutral (scoot -4)] [:symmetra :_neutral (scoot 4)] [:dva :_understanding (scoot -4)]]
     "Are you okay to go?"]
    :-> [:spawn :dva :option 1]]

   [:spawn :dva :option 1]
   [:miranda/option
    "Symmetra" [[:lucio :_neutral (scoot -4)] [:dva :_neutral (scoot -4)] [:symmetra :_neutral (scoot 4)]]
    "I think so. The time I spent meditating has mentally prepared me."
    "I’m still rather stressed out. It’s just been a tough week."]

   [:spawn :dva :option 1 0]
   [:miranda/dialogue
    ["Symmetra" [[:lucio :_neutral (scoot -4)] [:dva :_neutral (scoot -4)] [:symmetra :_explainUncomfortable (scoot 4)]]
     "I trust we managed to be victorious in our match?"]
    :-> [:spawn :dva 3]]

   [:spawn :dva :option 1 1]
   [:miranda/dialogue
    ["D.Va" [[:lucio :_neutral (scoot -4)] [:symmetra :_neutral (scoot 4)] [:dva :_understanding (scoot -4)]]
     "Hey, no pressure if you’re not feeling well."]
    ["Lucio" [[:lucio :_smile (scoot -4)] [:dva :_neutral (scoot -4)] [:symmetra :_neutral (scoot 4)]]
     "I will say, boba has literally proven to be good for your soul. I know I’m giving conflicting boba facts, but a lot of boba is a good thing if you’re feeling down! You can handle an insulin spike or two every now and then. Practice regular self care, y’all."]
    ["Symmetra" [[:lucio :_neutral (scoot -4)] [:dva :_neutral (scoot -4)] [:symmetra :_explainSad (scoot 4)]]
     "I thank you, but I am mostly uncertain as to the result of the match. Did my absence affect things?"]
    :-> [:spawn :dva 3]]

   [:spawn :dva 3]
   [:miranda/dialogue
    ["D.Va" [[:lucio :_neutral (scoot -4)] [:dva :_headHand (scoot -4)] [:symmetra :_neutral (scoot 4)]]
     "Oh. Um. We sorta blew it. Sorry! I don’t know what happened, winning five versus six was more difficult than we thought it’d be even with Jamie throwing as hard as he could."]
    ["Lucio" [[:lucio :_prayExplain (scoot -4)] [:dva :_neutral (scoot -4)] [:symmetra :_neutral (scoot 4)]]
     "He’s a thin boy, Satya. He can only throw so far."]
    ["Symmetra" [[:lucio :_neutral (scoot -4)] [:dva :_neutral (scoot -4)] [:symmetra :_skeptical (scoot 4)]]
     "What a shame. It may be a mistake, but I suppose I should go, considering I threw the match too."]
    ["D.Va" [[:lucio :_jammin (scoot -4)] [:symmetra :_sadSmile (scoot 4)] [:dva :_fingerGuns (scoot -4)]]
     "Ptchoooow, alright! Let’s do it!"]
    :transition :miranda/conditional
    [#(> (:points/junkrat %) 0) [:-> [:arcade :junkrat :cutscene 0]]
     :else                      [:-> [:arcade :junkrat :no-date 0]]]]

   [:arcade :junkrat :cutscene 0]
   [:miranda/narration
    "The stream party begins, and D.Va and Lucio seat themselves in front of a few arcade machines, broadcasting using a camera mounted on the Meka, which they managed to squeeze into the arcade’s sizable freight elevator. Junkrat has not yet arrived, and thankfully, D.Va and Lucio do not ask you to perform just yet. You sit in a corner, observing their streaming hijinks, until Roadhog and Junkrat show up."
    "They nod a quick hello to you before before ordering a massive tray filled with bubble teas and taking a seat in the opposite corner. Junkrat contemplatively chews his boba, nervously fidgeting with the strange red ball he seems to always be carrying, and periodically glancing your way, looking quite nervous. Eventually after  some persistent nudging from Roadhog, he grabs two drinks from the tray and heads in your direction,  but not before blowing an overdramatic kiss to his porcine friend."
    :-> [:arcade :junkrat 0]]

   [:arcade :junkrat 0]
   [:miranda/dialogue
    ["Junkrat" [[:junkrat :_teaOffer (scoot -80 -10 1)] [:symmetra :_neutral (scoot 70 0 1)]]
     "Uh! G’day Symmy! Muggy in here, isn’t it? Want some tea?"]
    ["Symmetra" [[:junkrat :_twoTea (scoot -10)] [:symmetra :_explain]]
     "I’m not fond of diminutives, but I suppose at this point you may call me Satya if you wish. As to the tea, I’m not sure it would be to my taste."]
    ["Junkrat" [[:junkrat :_teaOffer (scoot -10)] [:symmetra :_neutral]]
     "It’s half sweet. Full strength stuff’s too much even for me. Give it a burl. If you don’t like it I’ll drink the rest."]
    ["Symmetra" [[:junkrat :_teaDrink (scoot -10)] [:symmetra :_teaDrink]]
     "..."]
    ["Symmetra" [[:junkrat :_teaHold (scoot -10)] [:symmetra :_teaSmile]]
     "It’s so chewy!"]
    ["Junkrat" [[:junkrat :_teaPoint (scoot -10)] [:symmetra :_teaHold]]
     "That’s the best part!"]
    ["Symmetra" [[:junkrat :_teaHold (scoot -10)] [:symmetra :_teaThinking]]
     "It is quite a pleasing texture I suppose. Unlike that fairy bread, which was most certainly a culinary abomination."]
    ["Symmetra" [[:junkrat :_teaHold (scoot -10)] [:symmetra :_teaToast]]
     "Exquisite! A toast to your victory!"]
    ["Junkrat" [[:junkrat :_teaToast (scoot -10)] [:symmetra :_teaToast]]
     "Splendiferous pun!"]
    ["Symmetra" [[:junkrat :_teaDrink (scoot -10)] [:symmetra :_teaDrink]]
     "I assure you, it was not intentional."]
    ["Junkrat" [[:junkrat :_teaOh (scoot -10)] [:symmetra :_teaDrink]]
     "...oh."]
    ["Symmetra" [[:junkrat :_teaHold (scoot -10)] [:symmetra :_teaHold]]
     "..."]
    ["Junkrat" [[:junkrat :_teaHeadHand (scoot -10)] [:symmetra :_teaHold]]
     "Oi, geez, sorry about winnin’ the match, love. Reaper was just having a monstrous shootin’ session tonight. I think he put his big boy ghost pants on when he realized I was intentionally trying to lose."]
    ["Symmetra" [[:junkrat :_teaHold (scoot -10)] [:symmetra :_teaSadSmile]]
     "It is fine. Attending events such as this and getting to know people better is an important part of my work here as well."]
    ["Junkrat" [[:junkrat :_teaOh (scoot -10)] [:symmetra :_teaHold]]
     "Yeah, socializatin’s a big part of this job. A lot bigger than I was expecting it to be when I signed up to be honest."]
    ["Symmetra" [[:junkrat :_teaHold (scoot -10)] [:symmetra :_teaConcerned]]
     "Mr. Junkrat…"]
    ["Junkrat" [[:junkrat :_teaNervous (scoot -10)] [:symmetra :_teaHold]]
     "Jamie’s fine. Or whatever variation of that suits your fancy, love! Tracer calls me Jamesathan sometimes, which is weird, but I’m not about to sog up her Weetabix."]
    ["Symmetra" [[:junkrat :_teaHold (scoot -10)] [:symmetra :_teaSmile]]
     "Jamie will do nicely. Though, I will say, I’ve tried Weetabix, and it’s perfectly fine soggy."]
    ["Junkrat" [[:junkrat :_teaWink (scoot -10)] [:symmetra :_teaHold]]
     "I’m just a boy who appreciates some crunch."]
    ["Symmetra" [[:junkrat :_teaHold (scoot -10)] [:symmetra :_teaConcerned]]
     "In any case, Jamie, have you done this sort of thing with Hana and Lucio before? I’m a bit nervous. I haven’t been to an arcade like this and, I’m finding it a bit overwhelming."]
    ["Junkrat" [[:junkrat :_teaFibbinSad (scoot -10)] [:symmetra :_teaHold]]
     "Oh thank god, I thought I was the only one that ever felt that way. It’s damn loud in here, ain’it, with the noise and the lights, all them random weird alerts going off."]
    ["Junkrat" [[:junkrat :_teaNervous (scoot -10)] [:symmetra :_teaHold]]
     "I love it, gets my blood pumpin’ and my ears ringin’ whenever I hang out with them, but it’s a lot to take in and by the end I always feel right burned out."]
    ["Symmetra" [[:junkrat :_teaHold (scoot -10)] [:symmetra :_teaSadSmile]]
     "I suppose that will make two of us then. Hana and Lucio do seem quite pleased that we came out though."]
    ["Junkrat" [[:junkrat :_teaExplain (scoot -10)] [:symmetra :_teaHold]]
     "They are! And I’m glad I came. It’s just, these days I’ve been flat out like a lizard drinking and a busy schedule’s hard to have."]
    ["Junkrat" [[:junkrat :_teaDrink (scoot -10)] [:symmetra :_teaHold]]
     "After a match like today’s, I get behind on me tinkering. And now devoting more time to gaming with my mates on top of that, I’m looking at twice as much time recovering from the whole thing."]
    ["Symmetra" [[:junkrat :_teaHold (scoot -10)] [:symmetra :_teaDrink]]
     "It’s good that you keep busy, at least."]
    ["Junkrat" [[:junkrat :_teaPointUp (scoot -10)] [:symmetra :_teaSmile]]
     "Boy do I! On top of this, I have a jumper I promised Roadie I’d knit him. Do you know how late that is? It was supposed to be a Chrissy prezzy! Christmas was 7 months ago! Granted, Roadie needs a LOT of knitted bits to keep him warm."]
    ["Symmetra" [[:junkrat :_teaDrink (scoot -10)] [:symmetra :_teaThinking]]
     "I have always thought you two needed additional clothing in some of the harsher climes that we visit."]
    ["Junkrat" [[:junkrat :_teaPoint (scoot -10)] [:symmetra :_teaHold]]
     "Look who’s talking!"]
    ["Junkrat" [[:junkrat :_teaNervous (scoot -10)] [:symmetra :_teaDrink]]
     "Anyway, when I feel like I’m getting behind on the things I want to do, I just always get right stressed."]
    ["Junkrat" [[:junkrat :_teaDrink (scoot -10)] [:symmetra :_teaDrink]]
     "Finally finished that hooking dovalacky, but I’ve also got this cat powered radio-toaster multi-tool I’ve been working on for ages that’s still got a ways to go, gotta sort out my bomb stocks for next week’s match, and now this shindig. Just not enough hours in the day."]
    ["Symmetra" [[:junkrat :_teaHold (scoot -10)] [:symmetra :_teaConcerned]]
     "Would it not have been better for you to take a rain check on tonight’s activities?"]
    ["Junkrat" [[:junkrat :_teaShyBlush (scoot -10)] [:symmetra :_teaSmile]]
     "I think it’s worth it getting to see you and all. Besides, Rodie promised he’d help me calm down later. Man knows his way around a floral meditation session if you’re ever looking to unwind you should join us."]
    :-> [:arcade :junkrat :option 0]]

   [:arcade :junkrat :option 0]
   [:miranda/option
    "Symmetra" [[:junkrat :_teaHold (scoot -10)] [:symmetra :_teaHold]]
    "Did you make the effort just to see me?"
    "It is good that you have Roadhog to help ground you."]

   [:arcade :junkrat :option 0 0]
   [:miranda/dialogue
    ["Junkrat" [[:junkrat :_teaNervous (scoot -10)] [:symmetra :_teaSmile]]
     "Oi, it wasn’t just to see you! I’ve got friends. You being here was, uh, maybe just maybe a little extra motivation."]
    ["Symmetra" [[:junkrat :_teaDrink (scoot -10)] [:symmetra :_teaBlush]]
     "The effort is duly noted, Jamie."]
    ["Junkrat" [[:junkrat :_teaExplainBlush (scoot -10)] [:symmetra :_teaDrink]]
     "I mean, the tea was big part of it too.  Roadie says he’s strictly enforcing a 3 cup limit, though. I need to keep my sleep cycle consistent."]
    :-> [:arcade :junkrat 1]]

   [:arcade :junkrat :option 0 1]
   [:miranda/dialogue
    ["Junkrat" [[:junkrat :_teaDrink (scoot -10)] [:symmetra :_teaHold]]
     "Yeah. Bless that sweet boy. He’s my rock. My big mound of immovable, warm flesh. Can survive a robot’s nuclear explosion when he’s doing some deep breathing. Its freakish! In a hot way. Best of all, he smells like lilacs! You know, from all the floral meditation."]
    ["Symmetra" [[:junkrat :_teaHold (scoot -10)] [:symmetra :_teaThinking]]
     "I always did wonder how he managed to smell so nice, while at the same time being covered in dust and debris."]
    :-> [:arcade :junkrat 1]]

   [:arcade :junkrat 1]
   [:miranda/dialogue
    ["Symmetra" [[:junkrat :_teaHold (scoot -10)] [:symmetra :_teaSmile]]
     "It must be nice to have someone like that in your life."]
    ["Junkrat" [[:junkrat :_teaPointUp (scoot -10)] [:symmetra :_teaHold]]
     "He helps keep me in check, er.. Helps me try at least. Like I said, if you ever need a place to have some quiet time, you are invited to our meditation sessions. We take a break from all the chaos and find some quiet!"]
    ["Junkrat" [[:junkrat :_teaNervous (scoot -10)] [:symmetra :_teaHold]]
     "Granted Roadie’s always pretty good with the quiet, but for me it takes some devoted concentration to shut me gob. But it’s good, it’s good. Roadie leads the session and after we have some herbal tea."]
    ["Symmetra" [[:junkrat :_teaDrink (scoot -10)] [:symmetra :_teaSass]]
     "I’ll keep that in mind! "]
    :-> [:junkrat-a]]

   [:junkrat-a]
   [:miranda/characters
    [[]]
    :-> [:junkrat-a :text]]

   [:junkrat-a :text]
   [:miranda/narration
    "Junkrat motions for Roadhog to join you at the table, and you spend some quiet time entertaining yourselves while observing the Lucio and Hana’s antics. "
    :-> [:arcade :dva :cutscene 3]]

   [:arcade :junkrat :no-date 0]
   [:miranda/narration
    "You take a seat in the corner, sipping tea and watching the Lucio and Hana’s on stream hijinks. Junkrat does not show up until quite late into the evening. He waves hello to you, and then quietly sits in the opposite corner with Roadhog, giggling at the shenanigans on the livestream. You distract yourself with your phone."
    :-> [:arcade :junkrat :no-date 1]]

   [:arcade :junkrat :no-date 1]
   [:miranda/dialogue
    ["Symmetra" [[:symmetra :_phoneSkeptical]]
     "It’s definitely getting late."]
    :-> [:arcade :dva :cutscene 3]]})
