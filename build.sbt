name := "coinclub"

version := "0.1"

scalaVersion := "2.12.4"


val akkaVersion = "1.3.4"
val akkaHttpVersion = "10.0.10"
val scalatestVersion = "3.0.4"
val sprayVersion = "1.3.3"

libraryDependencies += "com.typesafe.akka" %% "akka-http" % akkaHttpVersion
libraryDependencies += "io.spray" %%  "spray-json" % sprayVersion
libraryDependencies += "org.scalactic" %% "scalactic" % scalatestVersion
libraryDependencies += "org.scalatest" %% "scalatest" % scalatestVersion % "test"