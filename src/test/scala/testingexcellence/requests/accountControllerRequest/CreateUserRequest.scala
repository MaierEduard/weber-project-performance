package testingexcellence.requests.accountControllerRequest

import testingexcellence.config.Config.app_url
import io.gatling.core.Predef._
import io.gatling.http.Predef._


object CreateUserRequest {
  val sentHeaders = Map("Authorization" -> "Bearer ${token}",
  "Content-Type" -> "application/json")

  val create_user = exec(http("Create User Request")
    .post(app_url + "/accounts")
    .headers(sentHeaders)

    .body(StringBody("""{"firstName":"bimba", "lastName":"louyyy"}""")).asJson
//    .formParam("firstName", "Dorel").asJson
//    .formParam("lastName", "TotDorel").asJson
    .check(status is 201))

}
