import Dependencies._

ThisBuild / scalaVersion := "2.13.3"
ThisBuild / version := "0.1.0"
ThisBuild / organization := "com.renghen.cats"
ThisBuild / organizationName := "renghen"

lazy val root = (project in file("."))
  .settings(
    name := "cats101",
    libraryDependencies += scalaTest % Test
  )
