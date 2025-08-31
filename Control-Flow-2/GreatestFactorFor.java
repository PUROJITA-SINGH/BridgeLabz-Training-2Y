import java.util.Scanner;

public class GreatestFactorFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int number = scanner.nextInt();
        int greatestFactor = 1;
        if (number > 0) {
            for (int i = number - 1; i >= 1; i--) {
                if (number % i == 0) {
                    greatestFactor = i;
                    break;
                }
            }
            System.out.println("Greatest factor of " + number + " (besides itself): " + greatestFactor);
        } else {
            System.out.println("Please enter a positive integer.");
        }
        scanner.close();
    }
}
