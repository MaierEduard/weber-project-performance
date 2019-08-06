package testingexcellence.requests.accountControllerRequest

import testingexcellence.config.Config.app_url
import io.gatling.core.Predef._
import io.gatling.http.Predef._


object GetAccountsRequest {


  val sentHeaders = Map("Authorization" -> "Bearer ${token}")

  val get_accounts = exec(http("Get accounts request")
    .get(app_url + "/accounts")
    .headers(sentHeaders)
    .check(status is 200))

}
