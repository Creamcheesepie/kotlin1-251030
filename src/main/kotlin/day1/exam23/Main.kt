package day1.exam23

fun main() {
    val name: String? = "hello";

    val len = name?.length ?: 0
    println(len);

    //let은 객체를 활용해 무언가를 수행하는 것이 목표!
    val rst = name?.let{ // 안전 호출과 함께 사용됨
        println(it.length); // 앞의 변수가 null이 아닌 경우에 내부 로직을 실행한다. 받아온 객체는 it으로 사용된다.
        10; // 따라서 수행 결과값이 반환된다. apply와의 차이점은 다른 것을 반환할 수 있다는 점이 있다.
        it.length * 2;
    }
    println(rst);
}
