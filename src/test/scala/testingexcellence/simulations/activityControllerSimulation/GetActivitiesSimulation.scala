package testingexcellence.simulations.activityControllerSimulation

import io.gatling.core.Predef._
import testingexcellence.config.Config.users
import testingexcellence.scenarios.activityControllerScenario.GetActivitiesScenario

class GetActivitiesSimulation extends Simulation{

  private val getActivitiesSimulation = GetActivitiesScenario.getActivitiesScenario.inject(atOnceUsers(users))

  setUp(getActivitiesSimulation)

}
