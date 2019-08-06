package testingexcellence.simulations.fileManagementControllerSimulation

import io.gatling.core.Predef._
import testingexcellence.scenarios.fileManagementControllerScenario.DeleteFileScenario
import testingexcellence.config.Config.users

class DeleteFileSimulation extends Simulation{

  private val deleteFileSimulation = DeleteFileScenario.deleteFileScenario.inject(atOnceUsers(users))

  setUp(deleteFileSimulation)

}
