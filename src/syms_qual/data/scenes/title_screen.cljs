(ns syms-qual.data.scenes.title-screen)

(def data
  {[:bg :default]
   {:transition/type :syms-qual/intro
    :render-type :syms-qual/intro}

   [:bg :new-game-guard]
   {:transition/type :syms-qual/intro
    :render-type :syms-qual/new-game-guard}

   [:bg :options]
   {:transition/type :syms-qual/intro
    :render-type :syms-qual/options}})
