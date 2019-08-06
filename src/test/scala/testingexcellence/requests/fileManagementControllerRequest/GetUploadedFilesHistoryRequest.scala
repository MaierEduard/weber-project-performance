package testingexcellence.requests.fileManagementControllerRequest

import io.gatling.http.Predef._
import io.gatling.core.Predef._
import testingexcellence.config.Config.app_url

object GetUploadedFilesHistoryRequest {

  val sentHeaders = Map("Authorization" -> "Bearer ${token}",
    "Content-Type" -> "application/json")

  val getUploadedFilesHistoryRequest = exec(http("Get Uploaded Files History Request")
  .get(app_url + "/file-management/files?target=DAILY_ACTIVITIES&startDate=2017-07-25T09:30:18.744&endDate=2019-07-25T09:30:18.744")
  .headers(sentHeaders)
  .check(status is 200))

}
