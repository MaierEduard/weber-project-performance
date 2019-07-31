package testingexcellence.config

object Config {
//  http://192.168.1.2:7100/board/oauth/token?username=rolly&password=123456&grant_type=password

  val app_url = "https://192.168.1.2:7100/board"

  val users = Integer.getInteger("users", 1).toInt
  val rampUp = Integer.getInteger("rampup", 1).toInt
  val throughput = Integer.getInteger("throughput", 1).toInt

}

