package testingexcellence.requests.accountControllerRequest

import testingexcellence.config.Config.app_url
import io.gatling.core.Predef._
import io.gatling.http.Predef._


object CreateAccountRequest {
  val sentHeaders = Map("Authorization" -> "Bearer ${token}",
  "Content-Type" -> "application/json")

  val create_account = exec(http("Create Account Request")
    .post(app_url + "/accounts")
    .headers(sentHeaders)
    .body(StringBody("""{"firstName":"bimba", "lastName":"louyyy"}""")).asJson
    .check(status is 201)
    .check(jsonPath("$..id").saveAs("AccountId")))


}
