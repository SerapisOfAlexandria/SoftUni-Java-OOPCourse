package _02_WorkingWithAbstractionExercise._03_CardsWithPower;

public enum RankPowers {
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(11),
    QUEEN(12),
    KING(13),
    ACE(14),
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    private int power;

    private RankPowers(int power) {
        this.power = power;
    }

    public int getRankedPower() {
        return power;
    }
}
