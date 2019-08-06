package testingexcellence.requests.accountControllerRequest

import testingexcellence.config.Config.app_url
import io.gatling.core.Predef._
import io.gatling.http.Predef._


object GetAccountByIdRequest {

  val sentHeaders = Map("Authorization" -> "Bearer ${token}",
    "Content-Type" -> "application/json")

  val get_account_by_id = exec(http("Get account by id request")
    .get(app_url + "/accounts/${AccountId}")
    .headers(sentHeaders)
    .check(status is 200))

}
