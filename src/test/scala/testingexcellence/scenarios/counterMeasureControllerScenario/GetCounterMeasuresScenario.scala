package testingexcellence.scenarios.counterMeasureControllerScenario

import io.gatling.core.Predef._
import testingexcellence.requests.GetTokenRequest
import testingexcellence.requests.counterMeasureControllerRequest.GetCounterMeasuresRequest

object GetCounterMeasuresScenario {

  val getCounterMeasuresScenario = scenario("Get Counter Measures Scenario")

    .exec(GetTokenRequest.get_token)
    .exec(GetCounterMeasuresRequest.getCounterMeasuresRequest)

}
