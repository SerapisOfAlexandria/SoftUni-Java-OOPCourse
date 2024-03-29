package _02_WorkingWithAbstractionExercise._02_CardRanks;

public enum CardRank {
        ACE(0),
        TWO(1),
        THREE(2),
        FOUR(3),
        FIVE(4),
        SIX(5),
        SEVEN(6),
        EIGHT(7),
        NINE(8),
        TEN(9),
        JACK(10),
        QUEEN(11),
        KING(12);

        private int ordinalValue;

        private CardRank(int ordinalValue) {
            this.ordinalValue = ordinalValue;
        }

        public int getOrdinalValue() {
                return ordinalValue;
        }
}
