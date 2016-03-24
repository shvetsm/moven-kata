(ns katas.core-test
  (:require [clojure.test :refer :all]
            [katas.core :refer :all]))

(deftest all-unique
  (testing "FIXME, I fail."
    (is (= true (all-unique? "Hey pa!")))
    (is (= false (all-unique? "Hi mom")))
    (is (= true (all-unique? nil)))
    (is (= false (all-unique? [1 2 3 4 5 4 2])))
    (is (= true (all-unique? '(1 2 3 4 5))))))
