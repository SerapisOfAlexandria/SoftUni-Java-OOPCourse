package _02_WorkingWithAbstractionExercise._03_CardsWithPower;

public enum SuitPowers {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    private int power;

    private SuitPowers(int power) {
        this.power = power;
    }

    public int getSuitPower() {
        return power;
    }

}
