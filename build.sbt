ThisBuild / scalaVersion := "2.13.11"
ThisBuild / organization := "net.exercise"

lazy val product = (project in file("."))
  .settings(
    name := "Products",
    libraryDependencies ++= Dependencies.database
  )