ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.0"

scalacOptions ++= Seq(
  "-language:strictEquality"
)

lazy val root = (project in file("."))
  .settings(
    name := "scala3-bug"
  )
