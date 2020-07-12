import Dependencies._

ThisBuild / scalaVersion     := "2.13.2"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "dev.almibe"
ThisBuild / organizationName := "scalascratchpad"

lazy val root = (project in file("."))
  .settings(
    name := "scala-scratchpad",
    libraryDependencies += "org.rocksdb" % "rocksdbjni" % "6.6.4",
    libraryDependencies += "co.fs2" %% "fs2-core" % "2.4.0",
    libraryDependencies += scalaTest % Test
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
