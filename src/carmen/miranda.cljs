(ns carmen.miranda
  (:require [carmen.impl.render :as render]))

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
      (= k :interval) (js/window.clearInterval v)
      :default (js/window.removeEventListener k v))))

(defmulti render
  (fn [state _ graph options]
    (render/render-type state graph)))

(defmethod render :miranda/narration
  [state transition-fn graph options]
  (render/render-narration state transition-fn graph options))

(defmethod render :miranda/dialogue
  [state transition-fn graph options]
  (render/render-dialogue state transition-fn graph options))

(defn basic-transition [state graph]
  (let [[_ _ n] (:scene state)
        scene (render/scene-data state graph)
        subscene-count (count (:subscenes scene))]
    (if (>= n (dec subscene-count))
      (assoc state :scene (:transition scene))
      (update-in state [:scene 2] inc))))

(defmulti transition
  (fn [state graph args]
    (:render-type (render/scene-data state graph))))

(defmethod transition :miranda/dialogue
  [state graph args]
  (basic-transition state graph))

(defmethod transition :miranda/narration
  [state graph args]
  (basic-transition state graph))

(defn transition!
  [state-atom graph]
  (partial swap! state-atom transition graph))

(defn render-game-inner [state-atom transition-fn graph options]
  [render @state-atom transition-fn graph options])

(defn register-listener! [state-atom body event-name event]
  (js/window.addEventListener event-name event)
  (swap! -state #(assoc % event-name event)))

(defn samba [state-atom graph options]
  (let [transition-fn (transition! state-atom graph)]
   (fn render-game []
      [render-game-inner state-atom transition-fn graph options])))

