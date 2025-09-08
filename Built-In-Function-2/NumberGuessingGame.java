import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Think of a number between 1 and 100. Press Enter when ready.");
        scanner.nextLine();
        
        playGame(scanner);
        scanner.close();
    }

    public static int generateGuess(int min, int max) {
        Random rand = new Random();
        return rand.nextInt(max - min + 1) + min;
    }

    public static char getUserFeedback(Scanner scanner, int guess) {
        System.out.println("Is the guess " + guess + " (H)igh, (L)ow, or (C)orrect?");
        return scanner.nextLine().toUpperCase().charAt(0);
    }

    public static void playGame(Scanner scanner) {
        int min = 1, max = 100, attempts = 0;
        while (true) {
            int guess = generateGuess(min, max);
            attempts++;
            char feedback = getUserFeedback(scanner, guess);
            if (feedback == 'C') {
                System.out.println("Computer guessed the number in " + attempts + " attempts!");
                break;
            } else if (feedback == 'H') {
                max = guess - 1;
            } else if (feedback == 'L') {
                min = guess + 1;
            } else {
                System.out.println("Invalid input! Please enter H, L, or C.");
            }
        }
    }
}
