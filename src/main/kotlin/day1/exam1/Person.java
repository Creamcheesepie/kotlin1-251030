package day1.exam1;

public class Person {
    int age;
    String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello, my name is " + name + " and I'm " + age + " years old.");
    }
}
