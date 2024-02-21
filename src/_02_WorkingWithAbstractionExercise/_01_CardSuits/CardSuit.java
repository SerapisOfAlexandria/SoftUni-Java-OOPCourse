package _02_WorkingWithAbstractionExercise._01_CardSuits;

public enum CardSuit {
    CLUBS(0),
    DIAMONDS(1),
    HEARTS(2),
    SPADES(3);

    int power;

    private CardSuit(int power) {
        this.power = power;
    }

}
