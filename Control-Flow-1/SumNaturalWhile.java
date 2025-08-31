import java.util.Scanner;

public class SumNaturalWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        if (number >= 0) {
            long formulaSum = (long) number * (number + 1) / 2;
            long whileSum = 0;
            int i = 1;
            while (i <= number) {
                whileSum += i;
                i++;
            }
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using while loop: " + whileSum);
            System.out.println("Results match: " + (formulaSum == whileSum));
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }
        scanner.close();
    }
}
