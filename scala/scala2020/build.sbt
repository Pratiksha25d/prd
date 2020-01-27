organization :="springer.training"
name := "scala2020"

version := "0.1"

scalaVersion := "2.13.1"

//val dependencies = Seq(
//  "org.apache.commons" % "commons-lang3" % "3.9",
//  "commons-io" % "commons-io" % "2.6",
//  "com.marklogic" % "marklogic-xcc" % "8.0.9",
//  "me.moocar" % "logback-gelf" % "0.9.6" from "http://repo.tools.springer-sbm.com/repos/logback-gelf-0.9.6.jar"
//)
//
//libraryDependencies ++= dependencies
libraryDependencies += "org.scalactic" %% "scalactic" % "3.1.0"
libraryDependencies +="org.mockito" % "mockito-core" % "1.9.5" % "test"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % "test"