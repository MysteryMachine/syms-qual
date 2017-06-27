(ns syms-qual.data.scenes
  (:require [syms-qual.data.scenes.route-66 :as route-66]
            [syms-qual.data.scenes.anubis :as anubis]
            [syms-qual.data.scenes.eichenwalde :as eichenwalde]
            [syms-qual.data.scenes.gibralter :as gibralter]
            [syms-qual.data.scenes.dorado :as dorado]
            [syms-qual.data.scenes.hollywood :as hollywood]
            [syms-qual.data.scenes.volskaya :as voslkaya]
            [syms-qual.data.scenes.lijiang :as lijiang]
            [syms-qual.data.scenes.kings-row :as kings-row]
            [syms-qual.data.scenes.numbani :as numbani]
            [syms-qual.data.scenes.main-menu :as main-menu]
            [carmen.data :as data]))

(def structure
  {:route-66 route-66/data
   :anubis anubis/data
   :eichenwalde eichenwalde/data
   :gibralter gibralter/data
   :dorado dorado/data
   :hollywood hollywood/data
   :volskaya voslkaya/data
   :lijiang lijiang/data
   :kings-row kings-row/data
   :numbani numbani/data
   :main-menu main-menu/data})

(def options
  {})

(def data (data/reify-scenes structure options))
