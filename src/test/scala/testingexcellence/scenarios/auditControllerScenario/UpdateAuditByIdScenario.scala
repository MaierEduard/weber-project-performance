package testingexcellence.scenarios.auditControllerScenario

import io.gatling.core.Predef.scenario
import testingexcellence.requests.GetTokenRequest
import testingexcellence.requests.auditControlerRequest.UpdateAuditByIdRequest

object UpdateAuditByIdScenario {

  val updateAuditByIdScenario = scenario("Update Audit By Id Scenario")
    .exec(GetTokenRequest.get_token)
    .exec(UpdateAuditByIdRequest.updateAuditRequest)

}
