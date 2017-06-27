(ns syms-qual.core
  (:require [reagent.core :as reagent :refer [atom]]
            [carmen.miranda :as miranda]
            [syms-qual.data :refer [base-state graph]]))

(enable-console-print!)

(defonce state-atom (atom base-state))

(def app (miranda/samba state-atom graph {}))

;; TODO: This is ripe for a more declarative interface
(let [root (. js/document (getElementById "app"))
      resize-event! (miranda/resize-event state-atom)
      click-event! (miranda/transition-event state-atom graph)]
  (miranda/clear-listeners!)
  (resize-event!)
  (miranda/register-listener! state-atom root "resize" resize-event!)
  (miranda/register-listener! state-atom root "click" click-event!)
  (reagent/render [app] root))


