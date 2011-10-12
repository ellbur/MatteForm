
name := "matteform"

scalaVersion := "2.9.1"

scalacOptions ++= Seq(
    "-deprecation",
    "-unchecked"
)

libraryDependencies ++= Seq(
	"net.liftweb" % "lift-webkit_2.9.0" % "2.4-M3" % "compile->default",
	"org.slf4j" % "slf4j-simple" % "1.6.1"
)

