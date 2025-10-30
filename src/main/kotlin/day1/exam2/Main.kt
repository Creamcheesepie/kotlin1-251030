package day1.exam2

fun main() {
    val number = 10;
    var message = "Hello, Java!";

//    number = 12; val은 value 를 의미하며 불변이라 값을 다시 할당하는 것이 불가능하다.
    message = " hello, Kotlin!"; // var은 various를 의미하며 가변이라 값을 다시 할당하는 것이 가능하다.

    val number2 : Int = 10; // 타입 추론이 알아서 되는데 명시하려면 변수 뒤에 : 타입명을 써주면 된다.
    var message2 : String = "Hello, Kotlin!"; // 코틀린은 기본적으로 객체 타입만 사용가능하다.

    println("number = ${number}");
    println("message = $message");
}