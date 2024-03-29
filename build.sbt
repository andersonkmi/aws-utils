import Dependencies._

organization := "org.codecraftlabs.aws"

name := "aws-utils"

val appVersion = "1.0.0"

val appName = "aws-utils"

version := appVersion

scalaVersion := "2.13.10"

resolvers += Classpaths.typesafeReleases

libraryDependencies ++= Seq(
  "com.amazonaws" % "aws-java-sdk-s3" % "1.12.322",
  scalaTest % Test
)
