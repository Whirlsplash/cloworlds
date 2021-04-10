(ns worlds.core
  (:require [http.async.client :as http]))

(defn is-vip
  "Check if a user currently has VIP status"
  [username]
  (with-open [client (http/create-client)]                  ; Spawn client and close at end of use
  (let [response (http/GET client "http://www-dynamic.us.worlds.net/cgi-bin/vip.pl" :query {:Username username})]
    (-> response
        http/await                                          ; Await response
        http/string)                                        ; Stringify response
    (clojure.string/includes? response "You're already a VIP!")))) ; Check if VIP

(defn get-info
  "Get a user's information"
  [username]
  (with-open [client (http/create-client)]
    (let [response (http/GET client "http://www-dynamic.us.worlds.net/cgi-bin/profile.pl" :query {:username username})]
      (-> response
          http/await
          http/string))))
