object Mean{
  def findMean(a: Int, b: Int): String = {
    val avg  = (a+b)/2.0
    println(avg)
    f"$avg%.2f"
  }

  def main(args: Array[String]): Unit = {
    val num1 = 10
    val num2 = -5
    val average = findMean(num1, num2)
    println(s"The arithmetic mean of $num1 and $num2 is: $average")
  }
}