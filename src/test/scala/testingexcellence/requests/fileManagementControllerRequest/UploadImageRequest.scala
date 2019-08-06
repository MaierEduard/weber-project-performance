package testingexcellence.requests.fileManagementControllerRequest

import io.gatling.http.Predef._
import io.gatling.core.Predef._
import testingexcellence.config.Config.app_url

object UploadImageRequest {

  val sentHeaders = Map("Authorization" -> "Bearer ${token}",
    "Content-Type" -> "application/json")

  val uploadFileRequest = exec(http("Upload File Request")
    .post(app_url + "/file-management/files")
    .headers(sentHeaders)
    .formParam("target", "DAILY_ACTIVITIES")
    .bodyPart(RawFileBodyPart("file", "C:\\Users\\Eduard\\Desktop\\poza.jpg")
      .fileName("poza.jpg").transferEncoding("binary")).asMultipartForm
    .check(status is 201))
}

//"originalFileId":"5d42b173be41760001a4ccd9"
////"id":"5d42b174be41760001a4ccdb"