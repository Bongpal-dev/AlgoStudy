// [1] 사용자에게 정수를 입력받아, 홀짝 구분하기  예) 입력: 10, 출력: 짝수입니다.  (단, 0, null은 예외처리)

fun main() {
    var number: Int?
    var odd = ""

    while (true) {
        number = readln().toIntOrNull()
        if (number == 0 || number == null) {
            System.err.println("숫자를 제대로 입력해주세요.")
        } else {
            if (number % 2 == 0) {
                odd = "짝수"
                break
            } else {
                odd = "홀수"
                break
            }
        }
    }

    println("입력숫자 : ${number}, 해당 숫자는 ${odd}입니다.")

}