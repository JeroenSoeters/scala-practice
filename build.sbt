import sbt.Keys._

name := "scala-practice"

version := "1.0"

scalaVersion := "2.11.11"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "2.2.0",
  "org.apache.spark" %% "spark-streaming" % "2.2.0",
  "org.apache.spark" %% "spark-sql" % "2.2.0",
  "org.scalaz" %% "scalaz-core" % "7.2.15",
  "com.holdenkarau" %% "spark-testing-base" % "2.2.0_0.7.2" % "test",
  "org.scalatest" %% "scalatest" % "3.0.1" % "test"
)

    