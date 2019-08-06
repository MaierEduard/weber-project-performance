package testingexcellence.simulations.auditControllerSimulation

import io.gatling.core.Predef.{Simulation, _}
import testingexcellence.config.Config._
import testingexcellence.scenarios.auditControllerScenario.CreateAuditScenario

class CreateAuditSimulation extends Simulation {

  private val createAuditExec = CreateAuditScenario.createAuditScenario.inject(atOnceUsers(users))

  setUp(createAuditExec)

}
