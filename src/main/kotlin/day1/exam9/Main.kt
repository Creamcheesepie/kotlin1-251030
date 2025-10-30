package day1.exam9

fun main(){
    val name : String? = null;
    println(name?.length ?: "Name is null");

    // 코틀린에서  ? 는 null 값과 관련된 처리를 할 때 사용된다.
    // ?. : null값이 아닐 때에마 호출한다.
    // ?: : elvis 연산자 null일때 null이 아닌 사용자 정의 반환값을 이용할 때 사용하는 연산자.
}
