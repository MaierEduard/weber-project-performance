package testingexcellence.requests.activityControllerRequest

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import testingexcellence.config.Config.app_url

object GetActivitiesRequest {

  val sentHeaders = Map("Authorization" -> "Bearer ${token}",
    "Content-Type" -> "application/json")

  val getActivitiesRequest = exec(http("Get Activities Request")
  .get(app_url + "/performance-control/activities?startDate=2018-07-25T09:30:18.744&endDate=2019-07-25T09:30:18.744")
  .headers(sentHeaders)
  .check(status is 200))

}
