(defproject org.clojars.fun/worlds "1.0.1"
  :description "A Clojure library for interacting with Worlds."
  :url "https://github.com/Whirlsplash/cloworlds"
  :license {:name "GPL-3.0-only"
            :url "https://www.gnu.org/licenses/gpl-3.0.en.html"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [http.async.client "1.3.1"]]
  :repl-options {:init-ns worlds.core})
