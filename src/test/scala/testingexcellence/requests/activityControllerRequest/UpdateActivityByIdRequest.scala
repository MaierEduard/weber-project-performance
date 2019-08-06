package testingexcellence.requests.activityControllerRequest

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import testingexcellence.config.Config.app_url

object UpdateActivityByIdRequest {

  val sentHeaders = Map("Authorization" -> "Bearer ${workerToken}",
    "Content-Type" -> "application/json")

  val updateActivityRequest = exec(http("Update Activity Request")
  .put(app_url + "/performance-control/activities/${ActivityId}")
  .headers(sentHeaders)
      .body(StringBody("""{"codeId" : "5b3e88137a0eb30001fb2265", "shift" : "shift"}"""))
  .check(status is 204))

}
