import sbt._

object Dependencies {

  private val slickVersion = "3.4.1"
  val database = Seq(
    "com.typesafe.slick" %% "slick" % slickVersion,
    "com.typesafe.slick" %% "slick-hikaricp" % slickVersion,
    "org.postgresql" % "postgresql" % "42.2.23"
  )
}