package testingexcellence.scenarios.activityControllerScenario

import io.gatling.core.Predef._
import testingexcellence.requests.GetTokenRequest
import testingexcellence.requests.activityControllerRequest.GetActivitiesRequest

object GetActivitiesScenario {


  val getActivitiesScenario = scenario("Get Activities Scenario")

    .exec(GetTokenRequest.get_token)
    .exec(GetActivitiesRequest.getActivitiesRequest)

}
