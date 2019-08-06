package testingexcellence.requests.counterMeasureControllerRequest

import testingexcellence.config.Config.app_url
import io.gatling.core.Predef._
import io.gatling.http.Predef._


object CreateCounterMeasureRequest {

  val sentHeaders = Map("Authorization" -> "Bearer ${token}",
    "Content-Type" -> "application/json")

  val createCounterMeasureRequest = exec(http(" Create Counter Measure Request")
  .post(app_url + "/counter-measures")
  .headers(sentHeaders)
  .body(StringBody("""{ "date" : "2018-08-08", "issue" : "nu m-ai am tigari", "cause" : "Bani", "selectedMeasure" : "critical", "domain" : "tutun"}"""))
  .check(status is 201))

}
