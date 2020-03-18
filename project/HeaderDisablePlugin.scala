import sbt._, Keys._

import de.heikoseeberger.sbtheader.HeaderPlugin.autoImport._

import precog.SbtPrecog

import scala.collection.immutable.Iterable

object HeaderDisablePlugin extends AutoPlugin {

  override def requires = SbtPrecog
  override def trigger = allRequirements

  override def projectSettings = Seq(
    headerCreate := Iterable.empty,
    headerCheck := Iterable.empty)   // override header creation to be nothing
}
