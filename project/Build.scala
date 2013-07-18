import sbt._
import Keys._
import play.Project._
import sbtassembly.Plugin._
import AssemblyKeys._

object ApplicationBuild extends Build {

  lazy val buildSettings = Defaults.defaultSettings ++ Seq(
    version := appVersion,
    organization := appName,
    scalaVersion := "2.10.1"
  )

  val appName         = "testy"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
    jdbc,
    anorm
  )


  val main = play.Project(appName, appVersion, appDependencies, settings = buildSettings ++ assemblySettings).settings(
    // Add your own project settings here
  )
}
