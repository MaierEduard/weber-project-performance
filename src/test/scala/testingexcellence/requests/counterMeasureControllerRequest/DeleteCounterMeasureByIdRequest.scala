package testingexcellence.requests.counterMeasureControllerRequest

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import testingexcellence.config.Config.app_url

object DeleteCounterMeasureByIdRequest {

  val sentHeaders = Map("Authorization" -> "Bearer ${token}",
    "Content-Type" -> "application/json")

  val deleteCounterMeasureByIdRequest = exec(http("Delete Counter Measure By Id Request")
  .delete(app_url + "/counter-measures/5d417c37be41760001a4ccc9")
  .headers(sentHeaders)
      .check(status is 204)
  )

}
