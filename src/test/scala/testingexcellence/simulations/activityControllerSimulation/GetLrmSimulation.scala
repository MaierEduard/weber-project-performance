package testingexcellence.simulations.activityControllerSimulation

import io.gatling.core.Predef._
import testingexcellence.config.Config.users
import testingexcellence.scenarios.activityControllerScenario.GetLrmScenario

class GetLrmSimulation extends Simulation{

  private val getLrmSimulation = GetLrmScenario.getLrmScenario.inject(atOnceUsers(users))

  setUp(getLrmSimulation)

}
