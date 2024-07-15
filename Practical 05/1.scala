import scala.io.StdIn.readLine

object InventoryManagementSystem {

  def getProductList(): List[String] = {
    
    var productList: List[String] = List()
    var input: String = ""

    while (input != "done") {
      input = readLine("Enter a product name (or type 'done' to finish): ")
      if (input != "done") {
        productList = productList :+ input
      }
    }
    productList
  }

  def printProductList(products: List[String]): Unit = {
    for (i <- products.indices) {
      println(s"${i + 1}. ${products(i)}")
    }
  }


  def getTotalProducts(products: List[String]): Int = {
    products.length
  }

  def main(args: Array[String]): Unit = {
    val productList = getProductList()
    println("\nList of Products:")
    printProductList(productList)
    println(s"\nTotal number of products: ${getTotalProducts(productList)}")
  }
}

