package testingexcellence.scenarios.counterMeasureControllerScenario

import io.gatling.core.Predef._
import testingexcellence.requests.GetTokenRequest
import testingexcellence.requests.counterMeasureControllerRequest.CreateCounterMeasureRequest
object CreateCounterMeasureScenario {

  val createCounterMeasureScenario = scenario("Create Counter Measure Scenario")

    .exec(GetTokenRequest.get_token)
    .exec(CreateCounterMeasureRequest.createCounterMeasureRequest)

}
