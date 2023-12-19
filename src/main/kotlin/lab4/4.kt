package lab4

fun main() {
    print("Введите сумму вклада: ")
    val initialAmount = readLine()?.toDoubleOrNull() ?: 0.0

    print("Введите количество месяцев: ")
    val numMonths = readLine()?.toIntOrNull() ?: 0

    var finalAmount = initialAmount

    for (month in 1..numMonths) {
        val interest = finalAmount * 0.07
        finalAmount += interest
    }

    println("Конечная сумма вклада: $finalAmount")
}