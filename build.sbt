name := "HelloWorld"

version := "0.1"

scalaVersion := "2.11.12"

libraryDependencies += "com.typesafe.akka" %  "akka-http_2.11" % "10.0.5"

lazy val helloworld = (project in file(".")).
  enablePlugins(JavaAppPackaging).
  settings(
  )
