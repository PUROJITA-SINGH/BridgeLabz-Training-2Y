import java.util.Scanner;

public class SumNaturalFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        if (number >= 0) {
            long formulaSum = (long) number * (number + 1) / 2;
            long forSum = 0;
            for (int i = 1; i <= number; i++) {
                forSum += i;
            }
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using for loop: " + forSum);
            System.out.println("Results match: " + (formulaSum == forSum));
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }
        scanner.close();
    }
}
