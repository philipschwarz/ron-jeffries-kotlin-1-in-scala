ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.1.3"

lazy val root = (project in file("."))
  .settings(
    name := "ron-jeffries-kotlin1-in-scala"
  )

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2-core" % "5.0.7",
)
