(ns carmen.extras
  (:require [carmen.impl.events :as events]))

(defn full-screen-button [state-atom]
  [:div.miranda.full-screen-button
   {:on-click
    (fn []
      (swap! state-atom events/full-screen!))}])

(defn fullscreen? []
  (or document.webkitIsFullScreen
      document.fullscreen
      document.mozFullScreen))
