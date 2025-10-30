package day1.exam30

class MathUtil{
    // 클래스 내부에 정적 멤버를 선언할 때 companion object를 사용한다.
    // 자바의 static과 유사하지만 객체처럼 사용할 수 있다.
    companion object{
        val PI = 3.1415926;

        fun square(x: Int): Int{
            return x * x;
        }
    }
}

fun main() {
    MathUtil.square(8).also {
        println(it);
    }

    MathUtil.PI.also {
        println(it);
    }
}
