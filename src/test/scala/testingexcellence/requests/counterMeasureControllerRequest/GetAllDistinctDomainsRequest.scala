package testingexcellence.requests.counterMeasureControllerRequest

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import testingexcellence.config.Config.app_url

object GetAllDistinctDomainsRequest {

  val sentHeaders = Map("Authorization" -> "Bearer ${token}",
    "Content-Type" -> "application/json")

  val getAllDistinctDomainsRequest = exec(http("Get All Distinct Domains Request")
  .get(app_url + "/counter-measures/domains")
  .headers(sentHeaders)
      .check(status is 200)
  )

}
