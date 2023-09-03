import sbt._

object Dependencies {

  private val slickVersion = "3.4.1"
  private val scalaTestVersion = "3.2.16"
  private val testcontainersScalaVersion = "0.41.0"


  val database = Seq(
    "com.typesafe.slick" %% "slick" % slickVersion,
    "com.typesafe.slick" %% "slick-hikaricp" % slickVersion,
    "org.postgresql" % "postgresql" % "42.2.23"
  )

  val test = Seq(
    "org.scalactic" %% "scalactic" % scalaTestVersion,
    "org.scalatest" %% "scalatest" % scalaTestVersion % "test",
    "com.dimafeng" %% "testcontainers-scala-scalatest" % testcontainersScalaVersion % "test",
    "com.dimafeng" %% "testcontainers-scala-postgresql" % testcontainersScalaVersion % "test"
  )

}