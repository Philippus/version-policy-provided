name := "pureconfig-javanet"
organization := "nl.gn0s1s"

scalaVersion := "2.13.5"

ThisBuild / version := "0.0.2-SNAPSHOT"
ThisBuild / versionPolicyIntention := Compatibility.BinaryCompatible

libraryDependencies ++= Seq(
  "com.github.pureconfig" %% "pureconfig" % "0.14.1" % Provided,
  "commons-validator" % "commons-validator" % "1.7"
)
