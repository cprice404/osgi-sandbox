(ns com.puppetlabs.sandbox.osgi.clojure.HelloWorldWebservice
;  (:import [org.apache.felix.scr.annotations Component Service])
  (:import [javax.servlet Servlet]
           [com.puppetlabs.sandbox.osgi.annotation PropertyLiteral])
;  (:gen-class
;    :name ^{org.apache.felix.scr.annotations.Component []
;            org.apache.felix.scr.annotations.Service []}
;      com.puppetlabs.sandbox.osgi.clojure.HelloWorldWebservice
;    :extends javax.servlet.http.HttpServlet)
  (:use [ring.util.servlet :only [defservice]]))

(gen-class
  :name ^{org.apache.felix.scr.annotations.Component {:immediate true}
          org.apache.felix.scr.annotations.Service   {:value [Servlet]}
          org.apache.felix.scr.annotations.Properties []}
          ;(PropertyLiteral. "alias" ["/helloclojure"])]}
;            [org.apache.felix.scr.annotations.Property {:name "alias"
;                                                        :value "/helloclojure"}]}

    com.puppetlabs.sandbox.osgi.clojure.HelloWorldWebservice.Foo
  :extends javax.servlet.http.HttpServlet
  :prefix "foo-")

(defservice "foo-"
  (fn [req]
    {:body "hello clojure world!"}))