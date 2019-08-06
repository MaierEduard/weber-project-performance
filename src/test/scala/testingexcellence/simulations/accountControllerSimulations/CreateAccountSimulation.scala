package testingexcellence.simulations.accountControllerSimulations

import io.gatling.core.Predef.{Simulation, _}
  import testingexcellence.config.Config._
import testingexcellence.scenarios.accountControllerScenario.CreateAccountScenario

class CreateAccountSimulation extends Simulation{

  private val createAccountExec = CreateAccountScenario.createAccountScenario
    .inject(atOnceUsers(users))

  setUp(createAccountExec)

}
