(ns carmen.miranda
  (:require [reagent.core :as reagent]
            [carmen.impl.render :as render]
            [carmen.impl.data :as data]
            [carmen.impl.events :as events]
            [carmen.util :as util]))

(def -state (atom {}))

(defn clear-listeners! []
  (doseq [[k v] @-state]
    (cond
      (= k :miranda/animation) (js/window.clearInterval v)
      :default (js/window.removeEventListener k v))))

(defn full-screen-button [transition-fn]
  [:div.miranda.full-screen-button
   {:on-click
    (partial transition-fn
             {:transition/type :miranda/full-screen})}])

(defn wrap-optional-buttons
  ([state transition-fn options data]
   (wrap-optional-buttons state transition-fn options [] data))
  ([state transition-fn options extra-buttons data]
   (-> [:div.miranda.option-button-holder]
       (into (filter some?) extra-buttons)
       (into (filter some?)
             [(when
                  (and (:miranda/full-screen? options)
                       (not
                        (or ;; TODO: Add support for always visible
                            ;; expand button.
                            document.webkitIsFullScreen
                            document.fullscreen
                            document.mozFullScreen)))
                (full-screen-button transition-fn))])
       (into [data]))))

(defmulti render
  (fn [state _ graph options]
    (util/render-type state graph)))

(defmethod render :miranda/narration
  [state transition-fn graph options]
  (wrap-optional-buttons
   state transition-fn options
   (render/render-narration state transition-fn graph options)))

(defmethod render :miranda/characters
  [state transition-fn graph options]
  (wrap-optional-buttons
   state transition-fn options
   (render/render-just-characters state transition-fn graph options)))

(defmethod render :miranda/dialogue
  [state transition-fn graph options]
  (wrap-optional-buttons
   state transition-fn options
   (render/render-dialogue state transition-fn graph options)))

(defmethod render :miranda/option
  [state transition-fn graph options]
  (wrap-optional-buttons
   state transition-fn options
   (render/render-options state transition-fn graph options)))

(defmethod render :miranda/text-option
  [state transition-fn graph options]
  (wrap-optional-buttons
   state transition-fn options
   (render/render-text-options state transition-fn graph options)))

(defmulti transition
  (fn [state graph options args]
    (if-let [t-type (:transition/type args)]
      t-type
      (util/transition-type state graph))))

(defmethod transition :miranda/full-screen
  [state graph options args]
  (events/full-screen! state options))

(defmethod transition :miranda/merge
  [state graph options args]
  (merge state args))

(defmethod transition :miranda/dynamic
  [state graph options args]
  (let [updated-graph (update-in graph (util/scene-data* state graph) merge args)]
   (transition state updated-graph options args)))

(defmethod transition :miranda/basic
  [state graph options args]
  (data/basic-transition state graph options))

(defmethod transition :miranda/conditional
  [state graph options args]
  (data/conditional-transition transition state graph options args))

(defmethod transition :miranda/mutation->basic
  [state graph options args]
  (data/basic-transition
   (data/alter-state state graph)
   graph options))

(defn transition!
  [state-atom graph options]
  (fn [args]
    (let [state
          (swap!
           state-atom
           (fn [state]
             ;; TODO: clean up
             (assoc
              (data/guard-transition transition state graph options args)
              :miranda/time 0)))]
      (when (:miranda/auto-save state)
        (util/save! (:save-name state :save) state))
      state)))

(defn render-game-inner [state-atom transition-fn loading-fn graph options]
  (let [state @state-atom]
    [:div
     [:style
      ;; TODO: Add style reifier
      (str "body{"
           "font-size:" (util/px (:miranda/text-scale state)) ";"
           "margin-top:" (util/px (-> state :window :y-adjust))  ";"
           "}")]
     [render/preload state graph loading-fn]
     (if (data/done-loading? state options)
       [render state transition-fn graph options]
       [(:loading-screen options render/default-loading-screen) state graph options])]))

(defn register-listener! [state-atom event-name event & [activate?]]
  (when activate? (event))
  (js/window.addEventListener event-name event)
  (swap! -state #(assoc % event-name event)))

(defn animation! [state-atom desired-fps]
  (data/initialize-fps-state! state-atom)
  (let [period (/ 1000 desired-fps)
        event (data/create-animation-event! state-atom period)]
    (swap! -state #(assoc % :miranda/animation event))))

(defn loading! [state-atom options]
  (fn [i]
    (fn []
     (swap!
       state-atom
       (fn [state]
         (if (= (count (get-in state data/reports*)) (get-in state data/max-reports*))
           (update-in state [:miranda/internal :reports] conj i)
           (-> state
               (assoc-in data/reports* nil)
               (assoc-in data/max-reports* nil)))))
      ;; TODO: only do this if we have resizing set in
      ;; TODO: Maybe active all events? Zero time?
      ((events/resize! state-atom options)))))

(defn reagent-component [state-atom graph options]
  (let [transition-fn (transition! state-atom graph options)
        loading-fn (loading! state-atom options)]
   (fn render-game []
      [render-game-inner state-atom transition-fn loading-fn graph options])))

(defn listen!
  ([state-atom options]
   (listen! state-atom options #{:animation "resize" "keydown"}))
  ([state-atom options args]
   (clear-listeners!)
   (doseq [arg args]
     (case arg
       :animation (animation! state-atom 24)
       "resize" (register-listener! state-atom "resize" (events/resize! state-atom options) true)
       "keydown" (register-listener! state-atom "keydown" (events/keydown! state-atom options) false)))))

(defn samba! [root-id state-atom graph options]
  (let [app (reagent-component state-atom graph options)]
    (listen! state-atom options)
    (reagent/render [app] (. js/document (getElementById root-id)))))
