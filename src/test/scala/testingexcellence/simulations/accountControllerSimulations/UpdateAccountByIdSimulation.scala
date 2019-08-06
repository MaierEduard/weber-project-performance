package testingexcellence.simulations.accountControllerSimulations

import io.gatling.core.Predef.{Simulation, _}
import testingexcellence.config.Config._
import testingexcellence.scenarios.accountControllerScenario.UpdateAccountByIdScenario

class UpdateAccountByIdSimulation extends Simulation{

  private val updateAccountsById = UpdateAccountByIdScenario.updateAccountByIdScenario.inject(atOnceUsers(users))
  setUp(updateAccountsById)

}
