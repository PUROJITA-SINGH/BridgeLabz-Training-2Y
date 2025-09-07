import java.util.Scanner;

public class TrimSpaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = scanner.nextLine();
        
        int[] bounds = trimSpacesCharAt(text);
        String userTrimmed = createSubstringCharAt(text, bounds[0], bounds[1]);
        String builtInTrimmed = text.trim();
        
        boolean areEqual = compareStringsCharAt(userTrimmed, builtInTrimmed);
        
        System.out.println("User-defined trimmed: " + userTrimmed);
        System.out.println("Built-in trim(): " + builtInTrimmed);
        System.out.println("Strings are equal: " + areEqual);
        scanner.close();
    }

    public static int[] trimSpacesCharAt(String text) {
        int start = 0, end = text.length();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                start = i;
                break;
            }
        }
        for (int i = text.length() - 1; i >= 0; i--) {
            if (text.charAt(i) != ' ') {
                end = i + 1;
                break;
            }
        }
        return new int[]{start, end};
    }

    public static String createSubstringCharAt(String str, int start, int end) {
        if (start >= end) return "";
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end; i++) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static boolean compareStringsCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) return false;
        }
        return true;
    }
}
