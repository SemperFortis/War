public class Card {
    private Face face;
    private Suit suit;
    private int value;

    /**
     * Creates a new card
     * 
     * @param face the face of the card
     * @param suit the suit of the card
     * @param value the value of the card
     * @return void
     */
    public Card(Face face, Suit suit, int value) {
        this.face = face;
        this.suit = suit;
        this.value = value;
    }

    /**
     * Gets the face of the card
     * 
     * @return the face of the card
     */
    public Face getFace() {
        return this.face;
    }

    /**
     * Gets the suit of the card
     * 
     * @return the suit of the card
     */
    public Suit getSuit() {
        return this.suit;
    }

    /**
     * Gets the value of the card
     * 
     * @return the value of the card
     */
    public int getValue() {
        return this.value;
    }
}
