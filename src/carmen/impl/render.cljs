(ns carmen.impl.render
  (:require [clojure.string :as str]))

(defn px [s] (str s "px"))
(defn pct [s] (str s "%"))

(defn scene-data [state graph]
  (let [[major minor & _] (:scene state)]
    (-> (:scenes graph)
        (major)
        (minor))))

(defn style [state graph]
  (:style (scene-data state graph)))

(defn render-type [state graph options]
  (:render-type (scene-data state graph)))

(defn subscene-ptr [state]
  (let [[major minor & ptr] (:scene state)]
    ptr))

(defn subscene [state graph]
  (-> (scene-data state graph)
      (:subscenes)
      (get-in (subscene-ptr state))))

(defn actors [state graph]
  (as-> (subscene state graph) <>
    (get <> :characters)
    (map #(get-in graph (concat [:characters] %)) <>)))

(defn dialogue [state graph]
  (get (subscene state graph) :dialogue))

(defn speaker [state graph]
  (get (subscene state graph) :speaker))

(def render-character-xf
  (map
   (fn [{:keys [img alignment]}]
     (let [[x y] (or alignment [0 0])]
       [:div.character
        {:style
         {:background-image img
          :left (pct x)
          :top (pct y)}}]))))

(defn render-characters [characters]
  (into [:div.characters] render-character-xf characters))

(def default-options
  {:dialogue/border-width 3
   :dialogue/padding 16
   :dialogue/margin 5
   :dialogue/ratio 0.2

   :narration/border-width 3
   :narration/padding 16
   :narration/margin 5
   :narration/y-ratio 0.5
   :narration/x-ratio 0.8})

(defn dialogue-textbox [{:keys [window] :as state} graph options]
  (let [{border-width :dialogue/border-width
         padding :dialogue/padding
         margin :dialogue/margin
         ratio :dialogue/ratio}
        (merge default-options options)
        y (:y window)
        x (:x window)
        height (* y ratio)
        top (* (- 1 ratio) (:y window))
        textbox-height (- height (* 2 (+ border-width padding margin)))]
    [:div.miranda.dialogue.textbox
     {:style {:height (px height)
              :width (px x)
              :top (px top)}}
     [:div.miranda.dialogue.textbox-inner
      {:style
       {:border-width (px border-width)
        :padding-top (px padding)
        :padding-bottom (px padding)
        :margin (px margin)
        :height (px textbox-height)}}
      [:div.miranda.dialogue.textbox-speaker
       (str (str/upper-case (speaker state graph)) ":")]
      [:div.miranda.dialogue.text (dialogue state graph)]]]))

(defn narration-textbox [{:keys [window] :as state} graph options]
  (let [{border-width :narration/border-width
         padding :narration/padding
         margin :narration/margin
         y-ratio :narration/y-ratio
         x-ratio :narration/x-ratio}
        (merge default-options options)
        y (:y window)
        x (:x window)
        height (* y y-ratio)
        width (* x x-ratio)
        left (* (- 1 x-ratio) x (/ 1 2))
        top (* (- 1 y-ratio) y (/ 1 2))
        textbox-height (- height (* 2 (+ border-width padding margin)))]
    [:div.miranda.narration.textbox
     {:style {:height (px height)
              :width (px width)
              :top (px top)
              :left (px left)}}
     [:div.miranda.narration.textbox-inner
      {:style
       {:border-width (px border-width)
        :padding-top (px padding)
        :padding-bottom (px padding)
        :margin (px margin)
        :height (px textbox-height)}}
      [:div.narration.miranda.text (subscene state graph)]]]))

(defmulti align-characters identity)

(defmethod align-characters :default [arg] arg)

(defn render-narration
  [{:keys [window] :as state} graph options]
  [:div.base-scene
   {:style (merge
            {:height (px (:y window))
             :width (px (:x window))}
            (style state graph))}
   (narration-textbox state graph options)])

(defn render-dialogue
  [{:keys [window] :as state} graph options]
  [:div.base-scene
   {:style (merge
            {:height (px (:y window))
             :width (px (:x window))}
            (style state graph))}
   (align-characters (render-characters (actors state graph)))
   (dialogue-textbox state graph options)])

