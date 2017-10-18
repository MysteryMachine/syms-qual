(ns syms-qual.data.scenes.lijang.winston)

(def start-date
  [:transition :miranda/mutation->basic
   [[:-> [:anubis :pharah :confirm]]
    (fn []
      ;;TODO: mutate state to indicate date
      )]])

(def data
  {[:lijang :winston 0]
   [:miranda/dialogue
    ["Symmetra" [] "You must be Dr. Winston. Hello, I do not believe we have had the chance to meet."]
    ["Winston" [] "Dr. Winston was my mentor, just call me Winston. But yes! Ms. Vaswani! I’m thrilled to have such a skilled Architech as yourself joining our ranks! Vishakr’s hard light technology holds wondrous opportunities for the world."]
    ["Symmetra" [] "I agree. And thank you."]
    ["Winston" [] "Let’s talk strategy, shall we?"]
    ["Symmetra" [] "Straight to the point, I admire that."]
    ["Winston" [] "Ah yes. This Overwatch program was my idea after all, trying as hard as I can just seems appropriate."]
    ["Symmetra" [] "I agree."]
    ["Winston" [] "I’ve, haha, even gotten a cute nickname from some of our younger members. They call me The Tryhard. I don’t let it get to my head. Picking a strong composition is the right thing to do."]
    ["Symmetra" [] "You’re very practical."]
    ["Winston" [] "I must admit, though. I’m a little worried about our draft. Our entire composition is very dive oriented, other than you."]
    ["Symmetra" [] "I suppose I will have some trouble in a team of our structure."]
    ["Winston" [] "I do not mean to offend! You’re a wonderful artist, and engineer, but the mobile nature of our team means we’ll need to employ science in order to fully utilize you."]
    ["Symmetra" [] "I see. What do you propose?"]
    ["Winston" [] "Let us work together to augment my barrier projector technology with your hard light technology. I believe if we do this, we will be able to provide superior support to our mobile flankers."]
    ["Symmetra" [] "That is a creative solution!"]
    ["Winston" [] "I think it will greatly improve our ability to stay on the objective."]
    :-> [:lijang :winston :choice]]

   [:lijang :winston :choice]
   [:miranda/text-option
    "What will you do?"
    ["Believe in the power of science." (constantly true) start-date]
    ["Converse with your other teammates" (constantly true)
     [:lijang :winston :no]]]

   [:lijang :winston :yes]
   [:miranda/dialogue
    ["Winston" [] "We don’t have much time to figure this out. Let’s hurry!"]
    :-> [:lijang :winston :cutscene]]

   [:lijang :winston :no]
   [:miranda/dialogue
    ["Symmetra" [] "I’d like to consult with other teammates to get their strategical take."]
    ["Winston" [] "Of course. Well, come see me if you want to give this a shot."]
    :-> [:lijang :choice]]

   [:lijang :winston :cutscene]
   [:miranda/narration
    "While the Winston’s hard light augmented shield was not perfect, it was still a powerful addition to the team. Despite this stratagem, it seemed like your engineering success was more the result of several characters standing on the point. Your team manages to take the match 3-1."
    :-> [:eichenwalde :intro]]})
