class DataGetter {

  def getFullData(url:String): String = {
    scala.io.Source.fromURL(url).mkString
  }

}
