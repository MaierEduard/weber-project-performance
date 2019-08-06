package testingexcellence.requests.departmentControllerRequest

import io.gatling.http.Predef._
import io.gatling.core.Predef._
import testingexcellence.config.Config.app_url

object UpdateDepartmentRequest {

  val sentHeaders = Map("Authorization" -> "Bearer ${token}",
    "Content-Type" -> "application/json")

  val updateDepartmentRequest = exec(http("Update Department Request")
    .put(app_url + "/departments/5d429544be41760001a4ccd1")
    .headers(sentHeaders)
    .body(StringBody("""{"name" : "Bimba2 Department"}"""))
    .check(status is 204))

}
