import Dependencies._

ThisBuild / scalaVersion     := "0.26.0"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "dev.almibe"
ThisBuild / organizationName := "scalascratchpad"

lazy val root = (project in file("."))
  .settings(
    name := "scala-scratchpad",
    libraryDependencies += ("io.monix" %% "monix" % "3.2.2").withDottyCompat(scalaVersion.value),
//    libraryDependencies += "co.fs2" %% "fs2-core" % "3.0-64069b9",
//    libraryDependencies += "dev.zio" %% "zio-streams" % "1.0.1",
//    libraryDependencies += "org.rocksdb" % "rocksdbjni" % "6.6.4",
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
