(ns rationals-kata.core
  (:gen-class))

(defn add [a b]
  (+ a b))

(defn r
  ([numerator-] (r numerator- 1))
  ([numerator- denominator-] (/ numerator- denominator-)))
