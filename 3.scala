object mainF {
  def main(args: Array[String]): Unit ={
    val normalHours = 40
    val otHours = 30

    val finalSal = calTakeHomeSal(normalHours, otHours)
    println(s"Take home salary is: Rs. $finalSal")
  }

  def calTakeHomeSal(normalHours:Int, otHours:Int): Double = {
    val normalCost = 250
    val otCost = 85
    val tax = 0.12

    val salary = (normalCost*normalHours) + (otCost*otHours)
    val taxAmount = salary*tax

    val takeHomSalary = salary - taxAmount

    takeHomSalary
  }
}