(ns syms-qual.core
  (:require [reagent.core :as reagent]
            [carmen.miranda :as miranda]
            [carmen.util :as util]
            [carmen.extras :as extras]
            [syms-qual.data.scenes :as scenes]
            [syms-qual.data.state-dump :as dump]))

(enable-console-print!)

(def graph
  {:scenes scenes/data})

(def base-state
  {:scene [:title-screen [:bg :default] 0]
   :saved (util/load! :saved)
   :miranda/auto-save true
   :points/sombra 0
   :points/junkrat 0
   :points/pharah 0})

(def logo-size [120 120])

(defn dots [state]
  (let [n (js/Math.ceil (rem (/ (:miranda/time state) 800) 4))
        x (if (zero? n) n (dec n))]
    (map
     (fn [i]
       [(if (> x i) :span :span.dark) "."])
     (range 3))))

(defn loading-screen
  [{:keys [window] :as state} graph options transition]
  (let [rat (util/scale state options)
        [x y] logo-size
        loaded? (miranda/done-loading? state options)
        base-scene-style
        {:style (cond-> {:height (util/px (:y window))
                         :width (util/px (:x window))}
                  loaded? (assoc :cursor "pointer"))}]
    [:div.base-scene
     (cond-> base-scene-style
       loaded? (assoc :on-click (transition :loading/done)))
     [:div.loading-outer
      [:div.loading-inner
       [:div.loading-screen
        [:img {:src "img/overwatchLogo.svg"
               :style {:height (util/px (* rat y))
                       :width  (util/px (* rat x))}}]
        (if loaded?
          [:div.loading-screen-text
           "Ready!"]
          (into
           [:div.loading-screen-text
            [:span "Loading"]]
           (dots state)))]]]]))

(def options
  {:miranda/click-delay 100
   :miranda/native-resolution [2048 1080]
   :miranda/base-text-size 32
   :miranda/letterbox-ratio 1.78
   :miranda/max-load-time 60000
   :loading-screen loading-screen
   :miranda/key-events {}})

(def ng-scene [:intro [:menu-pink] 0])

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

(defn base-scene-style [window]
  {:background-image (util/url "img/Backgrounds/title-screen-bg.png")
   :background-size "cover"
   :height (str (:y window) "px")
   :width (str (:x window) "px")})

(defn title-screen-style [window]
  {:bottom (str (:y-adjust window) "px")})

(defmethod miranda/render :syms-qual/intro
  [{:keys [window] :as state} transition-fn graph options]
  [:div.base-scene {:style (base-scene-style window)}
   [:div.title-screen.menu-container {:style (title-screen-style window)}
    (menu (:saved state) transition-fn)]])

(defmethod miranda/render :syms-qual/new-game-guard
  [{:keys [window] :as state} transition-fn graph options]
  [:div.base-scene
   {:style (base-scene-style window)}
   [:div.title-screen.menu-container {:style (title-screen-style window)}
    (new-game-guard-menu transition-fn)]])

(defmethod miranda/render :syms-qual/options
  [{:keys [window] :as state} transition-fn graph options]
  [:div.base-scene
   {:style (base-scene-style window)}
   [:div.title-screen.menu-container {:style (title-screen-style window)}
    (menu (:saved state))]])

(defn continue [state]
  (util/save! :saved true)
  (assoc
   state
   :new-game? false
   :miranda/auto-save true
   :scene ng-scene))

