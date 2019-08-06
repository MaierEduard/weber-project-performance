package testingexcellence.requests.meetingAttendanceControllerRequest

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import testingexcellence.config.Config.app_url

object CreateMeetingAttendanceRecordRequest {

  val sentHeaders = Map("Authorization" -> "Bearer ${token}",
    "Content-Type" -> "application/json")

  val createMeetingAttendanceRecordRequest = exec(http("Create Meeting Attendance Record Request")
  .post(app_url + "/meetings/attendance")
  .headers(sentHeaders)
    .body(StringBody("""{ "accountId" : "5b07d0a724e49900016b9aee", "status" : "ABSENT", "date" : "2018-07-26" }"""))
  )

}
