package testingexcellence.requests.auditControlerRequest

import testingexcellence.config.Config.app_url
import io.gatling.core.Predef._
import io.gatling.http.Predef._

object CreateAuditRequest {

  val sentHeaders = Map("Authorization" -> "Bearer ${token}",
    "Content-Type" -> "application/json")

  val createAudit = exec(http("Create Audit Request")
    .post(app_url + "/audits")
    .headers(sentHeaders)
      .body(StringBody("""{"date":"2018-08-08", "status":"PASSED", "externalAuthorName":"EduardAuditor"}"""))
  .check(status is 201))
}
