object NumberCategorizer {

  def main(args: Array[String]): Unit = {
    if (args.length != 1) {
      println("Please provide exactly one integer argument.")
      System.exit(1)
    }

    val input = args(0).toInt

    // Define lambda functions for each condition
    val isMultipleOfThree: Int => Boolean = n => n % 3 == 0
    val isMultipleOfFive: Int => Boolean = n => n % 5 == 0
    val isMultipleOfBoth: Int => Boolean = n => n % 15 == 0

    // Categorize the number using pattern matching with the lambda functions
    val categorize: Int => String = {
      case n if isMultipleOfBoth(n) => "Multiple of Both Three and Five"
      case n if isMultipleOfThree(n) => "Multiple of Three"
      case n if isMultipleOfFive(n) => "Multiple of Five"
      case _ => "Not a Multiple of Three or Five"
    }

    println(categorize(input))
  }
}
