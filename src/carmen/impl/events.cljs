(ns carmen.impl.events
  (:require [carmen.util :as util]))

(defn resize-state [options]
  (let [xscrn window.innerWidth
        yscrn window.innerHeight
        r (/ xscrn yscrn)]
    (if (< r (or (:miranda/letterbox-ratio options) 0))
      (let [y (/ xscrn (:miranda/letterbox-ratio options))]
        {:x xscrn :y-adjust (/ (- yscrn y) 2) :y y})
      {:x xscrn :y yscrn :y-adjust 0})))

(defn resize! [state-atom options]
  (fn []
    (swap!
     state-atom
     (fn [game]
       (let [rs (resize-state options)
             state (assoc game :window rs)
             s (util/scale state options)]
         (if-let [txts (:miranda/base-text-size options)]
           (assoc state :miranda/text-scale (* s txts))
           state))))))

(defn keydown! [state-atom options]
  (fn [event]
    (let [f (get-in options [:miranda/key-events event.key] identity)]
      (swap! state-atom f))))

(defn full-screen! [state options]
  (when (:miranda/full-screen? options)
   (let [e (js/document.getElementById "app")]
      (cond
        e.requestFullscreen (.requestFullscreen e)
        e.msRequestFullscreen (.msRequestFullscreen e)
        e.mozRequestFullscreen (.mozRequestFullscreen e)
        e.webkitRequestFullscreen (.webkitRequestFullscreen e))))
  state)
