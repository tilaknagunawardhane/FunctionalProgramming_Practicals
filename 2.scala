object Main_10 {
    def main(args: Array[String]): Unit = {

    var a = 2
    var b = 3
    var c = 4
    var d = 5
    var k = 4.3f
    var g = 0

    // println( - -b * a + c *d - -);
    b -= 1
    val a_ans = b*a + c*d
    d -= 1
    println(s"a. $a_ans")

    // println(a++);
    println(s"b. $a")
    a += 1

    // println (–2 * ( g – k ) +c);
    val c_ans = -2*(g-k) +c
    println(s"c. $c_ans")

    // println (c=c++);
    println(s"d. $c")
    c += 1

    // println (c=++c*a++);
    c += 1
    val e_ans = c*a
    println(s"e. $e_ans")
    a +=1
    
    

    
    }
}
