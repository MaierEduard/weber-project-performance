package testingexcellence.simulations.fileManagementControllerSimulation

import io.gatling.core.Predef._
import testingexcellence.config.Config.users
import testingexcellence.scenarios.fileManagementControllerScenario.RotateImageScenario

class RotateImageSimulation extends Simulation{

  private val rotateFileSimulation = RotateImageScenario.rotateFileScenario.inject(atOnceUsers(users))

  setUp(rotateFileSimulation)
}
