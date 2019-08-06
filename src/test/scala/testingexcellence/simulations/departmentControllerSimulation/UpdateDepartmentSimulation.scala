package testingexcellence.simulations.departmentControllerSimulation

import io.gatling.core.Predef._
import testingexcellence.scenarios.departmentControllerSenario.UpdateDepartmentScenario
import testingexcellence.config.Config.users

class UpdateDepartmentSimulation extends Simulation{

  private val updateDepartmentSimulation = UpdateDepartmentScenario.updateDepartmentScenario.inject(atOnceUsers(users))

  setUp(updateDepartmentSimulation)
}
