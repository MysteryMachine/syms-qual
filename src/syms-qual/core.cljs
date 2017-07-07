(ns syms-qual.core
  (:require [reagent.core :as reagent :refer [atom]]
            [carmen.miranda :as miranda]
            [syms-qual.data :refer [base-state graph]]))

(enable-console-print!)

(defonce state-atom (atom base-state))

(def options
  {:miranda/click-delay 100})

(def app (miranda/samba state-atom graph options))

;; TODO: This is ripe for a more declarative interface
(let [root (. js/document (getElementById "app"))]
  (miranda/clear-listeners!)
  (miranda/register-listener! state-atom "resize" (miranda/resize-event state-atom) true)
  (miranda/animation! state-atom 24)
  (reagent/render [app] root))


