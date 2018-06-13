(ns syms-qual.util)

;; TODO: refactor into main lib?
(defn inc-transition
  [transition & point-names]
  [:transition :miranda/mutation->basic
   [transition
    (fn [state]
      (reduce
       (fn [state point-name]
         (update state point-name inc))
       state
       point-names))]])

(defn toggle-transition [transition toggle-name]
  [:transition :miranda/mutation->basic
   [transition
    (fn [state]
      (update state toggle-name not))]])
