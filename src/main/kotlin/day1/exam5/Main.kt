package day1.exam5

fun main() {
    val result : Int  = add(5,10);
    println("result : $result");
}

fun add(a:Int, b:Int): Int{ // (인수명:타입명 , 인수명:타입명):반환타입 {함수내용}
    return a + b;
}