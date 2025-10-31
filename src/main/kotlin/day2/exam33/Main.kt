package day2.exam33

// 필드의 수정은 막되 접근은 가능하게 하고 싶을 때 -> val 사용
class Person(
    val name : String = ""
){
}

fun main(){
    val p = Person("Alice");
    println(p.name);
}