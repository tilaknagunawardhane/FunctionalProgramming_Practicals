object Convert {

    def toUpper(str: String): String = {
        str.map(c => if (c >= 'a' && c <= 'z') (c - 32).toChar else c)
    }

    def toLower(str: String): String = {
        str.map(c => if (c >= 'A' && c <= 'Z') (c + 32).toChar else c)
    }

    def formatNames(name: String)(cformat_fun: String => String): String = {
        format_fun(name)
    }

    def main(args: Array[String]): Unit = {
        val names = List(
            ("Benny", toUpper),
            ("Niroshan", (s: String) => toUpper(s.substring(0,2)) + s.substring(2)),
            ("Saman", toLower),
            ("Kumara", (s: String) => toUpper(s.substring(0,1)) + s.substring(1, s.length - 1) + toUpper(s.substring(s.length - 1)))
        )

        names.foreach(name => println(formatNames(name._1)(name._2)))
    }
}
