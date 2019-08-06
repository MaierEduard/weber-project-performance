package testingexcellence.requests.accountControllerRequest

import testingexcellence.config.Config.app_url
import io.gatling.core.Predef._
import io.gatling.http.Predef._

object UpdateAccountByIdRequest {

  val sentHeaders = Map("Authorization" -> "Bearer ${token}")

  val update_account_by_id = exec(http("Update account by id request")
    .put(app_url + "/accounts/${AccountId}")
    .body(StringBody("""{"firstName":"Morometii", "lastName":"Morometii2"}""")).asJson
    .headers(sentHeaders)
    .check(status is 204))

}
