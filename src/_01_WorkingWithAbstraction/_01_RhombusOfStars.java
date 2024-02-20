package _01_WorkingWithAbstraction;

import java.util.Scanner;

public class _01_RhombusOfStars {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        printRhombus(Integer.parseInt(scanner.nextLine()));
    }

    public static void printRhombus(int n) {
        System.out.print(generateRhombusUpperPart(n));
        System.out.print(generateRhombusLowerPart(n));

    }

    public static StringBuilder generateRhombusUpperPart(int n) {
        StringBuilder rhombusUpperPart = new StringBuilder();
        for (int i = 1; i < n + 1; i++) {
            for (int a = 0; a < n - i; a++) {
                rhombusUpperPart.append(" ");
            }
            for (int b = 0; b < i; b++) {
                rhombusUpperPart.append("* ");
            }
            rhombusUpperPart.append("\n");
        }
        return rhombusUpperPart;
    }

    public static StringBuilder generateRhombusLowerPart(int n) {
        StringBuilder rhombusLowerPart = new StringBuilder();
        for (int i = n - 1; i > 0; i--) {
            for (int a = 0; a < n - i; a++) {
                rhombusLowerPart.append(" ");
            }
            for (int b = 0; b < i; b++) {
                rhombusLowerPart.append("* ");
            }
            rhombusLowerPart.append("\n");
        }
        return rhombusLowerPart;
    }
}
