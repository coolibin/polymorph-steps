
val appVersion = "v1.MVP20.03-SNAPSHOT"
name := "polymorph-steps"
version := "1.0"
scalaVersion := "2.13.12"
resolvers ++= Seq(
  "Artifactory" at "https://artifactory.natera.com/artifactory/sbt-local/releases/",
  "Snapshots" at "https://artifactory.natera.com/artifactory/libs-snapshot",
  "Artifactory-release" at "https://artifactory.natera.com/artifactory/libs-release-local/",
  "Typesafe Releases" at "https://repo.typesafe.com/typesafe/maven-releases/"
)

libraryDependencies ++= Seq(
  "com.natera" %% "test-runner-core" % "4.18.1"
)

scalacOptions ++= Seq(
  "-feature",
  "-language:postfixOps",
  "-language:implicitConversions",
  "-language:reflectiveCalls"
)


