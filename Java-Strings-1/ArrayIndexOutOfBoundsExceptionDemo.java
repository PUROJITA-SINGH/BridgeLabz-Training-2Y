import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of names:");
        int n = scanner.nextInt();
        String[] names = new String[n];
        System.out.println("Enter " + n + " names:");
        for (int i = 0; i < n; i++) {
            names[i] = scanner.next();
        }
        
        System.out.println("Generating ArrayIndexOutOfBoundsException:");
        generateArrayIndexOutOfBoundsException(names);
        
        System.out.println("\nHandling ArrayIndexOutOfBoundsException:");
        handleArrayIndexOutOfBoundsException(names);
        scanner.close();
    }

    public static void generateArrayIndexOutOfBoundsException(String[] names) {
        System.out.println(names[names.length]); // Will throw ArrayIndexOutOfBoundsException
    }

    public static void handleArrayIndexOutOfBoundsException(String[] names) {
        try {
            System.out.println(names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
   }
}
