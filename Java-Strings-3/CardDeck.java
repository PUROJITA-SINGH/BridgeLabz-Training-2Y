import java.util.Random;
import java.util.Scanner;

public class CardDeck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of cards to distribute and number of players:");
        int numCards = scanner.nextInt();
        int numPlayers = scanner.nextInt();
        
        String[] deck = initializeDeck();
        deck = shuffleDeck(deck);
        String[][] playerCards = distributeCards(deck, numCards, numPlayers);
        printPlayerCards(playerCards);
        scanner.close();
    }

    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    public static String[] shuffleDeck(String[] deck) {
        Random rand = new Random();
        for (int i = deck.length - 1; i > 0; i--) {
            int randomCardNumber = rand.nextInt(i + 1);
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck;
    }

    public static String[][] distributeCards(String[] deck, int numCards, int numPlayers) {
        if (numCards > deck.length || numCards < numPlayers) {
            System.out.println("Invalid distribution: Not enough cards or too many players.");
            return new String[0][0];
        }
        
        String[][] playerCards = new String[numPlayers][];
        int cardsPerPlayer = numCards / numPlayers;
        int extraCards = numCards % numPlayers;
        
        int cardIndex = 0;
        for (int i = 0; i < numPlayers; i++) {
            int playerCardsCount = cardsPerPlayer + (i < extraCards ? 1 : 0);
            playerCards[i] = new String[playerCardsCount];
            for (int j = 0; j < playerCardsCount; j++) {
                playerCards[i][j] = deck[cardIndex++];
            }
        }
        return playerCards;
    }

    public static void printPlayerCards(String[][] playerCards) {
        for (int i = 0; i < playerCards.length; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            for (String card : playerCards[i]) {
                System.out.print(card + ", ");
            }
            System.out.println();
        }
    }
}
