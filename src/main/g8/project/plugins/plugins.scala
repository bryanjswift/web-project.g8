import sbt._

class Plugins(info: ProjectInfo) extends PluginDefinition(info) {
  val codaRepo = "Coda Hale's Repository" at "http://repo.codahale.com/"
  val assembly = "com.codahale" % "assembly-sbt" % "0.1"
}
