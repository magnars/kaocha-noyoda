(defproject kaocha-noyoda "2019-06-03"
  :description "Don't talk like yoda. A kaocha plugin to write `(is (= actual expected))`."
  :url "https://github.com/magnars/noyoda"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies []
  :profiles {:dev {:plugins []
                   :dependencies [[org.clojure/clojure "1.9.0"]
                                  [lambdaisland/kaocha "0.0-389"]]
                   :source-paths ["dev"]}})
