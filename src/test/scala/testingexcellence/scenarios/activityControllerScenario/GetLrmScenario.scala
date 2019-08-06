package testingexcellence.scenarios.activityControllerScenario

import io.gatling.core.Predef._
import testingexcellence.requests.GetTokenRequest
import testingexcellence.requests.activityControllerRequest.GetLrmRequest

object GetLrmScenario {


  val getLrmScenario = scenario("Get Lrm Scenario")

    .exec(GetTokenRequest.get_token)
    .exec(GetLrmRequest.getLrmRequest)

}
