import scala.io.StdIn

object NumberClassifier {

  // Lambda functions 
  val isEven: Int => Boolean =(x => x % 2 == 0)
  val isZero: Int => Boolean =(x => x == 0)
  val isNeg: Int => Boolean =(x => x < 0)

  val pattern: Int => String = {
    case i if (isZero(i) || isNeg(i)) => s"$i is Negative/Zero"
    case i if (isEven(i)) => s"$i is Even"
    case i if (!isEven(i)) => s"$i is Odd"
  }

  def main(args: Array[String]): Unit = {
    println("Please enter an integer:")

    val input = StdIn.readLine()


      val number = input.toInt
      println(pattern(number))
    
  }
}
