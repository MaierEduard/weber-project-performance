package testingexcellence.simulations.accountControllerSimulations.accountControllerPerformanceSimulation

import io.gatling.core.Predef._
import testingexcellence.scenarios.accountControllerScenario.accountControllerPerformanceScenario.CreateAccountPerformanceScenario
import testingexcellence.config.Config.users

class CreateAccountPerformanceSimulation extends Simulation{

  private val createAccountPerformanceSimulation = CreateAccountPerformanceScenario.createAccountPerformanceScenario.inject(atOnceUsers(users))

  setUp(createAccountPerformanceSimulation)

}
