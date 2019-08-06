package testingexcellence.requests.auditControlerRequest

import io.gatling.http.Predef._
import io.gatling.core.Predef._
import testingexcellence.config.Config.app_url

object GetAuditsRequest {


  val sentHeaders = Map("Authorization" -> "Bearer ${token}",
    "Content-Type" -> "application/json")

val getAuditsRequest = exec(http("Get Audits Request")
.get(app_url + "/audits?status=PASSED")
.headers(sentHeaders)
.check(status is 200))
}
