package day1.exam6

fun main(){
    val person = Person("alice",30); // 코틀린에서는 new라는 키워드를 사용하지 않는다.
    val person2 = Person2("tom");
    person.greet();
    person2.greet();
}

class Person(val name:String, var age:Int){ // 코틀린 방식으로 만드는 코틀린 클래스 -? 클래스 ()에 들어가는 것이 인스턴스 변수이자 매개변수가 된다.
    fun greet() {
        println("hello, My name is ${name} and I'm ${age} years iold");
    }
}

class Person2{ // 자바 방식으로 만드는 코틀린 클래스
    private val name : String; //

    constructor(name: String){
        this.name = name;
    };

    fun greet(){
        println("hello, My name is ${name}");
    }
}