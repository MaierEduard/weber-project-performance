package testingexcellence.scenarios.meetingAttendanceControllerScenario

import io.gatling.core.Predef._
import testingexcellence.requests.GetTokenRequest
import testingexcellence.requests.meetingAttendanceControllerRequest.CreateMeetingAttendanceRecordRequest

object CreateMeetingAttendanceRecordScenario {

  val createMeetingAttendanceRecordScenario = scenario("Create Meeting Attendance Record Scenario")

    .exec(GetTokenRequest.get_token)
    .exec(CreateMeetingAttendanceRecordRequest.createMeetingAttendanceRecordRequest)

}
