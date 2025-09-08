import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        System.out.println("Choose operation (+, -, *, /):");
        char operation = scanner.next().charAt(0);
        
        double result = performOperation(num1, num2, operation);
        displayResult(num1, num2, operation, result);
        scanner.close();
    }

    public static double performOperation(double num1, double num2, char operation) {
        switch (operation) {
            case '+': return add(num1, num2);
            case '-': return subtract(num1, num2);
            case '*': return multiply(num1, num2);
            case '/': return divide(num1, num2);
            default: throw new IllegalArgumentException("Invalid operation!");
        }
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) throw new ArithmeticException("Division by zero!");
        return a / b;
    }

    public static void displayResult(double num1, double num2, char operation, double result) {
        System.out.printf("%.2f %c %.2f = %.2f\n", num1, operation, num2, result);
    }
}
