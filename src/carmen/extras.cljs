(ns carmen.extras
  (:require [carmen.impl.events :as events]
            [carmen.miranda :as miranda]))

(defn full-screen-button [state-atom]
  [:div.miranda.full-screen-button
   {:on-click
    (fn []
      (swap! state-atom events/full-screen!))}])

(defn fullscreen? []
  (or document.webkitIsFullScreen
      document.fullscreen
      document.mozFullScreen))

(defn fast-forward [state-atom graph options]
  [:div.miranda.fast-forward-button
   {:on-mouse-down
    (fn []
      (when-not (miranda/in-loading-screen? @state-atom)
        (swap! state-atom #(assoc-in % [:miranda/stateful :ff/clicking] true))
        (let [f (miranda/transition! state-atom graph options)
              event (fn event []
                      (js/setTimeout
                       #(when (and
                               (not (miranda/in-loading-screen? @state-atom))
                               (get-in @state-atom [:miranda/stateful :ff/clicking]))
                          (f)
                          (event))
                       200))]
         (event))))
    :on-mouse-up
    (fn []
      (swap! state-atom #(assoc-in % [:miranda/stateful :ff/clicking] false)))}])

(defn mute-button [state-atom]
  (let [muted (:miranda/muted @state-atom)]
    [(if muted
       :div.miranda.not-muted.mute-button
       :div.miranda.muted.mute-button)
     {:on-click
      (fn []
        (set! window.sound.muted muted)
        (set! window.audio.muted muted)
        (swap! state-atom #(update % :miranda/muted not)))}]))
