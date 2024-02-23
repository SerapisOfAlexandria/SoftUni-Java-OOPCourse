package _02_WorkingWithAbstractionExercise._05_JedyGalaxy;

import java.util.List;
import java.util.ArrayList;

public class GalaxyMatrix {
    private int[][] galaxy;

    public GalaxyMatrix(int rows, int columns) {
        galaxy = new int[rows][columns];
        fillMatrix();
    }

    private void fillMatrix() {
        int count = 0;
        for (int i = 0; i < galaxy.length; i++) {
            for (int a = 0; a < galaxy[i].length; a++) {
                galaxy[i][a] = count++;
            }
        }
    }

    public long heroDiagonalSum(int heroX, int heroY) {
        long sum = 0;
        while (heroX >= 0 && heroY < galaxy[1].length) {
            if (heroX >= 0 && heroX < galaxy.length && heroY >= 0 && heroY < galaxy[0].length) {
                sum += galaxy[heroX][heroY];
            }

            heroY++;
            heroX--;
        }

        return sum;
    }

    public void destroyedDiagonalByEvil(int evilX, int evilY) {
        while (evilX >= 0 && evilY >= 0) {
            if (evilX >= 0 && evilX < galaxy.length && evilY >= 0 && evilY < galaxy[0].length) {
                galaxy[evilX][evilY] = 0;
            }
            evilX--;
            evilY--;
        }
    }
}
