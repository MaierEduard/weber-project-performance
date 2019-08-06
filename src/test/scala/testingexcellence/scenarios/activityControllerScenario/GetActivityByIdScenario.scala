package testingexcellence.scenarios.activityControllerScenario

import io.gatling.core.Predef._
import testingexcellence.requests.GetTokenRequest
import testingexcellence.requests.activityControllerRequest.GetActivityByIdRequest

object GetActivityByIdScenario {


  val getActivityByIdScenario = scenario("Get Activity By Id Scenario")

    .exec(GetTokenRequest.get_token)
    .exec(GetActivityByIdRequest.getActivityByIdRequest)

}
