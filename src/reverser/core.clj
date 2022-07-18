(ns reverser.core
  (:require [clojure.string :as str]))
(require '[clojure.string :as str])


(defn was-capitalized? [word]
  (-> word
  (seq)
  (last)
  (Character/isUpperCase)))

(defn maybe-capitalize [word]
 (if (was-capitalized? word) (str/capitalize word) word))

(defn reverse-letters [word]
  (-> word
      (str/reverse)
      (maybe-capitalize)))
