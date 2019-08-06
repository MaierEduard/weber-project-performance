package testingexcellence.scenarios.activityControllerScenario

import io.gatling.core.Predef._
import testingexcellence.requests.GetTokenAsWorkerRequest
import testingexcellence.requests.activityControllerRequest.UpdateActivityByIdRequest

object UpdateActivityByIdScenario {


  val updateActivitiesScenario = scenario("Update Activity Scenario")

    .exec(GetTokenAsWorkerRequest.get_token_as_worker)
    .exec(UpdateActivityByIdRequest.updateActivityRequest)

}
