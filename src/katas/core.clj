(ns katas.core
  (:gen-class))

(defn all-unique? [seq]
  (= (count seq) (count (distinct seq))))
