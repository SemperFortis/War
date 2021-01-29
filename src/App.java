public class App {
    public static void main(String[] args) throws Exception {
        Deck deck = new Deck();
        Player computer = new Player(deck);
        Player player = new Player(deck);
        Game war = new Game(computer, player);

        war.initialize();
    }
}
