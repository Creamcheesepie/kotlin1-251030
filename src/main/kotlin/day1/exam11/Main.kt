package day1.exam11

data class DataPerson(
    val name : String,
    val age : Int
){}

class Person(
    val name: String,
    val age: Int
){}


fun main(){
    //일반 클래스
    val person = Person("Alice",29);
    val person2 = Person("Alice",29);
    val person3 = Person("Bob",30);

    println(person == person2);
    println(person == person3);
    println(person);

    // data 클래스
    val p1 = DataPerson("Alice", 29);
    val p2 = DataPerson("Alice", 29);
    val p3 = DataPerson("Bob", 29);

    println(p1 == p2);
    println(p1 == p3);
    println(p1);
}
