object NameFormatter {

  // Lambda functions 
  val toUpper: String => String = (x: String) => x.toUpperCase
  val toLower: String => String = (x: String) => x.toLowerCase

  val formatNames: (String, String => String) => String = (name, formatFun) => formatFun(name)

  def main(args: Array[String]): Unit = {
    println(toUpper("Benny"))

    val formatFunc1: String => String = n => n.substring(0, 2).toUpperCase + n.substring(2)
    val formatFunc2: String => String = n => n.substring(0, 1).toUpperCase + n.substring(1, n.length - 1) + n.substring(n.length - 1).toUpperCase

    println(formatNames("Niroshan", formatFunc1)) 
    println(toLower("Saman")) 
    println(formatNames("Kumara", formatFunc2)) 
  }
}
