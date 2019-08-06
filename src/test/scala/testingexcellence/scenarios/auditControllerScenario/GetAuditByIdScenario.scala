package testingexcellence.scenarios.auditControllerScenario

import io.gatling.core.Predef.scenario
import testingexcellence.requests.GetTokenRequest
import testingexcellence.requests.auditControlerRequest.GetAuditByIdRequest

object GetAuditByIdScenario {

  val getAuditByIdScenario = scenario(" Get Audit By Id Scenario")
    .exec(GetTokenRequest.get_token)
    .exec(GetAuditByIdRequest.getAuditByIdRequest)

}
