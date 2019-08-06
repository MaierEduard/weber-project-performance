package testingexcellence.requests

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import testingexcellence.config.Config.app_url

object GetTokenAsWorkerRequest{


    val get_token_as_worker = http("RequestName")
      .post(app_url + "/oauth/token?username=rolly&password=123456&grant_type=password")
      .basicAuth("weber.swagger.local", "weber.swagger.local")
      .check(status is 200)
      .check(jsonPath("$..access_token").saveAs("workerToken"))

}


//val headers_10 = Map("Content-Type" -> """application/json""", "API-KEY" -> "your_api_key", "Authorization Bearer" -> "auth_bearer")