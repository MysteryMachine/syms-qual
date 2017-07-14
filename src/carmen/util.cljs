(ns carmen.util
  "All the helpers here all built off of pointers. A pointer, in this case, is a nickname
   for a vector that, when used with assoc-in, update-in, or get-in, addresses the proper
   section of the data structure."
  (:require [cljs.reader :refer [read-string]]
            [clojure.string :as str]
            [carmen.impl.utils :as impl]))

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

(defn major-scene* [state graph]
  (let [[major minor & subscene-ptr] (scene state)]
    (into (scenes*) [major])))

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

(defn major-scene [state graph]
  (get-in graph (major-scene* state graph)))

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

(defmethod tween :miranda/linear
  [animation-map elapsed-time]
  (impl/generic-tween animation-map elapsed-time impl/linear-tween))

(defmethod tween :miranda/quadratic
  [animation-map elapsed-time]
  (impl/generic-tween animation-map elapsed-time impl/quadratic-tween))

(defmethod tween :miranda/cubic
  [animation-map elapsed-time]
  (impl/generic-tween animation-map elapsed-time impl/cubic-tween))

(defmethod tween :default
  [animation-map elapsed-time]
  (:finish animation-map))

(defn scoot
  ([n] {:finish {:position [n 0]}})
  ([n m t]
   {:start {:position [n 0]}
    :finish {:position [m 0]}
    :time (* 1000 t)
    :tween-type :miranda/cubic}))

(defn move
  ([p] {:finish {:position p}})
  ([i f t]
   {:start {:position i}
    :finish {:position f}
    :time (* 1000 t)
    :tween-type :miranda/linear}))

(defn qmove
  [i f t]
  {:start {:position i}
   :finish {:position f}
   :time (* 1000 t)
   :tween-type :miranda/quadratic})

(defn cmove
  [i f t]
  {:start {:position i}
   :finish {:position f}
   :time (* 1000 t)
   :tween-type :miranda/cubic})

(defn fade-in [pos t]
  {:finish {:position pos
            :opacity 1}
   :start {:position pos
           :opacity 0}
   :time (* 1000 t)
   :tween-type :miranda/quadratic})

(defn fade-out [pos t]
  {:start {:position pos
           :opacity 1}
   :finish {:position pos
            :opacity 0}
   :time (* 1000 t)
   :tween-type :miranda/quadratic})

(defn save! [file state]
  (set! js/document.cookie (str (name file) "=" state ";")))

(defn load!
  ([file]
   (get (load!) file))
  ([]
   (as-> js/document.cookie <>
     (str/split <> #"; ")
     (into {}
           (map (fn [s]
                  (let [[k v] (str/split s #"=")]
                    [(keyword k) (read-string v)])))
           <>))))
