package testingexcellence.simulations.activityControllerSimulation

import io.gatling.core.Predef._
import testingexcellence.config.Config.users
import testingexcellence.scenarios.activityControllerScenario.GetActivityByIdScenario

class GetActivityByIdSimulation extends Simulation{

  private val getActivityByIdSimulation = GetActivityByIdScenario.getActivityByIdScenario.inject(atOnceUsers(users))

  setUp(getActivityByIdSimulation)

}
