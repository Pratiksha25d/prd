name := """newplay"""
organization := "practice"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.12.7"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test
libraryDependencies ++=appDependencies

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "practice.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "practice.binders._"
val appDependencies = Seq(
 jdbc,
 "org.playframework.anorm" %% "anorm" % "2.6.3"
 //"mysql" % "mysql-connector-java" % "5.1.25"
)