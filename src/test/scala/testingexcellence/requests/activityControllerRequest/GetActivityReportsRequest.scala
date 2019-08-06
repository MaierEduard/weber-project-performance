package testingexcellence.requests.activityControllerRequest

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import testingexcellence.config.Config.app_url

object GetActivityReportsRequest {

  val sentHeaders = Map("Authorization" -> "Bearer ${token}",
    "Content-Type" -> "application/json")

  val getActivityReportsRequest = exec(http("Get Activity Reports Request")
  .get(app_url + "/performance-control/activities/reports")
  .headers(sentHeaders)
  .check(status is 200))

}
