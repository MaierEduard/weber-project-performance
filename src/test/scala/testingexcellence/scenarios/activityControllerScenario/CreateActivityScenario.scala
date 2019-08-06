package testingexcellence.scenarios.activityControllerScenario

import io.gatling.core.Predef._
import testingexcellence.requests.GetTokenAsWorkerRequest
import testingexcellence.requests.activityControllerRequest.CreateActivityRequest

object CreateActivityScenario {


  val createActivityScenario = scenario("Create Activity Scenario")

    .exec(GetTokenAsWorkerRequest.get_token_as_worker)
    .exec(CreateActivityRequest.createActivityRequest)

}
