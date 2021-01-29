import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> deck = new ArrayList<Card>();

    public Deck() {
        // Regular cards
        for (int i = 0; i < 9; i++) {
            Suit suit = Suit.values()[i];

            for (int j = 0; j < 4; j++) {
                Face face = Face.values()[j];

                this.deck.add(new Card(face, suit, suit.getValue()));
            }
        }

        // Jack, Queen, King, Ace
        for (int i = 9; i <= 12; i++) {
            Suit suit = Suit.values()[i];

            for (int j = 0; j < 4; j++) {
                Face face = Face.values()[j];

                this.deck.add(new Card(face, suit, suit.getValue()));
            }
        }

        ArrayList<Card> shuffled = new ArrayList<Card>();

        while (this.deck.size() > 0) {
            int index = (int) (Math.random() * this.deck.size());

            shuffled.add(this.deck.remove(index));
        }

        this.deck = shuffled;
    }

    public ArrayList<Card> split() {
        ArrayList<Card> cards = new ArrayList<Card>();

        for (int i = 25; i >= 0; i--) {
            cards.add(this.deck.remove(i));
        }

        return cards;
    }
}
