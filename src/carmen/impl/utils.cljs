(ns carmen.impl.utils)

(defn -- [a b]
  (let [d (/ a b)]
    (if (> d 1) 1 d)))

(defn linear-tween
  [i f t tf]
  (+ i (* (- f i) (-- t tf))))

(defn cubic-tween [i f t tf]
  (let [p (-- t tf)]
    (+ i (* (- f i) (- (* 3 p p) (* 2 p p p))))))

(defn generic-tween
  [{:keys [tween-type start finish time]} elapsed-time transition-fn]
  (let [[xi yi] (:position start [0 0])
        [xf yf] (:position finish [0 0])
        oi (:opacity start 1)
        of (:opacity finish 1)]
    {:position [(transition-fn xi xf elapsed-time time)
                (transition-fn yi yf elapsed-time time)]
     :opacity  (transition-fn oi of elapsed-time time)}))
