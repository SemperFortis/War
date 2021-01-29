public class Card {
    private Face face;
    private Suit suit;
    private int value;

    public Card(Face face, Suit suit, int value) {
        this.face = face;
        this.suit = suit;
        this.value = value;
    }

    public Face getFace() {
        return this.face;
    }

    public Suit getSuit() {
        return this.suit;
    }

    public int getValue() {
        return this.value;
    }
}
