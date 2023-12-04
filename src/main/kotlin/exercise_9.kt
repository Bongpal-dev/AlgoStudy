// [9] down to 를 활용하여 20이하 짝수 출력하기 (출력예: 20,18,16……..)

fun main() {
    var numbers = intArrayOf()

    for (i in 20 downTo 1 step 2) {
        numbers += i
    }

    println(numbers.joinToString())

}