package testingexcellence.requests.activityCodeControllerRequest

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import testingexcellence.config.Config.app_url

object GetAllActivityCategoriesRequest {

  val sentHeaders = Map("Authorization" -> "Bearer ${token}",
    "Content-Type" -> "application/json")

  val getAllActivityCategoriesRequest = exec(http("Get All Activity Categories Request")
  .get(app_url + "/performance-control/activities/codes/categories")
  .headers(sentHeaders)
  .check(status is 200))

}
