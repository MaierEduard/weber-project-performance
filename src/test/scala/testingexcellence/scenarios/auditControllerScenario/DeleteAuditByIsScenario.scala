package testingexcellence.scenarios.auditControllerScenario
import io.gatling.core.Predef.scenario
import testingexcellence.requests.GetTokenRequest
import testingexcellence.requests.auditControlerRequest.DeleteAuditByIdRequest

object DeleteAuditByIdScenario {

  val deleteAuditByIdScenario = scenario ("Delete Audit By Id Scenario")
    .exec(GetTokenRequest.get_token)
    .exec(DeleteAuditByIdRequest.deleteAuditRequest)

}
