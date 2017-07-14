(ns syms-qual.core
  (:require [carmen.miranda :as miranda]
            [carmen.util :as util]
            [syms-qual.data.scenes :as scenes]))

(enable-console-print!)

(def graph
  {:scenes scenes/data})

(def base-state
  {:scene [:title-screen [:bg :default] 0]
   :saved (util/load! :saved)
   :miranda/auto-save false
   :points/sombra 0
   :points/junkrat 0
   :points/pharah 0})

(def options
  {:miranda/click-delay 100
   :miranda/native-resolution [2048 1080]})

(def ng-scene [:route-66 [:diner :intro] 0])

(defn menu-container [transition-fn]
  (fn [name]
    (let [container
          (if transition-fn
            [:div.menu-text
             {:on-click (partial transition-fn name)}]
            [:div.menu-text.disabled])]
      (conj container [:div.inner-text [:span.arrow "▶ "] [:span name]]))))

(defn menu [load? & [transition-fn]]
  (let [container (menu-container transition-fn)]
    [:div.menu
     [:div.title [:span.symmetra "Symmetra's "] [:span.text "Qualifying Matches"]]
     [:div.outer-container
      [:div.inner-container
       (container "New Game")
       (when load? (container "Load Game"))]]]))

(defn new-game-guard-menu [transition-fn]
  (let [container (menu-container transition-fn)]
   [:div.menu
    [:div.title
     [:span.text.symmetra "Delete old save?"]]
     [:div.outer-container
      [:div.inner-container
       (container "Continue")
       (container "Return")]]]))

(defmethod miranda/render :syms-qual/intro
  [{:keys [window] :as state} transition-fn graph options]
  [:div.base-scene
   {:style {:background-image "url(\"img/Backgrounds/title_screen_bg.png\")"
            :height (str (:y window) "px")
            :width (str (:x window) "px")}}
   [:div.title-screen.menu-container (menu (:saved state) transition-fn)]])

(defmethod miranda/render :syms-qual/new-game-guard
  [{:keys [window] :as state} transition-fn graph options]
  [:div.base-scene
   {:style {:background-image "url(\"img/Backgrounds/title_screen_bg.png\")"
            :height (str (:y window) "px")
            :width (str (:x window) "px")}}
   [:div.title-screen.menu-container (new-game-guard-menu transition-fn)]])

(defmethod miranda/render :syms-qual/options
  [{:keys [window] :as state} transition-fn graph options]
  [:div.base-scene
   {:style {:background-image "url(\"img/Backgrounds/title_screen_bg.png\")"
            :height (str (:y window) "px")
            :width (str (:x window) "px")}}
   [:div.title-screen.menu-container (menu (:saved state))]])

(defn continue [state]
  (util/save! :saved true)
  (assoc
   state
   :new-game? false
   :miranda/auto-save true
   :scene ng-scene))

(defn new-game [state]
  (if (:saved state)
    (assoc state :scene [:title-screen [:bg :new-game-guard] 0])
    (continue state)))

(defn load-game [state]
  (util/load! :save))

(defn view-options [state]
  (assoc state :scene [:title-screen [:bg :options] 0]))

(defn main-menu [state]
  (assoc state :scene [:title-screen [:bg :default] 0]))

(defmethod miranda/transition :syms-qual/intro
  [state graph options button]
  (case button
    "New Game" (new-game state)
    "Load Game" (load-game state)
    "Options" (view-options state)
    "Continue" (continue state)
    "Return" (main-menu state)))

(defonce state-atom (reagent.core/atom base-state))

(miranda/samba! "app" state-atom graph options)
