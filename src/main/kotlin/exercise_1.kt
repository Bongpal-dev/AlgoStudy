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