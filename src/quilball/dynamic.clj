(ns quilball.dynamic
  (:use quil.core
  [quil.helpers.seqs :only [seq->stream]]
))

(defn background-color [] 0)

(defn setup []
  (smooth)
  (stroke-weight 4)
  (frame-rate 20)
  (background (background-color))
  (let [positions (range 20 (height) 3)]
    (set-state! :x-pos (seq->stream positions))
  )
  )

(defn draw []
  (fill 230 201 180)

  (let [  x-pos   ((state :x-pos))
          y-pos   ((state :x-pos))]
    (when x-pos
      (background (background-color))
      (ellipse x-pos, y-pos, 40, 40))
    )
  )
