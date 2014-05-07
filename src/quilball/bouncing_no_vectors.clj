(ns quilball.bouncing-no-vectors
  (:use quil.core)
)

(defn increase [x] (+ x 8))
(defn decrease [x] (- x 5))

(def xpos (atom 0))
(def ypos (atom 0))
(def move-x increase)
(def move-y increase)

(defn setup []
  (smooth)
  (fill 0)
)

(defn draw []
  (background 255)

  (ellipse @xpos @ypos 10 10)

  (if (> @xpos (width)) (def move-x decrease))
  (if (< @xpos 0) (def move-x increase))

  (if (> @ypos (height)) (def move-y decrease))
  (if (< @ypos 0) (def move-y increase))

  (swap! xpos move-x)
  (swap! ypos move-y)
)
