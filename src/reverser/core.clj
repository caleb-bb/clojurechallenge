(ns reverser.core
  (:require [clojure.string :as str]))
(require '[clojure.string :as str])

(defn interpolate [word char-with-index]
  (let [character (last char-with-index)
        index (first char-with-index)]
  (if (< index (count word))
    (str (subs word 0 index) character (subs word index))
    (str word character) )))

(defn was-capitalized? [word]
  (-> word
  (seq)
  (last)
  (Character/isUpperCase)))

(defn maybe-capitalize [word]
 (if (was-capitalized? word) (str/capitalize word) word))

(defn reverse-letters [word]
  (as-> word w
      (str/reverse w)
      (str/replace w #"[^\p{L}]" "")
      (reduce interpolate w (map-indexed vector (re-seq #"[^\p{L}]*" word)))
      (maybe-capitalize w)))

(defn conditional-reverse [index word]
  (if (= (mod index 2) 1) (reverse-letters word) word))

(defn reverse-sentence [sentence]
  (as-> sentence s
    (str/split s #" ")
    (map-indexed conditional-reverse s)
    (str/join " " s)))

(defn restore-nonletters [word reversed-letters]
  (let [word-list (str/split word #"")
        reversed-list (str/split reversed-letters #"")]))
