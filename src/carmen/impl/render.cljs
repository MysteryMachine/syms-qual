(ns carmen.impl.render
  (:require [clojure.string :as str]))

;; CSS Helpers

(defn px [s] (str s "px"))
(defn pct [s] (str s "%"))

;; Data Helpers
;; TODO: Move these fns

(defn scene-data [state graph]
  (let [[major minor & _] (:scene state)]
    (-> (:scenes graph)
        (get major)
        (get minor))))

(defn style [state graph]
  (:style (scene-data state graph)))

(defn render-type [state graph]
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
    (get <> :characters)))

(defn dialogue [state graph]
  (get (subscene state graph) :dialogue))

(defn speaker [state graph]
  (get (subscene state graph) :speaker))

(defn scene-options [state graph]
  (get (subscene state graph) :scene-options))

;; Rendering

;; TODO: This is a public interface, so move it there
(defmulti tween
  (fn [animation-map elapsed-time]
    (:tween-type animation-map)))

(defmethod tween :miranda/basic
  [{:keys [tween-type alignment animate time]} elapsed-time]
  (let [[ix iy] alignment
        [fx fy] animate
        dx (- fx ix)
        dy (- fy iy)
        dt-by-t (/ elapsed-time time)
        pct (if (> dt-by-t 1) 1 dt-by-t)]
    [(+ ix (* dx pct)) (+ iy (* dy pct))]))

(defmethod tween :default
  [animation-map elapsed-time]
  (:alignment animation-map))

(defn render-character-xf [elapsed-time]
  (map
   (fn [{:keys [img] :as animation-map}]
     (let [[x y] (tween animation-map elapsed-time)]
       [:div.character
        {:style
         {:background-image img
          :left (pct x)
          :top (pct y)}}]))))

(defn render-characters [characters elapsed-time]
  (into [:div.characters] (render-character-xf elapsed-time) characters))

;; TODO: Move to an api ns
;; TODO: I've hardcoded a bunch of math assumptions in here. If I didn't,
;; i could have a generalized model for all the textboxes and save on code
(def default-options
  {:dialogue/border-width 3
   :dialogue/padding 16
   :dialogue/margin 5
   :dialogue/ratio 0.25

   :option/border-width 3
   :option/padding 16
   :option/margin 5
   :option/ratio 0.25

   :text-option/border-width 3
   :text-option/padding 16
   :text-option/margin 5
   :text-option/y-ratio 0.4
   :text-option/x-ratio 0.45

   :narration/border-width 3
   :narration/padding 16
   :narration/margin 5
   :narration/y-ratio 0.5
   :narration/x-ratio 0.8})

(defn dialogue-textbox [{:keys [window] :as state} transition-fn graph options]
  (let [{border-width :dialogue/border-width
         padding :dialogue/padding
         margin :dialogue/margin
         ratio :dialogue/ratio}
        (merge default-options options)
        y (:y window)
        x (:x window)
        height (* y ratio)
        top (* (- 1 ratio) (:y window))
        textbox-height (- height (* 2 (+ border-width padding margin)))
        speaker-text (speaker state graph)]
    [:div.miranda.dialogue.textbox
     {:style {:height (px height)
              :width (px x)
              :top (px top)}
      :on-click transition-fn}
     [:div.miranda.dialogue.textbox-inner
      {:style
       {:border-width (px border-width)
        :padding-top (px padding)
        :padding-bottom (px padding)
        :margin (px margin)
        :height (px textbox-height)}}
      (when speaker-text [:div.miranda.dialogue.textbox-speaker speaker-text])
      [:div.miranda.dialogue.text (dialogue state graph)]]]))

(defn narration-textbox [{:keys [window] :as state} transition-fn graph options]
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
              :left (px left)}
      :on-click transition-fn}
     [:div.miranda.narration.textbox-inner
      {:style
       {:border-width (px border-width)
        :padding-top (px padding)
        :padding-bottom (px padding)
        :margin (px margin)
        :height (px textbox-height)}}
      [:div.narration.miranda.text (subscene state graph)]]]))

(defn text-option-textbox [{:keys [window] :as state} transition-fn graph options]
  (let [{border-width :text-option/border-width
         padding :text-option/padding
         margin :text-option/margin
         y-ratio :text-option/y-ratio
         x-ratio :text-option/x-ratio}
        (merge default-options options)
        y (:y window)
        x (:x window)
        height (* y y-ratio)
        width (* x x-ratio)
        left (* (- 1 x-ratio) x (/ 1 2))
        top (* (- 1 y-ratio) y (/ 1 2))
        textbox-height (- height (* 2 (+ border-width padding margin)))]
    [:div.miranda.text-option.textbox
     {:style {:height (px height)
              :width (px width)
              :top (px top)
              :left (px left)}}
     [:div.miranda.text-option.textbox-inner
      {:style
       {:border-width (px border-width)
        :padding-top (px padding)
        :padding-bottom (px padding)
        :margin (px margin)
        :height (px textbox-height)}}
      [:div
       [:div.text-option.miranda.text (:text (subscene state graph))]
       (into
        [:div.miranda.text-option.options]
        (map-indexed
         (fn [i text]
           [:div.miranda.text-option.options.option-outer
            [:span.miranda.text-option.options.option-inner
             {:on-click (partial transition-fn i)}
             text]]))
        (scene-options state graph))]]]))

(defn option-textbox [{:keys [window] :as state} transition-fn graph options]
  (let [{border-width :option/border-width
         padding :option/padding
         margin :option/margin
         ratio :option/ratio}
        (merge default-options options)
        y (:y window)
        x (:x window)
        height (* y ratio)
        top (* (- 1 ratio) (:y window))
        textbox-height (- height (* 2 (+ border-width padding margin)))]
    [:div.miranda.option.textbox
     {:style {:height (px height)
              :width (px x)
              :top (px top)}}
     [:div.miranda.option.textbox-inner
      {:style
       {:border-width (px border-width)
        :padding-top (px padding)
        :padding-bottom (px padding)
        :margin (px margin)
        :height (px textbox-height)}}
      [:div.miranda.option.textbox-speaker
       (speaker state graph)]
      (into
       [:div.miranda.option-render.options]
       (map-indexed
        (fn [i text]
          [:div.miranda.option-render.options.option-outer
           [:span.miranda.option-render.options.option-inner
            {:on-click (partial transition-fn i)}
            text]]))
       (scene-options state graph))]]))

(defn render-narration
  [{:keys [window] :as state} transition-fn graph options]
  [:div.base-scene
   {:style (merge
            {:height (px (:y window))
             :width (px (:x window))}
            (style state graph))}
   (narration-textbox state transition-fn graph options)])

(defn render-dialogue
  [{:keys [window] :as state} transition-fn graph options]
  [:div.base-scene
   {:style (merge
            {:height (px (:y window))
             :width (px (:x window))}
            (style state graph))}
   (render-characters (actors state graph) (:miranda/time state))
   (dialogue-textbox state transition-fn graph options)])

(defn render-options
  [{:keys [window] :as state} transition-fn graph options]
  [:div.base-scene
   {:style (merge
            {:height (px (:y window))
             :width (px (:x window))}
            (style state graph))}
   (render-characters (actors state graph) (:miranda/time state))
   (option-textbox state transition-fn graph options)])

(defn render-text-options
  [{:keys [window] :as state} transition-fn graph options]
  [:div.base-scene
   {:style (merge
            {:height (px (:y window))
             :width (px (:x window))}
            (style state graph))}
   (text-option-textbox state transition-fn graph options)])

