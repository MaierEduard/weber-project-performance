package testingexcellence.scenarios.meetingAttendanceControllerScenario

import io.gatling.core.Predef.scenario
import testingexcellence.requests.GetTokenRequest
import testingexcellence.requests.meetingAttendanceControllerRequest.GetMeetingAttendanceRecordsRequest

object GetMeetingAttendanceRecordsScenario {

  val getMeetingAttendanceRecordsScenario = scenario("Get Meeting Attendance Records Scenario")

    .exec(GetTokenRequest.get_token)
    .exec(GetMeetingAttendanceRecordsRequest.getMeetingAttendanceRecordsRequest)

}
