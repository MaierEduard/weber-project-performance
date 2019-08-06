package testingexcellence.simulations.counterCounterMeasureSimulation

import io.gatling.core.Predef._
import testingexcellence.config.Config.users
import testingexcellence.scenarios.counterMeasureControllerScenario.CreateCounterMeasureScenario

class CreateCounterMeasureSimulation extends Simulation{

  private val createCounterMeasureSimulation = CreateCounterMeasureScenario.createCounterMeasureScenario.inject(atOnceUsers(users))

  setUp(createCounterMeasureSimulation)

}

