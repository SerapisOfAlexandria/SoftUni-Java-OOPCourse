package _04_EncapsulationExercise._04_PizzaCalories;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pizza pizza;
        String[] pizzaInfo = scanner.nextLine().split(" ");
        String pizzaName = pizzaInfo[1];
        int numOfTopping = Integer.parseInt(pizzaInfo[2]);

        Dough dough;
        String[] doughInfo = scanner.nextLine().split(" ");
        String flourType = doughInfo[1];
        String bakingTechnique = doughInfo[2];
        double weightDough = Double.parseDouble(doughInfo[3]);

        try {
            pizza = new Pizza(pizzaName, numOfTopping);
            dough = new Dough(flourType, bakingTechnique, weightDough);
            pizza.setDough(dough);

            for (int i = 0; i < numOfTopping; i++) {
                String[] toppingInfo = scanner.nextLine().split(" ");
                String typeOfTopping = toppingInfo[1];
                double weightOfTopping = Double.parseDouble(toppingInfo[2]);
                Topping topping = new Topping(typeOfTopping, weightOfTopping);
                pizza.addTopping(topping);
            }

            System.out.printf("%s - %.2f", pizzaName, pizza.getOverallCalories());

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
