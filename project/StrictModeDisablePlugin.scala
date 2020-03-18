import sbt._, Keys._

import precog.{SbtPrecog, SbtPrecogKeys}, SbtPrecogKeys._

object StrictModeDisablePlugin extends AutoPlugin {

  override def requires = SbtPrecog
  override def trigger = allRequirements

  override def projectSettings = Seq(scalacStrictMode := false)
}
