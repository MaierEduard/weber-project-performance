package testingexcellence.requests.auditControlerRequest

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import testingexcellence.config.Config.app_url

object UpdateAuditByIdRequest {

  val sentHeaders = Map("Authorization" -> "Bearer ${token}",
    "Content-Type" -> "application/json")


  val updateAuditRequest = exec(http("Update Audit Request")
  .put(app_url + "/audits/5d415bb1be41760001a4ccc4")
  .headers(sentHeaders)
  .body(StringBody("""{"externalAuthorName" : "Mama lor de importuri"}"""))
  .check(status is 204))


}
