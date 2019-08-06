package testingexcellence.requests.meetingAttendanceControllerRequest

import io.gatling.core.Predef._
import io.gatling.http.Predef.http
import testingexcellence.config.Config.app_url

object UpdateMeetingAttendanceRecordByIdRequest {

  val sentHeaders = Map("Authorization" -> "Bearer ${token}",
    "Content-Type" -> "application/json")

  val updateMeetingAttendanceRecordRequest = exec(http("Update Meeting Attendance Record Request")
    .put(app_url + "/meetings/attendance/5d42ced0be41760001a4cce2")
    .headers(sentHeaders)
    .body(StringBody("""{ "accountId" : "5b07d0a724e49900016b9aee" }"""))
  )

}
