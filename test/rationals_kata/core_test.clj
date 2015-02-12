(ns rationals-kata.core-test
  (:require [clojure.test :refer :all]
            [rationals-kata.core :refer :all])
  (:use [midje.sweet]))

(deftest canary-test
  (testing "the environment"
    (is (= 1 1))))

(facts
 "about midje"

  (fact
   "canary in midje"

   (true) => true))
