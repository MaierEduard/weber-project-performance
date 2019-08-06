package testingexcellence.simulations.auditControllerSimulation

import io.gatling.core.Predef.{Simulation, _}
import testingexcellence.config.Config.users
import testingexcellence.scenarios.auditControllerScenario.UpdateAuditByIdScenario

class UpdateAuditSimulation extends Simulation{

  private val updateAuditSimulation = UpdateAuditByIdScenario.updateAuditByIdScenario.inject(atOnceUsers(users))

  setUp(updateAuditSimulation)
}
