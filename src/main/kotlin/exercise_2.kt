// [2] 정수를 5개 입력받아  합계 구하기 (예시: 정수 5개 입력 1,2,3,4,5 -> 더한 값 15)
fun main() {
    var number = intArrayOf()

    while (true) {
        try {
            number = readln().split(",").map { it.toInt() }.toIntArray()
            if (number.size == 5) break else System.err.println("숫자는 ','로 구분해 5개 입력해주세요.")

        } catch (e: NumberFormatException) {
            System.err.println("숫자만 입력해주세요.")
        }
    }

    println("더한값 : ${number.sum()}")

}