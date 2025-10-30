package day1.exam28

class Example{
    lateinit var value: String; // 나중에 초기화가 가능하므로 not null 유지
}


fun main() {
    val example = Example();

    // 초기화 되지 않은 경우에는 UninitializedPropertyAccessException 발생
//    println(example.value.length);

    example.value = "hi";

    println(example.value.length);
}
