(ns carmen.miranda
  (:require [reagent.core :as reagent]
            [carmen.impl.render :as render]
            [carmen.impl.data :as data]
            [carmen.util :as util]))

(def -state (atom {}))

(defn resize-state [settings]
  (let [xscrn window.innerWidth
        yscrn window.innerHeight]
    {:x xscrn :y yscrn}))

(defn resize-event [state-atom]
  (fn []
    (swap!
     state-atom
     (fn [game]
       (assoc game :window (resize-state (:settings game)))))))

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
    (util/transition-type state graph)))

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
             (data/guard-transition transition state graph options args)))]
      (when (:miranda/auto-save options)
        (util/save! (:save-name state :miranda/save) state)))))

(defn render-game-inner [state-atom transition-fn graph options]
  (let [state @state-atom]
   [:div
     [render/preload state graph]
     [render state transition-fn graph options]]))

(defn register-listener! [state-atom event-name event & [activate?]]
  (when activate? (event))
  (js/window.addEventListener event-name event)
  (swap! -state #(assoc % event-name event)))

(defn animation! [state-atom desired-fps]
  (data/initialize-fps-state! state-atom)
  (let [period (/ 1000 desired-fps)
        event (data/create-animation-event! state-atom period)]
    (swap! -state #(assoc % :miranda/animation event))))

(defn reagent-component [state-atom graph options]
  (let [transition-fn (transition! state-atom graph options)]
   (fn render-game []
      [render-game-inner state-atom transition-fn graph options])))

(defn listen!
  ([state-atom]
   (listen! state-atom #{:animation "resize"}))
  ([state-atom args]
   (clear-listeners!)
   (doseq [arg args]
     (case arg
       :animation (animation! state-atom 24)
       :resize (register-listener! state-atom "resize" (resize-event state-atom) true)))))

(defn samba! [root-id state-atom graph options]
  (let [app (reagent-component state-atom graph options)]
    (listen! state-atom)
    (reagent/render [app] (. js/document (getElementById root-id)))))
