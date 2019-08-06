package testingexcellence.scenarios.activityCodeControllerScenario

import io.gatling.core.Predef._
import testingexcellence.requests.GetTokenRequest
import testingexcellence.requests.activityCodeControllerRequest.GetAllActivitySubCategoriesRequest

object GetAllActivitySubCategoriesScenario {


  val getAllActivitySubCategoriesScenario = scenario("Get All Activity Sub Categories Scenario")

    .exec(GetTokenRequest.get_token)
    .exec(GetAllActivitySubCategoriesRequest.getAllActivitySubCategoriesRequest)

}

