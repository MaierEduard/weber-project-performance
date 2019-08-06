package testingexcellence.scenarios.meetingAttendanceControllerScenario

import io.gatling.core.Predef.scenario
import testingexcellence.requests.GetTokenRequest
import testingexcellence.requests.meetingAttendanceControllerRequest.DeleteMeetingAttendanceRecordByIdRequest

object DeleteMeetingAttendanceRecordByIdScenario {

  val deleteMeetingAttendanceRecordScenario = scenario("Delete Meeting Attendance Record Scenario")

    .exec(GetTokenRequest.get_token)
    .exec(DeleteMeetingAttendanceRecordByIdRequest.deleteMeetingAttendanceRecordRequest)

}
