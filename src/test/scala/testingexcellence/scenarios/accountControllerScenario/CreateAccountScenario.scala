package testingexcellence.scenarios.accountControllerScenario

import io.gatling.core.Predef.scenario
import testingexcellence.requests.GetTokenRequest
import testingexcellence.requests.accountControllerRequest.CreateAccountRequest

object CreateAccountScenario {

  val createAccountScenario = scenario("Create Account Scenario")
    .exec(GetTokenRequest.get_token)
    .exec(CreateAccountRequest.create_account)

}
