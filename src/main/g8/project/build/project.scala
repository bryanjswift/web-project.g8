import sbt._

class MyProject(info: ProjectInfo) extends DefaultWebProject(info) assembly.AssemblyBuilder {
  // repository locations (for Jersey)
  val javaNet = "Java.net Repository for Maven" at "http://download.java.net/maven/2/"

  // Jersey
  val jersey = "com.sun.jersey" % "jersey-server" % "1.4"
  // Velocity
  val velocity = "org.apache.velocity" % "velocity" % "1.6.4"
  val simpleVelocity = "bryanjswift" % "simple-velocity" % "0.3.0" from "http://github.com/downloads/bryanjswift/simple-velocity/simple-velocity_2.8.0-0.3.0.jar"

  // Jetty
  val jetty6 = "org.mortbay.jetty" % "jetty" % "6.1.14" % "test->default"
  // ScalaTest
  val scalaTest = "org.scalatest" % "scalatest" % "1.2" % "test->default"

  // override looking for jars in ./lib
  override def dependencyPath = "src" / "main" / "lib"
  // override path to managed dependency cache
  override def managedDependencyPath = "project" / "lib_managed"
}
