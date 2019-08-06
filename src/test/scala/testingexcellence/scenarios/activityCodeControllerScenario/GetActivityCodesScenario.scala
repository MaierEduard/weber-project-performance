package testingexcellence.scenarios.activityCodeControllerScenario

import io.gatling.core.Predef._
import testingexcellence.requests.GetTokenRequest
import testingexcellence.requests.activityCodeControllerRequest.GetActivityCodesRequest

object GetActivityCodesScenario {


  val getActivityCodesScenario = scenario("Get Activity Codes Scenario")

    .exec(GetTokenRequest.get_token)
    .exec(GetActivityCodesRequest.getActivityCodesRequest)

}
