package testingexcellence.requests.activityControllerRequest

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import testingexcellence.config.Config.app_url

object GetLrmRequest {

  val sentHeaders = Map("Authorization" -> "Bearer ${token}",
    "Content-Type" -> "application/json")

  val getLrmRequest = exec(http("Get Lrm Request")
  .get(app_url + "/performance-control/activities/reports/lrm?startDateFrom=2018-07-25T09:30:18.744&startDateTo=2018-07-25T09:30:18.744&workedHoursFullTimeEquivalent=8")
  .headers(sentHeaders)
  .check(status is 200))

}
