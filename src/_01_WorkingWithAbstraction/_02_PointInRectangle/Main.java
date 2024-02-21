package _01_WorkingWithAbstraction._02_PointInRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Rectangle rectangle = new Rectangle(scanner.nextLine().split(" "));
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            Point point = new Point(scanner.nextLine().split(" "));
            System.out.println(rectangle.contains(point));
        }
    }
}
