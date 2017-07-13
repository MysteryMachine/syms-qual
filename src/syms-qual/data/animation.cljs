(ns syms-qual.data.animation)

(defn scoot
  ([n]
   {:finish {:position [n 0]}})
  ([n m t]
   {:start {:position [n 0]}
    :finish {:position [m 0]}
    :time (* 1000 t)
    :tween-type :miranda/cubic}))
