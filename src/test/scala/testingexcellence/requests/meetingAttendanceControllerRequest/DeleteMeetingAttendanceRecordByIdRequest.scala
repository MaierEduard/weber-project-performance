package testingexcellence.requests.meetingAttendanceControllerRequest

import io.gatling.core.Predef._
import io.gatling.http.Predef.http
import testingexcellence.config.Config.app_url

object DeleteMeetingAttendanceRecordByIdRequest {

  val sentHeaders = Map("Authorization" -> "Bearer ${token}",
    "Content-Type" -> "application/json")

  val deleteMeetingAttendanceRecordRequest = exec(http("Delete Meeting Attendance Record Request")
    .delete(app_url + "/meetings/attendance/5d42ced0be41760001a4cce2")
    .headers(sentHeaders)
  )

}
