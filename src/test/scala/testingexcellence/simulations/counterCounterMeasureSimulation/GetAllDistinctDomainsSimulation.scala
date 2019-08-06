package testingexcellence.simulations.counterCounterMeasureSimulation

import io.gatling.core.Predef._
import testingexcellence.config.Config.users
import testingexcellence.scenarios.counterMeasureControllerScenario.GetAllDistinctDomainsScenario

class GetAllDistinctDomainsSimulation extends Simulation{

  private val getAllDistinctDomainsSimulation = GetAllDistinctDomainsScenario.getAllDistinctDomainsScenario.inject(atOnceUsers(users))

  setUp(getAllDistinctDomainsSimulation)


}
