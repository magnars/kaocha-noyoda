(ns noyoda.plugin
  (:require [kaocha.plugin :refer [defplugin]]))

(defplugin noyoda.plugin/swap-actual-and-expected
  "Don't talk like yoda. This plugin lets you write `(is (= actual expected))`."
  (pre-report [e]
              (if (and (= :fail (:type e))
                       (:actual e)
                       (:expected e)
                       (not (instance? Throwable (:actual e)))
                       (= 'not (first (:actual e)))
                       (= '= (first (second (:actual e))))
                       (= '= (first (:expected e))))
                (let [[_ real-actual real-expected] (second (:actual e))
                      [_ the-code] (:expected e)]
                  (-> e
                      (assoc :actual (list 'not (list '= real-expected real-actual)))
                      (assoc :expected (list '= the-code real-expected))))
                e)))
