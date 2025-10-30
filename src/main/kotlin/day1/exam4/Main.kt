package day1.exam4

fun main() {
    for(i  in  0 until 5){ // until : 폐구간
        println("count : ${i}");
    }
    for(i in 0 .. 4) { // .. : 개구간
        println("count : ${i}");
    }
}