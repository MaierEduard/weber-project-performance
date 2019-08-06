package testingexcellence.scenarios.fileManagementControllerScenario
import io.gatling.core.Predef._
import testingexcellence.requests.GetTokenRequest
import testingexcellence.requests.fileManagementControllerRequest.GetMostRecentFileRequest

object GetMostRecentFileScenario {

  val getMostRecentFileScenario = scenario("Get Most Recent File Request")

    .exec(GetTokenRequest.get_token)
    .exec(GetMostRecentFileRequest.getMostRecentFileRequest)

}
