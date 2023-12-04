// [3] 문자열에서 특정 알파벳 ‘a’의 개수를 세주세요. 입력 예)apple 출력  예) 1

fun main() {
    val string = readln()
    var count = 0

    string.forEach { if (it == 'a') count++ }

    println("입력하신 문자열에 들어있는 'a'는 총 ${count}개 입니다.")

}