package day1.exam24

fun main() {
    //  원본 객체를 유지하며 원하는 작업을 할 때 사용
    // DB 저장, 데이터 저장, 로그 출력 등의 작업에 사용된다.
    val length = "Hello".also{
        println("Before: $it")
    }.uppercase().also{
        println("After: $it")
    }.length

    println("length: $length")
}
