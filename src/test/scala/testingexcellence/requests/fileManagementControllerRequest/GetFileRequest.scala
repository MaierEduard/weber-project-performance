package testingexcellence.requests.fileManagementControllerRequest

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import testingexcellence.config.Config.app_url


object GetFileRequest {


  val sentHeaders = Map("Authorization" -> "Bearer ${token}",
    "Content-Type" -> "application/json")

  val getFileRequest = exec(http("Get File Request")
  .get(app_url + "/file-management/files/5d42b174be41760001a4ccdb")
  .headers(sentHeaders)
  .check(status is 200))
}
