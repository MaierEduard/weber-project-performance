package testingexcellence.requests.MeetingAttendanceExpectationControllerRequest

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import testingexcellence.config.Config.app_url

object GetExpectationsRequest {


  val sentHeaders = Map("Authorization" -> "Bearer ${token}",
    "Content-Type" -> "application/json")

  val getExpectationRequest = exec(http("Get Expectations Request")
  .get(app_url + "/meetings/attendance/expectations")
  .headers(sentHeaders)
  .check(status is 200))


}
