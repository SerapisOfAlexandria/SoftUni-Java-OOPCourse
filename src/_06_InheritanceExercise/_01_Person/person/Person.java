package _06_InheritanceExercise._01_Person.person;

public class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
