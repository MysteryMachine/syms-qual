(ns cljs.user
  (:require [syms-qual.core :refer [load save state-atom]]
            [carmen.util :as u]))

(defn s [args]
  (swap! state-atom (fn [s] (assoc s :scene args))))

