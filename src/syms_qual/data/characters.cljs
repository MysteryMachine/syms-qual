(ns syms-qual.data.characters
  (:require [carmen.data :as data]))

(def structure
  {"Ana"
   ["_breathalyzerExplain"
    "_breathalyzerExplainEyesClosed"
    "_breathalyzerNeutral"
    "_cranky"
    "_crankyTalk"
    "_drink"
    "_explain"
    "_explainCranky"
    "_explainEyesClosed"
    "_laugh"
    "_neutral"
    "_phone"
    "_roll-eyes"
    "_sass"
    "_sassTalk"
    "_wave"]

    "Bastion"
   ["_explainRight"
    "_neutral"
    "_neutralLeft"
    "_pointUpLeft"
    "_pointUpRight"]

   "Brigitte"
   ["_explain"
    "_explainUnsure"
    "_handHead"
    "_lookBack"
    "_teacupLookBack"
    "_neutral"
    "_pie"
    "_pieLaugh"
    "_pieTalk"
    "_wave"]

   "Clouds"
   ["_bear"
    "_centaur"
    "_cone"
    "_dance"
    "_field" {:sizing {:anchor [0 0] :size [2048 2160]}}
    "_lizard"
    "_snore"
    "_whale"]

   "Credit"
   ["bronzeGift"
    "bronzeGiftSilo"
    "gmGift"
    "gmGiftSilo"
    "junkGift"
    "junkGiftSilo"
    "pharahGift"
    "pharahGiftSilo"
    "sombraGift"
    "sombraGiftSilo"]

   "Doomfist"
   ["_armsCross"
    "_armsCrossAngry"
    "_armsCrossEyeRoll"
    "_armsCrossNeutral"
    "_armsCrossSalty"
    "_drinkExplain"
    "_drinkExplainConcerned"
    "_drinkEyeRoll"
    "_drinkHold"
    "_drinking"
    "_drinkNo"
    "_drinkPoint"
    "_drinkPointUp"
    "_drinkPointUpEyes"
    "_drinkSkeptical"
    "_drinkWave"
    "_explainConcerned"
    "_eyeRoll"
    "_laugh"
    "_neutral"
    "_phoneHold"
    "_phoneTalk"
    "_point"
    "_pointUp"
    "_pointUpSmile"
    "_smirk"
    "_wave"]

   "Doomfist_Tracer"
   ["_doomfistArmsCross"
    "_doomfistArmsCrossGlare"
    "_doomfistArmsCrossSmirk"
    "_doomfistExplain"
    "_doomfistExplainConcerned"
    "_doomfistExplainRight"
    "_doomfistGlare"
    "_doomfistGlareUp"
    "_doomfistLaugh"
    "_doomfistNeutral"
    "_doomfistPointUp"
    "_doomfistPointUpEyes"
    "_doomfistPointUpGlare"
    "_doomfistPointUpSmile"
    "_doomfistVibrams"
    "_neutralLeft"
    "_neutralRight"
    "_tracerBewildered"
    "_tracerConfusedLeft"
    "_tracerConfusedLeftSmirk"
    "_tracerExplain"
    "_tracerExplainRight"
    "_tracerExplainUpset"
    "_tracerFingerGuns"
    "_tracerGlareUp"
    "_tracerLookUp"
    "_tracerShrug"
    "_tracerWTF"]

   "Dva"
   ["_attacked"
    "_dunk"
    "_explain"
    "_explainChat"
    "_explainEyesClosed"
    "_explainGum"
    "_fingerGuns"
    "_handsHips"
    "_handsHipsGum"
    "_handsHipsSmile"
    "_handsHipsTalk"
    "_headHand"
    "_heat"
    "_heat2"
    "_neutral"
    "_neutralGum"
    "_point"
    "_read"
    "_readLook"
    "_readTalk"
    "_readTalkSad"
    "_shrug"
    "_shrugTeenVogue"
    "_switchCheck"
    "_switchExplain"
    "_switchGrin"
    "_switchGum"
    "_switchNeutral"
    "_switchPointUp"
    "_switchShrug"
    "_switchSmile"
    "_switchTalk"
    "_switchThumbsUp"
    "_switchUnderstanding"
    "_teenVogue"
    "_understanding"]

   "Efi"
   ["_armsUpBall"
    "_armsUpExcited"
    "_armsUpEyesClosed"
    "_armsUpStressed"
    "_explain"
    "_eyeRoll"
    "_lookBack"
    "_neutral"
    "_pointUp"
    "_pointUpEyesClosed"
    "_smile"
    "_smug"
    "_two"
    "_wave"
    "_whisper"]

    "Emily"
    ["_look"
     "_neutral"
     "_wave"]

   "Genji"
   ["_bow"
    "_explain"
    "_fingerGuns"
    "_fist"
    "_hands1"
    "_hands2"
    "_hello"
    "_laugh"
    "_neckHand"
    "_neutral"
    "_pointUp"
    "_stop"
    "_thinking"
    "_whisper"]

   "Genji_Mercy"
   ["_angry"
    "_bow"
    "_embarassed"
    "_genjiExplain"
    "_hands1"
    "_hands2"
    "_laugh"
    "_lookBack"
    "_mercyExplain"
    "_neutral"
    "_point"
    "_Skeptical"
    "_stop"
    "_strained"
    "_what"]

    "Gifts"
    ["_bear"
     "_bronze"
     "_cake"
     "_diamond"
     "_gm"
     "_gold"
     "_orb"
     "_photo"
     "_plat"
     "_skates"]

   "Hands"
   ["_junkExplain"
    "_junkPoint"
    "_symExplain"
    "_symPoint"]

   "Hanzo"
   ["_explain"
    "_explainEyesClosed"
    "_explainUncomfortable"
    "_lookAway"
    "_neutral"
    "_no"
    "_phoneTalk"
    "_phoneTexting"
    "_phoneTextingLookUp"
    "_pointUp"
    "_sakeGesture"
    "_sakeHold"
    "_sakeHoldTalk"
    "_sakeLook"]

   "Jack"
   ["_anaArmsCross"
    "_anaExplain"
    "_anaFrustrated"
     "_babyGay"
    "_coms"
    "_fine"
    "_gabeHi"
    "_gabeStory"
    "_gabeStory2"
    "_inside"
    "_lightbulb"
    "_ok"
    "_overreacting"
    "_overreacting2"
    "_pharahBrowse"
    "_pharahBrowseLookUp"
    "_pharahInterested"
    "_pharahNeutral"
    "_pharahRollEyes"
    "_pharahWow"
    "_punch"
    "_rein"
    "_smooch"
    "_speech"
    "_turretHammer"
    "_turretSit"
    "_waiting"
    "_where"
    "_youthCorp"]

   "Junkrat"
   ["_armsForward"
     "_armsUp"
    "_armsUpSmile"
    "_ballAdoringBlush"
    "_ballAdoringBlushDown"
    "_ballBack"
    "_ballBackThumb"
    "_ballConfused"
    "_ballConfusedBlush"
    "_ballConfusedBlushLeft"
    "_ballConfusedEyesClosed"
    "_ballConfusedNoFire"
    "_ballEmbarassed"
    "_ballEmbarassedBlush"
    "_ballEmbarassedBlushNoFire"
    "_ballExplain"
    "_ballExplainConcerned"
    "_ballExplainConcernedNoFire"
    "_ballExplainNoFire"
    "_ballFrown"
    "_ballFrownNoFire"
    "_ballIntro"
    "_ballIntroNoFire"
    "_ballNeutral"
    "_ballNeutralExtraFire"
    "_ballNeutralNoFire"
    "_ballPoint"
    "_ballPointNoFire"
    "_ballPointUp"
    "_ballPointUpSerious"
    "_ballPointUpNoFire"
    "_ballSmile"
    "_ballSmileNod"
    "_ballSmileNoFire"
    "_ballThinking"
    "_ballThinkingSmile"
    "_ballWave"
    "_ballWink"
    "_ballWinkNoFire"
    "_chart"
    "_chocoEat"
    "_chocoExplain"
    "_chocoOffer"
    "_cough"
    "_coughBlush"
    "_coughNoFire"
    "_explain"
    "_fibbin"
    "_fibbinSad"
    "_fibbinBlush"
    "_fibbinBlushNoFire"
    "_fibbinNoFire"
    "_handsDown"
    "_handsHips"
    "_handHipsBlush"
    "_handsHipsRight"
    "_handsHipsRightNoFire"
    "_helmet"
    "_hogimpression"
    "_launcher"
    "_launcherNoFire"
    "_neckHand"
    "_phonePhoto"
    "_phoneShow"
    "_phoneShowNoFire"
    "_puppetPoint"
    "_puppetWhisper"
    "_reverseBack"
    "_reverseFist"
    "_reverseFistSmile"
    "_reverseNeutral"
    "_reversePointUp"
    "_reverseShrug"
    "_reverseShyBlush"
    "_reverseSmileNod"
    "_reverseThinking"
    "_reverseThumbsUp"
    "_reverseWink"
    "_scandalized"
    "_scandalized2"
    "_scandalizedNoFire"
    "_scandalizedTalk"
    "_shhh"
    "_shimGesture"
    "_shyblush"
    "_shyBlushNoFire"
    "_sigh"
    "_smooch"
    "_teacupAdoringBlush"
    "_teacupDrink"
    "_teacupExplain"
    "_teacupExplainConcerned"
    "_teacupFibbinSad"
    "_teacupHeadHand"
    "_teacupHeadTilt"
    "_teacupHeadTiltTalk"
    "_teacupHold"
    "_teacupLookDown"
    "_teacupLookDownTalk"
    "_teacupNervous"
    "_teacupOffer"
    "_teacupOh"
    "_teacupSadSmile"
    "_teacupScandalized"
    "_teacupShyBlush"
    "_teaDrink"
    "_teaExplain"
    "_teaExplainBlush"
    "_teaFibbinSad"
    "_teaHeadHand"
    "_teaHeadTilt"
    "_teaHeadTiltTalk"
    "_teaHold"
    "_teaHeadLookDown"
    "_teaHeadLookDownTalk"
    "_teaNervous"
    "_teaOffer"
    "_teaOh"
    "_teaSadSmile"
    "_teaPoint"
    "_teaPointUp"
    "_teaShyBlush"
    "_teaToast"
    "_teaWink"
    "_teethPoint"
    "_terrifiedBlush"
    "_terrifiedBlushLeft"
    "_terrifiedBlushLeftExtra"
    "_terrifiedBlushNoFire"
    "_toastEat"
    "_toastOffer"
    "_toastPoint"
    "_triggerAdoringBlush"
    "_triggerExplain"
    "_triggerIntro"
    "_triggerNeutral"
    "_triggerSmile"
    "_triggerWave"
    "_triggerWink"
    "_twoTea"
    "_wetWipe"
    "_wrist"
    "_wristNoFire"]

   "Lucio"
   ["_explainDown"
    "_explainForward"
    "_idol"
    "_jammin"
    "_lament"
    "_micCool"
    "_micExplain"
    "_micFist"
    "_micNeutral"
    "_micPoint"
    "_neutral"
    "_ominous"
    "_point"
    "_pointUp"
    "_ponder"
    "_prayExplain"
    "_prayExplainHappy"
    "_prayExplainNeutral"
    "_self"
    "_smile"
    "_smug"
    "_weeping"
    "_wipeTears"]

   "McCree"
   ["_coffeeDrink"
    "_coffeeHold"
    "_coffeePoint"
    "_coffeeSteal"
    "_cornbreadEat"
    "_cornbreadEat2"
    "_drink"
    "_drinkCheers"
    "_drinkConfused"
    "_drinkHold"
    "_drinkLaugh"
    "_drinkLeanBack"
    "_drinkOof"
    "_drinkPoint"
    "_drinkPointUp"
    "_drinkWave"
    "_exclaim"
    "_explain"
    "_fingerGuns"
    "_hotdog"
    "_laugh"
    "_leanBack"
    "_leanIn"
    "_neutral"
    "_phoneShow"
    "_phoneSteal"
    "_phoneSteal2"
    "_phoneTexting"
    "_point"
    "_pointAngry"
    "_pointDown"
    "_pointUp"
    "_salty"
    "_selfie"
    "_skates"
    "_wave"]

   "Mei"
   ["_angry"
    "_awkward"
    "_bye"
    "_collar"
    "_confused"
    "_explain"
    "_fist"
    "_gun"
    "_handChin"
    "_headHand"
    "_neutral"
    "_pointUp"
    "_rollEyes"
    "_shush"
    "_thumbsUp"
    "_TP"]

   "Mercy"
   ["_angry"
    "_drinkGesture"
    "_explain"
    "_explainOffended"
    "_fly"
    "_gollyFist"
    "_lookAwayExplain"
    "_lookBack"
    "_neutral"
    "_pointUp"
    "_reverseFly"
    "_smile"
    "_smileExplain"
    "_surprised"
    "_thinkingExplain"
    "_wave"
    "_wrist"]

   "Moira"
   ["_bloodyExplain"
    "_burger"
    "_explain"
    "_explainLaugh"
    "_faceWipe"
    "_ghost"
    "_ghostLeave"
    "_lookBack"
    "_neutral"
    "_pickles"
    "_pour1"
    "_pour2"
    "_shrimp"]

   "Orisa"
   ["_handShoulder"
    "_neutral"
    "_neutralHappy"
    "_pointUp"
    "_wave"]

   "Pharah"
   ["_AnguishGay"
    "_anguishMild"
    "_bold"
    "_boldAngry"
    "_boldBack"
    "_breathalyzerTalk"
    "_cold"
    "_determined"
    "_determinedDown"
    "_determinedNoBlush"
    "_downcast"
    "_embarassed"
    "_embarassedAngryBack"
    "_embarassedBack"
    "_embarassedForward"
    "_explain"
    "_explainBack"
    "_explainConcerned"
    "_explainDowncast"
    "_explainEmbarassed"
    "_explainEyesClosed"
    "_explainEyesClosedSad"
    "_fist"
    "_flying" {:sizing {:anchor [0 0] :size [2048 3080]}}
    "_frown"
    "_geez"
    "_goodnight"
    "_helloAwkward"
    "_helloNeutral"
    "_helmetNervous"
    "_karkadeBold"
    "_karkadeDown"
    "_karkadeDrink"
    "_karkadeEmbarassed"
    "_karkadeExplainConfident"
    "_karkadeExplainUnsure"
    "_karkadeHold"
    "_karkadeLaugh"
    "_karkadeTalk"
    "_karkadeUncomfortable"
    "_knuckles"
    "_laugh"
    "_lookAway"
    "_lookUp"
    "_neutral"
    "_neutralBack"
    "_neutralBackBlush"
    "_phoneAnguish"
    "_phoneNeutral"
    "_phoneTalk"
    "_pointUp"
    "_psyched"
    "_reverse"
    "_reverseAngry"
    "_reverseBack"
    "_reverseAnguish"
    "_reverseBackGlare"
    "_reverseBeer"
    "_reverseBeerDrink"
    "_reverseBold"
    "_reverseBoldAngryBack"
    "_reverseBoldBack"
    "_reverseCold"
    "_reverseDeterminedDown"
    "_reverseDowncast"
    "_reverseEmbarassed"
    "_reverseEmbarassedBack"
    "_reverseExplain"
    "_reverseExplainBack"
    "_reverseExplainBackBlush"
    "_reverseExplainDowncast"
    "_reverseExplainEyesClosed"
    "_reverseExplainGlare"
    "_reverseExplainUnsure"
    "_reverseEyeRoll"
    "_reverseFist"
    "_reverseHoldSkates"
    "_reverseKnuckles"
    "_reverseKnucklesTalk"
    "_reverseLaugh"
    "_reverseLeanIn"
    "_reverseLookUp"
    "_reverseNeutral"
    "_reversePeek"
    "_reversePointUp"
    "_reversePsyched"
    "_reverseSalute"
    "_reverseSurprised"
    "_reverseUncomfortable"
    "_reverseWhisperBack"
    "_reverseWink"
    "_smile"
    "_surprised"
    "_uncomfortable"
    "_underBold"
    "_underCarry"
    "_underCarry2"
    "_underEmbarassed"
    "_underExplainEmbarassed"
    "_underFlirty"
    "_underHandHold"
    "_underHandLead"
    "_underHandShrug"
    "_underHug"
    "_underNeutral"
    "_underNeutralBlush"
    "_underNeutralBlushTalk"
    "_underScandalized"
    "_underShrug"
    "_underSmileDown"
    "_underSmooch"
    "_underWow"
    "_winkBack"]

   "Phones"
   ["_junkratHand"
    "_mccreeHand"
    "_pharahHand"
    "_reaperHand"
    "_soldierHand"
    "_sombraHand"
    "_symHand"]

   "Photos"
   ["_familyPhoto"
    "_fancyDress"
    "_fancyDressJunk"
    "_golf"
    "_guyFieri"
    "_indiana"
    "_junkratDate0"
    "_junkratDate1"
    "_junkratDate1Junk"
    "_junkratDate2"
    "_junkratDate2Junk"
    "_junkratDate3"
    "_junkratDate3Junk"
    "_mathletes"
    "_pharahDate0"
    "_pharahDate1"
    "_pharahDate2"
    "_pharahDate3"
    "_rollerSkate"
    "_sombraDate0"
    "_sombraDate1"
    "_sombraDate2"
    "_sombraDate3"
    "_wanted"]

   "Reaper"
   ["_exasperated"
    "_explain"
    "_extra"
    "_fingerGuns"
    "_headphones"
    "_leave"
    "_neutral"
    "_phoneCheck"
    "_point-up"
    "_point"
    "_reverseExplain"
    "_reverseExtra"
    "_reverseLeave"
    "_reverseNeutral"
    "_reversePoint"
    "_reversePointUp"
    "_reverseRosaryExplain"
    "_reverseRosaryNeutral"
    "_reverseRosaryPointUp"
    "_rosaryExplain"
    "_rosaryNeutral"
    "_rosaryOffer"
    "_rosaryPoint"
    "_rosaryPointUp"
    "_rosarySalt"
    "_spit"
    "_whisper"]

   "Reinhardt_Table"
   ["_beerCheers" {:sizing {:anchor [0 0] :size [3184 1080]}}
    "_beerDrink" {:sizing {:anchor [0 0] :size [3184 1080]}}
    "_beerLaugh" {:sizing {:anchor [0 0] :size [3184 1080]}}
    "_beerLookUp" {:sizing {:anchor [0 0] :size [3184 1080]}}
    "_beerNeutral" {:sizing {:anchor [0 0] :size [3184 1080]}}
    "_beerTwo" {:sizing {:anchor [0 0] :size [3184 1080]}}]

   "Reinhardt"
   ["_eek"
    "_explainConcerned"
    "_explainConcernedBack"
    "_explainSmile"
    "_explainSmileBack"
    "_laugh"
    "_lookAway"
    "_neutral"
    "_nostalgic"
    "_pointUp"
    "_wince"]

   "Roadhog"
   [ "_basket" {:sizing {:anchor [352 120] :size [2400 1200]}}
     "_basket2" {:sizing {:anchor [352 120] :size [2400 1200]}}
     "_basketExplain" {:sizing {:anchor [352 120] :size [2400 1200]}}
     "_drink" {:sizing {:anchor [352 120] :size [2400 1200]}}
    "_explain" {:sizing {:anchor [352 120] :size [2400 1200]}}
    "_hook" {:sizing {:anchor [352 120] :size [2400 1200]}}
    "_neutral" {:sizing {:anchor [352 120] :size [2400 1200]}}
    "_neutral2" {:sizing {:anchor [352 120] :size [2400 1200]}}
    "_pointUp" {:sizing {:anchor [352 120] :size [2400 1200]}}
    "_quicheOffer" {:sizing {:anchor [352 120] :size [2400 1200]}}
    "_shrug" {:sizing {:anchor [352 120] :size [2400 1200]}}
    "_smooch" {:sizing {:anchor [352 120] :size [2400 1200]}}
    "_thumbPoint" {:sizing {:anchor [352 120] :size [2400 1200]}}
    "_toast" {:sizing {:anchor [352 120] :size [2400 1200]}}
    "_toastBite" {:sizing {:anchor [352 120] :size [2400 1200]}}
    "_toastWipe" {:sizing {:anchor [352 120] :size [2400 1200]}}
    "_wave" {:sizing {:anchor [352 120] :size [2400 1200]}}]

   "Soldier76"
   ["_armsCrossed"
    "_armsCrossedReverse"
    "_facePalmReverse"
    "_fistPalm"
    "_grillCornbread"
    "_grillCornbreadPointUp"
    "_grillCornbreadTalk"
    "_grillDrink"
    "_grillDrink1"
    "_grillDrink2"
    "_grillDrink3"
    "_grillDrinkCheers"
    "_grillDrinkExplain"
    "_grillDrinkNeutral"
    "_grillDrinkPointUp"
    "_grillHotdogs"
    "_grillHotdogsDrink"
    "_handsHips"
    "_handUpReversed"
    "_point"
    "_pointUp"
    "_pointUpReversed"]

   "Sombra"
   ["_awkward"
    "_awkwardSad"
    "_browseConcerned"
    "_browseConcernedTalk"
    "_browseDickButt"
    "_browseExplain"
    "_browseHome"
    "_browsePhone"
    "_browseTranslation"
    "_browseTranslationSmile"
    "_browseXFiles"
    "_camo"
    "_dismayed"
    "_drink"
    "_drinkArmUp"
    "_drinkAwkward"
    "_drinkAww"
    "_drinkExplain"
    "_drinkExplainAngry"
    "_drinkExplainConfused"
    "_drinkFlirty"
    "_drinkHack"
    "_drinkLaugh"
    "_drinkLeanIn"
    "_drinkNeutral"
    "_drinkNostalgic"
    "_drinkPft"
    "_drinkPoint"
    "_drinkShrug"
    "_drinkTongue"
    "_drinkWave"
    "_explain"
    "_explainAngry"
    "_explainAngryBlush"
    "_explainAwkward"
    "_explainConcerned"
    "_explainCondescend"
    "_explainCondescendSmile"
    "_explainHand"
    "_fistHand"
    "_fistHandSurprised"
    "_flirty"
    "_frown"
    "_hack"
    "_introBehind"
    "_laugh"
    "_leanin"
    "_leanInConcerned"
    "_nervousBlush"
    "_neutral"
    "_neutral2"
    "_nostalgic"
    "_nostalgicSad"
    "_point"
    "_puppet"
    "_reverse"
    "_reverseAwkward"
    "_reverseAwkwardExplain"
    "_reverseExplain"
    "_reverseExplainHand"
    "_reverseExplainSad"
    "_reverseFistHand"
    "_reverseGhost"
    "_reverseLaugh"
    "_reverseNostalgic"
    "_reverseNostalgicAngry"
    "_reversePointUp"
    "_reverseRollEyes"
    "_rollEyes"
    "_salute"
    "_self"
    "_selfConfused"
    "_shhReaper"
    "_shrug"
    "_shrugAwkwardBlush"
    "_shrugAwkward"
    "_smile"
    "_surprised"
    "_thinking"
    "_tongue"
    "_vodkaHoldOn"
    "_vodkaShrug"
    "_wave"
    "_wink"
    "_whisper"
    "_yell"]

   "Symmetra"
   ["_1000Mile"
    "_angry"
    "_asleep"
    "_asleepBear"
    "_awkward"
    "_awkwardTalk"
    "_beerCheers"
    "_bewildered"
    "_bigSmile"
    "_bored"
    "_breathalyzerConfused"
    "_breathalyzerHold"
    "_chocoChew"
    "_confused"
    "_cornbreadChew"
    "_coy"
    "_craftBrake"
    "_craftPrinter"
    "_craftShim"
    "_craftTurret"
    "_dancePose"
    "_dirtyHands"
    "_dirtyHandsLeft"
    "_dissappointed"
    "_distracted"
    "_embarassed"
    "_explain"
    "_explainAngry"
    "_explainSad"
    "_explainUncomfortable"
    "_explainWTF"
    "_eyeRoll"
    "_flirty"
    "_frown"
    "_frustrated"
    "_frustratedConfused"
    "_hairFire"
    "_hairFire2"
    "_hairFireBlush"
    "_handWipe"
    "_helloNeutral"
    "_helloWarm"
    "_helmetBewildered"
    "_helmetLaugh"
    "_helmetNeutral"
    "_interested"
    "_karkade-Drink"
    "_karkadeBlush"
    "_karkadeConcerned"
    "_karkadeDown"
    "_karkadeHold"
    "_karkadeLaugh"
    "_karkadeSmile"
    "_karkadeTalk"
    "_laugh"
    "_laughEvil"
    "_lookUpBlush"
    "_neutral"
    "_no"
    "_noSmile"
    "_noUncomfortable"
    "_phoneCheck"
    "_phoneCheckTalk"
    "_phoneCheckTerrified"
    "_phoneCoy"
    "_phoneSigh"
    "_phoneSkeptical"
    "_pointBack"
    "_pointEyes"
    "_pointEyes2"
    "_pointUp"
    "_quiche"
    "_quicheChew"
    "_quicheChew2"
    "_quicheHand"
    "_reverse"
    "_sad"
    "_sadSmile"
    "_sass"
    "_sassAngry"
    "_scandalized"
    "_skeptical"
    "_skepticalDown"
    "_slap"
    "_smile"
    "_smug"
    "_strainedSmile"
    "_teaBlush"
    "_teaConcerned"
    "_teacupConcerned"
    "_teacupDrink"
    "_teacupExplain"
    "_teacupExplainUncomfortable"
    "_teacupHold"
    "_teacupLookBack"
    "_teacupLookDown"
    "_teacupSadSmile"
    "_teacupSass"
    "_teacupSmile"
    "_teacupThinking"
    "_teacupThinkingSad"
    "_teaDrink"
    "_teaHold"
    "_teaSadSmile"
    "_teaSass"
    "_teaSmile"
    "_teaThinking"
    "_teaToast"
    "_thinking"
    "_toast"
    "_toastBite"
    "_toastChew"
    "_toastHand"
    "_toastPoint"
    "_WTF"
    "_yawn"
    "_yawnBear"]

   "Symmetra_Sombra"
   ["_lookUpSadSmile"
    "_neutral"
    "_neutralSad"
    "_neutralSadLookUp"
    "_smooch"
    "_sombraExplain"
    "_sombraExplainBlush"
    "_sombraExplainLookUp"
    "_sombraExplainSad"
    "_sombraExplainSkeptical"
    "_sombraLaugh"
    "_sombraTalk"
    "_sombraTalkConfused"
    "_sombraTalkLookUp"
    "_sombraTalkSad"
    "_sombraTalkSadSadSmile"
    "_sombraTalkSadSmile"
    "_sombraTalkSmile"
    "_sombraTalkSmirk"
    "_symmetraBewildered"
    "_symmetraConfused"
    "_symmetraExplain"
    "_symmetraExplainConcerned"
    "_symmetraExplainEarnest"
    "_symmetraExplainUncomfortable"
    "_symmetraLaugh"
    "_symmetraStrainedSmile"
    "_symmetraStrainedSmileBlush"
    "_symmetraTalkSadSmile"
    "_symmetraThinking"]

   "Torbjorn"
   ["_cranky"
    "_crankyCart"
    "_handHip"
    "_handHipAngry"
    "_handHipAngryCart"
    "_holdCheek"
    "_lookAway"
    "_neutral"
    "_pat"
    "_point"
    "_pointUp"
    "_slapped"]

     "Tracer"
   ["_bewildered"
    "_explain"
    "_flyers"
    "_neutral"
    "_smile"
    "_sonic"
    "_wave"]

   "Widowmaker"
   ["_bird"
    "_despise"
    "_explain"
    "_explainBack"
    "_explainSmile"
    "_eyeRoll"
    "_laugh"
    "_leave"
    "_neutral"
    "_neutralRight"
    "_point"
    "_tch"]

   "Winston"
   ["_airQuotes"
    "_explain"
    "_nervous"
    "_neutral"
    "_pointUp"
    "_self"]

   "Zarya"
   ["_angryTalk"
    "_neutral"
    "_point"
    "_pointUp"
    "_skeptical"
    "_yellBack"]

   "Zarya_Mei"
   ["_makeOuts"
    "_meiBlush"
    "_meiDisappointed"
    "_meiDisappointedZarya"
    "_meiEvilSmile"
    "_meiHi"
    "_meiPoint"
    "_neutralDown"
    "_neutralUp"
    "_zaryaEvilSmile"
    "_zaryaExplain"
    "_zaryaSkeptical"
    "_zaryaSmile"
    "_zaryaSmutty"
    "_zaryaYell"]

   "Zarya_Rein"
   ["_explain"
    "_handshake"
    "_hello"
    "_neutralLeft"
    "_neutralRight"
    "_ofCourse"
    "_pleased"
    "_pointRein"
    "_pointSalty"
    "_pointZarya"
    "_pointZaryaNoShot"
    "_protein"
    "_salty"
    "_shot"
    "_smutty"]

   "Zenyatta"
   ["_confused"
    "_excited"
    "_explain"
    "_fingerGuns"
    "_focus"
    "_neutral"
    "_pointUp"
    "_pray"
    "_wave"]})

(def options
  {:path "img/Characters/"
   :ext  "png"
   :host "http://syms-qual.s3-website-us-east-1.amazonaws.com/"})

(def data (data/reify-characters structure options))
