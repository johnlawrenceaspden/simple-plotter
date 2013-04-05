# simple-plotter

An attempt to make plotting as easy on a modern computer running clojure as it used to be on a ZX Spectrum. 

See:
http://www.learningclojure.com/2010/09/graphics-like-its-1979-how-to-get.html
http://johnlawrenceaspden.blogspot.co.uk/2009/11/behold-in-its-full-glory-program-that-i.html

## Usage

```

(use 'simple-plotter.core)

(create-window "sine")

(doseq [x (range 1024)]
  (plot x (+ 384 (* 376 (Math/sin (* Math/PI (/ x 512)))))))

```



## License

Copyright © 2013 John Lawrence Aspden

Distributed under the Eclipse Public License, the same as Clojure.
