package _02_WorkingWithAbstractionExercise._06_GreedyTimes;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long capacity = Long.parseLong(scanner.nextLine());
        String[] safe = scanner.nextLine().split("\\s+");

        Map<String, LinkedHashMap<String, Long>> bag = new LinkedHashMap<>();
        long gold = 0;
        long gems = 0;
        long balance = 0;

        for (int i = 0; i < safe.length; i += 2) {
            String itemName = safe[i];
            long currentCapacity = Long.parseLong(safe[i + 1]);

            String item = returnItem(itemName);

            //Skip execution if capacity is lower than totalCapacity
            if (item.equals("")) {
                continue;
            } else if (capacity < bag.values().stream()
                    .map(Map::values)
                    .flatMap(Collection::stream)
                    .mapToLong(e -> e)
                    .sum() + currentCapacity) {
                continue;
            }

            switch (item) {
                case "Gem":
                    if (!bag.containsKey(item)) {
                        if (bag.containsKey("Gold")) {
                            if (currentCapacity >= bag.get("Gold").values().stream()
                                    .mapToLong(e -> e)
                                    .sum()) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else if (bag.get(item).values().stream()
                            .mapToLong(e -> e)
                            .sum() +
                            currentCapacity > bag.get("Gold").values().stream()
                            .mapToLong(e -> e)
                            .sum()) {
                        continue;
                    }
                    break;
                case "Cash":
                    if (!bag.containsKey(item)) {
                        if (bag.containsKey("Gem")) {
                            if (currentCapacity > bag.get("Gold").values().stream()
                                    .mapToLong(e -> e)
                                    .sum()) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else if (bag.get(item).values().stream()
                            .mapToLong(e -> e)
                            .sum() +
                            currentCapacity > bag.get("Gem").values().stream()
                            .mapToLong(e -> e)
                            .sum()) {
                        continue;
                    }
                    break;
            }

            if (!bag.containsKey(item)) {
                bag.put((item), new LinkedHashMap<String, Long>());
            }

            if (!bag.get(item).containsKey(itemName)) {
                bag.get(item).put(itemName, 0L);
            }


            bag.get(item).put(itemName, bag.get(item).get(itemName) + currentCapacity);
            if (item.equals("Gold")) {
                gold += currentCapacity;
            } else if (item.equals("Gem")) {
                gems += currentCapacity;
            } else if (item.equals("Cash")) {
                balance += currentCapacity;
            }
        }

        for (var x : bag.entrySet()) {
            Long sumValues = x.getValue().values().stream().mapToLong(l -> l).sum();

            System.out.println(String.format("<%s> $%s", x.getKey(), sumValues));

            x.getValue().entrySet().stream().sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey())).forEach(i -> System.out.println("##" + i.getKey() + " - " + i.getValue()));

        }
    }

    public static String returnItem(String nameOfItem) {
        String item = "";

        if (nameOfItem.length() == 3) {
            item = "Cash";
        } else if (nameOfItem.toLowerCase().endsWith("gem")) {
            item = "Gem";
        } else if (nameOfItem.toLowerCase().equals("gold")) {
            item = "Gold";
        }

        return item;
    }
}