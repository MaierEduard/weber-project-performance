package testingexcellence.simulations.activityCodeControllerSimulation

import io.gatling.core.Predef._
import testingexcellence.config.Config.users
import testingexcellence.scenarios.activityCodeControllerScenario.GetActivityCodeByIdScenario

class GetActivityCodeByIdSimulation extends Simulation{

  private val getActivityCodeByIdSimulation = GetActivityCodeByIdScenario.getActivityCodeByIdScenario.inject(atOnceUsers(users))

  setUp(getActivityCodeByIdSimulation)

}
