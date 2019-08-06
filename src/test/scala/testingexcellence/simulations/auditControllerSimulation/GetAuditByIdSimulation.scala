package testingexcellence.simulations.auditControllerSimulation

import io.gatling.core.Predef.{Simulation, _}
import testingexcellence.scenarios.auditControllerScenario.GetAuditByIdScenario
import testingexcellence.config.Config.users

class GetAuditByIdSimulation extends Simulation{

  private val getAuditByIdSimulation = GetAuditByIdScenario.getAuditByIdScenario.inject(atOnceUsers(users))

  setUp(getAuditByIdSimulation)

}
