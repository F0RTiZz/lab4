package lab4

fun main() {
    print("Введите сумму вклада: ")
    val deposit = readLine()!!.toDouble()

    print("Введите количество месяцев: ")
    val months = readLine()!!.toInt()

    var currentSum = deposit
    var month = 1

    while (month <= months) {
        val interest = currentSum * 0.07
        currentSum += interest
        month++
    }

    println("Итоговая сумма вклада через $months месяцев: $currentSum")
}