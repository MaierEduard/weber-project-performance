package testingexcellence.scenarios.accountControllerScenario

import io.gatling.core.Predef.scenario
import testingexcellence.requests.GetTokenRequest
import testingexcellence.requests.accountControllerRequest.CreateUserRequest

object CreateUserScenario {

  val createUserScenario = scenario("Create User Scenario")
    .exec(GetTokenRequest.get_token)
    .exec(CreateUserRequest.create_user)

}
