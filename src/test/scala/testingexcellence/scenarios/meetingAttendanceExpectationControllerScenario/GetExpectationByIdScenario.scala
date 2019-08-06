package testingexcellence.scenarios.meetingAttendanceExpectationControllerScenario

import io.gatling.core.Predef._
import testingexcellence.requests.GetTokenRequest
import testingexcellence.requests.MeetingAttendanceExpectationControllerRequest.GetExpectationByIdRequest

object GetExpectationByIdScenario {

  val getExpectationsScenario = scenario("Get Expectations By Id Scenario")

    .exec(GetTokenRequest.get_token)
    .exec(GetExpectationByIdRequest.getExpectationByIdRequest)

}
