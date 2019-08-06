package testingexcellence.scenarios.counterMeasureControllerScenario

import io.gatling.core.Predef._
import testingexcellence.requests.GetTokenRequest
import testingexcellence.requests.counterMeasureControllerRequest.GetAllDistinctDomainsRequest

object GetAllDistinctDomainsScenario {

  val getAllDistinctDomainsScenario = scenario("Get All Distinct Domains Scenario")

    .exec(GetTokenRequest.get_token)
    .exec(GetAllDistinctDomainsRequest.getAllDistinctDomainsRequest)

}
