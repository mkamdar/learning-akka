name := "akkademy-db-client"

version := "0.1"

scalaVersion := "2.12.6"
libraryDependencies ++= Seq(
  "org.scala-lang.modules" %% "scala-java8-compat" % "0.9.0",
  "default" %% "messages" % "0.1",
  "default" %% "akkademy-db" % "0.1",
  "com.typesafe.akka" %% "akka-actor" % "2.5.12",
  "com.typesafe.akka" %% "akka-testkit" % "2.5.12" % "test",
  "org.scalatest" %% "scalatest" % "3.2.0-SNAP10" % "test",
  "org.scalacheck" %% "scalacheck" % "1.14.0" % "test",
  "com.typesafe.akka" %% "akka-remote" % "2.5.12"
)