package testingexcellence.requests.accountControllerRequest

import testingexcellence.config.Config.app_url
import io.gatling.core.Predef._
import io.gatling.http.Predef._


object GetUsersRequest {


  val sentHeaders = Map("Authorization" -> "Bearer ${token}")

  val get_user = exec(http("Get user request")
    .get(app_url + "/accounts")
    .headers(sentHeaders)
    .check(status is 200))

}
