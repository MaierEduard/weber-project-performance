package testingexcellence.requests.MeetingAttendanceExpectationControllerRequest

import io.gatling.http.Predef._
import io.gatling.core.Predef._
import testingexcellence.config.Config.app_url

object UpdateExpectationsRequestFlaviuuuuuu {

  val sentHeaders = Map("Authorization" -> "Bearer ${token}",
    "Content-Type" -> "application/json")

  val updateExpectationsRequest = exec(http("Update Expectations Request")
    .put(app_url + "/meetings/attendance/expectations")
    .headers(sentHeaders)
    .body(StringBody("""{ "expectationIds" : ["5cb58220be41760001a4cb50"], "attendanceRequiredDatesUpdate" : [{ "date" : "2018-07-07", "updateType" : "ADD"}]}"""))
    .check(status is 200))

}
