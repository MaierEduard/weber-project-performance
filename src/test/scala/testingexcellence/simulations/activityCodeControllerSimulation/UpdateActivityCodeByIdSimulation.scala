package testingexcellence.simulations.activityCodeControllerSimulation

import io.gatling.core.Predef._
import testingexcellence.config.Config.users
import testingexcellence.scenarios.activityCodeControllerScenario.UpdateActivityCodeByIdScenario

class UpdateActivityCodeByIdSimulation extends Simulation{

  private val updateActivityCodeByIdSimulation = UpdateActivityCodeByIdScenario.updateActivityCodeByIdScenario.inject(atOnceUsers(users))

  setUp(updateActivityCodeByIdSimulation)

}
