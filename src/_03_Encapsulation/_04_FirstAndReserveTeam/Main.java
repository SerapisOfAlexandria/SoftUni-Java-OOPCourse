package _03_Encapsulation._04_FirstAndReserveTeam;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Team team = new Team("team");

        for (int i = 0; i < n; i++) {
            String personInfo[] = scanner.nextLine().split("\\s+");
            String firstName = personInfo[0];
            String lastName = personInfo[1];
            int age = Integer.parseInt(personInfo[2]);
            double salary = Double.parseDouble(personInfo[3]);

            team.addPlayer(new Person(firstName, lastName, age, salary));
        }

        System.out.println("First team have " + team.getFirstTeam().size() + " players");
        System.out.println("Reserve team have " + team.getReserveTeam().size() + " players");
    }
}
