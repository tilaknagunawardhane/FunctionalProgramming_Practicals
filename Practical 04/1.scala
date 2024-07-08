object Inventory{

  def displayInventory(names: Array[String], quantity: Array[Int]): Unit = {
    
    println("\nCurrent Inventory: ");
    for(i <- names.indices)
    {
      println(s"${names(i)} : ${quantity(i)}");
    }
  }

  def restockItem(itemName: String, itemQuantity: Int, names: Array[String], quantity: Array[Int]): Unit = {
    var itemfound = false;
    for(i <- names.indices)
    {
      if(itemName == names(i))
      {
        quantity(i) = quantity(i) + itemQuantity;
        itemfound = true;
        println(s"\nRestocked $itemQuantity of $itemName. New quantity: ${quantity(i)}\n");
      }
      
    }

    if(!itemfound)
    {
      println("\nNo Such Item in the Inventory")
    }   
  }

  def sellItem(itemName: String, itemQuantity: Int, names: Array[String], quantity: Array[Int]): Unit = {
    var itemfound = false;
    for(i <- names.indices)
    {
      if(itemName == names(i))
      {
        itemfound = true;
        if(quantity(i) < itemQuantity)
        {
          println(s"\nNo enough quantity of $itemName in the stock.");
        }
        else{
          quantity(i) = quantity(i) - itemQuantity;
          
          println(s"Sold $itemQuantity of $itemName. Remaining quantity: ${quantity(i)}")
        }
        
      }
      
    }

    if(!itemfound)
    {
      println("\nNo Such Item in the Inventory\n")
    }   
  }

  def main(args: Array[String]): Unit = {
    val names = Array("Item1", "Item2", "Item3", "Item4", "Item5");
    val quantity = Array(4,5,2,8,3);

    displayInventory(names, quantity);
    restockItem("Item3", 4, names, quantity);
    sellItem("Item4", 3, names, quantity);
    displayInventory(names, quantity);

  }
}