(ns katas.core
  (:gen-class))


(defn all-unique? [seq]
  (let [step (fn step [seq-internal seen]
               (let [first-element (first seq-internal)]
                 (if (not first-element)
                   ;exit for recursion we exhausted the seq
                   true
                   (if (contains? seen first-element)
                     ;found a dup we can exit now
                     false
                     (step (rest seq-internal) (conj seen first-element)))
                   )))]
    (step seq #{})))

(defn all-unique-ez? [seq]
  (= (count seq) (count (distinct seq))))

(defn all-unique-eaziest?
  [arg]
  (if arg
    (apply distinct? (seq arg))
    true))

(defn anagrams? [str1 str2]
  (let [make-comparable (fn make-comparable [str]
                          (sort (filter #(Character/isLetterOrDigit %) (seq (.toLowerCase str)))))]
    (= (make-comparable str1) (make-comparable str2))))