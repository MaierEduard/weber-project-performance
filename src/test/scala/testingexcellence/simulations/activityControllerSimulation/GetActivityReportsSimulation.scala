package testingexcellence.simulations.activityControllerSimulation

import io.gatling.core.Predef._
import testingexcellence.config.Config.users
import testingexcellence.scenarios.activityControllerScenario.GetActivityReportsScenario

class GetActivityReportsSimulation extends Simulation{

  private val getActivityReportsSimulation = GetActivityReportsScenario.getActivityReportsScenario.inject(atOnceUsers(users))

  setUp(getActivityReportsSimulation)

}
