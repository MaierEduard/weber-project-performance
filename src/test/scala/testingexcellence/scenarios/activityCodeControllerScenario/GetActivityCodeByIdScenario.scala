package testingexcellence.scenarios.activityCodeControllerScenario

import io.gatling.core.Predef._
import testingexcellence.requests.GetTokenRequest
import testingexcellence.requests.activityCodeControllerRequest.GetActivityCodeByIdRequest

object GetActivityCodeByIdScenario {

  val getActivityCodeByIdScenario = scenario("Get Activity Code By Id Scenario")

    .exec(GetTokenRequest.get_token)
    .exec(GetActivityCodeByIdRequest.getActivityCodeRequest)
}
