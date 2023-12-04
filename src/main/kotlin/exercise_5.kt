// 5] 1-100의 숫자 중에  2개를 뽑아 더하거나, 곱하거나, 나눠서 25가 나오는 경우의 수와 몇 번인지 구하기     출력 예) (1,24), (2,23), (5,5),,,,   총 30개.

fun main() {
    val hundred = (1..100).map { it.toDouble() }.toDoubleArray()
    var count = 0

    hundred.forEach {
        for (i in hundred) {
            when {
                it + i == 25.0 -> count++
                it * i == 25.0 -> count++
                it / i == 25.0 -> count++
            }
        }
    }

    println("총 ${count}개")


}