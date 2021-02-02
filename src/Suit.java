public enum Suit {
    TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(10), KING(10), QUEEN(10),
    ACE(1);

    private int value;

    /**
     * Creates a suit with the given value
     * 
     * @param value the value of the suit
     * @return void
     */
    Suit(int value) {
        this.value = value;
    }

    /**
     * Gets the value of the suit
     * 
     * @return the card suit value
     */
    public int getValue() {
        return this.value;
    }
}
