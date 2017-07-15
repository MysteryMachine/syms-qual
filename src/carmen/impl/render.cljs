(ns carmen.impl.render
  (:require [clojure.string :as str]
            [carmen.util :as util :refer [pct px default-render-options]]))

(defn render-character-xf [{:keys [x y]} elapsed-time options]
  (map
   (fn [{:keys [img sizing] :as animation-map}]
     (let [[nrx nry :as native-res] (:miranda/native-resolution options)
           [ix iy] (:size sizing native-res)
           [ax ay] (:anchor sizing [0 0])
           {[i j] :position opacity :opacity} (util/tween animation-map elapsed-time)
           yr (/ y nry)
           dpad (px (/ (- x (* yr ix)) 2))]
       [:div.character
        {:style
         {:height (px (* yr iy))
          :width (px x)
          :margin-left dpad
          :margin-right dpad}}
        [:img.character
         {:style {:opacity (str opacity)
                  :left (pct i)
                  :top (pct j)}
          :src img}]]))))

(defn render-characters [characters window elapsed-time options]
  (into [:div.characters] (render-character-xf window elapsed-time options) characters))

(defn dialogue-textbox [{:keys [window] :as state} transition-fn graph options]
  (let [{border-width :dialogue/border-width
         padding :dialogue/padding
         margin :dialogue/margin
         ratio :dialogue/ratio}
        (merge util/default-render-options options)
        y (:y window)
        x (:x window)
        height (* y ratio)
        top (* (- 1 ratio) (:y window))
        textbox-height (- height (* 2 (+ border-width padding margin)))
        speaker-text (util/speaker state graph)]
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
      [:div.miranda.dialogue.text (util/dialogue state graph)]]]))

(defn narration-textbox [{:keys [window] :as state} transition-fn graph options]
  (let [{border-width :narration/border-width
         padding :narration/padding
         margin :narration/margin
         y-ratio :narration/y-ratio
         x-ratio :narration/x-ratio}
        (merge util/default-render-options options)
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
      [:div.narration.miranda.text (util/subscene state graph)]]]))

(defn filter-valid-options-xf [state]
  (filter
   (fn [option]
     ((:conditional option) state))))

(defn text-option-textbox [{:keys [window] :as state} transition-fn graph options]
  (let [{border-width :text-option/border-width
         padding :text-option/padding
         margin :text-option/margin
         y-ratio :text-option/y-ratio
         x-ratio :text-option/x-ratio}
        (merge util/default-render-options options)
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
       [:div.text-option.miranda.text (:text (util/subscene state graph))]
       (into
        [:div.miranda.text-option.options]
        (comp
         (filter-valid-options-xf state)
         (map
           (fn [option]
             [:div.miranda.text-option.options.option-outer
              [:span.miranda.text-option.options.option-inner
               {:on-click (partial transition-fn (:transition option))}
               (:text option)]])))
        (util/scene-options state graph))]]]))

(defn option-textbox [{:keys [window] :as state} transition-fn graph options]
  (let [{border-width :option/border-width
         padding :option/padding
         margin :option/margin
         ratio :option/ratio}
        (merge default-render-options options)
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
       (util/speaker state graph)]
      (into
       [:div.miranda.option-render.options]
       (comp
        (filter-valid-options-xf state)
        (map
          (fn [option]
            [:div.miranda.option-render.options.option-outer
             [:span.miranda.option-render.options.option-inner
              {:on-click (partial transition-fn (:transition option))}
              (:text option)]])))
       (util/scene-options state graph))]]))

(defn render-narration
  [{:keys [window] :as state} transition-fn graph options]
  [:div.base-scene
   {:style (merge
            {:height (px (:y window))
             :width (px (:x window))}
            (util/style state graph))}
   (narration-textbox state transition-fn graph options)])

(defn render-just-characters
  [{:keys [window] :as state} transition-fn graph options]
  [:div.base-scene.just-characters
   {:style (merge
            {:height (px (:y window))
             :width (px (:x window))}
            (util/style state graph))
    :on-click transition-fn}
   (render-characters (util/actors state graph) window (:miranda/time state) options)])

(defn render-dialogue
  [{:keys [window] :as state} transition-fn graph options]
  [:div.base-scene
   {:style (merge
            {:height (px (:y window))
             :width (px (:x window))}
            (util/style state graph))}
   (render-characters (util/actors state graph) window (:miranda/time state) options)
   (dialogue-textbox state transition-fn graph options)])

(defn render-options
  [{:keys [window] :as state} transition-fn graph options]
  [:div.base-scene
   {:style (merge
            {:height (px (:y window))
             :width (px (:x window))}
            (util/style state graph))}
   (render-characters (util/actors state graph) window (:miranda/time state) options)
   (option-textbox state transition-fn graph options)])

(defn render-text-options
  [{:keys [window] :as state} transition-fn graph options]
  [:div.base-scene
   {:style (merge
            {:height (px (:y window))
             :width (px (:x window))}
            (util/style state graph))}
   (text-option-textbox state transition-fn graph options)])

(defn default-loading-screen [{:keys [window] :as state}]
  [:div.base-scene.loading-screen
   {:style (merge
            {:height (px (:y window))
             :width (px (:x window))})}])

(def empty-style
  {:height "0px"
   :width "0px"
   :padding "0"
   :margin "0"})

(defn preload [state graph loaded]
  (let [scene (util/major-scene state graph)]
    (into
     [:div.preload {:style empty-style}]
     (map-indexed
      (fn [i img]
        [:img {:style empty-style
               :src img
               :onLoad (loaded i)}]))
     (:miranda.internal/preload scene))))
