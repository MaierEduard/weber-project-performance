package testingexcellence.requests.counterMeasureControllerRequest

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import testingexcellence.config.Config.app_url

object GetCounterMeasureByIdRequest {

  val sentHeaders = Map("Authorization" -> "Bearer ${token}",
    "Content-Type" -> "application/json")

  val getCounterMeasureByIdRequest = exec(http("Get Counter Measure By Id Request")
  .get(app_url + "/counter-measures/5d417c37be41760001a4ccc9")
  .headers(sentHeaders)
      .check(status is 200)
  )

}
