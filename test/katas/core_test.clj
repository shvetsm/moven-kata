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

(deftest all-unique-ez
  (testing "FIXME, I fail."
    (is (= true (all-unique-ez? "Hey pa!")))
    (is (= false (all-unique-ez? "Hi mom")))
    (is (= true (all-unique-ez? nil)))
    (is (= false (all-unique-ez? [1 2 3 4 5 4 2])))
    (is (= true (all-unique-ez? '(1 2 3 4 5))))))

(deftest all-unique-eaziest
  (testing "FIXME, I fail."
    (is (= true (all-unique-eaziest? "Hey pa!")))
    (is (= false (all-unique-eaziest? "Hi mom")))
    (is (= true (all-unique-eaziest? nil)))
    (is (= false (all-unique-eaziest? [1 2 3 4 5 4 2])))
    (is (= true (all-unique-eaziest? '(1 2 3 4 5))))))

(deftest anagrams
  (testing "Anagrams"
    (is (= true (anagrams? "abc" "bca")))
    (is (= true (anagrams? "abca" "abca")))
    (is (= true (anagrams? "ab ca" " ab ca ,.")))
    (is (= false (anagrams? "abca" "bca")))
    (is (= false (anagrams? "abc" "bcaa")))))