package testingexcellence.scenarios.activityCodeControllerScenario

import io.gatling.core.Predef._
import testingexcellence.requests.GetTokenRequest
import testingexcellence.requests.activityCodeControllerRequest.GetAllActivityCategoriesRequest

object GetAllActivityCategoriesScenario {


  val getAllActivityCategoriesScenario = scenario("Get All Activity Categories Scenario")

    .exec(GetTokenRequest.get_token)
    .exec(GetAllActivityCategoriesRequest.getAllActivityCategoriesRequest)

}

