package _05_Inheritance._03_RandomArrayList;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList extends ArrayList {

    Random random = new Random();

    public RandomArrayList() {
        super();
    }

    public Object getRandomElement() {
        return remove(random.nextInt(this.size()));
    }
}
