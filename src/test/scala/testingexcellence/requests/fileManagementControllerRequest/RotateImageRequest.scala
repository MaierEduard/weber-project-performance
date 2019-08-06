package testingexcellence.requests.fileManagementControllerRequest

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import testingexcellence.config.Config.app_url

object RotateImageRequest {

  val sentHeaders = Map("Authorization" -> "Bearer ${token}",
    "Content-Type" -> "application/json")

  val rotateFileRequest = exec(http("Rotate File Request")
    .put(app_url + "/file-management/files/5d444bebbe41760001a4cd07/image-transformations")
    .headers(sentHeaders)
      .body(StringBody("""{ "rotationDegrees" : "2"}"""))
    .check(status is 200))
}

//"originalFileId":"5d42b173be41760001a4ccd9"
////"id":"5d42b174be41760001a4ccdb"