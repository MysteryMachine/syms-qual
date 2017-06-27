(ns syms-qual.data.characters
  (:require [carmen.data :as data]))

;; TODO: This should just be on a higher part of the graph
(def alignments
  {:behind {:alignment [-20 0]}
   0 {}})

(def structure
  {"Ana"
   {"_cranky" alignments
    "_drink" {}
    "_explain" {}
    "_phone" {}
    "_rolls-eyes" {}
    "_sass" alignments}

   "Efi"
   {"_armsUpExcited" {}
    "_armsUpStressed" {}
    "_explain" {}
    "_netural" {}
    "_pointUp" {}
    "_smug" {}
    "_wave" {}}

   "Genji_Mercy"
   {"_angry" {}
    "_bow" {}
    "_embarassed" {}
    "_genjiExplain" {}
    "_hands1" {}
    "_hands2" {}
    "_laugh" {}
    "_lookBack" {}
    "_mercyExplain" {}
    "_neutral" {}
    "_point" {}
    "_Skeptical" {}
    "_stop" {}
    "_strained" {}
    "_what" {}}

   "Jack"
   {"_babyGay" {}
    "_coms" {}
    "_fine" {}
    "_inside" {}
    "_lightbulb" {}
    "_ok" {}
    "_overracting" {}
    "_punch" {}
    "_smooch" {}
    "_speech" {}
    "_waiting" {}
    "_where" {}}

   "Junkrat"
   {"_ballFrown" {}
    "_ballNeutral" {}
    "_ballSmile" {}
    "_explain" {}
    "_fibbin" {}
    "_puppetPoint" {}
    "_puppetWhisper" {}
    "_shyblush" {}
    "_triggerAdoringBlush" {}
    "_triggerExplain" {}
    "_triggerIntro" {}
    "_triggerWave" {}
    "_triggerWink" {}}

   "Lucio"
   {"_explainDown" {}
    "_explainForward" {}
    "_jammin" {}
    "_lament" {}
    "_neutral" {}
    "_point" {}
    "_pointUp" {}
    "_ponder" {}
    "_prayExplain" {}
    "_prayExplainHappy" {}
    "_smile" {}
    "_smug" {}}

   "McCree"
   {"_coffeeDrink" {}
    "_coffeeHold" {}
    "_coffeePoint" {}
    "_coffeeSteal" {}
    "_fingerGuns" {}
    "_laugh" {}
    "_neutral" {}
    "_phoneShow" {}
    "_phoneSteal" {}
    "_phoneTexting" {}
    "_selfie" {}}

   "Orisa"
   {"_neutral" {}}

   "Pharah" ;;
   {"_AnguishGay" {}
    "_anguishMild" {}
    "_cold" {}
    "_determined" {}
    "_embarassed" {}
    "_embarassedAngryBack" {}
    "_embarassedBack" {}
    "_embarassedForward" {}
    "_explainEmbarassed" {}
    "_flying" {}
    "_frown" {}
    "_geez" {}
    "_helloAwkward" {}
    "_helloNeutral" {}
    "_helmetNervous" {}
    "_karkadeBold" {}
    "_karkadeDown" {}
    "_karkadeDrink" {}
    "_karkadeEmbarassed" {}
    "_karkadeExplainConfident" {}
    "_karkadeExplainUnsure" {}
    "_karkadeHold" {}
    "_karkadeLaugh" {}
    "_karkadeUncomfortable" {}
    "_laugh" {}
    "_neutral" {}
    "_neutralBack" {}
    "_neutralBackBlush" {}
    "_reverse" {}
    "_reverseEmbarassed" {}
    "_reversePeek" {}
    "_smile" {}}

   "Phones"
   {"_mccreeHand" {}
    "_pharahHand" {}
    "_reaperHand" {}
    "_symHand" {}}

   "Photos"
   {"_indiana" {}
    "_junkratDate0" {}
    "_pharahDate0" {}
    "_pharahDate1" {}
    "_sombraDate0" {}
    "_wanted" {}}

   "Reaper"
   {"_evanescence" {}
    "_exasperated" {}
    "_explain" {}
    "_extra" {}
    "_fingerGuns" {}
    "_leave" {}
    "_neutral" {}
    "_phoneCheck" {}
    "_point-up" {}
    "_point" {}
    "_spit" {}
    "_whisper" {}}

   "Roadhog"
   {"_drink" {}
    "_neutral" {}
    "_shrug" {}}

   "Soldier76"
   {"_armsCrossed" {}
    "_armsCrossedReverse" {}
    "_fistPalm" {}
    "_handsHips" {}
    "_handUpReverse" {}
    "_point" {}
    "_pointUp" {}}

   "Sombra"
   {"_awkward" {}
    "_awkwardSad" {}
    "_browseDickButt" {}
    "_browseTranslation" {}
    "_browseTranslationSmile" {}
    "_camo" {}
    "_dismayed" {}
    "_explain" {}
    "_explainAngry" {}
    "_explainConcerned" {}
    "_explainCondescend" {}
    "_explainHand" {}
    "_flirty" {}
    "_frown" {}
    "_hack" {}
    "_laugh" {}
    "_leanin" {}
    "_neutral" {}
    "_nostalgic" {}
    "_nostalgicSad" {}
    "_point" {}
    "_self" {}
    "_shhReaper" {}
    "_shrug" {}
    "_smile" {}
    "_surprised" {}
    "_tongue" {}
    "_wave" {}
    "_whisper" {}
    "_yell" {}}

   "Symmetra"
   {"_1000Mile" {}
    "_angry" {}
    "_bewildered" {}
    "_bored" {}
    "_confused" {}
    "_coy" {}
    "_craftTurret" {}
    "_dissappointed" {}
    "_embarassed" {}
    "_explain" {}
    "_explainAngry" {}
    "_explainUncomfortable" {}
    "_eyeRoll" {}
    "_flirty" {}
    "_frown" {}
    "_frustrated" {}
    "_helloNeutral" {}
    "_helloWarm" {}
    "_karkade-Drink" {}
    "_karkadeBlush" {}
    "_karkadeConcerned" {}
    "_karkadeDown" {}
    "_karkadeHold" {}
    "_karkadeLaugh" {}
    "_karkadeSmile" {}
    "_laugh" {}
    "_neutral" {}
    "_no" {}
    "_noUncomfortable" {}
    "_pointBack" {}
    "_sadSmile" {}
    "_skeptical" {}
    "_smile" {}
    "_smug" {}
    "_thinking" {}}

   "Widowmaker"
   {"_bird" {}
    "_despise" {}
    "_explain" {}
    "_explainBack" {}
    "_leave" {}
    "_neutral" {}
    "_point" {}
    "_tch" {}}

   "Zarya_Rein"
   {"_explain" {}
    "_handshake" {}
    "_hello" {}
    "_neutralLeft" {}
    "_neutralRight" {}
    "_ofCourse" {}
    "_pointRein" {}
    "_pointSalty" {}
    "_pointZarya" {}
    "_pointZaryaNoShot" {}
    "_protein" {}
    "_salty" {}
    "_shot" {}
    "_smutty" {}}

   "Zenyatta"
   {"_confused" {}
    "_excited" {}
    "_explain" {}
    "_focus" {}
    "_neutral" {}
    "_pointUp" {}
    "_wave" {}}})

(def options
  {:path "img/Characters/"
   :ext  "png"})

(def data (data/reify-characters structure options))
