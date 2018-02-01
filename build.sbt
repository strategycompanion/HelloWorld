name := "HelloWorld"

version := "0.1"

scalaVersion := "2.11.12"

libraryDependencies += "com.typesafe.akka" %  "akka-http_2.11" % "10.0.5"

mainClass in Compile := Some("com.strategycompanion.HelloHttpServerApplication")
/*
dockerBaseImage := "openjdk:jre"
*/
dockerBaseImage := "openjdk:jre-alpine"

lazy val helloworld = (project in file(".")).
  enablePlugins(JavaAppPackaging).enablePlugins(DockerPlugin).enablePlugins(AshScriptPlugin).
  settings(
  )
