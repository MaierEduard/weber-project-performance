package testingexcellence.simulations.activityCodeControllerSimulation.activityCodeControllerPerformanceSimulation

import io.gatling.core.Predef._
import testingexcellence.scenarios.activityCodeControllerScenario.activityCodeControllerPerformanceScenario.CreateActivityCodePerformanceScenario
import testingexcellence.config.Config.users

class CreateActivityCodePerformanceSimulation extends Simulation{

  private val createActivityCodePerformanceSimulation = CreateActivityCodePerformanceScenario.createActivityCodePerformanceScenario.inject(atOnceUsers(users))

  setUp(createActivityCodePerformanceSimulation)

}
