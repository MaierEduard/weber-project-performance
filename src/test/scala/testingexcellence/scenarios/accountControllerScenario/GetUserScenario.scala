package testingexcellence.scenarios.accountControllerScenario

import io.gatling.core.Predef.scenario
import testingexcellence.requests.GetTokenRequest
import testingexcellence.requests.accountControllerRequest.GetUsersRequest

object GetUserScenario {

  val getUserScenario = scenario("Get User Scenario")
    .exec(GetTokenRequest.get_token)
    .exec(GetUsersRequest.get_user)

}
