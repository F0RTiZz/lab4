package lab4

import kotlin.random.Random

fun main() {
    val random = Random(System.currentTimeMillis())
    val exam1Grade = random.nextInt(1, 11)
    val exam1Preparation = random.nextBoolean()
    val exam2Grade = random.nextInt(1, 11)
    val exam2Preparation = random.nextBoolean()
    val exam3Grade = random.nextInt(1, 11)
    val exam3Preparation = random.nextBoolean()
    println("Экзамен 1: Оценка - $exam1Grade, Подготовка - ${if (exam1Preparation) "Хорошо" else "Плохо"}")
    println("Экзамен 2: Оценка - $exam2Grade, Подготовка - ${if (exam2Preparation) "Хорошо" else "Плохо"}")
    println("Экзамен 3: Оценка - $exam3Grade, Подготовка - ${if (exam3Preparation) "Хорошо" else "Плохо"}")
}