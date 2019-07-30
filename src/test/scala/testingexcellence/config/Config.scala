package testingexcellence.config

object Config {

  val app_url = "http://192.168.1.2:7100/board"

  val users = Integer.getInteger("users", 10).toInt
  val rampUp = Integer.getInteger("rampup", 1).toInt
  val throughput = Integer.getInteger("throughput", 100).toInt

}

