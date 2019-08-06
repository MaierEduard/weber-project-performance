package testingexcellence.requests.activityCodeControllerRequest

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import testingexcellence.config.Config.app_url

object GetActivityCodesRequest {

  val sentHeaders = Map("Authorization" -> "Bearer ${token}",
    "Content-Type" -> "application/json")

  val getActivityCodesRequest = exec(http("Get Activity Codes Request")
  .get(app_url + "/performance-control/activities/codes?addedValue=true")
  .headers(sentHeaders)
  .check(status is 200))

}
