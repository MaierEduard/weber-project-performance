package testingexcellence.requests.activityCodeControllerRequest

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import testingexcellence.config.Config.app_url

object DeleteActivityCodeByIdRequest {

  val sentHeaders = Map("Authorization" -> "Bearer ${token}",
    "Content-Type" -> "application/json")

  val deleteActivityCodeRequest = exec(http("Delete Activity Code Request")
    .delete(app_url + "/performance-control/activities/codes/${ActivityCodeId}")
    .headers(sentHeaders)
    .check(status is 204))

}
