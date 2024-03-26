ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.13"

lazy val root = (project in file("."))
  .settings(
    name := "scala-xml-manipulator"
  )

libraryDependencies += "com.sun.xml.bind" % "jaxb-impl" % "2.3.3"