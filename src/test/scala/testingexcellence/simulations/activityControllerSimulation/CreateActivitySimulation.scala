package testingexcellence.simulations.activityControllerSimulation

import io.gatling.core.Predef._
import testingexcellence.config.Config.users
import testingexcellence.scenarios.activityControllerScenario.CreateActivityScenario

class CreateActivitySimulation extends Simulation{

  private val createActivitySimulation = CreateActivityScenario.createActivityScenario.inject(atOnceUsers(users))

  setUp(createActivitySimulation)

}
