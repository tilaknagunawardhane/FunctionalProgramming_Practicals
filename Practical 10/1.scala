class Rational(n: Int, d: Int) {
    
  require(d != 0, "Denominator cannot be zero")

  private val g = gcd(n.abs, d.abs)
  
  val numer: Int = n / g
  val denom: Int = d / g
  
  // Auxiliary constructor to create a rational number with denominator 1
  def this(n: Int) = this(n, 1)

  // negate 
  def neg: Rational = new Rational(-numer, denom)

  override def toString: String = s"$numer/$denom"

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
}

object Main {
  def main(args: Array[String]): Unit = {
    val x = new Rational(3, 4) 
    println(s"Original Rational Number: $x") 
    
    val negX = x.neg // Negate the rational number
    println(s"Negated Rational Number: $negX")
  }
}
