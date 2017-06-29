(ns carmen.data
  (:require [carmen.impl.data :as impl]))

(defn reify-characters [structure options]
  (impl/validate-character-options options)
  (impl/reify-characters structure options))

(defn reify-bgs [structure options]
  (impl/validate-bg-options options)
  (impl/reify-bgs structure options))

(defn reify-scenes [character-graph bgs structure]
  ;; TODO: Add validation here
  (impl/reify-scenes character-graph bgs structure))

