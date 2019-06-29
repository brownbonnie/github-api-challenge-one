object Application {

  def main(args: Array[String]): Unit = {

    val baseUrl = "http://api.noopschallenge.com/hexbot"
    val getter = new DataGetter

    val result = getter.getFullData(baseUrl)
    print(result)
  }
}
