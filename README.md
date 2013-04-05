# simple-plotter

An attempt to make plotting as easy on a modern computer running clojure as it used to be on a ZX Spectrum. 

See:
http://www.learningclojure.com/2010/09/graphics-like-its-1979-how-to-get.html
http://johnlawrenceaspden.blogspot.co.uk/2009/11/behold-in-its-full-glory-program-that-i.html

## Usage

Plot the graph of sine zx-style, conceding only that there are more pixels on a modern screen

```

(use 'simple-plotter.core)

(create-window "sine")

;; sine graph
(doseq [x (range 1024)]
  (plot x (+ 384 (* 376 (Math/sin (* Math/PI (/ x 512)))))))

;; axes
(ink yellow)
(plot 0 384) (draw 1024 0)
(line 512 0 512 1024)


```
Alternatively, get the plotter to do all the scaling for you

```
;; Now in more normal coordinates
(create-window "sine in sane coords" 200 100 black white -7.0 7.0 -1.0 1.0)
(doseq [x (range -7 7 0.01)]
  (draw-to x (Math/sin (* Math/PI x))))
;; axes
(ink lightgray)
(axes)

```


## License

Copyright © 2013 John Lawrence Aspden

Distributed under the Eclipse Public License, the same as Clojure.
