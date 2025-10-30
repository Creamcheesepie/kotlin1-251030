package day1.exam23

fun main() {
    val name: String? = "hello";

    val len = name?.length ?: 0
    println(len);

    //let은 객체를 활용해 무언가를 수행하는 것이 목표!
    val rst = name?.let{ // 안전 호출과 함께 사용됨
        println(it.length); // 앞의 변수가 null이 아닌 경우에 내부 로직을 실행한다.
        10; // 따라서 수행 결과값이 반환된다. 마지막 결과값이 반환되는 건가?
    }
    println(rst);
}
