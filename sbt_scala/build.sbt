name := "sbt_scala"

version := "0.1"

scalaVersion := "2.12.4"

val dependencies = Seq(
  "springer.training" % "scala2020_2.13" % "0.1",

)
libraryDependencies ++= dependencies