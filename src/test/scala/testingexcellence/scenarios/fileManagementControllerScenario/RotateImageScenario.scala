package testingexcellence.scenarios.fileManagementControllerScenario

import io.gatling.core.Predef._
import testingexcellence.requests.GetTokenRequest
import testingexcellence.requests.fileManagementControllerRequest.RotateImageRequest

object RotateImageScenario {

  val rotateFileScenario = scenario("Rotate File Scenario")

    .exec(GetTokenRequest.get_token)
    .exec(RotateImageRequest.rotateFileRequest)

}
