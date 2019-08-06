package testingexcellence.scenarios.meetingAttendanceExpectationControllerScenario

import io.gatling.core.Predef._
import testingexcellence.requests.GetTokenRequest
import testingexcellence.requests.MeetingAttendanceExpectationControllerRequest.CreateExpectationRequest

object CreateExpectationScenario {

  val createExpectationScenario = scenario("Create Expectation Scenario")

    .exec(GetTokenRequest.get_token)
    .exec(CreateExpectationRequest.createExpectationRequest)

}
