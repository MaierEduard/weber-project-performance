package testingexcellence.requests.departmentControllerRequest
import io.gatling.http.Predef._
import io.gatling.core.Predef._
import testingexcellence.config.Config.app_url

object CreateDepartmentRequest {

  val sentHeaders = Map("Authorization" -> "Bearer ${token}",
    "Content-Type" -> "application/json")

  val createDepartmentRequest = exec(http("Create Department Request")
  .post(app_url + "/departments")
  .headers(sentHeaders)
  .body(StringBody("""{"name" : "Bimba Department"}"""))
  .check(status is 201))

}
