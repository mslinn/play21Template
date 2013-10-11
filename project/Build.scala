import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

    val appName    = "Play_2-1_Template"
    val appVersion = "0.1.0-SNAPSHOT"

    val appDependencies = Seq(
      "org.webjars" %% "webjars-play" % "2.1.0-3",
      "org.webjars" %  "jquery"       % "2.0.3-1"
    )

    val main = play.Project(appName, appVersion, appDependencies).settings(
      scalaVersion := "2.10.3"
    )
}
