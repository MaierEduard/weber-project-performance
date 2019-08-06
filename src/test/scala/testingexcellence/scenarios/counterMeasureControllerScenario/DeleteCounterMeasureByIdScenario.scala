package testingexcellence.scenarios.counterMeasureControllerScenario

import io.gatling.core.Predef._
import testingexcellence.requests.GetTokenRequest
import testingexcellence.requests.counterMeasureControllerRequest.DeleteCounterMeasureByIdRequest
object DeleteCounterMeasureByIdScenario {

  val deleteCounterMeasureByIdScenario = scenario("Delete Counter Measure By Id Scenario")

    .exec(GetTokenRequest.get_token)
    .exec(DeleteCounterMeasureByIdRequest.deleteCounterMeasureByIdRequest)

}
