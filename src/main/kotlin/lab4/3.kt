package lab4

fun main() {
    val hhh = 10000000
    val jjj = 14
    val kkk = 8
    val lll = if (jjj < 7) 7 else jjj
    val ttt = if (kkk < 6) 6 else kkk

    val mmm =
        hhh + (hhh * lll * 0.001 - hhh * ttt * 0.001 - 1)

    println("Численность населения через 10 лет: " + "$mmm")
}