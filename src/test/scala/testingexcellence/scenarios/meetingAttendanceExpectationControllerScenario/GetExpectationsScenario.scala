package testingexcellence.scenarios.meetingAttendanceExpectationControllerScenario

import io.gatling.core.Predef._
import testingexcellence.requests.GetTokenRequest
import testingexcellence.requests.MeetingAttendanceExpectationControllerRequest.GetExpectationsRequest

object GetExpectationsScenario {

  val getExpectationsScenario = scenario("Get Expectations Scenario")

    .exec(GetTokenRequest.get_token)
    .exec(GetExpectationsRequest.getExpectationRequest)

}
