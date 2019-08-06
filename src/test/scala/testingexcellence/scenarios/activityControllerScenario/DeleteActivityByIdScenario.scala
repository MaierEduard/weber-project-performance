package testingexcellence.scenarios.activityControllerScenario

import io.gatling.core.Predef._
import testingexcellence.requests.GetTokenAsWorkerRequest
import testingexcellence.requests.activityControllerRequest.DeleteActivityByIdRequest

object DeleteActivityByIdScenario {


  val deleteActivityByIdScenario = scenario("Delete Activity By Id Scenario")

    .exec(GetTokenAsWorkerRequest.get_token_as_worker)
    .exec(DeleteActivityByIdRequest.deleteActivityByIdRequest)

}
