package testingexcellence.requests.activityControllerRequest

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import testingexcellence.config.Config.app_url

object GetActivityByIdRequest {

  val sentHeaders = Map("Authorization" -> "Bearer ${token}",
    "Content-Type" -> "application/json")

  val getActivityByIdRequest = exec(http("Get Activity By Id Request")
  .get(app_url + "/performance-control/activities/${ActivityId}")
  .headers(sentHeaders)
  .check(status is 200))

}
