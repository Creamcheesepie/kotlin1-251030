package day1.exam7

fun main(){
    val names = listOf("Alice", "Bob", "Charlie", "Dan");
    var names2 = mutableListOf("Alice", "Bob", "Charlie");

//    names.add("michel"); 불변 객체는 사용할 수 없다!
    names2.add("Dan");

    for (name in names){
        println(name);
    }
}
