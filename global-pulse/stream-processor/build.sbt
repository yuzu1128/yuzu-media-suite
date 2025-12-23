name := "yuzu-stream-processor"
version := "0.1.0"
scalaVersion := "3.3.1"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-stream" % "2.8.5",
  "com.typesafe.akka" %% "akka-actor-typed" % "2.8.5",
  "com.redis" %% "rediscala" % "1.9.0",
  "org.slf4j" % "slf4j-simple" % "2.0.7"
)

mainClass in (Compile, run) := Some("com.yuzu.pulse.StreamApp")
