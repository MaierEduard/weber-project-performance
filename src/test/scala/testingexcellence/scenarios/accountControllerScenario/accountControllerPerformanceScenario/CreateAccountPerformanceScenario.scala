package testingexcellence.scenarios.accountControllerScenario.accountControllerPerformanceScenario

import io.gatling.core.Predef._
import testingexcellence.requests.GetTokenRequest
import testingexcellence.requests.accountControllerRequest.{CreateAccountRequest, GetAccountByIdRequest, UpdateAccountByIdRequest}

object CreateAccountPerformanceScenario {

  val createAccountPerformanceScenario = scenario("Create Account Performance Scenario")

    .exec(GetTokenRequest.get_token)
    .exec(CreateAccountRequest.create_account)
    .exec(GetAccountByIdRequest.get_account_by_id)
    .exec(UpdateAccountByIdRequest.update_account_by_id)
    .exec(GetAccountByIdRequest.get_account_by_id)

}
