package day2.exam31

// open 키워드 : 상속과 연관되어있음
/*
    코틀린에서 기본적으로 클래스와 메서드는 final(상속 불가) 상태이다.
    즉 명시적으로 open 키워드를 붙여양 상속가능하게 만들 수 있다.
    자바와 달리, 기본적으로 클래스를 상속하려면 open를 사용해야 한다.
 */
class CloseAnimal{
    fun makeSound() {
        println("Make Sound");
    }
}

//class Dog : CloseAnimal{} // 상속이 안됨

open class Animal{ // open을 붙여야 상속이 가능하다.
    open fun makeSound(){ // 오버라이딩 될 메소드도 open이 되어 있어야 오버라이딩이 가능하다.
        println("Make Sound");
    }
}

class Dog : Animal(){ // 상속이 가능해진다.
    override fun makeSound(){ // override를 꼭 붙여줘야 오버라이딩이 가능하다.
        println("멍멍");
    }
}

fun main() {
    val dog = Dog();
    dog.makeSound();
}