(defn new-game [state]
  (if (:saved state)
    (merge (assoc base-state :scene [:title-screen [:bg :new-game-guard] 0])
           (select-keys state [:miranda/auto-save :miranda/text-scale :miranda/time
                               :miranda/internal :window]))
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

(def fade-out-target?
  #{[:blizzard-world [:picnic :brigitte 2] 10]})

(defn fade-out [state]
  (when (fade-out-target? (util/scene state))
    (let [{:keys [x y]} (:window state)]
      [:div.fadeout {:style {:opacity (min (/ (:miranda/time state) 2000)) :width x :height y}}])))

(defonce state-atom (reagent.core/atom base-state))

(defonce saved-state (atom {}))

(defn save [] (reset! saved-state @state-atom))

(defn load
  ([] (load @saved-state))
  ([& a]
   (reset!
    state-atom
    (case a
      [2] dump/day-2
      [3] dump/day-3
      [3 :date] dump/day-3-date
      [4] dump/day-4
      [5] dump/day-5
      [5 :payload] dump/day-5-payload
      [6] dump/day-6
      [6 :payload] dump/day-6-payload
      [7] dump/day-7
      [7 :payload] dump/day-7-payload
      [8] dump/day-8
      [8 :payload] dump/day-8-payload
      [8 :clouds] dump/day-8-clouds
      [9] dump/day-9
      [9 :payload] dump/day-9-payload
      [10] dump/day-10
      [10 :payload] dump/day-10-payload
      [11] dump/day-11
      [11 :payload] dump/day-11-payload
      [:credits] dump/credits
      (first a)))
   ((carmen.impl.events/resize! state-atom options))))

(def game (miranda/reagent-component state-atom graph options))

(def scene->song
  {
   #_[:title-screen [:bg :default] 0]
   #_{:song-name "anubis" :loop true :sound-name "anubis"}

   })

(defn do-audio [state-atom state scene]
  #_(println scene)
  (when (not= (:miranda/bg state) scene)
   (when-let [{:keys [song-name loop sound-name]} (scene->song scene)]
      (when window.audio (.pause window.audio))
      (when song-name
       (set! window.audio (js/Audio. (str "/music/" song-name ".mp3")))
       (set! window.audio.loop loop)
       (set! window.audio.muted (:miranda/muted state))
       (.play window.audio))
      (when sound-name
        (set! window.sound (js/Audio. (str "/music/" sound-name ".mp3")))
        (set! window.sound.muted (:miranda/muted state))
        (.play window.sound))
      (swap! state-atom #(assoc % :miranda/bg scene)))))

(defn draw-menu [state-atom state]
  (let [{:keys [x y]} (:window state)
        percent-in (min 1 (/ (- (:miranda/time state)
                                (:miranda/fade-start state))
                             500))
        ratio (/ y 1182)]
    [:div.menu-holder
     {:style {:width x :height y}}
     [:div.fadeout.menu
      {:style {:opacity percent-in
               :width x :height y}}]
     [:div.sym-hand
      {:style {:width x
               :height y
               :bottom (str (+ (* y percent-in) (- y)) "px")}}
      [:div {:style
             {:width (/ x 3)
               :height (/ y 2.5)
               :position "absolute"
               :top (* (/ y 2.5) 1.5)
              :left (* (/ x 3) 1.2)}}
       [:div.hand-menu.main-menu
        {:style {:width (* ratio 400) :height (* ratio 121)  :margin-top (* ratio 50)}
         :on-click (fn [] (swap! state-atom #(-> %
                                                 (assoc :miranda/menu-showing? false)
                                                 (assoc :scene [:title-screen [:bg :default] 0]))))}]
       [:div.hand-menu.back-to-game
        {:style {:width (* ratio 400) :height (* ratio 121) :margin-top (* ratio 70)}
         :on-click (fn [] (swap! state-atom #(assoc % :miranda/menu-showing? false)))}]]]]))

(defn menu-button [state-atom state]
  (let [menu-showing? (:miranda/menu-showing? state)]
    [:div
     (when menu-showing?
       (draw-menu state-atom state))
     [:div.miranda.menu-button
      {:on-click
       (fn []
         (swap! state-atom
                #(-> %
                     (assoc :miranda/menu-showing? true)
                     (assoc :miranda/fade-start (:miranda/time %)))))}]]))

(defn app []
  (let [state @state-atom
        scene (:scene state)]
    (do-audio state-atom state scene)
    [:div.syms-qual
     (fade-out state)
     [:div.miranda.option-button-holder
      (when (and (not= :title-screen (first scene))
                 (not (miranda/in-loading-screen? state)))
        [:div
         (menu-button state-atom state)
         (extras/fast-forward state-atom graph options)])
      (extras/mute-button state-atom)
      (when-not (extras/fullscreen?)
        (extras/full-screen-button state-atom))]
     [game state]]))

(miranda/listen! state-atom options)
(reagent/render [app] (. js/document (getElementById "app")))