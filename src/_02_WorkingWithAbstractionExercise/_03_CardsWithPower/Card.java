package _02_WorkingWithAbstractionExercise._03_CardsWithPower;

import java.util.Scanner;

public class Card {
    private String rank;
    private String suit;
    private int power;

    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
        power = RankPowers.valueOf(rank).getRankedPower() + SuitPowers.valueOf(suit).getSuitPower();
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return String.format("Card name: %s of %s; Card power: %d", rank, suit, power);
    }
}
