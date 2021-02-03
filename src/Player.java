import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<Card> hand = new ArrayList<Card>();

    /**
     * Creates a player with 26 cards in their hand
     * 
     * @param deck the card deck to draw cards from
     * @return void
     */
    public Player(Deck deck, String name) {
        this.hand = deck.split();
        this.name = name;
    }

    /**
     * Shuffles the player's hand
     * 
     * @return void
     */
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

    /**
     * Draws a card from the player's hand
     * 
     * @return the card drawn
     */
    public Card drawCard() {
        Card card = this.hand.remove(0);

        System.out.println(this.name + " drew a " + card.getSuit() + " of " + card.getFace());

        return card;
    }

    /**
     * Adds a card to the player's hand
     * 
     * @param card the card to add
     * @return void
     */
    public void addCard(Card card) {
        this.hand.add(card);
    }

    /**
     * Gets the amount of cards the user has in their hand
     * 
     * @return the amount of cards in the user's hand
     */
    public int getHandSize() {
        return this.hand.size();
    }

    /**
     * Determines whether the player has no more cards
     * 
     * @return false if there are no more cards left or true otherwise
     */
    public boolean empty() {
        return this.hand.size() == 0;
    }
}
