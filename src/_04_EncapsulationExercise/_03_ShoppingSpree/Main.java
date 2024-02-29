package _04_EncapsulationExercise._03_ShoppingSpree;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] namesWithBalances = scanner.nextLine().split(";");
        String[] productsWithPrices = scanner.nextLine().split(";");
        Map<String, Person> people = new LinkedHashMap<>();
        Map<String, Product> products = new LinkedHashMap<>();


        for (String name : namesWithBalances) {
            String[] nameWithBalance = name.split("=");
            try {
                people.put(nameWithBalance[0], new Person(nameWithBalance[0], Double.parseDouble(nameWithBalance[1])));
            } catch (IllegalArgumentException e ) {
                System.out.println(e.getMessage());
            }
        }

        for (String product : productsWithPrices) {
            String[] productWithPrice = product.split("=");
            try {
                products.put(productWithPrice[0], new Product(productWithPrice[0], Double.parseDouble(productWithPrice[1])));
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        String command = scanner.nextLine();

        while (!command.equals("END")) {
            String[] nameAndProduct = command.split("\\s+");
            try {
                people.get(nameAndProduct[0]).buyProduct(products.get(nameAndProduct[1]));
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            command = scanner.nextLine();
        }

        for (Person person : people.values()) {
            if (person.getProducts().isEmpty()) {
                System.out.println(person.getName() + " - Nothing bought");
            } else {
                System.out.println(person.getName() + " - " + person.getProducts().stream()
                        .map(product -> product.getName())
                        .collect(Collectors.joining(", ")));
            }
        }
    }
}
