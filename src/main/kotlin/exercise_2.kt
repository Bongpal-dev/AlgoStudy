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