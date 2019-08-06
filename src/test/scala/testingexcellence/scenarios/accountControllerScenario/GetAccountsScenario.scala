package testingexcellence.scenarios.accountControllerScenario

import io.gatling.core.Predef.scenario
import testingexcellence.requests.GetTokenRequest
import testingexcellence.requests.accountControllerRequest.GetAccountsRequest

object GetAccountsScenario {

  val getAccountsScenario = scenario("Get Accounts Scenario")
    .exec(GetTokenRequest.get_token)
    .exec(GetAccountsRequest.get_accounts)

}
