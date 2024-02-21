package _01_WorkingWithAbstraction;

import java.util.Scanner;

public class _01_RhombusOfStars {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            printRow(n - i, i + 1);
        }
        for (int i = n - 1; i > 0; i--) {
            printRow(n + 1 - i, i);
        }
    }

    public static void printRow(int countSpaces, int countStars) {
        for (int spaces = 0; spaces < countSpaces - 1; spaces++) {
            System.out.print(" ");
        }
        for (int stars = 0; stars < countStars; stars++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
