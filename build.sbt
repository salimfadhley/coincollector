name := "coinclub"

version := "0.1"

scalaVersion := "2.12.4"


val akkaVersion = "1.3.4"
val akkaHttpVersion = "10.0.10"
val scalatestVersion = "3.0.4"

// For Akka 2.4.x or 2.5.x

libraryDependencies += "com.typesafe.akka" %% "akka-http" % akkaHttpVersion
// Only when running against Akka 2.5 explicitly depend on akka-streams in same version as akka-actor
//libraryDependencies +=  "com.typesafe.akka" %% "akka-stream" % akkaVersion // or whatever the latest version is
//libraryDependencies +=  "com.typesafe.akka" %% "akka-actor"  % akkaVersion // or whatever the latest version is

libraryDependencies += "org.scalactic" %% "scalactic" % scalatestVersion
libraryDependencies += "org.scalatest" %% "scalatest" % scalatestVersion % "test"