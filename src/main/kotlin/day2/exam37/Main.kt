package day2.exam37

class example(val ex1: Int, val ex2: String) {}// 클래스 인자로 var나 val를 넣을 경우 임시로 사용하는 매개변수가 아니라 필드로 사용이 가능해진다.
class example2(ex1: Int, ex2: String) { // var 이나 val이 빠질 경우에는 임시적인 메개변수로 작동하여
    val name : String = ex2; // 이렇게 값 할당은 가능하지만
    fun printer(){
//            println(ex2); // 출력 등의 추가적인 행동은 할 수 없다.
    }
}

class introduceExample (val name : String , val age : Int){
    fun introduce(){
        println(name + age);
    }
}

class initExample(val name : String, var age : Int){
    init { // 생성시 동작하는 블록
        println(name);
        println(age);
    }
}

fun main() {
    val sample1 = introduceExample("woman",15);
    sample1.introduce();
    val sample2 = initExample("man",15);
}



