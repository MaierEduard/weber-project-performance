package testingexcellence.simulations.accountControllerSimulations

import io.gatling.core.Predef.{Simulation, _}
import testingexcellence.config.Config._
import testingexcellence.scenarios.accountControllerScenario.GetAccountByIdScenario

class GetAccountByIdSimulation extends Simulation {

  private val getAccountByIdExec = GetAccountByIdScenario.getAccountByIdScenario
    .inject(atOnceUsers(users))

  setUp(getAccountByIdExec)

}
