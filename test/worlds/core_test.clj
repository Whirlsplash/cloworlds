(ns worlds.core-test
  (:require [clojure.test :refer :all]
            [worlds.core :refer :all]))

(deftest functions
  (testing "is-vip"
    ; Check if my I (fuwn) have VIP, this SHOULD return FALSE.
    (is (= (is-vip "fuwn") false)))
  (testing "get-info"
    ; Check if the character count of my information is 351. This is generally
    ; not a good way to test if this works but I rarely (or ever) change my
    ; information so this should work.
    (is (= (count (get-info "fuwn"))) 351)))
