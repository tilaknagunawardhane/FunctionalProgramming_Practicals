object TicketPriceOptimizer {


  def DetermineProfit(ticketPrice: Int): Int = {

    val showCost = 500
    val attendeeCost = 3
    val genPrice = 15
    val genAttendance = 120

    val attendance =calculateAttendance(genPrice,genAttendance,ticketPrice)
    val totalCost = calculateTotalCost(showCost,attendeeCost,attendance)
    val income =calculateIncome(ticketPrice, attendance)

    calculateProfit(income,totalCost)
  }

  def calculateAttendance(basePrice: Int, baseAttendance: Int, ticketPrice: Int):Int = {
    val priceIncrDecr =5
    val attendanceIncrDecr= 20
    ((basePrice - ticketPrice)/priceIncrDecr) * attendanceIncrDecr+baseAttendance
  }

  def calculateTotalCost(showCost: Int, attendeeCost: Int, attendance: Int): Int ={
    showCost+(attendeeCost*attendance)
  }

  def calculateIncome(ticketPrice: Int, attendance: Int): Int= {
    ticketPrice*attendance
  }

  def calculateProfit(income: Int, totalCost: Int): Int = {
    income - totalCost
  }

  def main(args: Array[String]): Unit= {
    println(DetermineProfit(5))   //profit = -180
    println(DetermineProfit(10))  //profit = 480
    println(DetermineProfit(15))  //profit = 940
    println(DetermineProfit(20))  //profit = 1200
    println(DetermineProfit(25))  //profit = 1260 Best ticket price
    println(DetermineProfit(30))  //profit = 1120
  }
}
