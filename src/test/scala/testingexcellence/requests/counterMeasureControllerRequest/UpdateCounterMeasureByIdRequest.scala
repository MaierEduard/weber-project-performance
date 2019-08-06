package testingexcellence.requests.counterMeasureControllerRequest

import testingexcellence.config.Config.app_url
import io.gatling.core.Predef._
import io.gatling.http.Predef._

object UpdateCounterMeasureByIdRequest {

  val sentHeaders = Map("Authorization" -> "Bearer ${token}",
    "Content-Type" -> "application/json")

  val updateCounterMeasureByIdRequest = exec(http("Update Counter Measure By Id Request")
  .put(app_url + "/counter-measures/5d417c37be41760001a4ccc9")
  .headers(sentHeaders)
    .body(StringBody("""{ "issue" : "nu m-ai am tigari", "cause" : "Sanatate", "selectedMeasure" : "critical", "domain" : "tutun"}"""))
      .check(status is 204)
  )

}
