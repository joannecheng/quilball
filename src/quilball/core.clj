(ns quilball.core
  (:use quil.core)
  (:require [quilball.bouncing-no-vectors :as bouncing])
)

(defsketch example
  :title "Sup"
  :setup bouncing/setup
  :draw bouncing/draw
  :size [500 500])
