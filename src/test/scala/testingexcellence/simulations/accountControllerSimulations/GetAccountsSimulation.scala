package testingexcellence.simulations.accountControllerSimulations

import io.gatling.core.Predef.{Simulation, _}
import testingexcellence.config.Config._
import testingexcellence.scenarios.accountControllerScenario.GetAccountsScenario

class GetAccountsSimulation extends Simulation{

  private val getAccounts = GetAccountsScenario.getAccountsScenario.inject(atOnceUsers(users))
  setUp(getAccounts)

}
