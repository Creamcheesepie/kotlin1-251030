package day1.exam26

class Person(
    var name : String,
    var age : Int,
    var weight: Double,
    var salary: Int
){
    fun increaseAge(yaers : Int){age += yaers};
    fun increaseWeight(kg: Double){weight += kg};
    fun increaseSalary(amount : Int){salary += amount}

    fun getInfo(){
        println("name: $name, age: $age, salary: $salary, weight: $weight")
    }
}


fun main() {
    val p1 = Person("Alice",25,55.5,3000);

    with(p1){
        increaseAge(5);
        increaseSalary(1000);
        increaseWeight(3.5);
    }

    p1.getInfo()
}
