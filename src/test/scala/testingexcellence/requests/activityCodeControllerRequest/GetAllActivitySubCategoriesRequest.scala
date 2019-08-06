package testingexcellence.requests.activityCodeControllerRequest

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import testingexcellence.config.Config.app_url

object GetAllActivitySubCategoriesRequest {

  val sentHeaders = Map("Authorization" -> "Bearer ${token}",
    "Content-Type" -> "application/json")

  val getAllActivitySubCategoriesRequest = exec(http("Get All Activity Sub Categories Request")
  .get(app_url + "/performance-control/activities/codes/subcategories")
  .headers(sentHeaders)
  .check(status is 200))

}
