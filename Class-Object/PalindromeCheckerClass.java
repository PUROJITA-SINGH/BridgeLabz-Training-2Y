import java.util.Scanner;

public class PalindromeCheckerClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = scanner.nextLine();
        
        PalindromeChecker checker = new PalindromeChecker(text);
        checker.displayResult();
        scanner.close();
    }
}

class PalindromeChecker {
    private String text;
    
    public PalindromeChecker(String text) {
        this.text = text;
    }
    
    public boolean isPalindrome() {
        String cleanText = text.toLowerCase();
        int left = 0, right = cleanText.length() - 1;
        while (left < right) {
            if (cleanText.charAt(left) != cleanText.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
    
    public void displayResult() {
        System.out.println("\"" + text + "\"" + (isPalindrome() ? " is a palindrome." : " is not a palindrome."));
    }
}
