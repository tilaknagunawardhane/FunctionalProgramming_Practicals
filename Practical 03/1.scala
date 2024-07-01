object Reverse{

  def reverseWord(word: String): String = {
    
    var m = word.length();

    if(m<=1)
    {
      word;
    }
    else{
      word.last + reverseWord(word.substring(0, m-1))
    }
  }

  def main(args: Array[String]): Unit = {
    val input = "Hello World";
    val reverse = reverseWord(input)

    println(s"Original string: $input")
    println(s"Reversed string: $reverse")
  }
}