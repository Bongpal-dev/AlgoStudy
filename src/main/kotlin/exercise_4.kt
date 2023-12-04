// [4] 정수 5개에서 가장 작은 값을 찾아주세요. 입력 예) 1,2,3,4,5 출력 예) 1

fun main() {
    var numbers = intArrayOf()

    while (true) {
        try {
            numbers = readln().split(",").map { it.toInt() }.toIntArray()
            if (numbers.size != 5) {
                System.err.println("숫자는 ','로 구분해서 5개 입력해주세요.")
                continue
            } else {
                break
            }
        } catch (e: NumberFormatException) {
            System.err.println("숫자만 입력해주세요.")
        }
    }

    println(numbers.min())

}