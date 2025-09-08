import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        
        boolean isPrime = isPrime(number);
        displayResult(number, isPrime);
        scanner.close();
    }

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static void displayResult(int number, boolean isPrime) {
        System.out.println(number + (isPrime ? " is a prime number." : " is not a prime number."));
    }
}
