import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        
        boolean isPalindrome = checkPalindrome(input);
        displayResult(input, isPalindrome);
        scanner.close();
    }

    public static boolean checkPalindrome(String str) {
        str = str.toLowerCase();
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    public static void displayResult(String str, boolean isPalindrome) {
        System.out.println("\"" + str + "\"" + (isPalindrome ? " is a palindrome." : " is not a palindrome."));
    }
}
