package day2.exam32

// 인터페이스
/*
    코틀린에서 인터페이스는 더 간결하고 명확한 문법으로 사용할 수 있다,
 */
interface Animal{
    fun eat()
}

interface Pet{
    fun play();
}

class Wolf : Animal{
    override fun eat() {
        println("아오");
    }
}

class Dog : Animal, Pet {
    override fun play() {
        println("멍멍");
    }

    override fun eat() {
        println("접접");
    }
}
