import java.util.Scanner;
import java.util.ArrayList;

public class Game {
    private Scanner scanner = new Scanner(System.in);
    private Player computer;
    private Player player;
    private boolean ended = false;

    public Game(Player computer, Player player) {
        this.computer = computer;
        this.player = player;
    }

    public void initialize() {
        System.out.print("Press 'ENTER' to fight another battle or 'S' to shuffle your deck! ");

        String input = this.scanner.nextLine();

        while (input != null && !this.ended) {
            if (input.equalsIgnoreCase("s")) {
                this.player.shuffle();

                input = this.prompt();
            } else {
                ArrayList<Card> computerCards = new ArrayList<Card>();
                ArrayList<Card> playerCards = new ArrayList<Card>();

                while (!this.computer.empty() && !this.player.empty()) {
                    Card computerCard = this.computer.drawCard();
                    Card playerCard = this.player.drawCard();

                    computerCards.add(computerCard);
                    playerCards.add(playerCard);

                    while (computerCard.getValue() == playerCard.getValue()) {
                        System.out.println("[TIE] It's a tie! Battling again.....");

                        computerCard = this.computer.drawCard();
                        playerCard = this.player.drawCard();

                        computerCards.add(computerCard);
                        playerCards.add(playerCard);

                        this.drawMessage(computerCard, playerCard);
                    }

                    if (computerCard.getValue() > playerCard.getValue()) {
                        int count = 0;
            
                        for (int i = computerCards.size() - 1; i >= 0; i--) {
                            count++;
                            this.computer.addCard(computerCards.remove(i));
                        }

                        for (int i = playerCards.size() - 1; i >= 0; i--) {
                            count++;
                            this.computer.addCard(playerCards.remove(i));
                        }

                        this.cardMessage("Computer", count);

                        computerCards.clear();
                        playerCards.clear();
                    } else {
                        int count = 0;

                        for (int i = computerCards.size() - 1; i >= 0; i--) {
                            count++;
                            this.player.addCard(computerCards.remove(i));
                        }

                        for (int i = playerCards.size() - 1; i >= 0; i--) {
                            count++;
                            this.player.addCard(playerCards.remove(i));
                        }

                        this.cardMessage("You", count);

                        computerCards.clear();
                        playerCards.clear();
                    }

                    input = this.prompt();
                }

                this.ended = true;
            
                System.out.println();
                System.out.println(this.player.empty() ? "[LOST] You lost this game of War!" : "[WON] You won this game of War!");
            }
        }
    }

    private void drawMessage(Card computerCard, Card playerCard) {
        System.out.println();
        System.out.println("[DRAW] You drew a " + playerCard.getSuit() + " of " + playerCard.getFace());
        System.out.println("[DRAW] The computer drew a " + computerCard.getSuit() + " of " + computerCard.getFace());
    }

    private void cardMessage(String player, int count) {
        System.out.println();
        System.out.println(player + " won " + count + " cards! You currently have " + this.player.getHandSize()
                + " cards. The computer has " + this.computer.getHandSize() + " cards.");
    }

    private String prompt() {
        System.out.println();
        System.out.print("Press 'ENTER' to fight another battle or 'S' to shuffle your deck! ");

        return this.scanner.nextLine();
    }
}
