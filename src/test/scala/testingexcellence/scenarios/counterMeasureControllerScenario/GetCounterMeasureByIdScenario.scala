package testingexcellence.scenarios.counterMeasureControllerScenario

import io.gatling.core.Predef._
import testingexcellence.requests.GetTokenRequest
import testingexcellence.requests.counterMeasureControllerRequest.GetCounterMeasureByIdRequest

object GetCounterMeasureByIdScenario {

  val getCounterMeasureByIdScenario = scenario("Get Counter Measure By Id Scenario")

    .exec(GetTokenRequest.get_token)
    .exec(GetCounterMeasureByIdRequest.getCounterMeasureByIdRequest)

}
