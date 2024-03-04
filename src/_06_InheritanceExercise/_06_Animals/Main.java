package _06_InheritanceExercise._06_Animals;
import _06_InheritanceExercise._06_Animals.animals.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String typeOfAnimal = scanner.nextLine();

        while (!typeOfAnimal.equals("Beast!")) {
            try {
                String[] animalInfo = scanner.nextLine().split("\\s+");
                String name = animalInfo[0];
                int age = Integer.parseInt(animalInfo[1]);
                String gender = animalInfo[2];

                switch (typeOfAnimal) {
                    case "Cat":
                        Cat cat = new Cat(name, age, gender);
                        System.out.println(cat.toString());
                        break;
                    case "Dog":
                        Dog dog = new Dog(name, age, gender);
                        System.out.println(dog.toString());
                        break;
                    case "Frog":
                        Frog frog = new Frog(name, age, gender);
                        System.out.println(frog.toString());
                        break;
                    case "Tomcat":
                        Tomcat tomcat = new Tomcat(name, age);
                        System.out.println(tomcat.toString());
                        break;
                    case "Kitten":
                        Kitten kitten = new Kitten(name, age);
                        System.out.println(kitten.toString());
                        break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            typeOfAnimal = scanner.nextLine();
        }
    }
}
