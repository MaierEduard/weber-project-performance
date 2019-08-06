package testingexcellence.simulations.fileManagementControllerSimulation

import io.gatling.core.Predef._
import testingexcellence.scenarios.fileManagementControllerScenario.GetFileScenario
import testingexcellence.config.Config.users

class GetFileSimulation extends Simulation{

  private val getFileSimulation = GetFileScenario.getFileScenario.inject(atOnceUsers(users))

  setUp(getFileSimulation)

}
