package testingexcellence.scenarios.counterMeasureControllerScenario

import io.gatling.core.Predef._
import testingexcellence.requests.GetTokenRequest
import testingexcellence.requests.counterMeasureControllerRequest.GetLastModifiedCounterMeasureRequest

object GetLastModifiedCounterMeasureScenario {

  val getLastModifiedCounterMeasureScenario = scenario("Get Last Modified Counter Measure Scenario")

    .exec(GetTokenRequest.get_token)
    .exec(GetLastModifiedCounterMeasureRequest.getLastModifiedCounterMeasureRequest)

}
