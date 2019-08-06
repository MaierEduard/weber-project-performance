package testingexcellence.scenarios.departmentControllerSenario
import io.gatling.core.Predef._
import testingexcellence.requests.GetTokenRequest
import testingexcellence.requests.departmentControllerRequest.CreateDepartmentRequest

object CreateDepartmentScenario {

  val createDepartmentScenario = scenario("Create Department Scenario")

    .exec(GetTokenRequest.get_token)
    .exec(CreateDepartmentRequest.createDepartmentRequest)
}
