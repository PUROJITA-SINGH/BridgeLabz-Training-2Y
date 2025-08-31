import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String input = scanner.nextLine(); // Read input as String to handle large numbers
        
        // Convert string to array of digits
        int count = input.length();
        int[] digits = new int[count];
        for (int i = 0; i < count; i++) {
            digits[i] = Character.getNumericValue(input.charAt(i));
        }
        
        // Calculate frequency of each digit
        int[] frequency = new int[10];
        for (int digit : digits) {
            frequency[digit]++;
        }
        
        // Display frequencies of digits that appear
        System.out.println("Digit frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }
        scanner.close();
    }
}

