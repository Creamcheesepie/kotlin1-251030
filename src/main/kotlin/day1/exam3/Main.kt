package day1.exam3

fun main() {
    val number = 10;
    val str = if(number % 2 == 0) "even" else "odd";

    println(str);

    when{
        number % 2 == 0 -> println("even");
        number % 2 != 0 -> println("odd");
    }
}