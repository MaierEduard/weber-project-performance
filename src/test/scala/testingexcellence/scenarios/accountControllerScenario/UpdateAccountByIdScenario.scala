package testingexcellence.scenarios.accountControllerScenario

import io.gatling.core.Predef.scenario
import testingexcellence.requests.GetTokenRequest
import testingexcellence.requests.accountControllerRequest.UpdateAccountByIdRequest

object UpdateAccountByIdScenario {

  val updateAccountByIdScenario = scenario("Update Account By Id")
    .exec(GetTokenRequest.get_token)
    .exec(UpdateAccountByIdRequest.update_account_by_id)


}
