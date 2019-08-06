package testingexcellence.requests.MeetingAttendanceExpectationControllerRequest

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import testingexcellence.config.Config.app_url

object UpdateExpectationByIdRequest {


  val sentHeaders = Map("Authorization" -> "Bearer ${token}",
    "Content-Type" -> "application/json")

  val updateExpectationRequest = exec(http("Update Expectation Request")
    .put(app_url + "/meetings/attendance/expectations/5cb58252be41760001a4cb5c")
    .headers(sentHeaders)
    .body(StringBody("""{ "expectation" : "N/A", "accountId" : "5b4113217a0eb300013a6684"}"""))
    .check(status is 204))

}
