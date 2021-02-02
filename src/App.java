public class App {
    public static void main(String[] args) throws Exception {
        // Creates a new deck of 52 cards
        Deck deck = new Deck();
        // Creates 2 players, the computer and player
        Player computer = new Player(deck, "The computer");
        Player player = new Player(deck, "You");
        // Creates a new game between the computer and player
        Game war = new Game(computer, player);

        // Start the game
        war.initialize();
    }
}
