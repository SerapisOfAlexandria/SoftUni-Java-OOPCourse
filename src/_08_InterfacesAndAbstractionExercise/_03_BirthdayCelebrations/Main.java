package _08_InterfacesAndAbstractionExercise._03_BirthdayCelebrations;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> dates = new ArrayList<>();
        String year, date;

        String[] inputInfo = scanner.nextLine().split("\\s+");
        while (!inputInfo[0].equals("End")) {
            switch (inputInfo[0]) {
                case "Citizen":
                    date = inputInfo[4];
                    year = inputInfo[4].split("/")[2];
                    break;
                case "Pet":
                    date = inputInfo[2];
                    year = inputInfo[2].split("/")[2];
                    break;
                default:
                    year = null;
                    date = null;
                    break;
            }
            dates.add(date);
            inputInfo = scanner.nextLine().split("\\s+");
        }

        String specificYear = scanner.nextLine();
        System.out.println(dates.stream()
                .filter(string -> {
                    if (string == null) {
                        return false;
                    } else if (string.endsWith(specificYear)) {
                        return true;
                    } else {
                        return false;
                    }
                })
                .collect(Collectors.joining("\n")));
    }
}


