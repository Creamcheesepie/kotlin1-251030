package day1.exam22

class Person() {
    var name: String = "";
    var age : Int = 0;

    fun printInfo(){
        println("$name is $age years old");
    }
}

fun main() {
    val person  = Person().apply{ // 넘어온 객체에 대해 동일한 객체에 값만 적용해서 객체의 참조값을 그대로 반환 -> 반환되는 객체도 동일하다.
        name = "Alice" // 원래 값을 가져올 때에는
        age = 20
        println(this); // 원래 객체에 대해 this로 받아온다.
    }

    person.printInfo()
}
