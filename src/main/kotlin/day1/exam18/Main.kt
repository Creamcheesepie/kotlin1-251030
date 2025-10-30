package day1.exam18

fun main() {
    val numbers = listOf(1,2,3,4,5,6,7,8,9,10)

    val rst = numbers.filter{ it % 2 == 0}

    for( n in rst){
        println(n)
    }
}
