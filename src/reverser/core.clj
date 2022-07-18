(ns reverser.core
  (:require [clojure.string :as str]))
(require '[clojure.string :as str])


(defn was-capitalized? [word]
  (-> word
  (seq)
  (last)
  (Character/isUpperCase )))

(defn reverse-letters [word]
  (str/reverse word))
