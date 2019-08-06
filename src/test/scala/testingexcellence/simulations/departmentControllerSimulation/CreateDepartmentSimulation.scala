package testingexcellence.simulations.departmentControllerSimulation

import io.gatling.core.Predef._
import testingexcellence.scenarios.departmentControllerSenario.CreateDepartmentScenario
import testingexcellence.config.Config.users

class CreateDepartmentSimulation extends Simulation{

  private val createDepartmentSimulation = CreateDepartmentScenario.createDepartmentScenario.inject(atOnceUsers(users))

  setUp(createDepartmentSimulation)
}
