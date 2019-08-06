package testingexcellence.simulations.meetingAttendanceExpectationControllerSimulation

import io.gatling.core.Predef._
import testingexcellence.config.Config.users
import testingexcellence.scenarios.meetingAttendanceExpectationControllerScenario.GetExpectationsScenario

class GetExpectationsSimulation extends Simulation{

  private val getExpectationsSimulation = GetExpectationsScenario.getExpectationsScenario.inject(atOnceUsers(users))

  setUp(getExpectationsSimulation)
}
