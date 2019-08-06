package testingexcellence.requests.activityCodeControllerRequest

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import testingexcellence.config.Config.app_url

object UpdateActivityCodeByIdRequest {

  val sentHeaders = Map("Authorization" -> "Bearer ${token}",
    "Content-Type" -> "application/json")

  val updateActivityCodeRequest = exec(http("Update Activity Code Request")
    .put(app_url + "/performance-control/activities/codes/${ActivityCodeId}")
    .headers(sentHeaders)
    .body(StringBody("""{"category" : {"code" : "Bimba", "description" : "Flaviu si sauna"}, "subCategory" : { "code" : "Mada", "description" : "Mada si sauna"}, "standardDurationInterval" : {"min" : "5", "max" : "10","standard" : "7"}}"""))
    .check(status is 204))

}
