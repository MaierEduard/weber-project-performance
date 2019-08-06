package testingexcellence.requests


import io.gatling.core.Predef._
import io.gatling.http.Predef._
import testingexcellence.config.Config.app_url

object GetTokenRequest {


    val get_token = http("RequestName")
      .post(app_url + "/oauth/token?username=admin&password=123456&grant_type=password")
      .basicAuth("weber.swagger.local", "weber.swagger.local")
      .check(status is 200)
      .check(jsonPath("$..access_token").saveAs("token"))

}

//object GetIdRequest{
//
//    val get_id = http("Get id")
//      .po



