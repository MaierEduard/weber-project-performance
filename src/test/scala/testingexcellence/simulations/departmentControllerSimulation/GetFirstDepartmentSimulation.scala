package testingexcellence.simulations.departmentControllerSimulation

import io.gatling.core.Predef._
import testingexcellence.scenarios.departmentControllerSenario.GetFirstDepartmentScenario
import testingexcellence.config.Config.users

class GetFirstDepartmentSimulation extends Simulation{

  private val getFirstDepartmentSimulation = GetFirstDepartmentScenario.getFirstDepartmentScenario.inject(atOnceUsers(users))

  setUp(getFirstDepartmentSimulation)
}
