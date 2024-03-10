package _08_InterfacesAndAbstractionExercise._04_FoodShortage;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Buyer> personMap = new LinkedHashMap<>();
        String name, id, dateOfBirth, group;
        int age;

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] inputInfo = scanner.nextLine().split("\\s+");

            switch (inputInfo.length) {
                case 4:
                    name = inputInfo[0];
                    age = Integer.parseInt(inputInfo[1]);
                    id = inputInfo[2];
                    dateOfBirth = inputInfo[3];

                    personMap.put(name, new Citizen(name, age ,id ,dateOfBirth));
                    break;
                case 3:
                    name = inputInfo[0];
                    age = Integer.parseInt(inputInfo[1]);
                    group = inputInfo[2];

                    personMap.put(name, new Rebel(name, age, group));
                    break;
            }
        }

        String getFoodName = scanner.nextLine();
        while (!getFoodName.equals("End")) {
            if (personMap.containsKey(getFoodName)) {
                personMap.get(getFoodName).buyFood();
            }
            getFoodName = scanner.nextLine();
        }

        System.out.println(personMap.values().stream()
                .map(person -> person.getFood())
                .mapToInt(Integer::valueOf)
                .sum());
    }
}
