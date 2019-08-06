package testingexcellence.requests.activityCodeControllerRequest

import io.gatling.http.Predef._
import io.gatling.core.Predef._
import testingexcellence.config.Config.app_url

object CreateActivityCodeRequest {

  val sentHeaders = Map("Authorization" -> "Bearer ${token}",
    "Content-Type" -> "application/json")

  val createActivityCodeRequest = exec(http("Create Activity Code Request")
  .post(app_url + "/performance-control/activities/codes")
  .headers(sentHeaders)
      .body(StringBody("""{"category" : {"code" : "Pisti", "description" : "Pisti si sauna"}, "subCategory" : { "code" : "Mada", "description" : "Mada si sauna"}, "standardDurationInterval" : {"min" : "5", "max" : "10","standard" : "7"}, "addedValue" : "true"}"""))
  .check(status is 201)
  .check(jsonPath("$..id").saveAs("ActivityCodeId")))

}
