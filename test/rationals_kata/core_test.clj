(ns rationals-kata.core-test
  (:require [clojure.test :refer :all]
            [rationals-kata.core :refer :all])
  (:use [midje.sweet]))

(facts
 "about midje"
  (fact
   "canary in midje"
   (true) => true))

(defn add [a b]
  (+ a b))

(defn r
  ([numerator-] (r numerator- 1))
  ([numerator- denominator-] (/ numerator- denominator-)))

(facts
 "about rational addition"
 (fact
  "zero plus zero"
  (add (r 0) (r 0) ) => (r 0))

  (fact
  "zero plus non-zero"
  (add (r 0) (r 1) ) => (r 1))

  (fact
  "non-zero plus fraction"
  (add (r 1) (r 1 2) ) => (r 3 2))

  (fact
  "add two halves"
  (add (r 1 2) (r 1 2) ) => (r 1))
)

(add (r 5) (r 8 2))

