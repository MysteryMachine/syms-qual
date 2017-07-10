(ns cljs.user
  (:require [syms-qual.core :refer [state-atom]]
            [syms-qual.data :refer [graph]]
            [carmen.util :as u]))

(defn s [args]
  (swap! state-atom (fn [s] (assoc s :scene args))))
