package testingexcellence.requests.fileManagementControllerRequest

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import testingexcellence.config.Config.app_url

object DeleteFileRequest {

  val sentHeaders = Map("Authorization" -> "Bearer ${token}",
    "Content-Type" -> "application/json")

  val deleteFileRequest = exec(http("Delete File Request")
    .delete(app_url + "/file-management/files/5d42b174be41760001a4ccdb")
    .headers(sentHeaders)
    .check(status is 204))
}
