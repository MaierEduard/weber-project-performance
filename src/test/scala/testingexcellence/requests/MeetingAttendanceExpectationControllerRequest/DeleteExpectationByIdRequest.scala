package testingexcellence.requests.MeetingAttendanceExpectationControllerRequest

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import testingexcellence.config.Config.app_url

object DeleteExpectationByIdRequest {


  val sentHeaders = Map("Authorization" -> "Bearer ${token}",
    "Content-Type" -> "application/json")

  val deleteExpectationRequest = exec(http("Delete Expectation By Id Request")
  .delete(app_url + "/meetings/attendance/expectations/5cb58252be41760001a4cb5c")
  .headers(sentHeaders))

}
