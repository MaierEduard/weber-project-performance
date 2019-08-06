package testingexcellence.scenarios.fileManagementControllerScenario

import io.gatling.core.Predef._
import testingexcellence.requests.GetTokenRequest
import testingexcellence.requests.fileManagementControllerRequest.UploadImageRequest

object UploadImageScenario {

  val uploadFileScenario = scenario("Upload File Scenario")

    .exec(GetTokenRequest.get_token)
    .exec(UploadImageRequest.uploadFileRequest)

}
