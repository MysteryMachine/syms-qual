(ns carmen.miranda
  (:require [carmen.impl.render :as render]
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
    (swap!
     state-atom
     (fn [state]
       (data/guard-transition transition state graph options args)))))

(defn render-game-inner [state-atom transition-fn graph options]
  [render @state-atom transition-fn graph options])

(defn register-listener! [state-atom event-name event & [activate?]]
  (when activate? (event))
  (js/window.addEventListener event-name event)
  (swap! -state #(assoc % event-name event)))

(defn animation! [state-atom desired-fps]
  (data/initialize-fps-state! state-atom)
  (let [period (/ 1000 desired-fps)
        event (data/create-animation-event! state-atom period)]
    (swap! -state #(assoc % :miranda/animation event))))

(defn samba [state-atom graph options]
  (let [transition-fn (transition! state-atom graph options)]
   (fn render-game []
      [render-game-inner state-atom transition-fn graph options])))

