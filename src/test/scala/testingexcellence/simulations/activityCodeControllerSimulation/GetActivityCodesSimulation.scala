package testingexcellence.simulations.activityCodeControllerSimulation

import io.gatling.core.Predef._
import testingexcellence.config.Config.users
import testingexcellence.scenarios.activityCodeControllerScenario.GetActivityCodesScenario

class GetActivityCodesSimulation extends Simulation{

  private val getActivityCodesSimulation = GetActivityCodesScenario.getActivityCodesScenario.inject(atOnceUsers(users))

  setUp(getActivityCodesSimulation)

}
