import Dependencies._

ThisBuild / scalaVersion := "2.13.3"
ThisBuild / version := "0.1.0"
ThisBuild / organization := "com.renghen.cats"
ThisBuild / organizationName := "renghen"

lazy val root = (project in file("."))
  .settings(
    name := "cats101",
    libraryDependencies ++= Seq(
      "org.typelevel" %% "cats-core" % "2.2.0",
      "org.typelevel" %% "cats-effect" % "3.0.0-M2",
      "org.typelevel" %% "cats-free" % "2.2.0",
      "org.typelevel" %% "cats-mtl-core" % "0.7.1",
      scalaTest % Test
    )
  )
