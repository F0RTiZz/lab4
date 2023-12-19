package lab4

fun main() {
    for (i in 1..10) {
        for (j in 1..10) {
            print("%4d".format(i * j))
        }
        println()
    }
}