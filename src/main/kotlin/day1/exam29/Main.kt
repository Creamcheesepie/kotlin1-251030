package day1.exam29

val lazyValue: String by lazy {
    println("initializing");
    "hello";
}

fun main() {
    println(lazyValue) //
    println(lazyValue)
}
