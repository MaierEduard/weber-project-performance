package testingexcellence.simulations.activityCodeControllerSimulation

import io.gatling.core.Predef._
import testingexcellence.config.Config.users
import testingexcellence.scenarios.activityCodeControllerScenario.GetAllActivityCategoriesScenario

class GetAllActivityCategoriesSimulation extends Simulation{

  private val getAllActivityCategoriesSimulation = GetAllActivityCategoriesScenario.getAllActivityCategoriesScenario.inject(atOnceUsers(users))

  setUp(getAllActivityCategoriesSimulation)

}
