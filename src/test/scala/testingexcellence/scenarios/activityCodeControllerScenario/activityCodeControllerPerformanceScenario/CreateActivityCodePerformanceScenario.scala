package testingexcellence.scenarios.activityCodeControllerScenario.activityCodeControllerPerformanceScenario

import io.gatling.core.Predef._
import testingexcellence.requests.GetTokenRequest
import testingexcellence.requests.activityCodeControllerRequest.{CreateActivityCodeRequest, DeleteActivityCodeByIdRequest, GetActivityCodeByIdRequest, UpdateActivityCodeByIdRequest}

object CreateActivityCodePerformanceScenario {

  val createActivityCodePerformanceScenario = scenario("Create Activity Code Performance Scenario")

    .exec(GetTokenRequest.get_token)
    .exec(CreateActivityCodeRequest.createActivityCodeRequest)
    .exec(GetActivityCodeByIdRequest.getActivityCodeRequest)
    .exec(UpdateActivityCodeByIdRequest.updateActivityCodeRequest)
    .exec(GetActivityCodeByIdRequest.getActivityCodeRequest)
    .exec(DeleteActivityCodeByIdRequest.deleteActivityCodeRequest)


}
