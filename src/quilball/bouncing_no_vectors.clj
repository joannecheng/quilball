(ns quilball.bouncing-no-vectors
  (:use quil.core)
)

(def xpos (atom 0))
(def ypos (atom 0))

(defn setup []
  (smooth)
  (fill 0)
)

(defn draw []
  (background 255)

  (ellipse @xpos @ypos 10 10)

  (swap! xpos inc)
  (swap! ypos inc)
)
