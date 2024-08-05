object FilterPrimeApp {
    def main(args: Array[String]): Unit = {
        val input = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        val output = filterPrime(input)

        println(s"Input: $input")
        println(s"Output: $output")
    }

    def filterPrime(numbers: List[Int]): List[Int] = {
        numbers.filter(isPrime)
    }

    def isPrime(number: Int): Boolean = {
        if (number <= 1) {
            false
        }
        else if (number == 2) {
            true
        }
        else {
            var checkPrime = true
            for (n <- 2 until number if checkPrime) {
                if (number % n == 0) {
                    checkPrime = false
                }
            }
            checkPrime
        }
    }
}
