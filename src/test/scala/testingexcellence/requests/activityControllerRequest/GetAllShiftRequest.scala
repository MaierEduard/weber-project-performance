package testingexcellence.requests.activityControllerRequest

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import testingexcellence.config.Config.app_url

object GetAllShiftRequest {

  val sentHeaders = Map("Authorization" -> "Bearer ${token}",
    "Content-Type" -> "application/json")

  val getAllShiftRequest = exec(http("Get All Shift Request")
  .get(app_url + "/performance-control/activities/shifts")
  .headers(sentHeaders)
  .check(status is 200))

}
