// [7] 날짜를 입력하여 해당 요일이 주말인지 평일인지를 판별하기 (달의 기준은 30일이며 1일은 월요일입니다.) 입력 2일, 출력:평일

fun main() {
    var whatDay: Int

    while (true) {

        try {
            whatDay = readln().toInt()
        } catch (e: NumberFormatException) {
            System.err.println("숫자만 입력해주세요.")
            continue
        }

        if (whatDay !in 1 .. 30) {
            System.err.println("날짜는 1일에서 30일 중에 선택 해주세요")
            continue
        } else {
            break
        }
    }

    var dateCheck = ""

    when (whatDay % 7) {
        in 1 .. 5 -> dateCheck = "평일"
        0, 6 -> dateCheck = "주말"
    }

    println("오늘은 ${whatDay}일, ${dateCheck}입니다.")

}