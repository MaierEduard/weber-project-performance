package testingexcellence.simulations.counterCounterMeasureSimulation

import io.gatling.core.Predef._
import testingexcellence.config.Config.users
import testingexcellence.scenarios.counterMeasureControllerScenario.DeleteCounterMeasureByIdScenario

class DeleteCounterMeasureByIdSimulation extends Simulation{

  private val deleteCounterMeasureByIdSimulation = DeleteCounterMeasureByIdScenario.deleteCounterMeasureByIdScenario.inject(atOnceUsers(users))

  setUp(deleteCounterMeasureByIdSimulation)


}
