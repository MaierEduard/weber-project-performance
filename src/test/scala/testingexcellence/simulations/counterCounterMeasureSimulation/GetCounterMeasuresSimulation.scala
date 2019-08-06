package testingexcellence.simulations.counterCounterMeasureSimulation

import io.gatling.core.Predef._
import testingexcellence.config.Config.users
import testingexcellence.scenarios.counterMeasureControllerScenario.GetCounterMeasuresScenario

class GetCounterMeasuresSimulation extends Simulation{

  private val getCounterMeasureSimulation = GetCounterMeasuresScenario.getCounterMeasuresScenario.inject(atOnceUsers(users))

  setUp(getCounterMeasureSimulation)


}
