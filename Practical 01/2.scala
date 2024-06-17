object Main_2{
  def convert_Temp(celsius: Double): Double = {
    celsius*1.8000 +32.00
  }

  def main(args: Array[String]): Unit ={
    val temp = 35
    val fahrenheit = convert_Temp(temp)
    println("The temperature $temp °C is equal to $fahrenheit°F")
  }
}

