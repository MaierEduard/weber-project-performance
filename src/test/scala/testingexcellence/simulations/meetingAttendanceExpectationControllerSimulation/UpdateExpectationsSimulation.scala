package testingexcellence.simulations.meetingAttendanceExpectationControllerSimulation

import io.gatling.core.Predef._
import testingexcellence.config.Config.users
import testingexcellence.scenarios.meetingAttendanceExpectationControllerScenario.UpdateExpectationsScenario

class UpdateExpectationsSimulation extends Simulation{

  private val updateExpectationsSimulation = UpdateExpectationsScenario.updateExpectationsScenario.inject(atOnceUsers(users))

  setUp(updateExpectationsSimulation)
}
