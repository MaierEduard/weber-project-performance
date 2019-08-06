package testingexcellence.requests.activityCodeControllerRequest

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import testingexcellence.config.Config.app_url

object GetActivityCodeByIdRequest {

  val sentHeaders = Map("Authorization" -> "Bearer ${token}",
    "Content-Type" -> "application/json")

  val getActivityCodeRequest = exec(http("Get Activity Code Request")
    .get(app_url + "/performance-control/activities/codes/${ActivityCodeId}")
    .headers(sentHeaders)
    .check(status is 200))

}
