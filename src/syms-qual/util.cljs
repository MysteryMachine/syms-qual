(ns syms-qual.util)

;; TODO: refactor into main lib?
(defn inc-transition [transition point-name]
  [:transition :miranda/mutation->basic
   [transition
    (fn [state]
      (update state point-name inc))]])

(defn toggle-transition [transition toggle-name]
  [:transition :miranda/mutation->basic
   [transition
    (fn [state]
      (update state toggle-name not))]])
