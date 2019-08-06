package testingexcellence.simulations.meetingAttendanceExpectationControllerSimulation

import io.gatling.core.Predef._
import testingexcellence.scenarios.meetingAttendanceExpectationControllerScenario.CreateExpectationScenario
import testingexcellence.config.Config.users

class CreateExpectationSimulation extends Simulation{

  private val createExpectationSimulation = CreateExpectationScenario.createExpectationScenario.inject(atOnceUsers(users))

  setUp(createExpectationSimulation)
}
