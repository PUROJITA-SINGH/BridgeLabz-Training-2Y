import java.util.Scanner;

public class SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Not a natural number.");
            return;
        }
        
        long recursiveSum = recursiveSum(n);
        long formulaSum = formulaSum(n);
        
        System.out.println("Recursive sum: " + recursiveSum);
        System.out.println("Formula sum: " + formulaSum);
        
        if (recursiveSum == formulaSum) {
            System.out.println("Both results are equal.");
        } else {
            System.out.println("Results differ.");
        }
        
        scanner.close();
    }
    
    public static long recursiveSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + recursiveSum(n - 1);
    }
    
    public static long formulaSum(int n) {
        return (long) n * (n + 1) / 2;
    }
}
