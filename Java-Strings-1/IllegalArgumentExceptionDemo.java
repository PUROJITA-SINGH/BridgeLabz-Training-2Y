import java.util.Scanner;

public class IllegalArgumentExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = scanner.next();
        
        System.out.println("Generating IllegalArgumentException:");
        generateIllegalArgumentException(text);
        
        System.out.println("\nHandling IllegalArgumentException:");
        handleIllegalArgumentException(text);
        scanner.close();
    }

    public static void generateIllegalArgumentException(String text) {
        System.out.println(text.substring(5, 2)); // Will throw IllegalArgumentException
    }

    public static void handleIllegalArgumentException(String text) {
        try {
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }
}
