package testingexcellence.simulations.auditControllerSimulation

import io.gatling.core.Predef.{Simulation, _}
import testingexcellence.scenarios.auditControllerScenario.GetAuditsScenario
import testingexcellence.config.Config.users

class GetAuditsSimulation extends Simulation{

  private val getAuditsSimulation = GetAuditsScenario.getAuditsScenario.inject(atOnceUsers(users))

  setUp(getAuditsSimulation)
}
