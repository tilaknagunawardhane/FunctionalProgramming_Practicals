import scala.io.StdIn.readLine;

object CategorizeNumber {
  def main(args: Array[String]): Unit = {
    val num = readLine("Enter a number: ").toInt

    val check: Int => String = (x: Int) => x match {
      case x if (x % 3 == 0 && x % 5 == 0) => "Multiple of Both Three and Five"
      case x if (x % 3 == 0) => "Multiple of Three"
      case x if (x % 5 == 0) => "Multiple of Five"
      case _ => "Not a Multiple of Three or Five"
    }

    println(check(num))
  }
}
