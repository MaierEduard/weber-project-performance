package testingexcellence.scenarios.activityCodeControllerScenario

import io.gatling.core.Predef._
import testingexcellence.requests.GetTokenRequest
import testingexcellence.requests.activityCodeControllerRequest.DeleteActivityCodeByIdRequest

object DeleteActivityCodeByIdScenario {

  val deleteActivityCodeByIdScenario = scenario("Delete Activity Code By Id Scenario")

    .exec(GetTokenRequest.get_token)
    .exec(DeleteActivityCodeByIdRequest.deleteActivityCodeRequest)
}
