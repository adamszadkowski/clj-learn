(ns clj-test.core-test
  (:use midje.sweet)
  (:require [clj-test.core :refer :all]))

(facts
  "returning prime factors"
  (fact (prime-factors-of 1) => [])
  (fact (prime-factors-of 2) => [2])
  (fact (prime-factors-of 3) => [3])
  (fact (prime-factors-of 4) => [2 2])
  (fact (prime-factors-of 5) => [5])
  (fact (prime-factors-of 6) => [2 3])
  (fact (prime-factors-of 7) => [7])
  (fact (prime-factors-of 8) => [2 2 2])
  (fact (prime-factors-of 9) => [3 3])
  (fact (prime-factors-of 10) => [2 5])
  (fact (prime-factors-of 27) => [3 3 3])
  (fact (prime-factors-of (* 2 2 3 5 7 11 13 37 37)) => [2 2 3 5 7 11 13 37 37]))

(facts
  "number splitting"
  (fact (split-number 0) => [0])
  (fact (split-number 1) => [1])
  (fact (split-number 2) => [2])
  (fact (split-number 10) => [1 0])
  (fact (split-number 11) => [1 1])
  (fact (split-number 12) => [1 2])
  (fact (split-number 100) => [1 0 0])
  (fact (split-number 9876543210) => [9 8 7 6 5 4 3 2 1 0])
  (fact (split-number 14 2) => [1 1 1 0]))

(facts
  "happy numbers predicate"
  (fact (happy-number? 0) => false)
  (fact (happy-number? 2) => false)
  (fact (happy-number? 3) => false)
  (fact (happy-number? 1) => true)
  (fact (happy-number? 10) => true)
  (fact (happy-number? 7) => true)
  (fact (happy-number? 986543210) => true))

