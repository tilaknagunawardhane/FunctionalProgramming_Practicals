object Fibonacci {

  def fibonacci(n: Int): Int = {
    if (n <= 0) 0
    else if (n == 1) 1
    else fibonacci(n - 1) + fibonacci(n - 2)
  }

  def printFibonacci(n: Int): Unit = {
    for (i <- 0 until n) {
      print(fibonacci(i) + " ")
    }
    println()  
  }

  def main(args: Array[String]): Unit = {
    val n = 10  
    println(s"The first $n Fibonacci numbers are:")
    printFibonacci(n)
  }
}

