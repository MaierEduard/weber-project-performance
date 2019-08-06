package testingexcellence.requests.auditControlerRequest

import io.gatling.http.Predef._
import io.gatling.core.Predef._
import testingexcellence.config.Config.app_url

object GetAuditByIdRequest {


  val sentHeaders = Map("Authorization" -> "Bearer ${token}",
    "Content-Type" -> "application/json")

  val getAuditByIdRequest = exec(http("Get Audit By Id Request")
  .get(app_url + "/audits/5d415bb1be41760001a4ccc4")
  .headers(sentHeaders)
  .check(status is 200))

}
