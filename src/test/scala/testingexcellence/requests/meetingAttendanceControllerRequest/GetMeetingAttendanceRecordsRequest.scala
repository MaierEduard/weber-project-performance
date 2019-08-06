package testingexcellence.requests.meetingAttendanceControllerRequest

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import testingexcellence.config.Config.app_url

object GetMeetingAttendanceRecordsRequest {

  val sentHeaders = Map("Authorization" -> "Bearer ${token}",
    "Content-Type" -> "application/json")

  val getMeetingAttendanceRecordsRequest = exec(http("Get Meeting Attendance Records Request")
  .get(app_url + "/meetings/attendance?startDate=2018-08-08&endDate=2019-09-09")
  .headers(sentHeaders)
  )
}
