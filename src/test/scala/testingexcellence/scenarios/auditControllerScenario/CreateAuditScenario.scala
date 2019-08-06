package testingexcellence.scenarios.auditControllerScenario

import io.gatling.core.Predef.scenario
import testingexcellence.requests.GetTokenRequest
import testingexcellence.requests.auditControlerRequest.CreateAuditRequest

object CreateAuditScenario {

  val createAuditScenario = scenario("Create Audit Scenario")
    .exec(GetTokenRequest.get_token)
    .exec(CreateAuditRequest.createAudit)

}
