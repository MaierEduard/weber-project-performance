package testingexcellence.simulations.activityControllerSimulation

import io.gatling.core.Predef._
import testingexcellence.config.Config.users
import testingexcellence.scenarios.activityControllerScenario.GetAllShiftsScenario

class GetAllShiftsSimulation extends Simulation{

  private val getAllShiftsSimulation = GetAllShiftsScenario.getAllShiftsScenario.inject(atOnceUsers(users))

  setUp(getAllShiftsSimulation)

}
