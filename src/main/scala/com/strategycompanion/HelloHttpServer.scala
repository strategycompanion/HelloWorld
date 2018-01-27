package com.strategycompanion

import akka.http.scaladsl.server.HttpApp

object HelloHttpServer extends HttpApp{

  def route =
    pathPrefix("v1") {
      path("id" / Segment) { id =>
        get {
          println("server get " + id)
          complete(s"Hello World from akka v1")
        } ~
          post {
            entity(as[String]) { entity =>
              println("server get " + entity)
              complete(s"got post request")
            }
          }
      }
    }

}

object HelloHttpServerApplication extends App {
  val port = System.getenv("PORT").toInt
  HelloHttpServer.startServer("0.0.0.0", port)
}

//localhost/v1/id/2