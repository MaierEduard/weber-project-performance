package testingexcellence.simulations.activityControllerSimulation

import io.gatling.core.Predef._
import testingexcellence.config.Config.users
import testingexcellence.scenarios.activityControllerScenario.UpdateActivityByIdScenario

class UpdateActivityByIdSimulation extends Simulation{

  private val updateActivitySimulation = UpdateActivityByIdScenario.updateActivitiesScenario.inject(atOnceUsers(users))

  setUp(updateActivitySimulation)

}
