(ns carmen.data
  (:require [carmen.impl.data :as impl]))

(defn reify-characters [structure options]
  (impl/validate-character-options options)
  (impl/reify-characters structure options))

(defn reify-scenes [structure character-graph options]
  (impl/validate-scenes-options options)
  (impl/reify-scenes structure character-graph options))

(defn reify-bgs [structure options]
  (impl/validate-bg-options options)
  (impl/reify-bgs structure options))

