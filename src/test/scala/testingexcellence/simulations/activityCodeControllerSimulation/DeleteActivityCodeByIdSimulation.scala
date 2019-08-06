package testingexcellence.simulations.activityCodeControllerSimulation

import io.gatling.core.Predef._
import testingexcellence.config.Config.users
import testingexcellence.scenarios.activityCodeControllerScenario.DeleteActivityCodeByIdScenario

class DeleteActivityCodeByIdSimulation extends Simulation{

  private val deleteActivityCodeByIdSimulation = DeleteActivityCodeByIdScenario.deleteActivityCodeByIdScenario.inject(atOnceUsers(users))

  setUp(deleteActivityCodeByIdSimulation)

}
