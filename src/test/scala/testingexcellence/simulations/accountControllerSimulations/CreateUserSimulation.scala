package testingexcellence.simulations.accountControllerSimulations

import io.gatling.core.Predef.{Simulation, _}
import testingexcellence.config.Config._
import testingexcellence.scenarios.accountControllerScenario.CreateUserScenario

class CreateUserSimulation extends Simulation{

  private val createUserExec = CreateUserScenario.createUserScenario
    .inject(atOnceUsers(users))

  setUp(createUserExec)

}
