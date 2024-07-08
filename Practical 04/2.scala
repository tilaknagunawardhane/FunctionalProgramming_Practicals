import scala.io.StdIn.readLine;

object PatternMatching{
  def main(args: Array[String]):Unit = {
    print("Enter a number: ")
    val input = readLine();

    val number = input.toInt
    matchThePattern(number);
  }

  def matchThePattern(num: Int):Unit = num match{
    case num if num==0 => println("Zero")
    case num if num < 0 =>  println("Negative")
    case num if num%2 == 0 => println("Even")
    case _: Int => println("Odd")
  }
}