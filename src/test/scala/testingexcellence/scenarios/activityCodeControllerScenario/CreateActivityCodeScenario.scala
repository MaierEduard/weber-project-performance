package testingexcellence.scenarios.activityCodeControllerScenario

import io.gatling.core.Predef._
import testingexcellence.requests.GetTokenRequest
import testingexcellence.requests.activityCodeControllerRequest.CreateActivityCodeRequest

object CreateActivityCodeScenario {


  val createActivityCodeScenario = scenario("Create Activity Code Scenario")

    .exec(GetTokenRequest.get_token)
    .exec(CreateActivityCodeRequest.createActivityCodeRequest)

}
