(use 'simple-plotter.core)

;; Some examples, execute these statements one by one

;; Sine Graph
(create-window "sine")

(doseq [x (range 1024)]
  (plot x (+ 384 (* 376 (Math/sin (* Math/PI (/ x 512)))))))

;; axes
(ink yellow)
(plot 0 384) 
(draw 1024 0)
(line 512 0 512 1024)

