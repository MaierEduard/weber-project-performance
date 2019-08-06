package testingexcellence.requests.departmentControllerRequest

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import testingexcellence.config.Config.app_url

object GetFirstDepartmentRequest {

  val sentHeaders = Map("Authorization" -> "Bearer ${token}",
    "Content-Type" -> "application/json")

  val getFirstDepartmentRequest = exec(http("Update Department Request")
    .get(app_url + "/departments/first")
    .headers(sentHeaders)
    .check(status is 200))

}
