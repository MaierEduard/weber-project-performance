package testingexcellence.requests.counterMeasureControllerRequest

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import testingexcellence.config.Config.app_url

object GetLastModifiedCounterMeasureRequest {

  val sentHeaders = Map("Authorization" -> "Bearer ${token}",
    "Content-Type" -> "application/json")

  val getLastModifiedCounterMeasureRequest = exec(http("Get Last Modified Counter Measure Request")
  .get(app_url + "/counter-measures/updates/latest")
  .headers(sentHeaders)
      .check(status is 200)
  )

}
