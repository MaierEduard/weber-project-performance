package testingexcellence.scenarios.fileManagementControllerScenario

import io.gatling.core.Predef._
import testingexcellence.requests.GetTokenRequest
import testingexcellence.requests.fileManagementControllerRequest.DeleteFileRequest

object DeleteFileScenario {

  val deleteFileScenario = scenario("Delete File Scenario")
    .exec(GetTokenRequest.get_token)
    .exec(DeleteFileRequest.deleteFileRequest)


}
