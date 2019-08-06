package testingexcellence.simulations.fileManagementControllerSimulation

import io.gatling.core.Predef._
import testingexcellence.scenarios.fileManagementControllerScenario.UploadImageScenario
import testingexcellence.config.Config.users

class UploadImageSimulation extends Simulation{

  private val uploadFileSimulation = UploadImageScenario.uploadFileScenario.inject(atOnceUsers(users))

  setUp(uploadFileSimulation)
}
