package testingexcellence.simulations.meetingAttendanceExpectationControllerSimulation

import io.gatling.core.Predef._
import testingexcellence.config.Config.users
import testingexcellence.scenarios.meetingAttendanceExpectationControllerScenario.GetExpectationByIdScenario

class GetExpectationByIdSimulation extends Simulation{

  private val getExpectationByIdSimulation = GetExpectationByIdScenario.getExpectationsScenario.inject(atOnceUsers(users))

  setUp(getExpectationByIdSimulation)
}
