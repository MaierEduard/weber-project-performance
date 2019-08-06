package testingexcellence.scenarios.activityControllerScenario.activityControllerPerformanceScenario

import io.gatling.core.Predef._
import testingexcellence.requests.{GetTokenAsWorkerRequest, GetTokenRequest}
import testingexcellence.requests.activityControllerRequest.{CreateActivityRequest, DeleteActivityByIdRequest, GetActivityByIdRequest, UpdateActivityByIdRequest}

object CreateActivityPerformanceScenario {

  val createActivityPerformanceScenario = scenario("Create Activity Performance Scenario")

    .exec(GetTokenAsWorkerRequest.get_token_as_worker)
    .exec(CreateActivityRequest.createActivityRequest)
    .exec(GetTokenRequest.get_token)
    .exec(UpdateActivityByIdRequest.updateActivityRequest)
    .exec(GetActivityByIdRequest.getActivityByIdRequest)
    .exec(DeleteActivityByIdRequest.deleteActivityByIdRequest)


}
