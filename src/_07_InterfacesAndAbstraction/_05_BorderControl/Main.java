package _07_InterfacesAndAbstraction._05_BorderControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Identifiable> idsList = new ArrayList<>();
        String name, id, model;
        int age;

        String[] command = scanner.nextLine().split("\\s+");
        while (!command[0].equals("End")) {
            switch (command.length) {
                case 2:
                    model = command[0];
                    id = command[1];
                    idsList.add(new Robot(id, model));
                    break;
                case 3:
                    name = command[0];
                    age = Integer.parseInt(command[1]);
                    id = command[2];
                    idsList.add(new Citizen(name, age, id));
            }
            command = scanner.nextLine().split("\\s+");
        }

        String invalidIdSuffix = scanner.nextLine();
        for (Identifiable obj : idsList) {
            if (obj.getId().endsWith(invalidIdSuffix)) {
                System.out.println(obj.getId());
            }
        }
    }
}
