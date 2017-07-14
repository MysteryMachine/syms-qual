(ns syms-qual.data.scenes.title-screen)

(def data
  {[:bg :default]
   {:transition/type :miranda/dynamic
    :render-type :intro
    :subscenes
    [{:scene-options
      [{:text "New Game"
        :conditional (constantly true)
        :transition
        {:transition/type :miranda/basic,
         :transition/args []}}
       {:text "Load Game"
        :conditional (constantly true)
        :transition
        {:transition/type :miranda/load
         :transition/args nil}}]}]}})
