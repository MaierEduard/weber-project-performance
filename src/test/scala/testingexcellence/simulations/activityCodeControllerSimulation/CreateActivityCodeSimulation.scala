package testingexcellence.simulations.activityCodeControllerSimulation

import io.gatling.core.Predef._
import testingexcellence.scenarios.activityCodeControllerScenario.CreateActivityCodeScenario
import testingexcellence.config.Config.users

class CreateActivityCodeSimulation extends Simulation{

  private val createActivityCodeSimulation = CreateActivityCodeScenario.createActivityCodeScenario.inject(atOnceUsers(users))

  setUp(createActivityCodeSimulation)

}
