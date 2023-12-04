// [6] 월을 입력받아 해당 월이 어떤 계절에 속하는지를 판별하기(계절의 기준은 3월~5월까지 봄입니다., 6~8월:여름..    입력: 4, 출력:봄입니다.)

fun main() {
    var month = 0

    while (true) {
        try {
            month = readln().toInt()
        } catch (e: NumberFormatException) {
            System.err.println("숫자만 입력해주세요.")
            continue
        }

        if (month !in 1..12) {
            System.err.println("1월 ~ 12월 중에서 선택해주세요.")
            continue
        }

        break

    }

    when (month) {
        3, 4, 5 -> (println("봄 입니다."))
        6, 7, 8 -> (println("여름 입니다."))
        9, 10, 11 -> (println("가을 입니다."))
        12, 1, 2 -> (println("겨울 입니다."))
    }
}