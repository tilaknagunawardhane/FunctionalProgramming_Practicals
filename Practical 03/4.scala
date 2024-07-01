object findSum{

  def findSumofEvens(arr: Array[Int]): Int ={

    val n = arr.length
    var sum = 0;
    for(i<-0 to n-1)
    {
      if(arr(i)%2 == 0)
      {
        sum = sum + arr(i);
      }
    }

    sum;
  }

  def main(args: Array[String]): Unit = {
    val input = Array(2,5,6,1,8,9,13,14)
    val sum = findSumofEvens(input);
    println(s"Sum is $sum");
  }
}