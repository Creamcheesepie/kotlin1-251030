package day1.exam12

fun String.greet(){
    println("Hello, $this!");
} // 원하는 위치에서 필요한 함수를 추가할 수 있음

fun main(){
    val name: String = "kang";
    name.greet();
}
