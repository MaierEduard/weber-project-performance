package testingexcellence.scenarios.fileManagementControllerScenario

import io.gatling.core.Predef._
import testingexcellence.requests.GetTokenRequest
import testingexcellence.requests.fileManagementControllerRequest.GetUploadedFilesHistoryRequest

object GetUploadedFilesHistoryScenario {

  val getUploadedFilesHistoryScenario = scenario("Get Uploaded Files History Scenario")

    .exec(GetTokenRequest.get_token)
    .exec(GetUploadedFilesHistoryRequest.getUploadedFilesHistoryRequest)
}
