object bookStore{
  def wholesaleCost(copies : Int) : Double = {
  val coverprice = 24.95
  val discount = 0.4
  val discountedPrice = coverprice * (1 - discount)
  
  val first50shipping = 3.0
  val additional = 0.75
  
  val bookCost = discountedPrice * copies
  val shippingCost = if (copies <= 50) { first50shipping
  } else {
  first50shipping + (copies - 50) * additional}
  
  bookCost + shippingCost
  }


  def main(args: Array[String]): Unit = {
    val numberOfCopies = 60
    val totalCost = wholesaleCost(numberOfCopies)
    println(s"The total wholesale cost for $numberOfCopies copies is Rs. $totalCost")
    }
}


