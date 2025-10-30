package day1.exam24

fun main() {
    val length = "Hello".also{
        println("Before: $it")
    }.uppercase().also{
        println("After: $it")
    }.length

    println("length: $length")
}
