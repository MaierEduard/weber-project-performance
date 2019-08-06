package testingexcellence.scenarios.auditControllerScenario

import io.gatling.core.Predef.scenario
import testingexcellence.requests.GetTokenRequest
import testingexcellence.requests.auditControlerRequest.GetAuditsRequest

object GetAuditsScenario {

  val getAuditsScenario = scenario(" Get Audit Scenario")
    .exec(GetTokenRequest.get_token)
    .exec(GetAuditsRequest.getAuditsRequest)

}
