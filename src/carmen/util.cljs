(ns carmen.util
  "All the helpers here all built off of pointers. A pointer, in this case, is a nickname
   for a vector that, when used with assoc-in, update-in, or get-in, addresses the proper
   section of the data structure.")

(defn px [s] (str s "px"))
(defn pct [s] (str s "%"))

;; Style Helpers

(def default-render-options
  {:dialogue/border-width 3
   :dialogue/padding 16
   :dialogue/margin 5
   :dialogue/ratio 0.25

   :option/border-width 3
   :option/padding 16
   :option/margin 5
   :option/ratio 0.25

   :text-option/border-width 3
   :text-option/padding 16
   :text-option/margin 5
   :text-option/y-ratio 0.4
   :text-option/x-ratio 0.45

   :narration/border-width 3
   :narration/padding 16
   :narration/margin 5
   :narration/y-ratio 0.5
   :narration/x-ratio 0.8})

;; State Helpers

(defn scene
  "Given a game state, return the current scene."
  [state]
  (get state :scene))

;; Graph Pointers

(defn scenes* [] [:scenes])

(defn scene-data* [state graph]
  (let [[major minor & subscene-ptr] (scene state)]
    (into (scenes*) [major minor])))

(defn style* [state graph]
  (conj (scene-data* state graph) :style))

(defn render-type* [state graph]
  (conj (scene-data* state graph) :render-type))

(defn transition-type* [state graph]
  (conj (scene-data* state graph) :transition/type))

(defn transition-args* [state graph]
  (conj (scene-data* state graph) :transition/args))

(defn transition-stateful-args* [state graph]
  (conj (scene-data* state graph) :transition/stateful-args))

(defn subscene* [state graph]
  (let [[major minor & subscene-ptr] (scene state)]
    (into (conj (scene-data* state graph) :subscenes) subscene-ptr)))

(defn actors* [state graph]
  (conj (subscene* state graph) :characters))

(defn dialogue* [state graph]
  (conj (subscene* state graph) :dialogue))

(defn speaker* [state graph]
  (conj (subscene* state graph) :speaker))

(defn scene-options* [state graph]
  (conj (subscene* state graph) :scene-options))

;; Graph Helpers
;; TODO: Considering memoizing results of these functions?

(defn scenes
  "Given a graph, return its set of scenes."
  [graph]
  (get-in graph (scenes*)))

;; Graph -> Scene Functions

(defn scene-data
  "Given a state and a graph, dig into the graph and return
   the data that is relevant to the current scene."
  [state graph]
  (get-in graph (scene-data* state graph)))

(defn style [state graph]
  (get-in graph (style* state graph)))

(defn render-type [state graph]
  (get-in graph (render-type* state graph)))

(defn transition-type [state graph]
  (get-in graph (transition-type* state graph)))

(defn transition-args [state graph]
  (get-in graph (transition-args* state graph)))

(defn transition-stateful-args [state graph]
  (get-in graph (transition-stateful-args* state graph)))

;; Graph -> Subscene Functions

(defn subscene
  "Given a state and a graph, dig into the graph and return the
   current subscene."
  [state graph]
  (get-in graph (subscene* state graph)))

(defn actors [state graph]
  (get-in graph (actors* state graph)))

(defn dialogue [state graph]
  (get-in graph (dialogue* state graph)))

(defn speaker [state graph]
  (get-in graph (speaker* state graph)))

(defn scene-options [state graph]
  (get-in graph (scene-options* state graph)))

;; Rendering

(defmulti tween
  (fn [animation-map elapsed-time]
    (:tween-type animation-map)))

(defmethod tween :miranda/basic
  [{:keys [tween-type alignment animate time]} elapsed-time]
  (let [[ix iy] alignment
        [fx fy] animate
        dx (- fx ix)
        dy (- fy iy)
        dt-by-t (/ elapsed-time time)
        pct (if (> dt-by-t 1) 1 dt-by-t)]
    [(+ ix (* dx pct)) (+ iy (* dy pct))]))

(defmethod tween :default
  [animation-map elapsed-time]
  (:alignment animation-map))
