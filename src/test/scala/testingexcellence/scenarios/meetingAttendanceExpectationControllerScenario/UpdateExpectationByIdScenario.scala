package testingexcellence.scenarios.meetingAttendanceExpectationControllerScenario

import io.gatling.core.Predef._
import testingexcellence.requests.GetTokenRequest
import testingexcellence.requests.MeetingAttendanceExpectationControllerRequest.UpdateExpectationByIdRequest

object UpdateExpectationByIdScenario {

  val updateExpectationScenario = scenario("Update Expectation Scenario")

    .exec(GetTokenRequest.get_token)
    .exec(UpdateExpectationByIdRequest.updateExpectationRequest)

}
