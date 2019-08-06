package testingexcellence.scenarios.departmentControllerSenario
import io.gatling.core.Predef._
import testingexcellence.requests.GetTokenRequest
import testingexcellence.requests.departmentControllerRequest.GetFirstDepartmentRequest

object GetFirstDepartmentScenario {

  val getFirstDepartmentScenario = scenario("Get First Department Scenario")
    .exec(GetTokenRequest.get_token)
    .exec(GetFirstDepartmentRequest.getFirstDepartmentRequest)
}
