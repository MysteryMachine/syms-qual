(ns syms-qual.data.animation)

(defn scoot
  ([n] {:alignment [n 0]})
  ([n m t] {:alignment [n 0]
            :animate [m 0]
            :time (* 1000 t)
            :tween-type :miranda/basic}))
