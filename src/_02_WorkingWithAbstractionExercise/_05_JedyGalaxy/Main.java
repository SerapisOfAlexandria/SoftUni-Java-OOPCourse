package _02_WorkingWithAbstractionExercise._05_JedyGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        scanner.nextLine();
        GalaxyMatrix galaxyMatrix = new GalaxyMatrix(rows, columns);

        int heroX, heroY;
        long heroSum = 0;
        int evilX, evilY;

        String command = scanner.nextLine();

        while (!command.equals("Let the Force be with you")) {
            int[] heroCoordinates = Arrays.stream(command.split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            heroX = heroCoordinates[0];
            heroY = heroCoordinates[1];

            int[] evilCoordinates = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            evilX = evilCoordinates[0];
            evilY = evilCoordinates[1];

            galaxyMatrix.destroyedDiagonalByEvil(evilX, evilY);
            heroSum += galaxyMatrix.heroDiagonalSum(heroX, heroY);

            command = scanner.nextLine();
        }

        System.out.println(heroSum);
    }
}
