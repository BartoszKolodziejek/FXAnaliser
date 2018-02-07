name := "FXAnaliser"

version := "0.1"

scalaVersion := "2.12.4"


scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature")


resolvers ++= Seq(
  "Sonatype Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/",
  "Sonatype Releases" at "https://oss.sonatype.org/content/repositories/releases/"
)

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.5.9",
  "com.typesafe.akka" %% "akka-testkit" % "2.5.9" % Test,
  "com.typesafe.akka" %% "akka-http"   % "10.1.0-RC1",
"com.typesafe.akka" %% "akka-stream" % "2.5.8", // or whatever the latest version is

  "org.scalanlp" %% "breeze" % "0.10",
  "org.scalanlp" %% "breeze-natives" % "0.10"
)