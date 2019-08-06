package testingexcellence.requests.MeetingAttendanceExpectationControllerRequest

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import testingexcellence.config.Config.app_url

object CreateExpectationRequest {


  val sentHeaders = Map("Authorization" -> "Bearer ${token}",
    "Content-Type" -> "application/json")

  val createExpectationRequest = exec(http("Create Expectation Request")
  .post(app_url + "/meetings/attendance/expectations")
  .headers(sentHeaders)
  .body(StringBody("""{ "expectation" : "Tractorist", "accountId" : "5b0e5f1a24e499000149084d"}""")))

}
