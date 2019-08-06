package testingexcellence.scenarios.activityCodeControllerScenario

import io.gatling.core.Predef._
import testingexcellence.requests.GetTokenRequest
import testingexcellence.requests.activityCodeControllerRequest.UpdateActivityCodeByIdRequest

object UpdateActivityCodeByIdScenario {

  val updateActivityCodeByIdScenario = scenario("Update Activity Code By Id Scenario")

    .exec(GetTokenRequest.get_token)
    .exec(UpdateActivityCodeByIdRequest.updateActivityCodeRequest)
}
