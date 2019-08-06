package testingexcellence.scenarios.departmentControllerSenario

import io.gatling.core.Predef._
import testingexcellence.requests.GetTokenRequest
import testingexcellence.requests.departmentControllerRequest.DeleteDepartmentRequest

object DeleteDepartmentScenario {

  val deleteDepartmentScenario = scenario("Delete Department Scenario")

    .exec(GetTokenRequest.get_token)
    .exec(DeleteDepartmentRequest.deleteDepartmentRequest)

}
