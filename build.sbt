import slick.codegen.SourceCodeGenerator
import slick.model


ThisBuild / scalaVersion := "2.13.11"
ThisBuild / organization := "net.exercise"

lazy val product = (project in file("."))
  .settings(
    name := "Products",
    libraryDependencies ++= Dependencies.database
  )


//Slick Code Generation
slickCodegenSettings
enablePlugins(CodegenPlugin)
slickCodegenDatabaseUrl := "jdbc:postgresql://localhost:5432/postgres"
slickCodegenDatabaseUser := "postgres"
slickCodegenDatabasePassword := "admin"
slickCodegenDriver := slick.jdbc.PostgresProfile
slickCodegenJdbcDriver := "org.postgresql.Driver"
slickCodegenOutputPackage := "com.rockthejvm.generated.models"
slickCodegenCodeGenerator := { (slickModel: model.Model) => new SourceCodeGenerator(slickModel) }