package testingexcellence.requests.meetingAttendanceControllerRequest

import io.gatling.core.Predef._
import io.gatling.http.Predef.http
import testingexcellence.config.Config.app_url

object GetMeetingAttendanceRecordByIdRequest {

  val sentHeaders = Map("Authorization" -> "Bearer ${token}",
    "Content-Type" -> "application/json")

  val getMeetingAttendanceRecordRequest = exec(http("Get Meeting Attendance Record Request")
    .get(app_url + "/meetings/attendance/5d42ced0be41760001a4cce2")
    .headers(sentHeaders)
  )

}
