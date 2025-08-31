import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int originalNumber = number;
        int sum = 0;
        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            sum += digit * digit * digit;
            originalNumber /= 10;
        }
        System.out.println(number + " is " + (sum == number ? "an Armstrong Number" : "not an Armstrong Number"));
        scanner.close();
    }
}

