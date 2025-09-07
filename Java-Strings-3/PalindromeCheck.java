import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = scanner.nextLine();
        
        boolean isPalindrome1 = checkPalindromeIterative(text);
        boolean isPalindrome2 = checkPalindromeRecursive(text, 0, text.length() - 1);
        boolean isPalindrome3 = checkPalindromeArray(text);
        
        System.out.println("Iterative check: " + isPalindrome1);
        System.out.println("Recursive check: " + isPalindrome2);
        System.out.println("Array check: " + isPalindrome3);
        scanner.close();
    }

    public static boolean checkPalindromeIterative(String text) {
        int start = 0, end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }

    public static boolean checkPalindromeRecursive(String text, int start, int end) {
        if (start >= end) return true;
        if (text.charAt(start) != text.charAt(end)) return false;
        return checkPalindromeRecursive(text, start + 1, end - 1);
    }

    public static boolean checkPalindromeArray(String text) {
        char[] original = text.toCharArray();
        char[] reversed = reverseString(text);
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) return false;
        }
        return true;
    }

    public static char[] reverseString(String text) {
        char[] reversed = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            reversed[i] = text.charAt(text.length() - 1 - i);
        }
        return reversed;
    }
}
