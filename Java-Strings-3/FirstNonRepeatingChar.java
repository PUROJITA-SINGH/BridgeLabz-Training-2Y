import java.util.Scanner;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = scanner.nextLine();
        
        char result = findFirstNonRepeatingChar(text);
        
        System.out.println("First non-repeating character: " + 
            (result == '\0' ? "None" : result));
        scanner.close();
    }

    public static char findFirstNonRepeatingChar(String text) {
        int[] frequency = new int[256];
        
        // Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }
        
        // Find first character with frequency 1
        for (int i = 0; i < text.length(); i++) {
            if (frequency[text.charAt(i)] == 1) return text.charAt(i);
        }
        return '\0';
    }
}
