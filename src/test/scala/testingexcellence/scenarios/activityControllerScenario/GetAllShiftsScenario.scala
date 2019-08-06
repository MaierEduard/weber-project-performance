package testingexcellence.scenarios.activityControllerScenario

import io.gatling.core.Predef._
import testingexcellence.requests.GetTokenRequest
import testingexcellence.requests.activityControllerRequest.GetAllShiftRequest

object GetAllShiftsScenario {


  val getAllShiftsScenario = scenario("Get All Shifts Scenario")

    .exec(GetTokenRequest.get_token)
    .exec(GetAllShiftRequest.getAllShiftRequest)

}
