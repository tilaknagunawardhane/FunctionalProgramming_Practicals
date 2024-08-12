import scala.io.StdIn.readLine

object CaesarCipher {
    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

    def CaesarEncryption(input: String, shift: Int): String = {
        val output = input.map { c =>
            val i = alphabet.indexOf(c.toUpper)
            if (i == -1) {
                c
            } else {
                alphabet((i + shift) % alphabet.size)
            }
        }
        output
    }

    def CaesarDecryption(input: String, shift: Int): String = {
        val output = input.map { c =>
            val i = alphabet.indexOf(c.toUpper)
            if (i == -1) {
                c
            } else {
                alphabet((i - shift + alphabet.size) % alphabet.size)
            }
        }
        output
    }

    def CaesarCipher(input: String, shift: Int, CaesarEncryption: (String, Int) => String, CaesarDecryption: (String, Int) => String): Unit = {
        val encrypted = CaesarEncryption(input, shift)
        val decrypted = CaesarDecryption(input, shift)

        println(s"Encrypted: $encrypted")
        println(s"Decrypted: $decrypted")
    }

    def main(args: Array[String]): Unit = {
        val shift = (readLine("Shift By: ").toInt + alphabet.size) % alphabet.size
        val input = readLine("Text: ")

        CaesarCipher(input, shift, CaesarEncryption, CaesarDecryption)
    }
}
