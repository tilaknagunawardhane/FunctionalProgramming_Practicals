object InterestCalculator {

    def calculateInterest(deposit: Double): Double = {
        // Lambda functions
        val rate1 = (amount: Double) => if (amount <= 20000) amount * 0.02 else 0.0
        val rate2 = (amount: Double) => if (amount <= 200000) amount * 0.04 else 0.0
        val rate3 = (amount: Double) => if (amount <= 2000000) amount * 0.035 else 0.0
        val rate4 = (amount: Double) => if (amount > 2000000) amount * 0.065 else 0.0

        deposit match {
            case d if d <= 20000 => rate1(d)
            case d if d <= 200000 => rate2(d)
            case d if d <= 2000000 => rate3(d)
            case _ => rate4(deposit)
        }
    }

    def main(args: Array[String]): Unit = {
        
        val deposits = List(15000.0, 50000.0, 250000.0, 2500000.0, 3000000.0)
        
        deposits.foreach { deposit =>
            println(f"Deposit: Rs. $deposit%.2f, Interest: Rs. ${calculateInterest(deposit)}%.2f")
        }
    }
}
