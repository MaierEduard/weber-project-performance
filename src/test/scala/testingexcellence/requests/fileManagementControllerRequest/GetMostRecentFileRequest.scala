package testingexcellence.requests.fileManagementControllerRequest

import io.gatling.http.Predef._
import io.gatling.core.Predef._
import testingexcellence.config.Config.app_url

object GetMostRecentFileRequest {

  val sentHeaders = Map("Authorization" -> "Bearer ${token}",
    "Content-Type" -> "application/json")

  val getMostRecentFileRequest = exec(http("Get Most Recent File Request")
  .get(app_url + "/file-management/files/most-recent?target=DAILY_ACTIVITIES")
  .headers(sentHeaders)
//  .formParam("target", "DAILY_ACTIVITIES")
  .check(status is 200))

}
