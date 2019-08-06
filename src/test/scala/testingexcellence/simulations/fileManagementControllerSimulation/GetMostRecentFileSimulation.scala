package testingexcellence.simulations.fileManagementControllerSimulation

import io.gatling.core.Predef._
import testingexcellence.scenarios.fileManagementControllerScenario.GetMostRecentFileScenario
import testingexcellence.config.Config.users

class GetMostRecentFileSimulation extends Simulation{

  private val getMostRecentFileSimulation = GetMostRecentFileScenario.getMostRecentFileScenario.inject(atOnceUsers(users))

  setUp(getMostRecentFileSimulation)
}
