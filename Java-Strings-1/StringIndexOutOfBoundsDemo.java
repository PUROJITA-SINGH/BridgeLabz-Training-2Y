import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {
    // Method to generate StringIndexOutOfBoundsException
    public static void generateStringIndexOutOfBoundsException(String str) {
        System.out.println(str.charAt(str.length())); // This will throw StringIndexOutOfBoundsException
    }

    // Method to handle StringIndexOutOfBoundsException
    public static void handleStringIndexOutOfBoundsException(String str) {
        try {
            System.out.println(str.charAt(str.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter the string: ");
        String str = scanner.next();

        // Demonstrate exception without handling
        System.out.println("Demonstrating StringIndexOutOfBoundsException (unhandled):");
        try {
            generateStringIndexOutOfBoundsException(str);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught in main: " + e.getMessage());
        }

        // Demonstrate exception with handling
        System.out.println("\nDemonstrating StringIndexOutOfBoundsException (handled):");
        handleStringIndexOutOfBoundsException(str);

        scanner.close();
    }
}
