name := "goticks"

version := "1.0"

organization := "com.goticks"

libraryDependencies ++= {
  val akkaVersion = "2.4.11"
  Seq(
    "com.typesafe.akka" %%  "akka-actor"              % akkaVersion,
    "com.typesafe.akka" %%  "akka-slf4j"              % akkaVersion,

    "com.typesafe.akka" %%  "akka-remote"             % akkaVersion,
    "com.typesafe.akka" %%  "akka-multi-node-testkit" % akkaVersion % "test",

    "com.typesafe.akka" %%  "akka-testkit"                       % akkaVersion % "test",
    "org.scalatest"     %%  "scalatest"                          % "2.2.6"     % "test",
    "com.typesafe.akka" %%  "akka-http-core"                     % akkaVersion, 
    "com.typesafe.akka" %%  "akka-http-experimental"             % akkaVersion, 
    "com.typesafe.akka" %%  "akka-http-spray-json-experimental"  % akkaVersion, 
    "ch.qos.logback"    %   "logback-classic"                    % "1.1.6"
  )
}

// Assembly settings
mainClass in Global := Some("com.goticks.SingleNodeMain")

jarName in assembly := "goticks-server.jar"
