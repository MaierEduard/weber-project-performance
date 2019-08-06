package testingexcellence.scenarios.meetingAttendanceControllerScenario

import io.gatling.core.Predef.scenario
import testingexcellence.requests.GetTokenRequest
import testingexcellence.requests.meetingAttendanceControllerRequest.UpdateMeetingAttendanceRecordByIdRequest

object UpdateMeetingAttendanceRecordByIdScenario {

  val updateMeetingAttendanceRecordScenario = scenario("Update Meeting Attendance Record Scenario")

    .exec(GetTokenRequest.get_token)
    .exec(UpdateMeetingAttendanceRecordByIdRequest.updateMeetingAttendanceRecordRequest)

}
