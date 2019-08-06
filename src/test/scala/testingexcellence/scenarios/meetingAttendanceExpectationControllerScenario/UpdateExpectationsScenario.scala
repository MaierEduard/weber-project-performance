package testingexcellence.scenarios.meetingAttendanceExpectationControllerScenario

import io.gatling.core.Predef._
import testingexcellence.requests.GetTokenRequest
import testingexcellence.requests.MeetingAttendanceExpectationControllerRequest.UpdateExpectationsRequestFlaviuuuuuu

object UpdateExpectationsScenario {

  val updateExpectationsScenario = scenario("Update Expectations Scenario")

    .exec(GetTokenRequest.get_token)
    .exec(UpdateExpectationsRequestFlaviuuuuuu.updateExpectationsRequest)

}
