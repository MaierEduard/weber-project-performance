package testingexcellence.scenarios.accountControllerScenario

import io.gatling.core.Predef.scenario
import testingexcellence.requests.GetTokenRequest
import testingexcellence.requests.accountControllerRequest.GetAccountByIdRequest

object GetAccountByIdScenario {

  val getAccountByIdScenario = scenario("Get Account By Id Scenario")
    .exec(GetTokenRequest.get_token)
    .exec(GetAccountByIdRequest.get_account_by_id)

}
