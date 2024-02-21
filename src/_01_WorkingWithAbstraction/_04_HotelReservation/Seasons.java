package _01_WorkingWithAbstraction._04_HotelReservation;

public enum Seasons {
    AUTUMN(1),
    SPRING(2),
    WINTER(3),
    SUMMER(4);

    int multiplier;

    private Seasons(int multiplier) {
        this.multiplier = multiplier;
    }

    public int getMultiplier() {
        return multiplier;
    }
}
