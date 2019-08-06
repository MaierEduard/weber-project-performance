package testingexcellence.simulations.auditControllerSimulation

import io.gatling.core.Predef. _
import testingexcellence.config.Config.users
import testingexcellence.scenarios.auditControllerScenario.DeleteAuditByIdScenario

class DeleteAuditByIdSimulation extends Simulation{

  private val deleteAuditByIdSimulation = DeleteAuditByIdScenario.deleteAuditByIdScenario.inject(atOnceUsers(users))

  setUp(deleteAuditByIdSimulation)

}
