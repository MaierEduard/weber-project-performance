package testingexcellence.requests.activityControllerRequest

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import testingexcellence.config.Config.app_url

object DeleteActivityByIdRequest {

  val sentHeaders = Map("Authorization" -> "Bearer ${workerToken}",
    "Content-Type" -> "application/json")

  val deleteActivityByIdRequest = exec(http("Delete Activity By Id Request")
  .delete(app_url + "/performance-control/activities/${ActivityId}")
  .headers(sentHeaders)
  .check(status is 204))

}
