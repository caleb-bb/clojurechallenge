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

(defn conditional-reverse [index word]
  (if (= (mod index 2) 1) (reverse-letters word) word))

(defn reverse-sentence [sentence]
  (as-> sentence s
    (str/split s #" ")
    (map-indexed conditional-reverse s)
    (str/join " " s)))
