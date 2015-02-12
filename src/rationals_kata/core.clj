(ns rationals-kata.core
  (:gen-class))

(defn add [a b]
  ; we're relying on the language fraction implementation - for now it is good enough
  (+ a b))

(defn r
  ([numerator-] (r numerator- 1))
  ([numerator- denominator-] (/ numerator- denominator-)))
