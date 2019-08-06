package testingexcellence.scenarios.activityControllerScenario

import io.gatling.core.Predef._
import testingexcellence.requests.GetTokenRequest
import testingexcellence.requests.activityControllerRequest.GetActivityReportsRequest

object GetActivityReportsScenario {


  val getActivityReportsScenario = scenario("Get Activity Reports Scenario")

    .exec(GetTokenRequest.get_token)
    .exec(GetActivityReportsRequest.getActivityReportsRequest)

}
