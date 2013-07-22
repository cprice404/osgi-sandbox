(ns com.puppetlabs.osgi.clojure.sandbox.hello
  (:import [javax.servlet Servlet
             ServletRequest
             ServletResponse])
  (:use [clojure.osgi.services :only [register-service]])
  (:require [clojure.java.io :as jio])
;  (:use [ring.util.servlet :only [make-service-method]])

;  (:use clojure.osgi.core)
  )

;(println "hello.clj: loaded. Bundle symbolic name is:" (.. *bundle* getSymbolicName))
(println "hello.clj:")
(println "CAN YOU HEAR ME?!")
(println "IS THIS THING ON!?")
;(throw (IllegalStateException. "WHAZZZZZAAAAA"))
;
;(defn servlet-service-fn
;  [handler]
;  (make-service-method handler)

(defn bundle-start [context]
  (println "Bundle start, yo.")
  (println "URL:" (jio/as-url "http://google.com"))
;  (let [service-fn (make-service-method
;                     (fn [req]
;                       {:body "hello clojure world!"}))]
;    (register-service
;      javax.servlet.Servlet
;      {"alias" "/hello-clojure"}
;      (service [servlet
;                request
;                response]
;        (service-fn servlet request response)))
;    )
  )
;  (register-service MyService {"myProperty" "myValue"}
;    (say-hello [_] (println "Hello from service!"))
;    )


;  :extends javax.servlet.http.HttpServlet
  ;  :prefix "foo-")
  ;
  ;(defservice "foo-"
  ;  (fn [req]
  ;    {:body "hello clojure world!"}))
;  )
;
(defn bundle-stop[context]
  (println "Bundle stop, yo.")
  )