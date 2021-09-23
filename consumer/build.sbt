import Dependencies._

ThisBuild / scalaVersion     := "2.13.6"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

libraryDependencies += "org.apache.kafka" %% "kafka" % "3.0.0"

libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.1.3" % Runtime

lazy val root = (project in file("."))
  .settings(
    name := "consumer",
    libraryDependencies += scalaTest % Test
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
