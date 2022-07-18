(ns reverser.core-test
  (:require [clojure.test :refer :all]
            [reverser.core :refer :all]))

;; (deftest a-test
;;   (testing "FIXME, I fail."
;;     (is (= 0 1))))
(deftest reverses-letters
  (testing "reverse-letters reverses a string")
    (is (= (reverse-letters "word") "drow")))

(deftest find-if-capital
  (testing "was-capitalized? returns true iff final char is capital")
  (is (= (was-capitalized? "droW") true)))
