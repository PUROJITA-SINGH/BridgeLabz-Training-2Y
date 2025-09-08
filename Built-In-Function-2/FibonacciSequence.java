import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of Fibonacci terms:");
        int n = scanner.nextInt();
        
        generateFibonacci(n);
        scanner.close();
    }

    public static void generateFibonacci(int n) {
        if (n <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }
        System.out.print("Fibonacci Sequence: ");
        long[] fib = new long[n];
        if (n >= 1) fib[0] = 0;
        if (n >= 2) fib[1] = 1;
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(fib[i] + " ");
        }
        System.out.println();
    }
}
