package day1.exam8

fun main(){
    val ages = listOf("Alice" to 24, "Bob" to 31, "Charlie" to 31, "Dan" to 42);

    for ((key, value) in ages){
        println("$key is $value");
    }
}
