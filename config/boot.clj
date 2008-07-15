(load-file "lib/contrib/lib.clj")

; Load all the Compojure libraries
(lib/use compojure
         html
         html-helpers
         http
         jetty
         json
         persist
         lib)

; Create a new Jetty HTTP Server on port 8080
(def *server*
  (http-server resource-servlet :port 8080))

; Start the server
(start *server*)
