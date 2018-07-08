(ns carmen.miranda
  (:require [carmen.impl.render :as render]
            [carmen.impl.data :as data]
            [carmen.impl.events :as events]
            [carmen.util :as util]))

(def -state (atom {}))

(defn clear-listeners! []
  (doseq [[k v] @-state]
    (cond
      (= k :miranda/animation) (js/window.clearInterval v)
      :default (js/window.removeEventListener k v))))

(defmulti render
  (fn [state _ graph options]
    (util/render-type state graph)))

(defmethod render :miranda/narration
  [state transition-fn graph options]
  (render/render-narration state transition-fn graph options))

(defmethod render :miranda/characters
  [state transition-fn graph options]
  (render/render-just-characters state transition-fn graph options))

(defmethod render :miranda/characters-cond
  [state transition-fn graph options]
  (render/render-just-characters state transition-fn graph options))

(defmethod render :miranda/dialogue
  [state transition-fn graph options]
  (render/render-dialogue state transition-fn graph options))

(defmethod render :miranda/option
  [state transition-fn graph options]
  (render/render-options state transition-fn graph options))

(defmethod render :miranda/text-option
  [state transition-fn graph options]
  (render/render-text-options state transition-fn graph options))

(defmulti transition
  (fn [state graph options args]
    (or (and (:transition/override args) (:transition/type args))
        (util/transition-type state graph))))

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
  (let [[_ _ n] (util/scene state)
        scene (util/scene-data state graph)
        subscene-count (count (:subscenes scene))
        new-state (if (>= n (dec subscene-count))
                    (data/alter-state state graph)
                    state)]
   (data/basic-transition new-state graph options)))

(defn transition!
  [state-atom graph options]
  (fn [args]
    (let [state (swap! state-atom data/guard-transition
                       transition graph options args)]
      (when (:miranda/auto-save state)
        (util/save! (:save-name state :save) state))
      state)))

(def done-loading? data/done-loading?)

(def in-loading-screen? data/in-loading-screen?)

(defn render-game-inner
  [state transition-fn report-loading-fn graph options]
  [:div
   [:style
    ;; TODO: Add style reifier
    (str "body{"
         "font-size:" (util/px (:miranda/text-scale state)) ";"
         "margin-top:" (util/px (-> state :window :y-adjust))  ";"
         "}")]
   [render/preload state graph report-loading-fn options]
   (if-not (data/in-loading-screen? state options)
     [render state transition-fn graph options]
     [(:loading-screen options render/default-loading-screen)
      state graph options report-loading-fn])])

(defn register-listener! [state-atom event-name event & [activate?]]
  (when activate? (event))
  (js/window.addEventListener event-name event)
  (swap! -state #(assoc % event-name event)))

(defn animation! [state-atom desired-fps]
  (data/initialize-fps-state! state-atom)
  (let [period (/ 1000 desired-fps)
        event (data/create-animation-event! state-atom period)]
    (swap! -state #(assoc % :miranda/animation event))))

(defn loaded! [state-atom options]
  (fn [arg]
    (fn []
      (swap!
       state-atom
       (fn [state]
         (if (= arg :loading/done)
           (data/finish-loading state)
           (data/report-loaded state arg)))))))

(defn reagent-component [state-atom graph options]
  (let [transition-fn (transition! state-atom graph options)
        reporting-fn (loaded! state-atom options)]
   (fn render-game [state]
      [render-game-inner state transition-fn reporting-fn graph options])))

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
