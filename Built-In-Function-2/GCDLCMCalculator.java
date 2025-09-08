import java.util.Scanner;

public class GCDLCMCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        long gcd = calculateGCD(a, b);
        long lcm = calculateLCM(a, b, gcd);
        displayResult(a, b, gcd, lcm);
        scanner.close();
    }

    public static long calculateGCD(long a, long b) {
        if (b == 0) return Math.abs(a);
        return calculateGCD(b, a % b);
    }

    public static long calculateLCM(long a, long b, long gcd) {
        return Math.abs(a * b) / gcd;
    }

    public static void displayResult(long a, long b, long gcd, long lcm) {
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
    }
}
