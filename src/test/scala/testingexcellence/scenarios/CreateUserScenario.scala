package testingexcellence.scenarios



import io.gatling.core.Predef.scenario
import testingexcellence.requests.CreateUserRequest
import testingexcellence.requests.GetTokenRequest

object CreateUserScenario {

  val createUserScenario = scenario("Create User Scenario")
    .exec(GetTokenRequest.get_token)
    .exec(CreateUserRequest.create_user)

}
