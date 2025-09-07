import java.util.Scanner;

public class NumberFormatExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = scanner.next();
        
        System.out.println("Generating NumberFormatException:");
        generateNumberFormatException(text);
        
        System.out.println("\nHandling NumberFormatException:");
        handleNumberFormatException(text);
        scanner.close();
    }

    public static void generateNumberFormatException(String text) {
        int number = Integer.parseInt(text); // Will throw NumberFormatException if text is non-numeric
        System.out.println("Parsed number: " + number);
    }

    public static void handleNumberFormatException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }
}
