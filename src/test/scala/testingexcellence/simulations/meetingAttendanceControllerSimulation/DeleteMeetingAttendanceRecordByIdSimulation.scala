package testingexcellence.simulations.meetingAttendanceControllerSimulation

import io.gatling.core.Predef._
import testingexcellence.config.Config.users
import testingexcellence.scenarios.meetingAttendanceControllerScenario.DeleteMeetingAttendanceRecordByIdScenario

class DeleteMeetingAttendanceRecordByIdSimulation extends Simulation{

  private val deleteMeetingAttendanceRecordSimulation = DeleteMeetingAttendanceRecordByIdScenario.deleteMeetingAttendanceRecordScenario.inject(atOnceUsers(users))

  setUp(deleteMeetingAttendanceRecordSimulation)

}