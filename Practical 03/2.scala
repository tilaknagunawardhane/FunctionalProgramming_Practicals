import scala.collection.mutable.ArrayBuffer
object StringList{
  def main(args: Array[String]): Unit = {
    val input = "Hellooo world list of strings function".split(" ");
    val output = findStringList(input, 5);
    println(output.mkString(" "));
  }

  def findStringList(input: Array[String], length: Int): Array[String]={

    var output = ArrayBuffer[String]();
    for(i<-0 to length)
    {
      if(input(i).length()>5)
      {
        output += input(i)
      }
    }
    output.toArray
  }
}