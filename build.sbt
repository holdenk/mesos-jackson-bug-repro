name := "case_class_jackson"

version := "1.0"

scalaVersion := "2.10.3"

resolvers += "Mesosphere Public Repository" at "http://downloads.mesosphere.io/maven"

libraryDependencies += "mesosphere" %% "jackson-case-class-module" % "0.1.1-SNAPSHOT"
