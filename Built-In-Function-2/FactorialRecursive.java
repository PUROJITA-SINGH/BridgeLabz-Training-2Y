import java.util.Scanner;

public class FactorialRecursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        
        long factorial = calculateFactorial(number);
        displayResult(number, factorial);
        scanner.close();
    }

    public static long calculateFactorial(int n) {
        if (n < 0) return -1; // Indicate invalid input
        if (n == 0 || n == 1) return 1;
        return n * calculateFactorial(n - 1);
    }

    public static void displayResult(int number, long factorial) {
        if (factorial == -1) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            System.out.println("Factorial of " + number + " is: " + factorial);
        }
    }
}
