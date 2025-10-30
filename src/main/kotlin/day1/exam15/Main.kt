package day1.exam14

fun main() {
    sayHello()
    sayHello("John");
    sayHello("Denise",99);
    sayHello(age = 20) ; // 매개변수 순서가 존재해서 앞의 매개변수를 비우고 뒤에 값을 넣을 때에는 매개변수 지정을 해줘야 한다.

}

fun sayHello(name : String = "guest" , age: Int = 20){
    println("Hello $name!, Age $age");
}
