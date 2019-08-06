package testingexcellence.requests.counterMeasureControllerRequest

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import testingexcellence.config.Config.app_url

object GetCounterMeasuresRequest {

  val sentHeaders = Map("Authorization" -> "Bearer ${token}",
    "Content-Type" -> "application/json")

  val getCounterMeasuresRequest = exec(http("Get Counter Measures Request")
  .get(app_url + "/counter-measures")
  .headers(sentHeaders)
      .check(status is 200)
  )

}
