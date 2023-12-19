package lab4

import kotlin.random.Random

fun main() {
    val numberOfShots = 3
    val numberOfTargets = 3
    var totalScore = 0

    for (target in 1..numberOfTargets) {
        println("Мишень $target:")
        var targetScore = 0

        for (shot in 1..numberOfShots) {
            val isHit = Random.nextBoolean()
            if (isHit) {
                targetScore++
                totalScore++
                println("Выстрел $shot: Попадание!")
            } else {
                println("Выстрел $shot: Промах")
            }
        }

        println("Баллы за мишень $target: $targetScore\n")
    }

    println("Общее количество баллов спортсмена: $totalScore")
}