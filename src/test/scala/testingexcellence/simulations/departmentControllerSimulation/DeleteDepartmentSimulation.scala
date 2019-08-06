package testingexcellence.simulations.departmentControllerSimulation

import io.gatling.core.Predef._
import testingexcellence.scenarios.departmentControllerSenario.DeleteDepartmentScenario
import testingexcellence.config.Config.users

class DeleteDepartmentSimulation extends Simulation{

  private val deleteDepartmentSimulation = DeleteDepartmentScenario.deleteDepartmentScenario.inject(atOnceUsers(users))

  setUp(deleteDepartmentSimulation)
}
