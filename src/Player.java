import java.util.ArrayList;

public class Player {
    private ArrayList<Card> hand = new ArrayList<Card>();

    public Player(Deck deck) {
        this.hand = deck.split();
    }

    public void shuffle() {
        ArrayList<Card> shuffled = new ArrayList<Card>();

        while (this.hand.size() > 0) {
            int index = (int) (Math.random() * this.hand.size());

            shuffled.add(this.hand.remove(index));
        }

        this.hand = shuffled;

        System.out.println();
        System.out.println("[SHUFFLE] The deck has been shuffled.");
    }

    public Card drawCard() {
        return this.hand.remove(0);
    }

    public void addCard(Card card) {
        this.hand.add(card);
    }

    public int getHandSize() {
        return this.hand.size();
    }

    public boolean empty() {
        return this.hand.size() == 0;
    }
}
