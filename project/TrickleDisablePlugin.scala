import sbt._, Keys._

import sbttrickle.TricklePlugin, TricklePlugin.autoImport._

object TrickleDisablePlugin extends AutoPlugin {

  override def requires = TricklePlugin
  override def trigger = allRequirements

  override def projectSettings = Seq(
    trickleUpdateSelf := {},
    trickleCreatePullRequests := {})
}
