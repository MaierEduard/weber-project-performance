package testingexcellence.scenarios.fileManagementControllerScenario

import io.gatling.core.Predef._
import testingexcellence.requests.GetTokenRequest
import testingexcellence.requests.fileManagementControllerRequest.GetFileRequest

object GetFileScenario {

  val getFileScenario = scenario("Get File Scenario")

    .exec(GetTokenRequest.get_token)
    .exec(GetFileRequest.getFileRequest)

}
