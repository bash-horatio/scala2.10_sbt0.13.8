name := "scala2.10_sbt0.13.8"
version := "1.0"

// scala compile options
//"-unchecked", "-deprecation", "-encoding", "utf8" and so on
scalaVersion := "2.10.5"
scalacOptions := Seq("-feature")
ivyScala := ivyScala.value map { _.copy(overrideScalaVersion = false) }

// disable documentation generation
sources in (Compile, doc) := Seq.empty
publishArtifact in (Compile, packageDoc) := false
// parallel execution in test
parallelExecution in Test := true
fork in Test := false

// ivy log level: Quiet, DownloadOnly, FULL
ivyLoggingLevel := UpdateLogging.Quiet


libraryDependencies ++= Seq(

)
