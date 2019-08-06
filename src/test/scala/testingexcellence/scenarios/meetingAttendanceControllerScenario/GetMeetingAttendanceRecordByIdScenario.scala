package testingexcellence.scenarios.meetingAttendanceControllerScenario

import io.gatling.core.Predef.scenario
import testingexcellence.requests.GetTokenRequest
import testingexcellence.requests.meetingAttendanceControllerRequest.GetMeetingAttendanceRecordByIdRequest

object GetMeetingAttendanceRecordByIdScenario {

  val getMeetingAttendanceRecordScenario = scenario("Get Meeting Attendance Record Scenario")

    .exec(GetTokenRequest.get_token)
    .exec(GetMeetingAttendanceRecordByIdRequest.getMeetingAttendanceRecordRequest)

}
