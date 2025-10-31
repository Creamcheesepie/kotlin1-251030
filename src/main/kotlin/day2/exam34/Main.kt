package day2.exam34

class Person(
    val name : String = "" // val을 쓰면 자동으로 getter가 있다.
){
}

fun main(){
    val p = Person("Alice");
    println(p.name);
}