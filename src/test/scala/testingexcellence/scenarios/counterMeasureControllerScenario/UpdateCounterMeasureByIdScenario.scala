package testingexcellence.scenarios.counterMeasureControllerScenario

import io.gatling.core.Predef._
import testingexcellence.requests.GetTokenRequest
import testingexcellence.requests.counterMeasureControllerRequest.UpdateCounterMeasureByIdRequest

object UpdateCounterMeasureByIdScenario {

  val updateCounterMeasureByIdScenario = scenario("Update Counter Measure By Id Scenario")

    .exec(GetTokenRequest.get_token)
    .exec(UpdateCounterMeasureByIdRequest.updateCounterMeasureByIdRequest)

}
