package _09_Polymorphism._04_WildFarm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] animalInfo = scanner.nextLine().split("\\s+");
        while (!animalInfo[0].equals("End")) {
            String[] foodInfo = scanner.nextLine().split("\\s+");
            String foodType = foodInfo[0];
            int quantity = Integer.parseInt(foodInfo[1]);
            Food food = null;
            switch (foodType) {
                case "Vegetable":
                    food = new Vegetable(quantity);
                    break;
                case "Meat":
                    food = new Meat(quantity);
                    break;
            }

            String animalType = animalInfo[0];
            String animalName = animalInfo[1];
            Double animalWeight = Double.parseDouble(animalInfo[2]);
            String animalLivingRegion = animalInfo[3];
            Mammal animal;

            switch (animalType) {
                case "Cat":
                    String animalBreed = animalInfo[4];
                    animal = new Cat(animalType, animalName, animalWeight, animalLivingRegion, animalBreed);
                    animal.eat(food);
                    animal.makeSound();
                    System.out.println(animal.toString());
                    break;
                case "Zebra":
                    animal = new Zebra(animalType, animalName, animalWeight, animalLivingRegion);
                    animal.makeSound();
                    if (foodType.equals("Vegetable")) {
                        animal.eat(food);
                    } else {
                        printInvalidFood(animalType);
                    }
                    System.out.println(animal.toString());
                    break;
                case "Mouse":
                    animal = new Mouse(animalType, animalName, animalWeight, animalLivingRegion);
                    animal.makeSound();
                    if (foodType.equals("Vegetable")) {
                        animal.eat(food);
                    } else {
                        printInvalidFood(animalType);
                    }
                    System.out.println(animal.toString());
                    break;
                case "Tiger":
                    animal = new Tiger(animalType, animalName, animalWeight, animalLivingRegion);
                    animal.makeSound();
                    if (foodType.equals("Vegetable")) {
                        printInvalidFood(animalType);
                    } else {
                        animal.eat(food);
                    }
                    System.out.println(animal.toString());
                    break;
            }
            animalInfo = scanner.nextLine().split("\\s+");
        }
    }

    public static void printInvalidFood(String animalType) {
        System.out.println(String.format("%ss are not eating that type of food!", animalType));
    }
}

