(ns reverser.core-test
  (:require [clojure.test :refer :all]
            [reverser.core :refer :all]))

;; (deftest a-test
;;   (testing "FIXME, I fail."
;;     (is (= 0 1))))
(deftest does-reverse-letters-and-keep-caps
  (testing "reverse-letters reverses a string and preserves capitalization")
    (is (= (reverse-letters "Word") "Drow")))

(deftest does-return-true-if-capital
  (testing "was-capitalized? returns true iff final char is capital")
  (is (= (was-capitalized? "droW") true)))

(deftest does-reverse-every-other-word
  (testing "should reverse every other word")
  (is (= (reverse-sentence "Hey what what") "Hey tahw what")))

(deftest does-preserve-nonletters
  (testing "shoudl reverse every other word and not move numbers or punctuation")
  (is (= (reverse-sentence "I'm g0n3, solid gone!") "I'm n0g3, solid enog!")))
