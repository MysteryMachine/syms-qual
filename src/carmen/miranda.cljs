(ns carmen.miranda
  (:require [carmen.impl.render :as render]
            [carmen.impl.data :as data]))

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
    (render/render-type state graph)))

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

(defn basic-transition [state graph options]
  (let [[_ _ n] (:scene state)
        scene (render/scene-data state graph)
        subscene-count (count (:subscenes scene))
        delay (:miranda/click-delay options)
        cant-transition (and delay (< (:miranda/time state) delay))]
    (cond
      cant-transition state
      (>= n (dec subscene-count)) (assoc state :scene (:transition/args scene))
      :else (update-in state [:scene 2] inc))))

(defmulti default-transition-type identity)

(defmethod default-transition-type :default
  [_] :miranda/basic)

(defmethod default-transition-type :miranda/option
  [_] :miranda/option)

(defmethod default-transition-type :miranda/text-option
  [_] :miranda/option)

(defmulti transition
  (fn [state graph options args]
    (let [scene (render/scene-data state graph)
          transition-type (:transition/type scene)]
      (if (= :miranda/default transition-type)
        (default-transition-type (:render-type scene))
        transition-type))))

(defmethod transition :miranda/merge
  [state graph options args]
  (merge state args))

(defmethod transition :miranda/option
  [state graph options args]
  (update
   state :scene
   (fn [[major minor n]]
     [major (conj minor args) 0])))

(defmethod transition :miranda/basic
  [state graph options args]
  (basic-transition state graph options))

(defn transition!
  [state-atom graph options]
  (partial swap! state-atom transition graph options))

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

