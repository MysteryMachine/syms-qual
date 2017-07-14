(ns syms-qual.core
  (:require [carmen.miranda :as miranda]
            [syms-qual.data.scenes :as scenes]))

(enable-console-print!)

(def graph
  {:scenes scenes/data})

(def base-state
  {:scene [:title-screen [:bg :default] 0]
   :points/sombra 0
   :points/junkrat 0
   :points/pharah 0})

(def options
  {:miranda/click-delay 100
   :miranda/auto-save true
   :miranda/native-resolution [2048 1080]})

(defmethod miranda/render :intro
  [{:keys [window] :as state} transition-fn graph options]
  [:div.base-scene
   {:style {:background-image "url(\"img/Backgrounds/title_screen_bg.png\")"
            :height (str (:y window) "px")
            :width (str (:x window) "px")}}])

(defonce state-atom (reagent.core/atom base-state))

(miranda/samba! "app" state-atom graph options)
