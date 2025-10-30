package day1.exam14

object Singleton{
    fun showMessage(){
        println("Hello, world");
    }
}

fun main() {
    val a = Singleton;
    val b = Singleton;

    println(a == b);
}