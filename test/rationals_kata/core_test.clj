(ns rationals-kata.core-test
  (:require [clojure.test :refer :all]
            [rationals-kata.core :refer :all])
  (:use [midje.sweet]))

(facts
 "about midje"
  (fact
   "canary in midje"
   (true) => true))

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

(= (r 8 2) (r 4))

(apply max '(1/1 1/2 1/4))

