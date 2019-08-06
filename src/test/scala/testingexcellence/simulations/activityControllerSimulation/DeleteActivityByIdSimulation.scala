package testingexcellence.simulations.activityControllerSimulation

import io.gatling.core.Predef._
import testingexcellence.config.Config.users
import testingexcellence.scenarios.activityControllerScenario.DeleteActivityByIdScenario

class DeleteActivityByIdSimulation extends Simulation{

  private val deleteActivityByIdSimulation = DeleteActivityByIdScenario.deleteActivityByIdScenario.inject(atOnceUsers(users))

  setUp(deleteActivityByIdSimulation)

}
