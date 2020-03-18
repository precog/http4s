import sbt._, Keys._

import de.heikoseeberger.sbtheader.HeaderPlugin.autoImport._

import precog.SbtPrecog

import scala.collection.immutable.Iterable

object HeaderDisablePlugin extends AutoPlugin {

  override def requires = SbtPrecog
  override def trigger = allRequirements

  override def projectSettings = Seq(
    Compile / headerCreate := Iterable.empty,
    Test / headerCreate := Iterable.empty,
    Compile / headerCheck := Iterable.empty,
    Test / headerCheck := Iterable.empty)
}
