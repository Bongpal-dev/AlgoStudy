// [8] 1부터 입력한 값을 모두 더하는 코드 만들기 (ex : 입력한 값이 5 라면 15가 출력됩니다.)

fun main() {
    var number: Long
    var answer = 0L

    while (true) {
        try {
            number = readln().toLong()
        } catch (e: NumberFormatException) {
            System.err.println("숫자만 입력하세요")
            continue
        }
        break
    }

    for (i in 1 .. number) {
        answer += i
    }

    println(answer)

}