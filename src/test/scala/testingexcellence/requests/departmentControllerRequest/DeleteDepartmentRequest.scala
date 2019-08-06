package testingexcellence.requests.departmentControllerRequest

import io.gatling.http.Predef._
import io.gatling.core.Predef._
import testingexcellence.config.Config.app_url

object DeleteDepartmentRequest {

  val sentHeaders = Map("Authorization" -> "Bearer ${token}",
    "Content-Type" -> "application/json")

  val deleteDepartmentRequest = exec(http("Delete Department Request")
  .delete(app_url + "/departments/5d429544be41760001a4ccd1")
  .headers(sentHeaders)
  .check(status is 204))

}
