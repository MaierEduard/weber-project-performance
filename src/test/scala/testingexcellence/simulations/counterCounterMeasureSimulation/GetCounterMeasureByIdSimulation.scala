package testingexcellence.simulations.counterCounterMeasureSimulation

import io.gatling.core.Predef._
import testingexcellence.config.Config.users
import testingexcellence.scenarios.counterMeasureControllerScenario.GetCounterMeasureByIdScenario

class GetCounterMeasureByIdSimulation extends Simulation{

  private val getCounterMeasureByIdSimulation = GetCounterMeasureByIdScenario.getCounterMeasureByIdScenario.inject(atOnceUsers(users))

  setUp(getCounterMeasureByIdSimulation)


}
