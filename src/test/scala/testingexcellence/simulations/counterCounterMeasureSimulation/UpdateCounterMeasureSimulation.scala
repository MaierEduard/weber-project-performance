package testingexcellence.simulations.counterCounterMeasureSimulation

import io.gatling.core.Predef._
import testingexcellence.config.Config.users
import testingexcellence.scenarios.counterMeasureControllerScenario.UpdateCounterMeasureByIdScenario

class UpdateCounterMeasureSimulation extends Simulation{

  private val updateCounterMeasureSimulation = UpdateCounterMeasureByIdScenario.updateCounterMeasureByIdScenario.inject(atOnceUsers(users))

  setUp(updateCounterMeasureSimulation)


}
