package testingexcellence.requests.activityControllerRequest

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import testingexcellence.config.Config.app_url

object CreateActivityRequest {

  val sentHeaders = Map("Authorization" -> "Bearer ${workerToken}",
    "Content-Type" -> "application/json")

  val createActivityRequest = exec(http("Create Activity Request")
  .post(app_url + "/performance-control/activities")
  .headers(sentHeaders)
      .body(StringBody("""{"codeId" : "5b3e88137a0eb30001fb2265", "start" : "2018-07-25T09:30:18.744", "shift" : "shift", "addedValue" : "true"}"""))
  .check(status is 201)
    .check(jsonPath("$..id").saveAs("ActivityId")))


}
