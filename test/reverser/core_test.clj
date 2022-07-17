(ns reverser.core-test
  (:require [clojure.test :refer :all]
            [reverser.core :refer :all]))

;; (deftest a-test
;;   (testing "FIXME, I fail."
;;     (is (= 0 1))))
(deftest reverse-letters-test
  (testing "reverse-letters reverses a string")
    (is (= (reverse-letters "word") "drow")))
