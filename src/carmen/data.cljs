(ns carmen.data
  (:require [carmen.impl.data :as impl]))

(defn reify-characters [structure options]
  (impl/validate-character-options options)
  (into {} (impl/reify-characters-xf options) structure))

(defn reify-scenes [structure options]
  (impl/validate-scenes-options options)
  (into {} (impl/reify-scenes-xf options) structure))

(defn reify-bgs [structure options]
  (impl/validate-bg-options options)
  (into {} (impl/reify-bgs-xf options) structure))
