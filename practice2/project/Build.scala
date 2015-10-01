import sbt._
import Keys._

object MyBuild extends Build {

  lazy val root = project.in(file(".")).
                  settings(commonSettings: _*).
                  dependsOn(ex1,ex2,ex3)

  lazy val ex1 = project.in(file("ex1")).
                  settings(commonSettings: _*).
                  settings(
                    libraryDependencies ++= Seq(
                      "org.scalatest" % "scalatest_2.11" % "2.2.4",
                      "org.scala-lang" % "scala-swing" % "2.11.0-M7"
                    )
                  )

  lazy val ex2 = project.in(file("ex2")).
                  settings(commonSettings: _*).
                  settings(
                    libraryDependencies ++= Seq(
                      "org.scalatest" % "scalatest_2.11" % "2.2.4",
                      "org.scala-lang" % "scala-swing" % "2.11.0-M7"
                    )
                  )

  lazy val ex3 = project.in(file("ex3")).
                  settings(commonSettings: _*).
                  settings(
                    libraryDependencies ++= Seq(
                      "org.scalatest" % "scalatest_2.11" % "2.2.4",
                      "org.scala-lang" % "scala-swing" % "2.11.0-M7"
                    )
                  )

  def commonSettings = 
    Seq(
      version := "0.0.1",
      scalaVersion := "2.11.7"
    )
}
