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
  (add (r 0) (r 0) )))
