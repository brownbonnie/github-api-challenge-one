object Application {

  def main(args: Array[String]): Unit = {

    val url = "http://api.noopschallenge.com/hexbot"
    val result = scala.io.Source.fromURL(url).mkString
    println(result)

  }
}
