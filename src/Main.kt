import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)

    print("Kvadratning tomonini (a) kiriting: ")
    val a = reader.nextDouble()

    // Yuzani hisoblaymiz: S = a * a
    val s = a * a

    println("Kvadratning yuzasi S = $s")
}