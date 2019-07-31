package testingexcellence.simulations.accountControllerSimulations

import io.gatling.core.Predef.{Simulation, _}
import testingexcellence.config.Config._
import testingexcellence.scenarios.accountControllerScenario.GetUserScenario

class GetUserSimulation extends Simulation{

  private val getUser = GetUserScenario.getUserScenario.inject(atOnceUsers(users))
  setUp(getUser)

}
