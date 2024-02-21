package _02_WorkingWithAbstractionExercise._02_CardRanks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        System.out.println(input + ":");
        for (CardRank card : CardRank.values()) {
            System.out.printf("Ordinal value: %d; Name value: %s\n", card.getOrdinalValue(), card.name());
        }
    }
}
