object NameFormatter {

  def toUpper(str: String): String = str.toUpperCase
  def toLower(str: String): String = str.toLowerCase
  def formatNames(name: String)(formatFunc: String => String): String = formatFunc(name)

  def main(args: Array[String]): Unit = {
    println(formatNames("Benny")(toUpper))              // BENNY
    println(formatNames("Niroshan")(name => 
      name.substring(0, 2).toUpperCase + name.substring(2).toLowerCase)) // NIroshan
    println(formatNames("Saman")(toLower))              // saman
    println(formatNames("Kumara")(name => 
      name.substring(0, 1).toUpperCase + name.substring(1, name.length - 1).toLowerCase + name.last.toUpper)) // KumarA
  }
}
