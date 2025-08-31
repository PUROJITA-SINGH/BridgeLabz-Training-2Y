import java.util.Scanner;

public class GreatestFactorWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int number = scanner.nextInt();
        int greatestFactor = 1;
        if (number > 0) {
            int counter = number - 1;
            while (counter >= 1) {
                if (number % counter == 0) {
                    greatestFactor = counter;
                    break;
                }
                counter--;
            }
            System.out.println("Greatest factor of " + number + " (besides itself): " + greatestFactor);
        } else {
            System.out.println("Please enter a positive integer.");
        }
        scanner.close();
    }
}
