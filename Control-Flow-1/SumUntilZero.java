import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;
        System.out.println("Enter a number (0 to stop): ");
        double input = scanner.nextDouble();
        while (input != 0) {
            total += input;
            System.out.println("Enter a number (0 to stop): ");
            input = scanner.nextDouble();
        }
        System.out.println("Total sum: " + total);
        scanner.close();
    }
}

