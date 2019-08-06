package testingexcellence.scenarios.departmentControllerSenario

import io.gatling.core.Predef._
import testingexcellence.requests.GetTokenRequest
import testingexcellence.requests.departmentControllerRequest.UpdateDepartmentRequest


object UpdateDepartmentScenario {

  val updateDepartmentScenario = scenario("Update Department Scenario")

    .exec(GetTokenRequest.get_token)
    .exec(UpdateDepartmentRequest.updateDepartmentRequest)

}
