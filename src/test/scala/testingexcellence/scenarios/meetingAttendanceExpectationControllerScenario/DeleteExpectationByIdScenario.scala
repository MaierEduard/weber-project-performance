package testingexcellence.scenarios.meetingAttendanceExpectationControllerScenario

import io.gatling.core.Predef._
import testingexcellence.requests.GetTokenRequest
import testingexcellence.requests.MeetingAttendanceExpectationControllerRequest.DeleteExpectationByIdRequest

object DeleteExpectationByIdScenario {

  val deleteExpectationByIdScenario = scenario("Delete Expectations By Id Scenario")

    .exec(GetTokenRequest.get_token)
    .exec(DeleteExpectationByIdRequest.deleteExpectationRequest)

}
